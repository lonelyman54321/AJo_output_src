/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions$Builder;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzfgz;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfhn;
import java.util.ArrayList;
import java.util.List;

public final class zzfho {
    public final zzfk zza;
    public final zzbnz zzb;
    public final zzepc zzc;
    public final zzl zzd;
    public final zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbhk zzi;
    public final zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzcb zzn;
    public final zzfhb zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final zzcf zzt;

    public /* synthetic */ zzfho(zzfhm zzfhm2, zzfhn zzfhn2) {
        Object object;
        int n3;
        zzfho zzfho2 = this;
        Object object2 = zzfhm.zzg(zzfhm2);
        this.zze = object2;
        this.zzf = object2 = zzfhm.zzK(zzfhm2);
        this.zzt = object2 = zzfhm.zzT(zzfhm2);
        int n4 = zzfhm.zze((zzfhm)zzfhm2).zza;
        long l2 = zzfhm.zze((zzfhm)zzfhm2).zzb;
        Bundle bundle = zzfhm.zze((zzfhm)zzfhm2).zzc;
        int n7 = zzfhm.zze((zzfhm)zzfhm2).zzd;
        List list = zzfhm.zze((zzfhm)zzfhm2).zze;
        boolean bl2 = zzfhm.zze((zzfhm)zzfhm2).zzf;
        int n8 = zzfhm.zze((zzfhm)zzfhm2).zzg;
        Object object3 = zzfhm.zze(zzfhm2);
        int n10 = ((zzl)object3).zzh;
        boolean bl3 = true;
        if (n10 == 0 && (n10 = zzfhm.zzR(zzfhm2)) == 0) {
            n10 = 0;
            object3 = null;
            bl3 = false;
        }
        String string2 = zzfhm.zze((zzfhm)zzfhm2).zzi;
        zzfh zzfh2 = zzfhm.zze((zzfhm)zzfhm2).zzj;
        Location location = zzfhm.zze((zzfhm)zzfhm2).zzk;
        String string3 = zzfhm.zze((zzfhm)zzfhm2).zzl;
        Bundle bundle2 = zzfhm.zze((zzfhm)zzfhm2).zzm;
        Bundle bundle3 = zzfhm.zze((zzfhm)zzfhm2).zzn;
        List list2 = zzfhm.zze((zzfhm)zzfhm2).zzo;
        String string4 = zzfhm.zze((zzfhm)zzfhm2).zzp;
        String string5 = zzfhm.zze((zzfhm)zzfhm2).zzq;
        boolean bl4 = zzfhm.zze((zzfhm)zzfhm2).zzr;
        zzc zzc2 = zzfhm.zze((zzfhm)zzfhm2).zzs;
        int n14 = zzfhm.zze((zzfhm)zzfhm2).zzt;
        String string6 = zzfhm.zze((zzfhm)zzfhm2).zzu;
        List list3 = zzfhm.zze((zzfhm)zzfhm2).zzv;
        int n15 = com.google.android.gms.ads.internal.util.zzt.zza(zzfhm.zze((zzfhm)zzfhm2).zzw);
        String string7 = zzfhm.zze((zzfhm)zzfhm2).zzx;
        n10 = zzfhm.zze((zzfhm)zzfhm2).zzy;
        long l3 = zzfhm.zze((zzfhm)zzfhm2).zzz;
        object3 = object2;
        zzfho2.zzd = object2 = new zzl(n4, l2, bundle, n7, list, bl2, n8, bl3, string2, zzfh2, location, string3, bundle2, bundle3, list2, string4, string5, bl4, zzc2, n14, string6, list3, n15, string7, n10, l3);
        object2 = zzfhm.zzk(zzfhm2);
        n10 = 0;
        object3 = null;
        if (object2 != null) {
            object2 = zzfhm.zzk(zzfhm2);
        } else {
            object2 = zzfhm.zzl(zzfhm2);
            if (object2 != null) {
                object2 = zzfhm.zzl((zzfhm)zzfhm2).zzf;
            } else {
                n3 = 0;
                object2 = null;
            }
        }
        zzfho2.zza = object2;
        zzfho2.zzg = object2 = zzfhm.zzM(zzfhm2);
        zzfho2.zzh = object2 = zzfhm.zzN(zzfhm2);
        object2 = zzfhm.zzM(zzfhm2);
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = zzfhm.zzl(zzfhm2);
            if (object2 == null) {
                object = new NativeAdOptions$Builder();
                object = ((NativeAdOptions$Builder)object).build();
                object2 = new zzbhk((NativeAdOptions)object);
            } else {
                object2 = zzfhm.zzl(zzfhm2);
            }
        }
        zzfho2.zzi = object2;
        zzfho2.zzj = object2 = zzfhm.zzi(zzfhm2);
        zzfho2.zzk = n3 = zzfhm.zza(zzfhm2);
        zzfho2.zzl = object2 = zzfhm.zzc(zzfhm2);
        zzfho2.zzm = object2 = zzfhm.zzd(zzfhm2);
        zzfho2.zzn = object2 = zzfhm.zzj(zzfhm2);
        zzfho2.zzb = object2 = zzfhm.zzm(zzfhm2);
        object2 = zzfhm.zzo(zzfhm2);
        zzfho2.zzo = object = new zzfhb((zzfgz)object2, null);
        n3 = (int)(zzfhm.zzO(zzfhm2) ? 1 : 0);
        zzfho2.zzp = n3;
        n3 = (int)(zzfhm.zzP(zzfhm2) ? 1 : 0);
        zzfho2.zzq = n3;
        zzfho2.zzc = object2 = zzfhm.zzn(zzfhm2);
        n3 = (int)(zzfhm.zzQ(zzfhm2) ? 1 : 0);
        zzfho2.zzr = n3;
        object2 = zzfhm.zzb(zzfhm2);
        zzfho2.zzs = object2;
    }

    public final zzbjm zza() {
        AdManagerAdViewOptions adManagerAdViewOptions;
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && (adManagerAdViewOptions = this.zzl) == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }

    public final boolean zzb() {
        Object object = zzbep.zzde;
        object = (String)zzba.zzc().zza((zzbeg)object);
        return this.zzf.matches((String)object);
    }
}

