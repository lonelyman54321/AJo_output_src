/*
 * Decompiled with CFR 0.152.
 */
package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.a$a;

public class a {
    public static final a$a d;
    public boolean a;
    public long b;
    public long c;

    static {
        a$a a$a;
        d = a$a = new a();
    }

    public a a() {
        this.a = false;
        return this;
    }

    public a b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        boolean bl2 = this.a;
        if (bl2) {
            return this.b;
        }
        String string2 = "No deadline".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public a d(long l2) {
        this.a = true;
        this.b = l2;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        Object object = Thread.currentThread();
        boolean bl2 = ((Thread)object).isInterrupted();
        if (!bl2) {
            bl2 = this.a;
            if (bl2) {
                long l2 = this.b;
                long l3 = System.nanoTime();
                long l4 = (l2 -= l3) - (l3 = 0L);
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 <= 0) {
                    object = new InterruptedIOException("deadline reached");
                    throw object;
                }
            }
            return;
        }
        object = new InterruptedIOException("interrupted");
        throw object;
    }

    public a g(long l2, TimeUnit timeUnit) {
        String string2 = "unit";
        Intrinsics.checkNotNullParameter((Object)timeUnit, string2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            this.c = l2 = timeUnit.toNanos(l2);
            return this;
        }
        String string3 = Wm2.a(l2, "timeout < 0: ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }
}

