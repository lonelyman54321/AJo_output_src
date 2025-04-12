/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgd;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zznv
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        block15: {
            Object object3;
            String string2;
            block14: {
                boolean bl2;
                Object object4;
                block13: {
                    zzqs zzqs2;
                    boolean bl3;
                    int n3 = 1;
                    Preconditions.checkArgument(n3 != 0);
                    int n4 = ((zzqo[])object2).length;
                    object4 = null;
                    if (n4 > 0) {
                        bl3 = true;
                    } else {
                        bl3 = false;
                        zzqs2 = null;
                    }
                    Preconditions.checkArgument(bl3);
                    object4 = object2[0];
                    zzqs2 = zzqs.zze;
                    if (object4 == zzqs2) {
                        return zzqs2;
                    }
                    object4 = zzjn.zzd((zzqo)object4);
                    string2 = "MD5";
                    if (n4 > n3 && (object = object2[n3]) != zzqs2) {
                        string2 = zzjn.zzd((zzqo)object);
                    }
                    n3 = 2;
                    String string3 = "text";
                    object = n4 <= n3 || (object = object2[n3]) == zzqs2 ? string3 : zzjn.zzd((zzqo)object);
                    bl2 = string3.equals(object);
                    if (!bl2) break block13;
                    object = ((String)object4).getBytes();
                    break block14;
                }
                object2 = "base16";
                bl2 = ((String)object2).equals(object);
                if (!bl2) break block15;
                object = zzgd.zzb((String)object4);
            }
            try {
                object3 = MessageDigest.getInstance(string2);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                object2 = String.valueOf(string2);
                object2 = "Hash: Unknown algorithm: ".concat((String)object2);
                object3 = new RuntimeException((String)object2, noSuchAlgorithmException);
                throw object3;
            }
            ((MessageDigest)object3).update((byte[])object);
            object = ((MessageDigest)object3).digest();
            object = zzgd.zza((byte[])object);
            object2 = new zzqz((String)object);
            return object2;
        }
        object = String.valueOf(object);
        object = "Hash: Unknown input format: ".concat((String)object);
        object2 = new RuntimeException((String)object);
        throw object2;
    }
}

