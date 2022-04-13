package service;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueWs stub=new BanqueServiceService().getBanqueWsPort();
        double res= stub.conversionEuroToDh(600);
        System.out.println("800 Euro En Dh ="+res);

        System.out.println("===========================");

        Compte cp= stub.getcompte(1L);
        System.out.println("Solde De Le code 1l est: "+cp.getSolde());

        System.out.println("===========================");

        List<Compte> cpts=stub.getComptes();
        for (Compte c:cpts){
            System.out.println("Code: "+c.getCode());
            System.out.println("Solde: "+c.getSolde());
            System.out.println("Date De creation : "+c.getDatecreation());
            System.out.println("==========");

        }
    }
}
