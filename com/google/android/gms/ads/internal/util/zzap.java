/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzap
implements DialogInterface.OnClickListener {
    public final /* synthetic */ AtomicInteger zza;

    public /* synthetic */ zzap(AtomicInteger atomicInteger) {
        this.zza = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        this.zza.set(n3);
    }
}

