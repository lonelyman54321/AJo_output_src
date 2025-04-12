/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from q90
 */
public abstract class q90_0
implements i13 {
    public final t90_0 a;
    public final t90_0 b;
    public final t90_0 c;
    public final t90_0 d;

    public q90_0(t90_0 t90_02, t90_0 t90_03, t90_0 t90_04, t90_0 t90_05) {
        this.a = t90_02;
        this.b = t90_03;
        this.c = t90_04;
        this.d = t90_05;
    }

    public final Cg2 a(long l2, bp1_0 bp1_02, Vo0 vo0) {
        float f5;
        float f6;
        float f7;
        float f8;
        t90_0 t90_02 = this.a;
        float f11 = t90_02.a(l2, vo0);
        t90_0 t90_03 = this.b;
        float f12 = t90_03.a(l2, vo0);
        t90_0 t90_04 = this.c;
        float f14 = t90_04.a(l2, vo0);
        t90_0 t90_05 = this.d;
        float f15 = t90_05.a(l2, vo0);
        float f16 = f11 + f15;
        float f17 = f16 - (f8 = C63.c(l2));
        Object object = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        if (object > 0) {
            f16 = f8 / f16;
            f11 *= f16;
            f15 *= f16;
        }
        f16 = f15;
        f15 = f12 + f14;
        float f18 = f15 - f8;
        object = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        if (object > 0) {
            f12 *= (f8 /= f15);
            f14 *= f8;
        }
        int n3 = 0;
        f15 = 0.0f;
        Object object2 = null;
        float f19 = f11 - 0.0f;
        Object object3 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
        if (object3 >= 0 && (object3 = (f7 = f12 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0 && (object3 = (f6 = f14 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) >= 0 && (n3 = (f5 = f16 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) >= 0) {
            object2 = this;
            f8 = f16;
            return this.c(l2, f11, f12, f14, f16, bp1_02);
        }
        object2 = new StringBuilder("Corner size in Px can't be negative(topStart = ");
        ((StringBuilder)object2).append(f11);
        ((StringBuilder)object2).append(", topEnd = ");
        ((StringBuilder)object2).append(f12);
        ((StringBuilder)object2).append(", bottomEnd = ");
        ((StringBuilder)object2).append(f14);
        ((StringBuilder)object2).append(", bottomStart = ");
        ((StringBuilder)object2).append(f16);
        ((StringBuilder)object2).append(")!");
        object2 = ((StringBuilder)object2).toString();
        object2 = object2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
        throw illegalArgumentException;
    }

    public abstract q90_0 b(eq2_1 var1, eq2_1 var2, eq2_1 var3, eq2_1 var4);

    public abstract Cg2 c(long var1, float var3, float var4, float var5, float var6, bp1_0 var7);
}

