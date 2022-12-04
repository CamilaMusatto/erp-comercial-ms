package br.com.erp.comercialms.core.entity;

import br.com.erp.comercialms.core.enums.UnidadeDeMedidaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MateriaPrimaEntity {

    private Long id;
    private String nome;
    private String descricao;
    private Long quantidadeEmEstoque;
    private List<FornecedorEntity> fornecedores;
    private UnidadeDeMedidaEnum unidadeDeMedida;
    private BigDecimal precoCusto;
}
