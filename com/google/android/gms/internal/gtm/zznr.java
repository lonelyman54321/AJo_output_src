/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.gtm;

import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgd;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zznr
extends zzjo {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzqo zza(zzhx object, zzqo ... object2) {
        CharSequence charSequence;
        String string2;
        block15: {
            int n3;
            String string3;
            int n4;
            String string4;
            String string5;
            block14: {
                zzqo zzqo2;
                boolean bl2;
                object = "Encode: unknown input format: ";
                int n7 = 1;
                Preconditions.checkArgument(n7 != 0);
                int n8 = ((zzqo[])object2).length;
                String string6 = null;
                if (n8 > 0) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    string5 = null;
                }
                Preconditions.checkArgument(bl2);
                string6 = zzjn.zzd(object2[0]);
                string5 = "text";
                string2 = n8 > n7 ? zzjn.zzd(object2[n7]) : string5;
                string4 = "base16";
                n4 = 2;
                string3 = n8 > n4 ? zzjn.zzd(object2[n4]) : string4;
                int n10 = 3;
                if (n8 > n10 && (n3 = zzjn.zzg(zzqo2 = object2[n10])) != 0) {
                    n4 = 3;
                }
                try {
                    n3 = string5.equals(string2);
                    charSequence = "base64url";
                    string5 = "base64";
                    if (n3 != 0) {
                        object = string6.getBytes();
                        break block14;
                    }
                    n3 = string4.equals(string2);
                    if (n3 != 0) {
                        object = zzgd.zzb(string6);
                        break block14;
                    }
                    n3 = string5.equals(string2);
                    if (n3 != 0) {
                        object = Base64.decode((String)string6, (int)n4);
                        break block14;
                    }
                    n3 = ((String)charSequence).equals(string2);
                    if (n3 == 0) break block15;
                    int n14 = n4 | 8;
                    object = Base64.decode((String)string6, (int)n14);
                }
                catch (IllegalArgumentException illegalArgumentException) {}
            }
            n3 = string4.equals(string3);
            if (n3 != 0) {
                object = zzgd.zza((byte[])object);
                return new zzqz((String)object);
            } else {
                n3 = string5.equals(string3);
                if (n3 != 0) {
                    object = Base64.encodeToString((byte[])object, (int)n4);
                    return new zzqz((String)object);
                } else {
                    n3 = ((String)charSequence).equals(string3);
                    if (n3 == 0) {
                        object = String.valueOf(string3);
                        object = "Encode: unknown output format: ".concat((String)object);
                        RuntimeException runtimeException = new RuntimeException((String)object);
                        throw runtimeException;
                    }
                    n3 = n4 | 8;
                    object = Base64.encodeToString((byte[])object, (int)n3);
                }
            }
            return new zzqz((String)object);
        }
        charSequence = new StringBuilder((String)object);
        ((StringBuilder)charSequence).append(string2);
        object = ((StringBuilder)charSequence).toString();
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
        object = String.valueOf(string2);
        object = "Encode: invalid input:".concat((String)object);
        RuntimeException runtimeException = new RuntimeException((String)object);
        throw runtimeException;
    }
}

