/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ft1$g
extends Lambda
implements Function1 {
    public final /* synthetic */ ft1_2 c;

    public ft1$g(ft1_2 ft1_22) {
        this.c = ft1_22;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        block13: {
            float f5;
            block12: {
                float f6;
                float f7;
                Object object3;
                block11: {
                    float f8;
                    object = (Number)object;
                    f5 = -((Number)object).floatValue();
                    object2 = this.c;
                    float f11 = f5 - 0.0f;
                    object3 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if ((object3 >= 0 || (object3 = (Object)((ft1_2)object2).d()) != false) && ((object3 = (f8 = f5 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) <= 0 || (object3 = (Object)((ft1_2)object2).c()) != false)) break block11;
                    f5 = 0.0f;
                    object = null;
                    break block12;
                }
                float f12 = Math.abs(((ft1_2)object2).h);
                float f14 = f12 - (f7 = 0.5f);
                object3 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                if (object3 > 0) break block13;
                ((ft1_2)object2).h = f12 = ((ft1_2)object2).h + f5;
                float f15 = (f12 = Math.abs(f12)) - f7;
                object3 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (object3 > 0) {
                    Object object4 = (Ws1)((ft1_2)object2).f.getValue();
                    float f16 = ((ft1_2)object2).h;
                    int n3 = Math.round(f16);
                    Object object5 = ((ft1_2)object2).c;
                    boolean bl2 = ((ft1_2)object2).b;
                    boolean bl3 = true;
                    bl2 ^= bl3;
                    if ((bl2 = ((Ws1)object4).l(n3, bl2)) && object5 != null) {
                        bl2 = ((Ws1)object5).l(n3, bl3);
                    }
                    at1_0 at1_02 = ((ft1_2)object2).a;
                    object5 = ((ft1_2)object2).q;
                    if (bl2) {
                        bl2 = ((ft1_2)object2).b;
                        ((ft1_2)object2).g((Ws1)object4, bl2, bl3);
                        tr1_0 tr1_02 = ((ft1_2)object2).v;
                        A62.d(tr1_02);
                        float f17 = ((ft1_2)object2).h;
                        f16 -= f17;
                        bl2 = ((ft1_2)object2).j;
                        if (bl2) {
                            at1_02.b((Zs1)object5, f16, (Ts1)object4);
                        }
                    } else {
                        object4 = ((ft1_2)object2).k;
                        if (object4 != null) {
                            object4.f();
                        }
                        f12 = ((ft1_2)object2).h;
                        f16 -= f12;
                        object4 = ((ft1_2)object2).j();
                        bl2 = ((ft1_2)object2).j;
                        if (bl2) {
                            at1_02.b((Zs1)object5, f16, (Ts1)object4);
                        }
                    }
                }
                if ((object3 = (f6 = (f12 = Math.abs(((ft1_2)object2).h)) - f7) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) > 0) {
                    f12 = ((ft1_2)object2).h;
                    f5 -= f12;
                    ((ft1_2)object2).h = 0.0f;
                }
            }
            return Float.valueOf(-f5);
        }
        object = new StringBuilder("entered drag with non-zero pending scroll: ");
        float f18 = ((ft1_2)object2).h;
        ((StringBuilder)object).append(f18);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

