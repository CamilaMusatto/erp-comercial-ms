package br.com.erp.comercialms.entrypoint.http;

import br.com.erp.comercialms.core.entity.EnderecoEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteHttp {

    private Long id;
    private String nome;
    private String telefone;
    private String rg;
    private String cpf;
    private String cnpj;
    private EnderecoEntity endereco;
    private String email;
    @JsonProperty("data_nascimento")
    private LocalDate dataNasc;
    private String sexo;

}
