package dataAccess;

import common.Validate;

/**
 *
 * @author ASUS
 */
public class CollectingDao {

    private static CollectingDao instance;
    Validate validate = new Validate();

    public static CollectingDao Instance() {
        if (instance == null) {
            synchronized (CollectingDao.class) {
                if (instance == null) {
                    instance = new CollectingDao();
                }
            }
        }
        return instance;
    }

    public int estimateCost() {
        String collect = validate.checkInput("Enter the amount of garbage at each station in order by quantity(kg)");
        double time = 0;
        int waste = 0;
        int total = 0;
        String[] quantity = collect.split(" ");
        for (String quant : quantity) {
            try {
                waste += Integer.parseInt(quant);
            } catch (NumberFormatException e) {
                System.err.println(quant + " is not a valid quantity");
            }
            //collet garbage at first station
            time += 8;
            if (waste >= 10000) {
                if (waste == 10000) {
                    //dump the garbage and return to the next station
                    time += 30;
                } else {
                    //dump the garbage, return to the same station and
                    //collect the remain garbage
                    time += 8 + 30;
                }
                //add 57000VND for each truck
                waste -= 10000;
                total += 57000;
            }
        }
        if (waste > 0) {
            time += 30;
            total += 57000;
        }
        if (time != 0) {
            time = (time + 30) / 60;
        }
        return total += (int) (time * 120000);
    }
}
