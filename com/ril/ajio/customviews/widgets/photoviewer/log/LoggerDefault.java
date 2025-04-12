/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.ril.ajio.customviews.widgets.photoviewer.log;

import android.util.Log;
import com.ril.ajio.customviews.widgets.photoviewer.log.Logger;

public class LoggerDefault
implements Logger {
    public int d(String string2, String string3) {
        return Log.d((String)string2, (String)string3);
    }

    public int d(String string2, String string3, Throwable throwable) {
        return Log.d((String)string2, (String)string3, (Throwable)throwable);
    }

    public int e(String string2, String string3) {
        return Log.e((String)string2, (String)string3);
    }

    public int e(String string2, String string3, Throwable throwable) {
        return Log.e((String)string2, (String)string3, (Throwable)throwable);
    }

    public int i(String string2, String string3) {
        return Log.i((String)string2, (String)string3);
    }

    public int i(String string2, String string3, Throwable throwable) {
        return Log.i((String)string2, (String)string3, (Throwable)throwable);
    }

    public int v(String string2, String string3) {
        return Log.v((String)string2, (String)string3);
    }

    public int v(String string2, String string3, Throwable throwable) {
        return Log.v((String)string2, (String)string3, (Throwable)throwable);
    }

    public int w(String string2, String string3) {
        return Log.w((String)string2, (String)string3);
    }

    public int w(String string2, String string3, Throwable throwable) {
        return Log.w((String)string2, (String)string3, (Throwable)throwable);
    }
}

