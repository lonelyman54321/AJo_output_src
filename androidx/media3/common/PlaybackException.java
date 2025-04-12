/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common;

public class PlaybackException
extends Exception {
    public final int a;
    public final long b;

    static {
        f4.b(0, 1, 2, 3, 4);
        gz3.D(5);
    }

    public PlaybackException(String string2, Throwable throwable, int n3, long l2) {
        super(string2, throwable);
        this.a = n3;
        this.b = l2;
    }
}

