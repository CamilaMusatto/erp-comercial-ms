package br.com.erp.comercialms.core.usecase;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.core.usecase.gateway.ClienteGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastrarClienteUsecase {

    private ClienteGateway clienteGateway;

    @Autowired
    public CadastrarClienteUsecase(ClienteGateway clienteGateway) {
        this.clienteGateway = clienteGateway;
    }

    public void cadastrarCliente(ClienteEntity clienteEntity){
        clienteGateway.salvarCliente(clienteEntity);
    }
}
