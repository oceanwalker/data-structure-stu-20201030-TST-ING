package cn.oceanwalker.data_structure.geektime.learn.LearnRecursion;

public class TowersOfHanoi {
    private final int totals;
    private StringBuilder result;

    public TowersOfHanoi(int totals) {
        this.totals=totals;
        result=new StringBuilder();
    }

    public void solve() {
        moveTower(totals,1,3,2);
    }

    private void moveTower(int totals, int start, int end, int temp) {
        if(totals==1){
            moveDisk(start,end);
        }else{
            moveTower(totals-1,start,temp,end);
            moveDisk(start,end);
            moveTower(totals-1,temp,end,start);
        }
    }

    private void moveDisk(int start, int end) {
        result.append(start).append(",").append(end).append(" ");
    }

    public String getResult() {
        return result.toString();
    }
}
