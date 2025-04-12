/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from SE2
 */
public final class se2_0
implements mj1$a {
    public final pe1_0 a;
    public final List b;
    public final int c;
    public final pe1_0 d;
    public final B63 e;
    public final GB0 f;
    public final boolean g;

    public se2_0(pe1_0 pe1_02, List list, int n3, pe1_0 pe1_03, B63 b63, GB0 gB0, boolean bl2) {
        this.a = pe1_02;
        this.b = list;
        this.c = n3;
        this.d = pe1_03;
        this.e = b63;
        this.f = gB0;
        this.g = bl2;
    }

    public final void a(pe1_0 object, mj1 object2) {
        Object object3 = ((pe1_0)object).a;
        pe1_0 pe1_02 = this.a;
        Object object4 = pe1_02.a;
        String string2 = "Interceptor '";
        if (object3 == object4) {
            object4 = ((pe1_0)object).b;
            object3 = dl_2.b;
            if (object4 != object3) {
                object4 = ((pe1_0)object).c;
                object3 = pe1_02.c;
                if (object4 == object3) {
                    object4 = ((pe1_0)object).A;
                    object3 = pe1_02.A;
                    if (object4 == object3) {
                        object = ((pe1_0)object).B;
                        object3 = pe1_02.B;
                        if (object == object3) {
                            return;
                        }
                        object = new StringBuilder(string2);
                        ((StringBuilder)object).append(object2);
                        ((StringBuilder)object).append("' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
                        object = ((StringBuilder)object).toString();
                        object = object.toString();
                        object2 = new IllegalStateException((String)object);
                        throw object2;
                    }
                    object = new StringBuilder(string2);
                    ((StringBuilder)object).append(object2);
                    ((StringBuilder)object).append("' cannot modify the request's lifecycle.");
                    object = ((StringBuilder)object).toString();
                    object = object.toString();
                    object2 = new IllegalStateException((String)object);
                    throw object2;
                }
                object = new StringBuilder(string2);
                ((StringBuilder)object).append(object2);
                ((StringBuilder)object).append("' cannot modify the request's target.");
                object = ((StringBuilder)object).toString();
                object = object.toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            object = new StringBuilder(string2);
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append("' cannot set the request's data to null.");
            object = ((StringBuilder)object).toString();
            object = object.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object = new StringBuilder(string2);
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append("' cannot modify the request's context.");
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(pe1_0 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof SE2$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (SE2$a)var2_2;
        var5_5 = var4_4.e;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.e = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new SE2$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.c;
        var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.e;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl24
        if (var6_6 == var7_7) {
            var1_1 = var4_4.b;
            var4_4 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl24:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.b;
            var6_6 = this.c;
            if (var6_6 > 0) {
                var9_9 = var6_6 + -1;
                var10_10 = (mj1)var2_2.get(var9_9);
                this.a((pe1_0)var1_1, (mj1)var10_10);
            }
            var2_2 = (mj1)var2_2.get(var6_6);
            var11_11 = var6_6 + 1;
            var13_13 = this.e;
            var14_14 = this.f;
            var15_15 = this.a;
            var16_16 = this.b;
            var17_17 = this.g;
            var10_10 = var12_12;
            var12_12 = new se2_0(var15_15, var16_16, var11_11, (pe1_0)var1_1, var13_13, var14_14, var17_17);
            var4_4.a = this;
            var4_4.b = var2_2;
            var4_4.e = var7_7;
            var1_1 = var2_2.a(var12_12, (f80_0)var4_4);
            if (var1_1 == var8_8 /* !! */ ) {
                return var8_8 /* !! */ ;
            }
            var4_4 = this;
            var18_18 = var2_2;
            var2_2 = var1_1;
            var1_1 = var18_18;
        }
        var2_2 = (se1_0)var2_2;
        var8_8 /* !! */  = var2_2.b();
        var4_4.a((pe1_0)var8_8 /* !! */ , (mj1)var1_1);
        return var2_2;
    }

    public final pe1_0 getRequest() {
        return this.d;
    }
}

