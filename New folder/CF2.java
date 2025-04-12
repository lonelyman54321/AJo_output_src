/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CF2
implements BF2 {
    public int a;
    public EF2 b;
    public Ae c;
    public Function2 d;
    public int e;
    public gr1_1 f;
    public nr1_1 g;

    public CF2(EF2 eF2) {
        this.b = eF2;
    }

    public static boolean a(np0_0 object, nr1_1 nr1_12) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        I83 i83 = object.a();
        if (i83 == null) {
            J83.l();
            i83 = qi_2.b;
        }
        Object object2 = object.s().f;
        object = nr1_12.b(object);
        return i83.b(object2, object) ^ true;
    }

    public final boolean b() {
        Object object = this.b;
        boolean bl2 = false;
        if (object != null) {
            boolean bl3;
            object = this.c;
            if (object != null) {
                bl3 = ((Ae)object).a();
            } else {
                bl3 = false;
                object = null;
            }
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final jk1 c(Object object) {
        EF2 eF2 = this.b;
        if (eF2 == null || (object = eF2.h(this, object)) == null) {
            object = jk1.IGNORED;
        }
        return object;
    }

    public final void d() {
        EF2 eF2 = this.b;
        if (eF2 != null) {
            eF2.a();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void e(boolean bl2) {
        int n3;
        int n4;
        this.a = bl2 ? (n4 = this.a | 0x20) : (n3 = this.a & 0xFFFFFFDF);
    }

    public final void invalidate() {
        EF2 eF2 = this.b;
        if (eF2 != null) {
            eF2.h(this, null);
        }
    }
}

