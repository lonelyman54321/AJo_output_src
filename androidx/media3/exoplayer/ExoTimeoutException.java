/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

public final class ExoTimeoutException
extends RuntimeException {
    public ExoTimeoutException(int n3) {
        int n4 = 1;
        String string2 = n3 != n4 ? (n3 != (n4 = 2) ? (n3 != (n4 = 3) ? "Undefined timeout." : "Detaching surface timed out.") : "Setting foreground mode timed out.") : "Player release timed out.";
        super(string2);
    }
}

