package com.step.assignments.com.step.assignments.day5;

public class JewelryBox {
    private Jewelry jewelry;
    private JewelryBox smallerJewelryBox;

    public JewelryBox(Jewelry jewelry,JewelryBox smallerJewelryBox){
        this.jewelry = jewelry;
        this.smallerJewelryBox = smallerJewelryBox;
    }

    public JewelryBox(Jewelry jewelry) {
        this(jewelry,null);
    }

    public JewelryBox(JewelryBox smallerJewelryBox){
        this(null,smallerJewelryBox);
    }

    public JewelryBox() {
        this(null,null);
    }

    public int totalJewelrys(){
        int totalNumber = 0;
        if(smallerJewelryBox != null){
            totalNumber += smallerJewelryBox.totalJewelrys();
        }
        if(jewelry != null){
            totalNumber +=1;
        }
        return totalNumber;
    }
}
