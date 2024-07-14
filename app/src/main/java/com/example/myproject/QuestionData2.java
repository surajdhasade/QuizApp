package com.example.myproject;
import java.util.ArrayList;
import java.util.List;

public class QuestionData2 {
    public static List<Question> get() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("1.कोणता ग्रह लाल ग्रह म्हणून ओळखला जातो ?",
                new String[]{"पृथ्वी ", "शनि ", "मंगळ ", "गुरु"}, 2));

        questions.add(new Question("2.मोनालीसा चे चित्र कोणी काढले ?",
                new String[]{"Francesco Melzi", "John the Baptist", "Walter Isaacson", "Leonardo Da Vinci"}, 3));

        questions.add(new Question("3.मानवी शरीरातील सर्वात मोठा अवयव कोणता ?",
                new String[]{"त्वचा", "फुफ्फुस", "हृदय", "मेंदू"}, 0));

        questions.add(new Question("4.पाण्याचे रेणुसूत्र काय आहे ?",
                new String[]{"CO2", "O2", "Cl", "H2O"}, 3));

        questions.add(new Question("5.जपान ची राजधानी कोणती आहे ?",
                new String[]{"टोकियो ", "कनागावा", "ओसाका", "सागा"}, 0));

        questions.add(new Question("6.United States चे चलन काय आहे ?",
                new String[]{"रुपये (Rupee)", "डॉलर (Doller)", "युरो (Euro)", "येन (Yen)"}, 1));

        questions.add(new Question("7.सोन्याचे रेणुसूत्र काय आहे ?",
                new String[]{"Fe", "Au", "Cu", "Ag"}, 1));

        questions.add(new Question("8.पृथ्वी वरील सर्वात मोठा महासागर कोणता ?",
                new String[]{"हिन्दी महासागर", "आर्क्टिक महासागर", "अटलांटिक महासागर ", "प्रशांत(पॅसिफिक) महासागर"}, 3));

        questions.add(new Question("9.जगातील सर्वात मोठे वाळवंट कोणते ?",
                new String[]{"अरबी वाळवंट", "सहारा वाळवंट", "अंटार्क्टिक वाळवंट", "थार वाळवंट"}, 2));

        questions.add(new Question("10.लीप वर्षामद्धे किती दिवस असतात ?",
                new String[]{"29", "366", "28", "365"}, 1));

        return questions;
    }
}