package com.example.udmey.idioticquiz;

/**
 * Created by Mallika on 5/30/2020.
 */

public class technicalquestion{
    private String mQuestion[] = {

        "Which method is used by binary search tree ?",
        "The pre-order traversal of binary search tree is 12,8,6,2,7,9,10,16,15,19,17,20.then the post-order traversal of this tree is:",
        "Which of the following computer language is used for artificial intelligence?",
        "A computer program that converts assembly language to machine language is ?",
        "Which type of system puts the user into direct conversation with the computer through a keyboard?",
        "The use of the break statement in a switch statement is ?",
        " How many specifiers are present in access specifiers in class?",
        " Which of the following can be operands of arithmetic operators?",
        " Which of these method is used to find out that a thread is still running or not?",
        " Which of these packages contain all the collection classes?"

};
        private String mhoices[][] = {
                {" Dynamic programming","Divide and conquer"," greedy algorithms","Broute force"},
                {"2,6,7,8,9,10,12,15,16,17,19,20", "2,7,6,10,9,8,15,17,20,19,16,12","7,2,6,8,9,10,20,17,19,15,16,12", "7,6,2,10,9,8,15,16,17,20,19,12",},
                {	"FORTRAN" ,"PROLOG","C","COBOL"},
                {"Compiler","Interpreter","Assembler","Comparator"},
                {"Real time processing", "Interactive computer","Batch processing","Time sharing"},
                {"optional", "compulsory","not allowed. It gives an error message","to check an error"},
                {"1", "2", "3", "4"},
                {" Numeric", "Boolean","Characters","Both Boolean & Characters"},
                {" run()","Alive()","isAlive()","checkRun()"},
                {" java.lang","java.util","java.net","java.awt"}


        };
        private String mCorrectAnswer[] = {"Divide and conquer", "2,7,6,10,9,8,15,17,20,19,16,12", "PROLOG",
                "Assembler", "Interactive computer", "optional", "3", "Both Boolean & Characters", "isAlive()"
                ,"java.util"};

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
