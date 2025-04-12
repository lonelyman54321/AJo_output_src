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
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzehb;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfou;
import com.google.android.gms.internal.ads.zzgbf;
import java.util.Map;

public final class zzehe {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfgt zzc;
    private final zzchd zzd;
    private zzfou zze;

    public zzehe(Context context, VersionInfoParcel versionInfoParcel, zzfgt zzfgt2, zzchd zzchd2) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfgt2;
        this.zzd = zzchd2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(View view) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzfou zzfou2 = this.zze;
                    if (zzfou2 != null) {
                        zzehb zzehb2 = zzu.zzA();
                        zzehb2.zzh(zzfou2, view);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = this.zze;
                    if (object != null && (object = this.zzd) != null) {
                        String string2 = "onSdkImpression";
                        zzgbf zzgbf2 = zzgbf.zzd();
                        object.zzd(string2, zzgbf2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
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
    public final void zzc() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    Object object;
                    Object object2 = this.zze;
                    if (object2 != null && (object = this.zzd) != null) {
                        object = object.zzV();
                        object = object.iterator();
                        while (true) {
                            Object object3;
                            boolean bl2;
                            if (!(bl2 = object.hasNext())) {
                                object2 = this.zzd;
                                object = "onSdkLoaded";
                                object3 = zzgbf.zzd();
                                object2.zzd((String)object, (Map)object3);
                                return;
                            }
                            object3 = object.next();
                            object3 = (View)object3;
                            zzehb zzehb2 = zzu.zzA();
                            zzehb2.zzh((zzfou)object2, (View)object3);
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
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
    public final boolean zzd() {
        synchronized (this) {
            zzfou zzfou2 = this.zze;
            return zzfou2 != null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    Object object;
                    String string2;
                    Object object2;
                    try {
                        object2 = this.zzc;
                        bl2 = ((zzfgt)object2).zzU;
                        string2 = null;
                        if (!bl2) break block8;
                        object2 = zzbep.zzeZ;
                        object = zzba.zzc();
                        object2 = ((zzben)object).zza((zzbeg)object2);
                        bl2 = (Boolean)(object2 = (Boolean)object2);
                        if (!bl2) break block8;
                        object2 = zzbep.zzfc;
                        object = zzba.zzc();
                        object2 = ((zzben)object).zza((zzbeg)object2);
                        bl2 = (Boolean)(object2 = (Boolean)object2);
                        if (!bl2 || (object2 = this.zzd) == null) break block8;
                        object2 = this.zze;
                        if (object2 != null) {
                            object2 = "Omid javascript session service already started for ad.";
                            zzm.zzj((String)object2);
                            return false;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    object2 = this.zza;
                    object = zzu.zzA();
                    bl2 = object.zzl((Context)object2);
                    if (!bl2) {
                        object2 = "Unable to initialize omid.";
                        zzm.zzj((String)object2);
                        return false;
                    }
                    object2 = this.zzc;
                    object2 = ((zzfgt)object2).zzW;
                    bl2 = ((zzfhr)object2).zzb();
                    if (bl2) {
                        boolean bl3;
                        object2 = this.zzb;
                        object = this.zzd;
                        zzehb zzehb2 = zzu.zzA();
                        object2 = zzehb2.zze((VersionInfoParcel)object2, (WebView)(object = object.zzG()), bl3 = true);
                        if (object2 == null) {
                            object2 = "Unable to create javascript session service.";
                            zzm.zzj((String)object2);
                            return false;
                        }
                        string2 = "Created omid javascript session service.";
                        zzm.zzi(string2);
                        this.zze = object2;
                        object2 = this.zzd;
                        object2.zzas(this);
                        return bl3;
                    }
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(zzchs zzchs2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object;
                    Object object2 = this.zze;
                    if (object2 != null && (object = this.zzd) != null) {
                        object = zzu.zzA();
                        object.zzm((zzfou)object2, zzchs2);
                        zzchs2 = null;
                        this.zze = null;
                        object2 = this.zzd;
                        object2.zzas(null);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

