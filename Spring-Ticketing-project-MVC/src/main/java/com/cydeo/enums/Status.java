package com.cydeo.enums;

public enum Status {
    OPEN("Open"), IN_PROGRESS("In Progress"), COMPLETE("Completed");

    Status(String value) {
        this.value = value;
    }

    private final String value;
public String getValue(){
    return value;
}
}
