/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

public interface LogsManager {
    public void addDeviceError(String var1);

    public void addDeviceError(Throwable var1);

    public void addNetworkError(Throwable var1);

    public void addSdkError(Throwable var1);

    public void addUserError(Throwable var1);
}

