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
import coffeepot.br.sped.fiscal.tipos.DocumentoFiscal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C116"),
    @Field(name = "codMod"),
    @Field(name = "nrSat", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "chvCfe", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "numCfe"),
    @Field(name = "dtDoc")
})
@Getter
@Setter
public class RegC116 {

    private DocumentoFiscal codMod;
    private String nrSat;
    private String chvCfe;
    private Integer numCfe;
    private LocalDate dtDoc;

}
