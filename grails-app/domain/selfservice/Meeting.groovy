package selfservice

import org.bson.types.ObjectId

class Meeting {

    ObjectId id
    String title
    Date dateCreated
    Date meetingDate
    Integer duration
    User organizer
    List<User> invitees
    Room room

    static mapWith = "mongo"

    static embedded = ['invitees','organizer']

    static constraints = {
        title blank:false
        room validator: {val,obj->
      if(Meeting.findByRoomAndMeetingDateBetween(val,obj.meetingDate,new Date(obj.meetingDate.time+obj.duration*60000)))
          return false

        }

        meetingDate blank:false

    }



}
