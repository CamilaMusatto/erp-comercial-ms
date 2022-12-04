package br.com.erp.comercialms.core.entity;

import br.com.erp.comercialms.core.enums.UnidadeDeMedidaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProdutoEntity {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valorVenda;
    private BigDecimal precoCusto;
    private Double peso;
    private Double altura;
    private Double largura;
    private String cor;
    private UnidadeDeMedidaEnum unidadeDeMedida;
    private List<FornecedorEntity> fornecedor;
    private List<MateriaPrimaEntity> materiasPrimas;
    private Long quantidadeEmEstoque;
    private List<TipoDeProdutoEntity> tipoDeProduto;



}
