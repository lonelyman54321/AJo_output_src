/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.analytics;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzfe;
import java.util.HashMap;
import java.util.Map;

final class zzv
extends zzbr {
    final /* synthetic */ Tracker zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private boolean zze;
    private long zzf;

    public zzv(Tracker tracker, zzbu zzbu2) {
        this.zza = tracker;
        super(zzbu2);
        this.zzd = -1;
    }

    private final void zzg() {
        boolean bl2;
        long l2 = this.zzd;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0 && !(bl2 = this.zzb)) {
            GoogleAnalytics googleAnalytics = this.zzp();
            zzv zzv2 = Tracker.zza(this.zza);
            googleAnalytics.zzl(zzv2);
            return;
        }
        GoogleAnalytics googleAnalytics = this.zzp();
        zzv zzv3 = Tracker.zza(this.zza);
        googleAnalytics.zzk(zzv3);
    }

    public final void zza(Activity object) {
        Object object2;
        int n3 = this.zzc;
        int n4 = 1;
        if (n3 == 0) {
            object2 = this.zzC();
            long l2 = object2.elapsedRealtime();
            long l3 = this.zzf;
            long l4 = this.zzd;
            long l7 = Math.max(1000L, l4) + l3;
            long l8 = l2 - l7;
            n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n3 >= 0) {
                this.zze = n4;
            }
        }
        this.zzc = n3 = this.zzc + n4;
        n3 = (int)(this.zzb ? 1 : 0);
        if (n3 != 0) {
            Object object3;
            Object object4;
            object2 = object.getIntent();
            if (object2 != null) {
                object4 = this.zza;
                object2 = object2.getData();
                ((Tracker)object4).setCampaignParamsOnNextHit((Uri)object2);
            }
            object2 = p3.a("&t", "screenview");
            object4 = this.zza;
            Object object5 = Tracker.zzl((Tracker)object4);
            if (object5 != null) {
                object5 = Tracker.zzl((Tracker)object4);
                object3 = object.getClass().getCanonicalName();
                object5 = (String)((zzfe)object5).zzg.get(object3);
                if (object5 != null) {
                    object3 = object5;
                }
            } else {
                object5 = object.getClass();
                object3 = ((Class)object5).getCanonicalName();
            }
            ((Tracker)object4).set("&cd", (String)object3);
            object4 = "&dr";
            object5 = (CharSequence)((HashMap)object2).get(object4);
            boolean bl2 = TextUtils.isEmpty((CharSequence)object5);
            if (bl2) {
                boolean bl3;
                boolean bl4;
                Preconditions.checkNotNull(object);
                object = object.getIntent();
                bl2 = false;
                object5 = null;
                if (object != null && !(bl4 = TextUtils.isEmpty((CharSequence)(object = object.getStringExtra((String)(object3 = "android.intent.extra.REFERRER_NAME")))))) {
                    object5 = object;
                }
                if (!(bl3 = TextUtils.isEmpty((CharSequence)object5))) {
                    ((HashMap)object2).put(object4, object5);
                }
            }
            object = this.zza;
            ((Tracker)object).send((Map)object2);
        }
    }

    public final void zzb(Activity object) {
        int n3;
        this.zzc = n3 = this.zzc + -1;
        this.zzc = n3 = Math.max(0, n3);
        if (n3 == 0) {
            long l2;
            object = this.zzC();
            this.zzf = l2 = object.elapsedRealtime();
        }
    }

    public final void zzc(boolean bl2) {
        this.zzb = bl2;
        this.zzg();
    }

    public final void zzd() {
    }

    public final void zze(long l2) {
        this.zzd = l2;
        this.zzg();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzf() {
        synchronized (this) {
            boolean bl2 = this.zze;
            this.zze = false;
            return bl2;
        }
    }
}

