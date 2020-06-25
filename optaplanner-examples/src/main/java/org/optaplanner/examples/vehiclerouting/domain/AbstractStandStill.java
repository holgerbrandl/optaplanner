package org.optaplanner.examples.vehiclerouting.domain;

import org.optaplanner.examples.common.domain.AbstractPersistable;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class AbstractStandStill  extends AbstractPersistable implements Standstill{
    protected Location location;

    // Shadow variables
    protected Customer nextCustomer;


    @Override
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public Customer getNextCustomer() {
        return nextCustomer;
    }

    @Override
    public void setNextCustomer(Customer nextCustomer) {
        this.nextCustomer = nextCustomer;
    }

}
