package br.com.erp.comercialms.dataprovider.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_03_PRODUTO)")

public class ProdutoTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "PESO")
    private Double peso;
    @Column(name = "ALTURA")
    private Double altura;
    @Column(name = "LARGURA")
    private Double largura;
    @Column(name = "COR")
    private String cor;
    @Column(name = "UNIDADE_DE_MEDIDA")
    private String unidadeDeMedida;
    @Column(name = "FORNECEDOR")
    private String fornecedor;



}
