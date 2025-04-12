/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgjo;
import com.google.android.gms.internal.ads.zzgjq;
import com.google.android.gms.internal.ads.zzgjw;
import com.google.android.gms.internal.ads.zzgjx;
import com.google.android.gms.internal.ads.zzgjz;
import com.google.android.gms.internal.ads.zzgms;
import com.google.android.gms.internal.ads.zzgmt;
import com.google.android.gms.internal.ads.zzgmu;
import com.google.android.gms.internal.ads.zzgmv;
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
import com.google.android.gms.internal.ads.zzgvb;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzgve;
import com.google.android.gms.internal.ads.zzgvf;
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

public final class zzgmw {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        Object object = new zzgms();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzgjz.class, clazz);
        object = new zzgmt();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzgmu();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgjq.class, clazz);
        object = new zzgmv();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgjq zza(zzgql object, zzgic object2) {
        Object object3;
        Object object4 = ((zzgql)object).zzg();
        boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.AesGcmKey");
        if (!bl2) {
            object = new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
            throw object;
        }
        try {
            object4 = ((zzgql)object).zze();
            object3 = zzhay.zza();
            object4 = zzgvc.zze((zzhac)object4, (zzhay)object3);
            int n3 = ((zzgvc)object4).zza();
            if (n3 == 0) {
                object3 = zzgjz.zzc();
                Object object5 = ((zzgvc)object4).zzf();
                int n4 = ((zzhac)object5).zzd();
                ((zzgjw)object3).zzb(n4);
                n4 = 12;
                ((zzgjw)object3).zza(n4);
                n4 = 16;
                ((zzgjw)object3).zzc(n4);
                object5 = ((zzgql)object).zzc();
                object5 = zzgmw.zzf((zzgxn)object5);
                ((zzgjw)object3).zzd((zzgjx)object5);
                object3 = ((zzgjw)object3).zze();
                object5 = zzgjq.zza();
                ((zzgjo)object5).zzc((zzgjz)object3);
                object4 = ((zzgvc)object4).zzf();
                object4 = ((zzhac)object4).zzB();
                object2 = zzgzf.zzb((byte[])object4, (zzgic)object2);
                ((zzgjo)object5).zzb((zzgzf)object2);
                object = ((zzgql)object).zzf();
                ((zzgjo)object5).zza((Integer)object);
                return ((zzgjo)object5).zzd();
            }
            object2 = "Only version 0 keys are accepted";
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        catch (zzhcd zzhcd2) {}
        object = new GeneralSecurityException("Parsing AesGcmKey failed");
        throw object;
    }

    public static /* synthetic */ zzgjz zzb(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean n3 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.AesGcmKey");
        if (n3) {
            block6: {
                try {
                    object3 = ((zzgqm)object).zzc();
                }
                catch (zzhcd zzhcd2) {
                    object3 = new GeneralSecurityException("Parsing AesGcmParameters failed: ", zzhcd2);
                    throw object3;
                }
                object3 = ((zzgwm)object3).zzh();
                object2 = zzhay.zza();
                object3 = zzgvf.zzf((zzhac)object3, (zzhay)object2);
                int n4 = ((zzgvf)object3).zzc();
                if (n4 != 0) break block6;
                object2 = zzgjz.zzc();
                int n7 = ((zzgvf)object3).zza();
                ((zzgjw)object2).zzb(n7);
                ((zzgjw)object2).zza(12);
                ((zzgjw)object2).zzc(16);
                object = zzgmw.zzf(((zzgqm)object).zzc().zzg());
                ((zzgjw)object2).zzd((zzgjx)object);
                return ((zzgjw)object2).zze();
            }
            object = new GeneralSecurityException("Only version 0 parameters are accepted");
            throw object;
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static /* synthetic */ zzgql zzc(zzgjq object, zzgic object2) {
        Object object3 = zzgvc.zzc();
        object2 = ((zzgjq)object).zzd().zzd((zzgic)object2);
        int n3 = ((Object)object2).length;
        object2 = zzhac.zzv((byte[])object2, 0, n3);
        ((zzgvb)object3).zza((zzhac)object2);
        object2 = ((zzgvc)((zzhbi)object3).zzbn()).zzaN();
        object3 = zzgwg.zzb;
        zzgxn zzgxn2 = zzgmw.zzg(((zzgjq)object).zzb().zzd());
        object = ((zzgjq)object).zze();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", (zzhac)object2, (zzgwg)object3, zzgxn2, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzd(zzgjz object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        Object object2 = zzgvf.zzd();
        int n3 = ((zzgjz)object).zzb();
        ((zzgve)object2).zza(n3);
        object2 = ((zzgvf)((zzhbi)object2).zzbn()).zzaN();
        zzgwl2.zzc((zzhac)object2);
        object = zzgmw.zzg(((zzgjz)object).zzd());
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

    private static zzgjx zzf(zzgxn object) {
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
                    return zzgjx.zzc;
                }
            }
            return zzgjx.zzb;
        }
        return zzgjx.zza;
    }

    private static zzgxn zzg(zzgjx object) {
        Object object2 = zzgjx.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzgjx.zzb;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zze;
        }
        object2 = zzgjx.zzc;
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

