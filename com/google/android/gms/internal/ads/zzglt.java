/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgie;
import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgja;
import com.google.android.gms.internal.ads.zzgjm;
import com.google.android.gms.internal.ads.zzgjz;
import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgks;
import com.google.android.gms.internal.ads.zzgli;
import com.google.android.gms.internal.ads.zzglk;
import com.google.android.gms.internal.ads.zzgll;
import com.google.android.gms.internal.ads.zzglm;
import com.google.android.gms.internal.ads.zzglo;
import com.google.android.gms.internal.ads.zzglp;
import com.google.android.gms.internal.ads.zzglq;
import com.google.android.gms.internal.ads.zzglr;
import com.google.android.gms.internal.ads.zzgls;
import com.google.android.gms.internal.ads.zzgmh;
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
import com.google.android.gms.internal.ads.zzgxh;
import com.google.android.gms.internal.ads.zzgxi;
import com.google.android.gms.internal.ads.zzgxk;
import com.google.android.gms.internal.ads.zzgxl;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhcd;
import java.security.GeneralSecurityException;

public final class zzglt {
    public static final /* synthetic */ int zza;
    private static final zzgze zzb;
    private static final zzgpu zzc;
    private static final zzgpq zzd;
    private static final zzgor zze;
    private static final zzgon zzf;

