package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized // permite que essa classe e esses atributos sejam lidos como jsons.
@Data //Cria todos os getters e setters
@Builder //permite ter várias combinações de assinaturas de construtor com diferentes variáveis.
@AllArgsConstructor //cria um construtor padrão com todos os argumentos disponíveis.
public class USDBRL {
    public String code;
    public String codein;
    public String name;
    public String high;
    public String low;
    public String varBid;
    public String pctChange;
    public String bid;
    public String ask;
    public String timestamp;
    public String create_date;
    
}
