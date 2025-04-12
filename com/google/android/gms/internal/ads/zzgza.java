/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgoc;
import com.google.android.gms.internal.ads.zzgts;
import com.google.android.gms.internal.ads.zzgyz;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class zzgza
implements zzgts {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /*
     * Enabled aggressive block sorting
     */
    public zzgza(String object, Key object2) {
        int n3;
        zzgyz zzgyz2;
        block14: {
            block16: {
                block17: {
                    int n4;
                    int n7;
                    int n8;
                    int n10;
                    int n14;
                    block15: {
                        zzgyz2 = new zzgyz(this);
                        this.zza = zzgyz2;
                        n14 = 2;
                        n10 = zzgoc.zza(n14);
                        if (n10 == 0) {
                            object = new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                            throw object;
                        }
                        this.zzb = object;
                        this.zzc = object2;
                        n8 = ((Object)(object2 = (Object)object2.getEncoded())).length;
                        if (n8 < (n10 = 16)) {
                            object = new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
                            throw object;
                        }
                        n8 = ((String)object).hashCode();
                        n10 = 1;
                        n7 = 3;
                        n4 = 4;
                        switch (n8) {
                            default: {
                                break;
                            }
                            case 392317873: {
                                object2 = "HMACSHA512";
                                n8 = (int)(((String)object).equals(object2) ? 1 : 0);
                                if (n8 == 0) break;
                                n8 = 4;
                                break block15;
                            }
                            case 392316170: {
                                object2 = "HMACSHA384";
                                n8 = (int)(((String)object).equals(object2) ? 1 : 0);
                                if (n8 == 0) break;
                                n8 = 3;
                                break block15;
                            }
                            case 392315118: {
                                object2 = "HMACSHA256";
                                n8 = (int)(((String)object).equals(object2) ? 1 : 0);
                                if (n8 == 0) break;
                                n8 = 2;
                                break block15;
                            }
                            case 392315023: {
                                object2 = "HMACSHA224";
                                n8 = (int)(((String)object).equals(object2) ? 1 : 0);
                                if (n8 == 0) break;
                                n8 = 1;
                                break block15;
                            }
                            case -1823053428: {
                                object2 = "HMACSHA1";
                                n8 = (int)(((String)object).equals(object2) ? 1 : 0);
                                if (n8 == 0) break;
                                n8 = 0;
                                object2 = null;
                                break block15;
                            }
                        }
                        n8 = -1;
                    }
                    if (n8 == 0) break block16;
                    if (n8 == n10) break block17;
                    if (n8 != n14) {
                        if (n8 != n7) {
                            if (n8 != n4) {
                                object = "unknown Hmac algorithm: ".concat((String)object);
                                object2 = new NoSuchAlgorithmException((String)object);
                                throw object2;
                            }
                            n3 = 64;
                            break block14;
                        } else {
                            n3 = 48;
                        }
                        break block14;
                    } else {
                        n3 = 32;
                    }
                    break block14;
                }
                n3 = 28;
                break block14;
            }
            n3 = 20;
        }
        this.zzd = n3;
        zzgyz2.get();
    }

    public static /* bridge */ /* synthetic */ String zzb(zzgza zzgza2) {
        return zzgza2.zzb;
    }

    public static /* bridge */ /* synthetic */ Key zzc(zzgza zzgza2) {
        return zzgza2.zzc;
    }

    public final byte[] zza(byte[] object, int n3) {
        int n4 = this.zzd;
        if (n3 <= n4) {
            ((Mac)this.zza.get()).update((byte[])object);
            return Arrays.copyOf(((Mac)this.zza.get()).doFinal(), n3);
        }
        object = new InvalidAlgorithmParameterException;
        object("tag size too big");
        throw object;
    }
}

