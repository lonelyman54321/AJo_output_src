/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.stacktrace;

public interface StackTraceTrimmingStrategy {
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] var1);
}

