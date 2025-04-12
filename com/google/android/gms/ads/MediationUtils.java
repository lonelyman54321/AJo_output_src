/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 */
package com.google.android.gms.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.List;

public class MediationUtils {
    protected static final double MIN_HEIGHT_RATIO = 0.7;
    protected static final double MIN_WIDTH_RATIO = 0.5;

    public static AdSize findClosestSize(Context object, AdSize adSize, List object2) {
        Object object3 = null;
        if (object2 != null && adSize != null) {
            boolean bl2;
            int n3;
            int n4 = adSize.zzh();
            if (n4 == 0 && (n4 = adSize.zzi()) == 0) {
                DisplayMetrics displayMetrics = object.getResources().getDisplayMetrics();
                float f5 = displayMetrics.density;
                float f6 = (float)adSize.getWidthInPixels((Context)object) / f5;
                n3 = Math.round(f6);
                float f7 = (float)adSize.getHeightInPixels((Context)object) / f5;
                int n7 = Math.round(f7);
                adSize = new AdSize(n3, n7);
            }
            object = object2.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (AdSize)object.next();
                if (object2 == null) continue;
                n4 = adSize.getWidth();
                n3 = ((AdSize)object2).getWidth();
                int n8 = adSize.getHeight();
                double d2 = (double)n4 * 0.5;
                double d5 = n3;
                int n10 = ((AdSize)object2).getHeight();
                Object object4 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
                if (object4 > 0 || n4 < n3) continue;
                n4 = (int)(adSize.zzi() ? 1 : 0);
                if (n4 != 0) {
                    n4 = adSize.zza();
                    Object object5 = zzbep.zzhW;
                    zzben zzben2 = zzba.zzc();
                    object5 = (Integer)zzben2.zza((zzbeg)object5);
                    n8 = (Integer)object5;
                    if (n8 > n3) continue;
                    Object object6 = zzbep.zzhX;
                    object5 = zzba.zzc();
                    object6 = (Integer)((zzben)object5).zza((zzbeg)object6);
                    n3 = (Integer)object6;
                    if (n3 > n10 || n4 < n10) continue;
                } else {
                    double d7;
                    double d9;
                    double d12;
                    n4 = (int)(adSize.zzh() ? 1 : 0);
                    if (!(n4 != 0 ? (n4 = adSize.zzb()) >= n10 : (d12 = (d9 = (d7 = (double)n8 * 0.7) - (d2 = (double)n10)) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) <= 0 && n8 >= n10)) continue;
                }
                if (object3 != null) {
                    n4 = ((AdSize)object3).getWidth();
                    n3 = ((AdSize)object3).getHeight() * n4;
                    n4 = ((AdSize)object2).getWidth();
                    n8 = ((AdSize)object2).getHeight() * n4;
                    if (n3 > n8) continue;
                }
                object3 = object2;
            }
        }
        return object3;
    }
}

