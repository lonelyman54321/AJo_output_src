/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap;

public final class a
implements Runnable {
    public final /* synthetic */ UserMetadata$SerializeableKeysMap a;

    public /* synthetic */ a(UserMetadata$SerializeableKeysMap userMetadata$SerializeableKeysMap) {
        this.a = userMetadata$SerializeableKeysMap;
    }

    public final void run() {
        UserMetadata$SerializeableKeysMap.a(this.a);
    }
}

