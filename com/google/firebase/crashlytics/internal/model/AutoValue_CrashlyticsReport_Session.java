/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session$1;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session
extends CrashlyticsReport$Session {
    private final CrashlyticsReport$Session$Application app;
    private final String appQualitySessionId;
    private final boolean crashed;
    private final CrashlyticsReport$Session$Device device;
    private final Long endedAt;
    private final List events;
    private final String generator;
    private final int generatorType;
    private final String identifier;
    private final CrashlyticsReport$Session$OperatingSystem os;
    private final long startedAt;
    private final CrashlyticsReport$Session$User user;

    private AutoValue_CrashlyticsReport_Session(String string2, String string3, String string4, long l2, Long l3, boolean bl2, CrashlyticsReport$Session$Application crashlyticsReport$Session$Application, CrashlyticsReport$Session$User crashlyticsReport$Session$User, CrashlyticsReport$Session$OperatingSystem crashlyticsReport$Session$OperatingSystem, CrashlyticsReport$Session$Device crashlyticsReport$Session$Device, List list, int n3) {
        this.generator = string2;
        this.identifier = string3;
        this.appQualitySessionId = string4;
        this.startedAt = l2;
        this.endedAt = l3;
        this.crashed = bl2;
        this.app = crashlyticsReport$Session$Application;
        this.user = crashlyticsReport$Session$User;
        this.os = crashlyticsReport$Session$OperatingSystem;
        this.device = crashlyticsReport$Session$Device;
        this.events = list;
        this.generatorType = n3;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session(String string2, String string3, String string4, long l2, Long l3, boolean bl2, CrashlyticsReport$Session$Application crashlyticsReport$Session$Application, CrashlyticsReport$Session$User crashlyticsReport$Session$User, CrashlyticsReport$Session$OperatingSystem crashlyticsReport$Session$OperatingSystem, CrashlyticsReport$Session$Device crashlyticsReport$Session$Device, List list, int n3, AutoValue_CrashlyticsReport_Session$1 autoValue_CrashlyticsReport_Session$1) {
        this(string2, string3, string4, l2, l3, bl2, crashlyticsReport$Session$Application, crashlyticsReport$Session$User, crashlyticsReport$Session$OperatingSystem, crashlyticsReport$Session$Device, list, n3);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean n4 = object instanceof CrashlyticsReport$Session;
        if (n4) {
            int n3;
            int n7;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            boolean bl6;
            boolean bl7;
            boolean bl8;
            boolean bl9;
            boolean bl10;
            long l2;
            long l3;
            long l4;
            long l7;
            boolean bl11;
            boolean bl12;
            Object object2 = this.generator;
            Object object3 = ((CrashlyticsReport$Session)(object = (CrashlyticsReport$Session)object)).getGenerator();
            boolean bl13 = ((String)object2).equals(object3);
            if (!(bl13 && (bl12 = ((String)(object2 = this.identifier)).equals(object3 = ((CrashlyticsReport$Session)object).getIdentifier())) && ((object2 = this.appQualitySessionId) == null ? (object2 = ((CrashlyticsReport$Session)object).getAppQualitySessionId()) == null : (bl11 = ((String)object2).equals(object3 = ((CrashlyticsReport$Session)object).getAppQualitySessionId()))) && (l7 = (l4 = (l3 = this.startedAt) - (l2 = ((CrashlyticsReport$Session)object).getStartedAt())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && ((object2 = this.endedAt) == null ? (object2 = ((CrashlyticsReport$Session)object).getEndedAt()) == null : (bl10 = ((Long)object2).equals(object3 = ((CrashlyticsReport$Session)object).getEndedAt()))) && (bl9 = this.crashed) == (bl8 = ((CrashlyticsReport$Session)object).isCrashed()) && (bl7 = (object2 = this.app).equals(object3 = ((CrashlyticsReport$Session)object).getApp())) && ((object2 = this.user) == null ? (object2 = ((CrashlyticsReport$Session)object).getUser()) == null : (bl6 = object2.equals(object3 = ((CrashlyticsReport$Session)object).getUser()))) && ((object2 = this.os) == null ? (object2 = ((CrashlyticsReport$Session)object).getOs()) == null : (bl5 = object2.equals(object3 = ((CrashlyticsReport$Session)object).getOs()))) && ((object2 = this.device) == null ? (object2 = ((CrashlyticsReport$Session)object).getDevice()) == null : (bl4 = object2.equals(object3 = ((CrashlyticsReport$Session)object).getDevice()))) && ((object2 = this.events) == null ? (object2 = ((CrashlyticsReport$Session)object).getEvents()) == null : (bl3 = object2.equals(object3 = ((CrashlyticsReport$Session)object).getEvents()))) && (n7 = this.generatorType) == (n3 = ((CrashlyticsReport$Session)object).getGeneratorType()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public CrashlyticsReport$Session$Application getApp() {
        return this.app;
    }

    public String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    public CrashlyticsReport$Session$Device getDevice() {
        return this.device;
    }

    public Long getEndedAt() {
        return this.endedAt;
    }

    public List getEvents() {
        return this.events;
    }

    public String getGenerator() {
        return this.generator;
    }

    public int getGeneratorType() {
        return this.generatorType;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public CrashlyticsReport$Session$OperatingSystem getOs() {
        return this.os;
    }

    public long getStartedAt() {
        return this.startedAt;
    }

    public CrashlyticsReport$Session$User getUser() {
        return this.user;
    }

    public int hashCode() {
        String string2 = this.generator;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.identifier.hashCode();
        n3 = (n3 ^ n7) * n4;
        Object object = this.appQualitySessionId;
        int n8 = 0;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((String)object).hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        long l2 = this.startedAt;
        long l3 = l2 >>> 32;
        n7 = (int)(l2 ^= l3);
        n3 = (n3 ^ n7) * n4;
        object = this.endedAt;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = ((Long)object).hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        n7 = (int)(this.crashed ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 ^ n7) * n4;
        n7 = this.app.hashCode();
        n3 = (n3 ^ n7) * n4;
        object = this.user;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        object = this.os;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        object = this.device;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        object = this.events;
        if (object != null) {
            n8 = object.hashCode();
        }
        n3 = (n3 ^ n8) * n4;
        n4 = this.generatorType;
        return n3 ^ n4;
    }

    public boolean isCrashed() {
        return this.crashed;
    }

    public CrashlyticsReport$Session$Builder toBuilder() {
        AutoValue_CrashlyticsReport_Session$Builder autoValue_CrashlyticsReport_Session$Builder = new AutoValue_CrashlyticsReport_Session$Builder(this, null);
        return autoValue_CrashlyticsReport_Session$Builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Session{generator=");
        Object object = this.generator;
        stringBuilder.append((String)object);
        stringBuilder.append(", identifier=");
        object = this.identifier;
        stringBuilder.append((String)object);
        stringBuilder.append(", appQualitySessionId=");
        object = this.appQualitySessionId;
        stringBuilder.append((String)object);
        stringBuilder.append(", startedAt=");
        long l2 = this.startedAt;
        stringBuilder.append(l2);
        stringBuilder.append(", endedAt=");
        object = this.endedAt;
        stringBuilder.append(object);
        stringBuilder.append(", crashed=");
        boolean bl2 = this.crashed;
        stringBuilder.append(bl2);
        stringBuilder.append(", app=");
        object = this.app;
        stringBuilder.append(object);
        stringBuilder.append(", user=");
        object = this.user;
        stringBuilder.append(object);
        stringBuilder.append(", os=");
        object = this.os;
        stringBuilder.append(object);
        stringBuilder.append(", device=");
        object = this.device;
        stringBuilder.append(object);
        stringBuilder.append(", events=");
        object = this.events;
        stringBuilder.append(object);
        stringBuilder.append(", generatorType=");
        return g30.a(this.generatorType, "}", stringBuilder);
    }
}

