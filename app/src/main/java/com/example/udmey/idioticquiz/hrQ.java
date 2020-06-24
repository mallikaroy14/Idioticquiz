package com.example.udmey.idioticquiz;

/**
 * Created by Mallika on 5/30/2020.
 */

public class hrQ {

    private String mQuestion[] = {
            "The following is (are) the key components of a business process Re-engineering programme?",
            "The actual achievements compared with the objectives of the job is",
            "The following is (are) concerned with developing a pool of candidates in line with the human resources plan",
            "Majority of the disputes in industries is (are) related to the problem of",
            "In an organisation initiating career planning, the career path model would essentially form the basis for",
            "Section ________ of the Industrial Disputes Act 1947, states that an employer should only retrench employees who have been most recently hired",
            "Performance development plan is set for the employee by his immediate boss.",
            "The following is (are) the objective(s) of inspection.",
            "The ________ programme once installed must be continued on a permanent basis."
    };
    private String mhoices[][] = {
            {" Product development", "Service delivery", "Customer satisfaction", "All of the above"},
            {"Job performance", "Job evaluation", "Job description", "None of the above"},
            {"Development", "Training", "Recruitment", "All of the above"},
            {"Wages", "Salaries", "Benefits", "All of the above"},
            {"Placement", "Transfer", "Rotation", "All of the above"},
            {"24-F", "24-G", "25-F", "25-G"},
            {"Employer", "Department Head", "Immediate boss", "Any of the above"},
            {"Quality product", "Defect free products", "Customer satisfaction", "All of the above"},
            {"Job evaluation", "Training & Development", "Recruitment", "All of the above"}


    };
    private String mCorrectAnswer[] = {"All of the above",
            "Job performance", "Recruitment", "All of the above", "All of the above", "25-G", "Immediate boss", "All of the above", "Job evaluation"};

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