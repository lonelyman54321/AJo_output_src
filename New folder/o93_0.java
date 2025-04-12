/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from O93
 */
public final class o93_0 {
    public static final byte[] a(b93_0 object, int n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        long l2 = n3;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            return o93_0.b((b93_0)object, n3);
        }
        object = Ov2.a(l2, "byteCount (", ") < 0");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final byte[] b(b93_0 object, int n3) {
        long l2;
        Object object2;
        long l3;
        long l4;
        int n4 = -1;
        if (n3 == n4) {
            l3 = l4 = Integer.MAX_VALUE;
            while (true) {
                object2 = object.e();
                l2 = ((ee_2)object2).c;
                long l7 = l2 - l4;
                n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                if (n3 >= 0 || (n3 = (int)(object.request(l3) ? 1 : 0)) == 0) break;
                n3 = 2;
                l2 = n3;
                l3 *= l2;
            }
            object2 = object.e();
            l3 = ((ee_2)object2).c;
            long l8 = l3 - l4;
            n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n3 >= 0) {
                object2 = new StringBuilder("Can't create an array of size ");
                long l12 = object.e().c;
                ((StringBuilder)object2).append(l12);
                object = ((StringBuilder)object2).toString();
                object = object.toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            object2 = object.e();
            l4 = ((ee_2)object2).c;
            n3 = (int)l4;
        } else {
            l4 = n3;
            object.f(l4);
        }
        byte[] byArray = new byte[n3];
        object = object.e();
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(byArray, "sink");
        long l14 = n3;
        int n7 = 0;
        l2 = 0;
        l3 = l14;
        xj3_1.a(l14, l2, l14);
        while (n7 < n3) {
            int n8 = ((ee_2)object).X(n7, byArray, n3);
            if (n8 == n4) {
                object2 = z41.a("Source exhausted before reading ", " bytes. Only ", " bytes were read.", n3, n8);
                object = new EOFException((String)object2);
                throw object;
            }
            n7 += n8;
        }
        return byArray;
    }
}

