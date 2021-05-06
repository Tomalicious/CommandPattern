package com.example.commandpattern;


import lombok.Getter;

@Getter
public enum Invoker {
    OPTION1(1, "show option1" , new Command1()),
    OPTION2(2, "show option2" , new Command2()),
    OPTION3(3, "show option3" , new Command3()),
    OPTION4(4, "show option4" , new Command4());

    private final int id;
    private final String displayOption;
    private final Command command;

    Invoker(int id , String displayOption , Command command){
        this.id = id;
        this.displayOption = displayOption;
        this.command = command;
    }
    
}
