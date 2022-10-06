/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C165"),
    @Field(name = "codPart"),
    @Field(name = "veicId", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY}),
    @Field(name = "codAut"),
    @Field(name = "nrPasse"),
    @Field(name = "hora"),
    @Field(name = "temper"),
    @Field(name = "qtdVol"),
    @Field(name = "pesoBrt"),
    @Field(name = "pesoLiq"),
    @Field(name = "nomMot", maxLength = 60),
    @Field(name = "cpf", length = 11, padding = '0', align = Align.RIGHT, paddingIfNullOrEmpty = true, params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "ufId")
})
@Getter
@Setter
public class RegC165 {

    private String codPart;
    private String veicId;
    private String codAut;
    private String nrPasse;
    private LocalTime hora;
    private Double temper;
    private Integer qtdVol;
    private Double pesoBrt;
    private Double pesoLiq;
    private String nomMot;
    private String cpf;
    private String ufId;

}
