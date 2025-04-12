/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgio;
import com.google.android.gms.internal.ads.zzgiq;
import com.google.android.gms.internal.ads.zzgiw;
import com.google.android.gms.internal.ads.zzgix;
import com.google.android.gms.internal.ads.zzgiy;
import com.google.android.gms.internal.ads.zzgja;
import com.google.android.gms.internal.ads.zzgmi;
import com.google.android.gms.internal.ads.zzgmj;
import com.google.android.gms.internal.ads.zzgmk;
import com.google.android.gms.internal.ads.zzgml;
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
import com.google.android.gms.internal.ads.zzgud;
import com.google.android.gms.internal.ads.zzgue;
import com.google.android.gms.internal.ads.zzgug;
import com.google.android.gms.internal.ads.zzguh;
import com.google.android.gms.internal.ads.zzguj;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgum;
import com.google.android.gms.internal.ads.zzgun;
import com.google.android.gms.internal.ads.zzgup;
import com.google.android.gms.internal.ads.zzguq;
import com.google.android.gms.internal.ads.zzgvt;
import com.google.android.gms.internal.ads.zzgvv;
import com.google.android.gms.internal.ads.zzgvw;
import com.google.android.gms.internal.ads.zzgvy;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgwb;
import com.google.android.gms.internal.ads.zzgwc;
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
import com.google.android.gms.internal.ads.zzhdf;
import java.security.GeneralSecurityException;

