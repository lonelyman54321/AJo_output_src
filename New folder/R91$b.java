/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

public final class R91$b
implements a93_0 {
    public final se_1 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public R91$b(se_1 se_12) {
        Intrinsics.checkNotNullParameter(se_12, "source");
        this.a = se_12;
    }

    public final long a0(ce_2 object, long l2) {
        long l3;
        se_1 se_12;
        long l4;
        int n3;
        block4: {
            int n4;
            block5: {
                int n7;
                String string2 = "sink";
                Intrinsics.checkNotNullParameter(object, string2);
                do {
                    n3 = this.e;
                    l4 = -1;
                    se_12 = this.a;
                    if (n3 != 0) break block4;
                    l3 = this.f;
                    se_12.skip(l3);
                    string2 = null;
                    this.f = 0;
                    n3 = this.c & 4;
                    if (n3 != 0) {
                        return l4;
                    }
                    n3 = this.d;
                    this.e = n4 = ez3.t(se_12);
                    this.b = n4;
                    n4 = se_12.readByte() & 0xFF;
                    this.c = n7 = se_12.readByte() & 0xFF;
                    Logger logger = r91_0.e;
                    Object object2 = Level.FINE;
                    boolean bl2 = logger.isLoggable((Level)object2);
                    if (bl2) {
                        object2 = f91_0.a;
                        int n8 = this.d;
                        int n10 = this.b;
                        int n14 = this.c;
                        object2.getClass();
                        bl2 = true;
                        object2 = f91_0.a(bl2, n8, n10, n4, n14);
                        logger.fine((String)object2);
                    }
                    this.d = n7 = se_12.readInt() & -1 >>> 1;
                    int n15 = 9;
                    if (n4 != n15) break block5;
                } while (n7 == n3);
                object = new IOException("TYPE_CONTINUATION streamId changed");
                throw object;
            }
            String string3 = UX.a(n4, " != TYPE_CONTINUATION");
            object = new IOException(string3);
            throw object;
        }
        l3 = n3;
        long l7 = se_12.a0((ce_2)object, l2 = Math.min(l2, l3));
        long l8 = l7 - l4;
        Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object3 == false) {
            return l4;
        }
        object3 = this.e;
        n3 = (int)l7;
        this.e = (int)(object3 -= n3);
        return l7;
    }

    public final void close() {
    }

    public final a timeout() {
        return this.a.timeout();
    }
}

