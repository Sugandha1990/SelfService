import enums.ROOM_TYPE
import org.bson.types.ObjectId
import selfservice.Meeting
import selfservice.Room
import selfservice.User

class BootStrap {

    def init = { servletContext ->
        Room room = new Room(name:'Paris',capacity: 12,floor: 2,roomType:ROOM_TYPE.SESSION)
        room.save(flush: true,failOnError: true)
        Meeting meeting = new Meeting(title: 'Fame',room:room,duration: 30,organizer: new User(email: 'ggg@gmail.com'
        ,username: 'Sugu'),meetingDate: new Date(System.currentTimeMillis()))
        meeting.save(flush: true,failOnError: true)
    }
    def destroy = {
    }
}
