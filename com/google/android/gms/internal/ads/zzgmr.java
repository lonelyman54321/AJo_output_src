/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgjc;
import com.google.android.gms.internal.ads.zzgje;
import com.google.android.gms.internal.ads.zzgjj;
import com.google.android.gms.internal.ads.zzgjk;
import com.google.android.gms.internal.ads.zzgjm;
import com.google.android.gms.internal.ads.zzgmn;
import com.google.android.gms.internal.ads.zzgmo;
import com.google.android.gms.internal.ads.zzgmp;
import com.google.android.gms.internal.ads.zzgmq;
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
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgut;
import com.google.android.gms.internal.ads.zzguv;
import com.google.android.gms.internal.ads.zzguw;
import com.google.android.gms.internal.ads.zzguy;
import com.google.android.gms.internal.ads.zzguz;
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

public final class zzgmr {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        Object object = new zzgmn();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzgjm.class, clazz);
        object = new zzgmo();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzgmp();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgje.class, clazz);
        object = new zzgmq();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgje zza(zzgql object, zzgic object2) {
        Object object3;
        Object object4 = ((zzgql)object).zzg();
        boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.AesEaxKey");
        if (!bl2) {
            object = new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
            throw object;
        }
        try {
            object4 = ((zzgql)object).zze();
            object3 = zzhay.zza();
            object4 = zzgut.zze((zzhac)object4, (zzhay)object3);
            int n3 = ((zzgut)object4).zza();
            if (n3 == 0) {
                object3 = zzgjm.zzd();
                Object object5 = ((zzgut)object4).zzg();
                int n4 = ((zzhac)object5).zzd();
                ((zzgjj)object3).zzb(n4);
                object5 = ((zzgut)object4).zzf();
                n4 = ((zzguz)object5).zza();
                ((zzgjj)object3).zza(n4);
                n4 = 16;
                ((zzgjj)object3).zzc(n4);
                object5 = ((zzgql)object).zzc();
                object5 = zzgmr.zzf((zzgxn)object5);
                ((zzgjj)object3).zzd((zzgjk)object5);
                object3 = ((zzgjj)object3).zze();
                object5 = zzgje.zza();
                ((zzgjc)object5).zzc((zzgjm)object3);
                object4 = ((zzgut)object4).zzg();
                object4 = ((zzhac)object4).zzB();
                object2 = zzgzf.zzb((byte[])object4, (zzgic)object2);
                ((zzgjc)object5).zzb((zzgzf)object2);
                object = ((zzgql)object).zzf();
                ((zzgjc)object5).zza((Integer)object);
                return ((zzgjc)object5).zzd();
            }
            object2 = "Only version 0 keys are accepted";
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        catch (zzhcd zzhcd2) {}
        object = new GeneralSecurityException("Parsing AesEaxcKey failed");
        throw object;
    }

    public static /* synthetic */ zzgjm zzb(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean n3 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.AesEaxKey");
        if (n3) {
            try {
                object3 = ((zzgqm)object).zzc();
            }
            catch (zzhcd zzhcd2) {
                object3 = new GeneralSecurityException("Parsing AesEaxParameters failed: ", zzhcd2);
                throw object3;
            }
            object3 = ((zzgwm)object3).zzh();
            object2 = zzhay.zza();
            object3 = zzguw.zze((zzhac)object3, (zzhay)object2);
            object2 = zzgjm.zzd();
            int n4 = ((zzguw)object3).zza();
            ((zzgjj)object2).zzb(n4);
            int n7 = ((zzguw)object3).zzf().zza();
            ((zzgjj)object2).zza(n7);
            ((zzgjj)object2).zzc(16);
            object = zzgmr.zzf(((zzgqm)object).zzc().zzg());
            ((zzgjj)object2).zzd((zzgjk)object);
            return ((zzgjj)object2).zze();
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static /* synthetic */ zzgql zzc(zzgje object, zzgic object2) {
        Object object3 = zzgut.zzc();
        Object object4 = zzgmr.zzg(((zzgje)object).zzb());
        ((zzgus)object3).zzb((zzguz)object4);
        object2 = ((zzgje)object).zzd().zzd((zzgic)object2);
        int n3 = ((Object)object2).length;
        object2 = zzhac.zzv((byte[])object2, 0, n3);
        ((zzgus)object3).zza((zzhac)object2);
        object2 = ((zzgut)((zzhbi)object3).zzbn()).zzaN();
        object3 = zzgwg.zzb;
        object4 = zzgmr.zzh(((zzgje)object).zzb().zze());
        object = ((zzgje)object).zze();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", (zzhac)object2, (zzgwg)object3, (zzgxn)object4, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzd(zzgjm object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        Object object2 = zzguw.zzc();
        zzguz zzguz2 = zzgmr.zzg((zzgjm)object);
        ((zzguv)object2).zzb(zzguz2);
        int n3 = ((zzgjm)object).zzc();
        ((zzguv)object2).zza(n3);
        object2 = ((zzguw)((zzhbi)object2).zzbn()).zzaN();
        zzgwl2.zzc((zzhac)object2);
        object = zzgmr.zzh(((zzgjm)object).zze());
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

    private static zzgjk zzf(zzgxn object) {
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
                    return zzgjk.zzc;
                }
            }
            return zzgjk.zzb;
        }
        return zzgjk.zza;
    }

    private static zzguz zzg(zzgjm zzgjm2) {
        zzguy zzguy2 = zzguz.zzc();
        int n3 = zzgjm2.zzb();
        zzguy2.zza(n3);
        return (zzguz)zzguy2.zzbn();
    }

    private static zzgxn zzh(zzgjk object) {
        Object object2 = zzgjk.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzgjk.zzb;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zze;
        }
        object2 = zzgjk.zzc;
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

