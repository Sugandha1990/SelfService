import enums.RESOURCE_TYPE
import enums.ROOM_TYPE
import org.bson.types.ObjectId
import selfservice.Meeting
import selfservice.Room
import selfservice.User

class BootStrap {

    def init = { servletContext ->
        
        println("#######Init Data######")
        List list = [RESOURCE_TYPE.CONFERENCE_CALL,RESOURCE_TYPE.MIC]
        println("list -- $list -- ${RESOURCE_TYPE.CONFERENCE_CALL}")
        Room room = new Room(name:'Paris',capacity: 12,floor: 1,roomType:ROOM_TYPE.CONFERENCE,
                resources: list)
        room.save(flush: true,failOnError: true)
        Meeting meeting = new Meeting(title: 'Fame',room:room,duration: 30,organizer: new User(email: 'ggg@gmail.com'
        ,username: 'Sugu'),meetingDate: new Date(System.currentTimeMillis()))
        meeting.save(flush: true,failOnError: true)
    }
    def destroy = {
        println("#######Destroy data#######")
        println("-------Deleting entries of Meetings")
        Meeting.list().each {it.delete()}
        println("-------Deleting entries of Rooms")
        Room.list().each {it.delete()}
    }
}
