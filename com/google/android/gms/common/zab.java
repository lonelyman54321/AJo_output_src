/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;

public final class zab
implements SuccessContinuation {
    public static final /* synthetic */ zab zaa;

    static {
        zab zab2;
        zaa = zab2 = new zab();
    }

    private /* synthetic */ zab() {
    }

    public final Task then(Object object) {
        object = (Map)object;
        return Tasks.forResult(null);
    }
}

