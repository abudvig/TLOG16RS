/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tlog16rs.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Szandi
 */
public class Greeting {

    @JsonProperty
    private String greeting;

    public Greeting() {
    }

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
