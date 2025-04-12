/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread
extends CrashlyticsReport$Session$Event$Application$Execution$Thread {
    private final List frames;
    private final int importance;
    private final String name;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String string2, int n3, List list) {
        this.name = string2;
        this.importance = n3;
        this.frames = list;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String string2, int n3, List list, AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$1 autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$1) {
        this(string2, n3, list);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean n3 = object instanceof CrashlyticsReport$Session$Event$Application$Execution$Thread;
        if (n3) {
            boolean bl3;
            int n4;
            int n7;
            Object object2 = this.name;
            String string2 = ((CrashlyticsReport$Session$Event$Application$Execution$Thread)(object = (CrashlyticsReport$Session$Event$Application$Execution$Thread)object)).getName();
            boolean bl4 = ((String)object2).equals(string2);
            if (!bl4 || (n7 = this.importance) != (n4 = ((CrashlyticsReport$Session$Event$Application$Execution$Thread)object).getImportance()) || !(bl3 = (object2 = this.frames).equals(object = ((CrashlyticsReport$Session$Event$Application$Execution$Thread)object).getFrames()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public List getFrames() {
        return this.frames;
    }

    public int getImportance() {
        return this.importance;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int n3 = this.name.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.importance;
        n3 = (n3 ^ n7) * n4;
        n4 = this.frames.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Thread{name=");
        Object object = this.name;
        stringBuilder.append((String)object);
        stringBuilder.append(", importance=");
        int n3 = this.importance;
        stringBuilder.append(n3);
        stringBuilder.append(", frames=");
        object = this.frames;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

