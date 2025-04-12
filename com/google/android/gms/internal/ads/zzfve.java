/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfvf;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

class zzfve {
    static final String zza;
    final zzfvf zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    static {
        long l2 = 0L;
        UUID uUID = new UUID(l2, l2);
        zza = uUID.toString();
    }

    public zzfve(Context object, String string2, String string3, String string4) {
        object = zzfvf.zzb(object);
        this.zzb = object;
        this.zzc = string2;
        object = "_3p";
        this.zzd = string2 = string2.concat((String)object);
        this.zze = string3;
        object = string3.concat((String)object);
        this.zzf = object;
        this.zzg = string4;
    }

    private final String zzh(String charSequence, String object, String string2) {
        if (object != null && string2 != null) {
            charSequence = n1.a((String)charSequence, (String)object, string2);
            object = StandardCharsets.UTF_8;
            return UUID.nameUUIDFromBytes(((String)charSequence).getBytes((Charset)object)).toString();
        }
        charSequence = this.zzg;
        charSequence = nn_2.a((String)charSequence, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String string3 = "not null";
        String string4 = "null";
        object = object == null ? string4 : string3;
        ((StringBuilder)charSequence).append((String)object);
        object = ", hashKey is ";
        ((StringBuilder)charSequence).append((String)object);
        if (string2 == null) {
            string3 = string4;
        }
        ((StringBuilder)charSequence).append(string3);
        charSequence = ((StringBuilder)charSequence).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    public final long zza(boolean bl2) {
        String string2 = bl2 ? this.zzf : this.zze;
        return this.zzb.zza(string2, -1);
    }

    public final zzfvd zzb(String object, String object2, long l2, boolean bl2) {
        Object object3;
        boolean bl3;
        block10: {
            block11: {
                bl3 = true;
                if (object == null) break block10;
                try {
                    UUID.fromString((String)object);
                    object3 = zza;
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                boolean bl4 = ((String)object).equals(object3);
                if (bl4) break block11;
                object3 = this.zze(bl3);
                Object object4 = this.zzb;
                String string2 = "paid_3p_hash_key";
                object4 = ((zzfvf)object4).zzc(string2, null);
                if (object3 != null && object4 != null && !(bl4 = ((String)object3).equals(object4 = this.zzh((String)object, (String)object2, (String)object4)))) {
                    return this.zzc((String)object, (String)object2);
                }
                break block10;
            }
            object = new zzfvd();
            return object;
        }
        if (object == null) {
            bl3 = false;
        }
        long l3 = System.currentTimeMillis();
        long l4 = 0L;
        Object object5 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object5 >= 0) {
            Object object6;
            long l7;
            l4 = this.zza(bl3);
            long l8 = l4 - (l7 = (long)-1);
            Object object7 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object7 != false) {
                object5 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (object5 < 0) {
                    object6 = this.zzb;
                    String string3 = bl3 ? this.zzf : this.zze;
                    object3 = l3;
                    ((zzfvf)object6).zzd(string3, object3);
                } else {
                    long l12 = l3 - (l4 += l2);
                    Object object8 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object8 >= 0) {
                        return this.zzc((String)object, (String)object2);
                    }
                }
            }
            if ((object6 = this.zze(bl3)) == null && !bl2) {
                return this.zzc((String)object, (String)object2);
            }
            long l14 = this.zza(bl3);
            object = new zzfvd((String)object6, l14);
            return object;
        }
        object = this.zzg;
        object = ((String)object).concat(": Invalid negative current timestamp. Updating PAID failed");
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final zzfvd zzc(String string2, String string3) {
        if (string2 == null) {
            string2 = UUID.randomUUID().toString();
            return this.zzd(string2, false);
        }
        String string4 = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", string4);
        string2 = this.zzh(string2, string3, string4);
        return this.zzd(string2, true);
    }

    public final zzfvd zzd(String string2, boolean bl2) {
        long l2;
        long l3 = System.currentTimeMillis();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            zzfvf zzfvf2 = this.zzb;
            String string3 = bl2 ? this.zzf : this.zze;
            Long l7 = l3;
            zzfvf2.zzd(string3, l7);
            zzfvf2 = this.zzb;
            Object object2 = bl2 ? this.zzd : this.zzc;
            zzfvf2.zzd((String)object2, string2);
            object2 = new zzfvd(string2, l3);
            return object2;
        }
        string2 = this.zzg;
        string2 = string2.concat(": Invalid negative current timestamp. Updating PAID failed");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final String zze(boolean bl2) {
        String string2 = bl2 ? this.zzd : this.zzc;
        return this.zzb.zzc(string2, null);
    }

    public final void zzf(boolean bl2) {
        Object object = bl2 ? this.zzf : this.zze;
        zzfvf zzfvf2 = this.zzb;
        zzfvf2.zze((String)object);
        object = this.zzb;
        String string2 = bl2 ? this.zzd : this.zzc;
        ((zzfvf)object).zze(string2);
    }

    public final boolean zzg(boolean bl2) {
        zzfvf zzfvf2 = this.zzb;
        String string2 = this.zzc;
        return zzfvf2.zzg(string2);
    }
}

