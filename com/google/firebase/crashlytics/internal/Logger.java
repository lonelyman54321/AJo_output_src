/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.firebase.crashlytics.internal;

import android.util.Log;

public class Logger {
    static final Logger DEFAULT_LOGGER;
    public static final String TAG = "FirebaseCrashlytics";
    private int logLevel;
    private final String tag;

    static {
        Logger logger;
        DEFAULT_LOGGER = logger = new Logger(TAG);
    }

    public Logger(String string2) {
        this.tag = string2;
        this.logLevel = 4;
    }

    private boolean canLog(int n3) {
        String string2;
        int n4 = this.logLevel;
        n3 = n4 > n3 && (n3 = (int)(Log.isLoggable((String)(string2 = this.tag), (int)n3) ? 1 : 0)) == 0 ? 0 : 1;
        return n3 != 0;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    public void d(String string2) {
        this.d(string2, null);
    }

    public void d(String string2, Throwable throwable) {
        this.canLog(3);
    }

    public void e(String string2) {
        this.e(string2, null);
    }

    public void e(String string2, Throwable throwable) {
        this.canLog(6);
    }

    public void i(String string2) {
        this.i(string2, null);
    }

    public void i(String string2, Throwable throwable) {
        this.canLog(4);
    }

    public void log(int n3, String string2) {
        this.log(n3, string2, false);
    }

    public void log(int n3, String string2, boolean bl2) {
        if (bl2 || (bl2 = this.canLog(n3))) {
            String string3 = this.tag;
            Log.println((int)n3, (String)string3, (String)string2);
        }
    }

    public void v(String string2) {
        this.v(string2, null);
    }

    public void v(String string2, Throwable throwable) {
        this.canLog(2);
    }

    public void w(String string2) {
        this.w(string2, null);
    }

    public void w(String string2, Throwable throwable) {
        this.canLog(5);
    }
}

