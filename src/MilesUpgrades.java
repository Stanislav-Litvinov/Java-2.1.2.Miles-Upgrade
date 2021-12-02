public class MilesUpgrades {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int priceOfTheTicket1 = 15_000;
        int bonusMiles1 = service.calculate(priceOfTheTicket1);
        System.out.println("Вам начислят " + bonusMiles1);

        int priceOfTheTicket2 = -1;
        int bonusMiles2 = service.calculate(priceOfTheTicket2);
        System.out.println("Вам начислят " + bonusMiles2);

        int priceOfTheTicket3 = 1_000_000;
        int bonusMiles3 = service.calculate(priceOfTheTicket3);
        System.out.println("Вам начислят " + bonusMiles3);

        int priceOfTheTicket4 = 66;
        int bonusMiles4 = service.calculate(priceOfTheTicket4);
        System.out.println("Вам начислят " + bonusMiles4);

        int priceOfTheTicket5 = 0;
        int bonusMiles5 = service.calculate(priceOfTheTicket5);
        System.out.println("Вам начислят " + bonusMiles5);
    }
}

