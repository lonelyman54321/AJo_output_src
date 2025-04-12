/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzghd;
import com.google.android.gms.internal.ads.zzgik;
import com.google.android.gms.internal.ads.zzgoy;
import com.google.android.gms.internal.ads.zzgpg;
import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqk;
import com.google.android.gms.internal.ads.zzgtl;
import com.google.android.gms.internal.ads.zzgtr;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

final class zzgil
implements zzggy {
    private final zzgqk zza;
    private final zzgtl zzb;
    private final zzgtl zzc;

    /*
     * Enabled aggressive block sorting
     */
    public /* synthetic */ zzgil(zzgqk object, zzgik object2) {
        this.zza = object;
        boolean bl2 = ((zzgqk)object).zzg();
        if (bl2) {
            object2 = zzgpg.zza().zzb();
            object = zzgoy.zza((zzgqk)object);
            String string2 = "aead";
            Object object3 = object2.zza((zzgtr)object, string2, "encrypt");
            this.zzb = object3;
            object3 = "decrypt";
            object = object2.zza((zzgtr)object, string2, (String)object3);
        } else {
            this.zzb = object = zzgoy.zza;
        }
        this.zzc = object;
    }

    public final byte[] zza(byte[] object, byte[] byArray) {
        Object object2;
        Object object3;
        Iterator iterator;
        int n3 = ((byte[])object).length;
        int n4 = 5;
        if (n3 > n4) {
            iterator = (Iterator)Arrays.copyOf(object, n4);
            object3 = this.zza;
            iterator = ((zzgqk)object3).zzf((byte[])iterator).iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object3 = (zzgqi)iterator.next();
                try {
                    object2 = ((zzgqi)object3).zze();
                }
                catch (GeneralSecurityException generalSecurityException) {
                    continue;
                }
                object2 = (zzggy)object2;
                object2 = object2.zza((byte[])object, byArray);
                ((zzgqi)object3).zza();
                return object2;
            }
        }
        iterator = this.zza;
        object3 = zzghd.zza;
        iterator = ((zzgqk)((Object)iterator)).zzf((byte[])object3).iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object3 = (zzgqi)iterator.next();
            try {
                object2 = ((zzgqi)object3).zze();
            }
            catch (GeneralSecurityException generalSecurityException) {
                continue;
            }
            object2 = (zzggy)object2;
            object2 = object2.zza((byte[])object, byArray);
            ((zzgqi)object3).zza();
            return object2;
        }
        object = new GeneralSecurityException;
        object("decryption failed");
        throw object;
    }
}

