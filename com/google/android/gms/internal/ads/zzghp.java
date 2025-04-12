/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghk;
import com.google.android.gms.internal.ads.zzghn;
import com.google.android.gms.internal.ads.zzgho;
import com.google.android.gms.internal.ads.zzghr;
import com.google.android.gms.internal.ads.zzght;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgpb;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgql;
import com.google.android.gms.internal.ads.zzgtk;
import com.google.android.gms.internal.ads.zzgwe;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwh;
import com.google.android.gms.internal.ads.zzgwj;
import com.google.android.gms.internal.ads.zzgwr;
import com.google.android.gms.internal.ads.zzgws;
import com.google.android.gms.internal.ads.zzgwt;
import com.google.android.gms.internal.ads.zzgwu;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbi;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class zzghp {
    private final List zza;
    private final zzgtk zzb;
    private boolean zzc;

    public zzghp() {
        Object object = new ArrayList();
        this.zza = object;
        this.zzb = object = zzgtk.zza;
        this.zzc = false;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzghp zzghp2) {
        zzghp2.zzd();
    }

    private final void zzd() {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            zzghn zzghn2 = (zzghn)iterator.next();
            zzghn.zzi(zzghn2, false);
        }
    }

    public final zzghp zza(zzghn object) {
        zzghp zzghp2 = zzghn.zzf((zzghn)object);
        if (zzghp2 == null) {
            boolean bl2 = zzghn.zzj((zzghn)object);
            if (bl2) {
                this.zzd();
            }
            zzghn.zzh((zzghn)object, this);
            this.zza.add(object);
            return this;
        }
        object = new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzght zzb() {
        Object object;
        int n3;
        zzghp zzghp2 = this;
        int n4 = this.zzc;
        if (n4 != 0) {
            GeneralSecurityException generalSecurityException = new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            throw generalSecurityException;
        }
        this.zzc = n4 = 1;
        Object object2 = this.zza;
        zzgwr zzgwr2 = zzgwu.zzd();
        int n7 = object2.size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n7);
        object2 = this.zza;
        boolean bl2 = false;
        Object object3 = null;
        int n8 = 0;
        Object object4 = null;
        while (n8 < (n3 = object2.size() + -1)) {
            n3 = n8 + 1;
            object4 = zzghn.zze((zzghn)object2.get(n8));
            if (object4 == (object = zzgho.zza()) && (object4 = zzghn.zze((zzghn)object2.get(n3))) != (object = zzgho.zza())) {
                GeneralSecurityException generalSecurityException = new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                throw generalSecurityException;
            }
            n8 = n3;
        }
        object2 = new HashSet();
        object4 = zzghp2.zza.iterator();
        object = null;
        while (true) {
            Object object5;
            int n10;
            int n14;
            Object object6;
            int n15;
            int n16;
            Object object7;
            Object object8;
            zzghn zzghn2;
            block23: {
                int n17;
                Object object9;
                block22: {
                    block20: {
                        block21: {
                            boolean bl3;
                            if (!(bl3 = object4.hasNext())) break block20;
                            zzghn2 = (zzghn)object4.next();
                            zzghn.zzb(zzghn2);
                            object9 = zzghn.zze(zzghn2);
                            if (object9 == null) {
                                object8 = new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                                throw object8;
                            }
                            object9 = zzghn.zze(zzghn2);
                            if (object9 != (object7 = zzgho.zza())) break block21;
                            n16 = 0;
                            object9 = null;
                            break block22;
                        }
                        zzghn.zze(zzghn2);
                        n16 = 0;
                        object9 = null;
                        break block23;
                    }
                    if (object != null) {
                        n4 = (Integer)object;
                        zzgwr2.zzb(n4);
                        object8 = (zzgwu)zzgwr2.zzbn();
                        zzght.zze((zzgwu)object8);
                        object2 = zzghp2.zzb;
                        return new zzght((zzgwu)object8, arrayList, (zzgtk)object2, null);
                    }
                    object8 = new GeneralSecurityException("No primary was set");
                    throw object8;
                }
                while (n16 == 0 || (n17 = (int)(((HashSet)object2).contains(object7 = Integer.valueOf(n16)) ? 1 : 0)) != 0) {
                    object9 = new SecureRandom();
                    n17 = 4;
                    object7 = new byte[n17];
                    n15 = 0;
                    object6 = null;
                    while (n15 == 0) {
                        ((SecureRandom)object9).nextBytes((byte[])object7);
                        n15 = object7[0] & 0xFF;
                        n14 = object7[n4] & 0xFF;
                        n10 = object7[2] & 0xFF;
                        int n18 = object7[3] & 0xFF;
                        n15 <<= 24;
                        n15 |= (n14 <<= 16);
                        n14 = n10 << 8;
                        n15 = n15 | n14 | n18;
                    }
                    n16 = n15;
                }
            }
            if ((n15 = ((HashSet)object2).contains(object7 = Integer.valueOf(n16))) != 0) {
                object2 = Gj0.b(n16, "Id ", " is used twice in the keyset");
                object8 = new GeneralSecurityException((String)object2);
                throw object8;
            }
            ((HashSet)object2).add(object7);
            zzghn.zza(zzghn2);
            object6 = zzghn.zzg(zzghn2);
            n15 = ((zzghx)object6).zza();
            if (n4 != n15) {
                n15 = 0;
                object6 = null;
            } else {
                object6 = object7;
            }
            Object object10 = zzgpb.zzb();
            Object object11 = zzghn.zzg(zzghn2);
            object6 = ((zzgpb)object10).zza((zzghx)object11, (Integer)object6);
            zzghk zzghk2 = zzghn.zzb(zzghn2);
            boolean bl4 = zzghn.zzj(zzghn2);
            object10 = object5;
            object11 = object6;
            object8 = object5;
            object5 = zzghk2;
            ((zzghr)object10)((zzghi)object6, zzghk2, n16, bl4, null);
            object10 = zzghn.zzb(zzghn2);
            object11 = zzgpl.zzc();
            object5 = zzgql.class;
            object3 = zzgic.zza();
            object3 = (zzgql)((zzgpl)object11).zzd((zzghi)object6, (Class)object5, (zzgic)object3);
            object6 = ((zzgql)object3).zzf();
            if (object6 != null && (n15 = ((Integer)object6).intValue()) != n16) {
                object8 = new GeneralSecurityException("Wrong ID set for key with ID requirement");
                throw object8;
            }
            object6 = zzghk.zza;
            n10 = (int)(object6.equals(object10) ? 1 : 0);
            if (n10 != 0) {
                object10 = zzgwj.zzb;
            } else {
                object11 = zzghk.zzb;
                n10 = (int)(object11.equals(object10) ? 1 : 0);
                if (n10 != 0) {
                    object10 = zzgwj.zzc;
                } else {
                    object11 = zzghk.zzc;
                    n14 = (int)(object11.equals(object10) ? 1 : 0);
                    if (n14 == 0) {
                        object8 = new IllegalStateException("Unknown key status");
                        throw object8;
                    }
                    object10 = zzgwj.zzd;
                }
            }
            object11 = zzgwt.zze();
            object5 = zzgwh.zza();
            Object object12 = ((zzgql)object3).zzg();
            ((zzgwe)object5).zzb((String)object12);
            object12 = ((zzgql)object3).zze();
            ((zzgwe)object5).zzc((zzhac)object12);
            object12 = ((zzgql)object3).zzb();
            ((zzgwe)object5).zza((zzgwg)object12);
            ((zzgws)object11).zza((zzgwe)object5);
            ((zzgws)object11).zzd((zzgwj)object10);
            ((zzgws)object11).zzb(n16);
            object3 = ((zzgql)object3).zzc();
            ((zzgws)object11).zzc((zzgxn)object3);
            object3 = (zzgwt)((zzhbi)object11).zzbn();
            zzgwr2.zza((zzgwt)object3);
            bl2 = zzghn.zzj(zzghn2);
            if (bl2) {
                if (object != null) {
                    object8 = new GeneralSecurityException("Two primaries were set");
                    throw object8;
                }
                object3 = zzghn.zzb(zzghn2);
                if (object3 != object6) {
                    object8 = new GeneralSecurityException("Primary key is not enabled");
                    throw object8;
                }
                object = object7;
            }
            arrayList.add(object8);
            n4 = 1;
            bl2 = false;
            object3 = null;
        }
    }
}

