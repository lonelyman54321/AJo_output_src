/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgie;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgql;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwl;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbi;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzgkw
implements zzggy {
    public static final /* synthetic */ int zza;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzghx zze;
    private final zzggy zzf;

    static {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    public zzgkw(zzgwm object, zzggy object2) {
        Object object3 = ((zzgwm)object).zzi();
        Set set = zzc;
        boolean bl2 = set.contains(object3);
        if (bl2) {
            object3 = ((zzgwm)object).zzi();
            this.zzd = object3;
            object = zzgwm.zzc((zzgwm)object);
            object3 = zzgxn.zzd;
            ((zzgwl)object).zza((zzgxn)object3);
            this.zze = object = zzgie.zza(((zzgwm)((zzhbi)object).zzbn()).zzaV());
            this.zzf = object2;
            return;
        }
        object = ((zzgwm)object).zzi();
        object = cP.a("Unsupported DEK key type: ", (String)object, ". Only Tink AEAD key types are supported.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zza(byte[] object, byte[] object2) {
        void var1_5;
        String string2;
        block5: {
            string2 = "invalid ciphertext";
            try {
                int n3;
                Object object3 = ByteBuffer.wrap((byte[])object);
                int n4 = ((ByteBuffer)object3).getInt();
                if (n4 > 0 && n4 <= (n3 = ((byte[])object).length + -4)) {
                    object = new byte[n4];
                    Class<zzggy> clazz = null;
                    ((ByteBuffer)object3).get((byte[])object, 0, n4);
                    n4 = ((Buffer)object3).remaining();
                    byte[] byArray = new byte[n4];
                    int n7 = ((Buffer)object3).remaining();
                    ((ByteBuffer)object3).get(byArray, 0, n7);
                    object3 = this.zzf;
                    Object object4 = zzb;
                    object = object3.zza((byte[])object, (byte[])object4);
                    object3 = this.zzd;
                    object4 = zzhac.zzb;
                    n7 = ((byte[])object).length;
                    object = zzhac.zzv((byte[])object, 0, n7);
                    clazz = zzgwg.zzb;
                    object4 = zzgxn.zzd;
                    object = zzgql.zza((String)object3, (zzhac)object, (zzgwg)((Object)clazz), (zzgxn)object4, null);
                    object3 = zzgpl.zzc();
                    clazz = zzghh.zza();
                    object = ((zzgpl)object3).zza((zzgqq)object, (zzgic)((Object)clazz));
                    object3 = zzgpi.zza();
                    clazz = zzggy.class;
                    object = ((zzgpi)object3).zzc((zzghi)object, clazz);
                    object = (zzggy)object;
                    return object.zza(byArray, (byte[])object2);
                }
            }
            catch (NegativeArraySizeException negativeArraySizeException) {
                break block5;
            }
            catch (BufferUnderflowException bufferUnderflowException) {
                break block5;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                break block5;
            }
            object = new GeneralSecurityException;
            ((GeneralSecurityException)object)(string2);
            throw object;
        }
        object2 = new GeneralSecurityException;
        object2(string2, (Throwable)var1_5);
        throw object2;
    }
}

