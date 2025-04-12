/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.session;

public interface SessionManager {
    public Long getLastInteractionTime();

    public long getLifetimeSessionTime();

    public long getSessionCount();

    public long getSessionTime();

    public void init();

    public boolean isSessionActive();

    public void sessionStart();
}

