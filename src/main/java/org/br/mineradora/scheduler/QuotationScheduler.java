package org.br.mineradora.scheduler;

import io.quarkus.scheduler.Scheduled;
import org.br.mineradora.service.QuotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class QuotationScheduler {

    private final Logger LOG = LoggerFactory.getLogger(QuotationScheduler.class);

    @Inject
    QuotationService quotationService;

    @Transactional
    @Scheduled(every = "35s", identity = "task-job")
    void scheduleGetPrice(){
        LOG.info("-- Executando scheduler Get Price--");
        quotationService.getCurrencyPrice();
    }  

    @Transactional
    @Scheduled(cron = "{cron.expr}")
    void scheduleCleanDB(){
        LOG.info("-- Executando scheduler Clean Database --");
        quotationService.cleanDatabase();
    }  
}
