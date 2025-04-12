/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from az
 */
public final class az_2
extends vz2_2 {
    public static final az_2 c;

    static {
        az_2 az_22;
        xe_1.v(BooleanCompanionObject.INSTANCE);
        cz_2 cz_22 = cz_2.a;
        c = az_22 = new vz2_2(cz_22);
    }

    public final int d(Object object) {
        object = (boolean[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (yy_1)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        boolean bl3 = s30_02.z(uz2_22, n3);
        object.getClass();
        tz2_1.c((tz2_1)object);
        boolean[] blArray = ((yy_1)object).a;
        int n7 = ((yy_1)object).b;
        ((yy_1)object).b = n4 = n7 + 1;
        blArray[n7] = bl3;
    }

    public final Object g(Object object) {
        int n3;
        object = (boolean[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        yy_1 yy_12 = new tz2_1();
        yy_12.a = (boolean[])object;
        yy_12.b = n3 = ((Object)object).length;
        yy_12.b(10);
        return yy_12;
    }

    public final Object j() {
        return new boolean[0];
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = (boolean[])object;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            uz2_2 uz2_22 = this.b;
            u30_02.F(uz2_22, i3, (boolean)object2);
        }
    }
}

