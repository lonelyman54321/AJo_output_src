/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import okio.a;

public final class E91$e
implements y63_0 {
    public final rv0_2 a;
    public boolean b;
    public final /* synthetic */ e91_0 c;

    public E91$e(e91_0 object) {
        rv0_2 rv0_22;
        this.c = object;
        object = ((e91_0)object).d.timeout();
        this.a = rv0_22 = new rv0_2((a)object);
    }

    public final void close() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        this.b = true;
        rv0_2 rv0_22 = this.a;
        e91_0 e91_02 = this.c;
        e91_0.i(e91_02, rv0_22);
        e91_02.e = 3;
    }

    public final void flush() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        this.c.d.flush();
    }

    public final void s0(ce_2 object, long l2) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.b ^ true;
        if (bl2) {
            long l3;
            long l4 = ((ce_2)object).b;
            long l7 = 0L;
            long l8 = l2 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 >= 0 && (object2 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1)) <= 0 && (l3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) >= 0) {
                this.c.d.s0((ce_2)object, l2);
                return;
            }
            object = new ArrayIndexOutOfBoundsException();
            throw object;
        }
        String string3 = "closed".toString();
        object = new IllegalStateException(string3);
        throw object;
    }

    public final a timeout() {
        return this.a;
    }
}