public final class zzgmm {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        Object object = new zzgmi();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzgja.class, clazz);
        object = new zzgmj();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzgmk();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgiq.class, clazz);
        object = new zzgml();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgiq zza(zzgql object, zzgic object2) {
        Object object3;
        Object object4 = ((zzgql)object).zzg();
        boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        if (!bl2) {
            object = new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            throw object;
        }
        try {
            object4 = ((zzgql)object).zze();
            object3 = zzhay.zza();
            object4 = zzgue.zze((zzhac)object4, (zzhay)object3);
            int n3 = ((zzgue)object4).zza();
            if (n3 != 0) {
                object2 = "Only version 0 keys are accepted";
                object = new GeneralSecurityException((String)object2);
                throw object;
            }
            object3 = ((zzgue)object4).zzf();
            n3 = ((zzguk)object3).zza();
            if (n3 != 0) {
                object2 = "Only version 0 keys inner AES CTR keys are accepted";
                object = new GeneralSecurityException((String)object2);
                throw object;
            }
            object3 = ((zzgue)object4).zzg();
            n3 = ((zzgvw)object3).zza();
            if (n3 == 0) {
                object3 = zzgja.zzf();
                Object object5 = ((zzgue)object4).zzf();
                object5 = ((zzguk)object5).zzg();
                int n4 = ((zzhac)object5).zzd();
                ((zzgiw)object3).zza(n4);
                object5 = ((zzgue)object4).zzg();
                object5 = ((zzgvw)object5).zzh();
                n4 = ((zzhac)object5).zzd();
                ((zzgiw)object3).zzc(n4);
                object5 = ((zzgue)object4).zzf();
                object5 = ((zzguk)object5).zzf();
                n4 = ((zzguq)object5).zza();
                ((zzgiw)object3).zzd(n4);
                object5 = ((zzgue)object4).zzg();
                object5 = ((zzgvw)object5).zzg();
                n4 = ((zzgwc)object5).zza();
                ((zzgiw)object3).zze(n4);
                object5 = ((zzgue)object4).zzg();
                object5 = ((zzgvw)object5).zzg();
                object5 = ((zzgwc)object5).zzc();
                object5 = zzgmm.zzf((zzgvt)object5);
                ((zzgiw)object3).zzb((zzgix)object5);
                object5 = ((zzgql)object).zzc();
                object5 = zzgmm.zzg((zzgxn)object5);
                ((zzgiw)object3).zzf((zzgiy)object5);
                object3 = ((zzgiw)object3).zzg();
                object5 = zzgiq.zza();
                ((zzgio)object5).zzd((zzgja)object3);
                object3 = ((zzgue)object4).zzf();
                object3 = ((zzguk)object3).zzg();
                object3 = ((zzhac)object3).zzB();
                object3 = zzgzf.zzb((byte[])object3, (zzgic)object2);
                ((zzgio)object5).zza((zzgzf)object3);
                object4 = ((zzgue)object4).zzg();
                object4 = ((zzgvw)object4).zzh();
                object4 = ((zzhac)object4).zzB();
                object2 = zzgzf.zzb((byte[])object4, (zzgic)object2);
                ((zzgio)object5).zzb((zzgzf)object2);
                object = ((zzgql)object).zzf();
                ((zzgio)object5).zzc((Integer)object);
                return ((zzgio)object5).zze();
            }
            object2 = "Only version 0 keys inner HMAC keys are accepted";
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        catch (zzhcd zzhcd2) {}
        object = new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        throw object;
    }

    public static /* synthetic */ zzgja zzb(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean bl2 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        if (bl2) {
            block6: {
                try {
                    object3 = ((zzgqm)object).zzc();
                }
                catch (zzhcd zzhcd2) {
                    object3 = new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", zzhcd2);
                    throw object3;
                }
                object3 = ((zzgwm)object3).zzh();
                object2 = zzhay.zza();
                object3 = zzguh.zzd((zzhac)object3, (zzhay)object2);
                object2 = ((zzguh)object3).zzf();
                int n3 = ((zzgvz)object2).zzc();
                if (n3 != 0) break block6;
                object2 = zzgja.zzf();
                int n4 = ((zzguh)object3).zze().zza();
                ((zzgiw)object2).zza(n4);
                n4 = ((zzguh)object3).zzf().zza();
                ((zzgiw)object2).zzc(n4);
                n4 = ((zzguh)object3).zze().zzf().zza();
                ((zzgiw)object2).zzd(n4);
                n4 = ((zzguh)object3).zzf().zzh().zza();
                ((zzgiw)object2).zze(n4);
                object3 = zzgmm.zzf(((zzguh)object3).zzf().zzh().zzc());
                ((zzgiw)object2).zzb((zzgix)object3);
                object = zzgmm.zzg(((zzgqm)object).zzc().zzg());
                ((zzgiw)object2).zzf((zzgiy)object);
                return ((zzgiw)object2).zzg();
            }
            object = new GeneralSecurityException("Only version 0 keys are accepted");
            throw object;
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static /* synthetic */ zzgql zzc(zzgiq object, zzgic object2) {
        Object object3 = zzgue.zzc();
        Object object4 = zzguk.zzc();
        Object object5 = zzguq.zzc();
        int n3 = ((zzgiq)object).zzb().zzd();
        ((zzgup)object5).zza(n3);
        object5 = (zzguq)((zzhbi)object5).zzbn();
        ((zzguj)object4).zzb((zzguq)object5);
        object5 = ((zzgiq)object).zzd().zzd((zzgic)object2);
        n3 = ((Object)object5).length;
        object5 = zzhac.zzv((byte[])object5, 0, n3);
        ((zzguj)object4).zza((zzhac)object5);
        object4 = (zzguk)((zzhbi)object4).zzbn();
        ((zzgud)object3).zza((zzguk)object4);
        object4 = zzgvw.zzc();
        object5 = zzgmm.zzh(((zzgiq)object).zzb());
        ((zzgvv)object4).zzb((zzgwc)object5);
        object2 = ((zzgiq)object).zze().zzd((zzgic)object2);
        int n4 = ((Object)object2).length;
        object2 = zzhac.zzv((byte[])object2, 0, n4);
        ((zzgvv)object4).zza((zzhac)object2);
        object2 = (zzgvw)((zzhbi)object4).zzbn();
        ((zzgud)object3).zzb((zzgvw)object2);
        object2 = ((zzgue)((zzhbi)object3).zzbn()).zzaN();
        object3 = zzgwg.zzb;
        object4 = zzgmm.zzi(((zzgiq)object).zzb().zzh());
        object = ((zzgiq)object).zzf();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", (zzhac)object2, (zzgwg)object3, (zzgxn)object4, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzd(zzgja object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        Object object2 = zzguh.zza();
        zzhdf zzhdf2 = zzgun.zzc();
        zzhdf zzhdf3 = zzguq.zzc();
        int n3 = ((zzgja)object).zzd();
        zzhdf3.zza(n3);
        zzhdf3 = (zzguq)zzhdf3.zzbn();
        ((zzgum)zzhdf2).zzb((zzguq)zzhdf3);
        int n4 = ((zzgja)object).zzb();
        ((zzgum)zzhdf2).zza(n4);
        zzhdf2 = (zzgun)((zzhbi)zzhdf2).zzbn();
        ((zzgug)object2).zza((zzgun)zzhdf2);
        zzhdf2 = zzgvz.zzd();
        zzhdf3 = zzgmm.zzh((zzgja)object);
        ((zzgvy)zzhdf2).zzb((zzgwc)zzhdf3);
        n4 = ((zzgja)object).zzc();
        ((zzgvy)zzhdf2).zza(n4);
        zzhdf2 = (zzgvz)((zzhbi)zzhdf2).zzbn();
        ((zzgug)object2).zzb((zzgvz)zzhdf2);
        object2 = ((zzguh)((zzhbi)object2).zzbn()).zzaN();
        zzgwl2.zzc((zzhac)object2);
        object = zzgmm.zzi(((zzgja)object).zzh());
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

    private static zzgix zzf(zzgvt object) {
        int n3;
        Object object2 = zzgvt.zza;
        object2 = zzgxn.zza;
        int n4 = ((Enum)object).ordinal();
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 != n3) {
                        n3 = 5;
                        if (n4 == n3) {
                            return zzgix.zzb;
                        }
                        object = hj0_0.a(((zzgvt)object).zza(), "Unable to parse HashType: ");
                        object2 = new GeneralSecurityException((String)object);
                        throw object2;
                    }
                    return zzgix.zze;
                }
                return zzgix.zzc;
            }
            return zzgix.zzd;
        }
        return zzgix.zza;
    }

    private static zzgiy zzg(zzgxn object) {
        int n3;
        Object object2 = zzgvt.zza;
        object2 = zzgxn.zza;
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
                    return zzgiy.zzc;
                }
            }
            return zzgiy.zzb;
        }
        return zzgiy.zza;
    }

    private static zzgwc zzh(zzgja object) {
        Object object2;
        block7: {
            block3: {
                zzgix zzgix2;
                int n3;
                block6: {
                    block5: {
                        block4: {
                            block2: {
                                object2 = zzgwc.zzd();
                                n3 = ((zzgja)object).zze();
                                ((zzgwb)object2).zzb(n3);
                                object = ((zzgja)object).zzg();
                                zzgix2 = zzgix.zza;
                                n3 = (int)(zzgix2.equals(object) ? 1 : 0);
                                if (n3 == 0) break block2;
                                object = zzgvt.zzb;
                                break block3;
                            }
                            zzgix2 = zzgix.zzb;
                            n3 = (int)(zzgix2.equals(object) ? 1 : 0);
                            if (n3 == 0) break block4;
                            object = zzgvt.zzf;
                            break block3;
                        }
                        zzgix2 = zzgix.zzc;
                        n3 = (int)(zzgix2.equals(object) ? 1 : 0);
                        if (n3 == 0) break block5;
                        object = zzgvt.zzd;
                        break block3;
                    }
                    zzgix2 = zzgix.zzd;
                    n3 = (int)(zzgix2.equals(object) ? 1 : 0);
                    if (n3 == 0) break block6;
                    object = zzgvt.zzc;
                    break block3;
                }
                zzgix2 = zzgix.zze;
                n3 = (int)(zzgix2.equals(object) ? 1 : 0);
                if (n3 == 0) break block7;
                object = zzgvt.zze;
            }
            ((zzgwb)object2).zza((zzgvt)object);
            return (zzgwc)((zzhbi)object2).zzbn();
        }
        object = String.valueOf(object);
        object = "Unable to serialize HashType ".concat((String)object);
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }

    private static zzgxn zzi(zzgiy object) {
        Object object2 = zzgiy.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzgiy.zzb;
        bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zze;
        }
        object2 = zzgiy.zzc;
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

