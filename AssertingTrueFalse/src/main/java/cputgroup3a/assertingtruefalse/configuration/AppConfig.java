/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.assertingtruefalse.configuration;

/**
 *
 * @author kurvin
 */

import cputgroup3a.assertingtruefalse.service.AssertingTrueFalse;
import cputgroup3a.assertingtruefalse.service.Impl.AssertingTrueFalseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class AppConfig {
    @Bean (name="TrueFalseAssert")
    public AssertingTrueFalse getService(){
        return new AssertingTrueFalseImpl();
    }
}
