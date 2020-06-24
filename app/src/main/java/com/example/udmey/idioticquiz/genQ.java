package com.example.udmey.idioticquiz;

/**
 * Created by Mallika on 5/30/2020.
 */

public class genQ {
    private String mQuestion[] = {
            "Q. Who was the first woman president of the UN General Assembly?",
            " DMA stands for ____",
            "OSI model is having how many layers?",
            "Proxy server is used for ____",
            "Determine the output frequency for a frequency division circuit that contains 12 flip-flops with an input clock frequency of 20.48 MHz.",
            "Which statement BEST describes the operation of a negative-edge-triggered D flip-flop?",
            "Propagation delay time, tPLH, is measured from the ________.",
            "The ________ ensures that only one IC is active at a time to avoid a bus conflict caused by two ICs writing different data to the same bus.",
            "Grand Central Terminal, Park Avenue, New York is the world's",
            "Eritrea, which became the 182nd member of the UN in 1993, is in the continent of",
            "Golden Temple, Amritsar is India's"
    };
    private String mhoices[][] = {
            {" Aruna Asif Ali","Vijaya Lakshmi Pandit", "Sarojini Naidu","Virginia Woolf"},
            {" Direct Memory Access", "Dynamic Memory Access", "Direct Memory Allocation","Dynamic Memory Allocation"},
            {" Two","Four","Six","Seven"},
            {"Providing security against unauthorized users","Processing client requests for web pages","Provide Internet Protocol\n","Processing client requests for DB access"},
            {"10.24 kHz","5 kHz","30.24 kHz","15 kHz"},
            {"The logic level at the D input is transferred to Q on NGT of CLK.","The Q output is ALWAYS identical to the CLK input if the D input is HIGH.","The Q output is ALWAYS identical to the D input when CLK = PGT.","The Q output is ALWAYS identical to the D input."},
            {"triggering edge of the clock pulse to the LOW-to-HIGH transition of the output","triggering edge of the clock pulse to the HIGH-to-LOW transition of the output","preset input to the LOW-to-HIGH transition of the output","clear input to the HIGH-to-LOW transition of the output"},
            {"control bus","control instructions","address decoder","CPU"},
            {"largest railway station","highest railway station","longest railway station","None of the above"},
            {"Asia","Africa","Europe","Australia"},
            {"largest Gurdwara","oldest Gurudwara","Both option A and B are correct","None of the above"}



    };
    private String mCorrectAnswer[] = {"Vijaya Lakshmi Pandit", " Direct Memory Access", "Seven", "Processing client requests for web pages",
            "5 kHz", "The logic level at the D input is transferred to Q on NGT of CLK.",
            "triggering edge of the clock pulse to the LOW-to-HIGH transition of the output", "CPU", "largest railway station","Africa","largest Gurdwara"};

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
        return choice;}
}
