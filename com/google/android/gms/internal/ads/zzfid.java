/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzggz;
import com.google.android.gms.internal.ads.zzgha;
import com.google.android.gms.internal.ads.zzghb;
import com.google.android.gms.internal.ads.zzghl;
import com.google.android.gms.internal.ads.zzght;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgig;
import com.google.android.gms.internal.ads.zzgph;
import com.google.android.gms.internal.ads.zzgqp;
import com.google.android.gms.internal.ads.zzgzz;
import com.google.android.gms.internal.ads.zzhac;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public final class zzfid {
    public zzfid() {
        try {
            zzgig.zza();
            return;
        }
        catch (GeneralSecurityException generalSecurityException) {
            String string2 = ((Object)generalSecurityException).toString();
            zze.zza("Failed to Configure Aead. ".concat(string2));
            zzu.zzo().zzw(generalSecurityException, "CryptoUtils.registerAead");
            return;
        }
    }

    public static final String zza() {
        Object object;
        zzgzz zzgzz2;
        block8: {
            zzgzz2 = zzhac.zzt();
            object = "AES128_GCM";
            Object object2 = zzgph.zzb();
            object = ((zzgph)object2).zza((String)object);
            object = zzghl.zza((zzghx)object);
            object = zzght.zzb((zzghx)object);
            object2 = zzgha.zzb(zzgzz2);
            try {
                zzghb.zzb((zzght)object, (zzgha)object2);
                break block8;
            }
            catch (IOException iOException) {
            }
            catch (GeneralSecurityException generalSecurityException) {
                // empty catch block
            }
            Object object3 = object.toString();
            zze.zza("Failed to generate key".concat((String)object3));
            object2 = "CryptoUtils.generateKey";
            object3 = zzu.zzo();
            ((zzcby)object3).zzw((Throwable)object, (String)object2);
        }
        object = Base64.encodeToString((byte[])zzgzz2.zzb().zzB(), (int)11);
        zzgzz2.zzc();
        return object;
    }

    public static final String zzb(byte[] byArray, byte[] object, String object2, zzdux zzdux2) {
        String string2;
        if ((object2 = zzfid.zzc((String)object2)) == null) {
            return null;
        }
        Object object3 = zzggy.class;
        zzgqp zzgqp2 = zzgqp.zza();
        object2 = ((zzght)object2).zzd(zzgqp2, (Class)object3);
        object2 = (zzggy)object2;
        byArray = object2.zza(byArray, (byte[])object);
        object = zzdux2.zzb();
        object2 = "ds";
        object3 = "1";
        object.put(object2, object3);
        object2 = "UTF-8";
        try {
            object = new String(byArray, (String)object2);
            return object;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
        }
        catch (GeneralSecurityException generalSecurityException) {
            // empty catch block
        }
        object2 = string2.toString();
        zze.zza("Failed to decrypt ".concat((String)object2));
        zzu.zzo().zzw((Throwable)((Object)string2), "CryptoUtils.decrypt");
        object = zzdux2.zzb();
        string2 = string2.toString();
        object.put("dsf", string2);
        return null;
    }

    private static final zzght zzc(String object) {
        block5: {
            int n3 = 11;
            object = Base64.decode((String)object, (int)n3);
            object = zzggz.zzb((byte[])object);
            try {
                object = zzghb.zza((zzggz)object);
                break block5;
            }
            catch (IOException iOException) {
            }
            catch (GeneralSecurityException generalSecurityException) {
                // empty catch block
            }
            Object object2 = object.toString();
            zze.zza("Failed to get keysethandle".concat((String)object2));
            String string2 = "CryptoUtils.getHandle";
            object2 = zzu.zzo();
            ((zzcby)object2).zzw((Throwable)object, string2);
            object = null;
        }
        return object;
    }
}

