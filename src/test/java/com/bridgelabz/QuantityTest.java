package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEquals() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEquals() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEquals() {
        Length feet = new Length(Length.Unit.FEET,1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet,inch);
    }
    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqualLength() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1= new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenFeetAndFeet_ShouldReturnNull() {
        Length feet1= new Length(Length.Unit.FEET, 0.0);
        Length feet2=null;
        Assert.assertNotEquals(feet1,feet2);

    }
    }


