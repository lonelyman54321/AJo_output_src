/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzau;

public final class zzas
implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzau zza;

    public /* synthetic */ zzas(zzau zzau2) {
        this.zza = zzau2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.zzr();
    }
}

