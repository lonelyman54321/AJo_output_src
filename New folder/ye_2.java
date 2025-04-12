/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YE
 */
public final class ye_2
extends vz2_2 {
    public static final ye_2 c;

    static {
        ye_2 ye_22;
        xe_1.w(ByteCompanionObject.INSTANCE);
        bf_2 bf_22 = bf_2.a;
        c = ye_22 = new vz2_2(bf_22);
    }

    public final int d(Object object) {
        object = (byte[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (re_1)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        byte by2 = s30_02.y(uz2_22, n3);
        object.getClass();
        tz2_1.c((tz2_1)object);
        byte[] byArray = ((re_1)object).a;
        int n7 = ((re_1)object).b;
        ((re_1)object).b = n4 = n7 + 1;
        byArray[n7] = by2;
    }

    public final Object g(Object object) {
        int n3;
        object = (byte[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        re_1 re_12 = new tz2_1();
        re_12.a = (byte[])object;
        re_12.b = n3 = ((Object)object).length;
        re_12.b(10);
        return re_12;
    }

    public final Object j() {
        return new byte[0];
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = (byte[])object;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            uz2_2 uz2_22 = this.b;
            u30_02.v(uz2_22, i3, (byte)object2);
        }
    }
}

