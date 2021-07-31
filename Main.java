import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Game game1 = new Game(3, "XYZ" , 100,"Windows 10",5);
        Gamer gamer1 = new Gamer(1,"Esra cennet ","Güver", LocalDate.of(1998,2,9), "19326547823");
        Campaign campaign1 = new Campaign(1,"SummerSale" , 40 , LocalDate.of(2021,7,5),LocalDate.of(2021,8,10)) ;

        GameManager gameManager = new GameManager();
        GamerManager gamerManager = new GamerManager();
        CampaignManager campaignManager = new CampaignManager();
        SaleManager saleManager = new SaleManager();

        GamerManager.add(gamer1);
        GamerManager.update(gamer1);
        GamerManager.delete(gamer1);

        campaignManager.add(campaign1);
        campaignManager.update(campaign1);
        campaignManager.delete(campaign1);

        gameManager.add(game1);
        gameManager.update(game1);
        gameManager.delete(game1);


        saleManager.sale(gamer1,game1);
        saleManager.saleWithCampaign(gamer1,game1,campaign1);




    }
}
