package repository;

import dataAccess.CollectingDao;

/**
 *
 * @author ASUS
 */
public class CollectingRepository implements ICollecting {
    @Override
    public void estimateCost(){
        System.out.println("The total cost is: "
                    + CollectingDao.Instance().estimateCost() + "VND");
    }
}
