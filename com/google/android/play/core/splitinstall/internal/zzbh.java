/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

public final class zzbh
extends RuntimeException {
    public zzbh(String string2) {
        super(string2);
    }

    public zzbh(String string2, Throwable throwable) {
        super("Failed to initialize FileStorage", throwable);
    }
}

