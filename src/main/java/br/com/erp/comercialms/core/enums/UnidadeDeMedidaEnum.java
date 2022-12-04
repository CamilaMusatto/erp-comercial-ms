package br.com.erp.comercialms.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnidadeDeMedidaEnum {

    METRO_QUADRADO(1L, "METRO QUADRADO", "M2"),
    METRO_LINEQAR(2L, "METRO LINEAR", "ML");

    private Long id;
    private String descricao;
    private String abreviacao;


}
