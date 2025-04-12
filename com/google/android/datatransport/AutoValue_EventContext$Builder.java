/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

import com.google.android.datatransport.AutoValue_EventContext;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.EventContext$Builder;

final class AutoValue_EventContext$Builder
extends EventContext$Builder {
    private byte[] experimentIdsClear;
    private byte[] experimentIdsEncrypted;
    private String pseudonymousId;

    public EventContext build() {
        String string2 = this.pseudonymousId;
        byte[] byArray = this.experimentIdsClear;
        byte[] byArray2 = this.experimentIdsEncrypted;
        AutoValue_EventContext autoValue_EventContext = new AutoValue_EventContext(string2, byArray, byArray2, null);
        return autoValue_EventContext;
    }

    public EventContext$Builder setExperimentIdsClear(byte[] byArray) {
        this.experimentIdsClear = byArray;
        return this;
    }

    public EventContext$Builder setExperimentIdsEncrypted(byte[] byArray) {
        this.experimentIdsEncrypted = byArray;
        return this;
    }

    public EventContext$Builder setPseudonymousId(String string2) {
        this.pseudonymousId = string2;
        return this;
    }
}

