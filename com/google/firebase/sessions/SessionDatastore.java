/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDatastore$Companion;

public interface SessionDatastore {
    public static final SessionDatastore$Companion Companion = SessionDatastore$Companion.$$INSTANCE;

    public String getCurrentSessionId();

    public void updateSessionId(String var1);
}

