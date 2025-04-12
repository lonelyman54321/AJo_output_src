/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Pt3
 */
public final class pt3_0
extends vz2_2 {
    public static final pt3_0 c;

    static {
        pt3_0 pt3_02;
        xe_1.t(mt3_0.b);
        qt3_0 qt3_02 = qt3_0.a;
        c = pt3_02 = new vz2_2(qt3_02);
    }

    public final int d(Object object) {
        object = ((nt3_0)object).a;
        Intrinsics.checkNotNullParameter(object, "$this$collectionSize");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (ot3_0)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        Object object2 = this.b;
        long l2 = s30_02.o((SerialDescriptor)object2, n3).k();
        object2 = mt3_0.b;
        object.getClass();
        tz2_1.c((tz2_1)object);
        object2 = ((ot3_0)object).a;
        int n7 = ((ot3_0)object).b;
        ((ot3_0)object).b = n4 = n7 + 1;
        object2[n7] = l2;
    }

    public final Object g(Object object) {
        int n3;
        object = ((nt3_0)object).a;
        Intrinsics.checkNotNullParameter(object, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        ot3_0 ot3_02 = new tz2_1();
        ot3_02.a = (long[])object;
        ot3_02.b = n3 = ((Object)object).length;
        ot3_02.b(10);
        return ot3_02;
    }

    public final Object j() {
        long[] lArray = new long[]{};
        Intrinsics.checkNotNullParameter(lArray, "storage");
        nt3_0 nt3_02 = new nt3_0(lArray);
        return nt3_02;
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = ((nt3_0)object).a;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = this.b;
            object2 = u30_02.e((SerialDescriptor)object2, i3);
            Object object3 = object[i3];
            object2.q((long)object3);
        }
    }
}

