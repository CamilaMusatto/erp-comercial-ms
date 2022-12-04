package br.com.erp.comercialms.dataprovider.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_08_ENDERECO")
public class EnderecoTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "RUA")
    private String rua;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CEP")
    private String cep;

}
