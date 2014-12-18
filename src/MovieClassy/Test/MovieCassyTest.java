package MovieClassy.Test;


import MovieClassy.Core.GetPercentageandPrint;
import MovieClassy.Core.ReadPlot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by menaka on 12/17/14.
 * Test cases for MovieClassy
 * Each genre is tested with each plot
 */
public class MovieCassyTest extends Thread {

    String genre;
    String filedir = "Resources/Test/";

    public MovieCassyTest(String text) {
        this.genre = text;
    }

    public void run() {

        int yes = 0, no = 0;
        double percentage = 0.0;
        File file = new File(this.filedir + this.genre + "Test" + ".txt");

        FileReader fread = null;
        try {
            fread = new FileReader(file);
            BufferedReader bfRead = new BufferedReader(fread);
            String line;
            while ((line = bfRead.readLine()) != null) {
                line = line.replace("null ", "");
                line = line.replace("MV: ", "");
                line = line.replace("PL: ", "");
                line = line.toLowerCase();
                ReadPlot readplot = new ReadPlot(line);
                String result = GetPercentageandPrint.print();
                if (result.contains(genre)) {
                    yes++;
                } else {
                    no++;
                }

            }
            percentage = yes * 100 / (yes + no);
            System.out.println("Check on " + genre + " Percentage accuracy = " + percentage + "%");


            bfRead.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
