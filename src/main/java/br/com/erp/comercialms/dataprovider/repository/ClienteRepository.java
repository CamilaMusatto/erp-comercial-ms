package br.com.erp.comercialms.dataprovider.repository;

import br.com.erp.comercialms.dataprovider.table.ClienteTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ClienteRepository extends JpaRepository<ClienteTable, Long> {



}
