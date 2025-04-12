/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

import com.google.android.datatransport.EventContext;

public abstract class EventContext$Builder {
    public abstract EventContext build();

    public abstract EventContext$Builder setExperimentIdsClear(byte[] var1);

    public abstract EventContext$Builder setExperimentIdsEncrypted(byte[] var1);

    public abstract EventContext$Builder setPseudonymousId(String var1);
}

