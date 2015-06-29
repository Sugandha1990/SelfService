package selfservice

import enums.RESOURCE_TYPE
import enums.ROOM_TYPE

class Room {


    String name
    Integer floor
    Integer capacity
    ROOM_TYPE  roomType
    List<RESOURCE_TYPE> resources
    static constraints = {
        floor validator: {val,obj->
            if(Room.findByFloorAndName(val,obj.name))
                return false
        }
        roomType nullable: true

    }
}
