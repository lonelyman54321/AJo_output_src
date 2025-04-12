/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session$Builder
extends CrashlyticsReport$Session$Builder {
    private CrashlyticsReport$Session$Application app;
    private String appQualitySessionId;
    private boolean crashed;
    private CrashlyticsReport$Session$Device device;
    private Long endedAt;
    private List events;
    private String generator;
    private int generatorType;
    private String identifier;
    private CrashlyticsReport$Session$OperatingSystem os;
    private byte set$0;
    private long startedAt;
    private CrashlyticsReport$Session$User user;

    public AutoValue_CrashlyticsReport_Session$Builder() {
    }

    private AutoValue_CrashlyticsReport_Session$Builder(CrashlyticsReport$Session crashlyticsReport$Session) {
        int n3;
        boolean bl2;
        long l2;
        Object object = crashlyticsReport$Session.getGenerator();
        this.generator = object;
        object = crashlyticsReport$Session.getIdentifier();
        this.identifier = object;
        object = crashlyticsReport$Session.getAppQualitySessionId();
        this.appQualitySessionId = object;
        this.startedAt = l2 = crashlyticsReport$Session.getStartedAt();
        this.endedAt = object = crashlyticsReport$Session.getEndedAt();
        this.crashed = bl2 = crashlyticsReport$Session.isCrashed();
        this.app = object = crashlyticsReport$Session.getApp();
        this.user = object = crashlyticsReport$Session.getUser();
        this.os = object = crashlyticsReport$Session.getOs();
        this.device = object = crashlyticsReport$Session.getDevice();
        this.events = object = crashlyticsReport$Session.getEvents();
        this.generatorType = n3 = crashlyticsReport$Session.getGeneratorType();
        this.set$0 = (byte)7;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session$Builder(CrashlyticsReport$Session crashlyticsReport$Session, AutoValue_CrashlyticsReport_Session$1 autoValue_CrashlyticsReport_Session$1) {
        this(crashlyticsReport$Session);
    }

    public CrashlyticsReport$Session build() {
        CrashlyticsReport$Session$Application crashlyticsReport$Session$Application;
        String string2;
        String string3;
        AutoValue_CrashlyticsReport_Session$Builder autoValue_CrashlyticsReport_Session$Builder = this;
        int n3 = this.set$0;
        int n4 = 7;
        if (n3 == n4 && (string3 = this.generator) != null && (string2 = this.identifier) != null && (crashlyticsReport$Session$Application = this.app) != null) {
            String string4 = this.appQualitySessionId;
            long l2 = this.startedAt;
            Long l3 = this.endedAt;
            boolean bl2 = this.crashed;
            CrashlyticsReport$Session$User crashlyticsReport$Session$User = this.user;
            CrashlyticsReport$Session$OperatingSystem crashlyticsReport$Session$OperatingSystem = this.os;
            CrashlyticsReport$Session$Device crashlyticsReport$Session$Device = this.device;
            List list = this.events;
            n4 = this.generatorType;
            AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session = new AutoValue_CrashlyticsReport_Session(string3, string2, string4, l2, l3, bl2, crashlyticsReport$Session$Application, crashlyticsReport$Session$User, crashlyticsReport$Session$OperatingSystem, crashlyticsReport$Session$Device, list, n4, null);
            return autoValue_CrashlyticsReport_Session;
        }
        CharSequence charSequence = new StringBuilder();
        Object object = autoValue_CrashlyticsReport_Session$Builder.generator;
        if (object == null) {
            object = " generator";
            charSequence.append((String)object);
        }
        if ((object = autoValue_CrashlyticsReport_Session$Builder.identifier) == null) {
            object = " identifier";
            charSequence.append((String)object);
        }
        if ((n4 = autoValue_CrashlyticsReport_Session$Builder.set$0 & 1) == 0) {
            object = " startedAt";
            charSequence.append((String)object);
        }
        if ((n4 = autoValue_CrashlyticsReport_Session$Builder.set$0 & 2) == 0) {
            object = " crashed";
            charSequence.append((String)object);
        }
        if ((object = autoValue_CrashlyticsReport_Session$Builder.app) == null) {
            object = " app";
            charSequence.append((String)object);
        }
        if ((n4 = autoValue_CrashlyticsReport_Session$Builder.set$0 & 4) == 0) {
            object = " generatorType";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Builder setApp(CrashlyticsReport$Session$Application object) {
        if (object != null) {
            this.app = object;
            return this;
        }
        object = new NullPointerException("Null app");
        throw object;
    }

    public CrashlyticsReport$Session$Builder setAppQualitySessionId(String string2) {
        this.appQualitySessionId = string2;
        return this;
    }

    public CrashlyticsReport$Session$Builder setCrashed(boolean bl2) {
        byte by2;
        this.crashed = bl2;
        this.set$0 = by2 = (byte)(this.set$0 | 2);
        return this;
    }

    public CrashlyticsReport$Session$Builder setDevice(CrashlyticsReport$Session$Device crashlyticsReport$Session$Device) {
        this.device = crashlyticsReport$Session$Device;
        return this;
    }

    public CrashlyticsReport$Session$Builder setEndedAt(Long l2) {
        this.endedAt = l2;
        return this;
    }

    public CrashlyticsReport$Session$Builder setEvents(List list) {
        this.events = list;
        return this;
    }

    public CrashlyticsReport$Session$Builder setGenerator(String object) {
        if (object != null) {
            this.generator = object;
            return this;
        }
        object = new NullPointerException("Null generator");
        throw object;
    }

    public CrashlyticsReport$Session$Builder setGeneratorType(int n3) {
        this.generatorType = n3;
        n3 = (byte)(this.set$0 | 4);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Builder setIdentifier(String object) {
        if (object != null) {
            this.identifier = object;
            return this;
        }
        object = new NullPointerException("Null identifier");
        throw object;
    }

    public CrashlyticsReport$Session$Builder setOs(CrashlyticsReport$Session$OperatingSystem crashlyticsReport$Session$OperatingSystem) {
        this.os = crashlyticsReport$Session$OperatingSystem;
        return this;
    }

    public CrashlyticsReport$Session$Builder setStartedAt(long l2) {
        byte by2;
        this.startedAt = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 1);
        return this;
    }

    public CrashlyticsReport$Session$Builder setUser(CrashlyticsReport$Session$User crashlyticsReport$Session$User) {
        this.user = crashlyticsReport$Session$User;
        return this;
    }
}

