/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

import com.google.firebase.perf.util.Timer;

public class Clock {
    public Timer getTime() {
        Timer timer = new Timer();
        return timer;
    }
}

