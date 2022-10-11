package br.com.erp.comercialms.core.entity;

import java.math.BigDecimal;
import java.util.List;

public class ProdutoEntity {

    private Long id;
    private String nomeProduto;
    private String descricaoProduto;
    private UnidadeMedidaEnum unidadeMedida;
    private BigDecimal valorProduto;
    private List<MateriaPrimaEntity> materiaPrima;
}
