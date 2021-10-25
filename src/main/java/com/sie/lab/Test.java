package com.sie.lab;

import com.sie.lab.enums.TipClient;
import com.sie.lab.enums.TipProdus;
import com.sie.lab.model.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {
        KieServices kS = KieServices.Factory.get();
        KieContainer kC = kS.getKieClasspathContainer();
        KieSession kSession = kC.newKieSession("ksession-rules");

        Client c1 = new Client("X", TipClient.NOU);
        Produs p1 = new Produs("ceas", 1000.0, TipProdus.LUX);
        Produs p2 = new Produs("tablou", 2000.0, TipProdus.LUX);
        Calendar calendar0 = Calendar.getInstance();
        calendar0.set(2021,9,1);
        Comanda com = new Comanda(calendar0, c1);
        ArticolComanda a1 = new ArticolComanda(p1, com, 20.0);
        ArticolComanda a2 = new ArticolComanda(p2, com, 10.0);
        List<ArticolComanda> lst = new ArrayList<>();
        lst.add(a1);
        lst.add(a2);
        com.setArticole(lst);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2021,10,1);
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(2021,10,30);

        SimpleDateFormat format = new SimpleDateFormat("mm/dd/yyyy");
        Promotie promotie = new Promotie(1, calendar1, calendar2);

        kSession.insert(p1);
        kSession.insert(p2);
        kSession.insert(a1);
        kSession.insert(a2);
        kSession.insert(com);
        kSession.insert(c1);
        kSession.insert(promotie);

        kSession.fireAllRules();

        Collection<? extends Object> kSessionObjects = kSession.getObjects();
        for (Object o : kSessionObjects) {
            if(o.getClass() == ComandaInPromotie.class) {
                ComandaInPromotie comandaInPromotie = (ComandaInPromotie) o;
                System.out.println(comandaInPromotie.getValoareComanda());
            }
            if(o.getClass() == Comanda.class) {
                Comanda comanda = (Comanda) o;
                System.out.println(comanda.getValoareComanda());
            }
        }
    }
}
