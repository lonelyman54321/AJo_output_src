/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaep;
import com.google.android.gms.internal.ads.zzafg;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzalf;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.Arrays;
import java.util.List;

final class zzale
extends zzali {
    private static final byte[] zza;
    private static final byte[] zzb;
    private boolean zzc;

    static {
        byte[] byArray;
        byte[] byArray2;
        int n3 = 8;
        byte[] byArray3 = byArray2 = new byte[n3];
        byte[] byArray4 = byArray2;
        byArray3[0] = 79;
        byArray4[1] = 112;
        byArray3[2] = 117;
        byArray4[3] = 115;
        byArray3[4] = 72;
        byArray4[5] = 101;
        byArray3[6] = 97;
        byArray4[7] = 100;
        zza = byArray2;
        byte[] byArray5 = byArray = new byte[n3];
        byte[] byArray6 = byArray;
        byArray5[0] = 79;
        byArray6[1] = 112;
        byArray5[2] = 117;
        byArray6[3] = 115;
        byArray5[4] = 84;
        byArray6[5] = 97;
        byArray5[6] = 103;
        byArray6[7] = 115;
        zzb = byArray;
    }

    public static boolean zzd(zzfu zzfu2) {
        byte[] byArray = zza;
        return zzale.zzk(zzfu2, byArray);
    }

    private static boolean zzk(zzfu zzfu2, byte[] byArray) {
        int n3;
        int n4 = zzfu2.zzb();
        if (n4 < (n3 = 8)) {
            return false;
        }
        n4 = zzfu2.zzd();
        byte[] byArray2 = new byte[n3];
        zzfu2.zzG(byArray2, 0, n3);
        zzfu2.zzK(n4);
        return Arrays.equals(byArray2, byArray);
    }

    public final long zza(zzfu zzfu2) {
        long l2 = zzaep.zzd(zzfu2.zzM());
        return this.zzg(l2);
    }

    public final void zzb(boolean bl2) {
        super.zzb(bl2);
        if (bl2) {
            bl2 = false;
            this.zzc = false;
        }
    }

    public final boolean zzc(zzfu object, long l2, zzalf zzalf2) {
        block9: {
            boolean bl2;
            block8: {
                int n3;
                Object object2;
                block7: {
                    object2 = zza;
                    n3 = zzale.zzk((zzfu)object, (byte[])object2);
                    bl2 = true;
                    if (n3 == 0) break block7;
                    object2 = ((zzfu)object).zzM();
                    int n4 = ((zzfu)object).zze();
                    object = Arrays.copyOf((byte[])object2, n4);
                    n3 = object[9] & 0xFF;
                    object = zzaep.zze((byte[])object);
                    Object object3 = zzalf2.zza;
                    if (object3 == null) {
                        object3 = new zzal();
                        ((zzal)object3).zzX("audio/opus");
                        ((zzal)object3).zzy(n3);
                        ((zzal)object3).zzY(48000);
                        ((zzal)object3).zzL((List)object);
                        zzalf2.zza = object = ((zzal)object3).zzad();
                        return bl2;
                    }
                    break block8;
                }
                object2 = zzb;
                n3 = zzale.zzk((zzfu)object, (byte[])object2);
                zzcd zzcd2 = null;
                if (n3 == 0) break block9;
                object2 = zzalf2.zza;
                zzeq.zzb(object2);
                n3 = (int)(this.zzc ? 1 : 0);
                if (n3 == 0) {
                    this.zzc = bl2;
                    n3 = 8;
                    ((zzfu)object).zzL(n3);
                    object = zzafg.zzb(zzgbc.zzl(zzafg.zzc((zzfu)object, (boolean)false, (boolean)false).zzb));
                    if (object != null) {
                        object2 = zzalf2.zza.zzb();
                        zzcd2 = zzalf2.zza.zzl;
                        object = ((zzcd)object).zzd(zzcd2);
                        ((zzal)object2).zzQ((zzcd)object);
                        zzalf2.zza = object = ((zzal)object2).zzad();
                    }
                }
            }
            return bl2;
        }
        zzeq.zzb(zzalf2.zza);
        return false;
    }
}

