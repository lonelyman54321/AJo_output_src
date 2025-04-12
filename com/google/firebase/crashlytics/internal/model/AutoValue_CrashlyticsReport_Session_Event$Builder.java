/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState;

final class AutoValue_CrashlyticsReport_Session_Event$Builder
extends CrashlyticsReport$Session$Event$Builder {
    private CrashlyticsReport$Session$Event$Application app;
    private CrashlyticsReport$Session$Event$Device device;
    private CrashlyticsReport$Session$Event$Log log;
    private CrashlyticsReport$Session$Event$RolloutsState rollouts;
    private byte set$0;
    private long timestamp;
    private String type;

    public AutoValue_CrashlyticsReport_Session_Event$Builder() {
    }

    private AutoValue_CrashlyticsReport_Session_Event$Builder(CrashlyticsReport$Session$Event object) {
        long l2;
        this.timestamp = l2 = ((CrashlyticsReport$Session$Event)object).getTimestamp();
        Object object2 = ((CrashlyticsReport$Session$Event)object).getType();
        this.type = object2;
        this.app = object2 = ((CrashlyticsReport$Session$Event)object).getApp();
        this.device = object2 = ((CrashlyticsReport$Session$Event)object).getDevice();
        this.log = object2 = ((CrashlyticsReport$Session$Event)object).getLog();
        this.rollouts = object = ((CrashlyticsReport$Session$Event)object).getRollouts();
        this.set$0 = 1;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event$Builder(CrashlyticsReport$Session$Event crashlyticsReport$Session$Event, AutoValue_CrashlyticsReport_Session_Event$1 autoValue_CrashlyticsReport_Session_Event$1) {
        this(crashlyticsReport$Session$Event);
    }

    public CrashlyticsReport$Session$Event build() {
        Object object;
        CrashlyticsReport$Session$Event$Device crashlyticsReport$Session$Event$Device;
        CrashlyticsReport$Session$Event$Application crashlyticsReport$Session$Event$Application;
        String string2;
        int n3 = this.set$0;
        int n4 = 1;
        if (n3 == n4 && (string2 = this.type) != null && (crashlyticsReport$Session$Event$Application = this.app) != null && (crashlyticsReport$Session$Event$Device = this.device) != null) {
            long l2 = this.timestamp;
            CrashlyticsReport$Session$Event$Log crashlyticsReport$Session$Event$Log = this.log;
            CrashlyticsReport$Session$Event$RolloutsState crashlyticsReport$Session$Event$RolloutsState = this.rollouts;
            AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event = new AutoValue_CrashlyticsReport_Session_Event(l2, string2, crashlyticsReport$Session$Event$Application, crashlyticsReport$Session$Event$Device, crashlyticsReport$Session$Event$Log, crashlyticsReport$Session$Event$RolloutsState, null);
            return autoValue_CrashlyticsReport_Session_Event;
        }
        CharSequence charSequence = new StringBuilder();
        byte by2 = this.set$0;
        if ((n4 &= by2) == 0) {
            object = " timestamp";
            charSequence.append((String)object);
        }
        if ((object = this.type) == null) {
            object = " type";
            charSequence.append((String)object);
        }
        if ((object = this.app) == null) {
            object = " app";
            charSequence.append((String)object);
        }
        if ((object = this.device) == null) {
            object = " device";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Event$Builder setApp(CrashlyticsReport$Session$Event$Application object) {
        if (object != null) {
            this.app = object;
            return this;
        }
        object = new NullPointerException("Null app");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Builder setDevice(CrashlyticsReport$Session$Event$Device object) {
        if (object != null) {
            this.device = object;
            return this;
        }
        object = new NullPointerException("Null device");
        throw object;
    }

    public CrashlyticsReport$Session$Event$Builder setLog(CrashlyticsReport$Session$Event$Log crashlyticsReport$Session$Event$Log) {
        this.log = crashlyticsReport$Session$Event$Log;
        return this;
    }

    public CrashlyticsReport$Session$Event$Builder setRollouts(CrashlyticsReport$Session$Event$RolloutsState crashlyticsReport$Session$Event$RolloutsState) {
        this.rollouts = crashlyticsReport$Session$Event$RolloutsState;
        return this;
    }

    public CrashlyticsReport$Session$Event$Builder setTimestamp(long l2) {
        byte by2;
        this.timestamp = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 1);
        return this;
    }

    public CrashlyticsReport$Session$Event$Builder setType(String object) {
        if (object != null) {
            this.type = object;
            return this;
        }
        object = new NullPointerException("Null type");
        throw object;
    }
}

