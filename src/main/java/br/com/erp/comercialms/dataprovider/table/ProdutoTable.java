package br.com.erp.comercialms.dataprovider.table;

import br.com.erp.comercialms.core.entity.FornecedorEntity;
import br.com.erp.comercialms.core.entity.MateriaPrimaEntity;
import br.com.erp.comercialms.core.entity.TipoDeProdutoEntity;
import br.com.erp.comercialms.core.enums.UnidadeDeMedidaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_03_PRODUTO")
public class ProdutoTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "VALOR_VENDA")
    private BigDecimal valorVenda;
    @Column(name = "PRECO_CUSTO")
    private BigDecimal precoCusto;
    @Column(name = "PESO")
    private Double peso;
    @Column(name = "ALTURA")
    private Double altura;
    @Column(name = "LARGURA")
    private Double largura;
    @Column(name = "COR")
    private String cor;
    @Column(name = "UNIDADE_MEDIDA")
    private UnidadeDeMedidaEnum unidadeDeMedida;
    @Column(name = "FORNECEDORES")
    @ManyToMany
    @JoinTable(
            name = "tb_05_produtos_fornecedores",
            joinColumns = @JoinColumn(name = "id_produto"),
            inverseJoinColumns = @JoinColumn(name = "id_fornecedor"))
    private List<FornecedorTable> fornecedor;
//    @Column(name = "MATERIA_PRIMA")
//    private List<MateriaPrimaEntity> materiasPrimas;
//    @Column(name = "TIPO_DE_PRODUTO")
//    private List<TipoDeProdutoEntity> tipoDeProduto;
    @Column(name = "QUANTIDADE_ESTOQUE")
    private Long quantidadeEmEstoque;



}
