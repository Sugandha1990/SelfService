package enums

enum RESOURCE_TYPE {
      PROJECTOR("PROJECTOR"), CONFERENCE_CALL("CONFERENCE_CALL"), SPEAKER("SPEAKER"), MIC("MIC")

    private String type

    RESOURCE_TYPE(String type){
        this.type = type
    }
}
