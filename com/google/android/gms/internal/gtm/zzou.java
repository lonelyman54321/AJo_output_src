/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzht;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;
import com.google.android.gms.tagmanager.zzck;

public final class zzou
extends zzjo {
    private final zzck zza;
    private final zzht zzb;

    public zzou(zzck zzck2, zzht zzht2) {
        this.zza = zzck2;
        this.zzb = zzht2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        var3_3 = true;
        Preconditions.checkArgument(var3_3);
        var4_4 = ((zzqo[])var2_2).length;
        if (var4_4 == var3_3) ** GOTO lbl8
        var5_5 = 2 != 0;
        if (var4_4 == var5_5) {
            var4_4 = 2 != 0;
lbl8:
            // 2 sources

            var5_5 = true;
        } else {
            var5_5 = false;
            var6_6 = null;
        }
        Preconditions.checkArgument(var5_5);
        var6_6 = var2_2[0];
        var5_5 = var6_6 instanceof zzqz;
        Preconditions.checkArgument(var5_5);
        var7_7 = var4_4 > var3_3 ? var2_2[var3_3] : zzqs.zze;
        var6_6 = zzqs.zze;
        if (var7_7 != var6_6 && !(var8_8 = var7_7 instanceof zzqw)) {
            var3_3 = false;
            var1_1 = null;
        }
        Preconditions.checkArgument(var3_3);
        var1_1 = this.zzb.zza();
        var2_2 = (zzqz)var2_2[0];
        var9_9 = var2_2.zzk();
        if (var7_7 != var6_6) {
            var7_7 = (zzqw)var7_7;
            var2_2 = zzra.zza(var7_7.zzi());
        } else {
            var2_2 = null;
        }
        var10_10 = this.zza;
        var11_11 = var1_1.zzc();
        var12_12 = var1_1.currentTimeMillis();
        try {
            var10_10.zzc(var11_11, var9_9, (Bundle)var2_2, var12_12);
        }
        catch (RemoteException v0) {
            var1_1 = String.valueOf(v0.getMessage());
            var2_2 = "Error calling measurement proxy:";
            var1_1 = var2_2.concat((String)var1_1);
            zzhi.zza((String)var1_1);
        }
        return zzqs.zze;
    }
}

