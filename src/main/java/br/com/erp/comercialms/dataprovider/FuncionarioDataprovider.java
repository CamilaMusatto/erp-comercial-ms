package br.com.erp.comercialms.dataprovider;

import br.com.erp.comercialms.core.entity.FuncionarioEntity;
import br.com.erp.comercialms.core.usecase.gateway.FuncionarioGateway;
import br.com.erp.comercialms.dataprovider.mapper.FuncionarioMapper;
import br.com.erp.comercialms.dataprovider.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioDataprovider implements FuncionarioGateway {

    private FuncionarioRepository funcionarioRepository;



    @Autowired
    public FuncionarioDataprovider(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }


    @Override
    public FuncionarioEntity buscarFuncionarioById(Long id) {
        return FuncionarioMapper.INSTANCE.funcionarioTableToFuncionarioEntity(funcionarioRepository.findById(id).get());

    }

    @Override
    public void salvarFuncionario(FuncionarioEntity entity) {
        funcionarioRepository.save(FuncionarioMapper.INSTANCE.funcionarioEntityToFuncionarioTable(entity));


    }
}
