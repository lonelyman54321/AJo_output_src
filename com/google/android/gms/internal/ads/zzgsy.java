/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
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
import com.google.android.gms.internal.ads.zzgrc;
import com.google.android.gms.internal.ads.zzgre;
import com.google.android.gms.internal.ads.zzgrk;
import com.google.android.gms.internal.ads.zzgrl;
import com.google.android.gms.internal.ads.zzgrn;
import com.google.android.gms.internal.ads.zzgsu;
import com.google.android.gms.internal.ads.zzgsv;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgsx;
import com.google.android.gms.internal.ads.zzgtu;
import com.google.android.gms.internal.ads.zzgtv;
import com.google.android.gms.internal.ads.zzgtx;
import com.google.android.gms.internal.ads.zzgty;
import com.google.android.gms.internal.ads.zzgua;
import com.google.android.gms.internal.ads.zzgub;
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

public final class zzgsy {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        Object object = new zzgsu();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzgrn.class, clazz);
        object = new zzgsv();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzgsw();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgre.class, clazz);
        object = new zzgsx();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    public static /* synthetic */ zzgql zza(zzgre object, zzgic object2) {
        Object object3 = zzgtv.zzc();
        Object object4 = zzgsy.zzg(((zzgre)object).zzb());
        ((zzgtu)object3).zzb((zzgub)object4);
        object2 = ((zzgre)object).zzd().zzd((zzgic)object2);
        int n3 = ((Object)object2).length;
        object2 = zzhac.zzv((byte[])object2, 0, n3);
        ((zzgtu)object3).zza((zzhac)object2);
        object2 = ((zzgtv)((zzhbi)object3).zzbn()).zzaN();
        object3 = zzgwg.zzb;
        object4 = zzgsy.zzh(((zzgre)object).zzb().zzf());
        object = ((zzgre)object).zze();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", (zzhac)object2, (zzgwg)object3, (zzgxn)object4, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzb(zzgrn object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        Object object2 = zzgty.zzc();
        zzgub zzgub2 = zzgsy.zzg((zzgrn)object);
        ((zzgtx)object2).zzb(zzgub2);
        int n3 = ((zzgrn)object).zzc();
        ((zzgtx)object2).zza(n3);
        object2 = ((zzgty)((zzhbi)object2).zzbn()).zzaN();
        zzgwl2.zzc((zzhac)object2);
        object = zzgsy.zzh(((zzgrn)object).zzf());
        zzgwl2.zza((zzgxn)object);
        return zzgqm.zzb((zzgwm)zzgwl2.zzbn());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgre zzc(zzgql object, zzgic object2) {
        Object object3;
        Object object4 = ((zzgql)object).zzg();
        boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.AesCmacKey");
        if (!bl2) {
            object = new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
            throw object;
        }
        try {
            object4 = ((zzgql)object).zze();
            object3 = zzhay.zza();
            object4 = zzgtv.zze((zzhac)object4, (zzhay)object3);
            int n3 = ((zzgtv)object4).zza();
            if (n3 == 0) {
                object3 = zzgrn.zze();
                Object object5 = ((zzgtv)object4).zzg();
                int n4 = ((zzhac)object5).zzd();
                ((zzgrk)object3).zza(n4);
                object5 = ((zzgtv)object4).zzf();
                n4 = ((zzgub)object5).zza();
                ((zzgrk)object3).zzb(n4);
                object5 = ((zzgql)object).zzc();
                object5 = zzgsy.zzf((zzgxn)object5);
                ((zzgrk)object3).zzc((zzgrl)object5);
                object3 = ((zzgrk)object3).zzd();
                object5 = zzgre.zza();
                ((zzgrc)object5).zzc((zzgrn)object3);
                object4 = ((zzgtv)object4).zzg();
                object4 = ((zzhac)object4).zzB();
                object2 = zzgzf.zzb((byte[])object4, (zzgic)object2);
                ((zzgrc)object5).zza((zzgzf)object2);
                object = ((zzgql)object).zzf();
                ((zzgrc)object5).zzb((Integer)object);
                return ((zzgrc)object5).zzd();
            }
            object2 = "Only version 0 keys are accepted";
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        catch (zzhcd | IllegalArgumentException exception) {}
        object = new GeneralSecurityException("Parsing AesCmacKey failed");
        throw object;
    }

    public static /* synthetic */ zzgrn zzd(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean n3 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.AesCmacKey");
        if (n3) {
            try {
                object3 = ((zzgqm)object).zzc();
            }
            catch (zzhcd zzhcd2) {
                object3 = new GeneralSecurityException("Parsing AesCmacParameters failed: ", zzhcd2);
                throw object3;
            }
            object3 = ((zzgwm)object3).zzh();
            object2 = zzhay.zza();
            object3 = zzgty.zze((zzhac)object3, (zzhay)object2);
            object2 = zzgrn.zze();
            int n4 = ((zzgty)object3).zza();
            ((zzgrk)object2).zza(n4);
            int n7 = ((zzgty)object3).zzf().zza();
            ((zzgrk)object2).zzb(n7);
            object = zzgsy.zzf(((zzgqm)object).zzc().zzg());
            ((zzgrk)object2).zzc((zzgrl)object);
            return ((zzgrk)object2).zzd();
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
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

    private static zzgrl zzf(zzgxn object) {
        int n3;
        Object object2 = zzgxn.zza;
        int n4 = ((Enum)object).ordinal();
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 == n3) {
                        return zzgrl.zzb;
                    }
                    object = hj0_0.a(((zzgxn)object).zza(), "Unable to parse OutputPrefixType: ");
                    object2 = new GeneralSecurityException((String)object);
                    throw object2;
                }
                return zzgrl.zzd;
            }
            return zzgrl.zzc;
        }
        return zzgrl.zza;
    }

    private static zzgub zzg(zzgrn zzgrn2) {
        zzgua zzgua2 = zzgub.zzc();
        int n3 = zzgrn2.zzb();
        zzgua2.zza(n3);
        return (zzgub)zzgua2.zzbn();
    }

    private static zzgxn zzh(zzgrl object) {
        Object object2 = zzgrl.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzgrl.zzb;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zze;
        }
        object2 = zzgrl.zzd;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzd;
        }
        object2 = zzgrl.zzc;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzc;
        }
        object = String.valueOf(object);
        object = "Unable to serialize variant: ".concat((String)object);
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }
}

