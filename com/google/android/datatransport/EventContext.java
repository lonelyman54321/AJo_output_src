/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

import com.google.android.datatransport.AutoValue_EventContext$Builder;
import com.google.android.datatransport.EventContext$Builder;

public abstract class EventContext {
    public static EventContext$Builder builder() {
        AutoValue_EventContext$Builder autoValue_EventContext$Builder = new AutoValue_EventContext$Builder();
        return autoValue_EventContext$Builder;
    }

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public abstract String getPseudonymousId();
}

