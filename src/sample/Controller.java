package sample;


/**
 * this class is the main class that controls the gui.
 */


import MovieClassy.Core.GetPercentageandPrint;
import MovieClassy.Core.ReadCSV;
import MovieClassy.Core.ReadPlot;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class Controller {
    public Label result;
    public TextArea plot;
    //Create an object to read the csv file
    ReadCSV a = new ReadCSV();
    String newPot = plot.getText();

    public void getGenre(ActionEvent actionEvent) throws IOException {


        //If the plot is null, system should warn the user to enter a plot
        if (newPot.equals("")) {
            result.setText("Oops... Enter a plot!");
        } else {

            /**
             * if the plot is present the system should run and give the output
             * */

            String result1;


            //Create an object to read the plot and store the words in the matrix
            ReadPlot readplot = new ReadPlot(newPot);


            result1 = GetPercentageandPrint.print();

            result.setText(result1);
        }

    }


    /**
     * when clear button is pressed, the result and the text area must be cleared.
     */
    public void clear(ActionEvent actionEvent) {
        plot.clear();
        result.setText("");
    }
}
