package br.com.erp.comercialms.dataprovider.table;

import br.com.erp.comercialms.core.entity.EnderecoEntity;
import br.com.erp.comercialms.core.entity.MateriaPrimaEntity;
import br.com.erp.comercialms.core.entity.ProdutoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_04_FORNECEDOR")
public class FornecedorTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "CONTATO")
    private String contato;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PRODUTOS")
    @ManyToMany(mappedBy = "fornecedor", fetch = FetchType.LAZY)
    private List<ProdutoTable> produtos;
    @Column(name = "MATERIAS_PRIMAS")
    @ManyToMany(mappedBy = "fornecedores")
    private List<MateriaPrimaTable> materiasPrimas;
    @OneToMany
    private List<EnderecoTable> endereco;
}
