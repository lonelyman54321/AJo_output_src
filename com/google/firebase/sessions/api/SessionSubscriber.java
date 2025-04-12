/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.google.firebase.sessions.api.SessionSubscriber$SessionDetails;

public interface SessionSubscriber {
    public SessionSubscriber$Name getSessionSubscriberName();

    public boolean isDataCollectionEnabled();

    public void onSessionChanged(SessionSubscriber$SessionDetails var1);
}

