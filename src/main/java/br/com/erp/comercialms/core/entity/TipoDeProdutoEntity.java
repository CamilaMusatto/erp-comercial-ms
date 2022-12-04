package br.com.erp.comercialms.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TipoDeProdutoEntity {

    private Long id;
    private String nome;
    private String descricao;
}
