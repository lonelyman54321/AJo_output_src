/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Kt3
 */
public final class kt3_0
extends vz2_2 {
    public static final kt3_0 c;

    static {
        kt3_0 kt3_02;
        xe_1.s(ht3_0.b);
        lt3_0 lt3_02 = lt3_0.a;
        c = kt3_02 = new vz2_2(lt3_02);
    }

    public final int d(Object object) {
        object = ((it3_0)object).a;
        Intrinsics.checkNotNullParameter(object, "$this$collectionSize");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (jt3_0)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        int n7 = s30_02.o(uz2_22, n3).i();
        Object object2 = ht3_0.b;
        object.getClass();
        tz2_1.c((tz2_1)object);
        object2 = ((jt3_0)object).a;
        int n8 = ((jt3_0)object).b;
        ((jt3_0)object).b = n4 = n8 + 1;
        object2[n8] = n7;
    }

    public final Object g(Object object) {
        int n3;
        object = ((it3_0)object).a;
        Intrinsics.checkNotNullParameter(object, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        jt3_0 jt3_02 = new tz2_1();
        jt3_02.a = (int[])object;
        jt3_02.b = n3 = ((Object)object).length;
        jt3_02.b(10);
        return jt3_02;
    }

    public final Object j() {
        int[] nArray = new int[]{};
        Intrinsics.checkNotNullParameter(nArray, "storage");
        it3_0 it3_02 = new it3_0(nArray);
        return it3_02;
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = ((it3_0)object).a;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = this.b;
            object2 = u30_02.e((SerialDescriptor)object2, i3);
            Object object3 = object[i3];
            object2.J((int)object3);
        }
    }
}

