/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzli
extends RuntimeException {
    public zzli(int n3) {
        int n4 = 1;
        String string2 = n3 != n4 ? (n3 != (n4 = 2) ? "Detaching surface timed out." : "Setting foreground mode timed out.") : "Player release timed out.";
        super(string2);
    }
}

