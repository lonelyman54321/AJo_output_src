/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from sT0
 */
public final class st0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ d33 b;
    public final /* synthetic */ es0_2 c;
    public final /* synthetic */ qr1_2 d;
    public final /* synthetic */ Object e;

    public st0_2(d33 d332, es0_2 es0_22, qr1_2 qr1_22, Object object, f80_0 f80_02) {
        this.b = d332;
        this.c = es0_22;
        this.d = qr1_22;
        this.e = object;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qr1_2 qr1_22 = this.d;
        Object object2 = this.e;
        d33 d332 = this.b;
        es0_2 es0_22 = this.c;
        object = new st0_2(d332, es0_22, qr1_22, object2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (st0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((st0_2)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block10: {
            block12: {
                block9: {
                    block11: {
                        block6: {
                            block7: {
                                block8: {
                                    var2_2 = j90_0.COROUTINE_SUSPENDED;
                                    var3_3 = this.a;
                                    var4_4 = 4;
                                    var5_5 = 3;
                                    var6_6 = 1;
                                    var7_7 = this.c;
                                    var8_8 = 2;
                                    var9_9 = this.d;
                                    if (var3_3 == 0) break block6;
                                    if (var3_3 == var6_6) break block7;
                                    if (var3_3 != var8_8) break block8;
                                    vl2_2.b(var1_1);
                                    break block9;
                                }
                                if (var3_3 != var5_5 && var3_3 != var4_4) {
                                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var1_1;
                                }
                            }
                            vl2_2.b(var1_1);
                            break block10;
                        }
                        vl2_2.b(var1_1);
                        var1_1 = d33$a.a;
                        var10_10 = this.b;
                        if (var10_10 != var1_1) break block11;
                        this.a = var6_6;
                        var1_1 = var7_7.collect(var9_9, this);
                        if (var1_1 == var2_2) {
                            return var2_2;
                        }
                        break block10;
                    }
                    var1_1 = d33$a.b;
                    var6_6 = 0;
                    if (var10_10 == var1_1) {
                        var1_1 = var9_9.b();
                        var10_10 = new qg3_2(var8_8, null);
                        this.a = var8_8;
                        if ((var1_1 = ms0_1.k((es0_2)var1_1, (Function2)var10_10, this)) == var2_2) {
                            return var2_2;
                        } else {
                            ** GOTO lbl41
                        }
                    }
                    break block12;
                }
                this.a = var5_5;
                var1_1 = var7_7.collect(var9_9, this);
                if (var1_1 == var2_2) {
                    return var2_2;
                }
                break block10;
            }
            var1_1 = var9_9.b();
            var1_1 = ms0_1.h(var10_10.a((jb3_2)var1_1));
            var11_11 = this.e;
            var10_10 = new sT0$b(var7_7, var9_9, var11_11, null);
            this.a = var4_4;
            if ((var1_1 = ms0_1.f((es0_2)var1_1, (Function2)var10_10, this)) == var2_2) {
                return var2_2;
            }
        }
        return Unit.a;
    }
}

