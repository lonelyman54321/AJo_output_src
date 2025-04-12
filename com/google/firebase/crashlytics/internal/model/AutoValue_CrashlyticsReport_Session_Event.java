/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event$1;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState;

final class AutoValue_CrashlyticsReport_Session_Event
extends CrashlyticsReport$Session$Event {
    private final CrashlyticsReport$Session$Event$Application app;
    private final CrashlyticsReport$Session$Event$Device device;
    private final CrashlyticsReport$Session$Event$Log log;
    private final CrashlyticsReport$Session$Event$RolloutsState rollouts;
    private final long timestamp;
    private final String type;

    private AutoValue_CrashlyticsReport_Session_Event(long l2, String string2, CrashlyticsReport$Session$Event$Application crashlyticsReport$Session$Event$Application, CrashlyticsReport$Session$Event$Device crashlyticsReport$Session$Event$Device, CrashlyticsReport$Session$Event$Log crashlyticsReport$Session$Event$Log, CrashlyticsReport$Session$Event$RolloutsState crashlyticsReport$Session$Event$RolloutsState) {
        this.timestamp = l2;
        this.type = string2;
        this.app = crashlyticsReport$Session$Event$Application;
        this.device = crashlyticsReport$Session$Event$Device;
        this.log = crashlyticsReport$Session$Event$Log;
        this.rollouts = crashlyticsReport$Session$Event$RolloutsState;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event(long l2, String string2, CrashlyticsReport$Session$Event$Application crashlyticsReport$Session$Event$Application, CrashlyticsReport$Session$Event$Device crashlyticsReport$Session$Event$Device, CrashlyticsReport$Session$Event$Log crashlyticsReport$Session$Event$Log, CrashlyticsReport$Session$Event$RolloutsState crashlyticsReport$Session$Event$RolloutsState, AutoValue_CrashlyticsReport_Session_Event$1 autoValue_CrashlyticsReport_Session_Event$1) {
        this(l2, string2, crashlyticsReport$Session$Event$Application, crashlyticsReport$Session$Event$Device, crashlyticsReport$Session$Event$Log, crashlyticsReport$Session$Event$RolloutsState);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        Object object2 = object instanceof CrashlyticsReport$Session$Event;
        if (object2) {
            boolean bl3;
            Object object3;
            Object object4;
            long l2 = this.timestamp;
            long l3 = ((CrashlyticsReport$Session$Event)(object = (CrashlyticsReport$Session$Event)object)).getTimestamp();
            long l4 = l2 - l3;
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (!(!object2 && (object2 = ((String)(object4 = this.type)).equals(object3 = ((CrashlyticsReport$Session$Event)object).getType())) && (object2 = (object4 = this.app).equals(object3 = ((CrashlyticsReport$Session$Event)object).getApp())) && (object2 = (object4 = this.device).equals(object3 = ((CrashlyticsReport$Session$Event)object).getDevice())) && ((object4 = this.log) == null ? (object4 = ((CrashlyticsReport$Session$Event)object).getLog()) == null : (object2 = object4.equals(object3 = ((CrashlyticsReport$Session$Event)object).getLog()))) && ((object4 = this.rollouts) == null ? (object = ((CrashlyticsReport$Session$Event)object).getRollouts()) == null : (bl3 = object4.equals(object = ((CrashlyticsReport$Session$Event)object).getRollouts()))))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public CrashlyticsReport$Session$Event$Application getApp() {
        return this.app;
    }

    public CrashlyticsReport$Session$Event$Device getDevice() {
        return this.device;
    }

    public CrashlyticsReport$Session$Event$Log getLog() {
        return this.log;
    }

    public CrashlyticsReport$Session$Event$RolloutsState getRollouts() {
        return this.rollouts;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        long l2 = this.timestamp;
        long l3 = l2 >>> 32;
        int n3 = (int)(l2 ^= l3);
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.type.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.app.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.device.hashCode();
        n3 = (n3 ^ n7) * n4;
        CrashlyticsReport$Session$Event$Log crashlyticsReport$Session$Event$Log = this.log;
        int n8 = 0;
        if (crashlyticsReport$Session$Event$Log == null) {
            n7 = 0;
            crashlyticsReport$Session$Event$Log = null;
        } else {
            n7 = crashlyticsReport$Session$Event$Log.hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        CrashlyticsReport$Session$Event$RolloutsState crashlyticsReport$Session$Event$RolloutsState = this.rollouts;
        if (crashlyticsReport$Session$Event$RolloutsState != null) {
            n8 = crashlyticsReport$Session$Event$RolloutsState.hashCode();
        }
        return n3 ^ n8;
    }

    public CrashlyticsReport$Session$Event$Builder toBuilder() {
        AutoValue_CrashlyticsReport_Session_Event$Builder autoValue_CrashlyticsReport_Session_Event$Builder = new AutoValue_CrashlyticsReport_Session_Event$Builder(this, null);
        return autoValue_CrashlyticsReport_Session_Event$Builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Event{timestamp=");
        long l2 = this.timestamp;
        stringBuilder.append(l2);
        stringBuilder.append(", type=");
        Object object = this.type;
        stringBuilder.append((String)object);
        stringBuilder.append(", app=");
        object = this.app;
        stringBuilder.append(object);
        stringBuilder.append(", device=");
        object = this.device;
        stringBuilder.append(object);
        stringBuilder.append(", log=");
        object = this.log;
        stringBuilder.append(object);
        stringBuilder.append(", rollouts=");
        object = this.rollouts;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

