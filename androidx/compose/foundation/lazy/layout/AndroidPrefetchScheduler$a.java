/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

public final class AndroidPrefetchScheduler$a {
    public final long a;

    public AndroidPrefetchScheduler$a(long l2) {
        this.a = l2;
    }

    public final long a() {
        long l2 = this.a;
        long l3 = System.nanoTime();
        return Math.max(0L, l2 -= l3);
    }
}

