package com.curso.domains.enums;

public enum Status {
    ATIVO(0, "ATIVO"), INATIVO(1, "iNATIVO");

    private Integer id;
    private String sitiacao;

    Status(Integer id, String sitiacao) {
        this.id = id;
        this.sitiacao = sitiacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSitiacao() {
        return sitiacao;
    }

    public void setSitiacao(String sitiacao) {
        this.sitiacao = sitiacao;
    }

    public static Status toEnum(Integer id) {
        if(id==null) return null;
        for(Status x : Status.values()) {
            if(id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Status invalido");
    }

}

