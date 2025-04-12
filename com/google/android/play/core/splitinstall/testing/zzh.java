/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.testing.zzo;
import com.google.android.play.core.splitinstall.testing.zzr;

public final class zzh
implements zzr {
    public final /* synthetic */ int zza;

    public /* synthetic */ zzh(int n3) {
        this.zza = n3;
    }

    public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
        int n3 = this.zza;
        zzo zzo2 = new zzo(splitInstallSessionState, n3);
        return (SplitInstallSessionState)zzbx.zzc(zzo2);
    }
}

