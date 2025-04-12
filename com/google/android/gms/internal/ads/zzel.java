/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.Spanned
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import com.google.android.gms.internal.ads.zzem;
import com.google.android.gms.internal.ads.zzen;
import com.google.android.gms.internal.ads.zzep;
import java.util.ArrayList;

final class zzel {
    private static final String zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;

    static {
        int n3 = 36;
        zza = Integer.toString(0, n3);
        zzb = Integer.toString(1, n3);
        zzc = Integer.toString(2, n3);
        zzd = Integer.toString(3, n3);
        zze = Integer.toString(4, n3);
    }

    public static ArrayList zza(Spanned spanned) {
        int n3;
        Bundle bundle;
        Object object;
        int n4;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n7 = spanned.length();
        Class clazz = zzen.class;
        int n8 = 0;
        Object[] objectArray = (zzen[])spanned.getSpans(0, n7, clazz);
        int n10 = objectArray.length;
        Object object2 = null;
        for (n4 = 0; n4 < n10; ++n4) {
            object = objectArray[n4];
            bundle = ((zzen)object).zza();
            n3 = 1;
            object = zzel.zzb(spanned, object, n3, bundle);
            arrayList.add(object);
        }
        n7 = spanned.length();
        clazz = zzep.class;
        objectArray = (zzep[])spanned.getSpans(0, n7, clazz);
        n10 = objectArray.length;
        object2 = null;
        for (n4 = 0; n4 < n10; ++n4) {
            object = objectArray[n4];
            bundle = ((zzep)object).zza();
            n3 = 2;
            object = zzel.zzb(spanned, object, n3, bundle);
            arrayList.add(object);
        }
        n7 = spanned.length();
        clazz = zzem.class;
        objectArray = (zzem[])spanned.getSpans(0, n7, clazz);
        n10 = objectArray.length;
        while (n8 < n10) {
            object2 = objectArray[n8];
            int n14 = 3;
            bundle = null;
            object2 = zzel.zzb(spanned, object2, n14, null);
            arrayList.add(object2);
            ++n8;
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned object, Object object2, int n3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        String string2 = zza;
        int n4 = object.getSpanStart(object2);
        bundle2.putInt(string2, n4);
        string2 = zzb;
        n4 = object.getSpanEnd(object2);
        bundle2.putInt(string2, n4);
        string2 = zzc;
        int n7 = object.getSpanFlags(object2);
        bundle2.putInt(string2, n7);
        object = zzd;
        bundle2.putInt((String)object, n3);
        if (bundle != null) {
            object = zze;
            bundle2.putBundle((String)object, bundle);
        }
        return bundle2;
    }
}

