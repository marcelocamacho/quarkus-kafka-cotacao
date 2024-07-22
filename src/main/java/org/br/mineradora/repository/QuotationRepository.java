package org.br.mineradora.repository;

import org.br.mineradora.entity.QuotationEntity;
import org.br.mineradora.service.QuotationService;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


// Quando o Quarkus fizer o start da aplicação, indica para o runtime que a classe é gerenciada pelo contexto do framework, ou seja ela é gerenciada pelo próprio quarkus
@ApplicationScoped 
public class QuotationRepository implements PanacheRepository<QuotationEntity> {
    
    @Inject
    QuotationService quotationService;

    void schedule(){
        quotationService.getCurrencyPrice();
    }
}
