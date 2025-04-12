/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 */
package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzf$zza;
import com.google.android.gms.internal.measurement.zzgf$zzg;
import com.google.android.gms.internal.measurement.zzgf$zzg$zza;
import com.google.android.gms.internal.measurement.zzgf$zzh;
import com.google.android.gms.internal.measurement.zzgf$zzh$zza;
import com.google.android.gms.internal.measurement.zzgf$zzj;
import com.google.android.gms.internal.measurement.zzgf$zzj$zzb;
import com.google.android.gms.internal.measurement.zzgf$zzk;
import com.google.android.gms.internal.measurement.zzgf$zzk$zza;
import com.google.android.gms.internal.measurement.zzgf$zzl;
import com.google.android.gms.internal.measurement.zzgf$zzl$zzb;
import com.google.android.gms.internal.measurement.zzgf$zzp;
import com.google.android.gms.internal.measurement.zzgf$zzp$zza;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzh;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpn;
import com.google.android.gms.measurement.internal.zzpo;
import com.google.android.gms.measurement.internal.zzx;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzlt
extends zzot {
    public zzlt(zzou zzou2) {
        super(zzou2);
    }

    private static String zza(String object, String string2) {
        object = new SecurityException("This implementation should not be used.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zza(zzbl zzbl2, String string2) {
        Throwable throwable2;
        SecurityException securityException3;
        Object object;
        Object object2;
        block42: {
            Object object3;
            Object object4;
            long l2;
            Object object5;
            int n3;
            long l3;
            boolean bl2;
            long l4;
            long l7;
            long l8;
            Object object6;
            Object object7;
            Object object8;
            Object object9;
            int n4;
            Object object10;
            String string3;
            Object object11;
            zzlt zzlt2;
            block40: {
                long l12;
                zzlt2 = this;
                object11 = zzbl2;
                string3 = string2;
                object2 = "_r";
                this.zzv();
                this.zzu.zzaa();
                Preconditions.checkNotNull(zzbl2);
                Preconditions.checkNotEmpty(string2);
                object = zzbl2.zza;
                object10 = "_iap";
                n4 = ((String)object10).equals(object);
                if (n4 == 0 && (n4 = ((String)(object = "_iapx")).equals(object10 = zzbl2.zza)) == 0) {
                    object2 = this.zzj().zzc();
                    object11 = zzbl2.zza;
                    ((zzgq)object2).zza("Generating a payload for this event is not available. package_name, event_name", string2, object11);
                    return null;
                }
                object9 = zzgf$zzj.zzb();
                object = this.zzh();
                ((zzar)object).zzq();
                object = this.zzh();
                object8 = ((zzar)object).zzd(string3);
                object7 = null;
                if (object8 == null) {
                    object11 = this.zzj();
                    object11 = ((zzgo)object11).zzc();
                    object2 = "Log and bundle not available. package_name";
                    ((zzgq)object11).zza((String)object2, string3);
                    object11 = new byte[0];
                    this.zzh().zzr();
                    return object11;
                }
                n4 = ((zzh)object8).zzar();
                if (n4 == 0) {
                    object11 = this.zzj();
                    object11 = ((zzgo)object11).zzc();
                    object2 = "Log and bundle disabled. package_name";
                    ((zzgq)object11).zza((String)object2, string3);
                    object11 = new byte[0];
                    this.zzh().zzr();
                    return object11;
                }
                object = zzgf$zzk.zzx();
                int n7 = 1;
                object = ((zzgf$zzk$zza)object).zzh(n7);
                object10 = "android";
                object6 = ((zzgf$zzk$zza)object).zzp((String)object10);
                object = ((zzh)object8).zzac();
                n4 = TextUtils.isEmpty((CharSequence)object);
                if (n4 == 0) {
                    object = ((zzh)object8).zzac();
                    ((zzgf$zzk$zza)object6).zzb((String)object);
                }
                if ((n4 = TextUtils.isEmpty((CharSequence)(object = ((zzh)object8).zzae()))) == 0) {
                    object = ((zzh)object8).zzae();
                    object = Preconditions.checkNotNull(object);
                    object = (String)object;
                    ((zzgf$zzk$zza)object6).zzd((String)object);
                }
                if ((n4 = TextUtils.isEmpty((CharSequence)(object = ((zzh)object8).zzaf()))) == 0) {
                    object = ((zzh)object8).zzaf();
                    object = Preconditions.checkNotNull(object);
                    object = (String)object;
                    ((zzgf$zzk$zza)object6).zze((String)object);
                }
                if ((l8 = (l12 = (l7 = ((zzh)object8).zze()) - (l4 = 0x80000000L)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) {
                    l7 = ((zzh)object8).zze();
                    bl2 = (int)l7;
                    ((zzgf$zzk$zza)object6).zze((int)(bl2 ? 1 : 0));
                }
                l7 = ((zzh)object8).zzq();
                object = ((zzgf$zzk$zza)object6).zzg(l7);
                l3 = ((zzh)object8).zzo();
                ((zzgf$zzk$zza)object).zze(l3);
                object = ((zzh)object8).zzah();
                object10 = ((zzh)object8).zzaa();
                n3 = TextUtils.isEmpty((CharSequence)object);
                if (n3 == 0) {
                    ((zzgf$zzk$zza)object6).zzm((String)object);
                } else {
                    n4 = TextUtils.isEmpty((CharSequence)object10);
                    if (n4 == 0) {
                        ((zzgf$zzk$zza)object6).zza((String)object10);
                    }
                }
                l7 = ((zzh)object8).zzw();
                ((zzgf$zzk$zza)object6).zzk(l7);
                object = zzlt2.zzg;
                object = ((zzou)object).zzb(string3);
                l3 = ((zzh)object8).zzn();
                ((zzgf$zzk$zza)object6).zzd(l3);
                object10 = zzlt2.zzu;
                bl2 = ((zzic)object10).zzae();
                if (bl2 && (bl2 = (boolean)((zzai)(object10 = this.zze())).zzj((String)(object5 = ((zzgf$zzk$zza)object6).zzu()))) && (bl2 = (boolean)((zzjj)object).zzg()) && !(bl2 = (boolean)TextUtils.isEmpty(null))) {
                    ((zzgf$zzk$zza)object6).zzj(null);
                }
                object10 = ((zzjj)object).zze();
                ((zzgf$zzk$zza)object6).zzg((String)object10);
                bl2 = ((zzjj)object).zzg();
                if (!bl2 || !(bl2 = (boolean)((zzh)object8).zzaq())) break block40;
                object10 = this.zzo();
                object5 = ((zzh)object8).zzac();
                object10 = ((zznp)object10).zza((String)object5, (zzjj)object);
                n3 = ((zzh)object8).zzaq();
                if (n3 == 0 || object10 == null) break block40;
                object5 = ((Pair)object10).first;
                n3 = TextUtils.isEmpty((CharSequence)(object5 = (CharSequence)object5));
                if (n3 != 0) break block40;
                try {
                    object5 = ((Pair)object10).first;
                    object5 = (String)object5;
                    l2 = ((zzbl)object11).zzd;
                    object4 = Long.toString(l2);
                    object5 = zzlt.zza((String)object5, (String)object4);
                    ((zzgf$zzk$zza)object6).zzq((String)object5);
                }
                catch (SecurityException securityException2) {
                    object2 = this.zzj();
                    object2 = ((zzgo)object2).zzc();
                    object = "Resettable device id encryption failed";
                    Object object12 = securityException2.getMessage();
                    ((zzgq)object2).zza((String)object, object12);
                    object12 = new byte[0];
                    this.zzh().zzr();
                    return object12;
                }
                object10 = ((Pair)object10).second;
                if (object10 != null) {
                    object10 = (Boolean)object10;
                    bl2 = (Boolean)object10;
                    ((zzgf$zzk$zza)object6).zzc(bl2);
                }
            }
            try {
                long l14;
                long l15;
                long l16;
                zzh zzh2;
                long l17;
                zzgf$zzk$zza zzgf$zzk$zza;
                long l18;
                Object object13;
                Object object14;
                String string4;
                Object object15;
                Object object16;
                int n8;
                block43: {
                    block41: {
                        object10 = this.zzf();
                        ((zzji)object10).zzad();
                        object10 = Build.MODEL;
                        object10 = ((zzgf$zzk$zza)object6).zzi((String)object10);
                        object5 = this.zzf();
                        ((zzji)object5).zzad();
                        object5 = Build.VERSION.RELEASE;
                        object10 = ((zzgf$zzk$zza)object10).zzo((String)object5);
                        object5 = this.zzf();
                        l4 = ((zzbf)object5).zzc();
                        n8 = (int)l4;
                        object10 = ((zzgf$zzk$zza)object10).zzj(n8);
                        object5 = this.zzf();
                        object5 = ((zzbf)object5).zzg();
                        ((zzgf$zzk$zza)object10).zzs((String)object5);
                        try {
                            n4 = ((zzjj)object).zzh();
                            if (n4 == 0 || (object = ((zzh)object8).zzad()) == null) break block41;
                            object = ((zzh)object8).zzad();
                            object = Preconditions.checkNotNull(object);
                            object = (String)object;
                            l3 = ((zzbl)object11).zzd;
                            object10 = Long.toString(l3);
                            object = zzlt.zza((String)object, (String)object10);
                            ((zzgf$zzk$zza)object6).zzc((String)object);
                        }
                        catch (SecurityException securityException3) {
                            bl2 = false;
                            object10 = null;
                            break block42;
                        }
                    }
                    if ((n4 = TextUtils.isEmpty((CharSequence)(object = ((zzh)object8).zzag()))) == 0) {
                        object = ((zzh)object8).zzag();
                        object = Preconditions.checkNotNull(object);
                        object = (String)object;
                        ((zzgf$zzk$zza)object6).zzl((String)object);
                    }
                    object = ((zzh)object8).zzac();
                    object10 = this.zzh();
                    object10 = ((zzar)object10).zzk((String)object);
                    object5 = object10.iterator();
                    while ((n8 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                        object4 = object5.next();
                        object4 = (zzpo)object4;
                        object16 = "_lte";
                        object15 = ((zzpo)object4).zzc;
                        l8 = (long)((String)object16).equals(object15);
                        if (l8 == false) continue;
                        break block43;
                    }
                    n8 = 0;
                    object4 = null;
                }
                long l19 = 0L;
                if (object4 == null || (object5 = ((zzpo)object4).zze) == null) {
                    string4 = "auto";
                    object14 = "_lte";
                    object4 = this.zzb();
                    long l20 = object4.currentTimeMillis();
                    Long l21 = l19;
                    object13 = object;
                    object5 = new zzpo((String)object, string4, (String)object14, l20, l21);
                    object10.add(object5);
                    object = this.zzh();
                    ((zzar)object).zza((zzpo)object5);
                }
                n4 = object10.size();
                object = new zzgf$zzp[n4];
                object5 = null;
                for (n3 = 0; n3 < (n8 = object10.size()); ++n3) {
                    object4 = zzgf$zzp.zze();
                    object16 = object10.get(n3);
                    object16 = (zzpo)object16;
                    object16 = ((zzpo)object16).zzc;
                    object4 = ((zzgf$zzp$zza)object4).zza((String)object16);
                    object16 = object10.get(n3);
                    object16 = (zzpo)object16;
                    l18 = ((zzpo)object16).zzd;
                    object4 = ((zzgf$zzp$zza)object4).zzb(l18);
                    object16 = this.h_();
                    object15 = object10.get(n3);
                    object15 = (zzpo)object15;
                    object15 = ((zzpo)object15).zze;
                    ((zzpj)object16).zza((zzgf$zzp$zza)object4, object15);
                    object4 = ((zzkg$zza)object4).zzaj();
                    object4 = (zzkg)object4;
                    object[n3] = object4 = (zzgf$zzp)object4;
                }
                object = Arrays.asList(object);
                ((zzgf$zzk$zza)object6).zze((Iterable)object);
                object = zzlt2.zzg;
                ((zzou)object).zza((zzh)object8, (zzgf$zzk$zza)object6);
                object = zzlt2.zzg;
                ((zzou)object).zzb((zzh)object8, (zzgf$zzk$zza)object6);
                object = zzgs.zza(zzbl2);
                object10 = this.zzs();
                object5 = ((zzgs)object).zzc;
                object4 = this.zzh();
                object4 = ((zzar)object4).zzc(string3);
                ((zzpn)object10).zza((Bundle)object5, (Bundle)object4);
                object10 = this.zzs();
                object5 = this.zze();
                n3 = ((zzai)object5).zzb(string3);
                ((zzpn)object10).zza((zzgs)object, n3);
                object16 = ((zzgs)object).zzc;
                object = "_c";
                l3 = 1L;
                object16.putLong((String)object, l3);
                object = this.zzj();
                object = ((zzgo)object).zzc();
                object4 = "Marking in-app purchase as real-time";
                ((zzgq)object).zza((String)object4);
                object16.putLong((String)object2, l3);
                object = "_o";
                object4 = ((zzbl)object11).zzc;
                object16.putString((String)object, (String)object4);
                object = this.zzs();
                object4 = ((zzgf$zzk$zza)object6).zzu();
                object15 = ((zzh)object8).zzam();
                n4 = (int)(((zzpn)object).zzd((String)object4, (String)object15) ? 1 : 0);
                if (n4 != 0) {
                    object = this.zzs();
                    object4 = "_dbg";
                    object15 = l3;
                    ((zzpn)object).zza((Bundle)object16, (String)object4, object15);
                    object = this.zzs();
                    object10 = l3;
                    ((zzpn)object).zza((Bundle)object16, (String)object2, object10);
                }
                object2 = this.zzh();
                object = ((zzbl)object11).zza;
                if ((object2 = ((zzar)object2).zzd(string3, (String)object)) == null) {
                    object10 = ((zzbl)object11).zza;
                    l4 = ((zzbl)object11).zzd;
                    string4 = null;
                    long l22 = 0L;
                    long l23 = 0L;
                    long l24 = 0L;
                    object2 = object13;
                    object = string2;
                    long l25 = l4;
                    l4 = l22;
                    object14 = object16;
                    l18 = l23;
                    zzgf$zzk$zza = object6;
                    l17 = l25;
                    zzh2 = object8;
                    object3 = object9;
                    object9 = null;
                    string3 = null;
                    object7 = object13 = new zzbh(string2, (String)object10, l22, l23, l25, l24, null, null, null, null);
                    l17 = l19;
                } else {
                    object14 = object16;
                    zzgf$zzk$zza = object6;
                    zzh2 = object8;
                    object3 = object9;
                    l7 = ((zzbh)object2).zzf;
                    l4 = ((zzbl)object11).zzd;
                    object13 = ((zzbh)object2).zza(l4);
                    l17 = l7;
                    object7 = object13;
                }
                object2 = this.zzh();
                ((zzar)object2).zza((zzbh)object7);
                object = zzlt2.zzu;
                object10 = ((zzbl)object11).zzc;
                object4 = ((zzbl)object11).zza;
                l18 = ((zzbl)object11).zzd;
                object2 = object9;
                object5 = string2;
                object8 = object14;
                object9 = new zzbe((zzic)object, (String)object10, string2, (String)object4, l18, l17, (Bundle)object14);
                object2 = zzgf$zzf.zze();
                l7 = ((zzbe)object9).zzd;
                object2 = ((zzgf$zzf$zza)object2).zzb(l7);
                object = ((zzbe)object9).zzb;
                object2 = ((zzgf$zzf$zza)object2).zza((String)object);
                l7 = ((zzbe)object9).zze;
                object2 = ((zzgf$zzf$zza)object2).zza(l7);
                object = ((zzbe)object9).zzf;
                object = ((zzbg)object).iterator();
                while (bl2 = object.hasNext()) {
                    object10 = object.next();
                    object10 = (String)object10;
                    object5 = zzgf$zzh.zze();
                    object5 = ((zzgf$zzh$zza)object5).zza((String)object10);
                    object4 = ((zzbe)object9).zzf;
                    if ((object10 = ((zzbg)object4).zzc((String)object10)) == null) continue;
                    object4 = this.h_();
                    ((zzpj)object4).zza((zzgf$zzh$zza)object5, object10);
                    ((zzgf$zzf$zza)object2).zza((zzgf$zzh$zza)object5);
                }
                object = zzgf$zzk$zza;
                object10 = zzgf$zzk$zza.zza((zzgf$zzf$zza)object2);
                object5 = zzgf$zzl.zza();
                object4 = zzgf$zzg.zza();
                l18 = object7.zzc;
                object4 = ((zzgf$zzg$zza)object4).zza(l18);
                object11 = ((zzbl)object11).zza;
                object11 = ((zzgf$zzg$zza)object4).zza((String)object11);
                object11 = ((zzgf$zzl$zzb)object5).zza((zzgf$zzg$zza)object11);
                ((zzgf$zzk$zza)object10).zza((zzgf$zzl$zzb)object11);
                object5 = this.zzg();
                object4 = zzh2.zzac();
                object16 = Collections.emptyList();
                object15 = zzgf$zzk$zza.zzac();
                l17 = ((zzgf$zzf$zza)object2).zzc();
                Long l26 = l17;
                long l27 = ((zzgf$zzf$zza)object2).zzc();
                object6 = l27;
                object8 = null;
                object11 = ((zzx)object5).zza((String)object4, (List)object16, (List)object15, l26, (Long)object6, false);
                zzgf$zzk$zza.zza((Iterable)object11);
                int n10 = ((zzgf$zzf$zza)object2).zzg();
                if (n10 != 0) {
                    l3 = ((zzgf$zzf$zza)object2).zzc();
                    object11 = zzgf$zzk$zza.zzj(l3);
                    l3 = ((zzgf$zzf$zza)object2).zzc();
                    ((zzgf$zzk$zza)object11).zzf(l3);
                }
                if ((n10 = (l16 = (l3 = zzh2.zzs()) - l19) == 0L ? 0 : (l16 < 0L ? -1 : 1)) != 0) {
                    ((zzgf$zzk$zza)object).zzh(l3);
                }
                if ((l15 = (l14 = (l2 = zzh2.zzu()) - l19) == 0L ? 0 : (l14 < 0L ? -1 : 1)) != false) {
                    ((zzgf$zzk$zza)object).zzi(l2);
                } else if (n10 != 0) {
                    ((zzgf$zzk$zza)object).zzi(l3);
                }
                object11 = zzh2.zzal();
                l15 = (long)zzpf.zza();
                if (l15 != false) {
                    object2 = this.zze();
                    object10 = zzbn.zzcg;
                    object5 = string2;
                    l15 = (long)((zzai)object2).zze(string2, (zzfx)object10);
                    if (l15 != false && object11 != null) {
                        ((zzgf$zzk$zza)object).zzr((String)object11);
                    }
                } else {
                    object5 = string2;
                }
                zzh2.zzap();
                l2 = zzh2.zzt();
                n10 = (int)l2;
                object11 = ((zzgf$zzk$zza)object).zzf(n10);
                l2 = 114010L;
                object11 = ((zzgf$zzk$zza)object11).zzm(l2);
                object2 = this.zzb();
                l2 = object2.currentTimeMillis();
                object11 = ((zzgf$zzk$zza)object11).zzl(l2);
                l15 = 1;
                ((zzgf$zzk$zza)object11).zzd((boolean)l15);
                object11 = zzlt2.zzg;
                object2 = ((zzgf$zzk$zza)object).zzu();
                ((zzou)object11).zza((String)object2, (zzgf$zzk$zza)object);
                object11 = object3;
                ((zzgf$zzj$zzb)object3).zza((zzgf$zzk$zza)object);
                l2 = ((zzgf$zzk$zza)object).zzf();
                object2 = zzh2;
                zzh2.zzr(l2);
                l7 = ((zzgf$zzk$zza)object).zze();
                zzh2.zzp(l7);
                object = this.zzh();
                bl2 = false;
                object10 = null;
                ((zzar)object).zza(zzh2, false, false);
                object2 = this.zzh();
                ((zzar)object2).zzx();
                object2 = this.zzh();
                ((zzar)object2).zzr();
            }
            catch (Throwable throwable2) {}
            try {
                object2 = this.h_();
                object11 = ((zzkg$zza)object3).zzaj();
                object11 = (zzkg)object11;
                object11 = (zzgf$zzj)object11;
                object11 = ((zzio)object11).zzce();
                return ((zzpj)object2).zzb((byte[])object11);
            }
            catch (IOException iOException) {
                object2 = this.zzj().zzg();
                object10 = zzgo.zza(string2);
                ((zzgq)object2).zza("Data loss. Failed to bundle and serialize. appId", object10, iOException);
                return null;
            }
        }
        object2 = this.zzj();
        object2 = ((zzgo)object2).zzc();
        object = "app instance id encryption failed";
        Object object17 = securityException3.getMessage();
        ((zzgq)object2).zza((String)object, object17);
        object17 = new byte[0];
        this.zzh().zzr();
        return object17;
        this.zzh().zzr();
        throw throwable2;
    }

    public final boolean zzc() {
        return false;
    }
}

