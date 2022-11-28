package br.com.erp.comercialms.dataprovider.table;

import br.com.erp.comercialms.core.entity.EnderecoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_02_FUNCIONARIO")
public class FuncionarioTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "MATRICULA")
    private String matricula;
    @Column(name = "DATA_ADMISSAO")
    private LocalDate dataAdmissao;
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "SETOR_DE_TRABALHO")
    private String setorDeTrabalho;
    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;
    // precisa fazer mapeamento de relacionamento
    //private EnderecoEntity endereco;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "CPF", length = 11)
    private String cpf;
    @Column(name = "SALARIO")
    private BigDecimal salario;




}
