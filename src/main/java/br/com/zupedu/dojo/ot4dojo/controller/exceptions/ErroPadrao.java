package br.com.zupedu.dojo.ot4dojo.controller.exceptions;

import java.util.List;

public class ErroPadrao {
    private List<Erros> erros;

    public ErroPadrao(List<Erros> erros) {
        this.erros = erros;
    }

    public List<Erros> getErros() {
        return erros;
    }
}
