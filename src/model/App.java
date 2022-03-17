package model;



public class App {
    public static void main (String[] args){

        Cantine c = new Cantine();
        
        c.creerAlimentveg("oignon","aucun");
        c.creerAlimentveg("carotte","aucun");
        c.creerAlimentveg("tomate","aucun");
        c.creerAlimentveg("huile","aucun");
        c.creerAlimentveg("courgette","aucun");
        c.creerAlimentveg("aubergine","aucun");
        c.creerAlimentveg("poivron rouge","aucun");
        c.creerAlimentveg("poivron vert","aucun");
        c.creerAlimentveg("semoule","aucun");
        c.creerAlimentveg("ail","aucun");
        c.creerAlimentveg("noix de cajou","fruit à coques");
        c.creerAlimentveg("sel","aucun");
        c.creerAlimentveg("pomme de terre","aucun");
        c.creerAlimentveg("emmental","lactose");
        c.creerAlimentveg("beurre","aucun");
        c.creerAlimentveg("oeuf","oeuf");
        c.creerAlimentveg("farine","gluten");
        c.creerAlimentveg("lait","lactose");
        c.creerAlimentveg("parmesan","lactose");
        c.creerAliment("celeri", "celeri");
        c.creerAlimentveg("epinard","aucun");
        c.creerAlimentveg("basilic","aucun");
        c.creerAlimentveg("poivre","aucun");    
        c.creerAlimentveg("citron", "aucun");
        c.creerAlimentveg("riz", "gluten");
        c.creerAlimentveg("sucre", "aucun");

        // Plat  carni 
        c.creerAliment("boeuf", "aucun");
        c.creerAliment("poisson pané", "gluten , poisson");
        c.creerAliment("poisson", "poisson");
        c.creerAliment("dinde", "aucun");
        c.creerAliment("poulet", "aucun");
        c.creerAliment("canard", "aucun");
        c.creerAliment("porc","aucun");

        /*
         for(int i=0; i<c.aliments.size();i++){
            System.out.println(c.aliments.get(i).nomAlim + " ");
        }*/
        //création de plats vege

        c.creerPlatvege("Lasagne de legumes","repas");
        
        c.addComposant("Lasagne de legumes", "oignon");
        c.addComposant("Lasagne de legumes", "courgette");
        c.addComposant("Lasagne de legumes", "aubergine");
        c.addComposant("Lasagne de legumes", "poivron rouge");
        c.addComposant("Lasagne de legumes", "poivron vert");
        c.addComposant("Lasagne de legumes", "semoule");
        c.addComposant("Lasagne de legumes", "tomate");
        c.addComposant("Lasagne de legumes", "basilic");
        c.addComposant("Lasagne de legumes", "huile");
        c.addComposant("Lasagne de legumes", "noix de cajou");
        c.addComposant("Lasagne de legumes", "sel");
        c.addComposant("Lasagne de legumes", "ail");
        c.addComposant("Lasagne de legumes", "pomme de terre");
        c.addComposant("Lasagne de legumes", "emmental");
        c.addComposant("Lasagne de legumes", "beurre");
        c.addComposant("Lasagne de legumes", "lait");
        c.addComposant("Lasagne de legumes", "oeuf");
        c.addComposant("Lasagne de legumes", "epinard");
        c.addComposant("Lasagne de legumes", "parmesan");
        c.addComposant("Lasagne de legumes", "sucre");
        c.addComposant("Lasagne de legumes", "citron");
        
    


        // Plat carni 

        c.creerPlatnormal("Boeuf Bourguignon", "repas");
        c.addComposant("Boeuf Bourguignon", "boeuf");
        c.addComposant("Boeuf Bourguignon", "oignon");
        c.addComposant("Boeuf Bourguignon", "carotte");
        c.addComposant("Boeuf Bourguignon", "farine");
        c.addComposant("Boeuf Bourguignon", "pomme de terre");
        c.addComposant("Boeuf Bourguignon", "riz");
        

       /* for(int i=0; i<c.plats.size();i++){
            System.out.println(c.plats.get(i).nomPlat);
        }*/
       for(int i=0; i<c.plats.size();i++){
            System.out.println(c.plats.get(i).nomPlat + " : ");
            for(int j=0;j<c.plats.get(i).composants.size();j++){
                 System.out.println(c.plats.get(i).composants.get(j).nomAlim);
            }
       }
    }
}
