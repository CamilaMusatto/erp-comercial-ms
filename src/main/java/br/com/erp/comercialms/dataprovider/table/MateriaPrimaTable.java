package br.com.erp.comercialms.dataprovider.table;

import br.com.erp.comercialms.core.entity.FornecedorEntity;
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
@Table(name = "TB_06_MATERIA_PRIMA")
public class MateriaPrimaTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "QUANTIDADE_ESTOQUE")
    private Long quantidadeEmEstoque;
    @Column(name = "FORNECEDOR")
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "tb_07_materia_prima_fornecedores",
            joinColumns = @JoinColumn(name = "id_materia_prima"),
            inverseJoinColumns = @JoinColumn(name = "id_forncedor")
    )
    private List<FornecedorTable> fornecedores;
    @Column(name = "UNIDADE_MEDIDA")
    private UnidadeDeMedidaEnum unidadeDeMedida;
    @Column(name = "PRECO_CUSTO")
    private BigDecimal precoCusto;

}
