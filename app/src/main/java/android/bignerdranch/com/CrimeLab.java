package android.bignerdranch.com;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrime;

    public static CrimeLab get(Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mCrime = new ArrayList<>();
    }

    public List<Crime> getmCrime(){
        return mCrime;
    }

    public Crime getCrime(UUID id){
        for(Crime crime:mCrime){
            if (crime.getID().equals(id))
                return crime;
        }
        return null;
    }
}
