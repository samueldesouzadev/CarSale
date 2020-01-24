package com.samueldesouza.carsale.models.Enum;

public enum EnumSituacaoPessoa {
    AUTORIZADO("autorizado"), 
    REPROVADO("reprovado");

    private String descricao;

    EnumSituacaoPessoa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
