/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzczp;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzded;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegb;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfig;
import java.util.Locale;
import java.util.regex.Pattern;

public final class zzduh
implements zzded,
zza,
zzdaf,
zzczp {
    private final Context zza;
    private final zzfig zzb;
    private final zzdvc zzc;
    private final zzfhf zzd;
    private final zzfgt zze;
    private final zzefz zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi;

    public zzduh(Context object, zzfig zzfig2, zzdvc zzdvc2, zzfhf zzfhf2, zzfgt zzfgt2, zzefz zzefz2, String string2) {
        boolean bl2;
        this.zza = object;
        this.zzb = zzfig2;
        this.zzc = zzdvc2;
        this.zzd = zzfhf2;
        this.zze = zzfgt2;
        this.zzf = zzefz2;
        object = zzbep.zzha;
        this.zzi = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzg = string2;
    }

    private final zzdvb zzd(String object) {
        Object object2;
        String string2;
        zzdvb zzdvb2 = this.zzc.zza();
        Object object3 = this.zzd.zzb.zzb;
        zzdvb2.zzd((zzfgw)object3);
        object3 = this.zze;
        zzdvb2.zzc((zzfgt)object3);
        zzdvb2.zzb("action", (String)object);
        object = this.zzg;
        object3 = Locale.ROOT;
        object = ((String)object).toUpperCase((Locale)object3);
        zzdvb2.zzb("ad_format", (String)object);
        object = this.zze.zzu;
        boolean n3 = object.isEmpty();
        boolean bl2 = false;
        object3 = null;
        if (!n3) {
            object = (String)this.zze.zzu.get(0);
            string2 = "ancn";
            zzdvb2.zzb(string2, (String)object);
        }
        object = this.zze;
        boolean bl3 = ((zzfgt)object).zzaj;
        int n4 = 1;
        if (bl3) {
            object = this.zza;
            object2 = zzu.zzo();
            int n7 = ((zzcby)object2).zzA((Context)object);
            object = n4 != n7 ? "offline" : "online";
            zzdvb2.zzb("device_connectivity", (String)object);
            long l2 = zzu.zzB().currentTimeMillis();
            object = String.valueOf(l2);
            zzdvb2.zzb("event_timestamp", (String)object);
            object = "offline_ad";
            object2 = "1";
            zzdvb2.zzb((String)object, (String)object2);
        }
        object = zzbep.zzhj;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl4 = (Boolean)object;
        if (bl4) {
            object = this.zzd.zza.zza;
            int n8 = zzp.zzf((zzfho)object);
            if (n8 != n4) {
                bl2 = true;
            }
            object = "scar";
            string2 = String.valueOf(bl2);
            zzdvb2.zzb((String)object, string2);
            if (bl2) {
                object = this.zzd.zza.zza.zzd;
                object3 = ((zzl)object).zzp;
                string2 = "ragent";
                zzdvb2.zzb(string2, (String)object3);
                object = zzp.zzb(zzp.zzc((zzl)object));
                object3 = "rtype";
                zzdvb2.zzb((String)object3, (String)object);
            }
        }
        return zzdvb2;
    }

    private final void zze(zzdvb object) {
        zzfgt zzfgt2 = this.zze;
        boolean bl2 = zzfgt2.zzaj;
        if (bl2) {
            String string2 = ((zzdvb)object).zze();
            long l2 = zzu.zzB().currentTimeMillis();
            String string3 = this.zzd.zzb.zzb.zzb;
            object = new zzegb(l2, string3, string2, 2);
            this.zzf.zzd((zzegb)object);
            return;
        }
        ((zzdvb)object).zzf();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzf() {
        Object object = this.zzh;
        if (object != null) return this.zzh;
        synchronized (this) {
            try {
                object = this.zzh;
                if (object != null) return this.zzh;
                object = zzbep.zzbu;
                Object object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                object = (String)object;
                zzu.zzp();
                object2 = this.zza;
                try {
                    object2 = zzt.zzp((Context)object2);
                }
                catch (RemoteException remoteException) {
                    object2 = null;
                }
                boolean bl2 = false;
                if (object != null && object2 != null) {
                    try {
                        bl2 = Pattern.matches((String)object, (CharSequence)object2);
                    }
                    catch (RuntimeException runtimeException) {
                        object2 = zzu.zzo();
                        String string2 = "CsiActionsListener.isPatternMatched";
                        ((zzcby)object2).zzw(runtimeException, string2);
                    }
                }
                this.zzh = object = Boolean.valueOf(bl2);
                return this.zzh;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void onAdClicked() {
        Object object = this.zze;
        boolean bl2 = ((zzfgt)object).zzaj;
        if (!bl2) {
            return;
        }
        object = this.zzd("click");
        this.zze((zzdvb)object);
    }

    public final void zza(zze object) {
        boolean bl2 = this.zzi;
        if (!bl2) {
            return;
        }
        zzdvb zzdvb2 = this.zzd("ifts");
        String string2 = "reason";
        zzdvb2.zzb(string2, "adapter");
        int n3 = ((zze)object).zza;
        String string3 = ((zze)object).zzb;
        Object object2 = ((zze)object).zzc;
        String string4 = "com.google.android.gms.ads";
        boolean bl3 = ((String)object2).equals(string4);
        if (bl3 && (object2 = ((zze)object).zzd) != null && !(bl3 = ((String)(object2 = ((zze)object2).zzc)).equals(string4))) {
            object = ((zze)object).zzd;
            n3 = ((zze)object).zza;
            string3 = ((zze)object).zzb;
        }
        if (n3 >= 0) {
            object = "arec";
            string2 = String.valueOf(n3);
            zzdvb2.zzb((String)object, string2);
        }
        if ((object = this.zzb.zza(string3)) != null) {
            string2 = "areec";
            zzdvb2.zzb(string2, (String)object);
        }
        zzdvb2.zzf();
    }

    public final void zzb() {
        boolean bl2 = this.zzi;
        if (!bl2) {
            return;
        }
        zzdvb zzdvb2 = this.zzd("ifts");
        zzdvb2.zzb("reason", "blocked");
        zzdvb2.zzf();
    }

    public final void zzc(zzdjo object) {
        boolean bl2 = this.zzi;
        if (!bl2) {
            return;
        }
        zzdvb zzdvb2 = this.zzd("ifts");
        String string2 = "exception";
        zzdvb2.zzb("reason", string2);
        String string3 = ((Throwable)object).getMessage();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl3) {
            object = ((Throwable)object).getMessage();
            string3 = "msg";
            zzdvb2.zzb(string3, (String)object);
        }
        zzdvb2.zzf();
    }

    public final void zzi() {
        boolean bl2 = this.zzf();
        if (!bl2) {
            return;
        }
        this.zzd("adapter_shown").zzf();
    }

    public final void zzj() {
        boolean bl2 = this.zzf();
        if (!bl2) {
            return;
        }
        this.zzd("adapter_impression").zzf();
    }

    public final void zzr() {
        Object object;
        boolean bl2 = this.zzf();
        if (!bl2) {
            object = this.zze;
            bl2 = ((zzfgt)object).zzaj;
            if (!bl2) {
                return;
            }
        }
        object = this.zzd("impression");
        this.zze((zzdvb)object);
    }
}

