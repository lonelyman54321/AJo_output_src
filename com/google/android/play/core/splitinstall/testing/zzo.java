/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzo
implements Callable {
    public final /* synthetic */ SplitInstallSessionState zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzo(SplitInstallSessionState splitInstallSessionState, int n3) {
        this.zza = splitInstallSessionState;
        this.zzb = n3;
    }

    public final Object call() {
        int n3;
        Object object = this.zza;
        int n4 = this.zzb;
        int n7 = FakeSplitInstallManager.zza;
        if (object != null && n4 == (n7 = ((SplitInstallSessionState)object).sessionId()) && ((n7 = ((SplitInstallSessionState)object).status()) == (n3 = 1) || n7 == (n3 = 2) || n7 == (n3 = 8) || n7 == (n3 = 9) || n7 == (n3 = 7))) {
            n3 = ((SplitInstallSessionState)object).errorCode();
            long l2 = ((SplitInstallSessionState)object).bytesDownloaded();
            long l3 = ((SplitInstallSessionState)object).totalBytesToDownload();
            List list = ((SplitInstallSessionState)object).moduleNames();
            List list2 = ((SplitInstallSessionState)object).languages();
            return SplitInstallSessionState.create(n4, 7, n3, l2, l3, list, list2);
        }
        object = new SplitInstallException(-3);
        throw object;
    }
}

