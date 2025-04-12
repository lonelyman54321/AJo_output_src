/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

public abstract class E91$a
implements a93_0 {
    public final rv0_2 a;
    public boolean b;
    public final /* synthetic */ e91_0 c;

    public E91$a(e91_0 object) {
        rv0_2 rv0_22;
        this.c = object;
        object = ((e91_0)object).c.timeout();
        this.a = rv0_22 = new rv0_2((a)object);
    }

    public final void a() {
        Object object = this.c;
        int n3 = ((e91_0)object).e;
        int n4 = 6;
        if (n3 == n4) {
            return;
        }
        int n7 = 5;
        if (n3 == n7) {
            rv0_2 rv0_22 = this.a;
            e91_0.i((e91_0)object, rv0_22);
            ((e91_0)object).e = n4;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("state: ");
        int n8 = ((e91_0)object).e;
        stringBuilder.append(n8);
        object = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public long a0(ce_2 ce_22, long l2) {
        e91_0 e91_02 = this.c;
        Object object = "sink";
        Intrinsics.checkNotNullParameter(ce_22, (String)object);
        try {
            object = e91_02.c;
        }
        catch (IOException iOException) {
            e91_02.b.l();
            this.a();
            throw iOException;
        }
        return object.a0(ce_22, l2);
    }

    public final a timeout() {
        return this.a;
    }
}

