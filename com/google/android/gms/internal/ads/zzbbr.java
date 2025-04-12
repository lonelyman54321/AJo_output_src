/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbbo;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbbt;
import com.google.android.gms.internal.ads.zzbbv;
import com.google.android.gms.internal.ads.zzbbw;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.PriorityQueue;

public final class zzbbr {
    private final int zza;
    private final zzbbo zzb;

    public zzbbr(int n3) {
        zzbbt zzbbt2 = new zzbbt();
        this.zzb = zzbbt2;
        this.zza = n3;
    }

    public final String zza(ArrayList object) {
        int n3;
        String[] stringArray;
        Object object2 = new StringBuilder();
        int n4 = object.size();
        zzbbo zzbbo2 = null;
        PriorityQueue priorityQueue = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            stringArray = (String)object.get(i3);
            Locale locale = Locale.US;
            stringArray = stringArray.toLowerCase(locale);
            ((StringBuilder)object2).append((String)stringArray);
            n3 = 10;
            ((StringBuilder)object2).append((char)n3);
        }
        object = ((StringBuilder)object2).toString();
        object2 = "\n";
        int n7 = ((String[])(object = ((String)object).split((String)object2))).length;
        if (n7 == 0) {
            object = "";
        } else {
            object2 = new zzbbq();
            n4 = this.zza;
            stringArray = new zzbbp(this);
            priorityQueue = new PriorityQueue(n4, stringArray);
            Object object3 = null;
            for (n4 = 0; n4 < (n3 = ((String[])object).length); ++n4) {
                stringArray = zzbbs.zzb(object[n4], false);
                int n8 = stringArray.length;
                if (n8 == 0) continue;
                n8 = this.zza;
                int n10 = 6;
                zzbbw.zzc(stringArray, n8, n10, priorityQueue);
            }
            object = priorityQueue.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object3 = (zzbbv)object.next();
                zzbbo2 = this.zzb;
                object3 = ((zzbbv)object3).zzb;
                object3 = zzbbo2.zzb((String)object3);
                zzbbo2 = ((zzbbq)object2).zzb;
                try {
                    ((OutputStream)((Object)zzbbo2)).write((byte[])object3);
                }
                catch (IOException iOException) {
                    object3 = "Error while writing hash to byteStream";
                    zzm.zzh((String)object3, iOException);
                    break;
                }
            }
            object = ((zzbbq)object2).toString();
        }
        return object;
    }
}

