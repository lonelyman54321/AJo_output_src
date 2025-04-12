/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgkb;
import com.google.android.gms.internal.ads.zzgkd;
import com.google.android.gms.internal.ads.zzgkj;
import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgmx;
import com.google.android.gms.internal.ads.zzgmy;
import com.google.android.gms.internal.ads.zzgmz;
import com.google.android.gms.internal.ads.zzgna;
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
import com.google.android.gms.internal.ads.zzgvh;
import com.google.android.gms.internal.ads.zzgvi;
import com.google.android.gms.internal.ads.zzgvk;
import com.google.android.gms.internal.ads.zzgvl;
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

public final class zzgnb {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        Object object = new zzgmx();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzgkm.class, clazz);
        object = new zzgmy();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzgmz();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgkd.class, clazz);
        object = new zzgna();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgkd zza(zzgql object, zzgic object2) {
        Object object3;
        Object object4 = ((zzgql)object).zzg();
        boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        if (!bl2) {
            object = new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
            throw object;
        }
        try {
            object4 = ((zzgql)object).zze();
            object3 = zzhay.zza();
            object4 = zzgvi.zze((zzhac)object4, (zzhay)object3);
            int n3 = ((zzgvi)object4).zza();
            if (n3 == 0) {
                object3 = zzgkm.zzc();
                Object object5 = ((zzgvi)object4).zzf();
                int n4 = ((zzhac)object5).zzd();
                ((zzgkj)object3).zza(n4);
                object5 = ((zzgql)object).zzc();
                object5 = zzgnb.zzf((zzgxn)object5);
                ((zzgkj)object3).zzb((zzgkk)object5);
                object3 = ((zzgkj)object3).zzc();
                object5 = zzgkd.zza();
                ((zzgkb)object5).zzc((zzgkm)object3);
                object4 = ((zzgvi)object4).zzf();
                object4 = ((zzhac)object4).zzB();
                object2 = zzgzf.zzb((byte[])object4, (zzgic)object2);
                ((zzgkb)object5).zzb((zzgzf)object2);
                object = ((zzgql)object).zzf();
                ((zzgkb)object5).zza((Integer)object);
                return ((zzgkb)object5).zzd();
            }
            object2 = "Only version 0 keys are accepted";
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        catch (zzhcd zzhcd2) {}
        object = new GeneralSecurityException("Parsing AesGcmSivKey failed");
        throw object;
    }

    public static /* synthetic */ zzgkm zzb(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean n3 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        if (n3) {
            block6: {
                try {
                    object3 = ((zzgqm)object).zzc();
                }
                catch (zzhcd zzhcd2) {
                    object3 = new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", zzhcd2);
                    throw object3;
                }
                object3 = ((zzgwm)object3).zzh();
                object2 = zzhay.zza();
                object3 = zzgvl.zzf((zzhac)object3, (zzhay)object2);
                int n4 = ((zzgvl)object3).zzc();
                if (n4 != 0) break block6;
                object2 = zzgkm.zzc();
                int n7 = ((zzgvl)object3).zza();
                ((zzgkj)object2).zza(n7);
                object = zzgnb.zzf(((zzgqm)object).zzc().zzg());
                ((zzgkj)object2).zzb((zzgkk)object);
                return ((zzgkj)object2).zzc();
            }
            object = new GeneralSecurityException("Only version 0 parameters are accepted");
            throw object;
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static /* synthetic */ zzgql zzc(zzgkd object, zzgic object2) {
        Object object3 = zzgvi.zzc();
        object2 = ((zzgkd)object).zzd().zzd((zzgic)object2);
        int n3 = ((Object)object2).length;
        object2 = zzhac.zzv((byte[])object2, 0, n3);
        ((zzgvh)object3).zza((zzhac)object2);
        object2 = ((zzgvi)((zzhbi)object3).zzbn()).zzaN();
        object3 = zzgwg.zzb;
        zzgxn zzgxn2 = zzgnb.zzg(((zzgkd)object).zzb().zzd());
        object = ((zzgkd)object).zze();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", (zzhac)object2, (zzgwg)object3, zzgxn2, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzd(zzgkm object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        Object object2 = zzgvl.zzd();
        int n3 = ((zzgkm)object).zzb();
        ((zzgvk)object2).zza(n3);
        object2 = ((zzgvl)((zzhbi)object2).zzbn()).zzaN();
        zzgwl2.zzc((zzhac)object2);
        object = zzgnb.zzg(((zzgkm)object).zzd());
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

    private static zzgkk zzf(zzgxn object) {
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
                    return zzgkk.zzc;
                }
            }
            return zzgkk.zzb;
        }
        return zzgkk.zza;
    }

    private static zzgxn zzg(zzgkk object) {
        Object object2 = zzgkk.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzgkk.zzb;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zze;
        }
        object2 = zzgkk.zzc;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzd;
        }
        object = String.valueOf(object);
        object = "Unable to serialize variant: ".concat((String)object);
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }
}

