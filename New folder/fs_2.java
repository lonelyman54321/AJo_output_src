/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fS
 */
public final class fs_2
extends vz2_2 {
    public static final fs_2 c;

    static {
        fs_2 fs_22;
        xe_1.x(CharCompanionObject.INSTANCE);
        ks_2 ks_22 = ks_2.a;
        c = fs_22 = new vz2_2(ks_22);
    }

    public final int d(Object object) {
        object = (char[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Object)object).length;
    }

    public final void f(s30_0 s30_02, int n3, Object object, boolean bl2) {
        int n4;
        object = (bs_2)object;
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        Intrinsics.checkNotNullParameter(object, "builder");
        uz2_2 uz2_22 = this.b;
        char c2 = s30_02.x(uz2_22, n3);
        object.getClass();
        tz2_1.c((tz2_1)object);
        char[] cArray = ((bs_2)object).a;
        int n7 = ((bs_2)object).b;
        ((bs_2)object).b = n4 = n7 + 1;
        cArray[n7] = c2;
    }

    public final Object g(Object object) {
        int n3;
        object = (char[])object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object, "bufferWithData");
        bs_2 bs_22 = new tz2_1();
        bs_22.a = (char[])object;
        bs_22.b = n3 = ((Object)object).length;
        bs_22.b(10);
        return bs_22;
    }

    public final Object j() {
        return new char[0];
    }

    public final void k(u30_0 u30_02, Object object, int n3) {
        object = (char[])object;
        Intrinsics.checkNotNullParameter(u30_02, "encoder");
        Intrinsics.checkNotNullParameter(object, "content");
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            uz2_2 uz2_22 = this.b;
            u30_02.t(uz2_22, i3, (char)object2);
        }
    }
}

