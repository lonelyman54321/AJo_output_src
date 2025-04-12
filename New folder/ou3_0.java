/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from ou3
 */
public final class ou3_0
extends vz2_2 {
    public static final ou3_0 c;

    static {
        ou3_0 ou3_02;
        xe_1.u(lu3_0.b);
        pu3_0 pu3_02 = pu3_0.a;
        c = ou3_02 = new vz2_2(pu3_02);
    }

    public final int d(Object object) {
        object = ((mu3_0)object).a;
        Intrinsics.checkNotNullParameter(object, "$this$collectionSize");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (nu3_0)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        short s7 = s30_02.o(uz2_22, n3).p();
        Object object2 = lu3_0.b;
        object.getClass();
        tz2_1.c((tz2_1)object);
        object2 = ((nu3_0)object).a;
        int n7 = ((nu3_0)object).b;
        ((nu3_0)object).b = n4 = n7 + 1;
        object2[n7] = s7;
    }

    public final Object g(Object object) {
        int n3;
        object = ((mu3_0)object).a;
        Intrinsics.checkNotNullParameter(object, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        nu3_0 nu3_02 = new tz2_1();
        nu3_02.a = (short[])object;
        nu3_02.b = n3 = ((Object)object).length;
        nu3_02.b(10);
        return nu3_02;
    }

    public final Object j() {
        short[] sArray = new short[]{};
        Intrinsics.checkNotNullParameter(sArray, "storage");
        mu3_0 mu3_02 = new mu3_0(sArray);
        return mu3_02;
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = ((mu3_0)object).a;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = this.b;
            object2 = u30_02.e((SerialDescriptor)object2, i3);
            Object object3 = object[i3];
            object2.w((short)object3);
        }
    }
}

