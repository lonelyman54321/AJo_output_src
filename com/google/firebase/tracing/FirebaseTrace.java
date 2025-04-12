/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
package com.google.firebase.tracing;

import android.os.Trace;

public final class FirebaseTrace {
    private FirebaseTrace() {
    }

    public static void popTrace() {
        Trace.endSection();
    }

    public static void pushTrace(String string2) {
        Trace.beginSection((String)string2);
    }
}

