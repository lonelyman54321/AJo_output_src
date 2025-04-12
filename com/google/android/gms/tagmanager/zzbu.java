/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import com.google.android.gms.tagmanager.zzp;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

final class zzbu
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzL.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzh.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzbz.toString();

    public zzbu() {
        String string2 = zza;
        String[] stringArray = zzb;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
    }

    public final zzap zza(Map object) {
        block7: {
            block10: {
                Object object2;
                Object object3;
                block9: {
                    boolean bl2;
                    String string2;
                    block8: {
                        object3 = zzb;
                        if ((object3 = (zzap)object.get(object3)) == null || object3 == (object2 = zzfp.zza())) break block7;
                        object3 = zzfp.zzm(zzfp.zzk((zzap)object3));
                        object2 = zzc;
                        object2 = (object2 = (zzap)object.get(object2)) == null ? "MD5" : zzfp.zzm(zzfp.zzk((zzap)object2));
                        string2 = zzd;
                        object = (zzap)object.get(string2);
                        string2 = "text";
                        bl2 = string2.equals(object = object == null ? string2 : zzfp.zzm(zzfp.zzk((zzap)object)));
                        if (!bl2) break block8;
                        object = ((String)object3).getBytes();
                        break block9;
                    }
                    string2 = "base16";
                    bl2 = string2.equals(object);
                    if (!bl2) break block10;
                    object = zzp.zzb((String)object3);
                }
                try {
                    object3 = MessageDigest.getInstance((String)object2);
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    object = String.valueOf(object2);
                    "Hash: unknown algorithm: ".concat((String)object);
                    return zzfp.zza();
                }
                ((MessageDigest)object3).update((byte[])object);
                object = ((MessageDigest)object3).digest();
                object = zzp.zza((byte[])object);
                return zzfp.zzb(object);
            }
            object = String.valueOf(object);
            "Hash: unknown input format: ".concat((String)object);
            return zzfp.zza();
        }
        return zzfp.zza();
    }

    public final boolean zzb() {
        return true;
    }
}

