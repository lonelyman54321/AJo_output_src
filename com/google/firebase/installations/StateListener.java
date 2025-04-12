/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;

interface StateListener {
    public boolean onException(Exception var1);

    public boolean onStateReached(PersistedInstallationEntry var1);
}

