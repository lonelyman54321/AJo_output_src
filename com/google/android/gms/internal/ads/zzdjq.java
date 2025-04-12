/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdv$zza$zza;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzehc;
import com.google.android.gms.internal.ads.zzehd;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfoj;
import java.util.Map;

public final class zzdjq
implements zzdaz,
zzp,
zzdaf {
    zzehg zza;
    private final Context zzb;
    private final zzchd zzc;
    private final zzfgt zzd;
    private final VersionInfoParcel zze;
    private final zzbdv$zza$zza zzf;
    private final zzehe zzg;

    public zzdjq(Context context, zzchd zzchd2, zzfgt zzfgt2, VersionInfoParcel versionInfoParcel, zzbdv$zza$zza zzbdv$zza$zza, zzehe zzehe2) {
        this.zzb = context;
        this.zzc = zzchd2;
        this.zzd = zzfgt2;
        this.zze = versionInfoParcel;
        this.zzf = zzbdv$zza$zza;
        this.zzg = zzehe2;
    }

    private final boolean zzg() {
        Object object = zzbep.zzfc;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        return bl2 && (bl2 = ((zzehe)(object = this.zzg)).zzd());
    }

    public final void zzdH() {
    }

    public final void zzdk() {
    }

    public final void zzdq() {
    }

    public final void zzdr() {
        Object object = zzbep.zzfh;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2 && (object = this.zzc) != null && ((object = this.zza) != null || (bl2 = this.zzg()))) {
            object = this.zza;
            if (object != null) {
                object = this.zzc;
                object2 = new Jp();
                object.zzd("onSdkImpression", (Map)object2);
                return;
            }
            object = this.zzg;
            ((zzehe)object).zzb();
        }
    }

    public final void zzdt() {
    }

    public final void zzdu(int n3) {
        this.zza = null;
    }

    public final void zzr() {
        boolean bl2 = this.zzg();
        if (bl2) {
            this.zzg.zzb();
            return;
        }
        Object object = this.zza;
        if (object != null && (object = this.zzc) != null) {
            object = zzbep.zzfh;
            Object object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = this.zzc;
                object2 = new Jp();
                String string2 = "onSdkImpression";
                object.zzd(string2, (Map)object2);
            }
        }
    }

    public final void zzs() {
        Object object = zzbep.zzfk;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (n3 || (object = this.zzf) == (object2 = zzbdv$zza$zza.zzh) || object == (object2 = zzbdv$zza$zza.zzd) || object == (object2 = zzbdv$zza$zza.zzk)) {
            object = this.zzd;
            boolean bl2 = ((zzfgt)object).zzU;
            if (bl2 && (object = this.zzc) != null) {
                object = this.zzb;
                object2 = zzu.zzA();
                boolean bl3 = object2.zzl((Context)object);
                if (bl3) {
                    Object object3;
                    Object object4;
                    boolean bl4 = this.zzg();
                    if (bl4) {
                        this.zzg.zzc();
                        return;
                    }
                    object = this.zze;
                    int n4 = ((VersionInfoParcel)object).buddyApkVersion;
                    int n7 = ((VersionInfoParcel)object).clientJarVersion;
                    Object object5 = new StringBuilder();
                    ((StringBuilder)object5).append(n4);
                    object2 = ".";
                    ((StringBuilder)object5).append((String)object2);
                    ((StringBuilder)object5).append(n7);
                    String string2 = ((StringBuilder)object5).toString();
                    object = this.zzd.zzW;
                    String string3 = ((zzfhr)object).zza();
                    int n8 = ((zzfhr)object).zzc();
                    n4 = 1;
                    if (n8 == n4) {
                        object = zzehc.zzc;
                        object2 = zzehd.zzb;
                        object4 = object;
                        object3 = object2;
                    } else {
                        object = this.zzd;
                        int n10 = ((zzfgt)object).zzZ;
                        n4 = 2;
                        object = n10 == n4 ? zzehd.zzd : zzehd.zza;
                        object2 = zzehc.zza;
                        object3 = object;
                        object4 = object2;
                    }
                    object = this.zzc;
                    object2 = this.zzd;
                    Object object6 = zzu.zzA();
                    WebView webView = object.zzG();
                    String string4 = ((zzfgt)object2).zzam;
                    String string5 = "";
                    String string6 = "javascript";
                    this.zza = object = object6.zza(string2, webView, string5, string6, string3, (zzehd)((Object)object3), (zzehc)((Object)object4), string4);
                    object2 = this.zzc;
                    if (object != null) {
                        object = ((zzehg)object).zza();
                        object5 = zzbep.zzfb;
                        object6 = zzba.zzc();
                        object5 = (Boolean)((zzben)object6).zza((zzbeg)object5);
                        boolean bl5 = (Boolean)object5;
                        if (bl5) {
                            object2 = this.zzc;
                            object5 = zzu.zzA();
                            object2 = object2.zzG();
                            object5.zzj((zzfoj)object, (View)object2);
                            object2 = this.zzc.zzV().iterator();
                            while (bl5 = object2.hasNext()) {
                                object5 = (View)object2.next();
                                object6 = zzu.zzA();
                                object6.zzg((zzfoj)object, (View)object5);
                            }
                        } else {
                            object5 = zzu.zzA();
                            object2 = (View)object2;
                            object5.zzj((zzfoj)object, (View)object2);
                        }
                        object2 = this.zzc;
                        object5 = this.zza;
                        object2.zzat((zzehg)object5);
                        zzu.zzA().zzk((zzfoj)object);
                        object = this.zzc;
                        object2 = new Jp();
                        object5 = "onSdkLoaded";
                        object.zzd((String)object5, (Map)object2);
                    }
                }
            }
        }
    }
}

