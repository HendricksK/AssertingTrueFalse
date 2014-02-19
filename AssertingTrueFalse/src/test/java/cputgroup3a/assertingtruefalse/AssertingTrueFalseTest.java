/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cputgroup3a.assertingtruefalse;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import cputgroup3a.assertingtruefalse.service.AssertingTrueFalse;
import cputgroup3a.assertingtruefalse.service.Impl.AssertingTrueFalseImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cputgroup3a.assertingtruefalse.configuration.AppConfig;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class AssertingTrueFalseTest {

    public AssertingTrueFalseTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public static AssertingTrueFalse tf;

    @Test
    public static void testSetNightTrue() {
        Assert.assertTrue(tf.setNightTrue(true));
    }

    @Test
    public static void testSetDayTrue() {
        Assert.assertTrue(tf.setDayTrue(true), "It is now day time.");
    }

    @Test
    public static void testSetDayFalse() {
        Assert.assertFalse(tf.setDayFalse(false));
    }

    @Test
    public static void testSetNightFalse() {
        Assert.assertFalse(tf.setNightFalse(false), "It is now day time.");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tf = (AssertingTrueFalseImpl) ctx.getBean("TrueFalseAssert");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
