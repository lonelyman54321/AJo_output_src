/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from cB1
 */
public final class cb1_2
extends vz2_2 {
    public static final cb1_2 c;

    static {
        cb1_2 cb1_22;
        xe_1.B(LongCompanionObject.INSTANCE);
        mb1_2 mb1_22 = mb1_2.a;
        c = cb1_22 = new vz2_2(mb1_22);
    }

    public final int d(Object object) {
        object = (long[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (ab1_1)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        Object object2 = this.b;
        long l2 = s30_02.g((SerialDescriptor)object2, n3);
        object.getClass();
        tz2_1.c((tz2_1)object);
        object2 = ((ab1_1)object).a;
        int n7 = ((ab1_1)object).b;
        ((ab1_1)object).b = n4 = n7 + 1;
        object2[n7] = l2;
    }

    public final Object g(Object object) {
        int n3;
        object = (long[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        ab1_1 ab1_12 = new tz2_1();
        ab1_12.a = (long[])object;
        ab1_12.b = n3 = ((Object)object).length;
        ab1_12.b(10);
        return ab1_12;
    }

    public final Object j() {
        return new long[0];
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = (long[])object;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            uz2_2 uz2_22 = this.b;
            u30_02.M(uz2_22, i3, (long)object2);
        }
    }
}

