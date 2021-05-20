package com.mukesh.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Assembly {

    List<MiModel> models = new ArrayList<>();

    public double showCost(){
        double totalCost = 0;
        for (MiModel model:models
             ) {
            totalCost += model.cost();
        }
        System.out.println(totalCost);
        return totalCost;
    }
}
