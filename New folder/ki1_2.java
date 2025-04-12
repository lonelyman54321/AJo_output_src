/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ki1
 */
public final class ki1_2
extends vz2_2 {
    public static final ki1_2 c;

    static {
        ki1_2 ki1_22;
        xe_1.A(IntCompanionObject.INSTANCE);
        yi1_2 yi1_22 = yi1_2.a;
        c = ki1_22 = new vz2_2(yi1_22);
    }

    public final int d(Object object) {
        object = (int[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (ji1_2)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        int n7 = s30_02.j(uz2_22, n3);
        object.getClass();
        tz2_1.c((tz2_1)object);
        int[] nArray = ((ji1_2)object).a;
        int n8 = ((ji1_2)object).b;
        ((ji1_2)object).b = n4 = n8 + 1;
        nArray[n8] = n7;
    }

    public final Object g(Object object) {
        int n3;
        object = (int[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        ji1_2 ji1_22 = new tz2_1();
        ji1_22.a = (int[])object;
        ji1_22.b = n3 = ((Object)object).length;
        ji1_22.b(10);
        return ji1_22;
    }

    public final Object j() {
        return new int[0];
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = (int[])object;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            uz2_2 uz2_22 = this.b;
            u30_02.E(uz2_22, i3, (int)object2);
        }
    }
}

