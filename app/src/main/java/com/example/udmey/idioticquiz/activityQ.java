package com.example.udmey.idioticquiz;

/**
 * Created by Mallika on 5/30/2020.
 */

public class activityQ {
    private String mQuestion[] = {
        "what is a percent of b divided by b percent of a?",
        "Which of the following is larger than 3/5?",
        "3.5 × ( 60 ÷ 2.5 ) = ?",
        " Anusha deposits an amount of Rs. 65800 to obtain a simple interest at the rate of 14% per annum for 4yr. What total amount will Anusha get at the end of 4 yr?",
        "Sachin has a certain average for 10 innings. In the eleventh innings, he scored 216 runs, thereby increasing his average by 12 runs. Find out new average?",
        "3 men can do a piece of work in 18 days. 6 children can also do that work in 18 days. 4 men and 4 children together will finish the work in how many days?",
        " A starts a business with Rs. 300000 and B joins him after 3 months with Rs. 1200000. Find the ratio of their profits at the end year of the years.",
        "In how many different ways can the letters of the word DAILY be arranged?",
        "92 ÷ 8 ÷ 2 = ?",
        "The speeds of three cars are in the ratio of 2 : 3 : 4 find the ratio between the time taken by these cars to cover the same distance.",
        " If three marbles are picked at random, what is the probability that at least one is blue?",
        "If ABCD is a cyclic quadrilateral with ?A = 50 degrees, ?B = 80 degrees then ?C and ?D are _____"

};
        private String mhoices[][] = {
                {"a", "b", "1", "100"},
                {"1/2", "39/50", "3/10", "7/10"},
                {"62", "96", "65", "84"},
                {"RS.102648", " RS.115246 ", "RS.125578", " RS.110324"},
                {"96", "84", "97", "87"},
                {"72000", "71000", "74000", "73000"},
                {"2:5", "3:5", "5:1", "1:3"},
                {"80", "456", "160", "120"},
                {"4.75", "5.75", "4.22", "5.25"},
                {"2:3:4", "4:3:2", "4:3:6", "6:4:3"},
                {"7/12", "37/44", "5/12", "7/44"},
                {" 110 degrees, 120 degrees",
                        " 130 degrees, 100 degrees",
                        " 100 degrees, 130 degrees",
                        " 115 degrees, 115 degrees"}

        };
        private String mCorrectAnswer[] = {"1", "39/50", "84", "RS.102648", "96", "72000", "1:3", "120", "5.75", "6:4:3", "37/34", "130 degrees", "100 degrees",};



        public int getLength() {
            return mQuestion.length;
        }

        public String getQuestion(int a) {
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