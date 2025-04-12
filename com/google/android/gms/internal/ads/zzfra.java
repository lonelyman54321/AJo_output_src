/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzfra
implements Continuation {
    public final Object then(Task task2) {
        return task2.isSuccessful();
    }
}

