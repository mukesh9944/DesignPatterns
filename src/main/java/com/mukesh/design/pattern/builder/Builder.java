package com.mukesh.design.pattern.builder;

public class Builder {

    public Assembly assembleMb(String type){
        Assembly am = new Assembly();
        if("Premium".equalsIgnoreCase(type)){

            am.models.add(new MiFire());
            am.models.add(new MiBolt());
            am.models.add(new AnnualService());

        } else if("Gold".equalsIgnoreCase(type)){

            am.models.add(new MiBolt());
            am.models.add(new QuarterService());

        }

        return am;
    }
}
