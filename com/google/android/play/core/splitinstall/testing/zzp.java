/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import com.google.android.play.core.splitinstall.testing.zzr;
import java.util.List;

public final class zzp
implements zzr {
    public final /* synthetic */ int zza;

    public /* synthetic */ zzp(int n3) {
        this.zza = n3;
    }

    public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
        int n3 = this.zza;
        int n4 = FakeSplitInstallManager.zza;
        if (splitInstallSessionState == null) {
            return null;
        }
        n4 = splitInstallSessionState.sessionId();
        long l2 = splitInstallSessionState.bytesDownloaded();
        long l3 = splitInstallSessionState.totalBytesToDownload();
        List list = splitInstallSessionState.moduleNames();
        List list2 = splitInstallSessionState.languages();
        return SplitInstallSessionState.create(n4, 6, n3, l2, l3, list, list2);
    }
}

