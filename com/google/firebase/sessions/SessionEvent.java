/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.EventType;
import com.google.firebase.sessions.SessionInfo;
import kotlin.jvm.internal.Intrinsics;

public final class SessionEvent {
    private final ApplicationInfo applicationInfo;
    private final EventType eventType;
    private final SessionInfo sessionData;

    public SessionEvent(EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionInfo, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.eventType = eventType;
        this.sessionData = sessionInfo;
        this.applicationInfo = applicationInfo;
    }

    public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            eventType = sessionEvent.eventType;
        }
        if ((n4 = n3 & 2) != 0) {
            sessionInfo = sessionEvent.sessionData;
        }
        if ((n3 &= 4) != 0) {
            applicationInfo = sessionEvent.applicationInfo;
        }
        return sessionEvent.copy(eventType, sessionInfo, applicationInfo);
    }

    public final EventType component1() {
        return this.eventType;
    }

    public final SessionInfo component2() {
        return this.sessionData;
    }

    public final ApplicationInfo component3() {
        return this.applicationInfo;
    }

    public final SessionEvent copy(EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionInfo, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        SessionEvent sessionEvent = new SessionEvent(eventType, sessionInfo, applicationInfo);
        return sessionEvent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SessionEvent;
        if (!bl3) {
            return false;
        }
        object = (SessionEvent)object;
        Object object2 = this.eventType;
        Object object3 = ((SessionEvent)object).eventType;
        if (object2 != object3) {
            return false;
        }
        object2 = this.sessionData;
        object3 = ((SessionEvent)object).sessionData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.applicationInfo;
        object = ((SessionEvent)object).applicationInfo;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int n3 = this.eventType.hashCode() * 31;
        int n4 = (this.sessionData.hashCode() + n3) * 31;
        return this.applicationInfo.hashCode() + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionEvent(eventType=");
        Object object = this.eventType;
        stringBuilder.append(object);
        stringBuilder.append(", sessionData=");
        object = this.sessionData;
        stringBuilder.append(object);
        stringBuilder.append(", applicationInfo=");
        object = this.applicationInfo;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

