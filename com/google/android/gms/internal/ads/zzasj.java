/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzasb;
import java.io.UnsupportedEncodingException;

public class zzasj
extends zzare {
    private final Object zza;
    private final zzarj zzb;

    public zzasj(int n3, String string2, zzarj zzarj2, zzari zzari2) {
        super(n3, string2, zzari2);
        Object object;
        this.zza = object = new Object();
        this.zzb = zzarj2;
    }

    public final zzark zzh(zzara object) {
        String string2;
        String string3;
        byte[] byArray;
        block17: {
            byArray = ((zzara)object).zzb;
            String[] stringArray = ((zzara)object).zzc;
            string3 = "ISO-8859-1";
            if (stringArray == null) break block17;
            String string4 = "Content-Type";
            stringArray = stringArray.get(string4);
            stringArray = (String)stringArray;
            if (stringArray == null) break block17;
            string4 = ";";
            stringArray = stringArray.split(string4, 0);
            int n3 = 1;
            int n4 = 1;
            while (true) {
                block18: {
                    int n7 = stringArray.length;
                    if (n4 >= n7) break;
                    String[] stringArray2 = stringArray[n4];
                    stringArray2 = stringArray2.trim();
                    String string5 = "=";
                    stringArray2 = stringArray2.split(string5, 0);
                    int n8 = stringArray2.length;
                    int n10 = 2;
                    if (n8 != n10) break block18;
                    string5 = stringArray2[0];
                    String string6 = "charset";
                    n8 = (int)(string5.equals(string6) ? 1 : 0);
                    if (n8 == 0) break block18;
                    string3 = stringArray2[n3];
                    break;
                }
                ++n4;
            }
        }
        try {
            string2 = new String(byArray, string3);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            byArray = ((zzara)object).zzb;
            string2 = new String(byArray);
        }
        object = zzasb.zzb((zzara)object);
        return zzark.zzb(string2, (zzaqn)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void zzz(String string2) {
        zzarj zzarj2;
        Object object = this.zza;
        synchronized (object) {
            zzarj2 = this.zzb;
        }
        zzarj2.zza(string2);
    }
}

