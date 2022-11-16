package br.com.erp.comercialms.dataprovider;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.core.usecase.gateway.ClienteGateway;
import br.com.erp.comercialms.dataprovider.repository.ClienteRepository;
import org.springframework.stereotype.Component;

@Component
public class ClienteDataprovider implements ClienteGateway {

    private ClienteRepository clienteRepository;

    @Override
    public ClienteEntity buscarClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void salvarCliente(ClienteEntity entity) {

    }

}
