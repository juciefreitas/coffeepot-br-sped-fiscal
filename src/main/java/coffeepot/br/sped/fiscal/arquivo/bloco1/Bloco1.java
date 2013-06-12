/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.bloco1;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import java.util.List;

/**
 * Bloco 1 - Outras Informações.
 *
 * @author Jeandeson O. Merelis
 * @deprecated Embora seja possível gravarmos Bloco inteiro utilizando apenas
 * uma instancia desta classe e a passando para o ObjectWriter escrevê-la, isto
 * não seria recomendado, pois sabemos que o bloco pode ter muitos registros e o
 * uso da memória ficaria prejudicado. A recomendação é gravar os registros sob
 * demanda, e liberando-os em seguida.
 * <p/>
 * Desta forma, a finalidade desta classe é mais para entendermos a estrutura do
 * Bloco.
 */
@Record(fields = {
    @Field(name = "reg1001"),
    //TODO: Registros Bloco 1 ainda não implementados
    //    @Field(name = "reg1010"),
    //    @Field(name = "reg1100List"),
    //    @Field(name = "reg1200List"),
    //    @Field(name = "reg1300List"),
    //    @Field(name = "reg1350List"),
    //    @Field(name = "reg1390List"),
    //    @Field(name = "reg1400List"),
    //    @Field(name = "reg1500List"),
    //    @Field(name = "reg1600List"),
    //    @Field(name = "reg1700List"),
    //    @Field(name = "reg1800"),
    //    @Field(name = "reg1900List"),
    @Field(name = "reg1990")
})
@Deprecated
public class Bloco1 {

    private Reg1001 reg1001;
    //TODO: Registros Bloco 1 ainda não implementados
//    private Reg1010 reg1010;
//    private List<Reg1100> reg1100List;
//    private List<Reg1200> reg1200List;
//    private List<Reg1300> reg1300List;
//    private List<Reg1350> reg1350List;
//    private List<Reg1390> reg1390List;
//    private List<Reg1400> reg1400List;
//    private List<Reg1500> reg1500List;
//    private List<Reg1600> reg1600List;
//    private List<Reg1700> reg1700List;
//    private Reg1800 reg1800;
//    private List<Reg1900> reg1900List;
    private Reg1990 reg1990;

    public Reg1001 getReg1001() {
        return reg1001;
    }

    public void setReg1001(Reg1001 reg1001) {
        this.reg1001 = reg1001;
    }

    public Reg1990 getReg1990() {
        return reg1990;
    }

    public void setReg1990(Reg1990 reg1990) {
        this.reg1990 = reg1990;
    }
}
