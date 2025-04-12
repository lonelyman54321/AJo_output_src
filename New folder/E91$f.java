/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class E91$f
extends E91$a {
    public boolean d;

    public final long a0(ce_2 object, long l2) {
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(object, string2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            boolean bl2 = this.b;
            boolean bl3 = true;
            if (bl2 ^= bl3) {
                bl2 = this.d;
                long l7 = -1;
                if (bl2) {
                    return l7;
                }
                long l8 = super.a0((ce_2)object, l2);
                long l12 = l8 - l7;
                Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 == false) {
                    this.d = bl3;
                    this.a();
                    return l7;
                }
                return l8;
            }
            String string3 = "closed".toString();
            object = new IllegalStateException(string3);
            throw object;
        }
        object = Wm2.a(l2, "byteCount < 0: ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final void close() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        bl2 = this.d;
        if (!bl2) {
            this.a();
        }
        this.b = true;
    }
}

