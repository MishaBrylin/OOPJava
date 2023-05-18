package Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {

        parseUserData("Петров Александр Сергеевич 31.12.2021 89096152651 m");
    }


    public static void parseUserData(String userData) {
        String[] data = userData.split(" ");
        if (data.length < 5) {
            System.out.println("Мало данных ");
            return;
        } else if (data.length > 6) {
            System.out.println("Много данных ");
            return;
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];

        try {
            LocalDate birthDate = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            System.out.println("Не тот формат даты");
            return;
        }

        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            System.out.println("Не тот формат телефона");
            return;
        }

        String gender = data[5];
        if (!gender.equals("m") && !gender.equals("f")) {
            System.out.println("Не тот формат пола");
            return;
        }

        String fileName = lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(lastName + " " + firstName + " " + middleName + " " + data[3] + " " + phoneNumber + " " + gender + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        }
