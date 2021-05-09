package android.bignerdranch.com;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolve;

    public Crime() {
        //   Generate unique indentifier
        mID = UUID.randomUUID();
    }

    public void setTitle(String title){
        mTitle = title;
    }

    public String getTitle(){
        return mTitle;
    }

    public UUID getID(){
        return mID;
    }

    public void setDate(Date date){
        mDate = date;
    }

    public Date getDate(){
        return mDate;
    }

    public void setSolve(boolean solve){
        mSolve = solve;
    }

    public boolean isSolve(){
        return mSolve;
    }
}
