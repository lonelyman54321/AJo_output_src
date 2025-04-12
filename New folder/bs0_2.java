/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bS0
 */
public final class bs0_2
extends vz2_2 {
    public static final bs0_2 c;

    static {
        bs0_2 bs0_22;
        xe_1.z(FloatCompanionObject.INSTANCE);
        ks0_2 ks0_22 = ks0_2.a;
        c = bs0_22 = new vz2_2(ks0_22);
    }

    public final int d(Object object) {
        object = (float[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (zr0_2)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        float f5 = s30_02.r(uz2_22, n3);
        object.getClass();
        tz2_1.c((tz2_1)object);
        float[] fArray = ((zr0_2)object).a;
        int n7 = ((zr0_2)object).b;
        ((zr0_2)object).b = n4 = n7 + 1;
        fArray[n7] = f5;
    }

    public final Object g(Object object) {
        int n3;
        object = (float[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        zr0_2 zr0_22 = new tz2_1();
        zr0_22.a = (float[])object;
        zr0_22.b = n3 = ((Object)object).length;
        zr0_22.b(10);
        return zr0_22;
    }

    public final Object j() {
        return new float[0];
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = (float[])object;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            uz2_2 uz2_22 = this.b;
            u30_02.y(uz2_22, i3, (float)object2);
        }
    }
}

