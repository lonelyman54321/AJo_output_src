/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import okio.a;

/*
 * Renamed from IE2
 */
public final class ie2_2
implements se_1 {
    public final a93_0 a;
    public final ce_2 b;
    public boolean c;

    public ie2_2(a93_0 a93_02) {
        Intrinsics.checkNotNullParameter(a93_02, "source");
        this.a = a93_02;
        this.b = a93_02;
    }

    public final long E(ff_2 serializable) {
        String string2;
        block3: {
            string2 = "targetBytes";
            Intrinsics.checkNotNullParameter(serializable, string2);
            Intrinsics.checkNotNullParameter(serializable, string2);
            boolean bl2 = this.c ^ true;
            if (!bl2) break block3;
            long l2 = 0L;
            while (true) {
                long l3;
                block5: {
                    block4: {
                        long l4;
                        ce_2 ce_22;
                        long l7;
                        long l8;
                        if ((l8 = (l7 = (l3 = (ce_22 = this.b).u(l2, (ff_2)serializable)) - (l4 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) break block4;
                        l3 = ce_22.b;
                        a93_0 a93_02 = this.a;
                        long l12 = 8192L;
                        long l14 = a93_02.a0(ce_22, l12);
                        long l15 = l14 - l4;
                        Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (object != false) break block5;
                        l3 = l4;
                    }
                    return l3;
                }
                l2 = Math.max(l2, l3);
            }
        }
        string2 = "closed".toString();
        serializable = new IllegalStateException(string2);
        throw serializable;
    }

    public final long H0() {
        ce_2 ce_22;
        block2: {
            int n3;
            long l2 = 1L;
            this.f(l2);
            int n4 = 0;
            NumberFormatException numberFormatException = null;
            while (true) {
                int n7;
                int n8 = n4 + 1;
                long l3 = n8;
                n3 = this.request(l3);
                ce_22 = this.b;
                if (n3 == 0) break block2;
                long l4 = n4;
                n3 = ce_22.n(l4);
                if (!(n3 >= (n7 = 48) && n3 <= (n7 = 57) || n3 >= (n7 = 97) && n3 <= (n7 = 102) || n3 >= (n7 = 65) && n3 <= (n7 = 70))) break;
                n4 = n8;
            }
            if (n4 == 0) {
                CharSequence charSequence = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                int n10 = CharsKt.checkRadix(CharsKt.checkRadix(16));
                String string2 = Integer.toString(n3, n10);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                charSequence.append(string2);
                charSequence = charSequence.toString();
                numberFormatException = new NumberFormatException((String)charSequence);
                throw numberFormatException;
            }
        }
        return ce_22.H0();
    }

    public final String L() {
        return this.x(Long.MAX_VALUE);
    }

    public final long T() {
        this.f(8);
        return this.b.T();
    }

    public final long a(byte by2, long l2, long l3) {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            l2 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object <= 0) {
                long l7;
                while (true) {
                    long l8;
                    a93_0 a93_02;
                    long l12;
                    l7 = -1;
                    object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object >= 0) break;
                    ce_2 ce_22 = this.b;
                    byte by4 = by2;
                    long l14 = l2;
                    long l15 = ce_22.p(by2, l2, l3);
                    long l16 = l15 - l7;
                    by4 = (byte)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                    if (by4 != 0) {
                        l7 = l15;
                        break;
                    }
                    ce_2 ce_23 = this.b;
                    long l17 = ce_23.b;
                    long l18 = l17 - l3;
                    Object object2 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                    if (object2 >= 0 || (object = (l12 = (l14 = (a93_02 = this.a).a0(ce_23, l8 = 8192L)) - l7) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false) break;
                    l2 = Math.max(l2, l17);
                }
                return l7;
            }
            String string2 = Wm2.a(l3, "fromIndex=0 toIndex=");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string3);
        throw illegalStateException;
    }

    public final long a0(ce_2 object, long l2) {
        Object object2 = "sink";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            l4 = this.c ^ 1;
            if (l4 != false) {
                long l7;
                ce_2 ce_22 = this.b;
                long l8 = ce_22.b;
                long l12 = l8 - l3;
                Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object3 != false || (object3 = (l7 = (l3 = (object2 = this.a).a0(ce_22, 8192L)) - (l8 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
                    l3 = ce_22.b;
                    l2 = Math.min(l2, l3);
                    l8 = ce_22.a0((ce_2)object, l2);
                }
                return l8;
            }
            String string2 = "closed".toString();
            object = new IllegalStateException(string2);
            throw object;
        }
        object = Wm2.a(l2, "byteCount < 0: ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final ie2_2 b() {
        oq2_2 oq2_22 = new oq2_2(this);
        return o72_0.b(oq2_22);
    }

    public final ff_2 b0(long l2) {
        this.f(l2);
        return this.b.b0(l2);
    }

    public final long c() {
        ce_2 ce_22;
        block2: {
            int n3;
            int n4;
            long l2;
            long l3 = 1L;
            this.f(l3);
            long l4 = l2 = 0L;
            while (true) {
                int n7;
                long l7 = l4 + l3;
                n4 = this.request(l7);
                ce_22 = this.b;
                if (n4 == 0) break block2;
                n4 = ce_22.n(l4);
                if (!(n4 >= (n3 = 48) && n4 <= (n3 = 57) || (n3 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1))) == 0 && n4 == (n7 = 45))) break;
                l4 = l7;
            }
            if (n3 == 0) {
                CharSequence charSequence = new StringBuilder("Expected a digit or '-' but was 0x");
                int n8 = CharsKt.checkRadix(CharsKt.checkRadix(16));
                String string2 = Integer.toString(n4, n8);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                charSequence.append(string2);
                charSequence = charSequence.toString();
                NumberFormatException numberFormatException = new NumberFormatException((String)charSequence);
                throw numberFormatException;
            }
        }
        return ce_22.z();
    }

    public final void close() {
        boolean bl2 = this.c;
        if (!bl2) {
            this.c = bl2 = true;
            this.a.close();
            ce_2 ce_22 = this.b;
            ce_22.b();
        }
    }

    public final short d() {
        this.f(2);
        return this.b.G();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int d0(aa2_2 object) {
        long l2;
        a93_0 a93_02;
        long l3;
        long l4;
        Object object2 = "options";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.c;
        boolean bl3 = true;
        if (!(bl2 ^= bl3)) {
            object2 = "closed".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        do {
            object2 = this.b;
            int n3 = c_0.b((ce_2)object2, (aa2_2)object, bl3);
            int n4 = -2;
            int n7 = -1;
            if (n3 == n4) continue;
            if (n3 == n7) return -1;
            object = ((aa2_2)object).b[n3];
            int n8 = ((ff_2)object).d();
            long l7 = n8;
            ((ce_2)object2).skip(l7);
            return n3;
        } while (bl2 = (l4 = (l3 = (a93_02 = this.a).a0((ce_2)object2, 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1));
        return -1;
    }

    public final ce_2 e() {
        return this.b;
    }

    public final void f(long l2) {
        boolean bl2 = this.request(l2);
        if (bl2) {
            return;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }

    public final boolean g() {
        boolean bl2 = this.c;
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            long l2;
            long l3;
            a93_0 a93_02;
            long l4;
            long l7;
            ce_2 ce_22 = this.b;
            boolean bl4 = ce_22.g();
            if (!bl4 || (bl2 = (l7 = (l4 = (a93_02 = this.a).a0(ce_22, l3 = 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) {
                bl3 = false;
                Object var12_10 = null;
            }
            return bl3;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final String h() {
        a93_0 a93_02 = this.a;
        ce_2 ce_22 = this.b;
        ce_22.s(a93_02);
        return ce_22.I();
    }

    public final byte[] h0() {
        a93_0 a93_02 = this.a;
        ce_2 ce_22 = this.b;
        ce_22.s(a93_02);
        long l2 = ce_22.b;
        return ce_22.w(l2);
    }

    public final InputStream inputStream() {
        IE2$a iE2$a = new IE2$a(this);
        return iE2$a;
    }

    public final boolean isOpen() {
        return this.c ^ true;
    }

    public final long j0(y63_0 y63_02) {
        long l2;
        ce_2 ce_22;
        a93_0 a93_02;
        long l3;
        long l4;
        Object object;
        long l7;
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(y63_02, string2);
        long l8 = l7 = 0L;
        while ((object = (l4 = (l3 = (a93_02 = this.a).a0(ce_22 = this.b, 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            l3 = ce_22.d();
            long l12 = l3 - l7;
            object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object <= 0) continue;
            l8 += l3;
            y63_02.s0(ce_22, l3);
        }
        l3 = ce_22.b;
        long l14 = l3 - l7;
        object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object > 0) {
            l8 += l3;
            y63_02.s0(ce_22, l3);
        }
        return l8;
    }

    public final String k(long l2) {
        this.f(l2);
        ce_2 ce_22 = this.b;
        ce_22.getClass();
        Charset charset = Charsets.UTF_8;
        return ce_22.H(l2, charset);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean l(long l2, ff_2 ff_22) {
        String string2 = "bytes";
        Intrinsics.checkNotNullParameter(ff_22, string2);
        byte[] byArray = ff_22.a;
        int n3 = byArray.length;
        Intrinsics.checkNotNullParameter(ff_22, string2);
        boolean bl2 = this.c;
        boolean bl3 = true;
        if (!(bl2 ^= bl3)) {
            String string3 = "closed".toString();
            IllegalStateException illegalStateException = new IllegalStateException(string3);
            throw illegalStateException;
        }
        long l3 = 0L;
        bl2 = false;
        string2 = null;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object < 0) return false;
        if (n3 < 0) return false;
        byte[] byArray2 = ff_22.a;
        int n4 = byArray2.length;
        if (n4 < n3) return false;
        n4 = 0;
        byArray2 = null;
        while (n4 < n3) {
            byte[] byArray3;
            byte by2;
            long l4 = (long)n4 + l2;
            long l7 = 1L + l4;
            boolean bl4 = this.request(l7);
            if (!bl4) return false;
            ce_2 ce_22 = this.b;
            byte by4 = ce_22.n(l4);
            if (by4 != (by2 = (byArray3 = ff_22.a)[n4])) {
                return false;
            }
            ++n4;
        }
        return bl3;
    }

    public final ce_2 m() {
        return this.b;
    }

    public final int read(ByteBuffer byteBuffer) {
        long l2;
        a93_0 a93_02;
        long l3;
        Intrinsics.checkNotNullParameter(byteBuffer, "sink");
        ce_2 ce_22 = this.b;
        long l4 = ce_22.b;
        long l7 = 0L;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 == false && (l8 = (l3 = (l4 = (a93_02 = this.a).a0(ce_22, l2 = 8192L)) - (l7 = (long)-1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
            return -1;
        }
        return ce_22.read(byteBuffer);
    }

    public final byte readByte() {
        this.f(1L);
        return this.b.readByte();
    }

    public final int readInt() {
        this.f(4);
        return this.b.readInt();
    }

    public final short readShort() {
        this.f(2);
        return this.b.readShort();
    }

    public final boolean request(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            boolean bl2 = this.c;
            boolean bl3 = true;
            if (bl2 ^= bl3) {
                block3: {
                    long l7;
                    long l8;
                    ce_2 ce_22;
                    a93_0 a93_02;
                    long l12;
                    long l14;
                    do {
                        ce_22 = this.b;
                        l12 = ce_22.b;
                        long l15 = l12 - l2;
                        Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (object2 >= 0) break block3;
                    } while (bl2 = (l14 = (l12 = (a93_02 = this.a).a0(ce_22, l8 = 8192L)) - (l7 = (long)-1)) == 0L ? 0 : (l14 < 0L ? -1 : 1));
                    bl3 = false;
                }
                return bl3;
            }
            String string2 = "closed".toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        String string3 = Wm2.a(l2, "byteCount < 0: ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final void skip(long l2) {
        boolean bl2 = this.c ^ true;
        if (bl2) {
            long l3;
            long l4;
            long l7;
            while ((l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                a93_0 a93_02;
                long l8;
                ce_2 ce_22 = this.b;
                long l12 = ce_22.b;
                long l14 = l12 - l3;
                Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object == false && (object = (l8 = (l3 = (a93_02 = this.a).a0(ce_22, 8192L)) - (l12 = (long)-1)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) {
                    EOFException eOFException = new EOFException();
                    throw eOFException;
                }
                l3 = ce_22.b;
                l3 = Math.min(l2, l3);
                ce_22.skip(l3);
                l2 -= l3;
            }
            return;
        }
        String string2 = "closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final String t0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        a93_0 a93_02 = this.a;
        ce_2 ce_22 = this.b;
        ce_22.s(a93_02);
        return ce_22.t0(charset);
    }

    public final a timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        a93_0 a93_02 = this.a;
        stringBuilder.append(a93_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final String x(long l2) {
        block2: {
            ce_2 ce_22;
            Object object;
            long l3;
            block5: {
                block4: {
                    int n3;
                    long l4;
                    Object object2;
                    long l7;
                    long l8;
                    long l12;
                    ie2_2 ie2_22;
                    block3: {
                        ie2_22 = this;
                        l3 = l2;
                        l12 = 0L;
                        long l14 = l2 - l12;
                        Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object3 < 0) break block2;
                        l8 = 1L;
                        l7 = Long.MAX_VALUE;
                        long l15 = l2 - l7;
                        object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        l4 = object2 == false ? l7 : (l12 = l2 + l8);
                        n3 = 10;
                        object = this;
                        l12 = this.a((byte)n3, 0L, l4);
                        long l16 = -1;
                        ce_22 = ie2_22.b;
                        Object object4 = l12 == l16 ? 0 : (l12 < l16 ? -1 : 1);
                        if (object4 == false) break block3;
                        object = c_0.a(ce_22, l12);
                        break block4;
                    }
                    object2 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                    if (object2 >= 0 || (object2 = (Object)ie2_22.request(l4)) == false || (object2 = (Object)ce_22.n(l12 = l4 - l8)) != (n3 = 13) || (object2 = (Object)ie2_22.request(l8 += l4)) == false || (object2 = (Object)ce_22.n(l4)) != (n3 = 10)) break block5;
                    object = c_0.a(ce_22, l4);
                }
                return object;
            }
            object = new ce_2();
            long l17 = ce_22.b;
            long l18 = Math.min((long)32, l17);
            ce_22.k((ce_2)object, 0L, l18);
            StringBuilder stringBuilder = new StringBuilder("\\n not found: limit=");
            long l19 = Math.min(ce_22.b, l3);
            stringBuilder.append(l19);
            stringBuilder.append(" content=");
            l19 = ((ce_2)object).b;
            object = ((ce_2)object).b0(l19).e();
            stringBuilder.append((String)object);
            stringBuilder.append('\u2026');
            object = stringBuilder.toString();
            EOFException eOFException = new EOFException((String)object);
            throw eOFException;
        }
        String string2 = Wm2.a(l2, "limit < 0: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final int x0() {
        this.f(4);
        return this.b.x0();
    }
}

