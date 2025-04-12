/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class ms1$a$a
extends rl2_2
implements Function2 {
    public aw2_0 b;
    public aw2_0 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Cl2 f;

    public ms1$a$a(hm0_0 hm0_02, f80_0 f80_02) {
        this.f = hm0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hm0_0 hm0_02 = (hm0_0)this.f;
        ms1$a$a ms1$a$a = new ms1$a$a(hm0_02, f80_02);
        ms1$a$a.e = object;
        return ms1$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (ms1$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ms1$a$a)object).invokeSuspend(object2);
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
                        var3_3 = this.d;
                        var4_4 = 1;
                        var5_5 = this.f;
                        var6_6 = 2;
                        if (var3_3 == 0) break block4;
                        if (var3_3 == var4_4) break block5;
                        if (var3_3 != var6_6) break block6;
                        var7_7 = this.c;
                        var8_8 = this.b;
                        var9_9 = (ru_0)this.e;
                        vl2_2.b(var1_1 /* !! */ );
                        ** GOTO lbl51
                    }
                    var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1 /* !! */ ;
                }
                var7_7 = (ru_0)this.e;
                vl2_2.b(var1_1 /* !! */ );
                break block7;
            }
            vl2_2.b(var1_1 /* !! */ );
            var7_7 = var1_1 /* !! */  = this.e;
            var7_7 = (ru_0)var1_1 /* !! */ ;
            var1_1 /* !! */  = Nv2.Initial;
            this.e = var7_7;
            this.d = var4_4;
            var1_1 /* !! */  = Di3.b((ru_0)var7_7, false, (Nv2)var1_1 /* !! */ , this);
            if (var1_1 /* !! */  == var2_2) {
                return var2_2;
            }
        }
        var1_1 /* !! */  = (aw2_0)var1_1 /* !! */ ;
        var5_5.getClass();
        var10_10 = 0L;
        var8_8 = new e72(var10_10);
        var5_5.a.setValue(var8_8);
        var4_4 = 0;
        var9_9 = var7_7;
        var3_3 = 0;
        var7_7 = null;
        var8_8 = var1_1 /* !! */ ;
        block0: while (var7_7 == null) {
            var1_1 /* !! */  = Nv2.Initial;
            this.e = var9_9;
            this.b = var8_8;
            this.c = var7_7;
            this.d = var6_6;
            if ((var1_1 /* !! */  = var9_9.x0((Nv2)var1_1 /* !! */ , this)) == var2_2) {
                return var2_2;
            }
lbl51:
            // 3 sources

            var1_1 /* !! */  = (mv2_0)var1_1 /* !! */ ;
            var12_11 = var1_1 /* !! */ .a;
            var13_12 = var12_11.size();
            for (var14_13 = 0; var14_13 < var13_12; ++var14_13) {
                var15_14 = (aw2_0)var12_11.get(var14_13);
                var16_15 = si0_2.b(var15_14);
                if (!var16_15) continue block0;
            }
            var7_7 = var1_1 /* !! */  = var1_1 /* !! */ .a.get(0);
            var7_7 = (aw2_0)var1_1 /* !! */ ;
        }
        var17_16 = var8_8.c;
        var19_17 = e72.h(var7_7.c, var17_16);
        var5_5.getClass();
        var1_1 /* !! */  = new e72(var19_17);
        var5_5.a.setValue(var1_1 /* !! */ );
        return Unit.a;
    }
}

