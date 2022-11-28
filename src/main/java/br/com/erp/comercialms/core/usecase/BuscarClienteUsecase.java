package br.com.erp.comercialms.core.usecase;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.core.usecase.gateway.ClienteGateway;
import br.com.erp.comercialms.dataprovider.ClienteDataprovider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarClienteUsecase {

    @Autowired
    private ClienteGateway clienteGateway;

    public ClienteEntity buscarClientePorId(Long id){

        return clienteGateway.buscarClienteById(id);
    }


}
