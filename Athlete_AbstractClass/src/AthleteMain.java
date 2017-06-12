/**
 * Created by madoka on 2017/06/09.
 */
public class AthleteMain {
    public static void main(String[] args) {
        Quarterback FootballPlayer01 = new Quarterback("Cristiano","football",7,30);
        FootballPlayer01.updateScore(3);
        Golfer GolfPayer01=new Golfer("woods","golfe",10);


        System.out.println(FootballPlayer01.getName().toString()+" is playing "+FootballPlayer01.getSport());
        System.out.println(GolfPayer01.getName().toString()+"'s stroke is "+GolfPayer01.determinePoints( "bogey",2));

    }
}
