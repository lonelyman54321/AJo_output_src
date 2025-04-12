/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Ft3
 */
public final class ft3_0
extends vz2_2 {
    public static final ft3_0 c;

    static {
        ft3_0 ft3_02;
        xe_1.r(ct3_0.b);
        gt3_0 gt3_02 = gt3_0.a;
        c = ft3_02 = new vz2_2(gt3_02);
    }

    public final int d(Object object) {
        object = ((dt3_0)object).a;
        Intrinsics.checkNotNullParameter(object, "$this$collectionSize");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (et3_0)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        byte by2 = s30_02.o(uz2_22, n3).D();
        Object object2 = ct3_0.b;
        object.getClass();
        tz2_1.c((tz2_1)object);
        object2 = ((et3_0)object).a;
        int n7 = ((et3_0)object).b;
        ((et3_0)object).b = n4 = n7 + 1;
        object2[n7] = by2;
    }

    public final Object g(Object object) {
        int n3;
        object = ((dt3_0)object).a;
        Intrinsics.checkNotNullParameter(object, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        et3_0 et3_02 = new tz2_1();
        et3_02.a = (byte[])object;
        et3_02.b = n3 = ((Object)object).length;
        et3_02.b(10);
        return et3_02;
    }

    public final Object j() {
        byte[] byArray = new byte[]{};
        Intrinsics.checkNotNullParameter(byArray, "storage");
        dt3_0 dt3_02 = new dt3_0(byArray);
        return dt3_02;
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = ((dt3_0)object).a;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = this.b;
            object2 = u30_02.e((SerialDescriptor)object2, i3);
            Object object3 = object[i3];
            object2.g((byte)object3);
        }
    }
}

