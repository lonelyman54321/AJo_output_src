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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
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

public final class zzcuc
implements zzdaz,
zzdaf {
    private final Context zza;
    private final zzchd zzb;
    private final zzfgt zzc;
    private final VersionInfoParcel zzd;
    private zzehg zze;
    private boolean zzf;
    private final zzehe zzg;

    public zzcuc(Context context, zzchd zzchd2, zzfgt zzfgt2, VersionInfoParcel versionInfoParcel, zzehe zzehe2) {
        this.zza = context;
        this.zzb = zzchd2;
        this.zzc = zzfgt2;
        this.zzd = versionInfoParcel;
        this.zzg = zzehe2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zza() {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                block7: {
                    Object object;
                    Object object2;
                    String string2;
                    Object object3;
                    Object object4;
                    int n3;
                    Object object5;
                    Object object6;
                    block9: {
                        int n4;
                        block8: {
                            try {
                                object6 = this.zzc;
                                n4 = ((zzfgt)object6).zzU;
                                if (n4 == 0 || (object6 = this.zzb) == null) break block7;
                                object6 = this.zza;
                                object5 = zzu.zzA();
                                n4 = object5.zzl((Context)object6);
                                if (n4 == 0) break block7;
                                object6 = this.zzd;
                                n3 = ((VersionInfoParcel)object6).buddyApkVersion;
                                n4 = ((VersionInfoParcel)object6).clientJarVersion;
                                object4 = new StringBuilder();
                                ((StringBuilder)object4).append(n3);
                                object5 = ".";
                                ((StringBuilder)object4).append((String)object5);
                                ((StringBuilder)object4).append(n4);
                                object3 = ((StringBuilder)object4).toString();
                                object6 = this.zzc;
                                object6 = ((zzfgt)object6).zzW;
                                string2 = ((zzfhr)object6).zza();
                                n4 = ((zzfhr)object6).zzc();
                                n3 = 1;
                                if (n4 != n3) break block8;
                                object6 = zzehc.zzc;
                                object4 = zzehd.zzb;
                                object2 = object6;
                                object = object4;
                                break block9;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                        }
                        object6 = this.zzc;
                        object4 = zzehc.zza;
                        n4 = ((zzfgt)object6).zzf;
                        object6 = n4 == n3 ? zzehd.zzc : zzehd.zza;
                        object = object6;
                        object2 = object4;
                    }
                    object6 = this.zzb;
                    object4 = this.zzc;
                    Object object7 = zzu.zzA();
                    WebView webView = object6.zzG();
                    String string3 = ((zzfgt)object4).zzam;
                    String string4 = "";
                    String string5 = "javascript";
                    this.zze = object6 = object7.zza((String)object3, webView, string4, string5, string2, (zzehd)((Object)object), (zzehc)((Object)object2), string3);
                    object4 = this.zzb;
                    if (object6 != null) {
                        object6 = ((zzehg)object6).zza();
                        object7 = zzbep.zzfb;
                        object3 = zzba.zzc();
                        object7 = ((zzben)object3).zza((zzbeg)object7);
                        boolean bl2 = (Boolean)(object7 = (Boolean)object7);
                        if (bl2) {
                            object4 = this.zzb;
                            object7 = zzu.zzA();
                            object4 = object4.zzG();
                            object7.zzj((zzfoj)object6, (View)object4);
                            object4 = this.zzb;
                            object4 = object4.zzV();
                            object4 = object4.iterator();
                            while (bl2 = object4.hasNext()) {
                                object7 = object4.next();
                                object7 = (View)object7;
                                object3 = zzu.zzA();
                                object3.zzg((zzfoj)object6, (View)object7);
                            }
                        } else {
                            object7 = zzu.zzA();
                            object4 = (View)object4;
                            object7.zzj((zzfoj)object6, (View)object4);
                        }
                        object4 = this.zzb;
                        object7 = this.zze;
                        object4.zzat((zzehg)object7);
                        object4 = zzu.zzA();
                        object4.zzk((zzfoj)object6);
                        this.zzf = n3;
                        object6 = this.zzb;
                        object5 = new Jp();
                        object4 = "onSdkLoaded";
                        object6.zzd((String)object4, (Map)object5);
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private final boolean zzb() {
        Object object = zzbep.zzfc;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        return bl2 && (bl2 = ((zzehe)(object = this.zzg)).zzd());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                try {
                    bl2 = this.zzb();
                    if (bl2) {
                        zzehe zzehe2 = this.zzg;
                        zzehe2.zzb();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                bl2 = this.zzf;
                if (!bl2) {
                    this.zza();
                }
                Object object = this.zzc;
                bl2 = ((zzfgt)object).zzU;
                if (bl2 && (object = this.zze) != null && (object = this.zzb) != null) {
                    Jp jp = new Jp();
                    String string2 = "onSdkImpression";
                    object.zzd(string2, jp);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzs() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzb();
                    if (bl2) {
                        zzehe zzehe2 = this.zzg;
                        zzehe2.zzc();
                        return;
                    }
                    bl2 = this.zzf;
                    if (!bl2) break block5;
                }
                catch (Throwable throwable2) {}
                return;
            }
            this.zza();
            return;
            throw throwable2;
        }
    }
}

