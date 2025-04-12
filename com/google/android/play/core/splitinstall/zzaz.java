/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.zzbb;
import com.google.android.play.core.splitinstall.zzbc;
import java.util.ArrayList;
import java.util.List;

final class zzaz
extends zzbb {
    public zzaz(zzbc zzbc2, TaskCompletionSource taskCompletionSource) {
        super(zzbc2, taskCompletionSource);
    }

    public final void zzh(List object) {
        super.zzh((List)object);
        int n3 = object.size();
        ArrayList<SplitInstallSessionState> arrayList = new ArrayList<SplitInstallSessionState>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            SplitInstallSessionState splitInstallSessionState = SplitInstallSessionState.zzd((Bundle)object.next());
            arrayList.add(splitInstallSessionState);
        }
        this.zza.trySetResult(arrayList);
    }
}

