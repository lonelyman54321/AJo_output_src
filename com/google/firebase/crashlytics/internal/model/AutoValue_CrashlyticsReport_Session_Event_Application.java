/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$1;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application
extends CrashlyticsReport$Session$Event$Application {
    private final List appProcessDetails;
    private final Boolean background;
    private final CrashlyticsReport$Session$Event$Application$ProcessDetails currentProcessDetails;
    private final List customAttributes;
    private final CrashlyticsReport$Session$Event$Application$Execution execution;
    private final List internalKeys;
    private final int uiOrientation;

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport$Session$Event$Application$Execution crashlyticsReport$Session$Event$Application$Execution, List list, List list2, Boolean bl2, CrashlyticsReport$Session$Event$Application$ProcessDetails crashlyticsReport$Session$Event$Application$ProcessDetails, List list3, int n3) {
        this.execution = crashlyticsReport$Session$Event$Application$Execution;
        this.customAttributes = list;
        this.internalKeys = list2;
        this.background = bl2;
        this.currentProcessDetails = crashlyticsReport$Session$Event$Application$ProcessDetails;
        this.appProcessDetails = list3;
        this.uiOrientation = n3;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport$Session$Event$Application$Execution crashlyticsReport$Session$Event$Application$Execution, List list, List list2, Boolean bl2, CrashlyticsReport$Session$Event$Application$ProcessDetails crashlyticsReport$Session$Event$Application$ProcessDetails, List list3, int n3, AutoValue_CrashlyticsReport_Session_Event_Application$1 autoValue_CrashlyticsReport_Session_Event_Application$1) {
        this(crashlyticsReport$Session$Event$Application$Execution, list, list2, bl2, crashlyticsReport$Session$Event$Application$ProcessDetails, list3, n3);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof CrashlyticsReport$Session$Event$Application;
        if (n3 != 0) {
            int n4;
            Object object2 = this.execution;
            Object object3 = ((CrashlyticsReport$Session$Event$Application)(object = (CrashlyticsReport$Session$Event$Application)object)).getExecution();
            n3 = object2.equals(object3);
            if (!(n3 != 0 && ((object2 = this.customAttributes) == null ? (object2 = ((CrashlyticsReport$Session$Event$Application)object).getCustomAttributes()) == null : (n3 = object2.equals(object3 = ((CrashlyticsReport$Session$Event$Application)object).getCustomAttributes())) != 0) && ((object2 = this.internalKeys) == null ? (object2 = ((CrashlyticsReport$Session$Event$Application)object).getInternalKeys()) == null : (n3 = object2.equals(object3 = ((CrashlyticsReport$Session$Event$Application)object).getInternalKeys())) != 0) && ((object2 = this.background) == null ? (object2 = ((CrashlyticsReport$Session$Event$Application)object).getBackground()) == null : (n3 = ((Boolean)object2).equals(object3 = ((CrashlyticsReport$Session$Event$Application)object).getBackground())) != 0) && ((object2 = this.currentProcessDetails) == null ? (object2 = ((CrashlyticsReport$Session$Event$Application)object).getCurrentProcessDetails()) == null : (n3 = object2.equals(object3 = ((CrashlyticsReport$Session$Event$Application)object).getCurrentProcessDetails())) != 0) && ((object2 = this.appProcessDetails) == null ? (object2 = ((CrashlyticsReport$Session$Event$Application)object).getAppProcessDetails()) == null : (n3 = object2.equals(object3 = ((CrashlyticsReport$Session$Event$Application)object).getAppProcessDetails())) != 0) && (n3 = this.uiOrientation) == (n4 = ((CrashlyticsReport$Session$Event$Application)object).getUiOrientation()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public List getAppProcessDetails() {
        return this.appProcessDetails;
    }

    public Boolean getBackground() {
        return this.background;
    }

    public CrashlyticsReport$Session$Event$Application$ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public List getCustomAttributes() {
        return this.customAttributes;
    }

    public CrashlyticsReport$Session$Event$Application$Execution getExecution() {
        return this.execution;
    }

    public List getInternalKeys() {
        return this.internalKeys;
    }

    public int getUiOrientation() {
        return this.uiOrientation;
    }

    public int hashCode() {
        int n3;
        CrashlyticsReport$Session$Event$Application$Execution crashlyticsReport$Session$Event$Application$Execution = this.execution;
        int n4 = crashlyticsReport$Session$Event$Application$Execution.hashCode();
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        Object object = this.customAttributes;
        int n8 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        object = this.internalKeys;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        object = this.background;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Boolean)object).hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        object = this.currentProcessDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        object = this.appProcessDetails;
        if (object != null) {
            n8 = object.hashCode();
        }
        n4 = (n4 ^ n8) * n7;
        n7 = this.uiOrientation;
        return n4 ^ n7;
    }

    public CrashlyticsReport$Session$Event$Application$Builder toBuilder() {
        AutoValue_CrashlyticsReport_Session_Event_Application$Builder autoValue_CrashlyticsReport_Session_Event_Application$Builder = new AutoValue_CrashlyticsReport_Session_Event_Application$Builder(this, null);
        return autoValue_CrashlyticsReport_Session_Event_Application$Builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Application{execution=");
        Object object = this.execution;
        stringBuilder.append(object);
        stringBuilder.append(", customAttributes=");
        object = this.customAttributes;
        stringBuilder.append(object);
        stringBuilder.append(", internalKeys=");
        object = this.internalKeys;
        stringBuilder.append(object);
        stringBuilder.append(", background=");
        object = this.background;
        stringBuilder.append(object);
        stringBuilder.append(", currentProcessDetails=");
        object = this.currentProcessDetails;
        stringBuilder.append(object);
        stringBuilder.append(", appProcessDetails=");
        object = this.appProcessDetails;
        stringBuilder.append(object);
        stringBuilder.append(", uiOrientation=");
        return g30.a(this.uiOrientation, "}", stringBuilder);
    }
}

