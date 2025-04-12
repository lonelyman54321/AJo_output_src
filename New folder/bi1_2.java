/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from bi1
 */
public final class bi1_2
implements a93_0 {
    public final InputStream a;
    public final a b;

    public bi1_2(InputStream inputStream, a a2) {
        Intrinsics.checkNotNullParameter(inputStream, "input");
        Intrinsics.checkNotNullParameter(a2, "timeout");
        this.a = inputStream;
        this.b = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a0(ce_2 object, long l2) {
        AssertionError assertionError2;
        block6: {
            int n3;
            Object object2 = "sink";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) {
                return l3;
            }
            if (l4 < 0) {
                object = Wm2.a(l2, "byteCount < 0: ");
                object = object.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            try {
                object2 = this.b;
                ((a)object2).f();
                int n4 = 1;
                object2 = ((ce_2)object).O(n4);
                n3 = ((vx2_2)object2).c;
                n3 = 8192 - n3;
            }
            catch (AssertionError assertionError2) {
                break block6;
            }
            long l7 = n3;
            l2 = Math.min(l2, l7);
            int n7 = (int)l2;
            Object object3 = this.a;
            byte[] byArray = ((vx2_2)object2).a;
            l4 = ((vx2_2)object2).c;
            int n8 = ((InputStream)object3).read(byArray, (int)l4, n7);
            n7 = -1;
            if (n8 == n7) {
                n8 = ((vx2_2)object2).b;
                n7 = ((vx2_2)object2).c;
                if (n8 != n7) return -1;
                ((ce_2)object).a = object3 = ((vx2_2)object2).a();
                ax2_2.a((vx2_2)object2);
                return -1;
            }
            ((vx2_2)object2).c = n7 = ((vx2_2)object2).c + n8;
            l3 = ((ce_2)object).b;
            l2 = n8;
            ((ce_2)object).b = l3 += l2;
            return l2;
        }
        boolean bl2 = o72_0.c(assertionError2);
        if (!bl2) throw assertionError2;
        IOException iOException = new IOException((Throwable)((Object)assertionError2));
        throw iOException;
    }

    public final void close() {
        this.a.close();
    }

    public final a timeout() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("source(");
        InputStream inputStream = this.a;
        stringBuilder.append(inputStream);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

