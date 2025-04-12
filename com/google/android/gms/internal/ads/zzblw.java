/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbuk;
import java.util.Map;

public final class zzblw
implements zzblp {
    static final Map zza;
    private final zzb zzb;
    private final zzbud zzc;
    private final zzbuk zzd;

    static {
        Object[] objectArray = new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        int n3 = 1;
        Integer n4 = n3;
        int n7 = 2;
        Integer n8 = n7;
        int n10 = 3;
        Integer n14 = n10;
        int n15 = 4;
        Integer n16 = n15;
        int n17 = 5;
        Integer n18 = n17;
        int n19 = 6;
        Integer n20 = n19;
        int n21 = 7;
        Integer n22 = n21;
        Object[] objectArray2 = new Integer[n21];
        objectArray2[0] = n4;
        objectArray2[n3] = n8;
        objectArray2[n7] = n14;
        objectArray2[n10] = n16;
        objectArray2[n15] = n18;
        objectArray2[n17] = n20;
        objectArray2[n19] = n22;
        zza = CollectionUtils.mapOfKeyValueArrays(objectArray, objectArray2);
    }

    public zzblw(zzb zzb2, zzbud zzbud2, zzbuk zzbuk2) {
        this.zzb = zzb2;
        this.zzc = zzbud2;
        this.zzd = zzbuk2;
    }
}

