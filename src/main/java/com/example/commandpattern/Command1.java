package com.example.commandpattern;

public class Command1 implements Command {
    @Override
    public void execute() {
        System.out.println("Show all soldiers");
    }
}
