/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from hs0
 */
public final class hs0_2
extends vz2_2 {
    public static final hs0_2 c;

    static {
        hs0_2 hs0_22;
        xe_1.y(DoubleCompanionObject.INSTANCE);
        os0_2 os0_22 = os0_2.a;
        c = hs0_22 = new vz2_2(os0_22);
    }

    public final int d(Object object) {
        object = (double[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (gs0_1)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        Object object2 = this.b;
        double d2 = s30_02.C((SerialDescriptor)object2, n3);
        object.getClass();
        tz2_1.c((tz2_1)object);
        object2 = ((gs0_1)object).a;
        int n7 = ((gs0_1)object).b;
        ((gs0_1)object).b = n4 = n7 + 1;
        object2[n7] = d2;
    }

    public final Object g(Object object) {
        int n3;
        object = (double[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        gs0_1 gs0_12 = new tz2_1();
        gs0_12.a = (double[])object;
        gs0_12.b = n3 = ((Object)object).length;
        gs0_12.b(10);
        return gs0_12;
    }

    public final Object j() {
        return new double[0];
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = (double[])object;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            uz2_2 uz2_22 = this.b;
            u30_02.L(uz2_22, i3, (double)object2);
        }
    }
}

