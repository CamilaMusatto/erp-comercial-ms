package br.com.erp.comercialms.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FornecedorEntity {

    private Long id;
    private String nome;
    private String razaoSocial;
    private String cnpj;
    private String cpf;
    private String telefone;
    private String contato;
    private String email;
    private List<EnderecoEntity> endereco;
    private List<ProdutoEntity> produtos;
    private List<MateriaPrimaEntity> materiasPrimas;

}
