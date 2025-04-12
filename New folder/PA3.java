/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class PA3 {
    public final cs0_1 a;
    public Ol b;
    public Ol c;
    public Ol d;
    public final float e;

    public PA3(Sa3 sa3) {
        this.a = sa3;
        this.e = 0.0f;
    }

    public final float a() {
        return this.e;
    }

    public final long b(Ol ol, Ol ol2) {
        int n3;
        Ol ol4 = this.c;
        if (ol4 == null) {
            this.c = ol4 = Pl.b(ol);
        }
        if ((ol4 = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            n3 = 0;
            ol4 = null;
        }
        n3 = ol4.b();
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            ol.getClass();
            float f5 = ol2.a(i3);
            cs0_1 cs0_12 = this.a;
            long l3 = cs0_12.b(f5);
            l2 = Math.max(l2, l3);
        }
        return l2;
    }

    public final Ol c(Ol ol, Ol ol2) {
        int n3;
        Ol ol4 = this.d;
        if (ol4 == null) {
            this.d = ol4 = Pl.b(ol);
        }
        ol4 = this.d;
        Ol ol5 = null;
        String string2 = "targetVector";
        if (ol4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ol4 = null;
        }
        n3 = ol4.b();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ol ol6 = this.d;
            if (ol6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                ol6 = null;
            }
            float f5 = ol.a(i3);
            float f6 = ol2.a(i3);
            cs0_1 cs0_12 = this.a;
            f5 = cs0_12.c(f5, f6);
            ol6.e(f5, i3);
        }
        ol = this.d;
        if (ol == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            ol5 = ol;
        }
        return ol5;
    }

    public final Ol d(long l2, Ol ol, Ol ol2) {
        int n3;
        Ol ol4 = this.b;
        if (ol4 == null) {
            this.b = ol4 = Pl.b(ol);
        }
        ol4 = this.b;
        Ol ol5 = null;
        String string2 = "valueVector";
        if (ol4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ol4 = null;
        }
        n3 = ol4.b();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ol ol6 = this.b;
            if (ol6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                ol6 = null;
            }
            float f5 = ol.a(i3);
            float f6 = ol2.a(i3);
            cs0_1 cs0_12 = this.a;
            f5 = cs0_12.a(f5, f6, l2);
            ol6.e(f5, i3);
        }
        Ol ol7 = this.b;
        if (ol7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            ol5 = ol7;
        }
        return ol5;
    }

    public final Ol e(long l2, Ol ol, Ol ol2) {
        int n3;
        Ol ol4 = this.c;
        if (ol4 == null) {
            this.c = ol4 = Pl.b(ol);
        }
        ol4 = this.c;
        Ol ol5 = null;
        String string2 = "velocityVector";
        if (ol4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ol4 = null;
        }
        n3 = ol4.b();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ol ol6 = this.c;
            if (ol6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                ol6 = null;
            }
            ol.getClass();
            float f5 = ol2.a(i3);
            cs0_1 cs0_12 = this.a;
            f5 = cs0_12.d(l2, f5);
            ol6.e(f5, i3);
        }
        Ol ol7 = this.c;
        if (ol7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            ol5 = ol7;
        }
        return ol5;
    }
}

