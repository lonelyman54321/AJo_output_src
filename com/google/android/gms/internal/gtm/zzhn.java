/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 */
package com.google.android.gms.internal.gtm;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzho;

final class zzhn
implements DialogInterface.OnClickListener {
    final /* synthetic */ zzho zza;

    public zzhn(zzho zzho2) {
        this.zza = zzho2;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = zzho.zza(this.zza).getPackageName();
        Intent intent = zzho.zza(this.zza).getPackageManager().getLaunchIntentForPackage((String)object);
        if (intent != null) {
            object = String.valueOf(object);
            zzhi.zzc("Invoke the launch activity for package name: ".concat((String)object));
            zzho.zza(this.zza).startActivity(intent);
            return;
        }
        object = String.valueOf(object);
        zzhi.zze("No launch activity found for package name: ".concat((String)object));
    }
}

