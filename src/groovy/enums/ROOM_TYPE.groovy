package enums

enum ROOM_TYPE {

    CONFERENCE('CONFERENCE'), SESSION("SESSION"), INTERVIEW("INTERVIEW")

    private String type

    ROOM_TYPE(String type){
        this.type = type
    }

}
