/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from D93
 */
public final class d93_0
implements uf_1 {
    public final b93_0 b;
    private volatile yv_2 closed;

    public d93_0(ee_2 ee_22) {
        Intrinsics.checkNotNullParameter(ee_22, "source");
        this.b = ee_22;
    }

    public final void e(Throwable throwable) {
        yv_2 yv_22 = this.closed;
        if (yv_22 != null) {
            return;
        }
        this.b.close();
        String string2 = throwable.getMessage();
        if (string2 == null) {
            string2 = "Channel was cancelled";
        }
        IOException iOException = new IOException(string2, throwable);
        this.closed = yv_22 = new yv_2(iOException);
    }

    public final Throwable f() {
        Object object = this.closed;
        if (object != null) {
            xv_2 xv_22 = xv_2.a;
            object = ((yv_2)object).a(xv_22);
        } else {
            object = null;
        }
        return object;
    }

    public final b93_0 g() {
        Throwable throwable = this.f();
        if (throwable == null) {
            return this.b;
        }
        throw throwable;
    }

    public final Object h(int n3, f80_0 object) {
        object = this.f();
        if (object == null) {
            long l2;
            object = this.b;
            long l3 = af_2.c((b93_0)object);
            long l4 = l3 - (l2 = (long)n3);
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            n3 = object2 >= 0 ? 1 : 0;
            return n3 != 0;
        }
        throw object;
    }

    public final boolean i() {
        return this.b.g();
    }
}

