/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzrb;
import com.google.android.gms.internal.ads.zzrc;

public final class zzrd {
    private final Context zza;
    private Boolean zzb;

    public zzrd() {
        this.zza = null;
    }

    public zzrd(Context context) {
        this.zza = context;
    }

    /*
     * WARNING - void declaration
     */
    public final zzqa zza(zzan zzan2, zzk zzk2) {
        int n3;
        int n4;
        zzan2.getClass();
        zzk2.getClass();
        int bl3 = zzgd.zza;
        int bl4 = 29;
        if (bl3 >= bl4 && (n4 = zzan2.zzB) != (n3 = -1)) {
            int n7;
            String string2;
            Object object = this.zza;
            Object object2 = this.zzb;
            if (object2 != null) {
                boolean bl2 = (Boolean)object2;
            } else {
                if (object != null) {
                    object2 = "audio";
                    if ((object = (AudioManager)object.getSystemService((String)object2)) != null) {
                        boolean bl5;
                        boolean bl6;
                        object = object.getParameters("offloadVariableRateSupported");
                        boolean bl7 = false;
                        object2 = null;
                        if (object != null && (bl6 = ((String)object).equals(string2 = "offloadVariableRateSupported=1"))) {
                            bl5 = true;
                        }
                        this.zzb = object = Boolean.valueOf(bl5);
                    } else {
                        this.zzb = object = Boolean.FALSE;
                    }
                } else {
                    object = Boolean.FALSE;
                    this.zzb = object;
                }
                object = this.zzb;
                boolean bl8 = (Boolean)object;
            }
            object2 = zzan2.zzn;
            object2.getClass();
            string2 = zzan2.zzk;
            int n8 = zzcg.zza((String)object2, string2);
            if (n8 != 0 && bl3 >= (n7 = zzgd.zzg(n8))) {
                void var4_9;
                block13: {
                    int n10;
                    n7 = zzgd.zzh(zzan2.zzA);
                    if (n7 == 0) {
                        return zzqa.zza;
                    }
                    try {
                        n10 = zzan2.zzB;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        return zzqa.zza;
                    }
                    zzan2 = zzgd.zzw(n10, n7, n8);
                    int n14 = 31;
                    if (bl3 < n14) break block13;
                    zzk2 = zzk2.zza().zza;
                    return zzrc.zza((AudioFormat)zzan2, (AudioAttributes)zzk2, (boolean)var4_9);
                }
                zzk2 = zzk2.zza().zza;
                return zzrb.zza((AudioFormat)zzan2, (AudioAttributes)zzk2, (boolean)var4_9);
            }
            return zzqa.zza;
        }
        return zzqa.zza;
    }
}

