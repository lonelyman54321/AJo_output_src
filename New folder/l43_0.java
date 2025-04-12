/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/*
 * Renamed from l43
 */
public final class l43_0
extends vz2_2 {
    public static final l43_0 c;

    static {
        l43_0 l43_02;
        xe_1.C(ShortCompanionObject.INSTANCE);
        n43_0 n43_02 = n43_0.a;
        c = l43_02 = new vz2_2(n43_02);
    }

    public final int d(Object object) {
        object = (short[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (k43_0)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        short s7 = s30_02.B(uz2_22, n3);
        object.getClass();
        tz2_1.c((tz2_1)object);
        short[] sArray = ((k43_0)object).a;
        int n7 = ((k43_0)object).b;
        ((k43_0)object).b = n4 = n7 + 1;
        sArray[n7] = s7;
    }

    public final Object g(Object object) {
        int n3;
        object = (short[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        k43_0 k43_02 = new tz2_1();
        k43_02.a = (short[])object;
        k43_02.b = n3 = ((Object)object).length;
        k43_02.b(10);
        return k43_02;
    }

    public final Object j() {
        return new short[0];
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = (short[])object;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            uz2_2 uz2_22 = this.b;
            u30_02.K(uz2_22, i3, (short)object2);
        }
    }
}

