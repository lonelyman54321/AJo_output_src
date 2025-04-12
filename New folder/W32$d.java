/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class W32$d
extends Lambda
implements Function1 {
    public static final W32$d c;

    static {
        W32$d w32$d;
        c = w32$d = new Lambda(1);
    }

    public final Object invoke(Object object) {
        boolean bl2 = ((w32_0)(object = (w32_0)object)).s0();
        if (bl2) {
            Object object2 = ((w32_0)object).C;
            int n3 = 1;
            float f5 = Float.MIN_VALUE;
            if (object2 == null) {
                ((w32_0)object).F1(n3 != 0);
            } else {
                long l2;
                float f6;
                float f7;
                float f8;
                float f11;
                float f12;
                float f14;
                float f15;
                long l3;
                float f16;
                tp1_1 tp1_12 = w32_0.L;
                tp1_12.getClass();
                tp1_12.a = f16 = ((tp1_1)object2).a;
                tp1_12.b = f16 = ((tp1_1)object2).b;
                tp1_12.c = f16 = ((tp1_1)object2).c;
                tp1_12.d = f16 = ((tp1_1)object2).d;
                tp1_12.e = f16 = ((tp1_1)object2).e;
                tp1_12.f = f16 = ((tp1_1)object2).f;
                tp1_12.g = f16 = ((tp1_1)object2).g;
                tp1_12.h = f16 = ((tp1_1)object2).h;
                tp1_12.i = l3 = ((tp1_1)object2).i;
                ((w32_0)object).F1(n3 != 0);
                f5 = tp1_12.a;
                f16 = ((tp1_1)object2).a;
                n3 = f5 == f16 ? 0 : (f5 < f16 ? -1 : 1);
                if (n3 != 0 || (n3 = (int)((f15 = (f5 = tp1_12.b) - (f16 = ((tp1_1)object2).b)) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1))) != 0 || (n3 = (int)((f14 = (f5 = tp1_12.c) - (f16 = ((tp1_1)object2).c)) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1))) != 0 || (n3 = (int)((f12 = (f5 = tp1_12.d) - (f16 = ((tp1_1)object2).d)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1))) != 0 || (n3 = (int)((f11 = (f5 = tp1_12.e) - (f16 = ((tp1_1)object2).e)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1))) != 0 || (n3 = (int)((f8 = (f5 = tp1_12.f) - (f16 = ((tp1_1)object2).f)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) != 0 || (n3 = (int)((f7 = (f5 = tp1_12.g) - (f16 = ((tp1_1)object2).g)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) != 0 || (n3 = (int)((f6 = (f5 = tp1_12.h) - (f16 = ((tp1_1)object2).h)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) != 0 || !(bl2 = Oq3.a(l2 = tp1_12.i, l3 = ((tp1_1)object2).i))) {
                    object = ((w32_0)object).m;
                    object2 = ((xp1_0)object).z;
                    n3 = ((bq1)object2).n;
                    if (n3 > 0) {
                        n3 = (int)(((bq1)object2).m ? 1 : 0);
                        if (n3 != 0 || (n3 = (int)(((bq1)object2).l ? 1 : 0)) != 0) {
                            n3 = 0;
                            f5 = 0.0f;
                            ((xp1_0)object).Y(false);
                        }
                        object2 = ((bq1)object2).r;
                        ((bq1$b)object2).u0();
                    }
                    if ((object2 = ((xp1_0)object).i) != null) {
                        object2.g((xp1_0)object);
                    }
                }
            }
        }
        return Unit.a;
    }
}

