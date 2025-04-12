/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class jP1$a {
    public static jp1_1 a(jp1_1 jp1_12, bp1_0 bp1_02, xm3 xm32, Vo0 vo0, RU0$a rU0$a) {
        float f5;
        Vo0 vo02;
        float f6;
        float f7;
        float f8;
        boolean bl2;
        Object object;
        if (jp1_12 != null && bp1_02 == (object = jp1_12.a) && (bl2 = Intrinsics.areEqual(xm32, object = jp1_12.b)) && !(bl2 = (f8 = (f7 = vo0.getDensity()) - (f6 = (vo02 = jp1_12.c).getDensity())) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) && rU0$a == (object = jp1_12.d)) {
            return jp1_12;
        }
        jp1_12 = jp1_1.h;
        if (jp1_12 != null && bp1_02 == (object = jp1_12.a) && (bl2 = Intrinsics.areEqual(xm32, object = jp1_12.b)) && !(bl2 = (f5 = (f7 = vo0.getDensity()) - (f6 = (vo02 = jp1_12.c).getDensity())) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) && rU0$a == (object = jp1_12.d)) {
            return jp1_12;
        }
        xm32 = ym3.a(xm32, bp1_02);
        f7 = vo0.getDensity();
        float f11 = vo0.H0();
        vo02 = new Wo0(f7, f11);
        jp1_1.h = jp1_12 = new jp1_1(bp1_02, xm32, (Wo0)vo02, rU0$a);
        return jp1_12;
    }
}

