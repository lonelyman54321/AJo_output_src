/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from r92
 */
public final class r92_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ Cl2 c;

    public r92_0(f80_0 f80_02, hm0_0 hm0_02, dr0_0 dr0_02) {
        this.b = dr0_02;
        this.c = hm0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hm0_0 hm0_02 = (hm0_0)this.c;
        dr0_0 dr0_02 = this.b;
        object = new r92_0(f80_02, hm0_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (r92_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((r92_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block6: {
            block7: {
                block8: {
                    var2_2 = j90_0.COROUTINE_SUSPENDED;
                    var3_3 = this.a;
                    var4_4 = 2;
                    var5_5 = 3;
                    var6_6 = this.b;
                    var7_7 = 1;
                    if (var3_3 == 0) break block6;
                    if (var3_3 == var7_7) break block7;
                    if (var3_3 == var4_4) break block8;
                    if (var3_3 != var5_5) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    break block6;
                }
                vl2_2.b(var1_1);
                ** GOTO lbl44
            }
            vl2_2.b(var1_1);
            ** GOTO lbl27
        }
        vl2_2.b(var1_1);
        while (true) {
            this.a = var7_7;
            var1_1 = tr_1.b(this);
            if (var1_1 == var2_2) {
                return var2_2;
            }
lbl27:
            // 3 sources

            var6_6.getClass();
            var1_1 = h40_0.a;
            var8_8 = "onboarding_auto_scroll_time_in_seconds";
            Intrinsics.checkNotNullParameter(var8_8, "key");
            var1_1 = h40_0.D0();
            var9_9 = var1_1.has(var8_8);
            if (var9_9 != 0) {
                var10_10 = var1_1.getInt(var8_8);
            } else {
                var10_10 = 0;
                var1_1 = null;
            }
            var11_11 = var10_10 *= 1000;
            this.a = var4_4;
            var1_1 = bo0_2.a(var11_11, this);
            if (var1_1 == var2_2) {
                return var2_2;
            }
lbl44:
            // 3 sources

            var1_1 = this.c;
            var3_3 = var1_1.j();
            var6_6.getClass();
            var13_12 = h40_0.a;
            var13_12 = h40_0.W();
            var9_9 = var13_12.size() - var7_7;
            if (var3_3 >= var9_9) continue;
            var3_3 = var1_1.j() + var7_7;
            var9_9 = h40_0.W().size();
            var3_3 %= var9_9;
            var9_9 = 600;
            var14_13 = 6;
            var13_12 = Hl.c(var9_9, 0, null, var14_13);
            this.a = var5_5;
            if ((var1_1 = Cl2.g((hm0_0)var1_1, var3_3, (Qs3)var13_12, this, var4_4)) == var2_2) break;
        }
        return var2_2;
    }
}

