package controller;

import repository.CollectingRepository;

/**
 *
 * @author ASUS
 */
public class CollectingController {
    CollectingRepository cr;
    
    public CollectingController(){
        cr = new CollectingRepository();
    }
    
    public void run(){
        cr.estimateCost();
    }
}
