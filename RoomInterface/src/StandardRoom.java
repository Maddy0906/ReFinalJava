/**
 * Created by madoka on 2017/06/07.
 */
public class StandardRoom implements Room {

    private int sqFootage;
    private int numOutlets;
    private boolean electricityOk;

    public StandardRoom(int sqFootage, int numOutlets, boolean electricityOk) {
        this.sqFootage = sqFootage;
        this.numOutlets = numOutlets;
        this.electricityOk = electricityOk;
    }

    @Override
    public int SqFootage() {
        return sqFootage;
    }

    @Override
    public int getNumOutlets() {
        return numOutlets;
    }

    @Override
    public boolean electricityOk() {
        if(sqFootage >= 100 && numOutlets >= 2){
            return true;
        }else {
            return false;
        }

    }


}
