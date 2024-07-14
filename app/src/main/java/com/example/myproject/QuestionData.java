package com.example.myproject;
import java.util.ArrayList;
import java.util.List;

public class QuestionData {
    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("1.Which planet is known as Red planet ?",
                new String[]{"Earth", "Saturn", "Mars", "Jupiter"}, 2));

        questions.add(new Question("2.Who painted The Mona Lisa ?",
                new String[]{"Francesco Melzi", "John the Baptist", "Walter Isaacson", "Leonardo Da Vinci"}, 3));

        questions.add(new Question("3.What is the largest organ in Human Body ?",
                new String[]{"Skin", "Lung", "Heart", "Brain"}, 0));

        questions.add(new Question("4.What is the chemical Symbol for Water ?",
                new String[]{"CO2", "O2", "Cl", "H2O"}, 3));

        questions.add(new Question("5.What is the Capital of Japan ?",
                new String[]{"Tokyo", "Kanagawa", "Osaka", "Saga"}, 0));

        questions.add(new Question("6.What is the Currency of the United States ?",
                new String[]{"Rupee", "Doller", "Euro", "Yen"}, 1));

        questions.add(new Question("7.What is the Chemical Symbol for Gold ?",
                new String[]{"Fe", "Au", "Cu", "Ag"}, 1));

        questions.add(new Question("8.What is largest Ocean on Earth ?",
                new String[]{"Indian Ocean", "Arctic Ocean", "Atlantic Ocean", "Pacific Ocean"}, 3));

        questions.add(new Question("9.What is the lagest Desert in the world ?",
                new String[]{"Arabian Desert", "Sahara Desert", "Antartic Desert", "Thar Desert"}, 2));

        questions.add(new Question("10.How many days are there in a leap year ?",
                new String[]{"29", "366", "28", "365"}, 1));

        return questions;
    }
}