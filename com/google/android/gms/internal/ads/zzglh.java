/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgla;
import com.google.android.gms.internal.ads.zzglb;
import com.google.android.gms.internal.ads.zzglc;
import com.google.android.gms.internal.ads.zzgld;
import com.google.android.gms.internal.ads.zzgle;
import com.google.android.gms.internal.ads.zzglf;
import com.google.android.gms.internal.ads.zzglg;
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
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwl;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgxb;
import com.google.android.gms.internal.ads.zzgxc;
import com.google.android.gms.internal.ads.zzgxe;
import com.google.android.gms.internal.ads.zzgxf;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhcd;
import java.security.GeneralSecurityException;

final class zzglh {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        Object object = new zzgld();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzglc.class, clazz);
        object = new zzgle();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzglf();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgla.class, clazz);
        object = new zzglg();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgla zza(zzgql object, zzgic object2) {
        zzhcd zzhcd22;
        block4: {
            Object object3;
            object2 = "KmsAeadKey are only accepted with version 0, got ";
            Object object4 = ((zzgql)object).zzg();
            boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.KmsAeadKey");
            if (!bl2) {
                object = new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                throw object;
            }
            try {
                object4 = ((zzgql)object).zze();
                object3 = zzhay.zza();
                object4 = zzgxc.zze((zzhac)object4, (zzhay)object3);
                int n3 = ((zzgxc)object4).zza();
                if (n3 == 0) {
                    object2 = ((zzgxc)object4).zzf();
                    object2 = ((zzgxf)object2).zzf();
                    object4 = ((zzgql)object).zzc();
                    object4 = zzglh.zzf((zzgxn)object4);
                    object2 = zzglc.zzc((String)object2, (zzglb)object4);
                    object = ((zzgql)object).zzf();
                    return zzgla.zza((zzglc)object2, (Integer)object);
                }
            }
            catch (zzhcd zzhcd22) {
                break block4;
            }
            object4 = String.valueOf(object4);
            object2 = ((String)object2).concat((String)object4);
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        object2 = new GeneralSecurityException("Parsing KmsAeadKey failed: ", zzhcd22);
        throw object2;
    }

    public static /* synthetic */ zzglc zzb(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean bl2 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.KmsAeadKey");
        if (bl2) {
            try {
                object3 = ((zzgqm)object).zzc();
            }
            catch (zzhcd zzhcd2) {
                object3 = new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", zzhcd2);
                throw object3;
            }
            object3 = ((zzgwm)object3).zzh();
            object2 = zzhay.zza();
            object3 = zzgxf.zze((zzhac)object3, (zzhay)object2).zzf();
            object = zzglh.zzf(((zzgqm)object).zzc().zzg());
            return zzglc.zzc((String)object3, (zzglb)object);
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static /* synthetic */ zzgql zzc(zzgla object, zzgic object2) {
        object2 = zzgxc.zzc();
        Object object3 = zzgxf.zza();
        Object object4 = ((zzgla)object).zzb().zzd();
        ((zzgxe)object3).zza((String)object4);
        object3 = (zzgxf)((zzhbi)object3).zzbn();
        ((zzgxb)object2).zza((zzgxf)object3);
        object2 = ((zzgxc)((zzhbi)object2).zzbn()).zzaN();
        object3 = zzgwg.zze;
        object4 = zzglh.zzg(((zzgla)object).zzb().zzb());
        object = ((zzgla)object).zzd();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", (zzhac)object2, (zzgwg)object3, (zzgxn)object4, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzd(zzglc object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        Object object2 = zzgxf.zza();
        String string2 = ((zzglc)object).zzd();
        ((zzgxe)object2).zza(string2);
        object2 = ((zzgxf)((zzhbi)object2).zzbn()).zzaN();
        zzgwl2.zzc((zzhac)object2);
        object = zzglh.zzg(((zzglc)object).zzb());
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

    private static zzglb zzf(zzgxn object) {
        int n3;
        Object object2 = zzgxn.zza;
        int n4 = ((Enum)object).ordinal();
        if (n4 != (n3 = 1)) {
            n3 = 3;
            if (n4 == n3) {
                return zzglb.zzb;
            }
            object = hj0_0.a(((zzgxn)object).zza(), "Unable to parse OutputPrefixType: ");
            object2 = new GeneralSecurityException((String)object);
            throw object2;
        }
        return zzglb.zza;
    }

    private static zzgxn zzg(zzglb object) {
        Object object2 = zzglb.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzglb.zzb;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzd;
        }
        object = ((zzglb)object).toString();
        object = "Unable to serialize variant: ".concat((String)object);
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }
}

