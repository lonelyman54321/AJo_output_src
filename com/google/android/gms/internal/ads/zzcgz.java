/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.webkit.JsPromptResult
 */
package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class zzcgz
implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;

    public zzcgz(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        this.zza.cancel();
    }
}

