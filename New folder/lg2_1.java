/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from Lg2
 */
public final class lg2_1
implements y63_0 {
    public final OutputStream a;
    public final a b;

    public lg2_1(OutputStream outputStream, a a2) {
        Intrinsics.checkNotNullParameter(outputStream, "out");
        Intrinsics.checkNotNullParameter(a2, "timeout");
        this.a = outputStream;
        this.b = a2;
    }

    public final void close() {
        this.a.close();
    }

    public final void flush() {
        this.a.flush();
    }

    public final void s0(ce_2 ce_22, long l2) {
        long l3;
        long l4;
        long l7;
        Object object = "source";
        Intrinsics.checkNotNullParameter(ce_22, (String)object);
        long l8 = ce_22.b;
        long l12 = 0L;
        l_0.b(l8, l12, l2);
        while ((l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            long l14;
            this.b.f();
            object = ce_22.a;
            Intrinsics.checkNotNull(object);
            int n3 = ((vx2_2)object).c;
            l7 = ((vx2_2)object).b;
            l8 = n3 - l7;
            l8 = Math.min(l2, l8);
            l7 = (int)l8;
            Object object2 = ((vx2_2)object).a;
            int n4 = ((vx2_2)object).b;
            OutputStream outputStream = this.a;
            outputStream.write((byte[])object2, n4, (int)l7);
            ((vx2_2)object).b = n3 = ((vx2_2)object).b + l7;
            long l15 = l7;
            l2 -= l15;
            ce_22.b = l14 = ce_22.b - l15;
            l7 = ((vx2_2)object).c;
            if (n3 != l7) continue;
            object2 = ((vx2_2)object).a();
            ce_22.a = object2;
            ax2_2.a((vx2_2)object);
        }
    }

    public final a timeout() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("sink(");
        OutputStream outputStream = this.a;
        stringBuilder.append(outputStream);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

