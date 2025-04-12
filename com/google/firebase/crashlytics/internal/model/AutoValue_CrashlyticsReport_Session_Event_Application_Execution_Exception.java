/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception
extends CrashlyticsReport$Session$Event$Application$Execution$Exception {
    private final CrashlyticsReport$Session$Event$Application$Execution$Exception causedBy;
    private final List frames;
    private final int overflowCount;
    private final String reason;
    private final String type;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String string2, String string3, List list, CrashlyticsReport$Session$Event$Application$Execution$Exception crashlyticsReport$Session$Event$Application$Execution$Exception, int n3) {
        this.type = string2;
        this.reason = string3;
        this.frames = list;
        this.causedBy = crashlyticsReport$Session$Event$Application$Execution$Exception;
        this.overflowCount = n3;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String string2, String string3, List list, CrashlyticsReport$Session$Event$Application$Execution$Exception crashlyticsReport$Session$Event$Application$Execution$Exception, int n3, AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1 autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1) {
        this(string2, string3, list, crashlyticsReport$Session$Event$Application$Execution$Exception, n3);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean n3 = object instanceof CrashlyticsReport$Session$Event$Application$Execution$Exception;
        if (n3) {
            int n4;
            int n7;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            Object object2 = this.type;
            Object object3 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception)(object = (CrashlyticsReport$Session$Event$Application$Execution$Exception)object)).getType();
            boolean bl6 = ((String)object2).equals(object3);
            if (!(bl6 && ((object2 = this.reason) == null ? (object2 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception)object).getReason()) == null : (bl5 = ((String)object2).equals(object3 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception)object).getReason()))) && (bl4 = (object2 = this.frames).equals(object3 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception)object).getFrames())) && ((object2 = this.causedBy) == null ? (object2 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception)object).getCausedBy()) == null : (bl3 = object2.equals(object3 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception)object).getCausedBy()))) && (n7 = this.overflowCount) == (n4 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception)object).getOverflowCount()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public CrashlyticsReport$Session$Event$Application$Execution$Exception getCausedBy() {
        return this.causedBy;
    }

    public List getFrames() {
        return this.frames;
    }

    public int getOverflowCount() {
        return this.overflowCount;
    }

    public String getReason() {
        return this.reason;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        String string2 = this.type;
        int n4 = string2.hashCode();
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        Object object = this.reason;
        int n8 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        n3 = this.frames.hashCode();
        n4 = (n4 ^ n3) * n7;
        object = this.causedBy;
        if (object != null) {
            n8 = object.hashCode();
        }
        n4 = (n4 ^ n8) * n7;
        n7 = this.overflowCount;
        return n4 ^ n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Exception{type=");
        Object object = this.type;
        stringBuilder.append((String)object);
        stringBuilder.append(", reason=");
        object = this.reason;
        stringBuilder.append((String)object);
        stringBuilder.append(", frames=");
        object = this.frames;
        stringBuilder.append(object);
        stringBuilder.append(", causedBy=");
        object = this.causedBy;
        stringBuilder.append(object);
        stringBuilder.append(", overflowCount=");
        return g30.a(this.overflowCount, "}", stringBuilder);
    }
}

