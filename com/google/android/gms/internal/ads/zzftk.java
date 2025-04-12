/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzftl;
import com.google.android.gms.internal.ads.zzftn;
import com.google.android.gms.internal.ads.zzfto;

public final class zzftk {
    final zzftn zza;
    final boolean zzb;

    private zzftk(zzftn zzftn2) {
        boolean bl2;
        this.zza = zzftn2;
        if (zzftn2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            zzftn2 = null;
        }
        this.zzb = bl2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzftk zzb(Context var0, String var1_3, String var2_4) {
        block9: {
            block10: {
                var2_4 = "com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger";
                var3_5 = DynamiteModule.PREFER_REMOTE;
                var4_6 = "com.google.android.gms.ads.dynamite";
                var3_5 = DynamiteModule.load(var0 /* !! */ , (DynamiteModule$VersionPolicy)var3_5, (String)var4_6);
                var2_4 = var3_5.instantiate(var2_4);
                var3_5 = null;
                if (var2_4 != null) break block10;
                var4_6 = null;
                ** GOTO lbl22
            }
            var4_6 = "com.google.android.gms.gass.internal.clearcut.IGassClearcut";
            {
                catch (Exception var0_1) {
                    ** GOTO lbl-1000
                }
            }
            var5_7 = (var4_6 = var2_4.queryLocalInterface((String)var4_6)) instanceof zzftn;
            if (!var5_7) ** GOTO lbl-1000
            var4_6 = (zzftn)var4_6;
            ** GOTO lbl22
lbl-1000:
            // 1 sources

            {
                var4_6 = new zzftl((IBinder)var2_4);
lbl22:
                // 3 sources

                try {
                    var0 /* !! */  = ObjectWrapper.wrap(var0 /* !! */ );
                    var4_6.zze((IObjectWrapper)var0 /* !! */ , (String)var1_3, null);
                    return new zzftk((zzftn)var4_6);
                }
                catch (RemoteException | zzfsm | NullPointerException | SecurityException v0) {
                    break block9;
                }
                catch (Exception var0_2) {}
                {
                    var1_3 = new zzfsm(var0_2);
                    throw var1_3;
                }
            }
lbl-1000:
            // 1 sources

            {
                var1_3 = new zzfsm(var0_1);
                throw var1_3;
            }
        }
        var0 /* !! */  = new zzfto();
        return new zzftk((zzftn)var0 /* !! */ );
    }

    public static zzftk zzc() {
        zzfto zzfto2 = new zzfto();
        zzftk zzftk2 = new zzftk(zzfto2);
        return zzftk2;
    }

    public final zzftj zza(byte[] byArray) {
        zzftj zzftj2 = new zzftj(this, byArray, null);
        return zzftj2;
    }
}

