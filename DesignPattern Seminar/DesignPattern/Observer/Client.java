package com.DesignPattern.Observer;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        scoreRecord.attach(dataSheetView3);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);
        scoreRecord.attach(minMaxView);

        for(int index = 1; index <= 5; index++){
            int score = index * 10;
            System.out.println("Adding "+score);
            scoreRecord.addScore(score);
        }

        scoreRecord.detach(dataSheetView3);
        StatistticsView statistticsView = new StatistticsView(scoreRecord);
        scoreRecord.attach(statistticsView);

        for(int index = 1; index <= 5; index++){
            int score =  index * 10;
            System.out.println("Adding "+score);
            scoreRecord.addScore(score);
        }
    }
}
