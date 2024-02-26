package org.example.factorymethod.example2milkshake;

import java.util.HashMap;
import java.util.Map;

public class MilkshakeFactory {
    private Map<MilkshakeName, Milkshake> milkshakeMenu;

    public MilkshakeFactory() {
        buildMilkshakeMenu();
    }
    public Milkshake prepare(MilkshakeName milkshakeName){
        if(milkshakeName==null) {
            System.out.println("Please provide a Milkshake Name :");
            return null;
        }
        System.out.println(milkshakeName +" ready!");
        return milkshakeMenu.get(milkshakeName);

    }

    private void buildMilkshakeMenu() {
        milkshakeMenu = new HashMap<>();
        milkshakeMenu.put(MilkshakeName.OREO_MILKSHAKE, new OreoMilkshake());
        milkshakeMenu.put(MilkshakeName.BUTTERSCOTCH_MILKSHAKE, new ButterscotchMilkshake());
        milkshakeMenu.put(MilkshakeName.VANILLA_MILKSHAKE, new VanillaMilkshake());
    }

}
