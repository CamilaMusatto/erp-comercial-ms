package br.com.erp.comercialms.core.usecase;

import br.com.erp.comercialms.core.usecase.gateway.FuncionarioGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.erp.comercialms.core.entity.FuncionarioEntity;

@Component
public class CadastrarFuncionarioUsecase {

    private FuncionarioGateway funcionarioGateway;

    @Autowired
    public CadastrarFuncionarioUsecase(FuncionarioGateway funcionarioGateway){
        this.funcionarioGateway = funcionarioGateway;
    }

    public void cadastrarFuncionario(FuncionarioEntity funcionarioEntity) {
        funcionarioGateway.salvarFuncionario(funcionarioEntity);

    }
}
