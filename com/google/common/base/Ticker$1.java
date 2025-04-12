/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Ticker;

class Ticker$1
extends Ticker {
    public long read() {
        return System.nanoTime();
    }
}

