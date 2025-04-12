/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from HE2
 */
public final class he2_2
implements re_2 {
    public final y63_0 a;
    public final ce_2 b;
    public boolean c;

    public he2_2(y63_0 y63_02) {
        Intrinsics.checkNotNullParameter(y63_02, "sink");
        this.a = y63_02;
        this.b = y63_02;
    }

    public final re_2 D(String object) {
        String string2 = "string";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.I0((String)object);
            this.v();
            return this;
        }
        string2 = "closed".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final re_2 S(int n3, byte[] object, int n4) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.R((byte[])object, n3, n4);
            this.v();
            return this;
        }
        object = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final re_2 V(ff_2 serializable) {
        String string2 = "byteString";
        Intrinsics.checkNotNullParameter(serializable, string2);
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.P((ff_2)serializable);
            this.v();
            return this;
        }
        string2 = "closed".toString();
        serializable = new IllegalStateException(string2);
        throw serializable;
    }

    public final re_2 Y(long l2) {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.W(l2);
            this.v();
            return this;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final void close() {
        block9: {
            boolean bl2;
            Object object;
            block8: {
                boolean bl3;
                y63_0 y63_02;
                block7: {
                    y63_02 = this.a;
                    bl3 = this.c;
                    if (bl3) break block9;
                    object = this.b;
                    long l2 = ((ce_2)object).b;
                    long l3 = 0L;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 <= 0) break block7;
                    try {
                        y63_02.s0((ce_2)object, l2);
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                bl3 = false;
                object = null;
                try {
                    y63_02.close();
                }
                catch (Throwable throwable) {
                    if (object != null) break block8;
                    object = throwable;
                }
            }
            this.c = bl2 = true;
            if (object != null) {
                throw object;
            }
        }
    }

    public final ce_2 e() {
        return this.b;
    }

    public final void flush() {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            ce_2 ce_22 = this.b;
            long l2 = ce_22.b;
            long l3 = 0L;
            y63_0 y63_02 = this.a;
            Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object > 0) {
                y63_02.s0(ce_22, l2);
            }
            y63_02.flush();
            return;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final boolean isOpen() {
        return this.c ^ true;
    }

    public final long s(a93_0 a93_02) {
        long l2;
        long l3;
        ce_2 ce_22;
        long l4;
        long l7;
        long l8;
        String string2 = "source";
        Intrinsics.checkNotNullParameter(a93_02, string2);
        long l12 = 0L;
        while ((l8 = (l7 = (l4 = a93_02.a0(ce_22 = this.b, l3 = 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
            l12 += l4;
            this.v();
        }
        return l12;
    }

    public final void s0(ce_2 object, long l2) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.s0((ce_2)object, l2);
            this.v();
            return;
        }
        String string3 = "closed".toString();
        object = new IllegalStateException(string3);
        throw object;
    }

    public final a timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        y63_0 y63_02 = this.a;
        stringBuilder.append(y63_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final re_2 u0(long l2) {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.l0(l2);
            this.v();
            return this;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final re_2 v() {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            long l2;
            ce_2 ce_22 = this.b;
            long l3 = ce_22.d();
            long l4 = l3 - (l2 = 0L);
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object > 0) {
                y63_0 y63_02 = this.a;
                y63_02.s0(ce_22, l3);
            }
            return this;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int write(ByteBuffer object) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.c ^ true;
        if (bl2) {
            int n3 = this.b.write((ByteBuffer)object);
            this.v();
            return n3;
        }
        string2 = "closed".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final re_2 write(byte[] object) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.Q((byte[])object);
            this.v();
            return this;
        }
        object = new IllegalStateException;
        string2 = "closed".toString();
        object(string2);
        throw object;
    }

    public final re_2 writeByte(int n3) {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.U(n3);
            this.v();
            return this;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final re_2 writeInt(int n3) {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.v0(n3);
            this.v();
            return this;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final re_2 writeShort(int n3) {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            this.b.y0(n3);
            this.v();
            return this;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

