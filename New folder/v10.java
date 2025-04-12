/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v10 {
    public static final Object a;

    static {
        Object object;
        a = object = new Object();
    }

    public static final int a(int n3, int n4) {
        n4 = n4 % 10 * 3 + 1;
        return n3 << n4;
    }

    public static final u10 b(b30_0 b30_02, int n3, Lambda lambda) {
        boolean bl2 = true;
        int n4 = Integer.rotateLeft(n3, (int)(bl2 ? 1 : 0));
        Object object = a;
        b30_02.z(n4, object);
        Object object2 = b30_02.v();
        object = b30$a.a;
        if (object2 == object) {
            object2 = new u10(n3, lambda, bl2);
            b30_02.o(object2);
        } else {
            String string2 = "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl";
            Intrinsics.checkNotNull(object2, string2);
            object2 = (u10)object2;
            ((u10)object2).f(lambda);
        }
        b30_02.H();
        return object2;
    }

    public static final u10 c(int n3, fx0_2 fx0_22, b30_0 b30_02) {
        b30$a$a b30$a$a;
        Object object = b30_02.v();
        if (object == (b30$a$a = b30$a.a)) {
            boolean bl2 = true;
            object = new u10(n3, fx0_22, bl2);
            b30_02.o(object);
        }
        object = (u10)object;
        ((u10)object).f(fx0_22);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean d(BF2 object, BF2 object2) {
        if (object == null) return true;
        boolean bl2 = object instanceof CF2;
        if (!bl2) return false;
        bl2 = object2 instanceof CF2;
        if (!bl2) return false;
        Object object3 = object;
        object3 = (CF2)object;
        boolean bl3 = ((CF2)object3).b();
        if (!bl3) return true;
        boolean bl4 = Intrinsics.areEqual(object, object2);
        if (bl4) return true;
        object = ((CF2)object3).c;
        object2 = ((CF2)object2).c;
        bl4 = Intrinsics.areEqual(object, object2);
        if (!bl4) return false;
        return true;
    }
}

