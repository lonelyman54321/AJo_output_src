/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import java.util.Date;

public class ConfigSharedPrefsClient$RealtimeBackoffMetadata {
    private Date backoffEndTime;
    private int numFailedStreams;

    public ConfigSharedPrefsClient$RealtimeBackoffMetadata(int n3, Date date) {
        this.numFailedStreams = n3;
        this.backoffEndTime = date;
    }

    public Date getBackoffEndTime() {
        return this.backoffEndTime;
    }

    public int getNumFailedStreams() {
        return this.numFailedStreams;
    }
}

