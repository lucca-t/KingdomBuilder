public class Action {
    private int location;
    private String type;
    private boolean used;

    public Action(int loc, String ty, boolean u){
        location = loc;
        type = ty;
        used = u;

    }
    public String getType(){
        return type;
    }
    public void setType(String ty){
        type = ty;
    }
    public int getLoc(){
        return location;
    }
    public void setLoc(int loc){
        location = loc;
    }
    public void setUsed(boolean u){
        used = u;
    }
    public boolean getUsed(){
        return used;
    }
}
