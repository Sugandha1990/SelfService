package selfservice

import enums.RESOURCE_TYPE
import enums.ROOM_TYPE
import org.bson.types.ObjectId

class Room {

    ObjectId id
    String name
    Integer floor
    Integer capacity
    ROOM_TYPE  roomType
    List<RESOURCE_TYPE> resources

    static mapWith = "mongo"

    static constraints = {
        floor validator: {val,obj->
            if(Room.findByFloorAndName(val,obj.name))
                return false
        }
        roomType nullable: true
        resources nullable : true
        capacity min: 1
    }
}
