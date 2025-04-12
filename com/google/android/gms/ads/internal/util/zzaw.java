/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.net.Uri
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

final class zzaw
implements DialogInterface.OnClickListener {
    final /* synthetic */ zzax zza;

    public zzaw(zzax zzax2) {
        this.zza = zzax2;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        zzu.zzp();
        dialogInterface = this.zza.zza;
        Uri uri = Uri.parse((String)"https://support.google.com/dfp_premium/answer/7160685#push");
        zzt.zzU((Context)dialogInterface, uri);
    }
}

