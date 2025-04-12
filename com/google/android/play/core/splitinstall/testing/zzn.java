/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzn
implements Callable {
    public final /* synthetic */ SplitInstallSessionState zza;
    public final /* synthetic */ SplitInstallRequest zzb;

    public /* synthetic */ zzn(SplitInstallSessionState splitInstallSessionState, SplitInstallRequest splitInstallRequest) {
        this.zza = splitInstallSessionState;
        this.zzb = splitInstallRequest;
    }

    public final Object call() {
        int n3;
        Object object = this.zza;
        SplitInstallRequest splitInstallRequest = this.zzb;
        int n4 = FakeSplitInstallManager.zza;
        if (object != null && (n4 = (int)(((SplitInstallSessionState)object).hasTerminalStatus() ? 1 : 0)) == 0) {
            object = new SplitInstallException(-1);
            throw object;
        }
        n4 = 1;
        if (object == null) {
            n3 = 1;
        } else {
            int n7 = ((SplitInstallSessionState)object).sessionId();
            n3 = n4 += n7;
        }
        List list = splitInstallRequest.getModuleNames();
        ArrayList arrayList = new ArrayList();
        return SplitInstallSessionState.create(n3, 1, 0, 0L, 0L, list, arrayList);
    }
}

