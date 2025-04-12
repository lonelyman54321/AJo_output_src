/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgja;
import com.google.android.gms.internal.ads.zzgjm;
import com.google.android.gms.internal.ads.zzgjz;
import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgks;
import com.google.android.gms.internal.ads.zzglj;
import com.google.android.gms.internal.ads.zzgll;
import com.google.android.gms.internal.ads.zzglm;
import com.google.android.gms.internal.ads.zzglo;
import com.google.android.gms.internal.ads.zzgmh;
import java.security.GeneralSecurityException;

public final class zzglk {
    private zzglm zza;
    private String zzb;
    private zzgll zzc;
    private zzgii zzd;

    private zzglk() {
        throw null;
    }

    public /* synthetic */ zzglk(zzglj zzglj2) {
    }

    public final zzglk zza(zzgii zzgii2) {
        this.zzd = zzgii2;
        return this;
    }

    public final zzglk zzb(zzgll zzgll2) {
        this.zzc = zzgll2;
        return this;
    }

    public final zzglk zzc(String string2) {
        this.zzb = string2;
        return this;
    }

    public final zzglk zzd(zzglm zzglm2) {
        this.zza = zzglm2;
        return this;
    }

    public final zzglo zze() {
        Object object = this.zza;
        if (object == null) {
            this.zza = object = zzglm.zzb;
        }
        if ((object = this.zzb) != null) {
            object = this.zzc;
            if (object != null) {
                Object object2 = this.zzd;
                if (object2 != null) {
                    boolean bl2 = ((zzghx)object2).zza();
                    if (!bl2) {
                        boolean bl3;
                        Object object3 = zzgll.zza;
                        bl2 = object.equals(object3);
                        if (bl2 && (bl2 = object2 instanceof zzgjz) || (bl2 = object.equals(object3 = zzgll.zzc)) && (bl2 = object2 instanceof zzgks) || (bl2 = object.equals(object3 = zzgll.zzb)) && (bl2 = object2 instanceof zzgmh) || (bl2 = object.equals(object3 = zzgll.zzd)) && (bl2 = object2 instanceof zzgja) || (bl2 = object.equals(object3 = zzgll.zze)) && (bl2 = object2 instanceof zzgjm) || (bl3 = object.equals(object3 = zzgll.zzf)) && (bl3 = object2 instanceof zzgkm)) {
                            object3 = this.zza;
                            String string2 = this.zzb;
                            zzgll zzgll2 = this.zzc;
                            zzgii zzgii2 = this.zzd;
                            object2 = object;
                            object = new zzglo((zzglm)object3, string2, zzgll2, zzgii2, null);
                            return object;
                        }
                        object2 = this.zzc.toString();
                        object3 = String.valueOf(this.zzd);
                        object2 = uc0_0.a("Cannot use parsing strategy ", (String)object2, " when new keys are picked according to ", (String)object3, ".");
                        object = new GeneralSecurityException((String)object2);
                        throw object;
                    }
                    object = new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                    throw object;
                }
                object = new GeneralSecurityException("dekParametersForNewKeys must be set");
                throw object;
            }
            object = new GeneralSecurityException("dekParsingStrategy must be set");
            throw object;
        }
        object = new GeneralSecurityException("kekUri must be set");
        throw object;
    }
}

