/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cputgroup3a.assertingtruefalse.service.Impl;

/**
 *
 * @author kurvin
 */
import cputgroup3a.assertingtruefalse.service.AssertingTrueFalse;

public class AssertingTrueFalseImpl implements AssertingTrueFalse {

    boolean night;
    boolean day;

    @Override
    public boolean setNightTrue(boolean bool) {
        System.out.println("Night is now equal to: " + bool);
        return night = bool;
    }
    
    @Override
    public boolean setDayTrue(boolean bool) {
        System.out.println("Day is now equal to: " + bool);
        return night = bool;
    }
    
    @Override
    public boolean setNightFalse(boolean bool) {
        System.out.println("Night is now equal to: " + bool);
        return night = bool;
    }
    
    @Override
    public boolean setDayFalse(boolean bool) {
        System.out.println("Day is now equal to: " + bool);
        return night = bool;
    }
}
