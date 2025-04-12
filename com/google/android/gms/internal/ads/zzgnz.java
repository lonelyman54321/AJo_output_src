/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgmb;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgmh;
import com.google.android.gms.internal.ads.zzgnv;
import com.google.android.gms.internal.ads.zzgnw;
import com.google.android.gms.internal.ads.zzgnx;
import com.google.android.gms.internal.ads.zzgny;
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
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzgxs;
import com.google.android.gms.internal.ads.zzgxt;
import com.google.android.gms.internal.ads.zzgxw;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzf;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhcd;
import java.security.GeneralSecurityException;

public final class zzgnz {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        Object object = new zzgnv();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzgmh.class, clazz);
        object = new zzgnw();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzgnx();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgmb.class, clazz);
        object = new zzgny();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgmb zza(zzgql object, zzgic object2) {
        Object object3;
        Object object4 = ((zzgql)object).zzg();
        boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        if (!bl2) {
            object = new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
            throw object;
        }
        try {
            object4 = ((zzgql)object).zze();
            object3 = zzhay.zza();
            object4 = zzgxt.zze((zzhac)object4, (zzhay)object3);
            int n3 = ((zzgxt)object4).zza();
            if (n3 == 0) {
                object3 = ((zzgql)object).zzc();
                object3 = zzgnz.zzf((zzgxn)object3);
                object4 = ((zzgxt)object4).zzf();
                object4 = ((zzhac)object4).zzB();
                object2 = zzgzf.zzb((byte[])object4, (zzgic)object2);
                object = ((zzgql)object).zzf();
                return zzgmb.zza((zzgmg)object3, (zzgzf)object2, (Integer)object);
            }
            object2 = "Only version 0 keys are accepted";
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        catch (zzhcd zzhcd2) {}
        object = new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        throw object;
    }

    public static /* synthetic */ zzgmh zzb(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean n3 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        if (n3) {
            block6: {
                try {
                    object3 = ((zzgqm)object).zzc();
                }
                catch (zzhcd zzhcd2) {
                    object3 = new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", zzhcd2);
                    throw object3;
                }
                object3 = ((zzgwm)object3).zzh();
                object2 = zzhay.zza();
                object3 = zzgxw.zze((zzhac)object3, (zzhay)object2);
                int n4 = ((zzgxw)object3).zza();
                if (n4 != 0) break block6;
                return zzgmh.zzc(zzgnz.zzf(((zzgqm)object).zzc().zzg()));
            }
            object = new GeneralSecurityException("Only version 0 parameters are accepted");
            throw object;
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static /* synthetic */ zzgql zzc(zzgmb object, zzgic object2) {
        Object object3 = zzgxt.zzc();
        object2 = ((zzgmb)object).zzd().zzd((zzgic)object2);
        int n3 = ((Object)object2).length;
        object2 = zzhac.zzv((byte[])object2, 0, n3);
        ((zzgxs)object3).zza((zzhac)object2);
        object2 = ((zzgxt)((zzhbi)object3).zzbn()).zzaN();
        object3 = zzgwg.zzb;
        zzgxn zzgxn2 = zzgnz.zzg(((zzgmb)object).zzb().zzb());
        object = ((zzgmb)object).zze();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", (zzhac)object2, (zzgwg)object3, zzgxn2, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzd(zzgmh object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzhac zzhac2 = zzgxw.zzd().zzaN();
        zzgwl2.zzc(zzhac2);
        object = zzgnz.zzg(((zzgmh)object).zzb());
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

    private static zzgmg zzf(zzgxn object) {
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
                    return zzgmg.zzc;
                }
            }
            return zzgmg.zzb;
        }
        return zzgmg.zza;
    }

    private static zzgxn zzg(zzgmg object) {
        Object object2 = zzgmg.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzgmg.zzb;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zze;
        }
        object2 = zzgmg.zzc;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzd;
        }
        object = ((zzgmg)object).toString();
        object = "Unable to serialize variant: ".concat((String)object);
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }
}

