/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class M1
extends J1 {
    public static M1 e;
    public static final uk2_0 f;
    public static final uk2_0 g;
    public Tl3 c;
    public GY2 d;

    static {
        f = uk2_0.Rtl;
        g = uk2_0.Ltr;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int[] a(int n3) {
        int n4;
        float f5;
        int n7;
        String string2;
        Tl3 tl3;
        float f6;
        int n8;
        Object object;
        block15: {
            object = this.c();
            n8 = ((String)object).length();
            Object var4_4 = null;
            if (n8 <= 0) {
                return null;
            }
            object = this.c();
            n8 = ((String)object).length();
            if (n3 >= n8) {
                return null;
            }
            try {
                object = this.d;
                if (object == null) {
                    object = "node";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n8 = 0;
                    object = null;
                    f6 = 0.0f;
                }
                object = ((GY2)object).e();
                f6 = ((aG2)object).c();
                n8 = Math.round(f6);
                if (n3 <= 0) {
                    n3 = 0;
                }
                tl3 = this.c;
                string2 = "layoutResult";
                if (tl3 != null) break block15;
            }
            catch (IllegalStateException illegalStateException) {
                return null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            tl3 = null;
            f5 = 0.0f;
        }
        n7 = tl3.f(n3);
        Object object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object2 = null;
        }
        object2 = ((Tl3)object2).b;
        f5 = ((RQ1)object2).d(n7);
        f6 = n8;
        f5 += f6;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object = null;
            f6 = 0.0f;
        }
        if ((object2 = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object2 = null;
        }
        object2 = ((Tl3)object2).b;
        object = ((Tl3)object).b;
        n4 = ((RQ1)object2).f + -1;
        f6 = ((RQ1)object).d(n4);
        float f7 = f5 - f6;
        n8 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
        if (n8 < 0) {
            void var4_6;
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                Object object3 = object;
            }
            object = var4_6.b;
            n8 = ((RQ1)object).c(f5);
        } else {
            void var4_9;
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                Object object4 = object;
            }
            object = var4_9.b;
            n8 = ((RQ1)object).f;
        }
        n8 += -1;
        uk2_0 uk2_02 = g;
        n8 = this.e(n8, uk2_02) + 1;
        return this.b(n3, n8);
    }

    public final int[] d(int n3) {
        float f5;
        float f6;
        Object object;
        int n4;
        int n7;
        Object object2;
        block16: {
            object2 = this.c();
            n7 = ((String)object2).length();
            n4 = 0;
            object = null;
            if (n7 <= 0) {
                return null;
            }
            if (n3 <= 0) {
                return null;
            }
            try {
                object2 = this.d;
                if (object2 != null) break block16;
                object2 = "node";
            }
            catch (IllegalStateException illegalStateException) {
                return null;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object2 = null;
            f6 = 0.0f;
        }
        object2 = ((GY2)object2).e();
        f6 = ((aG2)object2).c();
        n7 = Math.round(f6);
        Object object3 = this.c();
        int n8 = ((String)object3).length();
        if (n8 <= n3) {
            n3 = n8;
        }
        object3 = this.c;
        String string2 = "layoutResult";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object3 = null;
        }
        n8 = ((Tl3)object3).f(n3);
        Object object4 = this.c;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object4 = null;
            f5 = 0.0f;
        }
        object4 = ((Tl3)object4).b;
        f5 = ((RQ1)object4).d(n8);
        f6 = n7;
        f5 -= f6;
        f6 = 0.0f;
        object2 = null;
        float f7 = f5 - 0.0f;
        n7 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n7 > 0) {
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = object2;
            }
            object2 = ((Tl3)object).b;
            n7 = ((RQ1)object2).c(f5);
        } else {
            n7 = 0;
            f6 = 0.0f;
            object2 = null;
        }
        object = this.c();
        n4 = ((String)object).length();
        if (n3 == n4 && n7 < n8) {
            ++n7;
        }
        object = f;
        n7 = this.e(n7, (uk2_0)((Object)object));
        return this.b(n7, n3);
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

