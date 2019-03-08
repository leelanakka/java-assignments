package com.step.assignments.com.step.assignments.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelryBoxTest {

    @Test
    void shouldReturnTotalNumberOfJewelleriesInsideAJewelleryBox() {
        Jewelry diamond_ring = new Jewelry("Diamond Ring");
        JewelryBox jewelleryBox = new JewelryBox(diamond_ring);
        Jewelry nickles = new Jewelry("nickles");
        JewelryBox jewelleryBox1 = new JewelryBox(nickles, jewelleryBox);

        assertEquals(2, jewelleryBox1.totalJewelrys());
    }

    @Test
    void name() {
       JewelryBox smallestJewelryBox = new JewelryBox();
        Jewelry jewelleryInBiggest = new Jewelry("gold");
       JewelryBox smallerBox = new JewelryBox(jewelleryInBiggest, smallestJewelryBox);

       JewelryBox biggestBox = new JewelryBox(jewelleryInBiggest, smallerBox);
    }

    @Test
    void shoulReturnTotalNumberOfJewelerys() {
        JewelryBox _5thLevelBox = new JewelryBox();

        JewelryBox _4thLevelBox = new JewelryBox(_5thLevelBox);

        Jewelry nacklace = new Jewelry("necklace");
        JewelryBox _3rdLevelBox = new JewelryBox(nacklace, _4thLevelBox);

        Jewelry ring = new Jewelry("ring");
        JewelryBox _2ndLevelBox = new JewelryBox(ring, _3rdLevelBox);

        JewelryBox _1stLevelBox = new JewelryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.totalJewelrys());
    }
}