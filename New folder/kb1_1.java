/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from kB1
 */
public final class kb1_1
extends rl2_2
implements Function2 {
    public aw2_0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Sj3 e;

    public kb1_1(Sj3 sj3, f80_0 f80_02) {
        this.e = sj3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Sj3 sj3 = this.e;
        kb1_1 kb1_12 = new kb1_1(sj3, f80_02);
        kb1_12.d = object;
        return kb1_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (kb1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kb1_1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block7: {
            block4: {
                block5: {
                    block6: {
                        var2_2 = j90_0.COROUTINE_SUSPENDED;
                        var3_3 = this.c;
                        var4_4 = 1;
                        var5_5 = 2;
                        var6_6 = this.e;
                        if (var3_3 == 0) break block4;
                        if (var3_3 == var4_4) break block5;
                        if (var3_3 != var5_5) break block6;
                        var7_7 = this.b;
                        var8_8 = (ru_0)this.d;
                        vl2_2.b(var1_1 /* !! */ );
                        ** GOTO lbl42
                    }
                    var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1 /* !! */ ;
                }
                var7_7 = (ru_0)this.d;
                vl2_2.b(var1_1 /* !! */ );
                break block7;
            }
            vl2_2.b(var1_1 /* !! */ );
            var7_7 = var1_1 /* !! */  = this.d;
            this.d = var7_7 = (ru_0)var1_1 /* !! */ ;
            this.c = var4_4;
            var1_1 /* !! */  = Di3.c((ru_0)var7_7, this, var5_5);
            if (var1_1 /* !! */  == var2_2) {
                return var2_2;
            }
        }
        var1_1 /* !! */  = (aw2_0)var1_1 /* !! */ ;
        var1_1 /* !! */ .c;
        var6_6.a();
        var8_8 = var7_7;
        var7_7 = var1_1 /* !! */ ;
        block0: while (true) {
            this.d = var8_8;
            this.b = var7_7;
            this.c = var5_5;
            var1_1 /* !! */  = Nv2.Main;
            if ((var1_1 /* !! */  = var8_8.x0((Nv2)var1_1 /* !! */ , this)) == var2_2) {
                return var2_2;
            }
lbl42:
            // 3 sources

            var1_1 /* !! */  = ((mv2_0)var1_1 /* !! */ ).a;
            var9_9 = var1_1 /* !! */ .size();
            for (var10_10 = 0; var10_10 < var9_9; ++var10_10) {
                var11_11 = (aw2_0)var1_1 /* !! */ .get(var10_10);
                var12_12 = var11_11.a;
                var14_13 = var7_7.a;
                var16_14 = Yv2.a(var12_12, var14_13);
                if (var16_14 && (var17_15 = var11_11.d)) continue block0;
            }
            break;
        }
        var6_6.c();
        return Unit.a;
    }
}

