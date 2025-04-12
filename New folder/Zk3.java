/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

public final class Zk3
extends Lambda
implements Function0 {
    public final /* synthetic */ Sk3 c;
    public final /* synthetic */ tr1_0 d;

    public Zk3(Sk3 sk3, tr1_0 tr1_02) {
        this.c = sk3;
        this.d = tr1_02;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke() {
        int n3;
        Object object = (bj1)this.d.getValue();
        long l2 = ((bj1)object).a;
        Object object2 = this.c;
        e72 e722 = ((Sk3)object2).i();
        long l3 = 9205357640488583168L;
        if (e722 == null) return new e72(l3);
        Object object3 = ((Sk3)object2).d;
        if (object3 != null && (object3 = ((Vt1)object3).a) != null) {
            object3 = ((Mj3)object3).a;
        } else {
            n3 = 0;
            object3 = null;
        }
        if (object3 == null) return new e72(l3);
        object3 = ((Sl)object3).a;
        n3 = ((String)object3).length();
        if (n3 != 0) {
            long l4;
            int n4;
            long l7;
            object3 = (v21_0)((Object)((Sk3)object2).p.getValue());
            int n7 = -1;
            float f5 = 0.0f / 0.0f;
            if (object3 == null) {
                n3 = -1;
            } else {
                int[] nArray = Tk3$d.$EnumSwitchMapping$0;
                n3 = ((Enum)object3).ordinal();
                n3 = nArray[n3];
            }
            if (n3 == n7) return new e72(l3);
            n7 = 1;
            f5 = Float.MIN_VALUE;
            int n8 = 32;
            int n10 = 2;
            if (n3 != n7 && n3 != n10) {
                n7 = 3;
                f5 = 4.2E-45f;
                if (n3 != n7) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                object3 = ((Sk3)object2).l();
                l7 = ((ql3_0)object3).b;
                n4 = mm3.c;
                l4 = 0xFFFFFFFFL;
                l7 &= l4;
            } else {
                object3 = ((Sk3)object2).l();
                l7 = ((ql3_0)object3).b;
                n4 = mm3.c;
                l7 >>= n8;
            }
            n7 = (int)l7;
            object3 = ((Sk3)object2).d;
            if (object3 == null) return new e72(l3);
            if ((object3 = ((Vt1)object3).d()) != null) {
                Object object4 = ((Sk3)object2).d;
                if (object4 == null) return new e72(l3);
                object4 = ((Vt1)object4).a;
                if (object4 == null) return new e72(l3);
                object4 = ((Mj3)object4).a;
                if (object4 != null) {
                    int n14;
                    float f6;
                    float f7;
                    float f8;
                    object2 = ((Sk3)object2).b;
                    int n15 = object2.b(n7);
                    String string2 = ((Sl)object4).a;
                    n7 = string2.length();
                    object4 = null;
                    n15 = f.g(n15, 0, n7);
                    l4 = e722.a;
                    float f11 = e72.d(((Ul3)object3).d(l4));
                    object3 = ((Ul3)object3).a;
                    n15 = ((Tl3)object3).f(n15);
                    f5 = ((Tl3)object3).g(n15);
                    float f12 = ((Tl3)object3).h(n15);
                    float f14 = Math.min(f5, f12);
                    f5 = Math.max(f5, f12);
                    f5 = f.f(f11, f14, f5);
                    l4 = 0L;
                    n4 = (int)(bj1.b(l2, l4) ? 1 : 0);
                    if (n4 != 0 || (f8 = (f7 = (f11 = Math.abs(f11 - f5)) - (f6 = (float)(n14 = (int)(l2 >>= n8) / n10))) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) <= 0) {
                        object = ((Tl3)object3).b;
                        float f15 = ((RQ1)object).d(n15);
                        f6 = ((RQ1)object).b(n15) - f15;
                        float f16 = n10;
                        f6 = f6 / f16 + f15;
                        l3 = h72.a(f5, f6);
                    }
                }
            }
        }
        return new e72(l3);
    }
}

