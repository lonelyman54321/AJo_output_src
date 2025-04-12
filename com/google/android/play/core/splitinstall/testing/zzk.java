/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.testing.zzn;
import com.google.android.play.core.splitinstall.testing.zzr;

public final class zzk
implements zzr {
    public final /* synthetic */ SplitInstallRequest zza;

    public /* synthetic */ zzk(SplitInstallRequest splitInstallRequest) {
        this.zza = splitInstallRequest;
    }

    public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
        SplitInstallRequest splitInstallRequest = this.zza;
        zzn zzn2 = new zzn(splitInstallSessionState, splitInstallRequest);
        return (SplitInstallSessionState)zzbx.zzc(zzn2);
    }
}

