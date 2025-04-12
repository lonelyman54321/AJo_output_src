/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Ng2 {
    public final long a;
    public final mk2_0 b;

    public Ng2() {
        long l2 = zx_0.d(0xFF666666L);
        float f5 = 0.0f;
        float f6 = 0.0f;
        nk2_0 nk2_02 = new nk2_0(f5, f6, f5, f6);
        this.a = l2;
        this.b = nk2_02;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object != null) {
            object2 = object.getClass();
        } else {
            bl2 = false;
            object2 = null;
        }
        bl2 = Intrinsics.areEqual(Ng2.class, object2);
        if (!bl2) {
            return false;
        }
        object2 = "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (Ng2)object;
        long l2 = this.a;
        long l3 = ((Ng2)object).a;
        bl2 = OX.c(l2, l3);
        if (!bl2) {
            return false;
        }
        object2 = this.b;
        object = ((Ng2)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = OX.m;
        n3 = mt3_0.a(this.a) * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OverscrollConfiguration(glowColor=");
        Object object = OX.i(this.a);
        stringBuilder.append(object);
        stringBuilder.append(", drawPadding=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

