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
        c.creerAlimentveg("pomme", "aucun");
        c.creerAlimentveg("banane", "aucun");
        c.creerAliment("fromage", "lactose");
        c.creerAliment("chocolat", "aucun");
        c.creerAliment("chou rouge", "aucun");
        c.creerAliment("celeri rave", "aucun");

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
        
        


        // Dessert 

        c.creerPlatvege("Tarte aux pommes","dessert");
        c.addComposant("Tarte aux pommes", "pomme");

        c.creerPlatvege("Banane", "dessert");
        c.addComposant("Banane", "banane");

        c.creerPlatvege("Compote de pomme", "dessert");
        c.addComposant("Compote de pomme", "pomme");

        c.creerPlatvege("Fromage blanc", "dessert");
        c.addComposant("Fromage blanc", "fromage");

        c.creerPlatvege("Moëlleux au chocolat", "dessert");
        c.addComposant("Moëlleux au chocolat", "chocolat");
        c.addComposant("Moëlleux au chocolat", "oeuf");
        c.addComposant("Moëlleux au chocolat", "farine");
        c.addComposant("Moëlleux au chocolat", "sucre");
        c.addComposant("Moëlleux au chocolat", "beurre");
        

        
        // Entrée

        c.creerPlatvege("Celeri remoulade", "entree");
        c.addComposant("Celeri remoulade", "celeri rave");
        c.addComposant("Celeri remoulade", "oeuf");
        c.addComposant("Celeri remoulade", "citron");

        c.creerPlatvege("Salade de chou rouge", "entree");
        c.addComposant("Salade de chou rouge", "oignon");
        c.addComposant("Salade de chou rouge", "chou rouge");
        c.addComposant("Salade de chou rouge", "citron");
        c.addComposant("Salade de chou rouge", "poivre");

        // creer menu 

        c.creerMenu("Celeri remoulade", "Boeuf Bourguignon", "Compote de pomme");
        
        c.afficheMenus();
        // Ajouter  Parent 



     
     /*for (int i = 0 ; i<c.menus.size(); i++){
            System.out.println(c.menus.get(i).GetEntree());
        }
     
          for(int i=0; i<c.plats.size();i++){
            System.out.println(c.plats.get(i).nomPlat);
        }

        */
      /* for(int i=0; i<c.plats.size();i++){
            System.out.println(c.plats.get(i).nomPlat + " : ");
            for(int j=0;j<c.plats.get(i).composants.size();j++){
                 System.out.println(c.plats.get(i).composants.get(j).nomAlim);
            }
       }
       */
    }
}
