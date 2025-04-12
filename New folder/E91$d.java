/*
 * Decompiled with CFR 0.152.
 */
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class E91$d
extends E91$a {
    public long d;
    public final /* synthetic */ e91_0 e;

    public E91$d(e91_0 e91_02, long l2) {
        this.e = e91_02;
        super(e91_02);
        this.d = l2;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            this.a();
        }
    }

    public final long a0(ce_2 object, long l2) {
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(object, string2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            l4 = this.b ^ 1;
            if (l4 != false) {
                long l7 = this.d;
                long l8 = -1;
                Object object2 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
                if (object2 == false) {
                    return l8;
                }
                long l12 = super.a0((ce_2)object, l2 = Math.min(l7, l2));
                long l14 = l12 - l8;
                Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object3 != false) {
                    this.d = l7 = this.d - l12;
                    object3 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
                    if (object3 == false) {
                        this.a();
                    }
                    return l12;
                }
                this.e.b.l();
                object = new ProtocolException("unexpected end of stream");
                this.a();
                throw object;
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
        Object object;
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        long l2 = this.d;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false && !(bl2 = ez3.h(this, (TimeUnit)((Object)(object = TimeUnit.MILLISECONDS))))) {
            object = this.e.b;
            ((je2_2)object).l();
            this.a();
        }
        this.b = true;
    }
}

