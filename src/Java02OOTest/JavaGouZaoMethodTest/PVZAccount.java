package Java02OOTest.JavaGouZaoMethodTest;

final class PVZAccount extends Account{
    private double playTime;
    private int winTimes;
    private float money;
    private int level;
    public double getPlayTime(){
        if ( playTime == 0 || playTime < 0 ){
            System.out.println("你是个new！");
            return playTime = 0;
        }
        return playTime;
    }
    public int getWinTimes(){
        if ( winTimes < 0 ){
            return winTimes = 0;
        }
        return winTimes;
    }
    public float getMoney(){
        if ( money < 0 ){
            return money = 0;
        }
        return money;
    }
    public int getLevel(){
        if ( level < 0 ){
            return level = 0;
        }
        return level;
    }
    public void setPlayTime(double playTime){
        this.playTime = playTime;
    }
    public void setWinTimes(int winTimes){
        this.winTimes = winTimes;
    }
    public void setMoney(float money){
        this.money = money;
    }
    public void setLevel(int level){
        this.level = level;
    }
}
