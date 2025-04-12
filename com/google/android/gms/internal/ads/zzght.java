/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghc;
import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghk;
import com.google.android.gms.internal.ads.zzghn;
import com.google.android.gms.internal.ads.zzghp;
import com.google.android.gms.internal.ads.zzghr;
import com.google.android.gms.internal.ads.zzghs;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgib;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgif;
import com.google.android.gms.internal.ads.zzgoi;
import com.google.android.gms.internal.ads.zzgou;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.gms.internal.ads.zzgqk;
import com.google.android.gms.internal.ads.zzgql;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgtk;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwh;
import com.google.android.gms.internal.ads.zzgwj;
import com.google.android.gms.internal.ads.zzgwt;
import com.google.android.gms.internal.ads.zzgwu;
import com.google.android.gms.internal.ads.zzgww;
import com.google.android.gms.internal.ads.zzgwx;
import com.google.android.gms.internal.ads.zzgwy;
import com.google.android.gms.internal.ads.zzgwz;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbo;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzght {
    private final zzgwu zza;
    private final List zzb;
    private final zzgtk zzc;

    private zzght(zzgwu object, List list) {
        this.zza = object;
        this.zzb = list;
        this.zzc = object = zzgtk.zza;
    }

    public /* synthetic */ zzght(zzgwu zzgwu2, List list, zzgtk zzgtk2, zzghs zzghs2) {
        this.zza = zzgwu2;
        this.zzb = list;
        this.zzc = zzgtk2;
    }

    public static final zzght zza(zzgwu zzgwu2) {
        zzght.zzh(zzgwu2);
        List list = zzght.zzg(zzgwu2);
        zzght zzght2 = new zzght(zzgwu2, list);
        return zzght2;
    }

    public static final zzght zzb(zzghx zzghx2) {
        zzghp zzghp2 = new zzghp();
        zzghn zzghn2 = new zzghn(zzghx2, null);
        zzghn2.zzd();
        zzghn2.zzc();
        zzghp2.zza(zzghn2);
        return zzghp2.zzb();
    }

    public static /* bridge */ /* synthetic */ void zze(zzgwu zzgwu2) {
        zzght.zzh(zzgwu2);
    }

    private final Object zzf(zzgoi object, Class object2, Class object3) {
        block15: {
            Object object4;
            int n3;
            object = zzgif.zza;
            object = this.zza;
            int n4 = ((zzgwu)object).zzc();
            object = ((zzgwu)object).zzh().iterator();
            int n7 = 0;
            int n8 = 1;
            int n10 = 0;
            Object object5 = null;
            boolean bl2 = false;
            Object object6 = null;
            int n14 = 1;
            while ((n3 = object.hasNext()) != 0) {
                Enum enum_;
                object4 = (zzgwt)object.next();
                Enum enum_2 = ((zzgwt)object4).zzd();
                if (enum_2 != (enum_ = zzgwj.zzb)) continue;
                int n15 = ((zzgwt)object4).zzl();
                if (n15 != 0) {
                    enum_2 = ((zzgwt)object4).zzg();
                    if (enum_2 != (enum_ = zzgxn.zza)) {
                        enum_2 = ((zzgwt)object4).zzd();
                        if (enum_2 != (enum_ = zzgwj.zza)) {
                            n15 = ((zzgwt)object4).zza();
                            if (n15 == n4) {
                                if (!bl2) {
                                    bl2 = true;
                                } else {
                                    object = new GeneralSecurityException("keyset contains multiple primary keys");
                                    throw object;
                                }
                            }
                            if ((object4 = ((zzgwt)object4).zzc().zzc()) != (enum_2 = zzgwg.zzd)) {
                                n3 = 0;
                                object4 = null;
                            } else {
                                n3 = 1;
                            }
                            n14 &= n3;
                            n10 += n8;
                            continue;
                        }
                        object2 = ((zzgwt)object4).zza();
                        object3 = new Object[n8];
                        object3[0] = object2;
                        object2 = String.format("key %d has unknown status", (Object[])object3);
                        object = new GeneralSecurityException((String)object2);
                        throw object;
                    }
                    object2 = ((zzgwt)object4).zza();
                    object3 = new Object[n8];
                    object3[0] = object2;
                    object2 = String.format("key %d has unknown prefix", (Object[])object3);
                    object = new GeneralSecurityException((String)object2);
                    throw object;
                }
                object2 = ((zzgwt)object4).zza();
                object3 = new Object[n8];
                object3[0] = object2;
                object2 = String.format("key %d has no key data", (Object[])object3);
                object = new GeneralSecurityException((String)object2);
                throw object;
            }
            if (n10 == 0) break block15;
            if (!bl2 && n14 == 0) {
                object = new GeneralSecurityException("keyset doesn't contain a valid primary key");
                throw object;
            }
            object = zzgqk.zza((Class)object3);
            Object object7 = this.zzc;
            ((zzgqg)object).zzc((zzgtk)object7);
            while (n7 < (n4 = (object7 = this.zzb).size())) {
                block16: {
                    block17: {
                        block14: {
                            object7 = this.zza.zze(n7);
                            object5 = ((zzgwt)object7).zzd();
                            n10 = object5.equals(object6 = zzgwj.zzb);
                            if (n10 == 0) break block16;
                            object5 = (zzghr)this.zzb.get(n7);
                            if (object5 == null) break block17;
                            object5 = ((zzghr)object5).zza();
                            try {
                                object6 = zzgpi.zza();
                            }
                            catch (GeneralSecurityException generalSecurityException) {
                                object3 = object3.toString();
                                object7 = ((zzgwt)object7).zzc().zzg();
                                object3 = uc0_0.a("Unable to get primitive ", (String)object3, " for key of type ", (String)object7, ", see https://developers.google.com/tink/faq/registration_errors");
                                object2 = new GeneralSecurityException((String)object3, generalSecurityException);
                                throw object2;
                            }
                            object6 = ((zzgpi)object6).zzc((zzghi)object5, (Class)object3);
                            n14 = ((zzgwt)object7).zza();
                            object4 = this.zza;
                            n3 = ((zzgwu)object4).zzc();
                            if (n14 != n3) break block14;
                            ((zzgqg)object).zzb(object6, (zzghi)object5, (zzgwt)object7);
                            break block16;
                        }
                        ((zzgqg)object).zza(object6, (zzghi)object5, (zzgwt)object7);
                        break block16;
                    }
                    object2 = ((zzgwt)object7).zzc().zzg();
                    object3 = new StringBuilder("Key parsing of key with index ");
                    ((StringBuilder)object3).append(n7);
                    ((StringBuilder)object3).append(" and type_url ");
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(" failed, unable to get primitive");
                    object2 = ((StringBuilder)object3).toString();
                    object = new GeneralSecurityException((String)object2);
                    throw object;
                }
                n7 += n8;
            }
            object = ((zzgqg)object).zzd();
            return zzgpi.zza().zzd((zzgqk)object, (Class)object2);
        }
        object = new GeneralSecurityException("keyset must contain at least one ENABLED key");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static List zzg(zzgwu zzgwu2) {
        int n3 = zzgwu2.zza();
        ArrayList<zzghr> arrayList = new ArrayList<zzghr>(n3);
        Iterator iterator = zzgwu2.zzh().iterator();
        int n4;
        while ((n4 = iterator.hasNext()) != 0) {
            Object object = (zzgwt)iterator.next();
            int n7 = ((zzgwt)object).zza();
            try {
                zzghr zzghr2;
                Object object2;
                int n8 = ((zzgwt)object).zza();
                Object object3 = ((zzgwt)object).zzg();
                Object object4 = zzgxn.zzd;
                if (object3 == object4) {
                    n8 = 0;
                    object2 = null;
                } else {
                    object2 = n8;
                }
                object3 = ((zzgwt)object).zzc();
                object3 = ((zzgwh)object3).zzg();
                object4 = ((zzgwt)object).zzc();
                object4 = ((zzgwh)object4).zzf();
                Object object5 = ((zzgwt)object).zzc();
                object5 = ((zzgwh)object5).zzc();
                zzgxn zzgxn2 = ((zzgwt)object).zzg();
                object2 = zzgql.zza((String)object3, (zzhac)object4, (zzgwg)object5, zzgxn2, (Integer)object2);
                object3 = zzgpl.zzc();
                object4 = zzgic.zza();
                boolean bl2 = ((zzgpl)object3).zzj((zzgqq)object2);
                object3 = !bl2 ? new zzgou((zzgql)object2, (zzgic)object4) : (object2 = ((zzgpl)object3).zza((zzgqq)object2, (zzgic)object4));
                object = ((zzgwt)object).zzd();
                object2 = zzgwj.zza;
                n4 = ((Enum)object).ordinal();
                n8 = 1;
                if (n4 != n8) {
                    int n10 = 2;
                    if (n4 != n10) {
                        n10 = 3;
                        if (n4 != n10) {
                            object2 = "Unknown key status";
                            object = new GeneralSecurityException((String)object2);
                            throw object;
                        }
                        object = zzghk.zzc;
                    } else {
                        object = zzghk.zzb;
                    }
                } else {
                    object = zzghk.zza;
                }
                object4 = object;
                n4 = zzgwu2.zzc();
                if (n7 == n4) {
                    bl2 = true;
                } else {
                    n4 = 0;
                    object = null;
                    bl2 = false;
                    object5 = null;
                }
                zzgxn2 = null;
                object2 = zzghr2;
                zzghr2 = new zzghr((zzghi)object3, (zzghk)object4, n7, bl2, null);
                arrayList.add(zzghr2);
            }
            catch (GeneralSecurityException generalSecurityException) {
                arrayList.add(null);
                continue;
            }
            break;
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzh(zzgwu object) {
        int n3;
        if (object != null && (n3 = ((zzgwu)object).zza()) > 0) {
            return;
        }
        object = new GeneralSecurityException("empty keyset");
        throw object;
    }

    public final String toString() {
        Object object = zzgif.zza;
        object = zzgwz.zza();
        Object object2 = this.zza;
        int n3 = ((zzgwu)object2).zzc();
        ((zzgww)object).zzb(n3);
        object2 = ((zzgwu)object2).zzh().iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            zzhbo zzhbo2 = (zzgwt)object2.next();
            zzgwx zzgwx2 = zzgwy.zza();
            Object object3 = zzhbo2.zzc().zzg();
            zzgwx2.zzd((String)object3);
            object3 = zzhbo2.zzd();
            zzgwx2.zzc((zzgwj)object3);
            object3 = zzhbo2.zzg();
            zzgwx2.zzb((zzgxn)object3);
            n3 = zzhbo2.zza();
            zzgwx2.zza(n3);
            zzhbo2 = (zzgwy)zzgwx2.zzbn();
            ((zzgww)object).zza((zzgwy)zzhbo2);
        }
        return ((zzgwz)((zzhbi)object).zzbn()).toString();
    }

    public final zzgwu zzc() {
        return this.zza;
    }

    public final Object zzd(zzghc object, Class object2) {
        Class clazz = zzgib.zza((Class)object2);
        if (clazz != null) {
            object = (zzgoi)object;
            return this.zzf((zzgoi)object, (Class)object2, clazz);
        }
        object2 = ((Class)object2).getName();
        object2 = "No wrapper found for ".concat((String)object2);
        object = new GeneralSecurityException((String)object2);
        throw object;
    }
}

