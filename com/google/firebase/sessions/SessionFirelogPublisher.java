/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.SessionFirelogPublisher$Companion;

public interface SessionFirelogPublisher {
    public static final SessionFirelogPublisher$Companion Companion = SessionFirelogPublisher$Companion.$$INSTANCE;

    public void logSession(SessionDetails var1);
}

