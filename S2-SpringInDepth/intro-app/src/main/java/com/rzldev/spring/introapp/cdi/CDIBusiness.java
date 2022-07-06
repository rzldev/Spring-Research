package com.rzldev.spring.introapp.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIBusiness {

    @Inject
    private CDIDAO cdidao;

    public CDIDAO getCdidao() {
        return cdidao;
    }

    public void setCdidao(CDIDAO cdidao) {
        this.cdidao = cdidao;
    }
}
