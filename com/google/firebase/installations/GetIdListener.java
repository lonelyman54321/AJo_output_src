/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.StateListener;
import com.google.firebase.installations.local.PersistedInstallationEntry;

class GetIdListener
implements StateListener {
    final TaskCompletionSource taskCompletionSource;

    public GetIdListener(TaskCompletionSource taskCompletionSource) {
        this.taskCompletionSource = taskCompletionSource;
    }

    public boolean onException(Exception exception) {
        return false;
    }

    public boolean onStateReached(PersistedInstallationEntry object) {
        boolean bl2 = ((PersistedInstallationEntry)object).isUnregistered();
        if (!(bl2 || (bl2 = ((PersistedInstallationEntry)object).isRegistered()) || (bl2 = ((PersistedInstallationEntry)object).isErrored()))) {
            return false;
        }
        TaskCompletionSource taskCompletionSource = this.taskCompletionSource;
        object = ((PersistedInstallationEntry)object).getFirebaseInstallationId();
        taskCompletionSource.trySetResult(object);
        return true;
    }
}

