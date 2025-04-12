/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

public interface Logger {
    public void error(Exception var1);

    public void error(String var1);

    public int getLogLevel();

    public void info(String var1);

    public void setLogLevel(int var1);

    public void verbose(String var1);

    public void warn(String var1);
}

