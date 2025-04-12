/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import java.util.Date;

class ConfigSharedPrefsClient$BackoffMetadata {
    private Date backoffEndTime;
    private int numFailedFetches;

    public ConfigSharedPrefsClient$BackoffMetadata(int n3, Date date) {
        this.numFailedFetches = n3;
        this.backoffEndTime = date;
    }

    public Date getBackoffEndTime() {
        return this.backoffEndTime;
    }

    public int getNumFailedFetches() {
        return this.numFailedFetches;
    }
}

