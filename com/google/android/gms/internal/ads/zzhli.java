/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 */
package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import com.google.android.gms.internal.ads.zzbfm;
import java.lang.ref.WeakReference;

public final class zzhli
extends ag0 {
    private final WeakReference zza;

    public zzhli(zzbfm zzbfm2) {
        WeakReference<zzbfm> weakReference;
        this.zza = weakReference = new WeakReference<zzbfm>(zzbfm2);
    }

    public final void onCustomTabsServiceConnected(ComponentName object, Wf0 wf0) {
        object = (zzbfm)this.zza.get();
        if (object != null) {
            ((zzbfm)object).zzc(wf0);
        }
    }

    public final void onServiceDisconnected(ComponentName object) {
        object = (zzbfm)this.zza.get();
        if (object != null) {
            ((zzbfm)object).zzd();
        }
    }
}

