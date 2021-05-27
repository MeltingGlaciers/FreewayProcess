package data;

public enum CarStatus {
    OK(0),
    SLOWING(1),
    CRUSH(2),
    SPEEDING(3);

    private int status;

    private CarStatus(int status){
        this.status=status;
    }

    public int getNumeredStatus(){
        return status;
    }

    public static CarStatus getStatusFromNum(int num){
        switch (num){
            case 1:
                return SLOWING;
            case 2:
                return CRUSH;
            case 3:
                return SPEEDING;
            default:
                return OK;
        }

    }
}


