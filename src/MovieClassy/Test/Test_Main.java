package MovieClassy.Test;

import MovieClassy.Core.ReadCSV;

/**
 * Created by menaka on 12/17/14.
 */
public class Test_Main {
    public static void main(String[] args) throws InterruptedException {
        ReadCSV dset = new ReadCSV();

        MovieCassyTest a = new MovieCassyTest("Action");
        MovieCassyTest b = new MovieCassyTest("Adventure");
        MovieCassyTest c = new MovieCassyTest("Comedy");
        MovieCassyTest d = new MovieCassyTest("Drama");
        MovieCassyTest e = new MovieCassyTest("Romance");


        a.start();
        a.join();

        b.start();
        b.join();

        c.start();
        c.join();

        d.start();
        d.join();

        e.start();
        e.join();
    }
}
