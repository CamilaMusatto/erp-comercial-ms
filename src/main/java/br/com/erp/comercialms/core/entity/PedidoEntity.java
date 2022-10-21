package br.com.erp.comercialms.core.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PedidoEntity {

    private Long id;
    private ClienteEntity cliente;
    private EnderecoEntity enderecoEntrega;
    private BigDecimal valor;
    private LocalDateTime dataEntrega;
    private String vendedor;
    private String transportadora;
    private String notaFiscal;
}
