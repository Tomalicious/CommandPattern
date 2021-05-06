package com.example;

import com.example.commandpattern.Invoker;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static List<Invoker> commandList = Arrays.stream(Invoker.values()).collect(Collectors.toList());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        while(true){
            showOptions();
        try{
            chooseOption();
        }catch(Exception e){
            System.out.println("Something went wrong ");
            scanner.nextLine();
            }finally {
            System.out.print("Try again? (y/n): ");
            if (scanner.next().equals("y")) {
                System.out.println("clear");
            } else {
                break;
            }
        }

        }
    }
    private static Invoker chooseOption() throws Exception {
        int optionId = scanner.nextInt();
        return commandList.stream().filter(invoker -> invoker.getId() == optionId)
                .findFirst()
                .orElseThrow(() -> new Exception("option not found"));
    }

    private static void showOptions(){
        commandList.forEach(invoker -> System.out.println(invoker.getId() + " " + invoker.getDisplayOption()));
        System.out.println("Choose an option: ");
    }
}
