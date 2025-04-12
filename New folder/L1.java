/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class L1
extends J1 {
    public static L1 d;
    public static final uk2_0 e;
    public static final uk2_0 f;
    public Tl3 c;

    static {
        e = uk2_0.Rtl;
        f = uk2_0.Ltr;
    }

    public final int[] a(int n3) {
        Tl3 tl3;
        int n4;
        Object object = this.c();
        int n7 = object.length();
        uk2_0 uk2_02 = null;
        if (n7 <= 0) {
            return null;
        }
        object = this.c();
        n7 = object.length();
        if (n3 >= n7) {
            return null;
        }
        object = e;
        Object object2 = "layoutResult";
        if (n3 < 0) {
            Tl3 tl32 = this.c;
            if (tl32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                tl32 = null;
            }
            n4 = 0;
            tl3 = null;
            n3 = tl32.f(0);
        } else {
            int n8;
            tl3 = this.c;
            if (tl3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                tl3 = null;
            }
            n3 = (n8 = this.e(n4 = tl3.f(n3), (uk2_0)((Object)object))) == n3 ? n4 : n4 + 1;
        }
        tl3 = this.c;
        if (tl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            tl3 = null;
        }
        object2 = tl3.b;
        int n10 = ((RQ1)object2).f;
        if (n3 >= n10) {
            return null;
        }
        n7 = this.e(n3, (uk2_0)((Object)object));
        uk2_02 = f;
        n3 = this.e(n3, uk2_02) + 1;
        return this.b(n7, n3);
    }

    public final int[] d(int n3) {
        Object object = this.c();
        int n4 = ((String)object).length();
        if (n4 <= 0) {
            return null;
        }
        if (n3 <= 0) {
            return null;
        }
        object = this.c();
        n4 = ((String)object).length();
        uk2_0 uk2_02 = f;
        String string2 = "layoutResult";
        if (n3 > n4) {
            Tl3 tl3 = this.c;
            if (tl3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                tl3 = null;
            }
            object = this.c();
            n4 = ((String)object).length();
            n3 = tl3.f(n4);
        } else {
            int n7;
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object = null;
            }
            n3 = (n7 = this.e(n4 = ((Tl3)object).f(n3), uk2_02) + 1) == n3 ? n4 : n4 + -1;
        }
        if (n3 < 0) {
            return null;
        }
        object = e;
        n4 = this.e(n3, (uk2_0)((Object)object));
        n3 = this.e(n3, uk2_02) + 1;
        return this.b(n4, n3);
    }

    public final int e(int n3, uk2_0 object) {
        int n4;
        Object object2 = this.c;
        String string2 = "layoutResult";
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object2 = null;
        }
        n4 = object2.i(n3);
        Tl3 tl3 = this.c;
        if (tl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            tl3 = null;
        }
        if (object != (object2 = tl3.j(n4))) {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            n3 = ((Tl3)object3).i(n3);
        } else {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            object = null;
            n3 = ((Tl3)object3).e(n3, false) + -1;
        }
        return n3;
    }
}

