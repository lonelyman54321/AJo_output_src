/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzaca;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzre;
import com.google.android.gms.internal.gtm.zzrg;
import com.google.android.gms.internal.gtm.zzri;
import com.google.android.gms.internal.gtm.zzrm;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.zzai;
import com.google.android.gms.tagmanager.zzaj;
import com.google.android.gms.tagmanager.zzal;
import com.google.android.gms.tagmanager.zzam;
import com.google.android.gms.tagmanager.zzat;
import com.google.android.gms.tagmanager.zzba;
import com.google.android.gms.tagmanager.zzbd;
import com.google.android.gms.tagmanager.zzbe;
import com.google.android.gms.tagmanager.zzbl;
import com.google.android.gms.tagmanager.zzbm;
import com.google.android.gms.tagmanager.zzbn;
import com.google.android.gms.tagmanager.zzbo;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzbr;
import com.google.android.gms.tagmanager.zzbs;
import com.google.android.gms.tagmanager.zzbt;
import com.google.android.gms.tagmanager.zzbu;
import com.google.android.gms.tagmanager.zzcr;
import com.google.android.gms.tagmanager.zzct;
import com.google.android.gms.tagmanager.zzcw;
import com.google.android.gms.tagmanager.zzcx;
import com.google.android.gms.tagmanager.zzcy;
import com.google.android.gms.tagmanager.zzcz;
import com.google.android.gms.tagmanager.zzd;
import com.google.android.gms.tagmanager.zzdd;
import com.google.android.gms.tagmanager.zzde;
import com.google.android.gms.tagmanager.zzdg;
import com.google.android.gms.tagmanager.zzdh;
import com.google.android.gms.tagmanager.zzdi;
import com.google.android.gms.tagmanager.zzdj;
import com.google.android.gms.tagmanager.zzdk;
import com.google.android.gms.tagmanager.zzdl;
import com.google.android.gms.tagmanager.zzdn;
import com.google.android.gms.tagmanager.zzdo;
import com.google.android.gms.tagmanager.zzds;
import com.google.android.gms.tagmanager.zzdw;
import com.google.android.gms.tagmanager.zzdy;
import com.google.android.gms.tagmanager.zzdz;
import com.google.android.gms.tagmanager.zze;
import com.google.android.gms.tagmanager.zzea;
import com.google.android.gms.tagmanager.zzei;
import com.google.android.gms.tagmanager.zzej;
import com.google.android.gms.tagmanager.zzek;
import com.google.android.gms.tagmanager.zzel;
import com.google.android.gms.tagmanager.zzem;
import com.google.android.gms.tagmanager.zzen;
import com.google.android.gms.tagmanager.zzeo;
import com.google.android.gms.tagmanager.zzf;
import com.google.android.gms.tagmanager.zzfe;
import com.google.android.gms.tagmanager.zzfp;
import com.google.android.gms.tagmanager.zzfq;
import com.google.android.gms.tagmanager.zzfs;
import com.google.android.gms.tagmanager.zzh;
import com.google.android.gms.tagmanager.zzi;
import com.google.android.gms.tagmanager.zzj;
import com.google.android.gms.tagmanager.zzk;
import com.google.android.gms.tagmanager.zzl;
import com.google.android.gms.tagmanager.zzo;
import com.google.android.gms.tagmanager.zzq;
import com.google.android.gms.tagmanager.zzr;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzep {
    private static final zzdn zza;
    private final zzrg zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;
    private final Set zzf;
    private final DataLayer zzg;
    private final Map zzh;
    private volatile String zzi;
    private int zzj;
    private final zzcw zzk;
    private final zzcw zzl;

    static {
        zzdn zzdn2;
        zzap zzap2 = zzfp.zza();
        zza = zzdn2 = new zzdn(zzap2, true);
    }

    public zzep(Context object, zzrg object2, DataLayer object3, zzal object4, zzal object5, zzdg object6) {
        int n3;
        int n4;
        boolean bl2;
        this.zzb = object2;
        Object object7 = ((zzrg)object2).zzc();
        object6 = new HashSet(object7);
        this.zzf = object6;
        this.zzg = object3;
        object7 = new zzei(this);
        int n7 = 0x100000;
        Object object8 = new zzcw(n7, (zzq)object7);
        this.zzk = object8;
        object7 = new zzej(this);
        object8 = new zzcw(n7, (zzq)object7);
        this.zzl = object8;
        object7 = new HashMap();
        this.zzc = object7;
        object8 = new zzo((Context)object);
        zzep.zzj(object7, (zzbp)object8);
        object8 = new zzam((zzal)object5);
        zzep.zzj(object7, (zzbp)object8);
        object5 = new zzba((DataLayer)object3);
        zzep.zzj(object7, (zzbp)object5);
        object5 = new zzfq((Context)object, (DataLayer)object3);
        zzep.zzj(object7, (zzbp)object5);
        object5 = new HashMap();
        this.zzd = object5;
        object7 = new zzaj();
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzbm();
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzbn();
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzbr();
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzbs();
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzcy();
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzcz();
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzdz();
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzfe();
        zzep.zzj(object5, (zzbp)object7);
        object5 = new HashMap();
        this.zze = object5;
        object8 = com.google.android.gms.tagmanager.zzd.zzb((Context)object);
        object7 = new zze((zzd)object8);
        zzep.zzj(object5, (zzbp)object7);
        object8 = com.google.android.gms.tagmanager.zzd.zzb((Context)object);
        object7 = new zzf((zzd)object8);
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzh((Context)object);
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzi((Context)object);
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzj((Context)object);
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzk((Context)object);
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzl((Context)object);
        zzep.zzj(object5, (zzbp)object7);
        object7 = new zzr();
        zzep.zzj(object5, (zzbp)object7);
        object2 = ((zzrg)object2).zzb();
        object7 = new zzai((String)object2);
        zzep.zzj(object5, (zzbp)object7);
        object2 = new zzam((zzal)object4);
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzat((DataLayer)object3);
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzbd((Context)object);
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzbe();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzbl();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzbo(this);
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzbt();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzbu();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzcr((Context)object);
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzct();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzcx();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzdd();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzde((Context)object);
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzdo();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzds();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzdw();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzdy();
        zzep.zzj(object5, (zzbp)object2);
        object2 = new zzea((Context)object);
        zzep.zzj(object5, (zzbp)object2);
        zzep.zzj(object5, (zzbp)object);
        super();
        zzep.zzj(object5, (zzbp)object);
        super();
        zzep.zzj(object5, (zzbp)object);
        super();
        zzep.zzj(object5, (zzbp)object);
        super();
        this.zzh = object;
        object = object6.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zzri)object.next();
            int n8 = 0;
            object3 = null;
            n4 = 0;
            object4 = null;
            while (true) {
                object5 = ((zzri)object2).zza();
                n3 = object5.size();
                object6 = "Unknown";
                if (n4 >= n3) break;
                object5 = (zzre)((zzri)object2).zza().get(n4);
                object7 = this.zzh;
                object8 = zzep.zzh((zzre)object5);
                object7 = zzep.zzg((Map)object7, (String)object8);
                ((zzeo)object7).zzk((zzri)object2);
                ((zzeo)object7).zzg((zzri)object2, (zzre)object5);
                ((zzeo)object7).zzh((zzri)object2, (String)object6);
                ++n4;
            }
            while (n8 < (n4 = (object4 = ((zzri)object2).zzf()).size())) {
                object4 = (zzre)((zzri)object2).zzf().get(n8);
                object5 = this.zzh;
                object7 = zzep.zzh((zzre)object4);
                object5 = zzep.zzg((Map)object5, (String)object7);
                ((zzeo)object5).zzk((zzri)object2);
                ((zzeo)object5).zzi((zzri)object2, (zzre)object4);
                ((zzeo)object5).zzj((zzri)object2, (String)object6);
                ++n8;
            }
        }
        object = this.zzb.zzd().entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            object3 = ((List)object2.getValue()).iterator();
            while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object4 = (zzre)object3.next();
                object5 = ((zzre)object4).zzc();
                object6 = com.google.android.gms.internal.gtm.zzb.zzcg.toString();
                n3 = (int)(((Boolean)(object5 = zzfp.zzf(zzfp.zzk((zzap)object5.get(object6))))).booleanValue() ? 1 : 0);
                if (n3 != 0) continue;
                object5 = this.zzh;
                object6 = (String)object2.getKey();
                object5 = zzep.zzg((Map)object5, (String)object6);
                ((zzeo)object5).zzl((zzre)object4);
            }
        }
    }

    private static zzeo zzg(Map map2, String string2) {
        zzeo zzeo2 = (zzeo)map2.get(string2);
        if (zzeo2 == null) {
            zzeo2 = new zzeo();
            map2.put(string2, zzeo2);
        }
        return zzeo2;
    }

    private static String zzh(zzre object) {
        object = ((zzre)object).zzc();
        String string2 = com.google.android.gms.internal.gtm.zzb.zzbA.toString();
        return zzfp.zzm(zzfp.zzk((zzap)object.get(string2)));
    }

    private final String zzi() {
        char c2;
        int n3 = this.zzj;
        int n4 = 1;
        if (n3 <= n4) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = Integer.toString(this.zzj);
        stringBuilder.append(string2);
        for (n4 = 2; n4 < (c2 = this.zzj); ++n4) {
            c2 = ' ';
            stringBuilder.append(c2);
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    private static void zzj(Map object, zzbp object2) {
        String string2 = ((zzbp)object2).zze();
        boolean bl2 = object.containsKey(string2);
        if (!bl2) {
            string2 = ((zzbp)object2).zze();
            object.put(string2, object2);
            return;
        }
        object2 = String.valueOf(((zzbp)object2).zze());
        object2 = "Duplicate function type name: ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    private final void zzk(zzap iterator, Set object) {
        Object object2;
        if (iterator != null && (iterator = this.zzo((zzap)((Object)iterator), (Set)object, (zzdl)(object2 = new zzdl()))) != (object = zza)) {
            boolean bl2 = (iterator = zzfp.zzk((zzap)((zzdn)((Object)iterator)).zza())) instanceof Map;
            if (bl2) {
                iterator = (Map)((Object)iterator);
                this.zzg.push((Map)((Object)iterator));
                return;
            }
            bl2 = iterator instanceof List;
            if (bl2) {
                iterator = ((List)((Object)iterator)).iterator();
                while (bl2 = iterator.hasNext()) {
                    object = iterator.next();
                    boolean bl3 = object instanceof Map;
                    if (!bl3) continue;
                    object = (Map)object;
                    object2 = this.zzg;
                    ((DataLayer)object2).push((Map)object);
                }
            }
        }
    }

    private final zzdn zzl(Set object, Set set, zzem zzem2, zzdk hashSet) {
        boolean bl2;
        hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        object = object.iterator();
        block0: while (true) {
            boolean bl3;
            bl2 = true;
            while (bl3 = object.hasNext()) {
                Object object2;
                Object object3;
                zzdj zzdj2;
                zzri zzri2;
                block9: {
                    boolean bl4;
                    Object object4;
                    Object object5;
                    boolean bl5;
                    boolean bl6;
                    zzri2 = (zzri)object.next();
                    zzdj2 = new zzdj();
                    object3 = zzri2.zzd().iterator();
                    block2: while (true) {
                        bl6 = true;
                        while (bl5 = object3.hasNext()) {
                            object5 = (zzre)object3.next();
                            object4 = new zzdi();
                            bl4 = (Boolean)(object4 = (Boolean)((zzdn)(object5 = this.zzf((zzre)object5, set, (zzdi)object4))).zza());
                            if (bl4) {
                                object3 = Boolean.FALSE;
                                zzfp.zzb(object3);
                                bl5 = ((zzdn)object5).zzb();
                                object2 = new zzdn(object3, bl5);
                                break block9;
                            }
                            if (bl6 && (bl6 = ((zzdn)object5).zzb())) continue block2;
                            bl6 = false;
                            object2 = null;
                        }
                        break;
                    }
                    object3 = zzri2.zze().iterator();
                    while (bl5 = object3.hasNext()) {
                        object5 = (zzre)object3.next();
                        object4 = new zzdi();
                        bl4 = (Boolean)(object4 = (Boolean)((zzdn)(object5 = this.zzf((zzre)object5, set, (zzdi)object4))).zza());
                        if (!bl4) {
                            object3 = Boolean.FALSE;
                            zzfp.zzb(object3);
                            bl5 = ((zzdn)object5).zzb();
                            object2 = new zzdn(object3, bl5);
                            break block9;
                        }
                        if (bl6 && (bl6 = ((zzdn)object5).zzb())) {
                            bl6 = true;
                            continue;
                        }
                        bl6 = false;
                        object2 = null;
                    }
                    object3 = Boolean.TRUE;
                    zzfp.zzb(object3);
                    object2 = object5 = new zzdn(object3, bl6);
                }
                object3 = (Boolean)((zzdn)object2).zza();
                boolean bl7 = (Boolean)object3;
                if (bl7) {
                    zzem2.zza(zzri2, hashSet, hashSet2, zzdj2);
                }
                if (bl2 && (bl2 = ((zzdn)object2).zzb())) continue block0;
                bl2 = false;
            }
            break;
        }
        hashSet.removeAll(hashSet2);
        object = new zzdn(hashSet, bl2);
        return object;
    }

    private final zzdn zzm(String object, Set set, zzdh object2) {
        int n3;
        int n4;
        int bl2 = this.zzj;
        int n7 = 1;
        this.zzj = n4 = bl2 + n7;
        object2 = (zzen)this.zzl.zza(object);
        if (object2 == null) {
            int n8;
            zzcw zzcw2;
            zzek zzek2;
            object2 = (zzeo)this.zzh.get(object);
            if (object2 == null) {
                int n42;
                this.zzi();
                this.zzj = n42 = this.zzj + -1;
                return zza;
            }
            Object object3 = ((zzeo)object2).zzf();
            Map map2 = ((zzeo)object2).zzc();
            Map map3 = ((zzeo)object2).zzb();
            Map map4 = ((zzeo)object2).zze();
            Map map5 = ((zzeo)object2).zzd();
            zzdk zzdk2 = new zzdk();
            Object object4 = zzek2;
            Object object5 = this;
            zzek2 = new zzek(this, map2, map3, map4, map5);
            object4 = (Set)((zzdn)(object3 = this.zzl((Set)object3, set, zzek2, zzdk2))).zza();
            boolean bl3 = object4.isEmpty();
            if (bl3) {
                object2 = ((zzeo)object2).zza();
            } else {
                object2 = (Set)((zzdn)object3).zza();
                int n10 = object2.size();
                if (n10 > n7) {
                    this.zzi();
                }
                object2 = (zzre)((Set)((zzdn)object3).zza()).iterator().next();
            }
            if (object2 == null) {
                int n32;
                this.zzj = n32 = this.zzj + -1;
                return zza;
            }
            object4 = this.zze;
            object5 = new zzdi();
            object4 = this.zzn((Map)object4, (zzre)object2, set, (zzdi)object5);
            boolean bl4 = ((zzdn)object3).zzb();
            object5 = null;
            if (!bl4 || !(bl4 = ((zzdn)object4).zzb())) {
                n7 = 0;
                zzcw2 = null;
            }
            object3 = zza;
            if (object4 != object3) {
                object4 = (zzap)((zzdn)object4).zza();
                object3 = new zzdn(object4, n7 != 0);
            }
            object2 = ((zzre)object2).zza();
            n7 = (int)(((zzdn)object3).zzb() ? 1 : 0);
            if (n7 != 0) {
                zzcw2 = this.zzl;
                object4 = new zzen((zzdn)object3, (zzap)object2);
                zzcw2.zzb(object, object4);
            }
            this.zzk((zzap)object2, set);
            this.zzj = n8 = this.zzj + -1;
            return object3;
        }
        object = ((zzen)object2).zzb();
        this.zzk((zzap)object, set);
        this.zzj = n3 = this.zzj + -1;
        return ((zzen)object2).zzc();
    }

    private final zzdn zzn(Map object, zzre zzre2, Set set, zzdi object2) {
        object2 = zzre2.zzc();
        Object object3 = com.google.android.gms.internal.gtm.zzb.zzbo.toString();
        if ((object2 = (zzap)object2.get(object3)) == null) {
            return zza;
        }
        if ((object = (zzbp)object.get(object2 = ((zzap)object2).zzn())) == null) {
            String.valueOf(object2).concat(" has no backing implementation.");
            return zza;
        }
        object2 = (zzdn)this.zzk.zza(zzre2);
        if (object2 == null) {
            object2 = new Object();
            object3 = zzre2.zzc().entrySet().iterator();
            boolean bl2 = true;
            boolean bl3 = true;
            while (true) {
                boolean bl4 = object3.hasNext();
                Object object4 = null;
                if (!bl4) break;
                Object object5 = (Map.Entry)object3.next();
                Object object6 = (String)object5.getKey();
                object6 = (zzap)object5.getValue();
                Object object7 = (zzap)object5.getValue();
                object7 = new zzdl();
                if ((object6 = this.zzo((zzap)object6, set, (zzdl)object7)) == (object7 = zza)) {
                    return object7;
                }
                boolean bl5 = ((zzdn)object6).zzb();
                if (bl5) {
                    object4 = (String)object5.getKey();
                    object7 = (zzap)((zzdn)object6).zza();
                    zzre2.zzd((String)object4, (zzap)object7);
                } else {
                    bl3 = false;
                }
                object5 = (String)object5.getKey();
                object4 = (zzap)((zzdn)object6).zza();
                ((HashMap)object2).put(object5, object4);
            }
            set = ((HashMap)object2).keySet();
            boolean bl6 = ((zzbp)object).zzg(set);
            if (!bl6) {
                ((zzbp)object).zzf().toString();
                String.valueOf(((HashMap)object2).keySet());
                return zza;
            }
            if (!bl3 || !(bl6 = ((zzbp)object).zzb())) {
                bl2 = false;
            }
            object = ((zzbp)object).zza((Map)object2);
            set = new zzdn(object, bl2);
            if (bl2) {
                object = this.zzk;
                ((zzcw)object).zzb(zzre2, set);
            }
            object = (zzap)((zzdn)((Object)set)).zza();
            return set;
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzdn zzo(zzap object, Set object2, zzdl object3) {
        int n3;
        block18: {
            int n4;
            block23: {
                int n7;
                block22: {
                    block21: {
                        block19: {
                            int n8;
                            block20: {
                                n8 = ((zzap)object).zzN();
                                if (n8 == 0) {
                                    return new zzdn(object, true);
                                }
                                n8 = ((zzap)object).zzO();
                                n3 = 2;
                                n7 = 0;
                                if (n8 == n3) break block18;
                                n3 = 3;
                                if (n8 == n3) break block19;
                                n3 = 4;
                                if (n8 == n3) break block20;
                                n3 = 7;
                                if (n8 != n3) {
                                    object = Integer.toString(((zzap)object).zzO());
                                    "Unknown type: ".concat((String)object);
                                    return zza;
                                }
                                break block21;
                            }
                            object3 = ((zzap)object).zzo();
                            n8 = (int)(object2.contains(object3) ? 1 : 0);
                            if (n8 != 0) {
                                ((zzap)object).zzo();
                                object2.toString();
                                return zza;
                            }
                            break block22;
                        }
                        object3 = (zzak)zzrm.zza((zzap)object).zzaa();
                        n3 = ((zzap)object).zzc();
                        if (n3 != (n4 = ((zzap)object).zzd())) {
                            object = ((zzacf)object).toString();
                            "Invalid serving value: ".concat((String)object);
                            return zza;
                        }
                        break block23;
                    }
                    object3 = (zzak)zzrm.zza((zzap)object).zzaa();
                    ((zzak)object3).zzm();
                    n3 = 0;
                    Object var7_7 = null;
                    while (true) {
                        zzdn zzdn2;
                        int n10;
                        if (n3 >= (n10 = ((zzap)object).zze())) {
                            object2 = (zzap)((zzaca)object3).zzB();
                            return new zzdn(object2, false);
                        }
                        Object object4 = ((zzap)object).zzm(n3);
                        zzdl zzdl2 = new zzdl();
                        if ((object4 = this.zzo((zzap)object4, (Set)object2, zzdl2)) == (zzdn2 = zza)) {
                            return zzdn2;
                        }
                        object4 = (zzap)((zzdn)object4).zza();
                        ((zzak)object3).zzh((zzap)object4);
                        ++n3;
                    }
                }
                object3 = ((zzap)object).zzo();
                object2.add(object3);
                object3 = ((zzap)object).zzo();
                com.google.android.gms.internal.gtm.zzam[] zzamArray = new zzdh();
                object3 = this.zzm((String)object3, (Set)object2, (zzdh)zzamArray);
                zzamArray = ((zzap)object).zzq();
                com.google.android.gms.internal.gtm.zzam[] zzamArray2 = new com.google.android.gms.internal.gtm.zzam[]{};
                zzamArray = zzamArray.toArray(zzamArray2);
                int n14 = zzamArray.length;
                while (true) {
                    int n15;
                    if (n7 >= n14) {
                        object = ((zzap)object).zzo();
                        object2.remove(object);
                        return object3;
                    }
                    com.google.android.gms.internal.gtm.zzam zzam2 = zzamArray[n7];
                    Object object5 = zzfp.zzk((zzap)((zzdn)object3).zza());
                    int n16 = object5 instanceof String;
                    if (n16 != 0 && (n15 = zzam2.ordinal()) == (n16 = 11)) {
                        try {
                            Object object6 = ((zzdn)object3).zza();
                            zzap zzap2 = (zzap)object6;
                            Object object7 = zzfp.zzk(zzap2);
                            String string3 = zzfp.zzm(object7);
                            string3 = zzfs.zza(string3);
                            zzap zzap3 = zzfp.zzb(string3);
                            boolean bl2 = ((zzdn)object3).zzb();
                            object3 = object5 = new zzdn(zzap3, bl2);
                        }
                        catch (UnsupportedEncodingException unsupportedEncodingException) {}
                    }
                    ++n7;
                }
            }
            ((zzak)object3).zzk();
            ((zzak)object3).zzl();
            n3 = 0;
            Object var7_9 = null;
            while (true) {
                if (n3 >= (n4 = ((zzap)object).zzc())) {
                    object2 = (zzap)((zzaca)object3).zzB();
                    return new zzdn(object2, false);
                }
                Object object8 = ((zzap)object).zzk(n3);
                zzdl zzdl3 = new zzdl();
                object8 = this.zzo((zzap)object8, (Set)object2, zzdl3);
                zzap zzap4 = ((zzap)object).zzl(n3);
                Object object9 = new zzdl();
                zzdn zzdn3 = this.zzo(zzap4, (Set)object2, (zzdl)object9);
                object9 = zza;
                if (object8 == object9) return object9;
                if (zzdn3 == object9) {
                    return object9;
                }
                object8 = (zzap)((zzdn)object8).zza();
                ((zzak)object3).zzf((zzap)object8);
                object8 = (zzap)zzdn3.zza();
                ((zzak)object3).zzg((zzap)object8);
                ++n3;
            }
        }
        object3 = (zzak)zzrm.zza((zzap)object).zzaa();
        ((zzak)object3).zzj();
        n3 = 0;
        Object var7_10 = null;
        while (true) {
            zzdn zzdn4;
            int n17;
            if (n3 >= (n17 = ((zzap)object).zza())) {
                object2 = (zzap)((zzaca)object3).zzB();
                return new zzdn(object2, false);
            }
            Object object10 = ((zzap)object).zzj(n3);
            zzdl zzdl4 = new zzdl();
            if ((object10 = this.zzo((zzap)object10, (Set)object2, zzdl4)) == (zzdn4 = zza)) {
                return zzdn4;
            }
            object10 = (zzap)((zzdn)object10).zza();
            ((zzak)object3).zze((zzap)object10);
            ++n3;
        }
    }

    public final zzdn zza(String string2) {
        this.zzj = 0;
        HashSet hashSet = new HashSet();
        zzdh zzdh2 = new zzdh();
        return this.zzm(string2, hashSet, zzdh2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb() {
        synchronized (this) {
            return this.zzi;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String iterator) {
        synchronized (this) {
            try {
                this.zzd((String)((Object)iterator));
                iterator = new Iterator();
                Object object = new HashSet();
                Object object2 = new zzel(this);
                HashSet hashSet = this.zzf;
                iterator = this.zzl(hashSet, (Set)object, (zzem)object2, (zzdk)((Object)iterator));
                iterator = ((zzdn)((Object)iterator)).zza();
                iterator = (Set)((Object)iterator);
                iterator = iterator.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = iterator.hasNext())) {
                        iterator = null;
                        this.zzd(null);
                        return;
                    }
                    object = iterator.next();
                    object = (zzre)object;
                    object2 = this.zzc;
                    hashSet = new HashSet();
                    zzdi zzdi2 = new zzdi();
                    this.zzn((Map)object2, (zzre)object, hashSet, zzdi2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String string2) {
        synchronized (this) {
            this.zzi = string2;
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void zze(List var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [18 : 171->175)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final zzdn zzf(zzre object, Set object2, zzdi object3) {
        Map map2 = this.zzd;
        object = this.zzn(map2, (zzre)object, (Set)object2, (zzdi)object3);
        object2 = zzfp.zzf(zzfp.zzk((zzap)((zzdn)object).zza()));
        zzfp.zzb(object2);
        boolean bl2 = ((zzdn)object).zzb();
        object3 = new zzdn(object2, bl2);
        return object3;
    }
}

