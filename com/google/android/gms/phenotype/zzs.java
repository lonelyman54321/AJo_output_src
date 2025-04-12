/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import com.google.android.gms.phenotype.PhenotypeFlag;
import com.google.android.gms.phenotype.PhenotypeFlag$Factory;

final class zzs
extends PhenotypeFlag {
    public zzs(PhenotypeFlag$Factory phenotypeFlag$Factory, String string2, String string3) {
        super(phenotypeFlag$Factory, string2, string3, null);
    }

    private final String zzb(SharedPreferences object) {
        String string2;
        try {
            string2 = this.zzap;
        }
        catch (ClassCastException classCastException) {
            object = String.valueOf(this.zzap);
            int n3 = ((String)object).length();
            if (n3 != 0) {
                string2 = "Invalid string value in SharedPreferences for ";
                string2.concat((String)object);
            }
            return null;
        }
        return object.getString(string2, null);
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences2) {
        return this.zzb(sharedPreferences2);
    }

    public final /* synthetic */ Object zza(String string2) {
        return string2;
    }
}

