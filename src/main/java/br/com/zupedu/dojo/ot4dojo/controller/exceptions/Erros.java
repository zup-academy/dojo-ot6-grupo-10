package br.com.zupedu.dojo.ot4dojo.controller.exceptions;

public class Erros {

    private String mensagem;

    private String code;

    public Erros(String mensagem, String code) {
        this.mensagem = mensagem;
        this.code = code;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getCode() {
        return code;
    }
}
