/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzau;

public final class zzaj
implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzaj(zzau zzau2, String string2) {
        this.zza = zzau2;
        this.zzb = string2;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        zzau zzau2 = this.zza;
        String string2 = this.zzb;
        zzau2.zzi(string2, dialogInterface, n3);
    }
}

