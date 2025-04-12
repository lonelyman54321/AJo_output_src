/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.FirebaseSessions$1;

public final class a
implements FirebaseAppLifecycleListener {
    public final void onDeleted(String string2, FirebaseOptions firebaseOptions) {
        FirebaseSessions$1.c(string2, firebaseOptions);
    }
}

