package com.example.udmey.idioticquiz;

/**
 * Created by Mallika on 5/30/2020.
 */

public class reasoningq { private String mQuestion[] = {

        "\t\n" +
                "Vincent has a paper route. Each morning, he delivers 37 newspapers to customers in his neighborhood. It takes Vincent 50 minutes to deliver all the papers. If Vincent" +
                " is sick or has other plans, his friend Thomas, who lives on the same street, will " +
                "sometimes deliver the papers for him.","QAR, RAS, SAT, TAU, _____"," \t\n" +
        "Which word does NOT belong with the others?","\t\n" +
        "Class A has a higher enrollment than Class B.\n" +
        "Class C has a lower enrollment than Class B.\n" +
        "Class A has a lower enrollment than Class C.\n" +
        "If the first two statements are true, the third statement is","Candid is to indirect as honest is to",
        " \t\n" +
                "Rohit walked 25 m towards south. Then he turned to his left and walked 20 m. He then turned to his left and walked 25 m. He again turned" +
                " to his right and walked 15 m. At what distance is he from the starting point and in which direction?",
        "\t\n" +
                "Peace : Chaos :: Creation : ?"," \t\n" +
        "Look at this series: 544, 509, 474, 439, ... What number should come next?",
        "An Informal Gathering occurs when a group of people get together " +
                "in a casual, relaxed manner. Which situation below is the best example of an Informal Gathering?",
        "\t\n" +
                "Pointing to a photograph Anjali said, \"He is the son of the only son of" +
                " my grandfather.\" How is the man in the photograph related to Anjali?",
        "\t\n" +
                "Microphone : Loud :: Microscope : ?",

        "Arrange the words given below in a meaningful sequence.\n" +
                "                1. Probation\t2. Interview\t3. Selection\n" +
                "                4. Appointment\t5. Advertisement\t6. Application",
        "\t\n" +
                "Conference : Chairman :: Newspaper : ?",
        ". \t\n" +
                "\t\n" +
                "A is the son of C; C and Q are sisters; Z is " +
                "the mother of Q and P is the son of Z. Which of the following statements is true?"   +
                "Choose the word which is different from the rest.",
        "\t\n" +
                "Pointing to a photograph Lata says, \"He is the son of the only son of my grandfather.\" How is the man in the photograph related to Lata?",
        "\t\n" +
                "Arrange the words given below in a meaningful sequence.\n" +
                "1. Rainbow\t2. Rain\t3. Sun\n" +
                "4. Happy\t5. Child\t","\t\n" +
        "Choose the word which is different from the rest.",
        "Choose the correct meaning:" +
                "\t\n" +
                "To keeps one's temper"

};
    private String mhoices[][] = {
            {"Vincent and Thomas live in the same neighborhood.","It takes Thomas more than 50 minutes to deliver the papers.",
                    "It is dark outside when Vincent begins his deliveries.","Thomas would like to have his own paper route."},
            {"UAV","UAT","TAS","TAT"},{"unimportant","trivial","insignificant","familiar"},
            {"True","False","Uncertain","Nothing can be said"},{"frank","wicked","truthful","untruthful"},
            {"35 m East","35 m North","30 m West","45 m East"},
            {"Build","Construction","Destruction","Manufacture"},{"404","414","420","445"},
            {"The book club meets on the first Thursday evening of every month.","After finding out about his promotion, Jeremy " +
                    "and a few coworkers decide to go out for a quick drink after work.","Mary sends out 25 " +
                    "invitations for the bridal shower she is giving for her sister.","Whenever she eats" +
                    " at the Mexican restaurant, Clara seems to run into Peter."},
            {"Brother","Uncle","Son","Data Inadequate"},
            {"Elongate","Investigate","Magnify","Examine"},
            {"5, 6, 3, 2, 4, 1","5, 6, 4, 2, 3, 1","5, 6, 2, 3, 4, 1","6, 5, 4, 2, 3, 1"},
            {"Reporter","Distributor","Printer","Editor"},
            {"Cumin","Groundnut","Cinnamon","Pepper"},
            {"P and A are cousins","P is the maternal uncle of A","Q is the maternal grandfather of A",
                    "C and P are sisters"},
            {"Brother","Uncle","Cousin","Data is inadequate"},
            {"4, 2, 3, 5, 1","2, 3, 1, 5, 4","4, 5, 1, 2, 3","2, 1, 4, 5, 3"},
            {"Arrow","Axe","Knife","Dagger"},
            {"To become hungry","To be in good mood","To preserve ones energy","None of these"}


    };
    private String mCorrectAnswer[] = {"Vincent and Thomas live in the same neighborhood.", "UAV",
            "familiar","False","untruthful","35 m East","Destruction","404","After finding out about his promotion, Jeremy " +
            "and a few coworkers decide to go out for a quick drink after work.","Brother","Magnify",
            "5, 6, 2, 3, 4, 1","Editor","Groundnut","P is the maternal uncle of A","Brother","2, 3, 1, 5, 4","To be in good mood"};

    public int getLength() {return mQuestion.length;}

    public   String getQuestion(int a) {
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice1 = mhoices[a][0];
        return choice1;
    }

    public String getChoice2(int a) {
        String choice2 = mhoices[a][1];
        return choice2;
    }

    public String getChoice3(int a) {
        String choice3 = mhoices[a][2];
        return choice3;
    }

    public String getChoice4(int a) {
        String choice4 = mhoices[a][3];
        return choice4;
    }

    public String getCorrectAnswer(int a) {
        String choice = mCorrectAnswer[a];
        return choice;
    }


}
