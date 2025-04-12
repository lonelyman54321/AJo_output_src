/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import okio.a;

public final class E91$b
implements y63_0 {
    public final rv0_2 a;
    public boolean b;
    public final /* synthetic */ e91_0 c;

    public E91$b(e91_0 object) {
        rv0_2 rv0_22;
        this.c = object;
        object = ((e91_0)object).d.timeout();
        this.a = rv0_22 = new rv0_2((a)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        synchronized (this) {
            int n3;
            boolean bl2 = this.b;
            if (bl2) {
                return;
            }
            this.b = bl2 = true;
            Object object = this.c;
            object = ((e91_0)object).d;
            Object object2 = "0\r\n\r\n";
            object.D((String)object2);
            object = this.c;
            object2 = this.a;
            e91_0.i((e91_0)object, (rv0_2)object2);
            object = this.c;
            ((e91_0)object).e = n3 = 3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        synchronized (this) {
            boolean bl2 = this.b;
            if (bl2) {
                return;
            }
            Object object = this.c;
            object = ((e91_0)object).d;
            object.flush();
            return;
        }
    }

    public final void s0(ce_2 object, long l2) {
        Object object2 = "source";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.b ^ true;
        if (bl2) {
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 == false) {
                return;
            }
            object2 = this.c;
            ((e91_0)object2).d.u0(l2);
            object2 = ((e91_0)object2).d;
            String string2 = "\r\n";
            object2.D(string2);
            object2.s0((ce_2)object, l2);
            object2.D(string2);
            return;
        }
        String string3 = "closed".toString();
        object = new IllegalStateException(string3);
        throw object;
    }

    public final a timeout() {
        return this.a;
    }
}

