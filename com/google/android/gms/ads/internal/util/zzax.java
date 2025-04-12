/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 */
package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

final class zzax
implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    public zzax(zzay zzay2, Context context, String string2, boolean bl2, boolean bl3) {
        this.zza = context;
        this.zzb = string2;
        this.zzc = bl2;
        this.zzd = bl3;
    }

    public final void run() {
        zzu.zzp();
        AlertDialog.Builder builder = zzt.zzK(this.zza);
        Object object = this.zzb;
        builder.setMessage((CharSequence)object);
        boolean bl2 = this.zzc;
        if (bl2) {
            object = "Error";
            builder.setTitle((CharSequence)object);
        } else {
            object = "Info";
            builder.setTitle((CharSequence)object);
        }
        bl2 = this.zzd;
        String string2 = "Dismiss";
        if (bl2) {
            builder.setNeutralButton((CharSequence)string2, null);
        } else {
            object = new zzaw(this);
            String string3 = "Learn More";
            builder.setPositiveButton((CharSequence)string3, (DialogInterface.OnClickListener)object);
            builder.setNegativeButton((CharSequence)string2, null);
        }
        builder.create().show();
    }
}

