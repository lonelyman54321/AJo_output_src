/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.ads.internal.overlay.zzs;

final class zzq
extends AnimatorListenerAdapter {
    final /* synthetic */ zzs zza;

    public zzq(zzs zzs2) {
        this.zza = zzs2;
    }

    private final void zza(boolean bl2) {
        this.zza.setEnabled(bl2);
        zzs.zza(this.zza).setEnabled(bl2);
    }

    public final void onAnimationCancel(Animator animator2) {
        this.zza(true);
    }

    public final void onAnimationEnd(Animator animator2) {
        this.zza(true);
    }

    public final void onAnimationStart(Animator animator2) {
        this.zza(false);
    }
}