    static {
        zzgze zzgze2;
        zzb = zzgze2 = zzgra.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        Object object = new zzglp();
        Class clazz = zzgqm.class;
        zzc = zzgpu.zzb((zzgps)object, zzglo.class, clazz);
        object = new zzglq();
        zzd = zzgpq.zzb((zzgpo)object, zzgze2, clazz);
        object = new zzglr();
        clazz = zzgql.class;
        zze = zzgor.zzb((zzgop)object, zzgli.class, clazz);
        object = new zzgls();
        zzf = zzgon.zzb((zzgol)object, zzgze2, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ zzgli zza(zzgql object, zzgic object2) {
        zzhcd zzhcd22;
        block4: {
            Object object3;
            object2 = "KmsEnvelopeAeadKeys are only accepted with version 0, got ";
            Object object4 = ((zzgql)object).zzg();
            boolean bl2 = ((String)object4).equals(object3 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
            if (!bl2) {
                object = new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                throw object;
            }
            try {
                object4 = ((zzgql)object).zze();
                object3 = zzhay.zza();
                object4 = zzgxi.zze((zzhac)object4, (zzhay)object3);
                int n3 = ((zzgxi)object4).zza();
                if (n3 == 0) {
                    object2 = ((zzgxi)object4).zzf();
                    object4 = ((zzgql)object).zzc();
                    object2 = zzglt.zzf((zzgxl)object2, (zzgxn)object4);
                    object = ((zzgql)object).zzf();
                    return zzgli.zza((zzglo)object2, (Integer)object);
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
        object2 = new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", zzhcd22);
        throw object2;
    }

    public static /* synthetic */ zzglo zzb(zzgqm object) {
        Object object2;
        Object object3 = ((zzgqm)object).zzc().zzi();
        boolean bl2 = ((String)object3).equals(object2 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        if (bl2) {
            try {
                object3 = ((zzgqm)object).zzc();
            }
            catch (zzhcd zzhcd2) {
                object3 = new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", zzhcd2);
                throw object3;
            }
            object3 = ((zzgwm)object3).zzh();
            object2 = zzhay.zza();
            object3 = zzgxl.zzf((zzhac)object3, (zzhay)object2);
            object = ((zzgqm)object).zzc().zzg();
            return zzglt.zzf((zzgxl)object3, (zzgxn)object);
        }
        object = String.valueOf(((zzgqm)object).zzc().zzi());
        object = "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static /* synthetic */ zzgql zzc(zzgli object, zzgic object2) {
        object2 = zzgxi.zzc();
        Object object3 = zzglt.zzg(((zzgli)object).zzb());
        ((zzgxh)object2).zza((zzgxl)object3);
        object2 = ((zzgxi)((zzhbi)object2).zzbn()).zzaN();
        object3 = zzgwg.zze;
        zzgxn zzgxn2 = zzglt.zzh(((zzgli)object).zzb().zzc());
        object = ((zzgli)object).zzd();
        return zzgql.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", (zzhac)object2, (zzgwg)object3, zzgxn2, (Integer)object);
    }

    public static /* synthetic */ zzgqm zzd(zzglo object) {
        zzgwl zzgwl2 = zzgwm.zza();
        zzgwl2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzhac zzhac2 = zzglt.zzg((zzglo)object).zzaN();
        zzgwl2.zzc(zzhac2);
        object = zzglt.zzh(((zzglo)object).zzc());
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

    /*
     * Enabled aggressive block sorting
     */
    private static zzglo zzf(zzgxl object, zzgxn object2) {
        Object object3 = zzgwm.zza();
        Object object4 = ((zzgxl)object).zza().zzi();
        ((zzgwl)object3).zzb((String)object4);
        object4 = ((zzgxl)object).zza().zzh();
        ((zzgwl)object3).zzc((zzhac)object4);
        object4 = zzgxn.zzd;
        ((zzgwl)object3).zza((zzgxn)object4);
        object3 = zzgie.zza(((zzgwm)((zzhbi)object3).zzbn()).zzaV());
        boolean bl2 = object3 instanceof zzgjz;
        if (bl2) {
            object4 = zzgll.zza;
        } else {
            bl2 = object3 instanceof zzgks;
            if (bl2) {
                object4 = zzgll.zzc;
            } else {
                bl2 = object3 instanceof zzgmh;
                if (bl2) {
                    object4 = zzgll.zzb;
                } else {
                    bl2 = object3 instanceof zzgja;
                    if (bl2) {
                        object4 = zzgll.zzd;
                    } else {
                        bl2 = object3 instanceof zzgjm;
                        if (bl2) {
                            object4 = zzgll.zze;
                        } else {
                            bl2 = object3 instanceof zzgkm;
                            if (!bl2) {
                                object2 = object3.toString();
                                object2 = "Unsupported DEK parameters when parsing ".concat((String)object2);
                                object = new GeneralSecurityException((String)object2);
                                throw object;
                            }
                            object4 = zzgll.zzf;
                        }
                    }
                }
            }
        }
        zzglk zzglk2 = new zzglk(null);
        int n3 = ((Enum)object2).ordinal();
        int n4 = 1;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                object2 = hj0_0.a(((zzgxn)object2).zza(), "Unable to parse OutputPrefixType: ");
                object = new GeneralSecurityException((String)object2);
                throw object;
            }
            object2 = zzglm.zzb;
        } else {
            object2 = zzglm.zza;
        }
        zzglk2.zzd((zzglm)object2);
        object = ((zzgxl)object).zzg();
        zzglk2.zzc((String)object);
        object3 = (zzgii)object3;
        zzglk2.zza((zzgii)object3);
        zzglk2.zzb((zzgll)object4);
        return zzglk2.zze();
    }

    private static zzgxl zzg(zzglo object) {
        Object object2;
        Object object3 = zzgie.zzb(((zzglo)object).zzb());
        try {
            object2 = zzhay.zza();
        }
        catch (zzhcd zzhcd2) {
            object3 = new GeneralSecurityException;
            object3("Parsing KmsEnvelopeAeadKeyFormat failed: ", zzhcd2);
            throw object3;
        }
        object3 = zzgwm.zzf(object3, (zzhay)object2);
        object2 = zzgxl.zzc();
        object = ((zzglo)object).zzd();
        ((zzgxk)object2).zzb((String)object);
        ((zzgxk)object2).zza((zzgwm)object3);
        object = ((zzhbi)object2).zzbn();
        return (zzgxl)object;
    }

    private static zzgxn zzh(zzglm object) {
        Object object2 = zzglm.zza;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return zzgxn.zzb;
        }
        object2 = zzglm.zzb;
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

