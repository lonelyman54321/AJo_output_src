/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgkn;
import com.google.android.gms.internal.ads.zzgkr;
import com.google.android.gms.internal.ads.zzgks;
import com.google.android.gms.internal.ads.zzgne;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgng;
import com.google.android.gms.internal.ads.zzgnh;
import com.google.android.gms.internal.ads.zzgol;
import com.google.android.gms.internal.ads.zzgon;
import com.google.android.gms.internal.ads.zzgop;
import com.google.android.gms.internal.ads.zzgor;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgpo;
import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgps;
import com.google.android.gms.internal.ads.zzgpu;
import com.google.android.gms.internal.ads.zzgql;
import com.google.android.gms.internal.ads.zzgqm;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgvn;
import com.google.android.gms.internal.ads.zzgvo;
import com.google.android.gms.internal.ads.zzgvr;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwl;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzf;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhcd;
import java.security.GeneralSecurityException;

public final class zzgni {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        Object object = new zzgne();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzgks.class, clazz);
        object = new zzgnf();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzgng();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgkn.class, clazz);
        object = new zzgnh();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgkn zza(zzgql object, zzgic object2) {
        Object object3;
        Object object4 = ((zzgql)object).zzg();
        boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        if (!bl2) {
            object = new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
            throw object;
        }
        try {
            object4 = ((zzgql)object).zze();
            object3 = zzhay.zza();
            object4 = zzgvo.zze((zzhac)object4, (zzhay)object3);
            int n3 = ((zzgvo)object4).zza();
            if (n3 == 0) {
                object3 = ((zzgql)object).zzc();
                object3 = zzgni.zzf((zzgxn)object3);
                object4 = ((zzgvo)object4).zzf();
                object4 = ((zzhac)object4).zzB();
                object2 = zzgzf.zzb((byte[])object4, (zzgic)object2);
                object = ((zzgql)object).zzf();
                return zzgkn.zza((zzgkr)object3, (zzgzf)object2, (Integer)object);
            }
            object2 = "Only version 0 keys are accepted";
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        catch (zzhcd zzhcd2) {}
        object = new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        throw object;
    }

    public static /* synthetic */ zzgks zzb(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean bl2 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        if (bl2) {
            try {
                object3 = ((zzgqm)object).zzc();
            }
            catch (zzhcd zzhcd2) {
                object3 = new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", zzhcd2);
                throw object3;
            }
            object3 = ((zzgwm)object3).zzh();
            object2 = zzhay.zza();
            zzgvr.zzd((zzhac)object3, (zzhay)object2);
            return zzgks.zzc(zzgni.zzf(((zzgqm)object).zzc().zzg()));
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static /* synthetic */ zzgql zzc(zzgkn object, zzgic object2) {
        Object object3 = zzgvo.zzc();
        object2 = ((zzgkn)object).zzd().zzd((zzgic)object2);
        int n3 = ((Object)object2).length;
        object2 = zzhac.zzv((byte[])object2, 0, n3);
        ((zzgvn)object3).zza((zzhac)object2);
        object2 = ((zzgvo)((zzhbi)object3).zzbn()).zzaN();
        object3 = zzgwg.zzb;
        zzgxn zzgxn2 = zzgni.zzg(((zzgkn)object).zzb().zzb());
        object = ((zzgkn)object).zze();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", (zzhac)object2, (zzgwg)object3, zzgxn2, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzd(zzgks object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzhac zzhac2 = zzgvr.zzc().zzaN();
        zzgwl2.zzc(zzhac2);
        object = zzgni.zzg(((zzgks)object).zzb());
        zzgwl2.zza((zzgxn)object);
        return zzgqm.zzb((zzgwm)zzgwl2.zzbn());
    }

    public static void zze(zzgpl zzgpl2) {
        Object object = zzc;
        zzgpl2.zzi((zzgpu)object);
        object = zzd;
        zzgpl2.zzh((zzgpq)object);
        object = zze;
        zzgpl2.zzg((zzgor)object);
        object = zzf;
        zzgpl2.zzf((zzgon)object);
    }

    private static zzgkr zzf(zzgxn object) {
        int n3;
        Object object2 = zzgxn.zza;
        int n4 = ((Enum)object).ordinal();
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 != n3) {
                        object = hj0_0.a(((zzgxn)object).zza(), "Unable to parse OutputPrefixType: ");
                        object2 = new GeneralSecurityException((String)object);
                        throw object2;
                    }
                } else {
                    return zzgkr.zzc;
                }
            }
            return zzgkr.zzb;
        }
        return zzgkr.zza;
    }

    private static zzgxn zzg(zzgkr object) {
        Object object2 = zzgkr.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzgkr.zzb;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zze;
        }
        object2 = zzgkr.zzc;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzd;
        }
        object = ((zzgkr)object).toString();
        object = "Unable to serialize variant: ".concat((String)object);
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }
}

