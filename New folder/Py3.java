/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Py3 {
    public static final String a(ee_2 object, long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            return "";
        }
        Object object3 = ((ee_2)object).a;
        if (object3 != null) {
            int n3 = ((ux2_2)object3).b();
            long l7 = n3;
            long l8 = l7 - l2;
            Object object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object4 >= 0) {
                n3 = ((ux2_2)object3).b;
                object2 = ((ux2_2)object3).c;
                object4 = (int)l2 + n3;
                object2 = Math.min((int)object2, (int)object4);
                object3 = ((ux2_2)object3).a;
                object3 = wj3_1.a(n3, (byte[])object3, (int)object2);
                ((ee_2)object).skip(l2);
                return object3;
            }
            int n4 = (int)l2;
            object = o93_0.a((b93_0)object, n4);
            int n7 = ((Object)object).length;
            return wj3_1.a(0, (byte[])object, n7);
        }
        String string2 = "Unreacheable".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public static final String b(b93_0 b93_02) {
        Intrinsics.checkNotNullParameter(b93_02, "<this>");
        b93_02.request(Long.MAX_VALUE);
        ee_2 ee_22 = b93_02.e();
        long l2 = b93_02.e().c;
        return Py3.a(ee_22, l2);
    }
}

