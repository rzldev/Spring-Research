package com.rzldev.spring.introapp.cdi;

import javax.inject.Named;

@Named
public class CDIDAO {
    public CDIDAO() {
        System.out.println("CDI DAO");
    }
}
