package br.com.erp.comercialms.dataprovider.table;

import br.com.erp.comercialms.core.entity.EnderecoEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_01_CLIENTE")
public class ClienteTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "RG")
    private String rg;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "CNPJ")
    private String cnpj;
//    private EnderecoTable endereco;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNasc;
    @Column(name = "SEXO")
    private String sexo;

}
