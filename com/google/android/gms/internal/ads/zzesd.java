/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzexv;

public final class zzesd
implements zzexv {
    private final Integer zza;

    private zzesd(Integer n3) {
        this.zza = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ zzesd zzb(VersionInfoParcel object) {
        int n3;
        Object object2;
        block6: {
            Exception exception2;
            Object object3;
            block7: {
                int n4;
                int n7;
                block5: {
                    object2 = zzbep.zzka;
                    object3 = zzba.zzc();
                    object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
                    n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                    if (n3 == 0) {
                        n3 = 0;
                        object2 = null;
                        return new zzesd(null);
                    }
                    zzu.zzp();
                    n3 = 0;
                    object2 = null;
                    try {
                        int n8;
                        n7 = Build.VERSION.SDK_INT;
                        n4 = 30;
                        if (n7 < n4 || (n4 = C3.a()) <= (n8 = 3)) break block5;
                        n3 = g4.a();
                        break block6;
                    }
                    catch (Exception exception2) {
                        break block7;
                    }
                }
                Object object4 = zzbep.zzkd;
                zzben zzben2 = zzba.zzc();
                object4 = zzben2.zza((zzbeg)object4);
                n4 = (int)(((Boolean)(object4 = (Boolean)object4)).booleanValue() ? 1 : 0);
                if (n4 != 0) {
                    int n10 = ((VersionInfoParcel)object).clientJarVersion;
                    object4 = zzbep.zzkc;
                    zzben2 = zzba.zzc();
                    object4 = zzben2.zza((zzbeg)object4);
                    n4 = (Integer)(object4 = (Integer)object4);
                    if (n10 >= n4 && n7 >= (n10 = 31) && (n10 = kk3_1.a()) >= (n7 = 9)) {
                        n3 = kk3_1.a();
                    }
                }
                break block6;
            }
            object3 = "AdUtil.getAdServicesExtensionVersion";
            zzcby zzcby2 = zzu.zzo();
            zzcby2.zzw(exception2, (String)object3);
        }
        object2 = n3;
        return new zzesd((Integer)object2);
    }
}

