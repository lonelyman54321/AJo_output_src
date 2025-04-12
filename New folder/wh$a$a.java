/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

public final class wh$a$a
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wh_0 d;

    public wh$a$a(wh_0 wh_02, f80_0 f80_02) {
        this.d = wh_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wh_0 wh_02 = this.d;
        wh$a$a wh$a$a = new wh$a$a(wh_02, f80_02);
        wh$a$a.c = object;
        return wh$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (wh$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wh$a$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block11: {
            block8: {
                block9: {
                    block10: {
                        var2_2 = j90_0.COROUTINE_SUSPENDED;
                        var3_3 = this.b;
                        var4_4 = 2;
                        var5_5 = 1;
                        var6_6 = this.d;
                        if (var3_3 == 0) break block8;
                        if (var3_3 == var5_5) break block9;
                        if (var3_3 != var4_4) break block10;
                        var7_7 = (ru_0)this.c;
                        vl2_2.b(var1_1 /* !! */ );
                        ** GOTO lbl39
                    }
                    var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1 /* !! */ ;
                }
                var7_7 = (ru_0)this.c;
                vl2_2.b(var1_1 /* !! */ );
                break block11;
            }
            vl2_2.b(var1_1 /* !! */ );
            var7_7 = var1_1 /* !! */  = this.c;
            this.c = var7_7 = (ru_0)var1_1 /* !! */ ;
            this.b = var5_5;
            var1_1 /* !! */  = Di3.c((ru_0)var7_7, this, var4_4);
            if (var1_1 /* !! */  == var2_2) {
                return var2_2;
            }
        }
        var1_1 /* !! */  = (aw2_0)var1_1 /* !! */ ;
        var8_8 = var1_1 /* !! */ .a;
        var6_6.g = var10_9 = new Yv2(var8_8);
        var12_11 = var1_1 /* !! */ .c;
        var6_6.a = var11_10 = new e72(var12_11);
        do {
            block7: {
                this.c = var7_7;
                this.b = var4_4;
                var1_1 /* !! */  = Nv2.Main;
                if ((var1_1 /* !! */  = var7_7.x0((Nv2)var1_1 /* !! */ , this)) == var2_2) {
                    return var2_2;
                }
lbl39:
                // 3 sources

                var1_1 /* !! */  = ((mv2_0)var1_1 /* !! */ ).a;
                var14_12 = var1_1 /* !! */ .size();
                var11_10 = new ArrayList(var14_12);
                var14_12 = var1_1 /* !! */ .size();
                var15_13 = 0;
                var10_9 = null;
                var17_15 /* !! */  = null;
                for (var16_14 = 0; var16_14 < var14_12; ++var16_14) {
                    var19_17 /* !! */  = var18_16 /* !! */  = var1_1 /* !! */ .get(var16_14);
                    var19_17 /* !! */  = (aw2_0)var18_16 /* !! */ ;
                    var20_18 = var19_17 /* !! */ .d;
                    if (!var20_18) continue;
                    var11_10.add(var18_16 /* !! */ );
                }
                var21_19 = var11_10.size();
                while (true) {
                    var14_12 = 0;
                    if (var15_13 >= var21_19) break;
                    var17_15 /* !! */  = (aw2_0)var11_10.get(var15_13);
                    var18_16 /* !! */  = var17_15 /* !! */ ;
                    var18_16 /* !! */  = var17_15 /* !! */ ;
                    var22_20 = var18_16 /* !! */ .a;
                    var24_21 = var6_6.g;
                    var25_22 = var24_21 instanceof Yv2;
                    if (!var25_22 || (var28_24 = (cfr_temp_0 = var22_20 - (var26_23 = var24_21.a)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false) {
                        ++var15_13;
                        continue;
                    }
                    break block7;
                    break;
                }
                var16_14 = 0;
                var17_15 /* !! */  = null;
            }
            if ((var17_15 /* !! */  = (aw2_0)var17_15 /* !! */ ) == null) {
                var1_1 /* !! */  = CollectionsKt.firstOrNull((List)var11_10);
                var17_15 /* !! */  = var1_1 /* !! */ ;
                var17_15 /* !! */  = (aw2_0)var1_1 /* !! */ ;
            }
            if (var17_15 /* !! */  == null) continue;
            var22_20 = var17_15 /* !! */ .a;
            var1_1 /* !! */  = new Yv2(var22_20);
            var6_6.g = var1_1 /* !! */ ;
            var29_25 = var17_15 /* !! */ .c;
            var1_1 /* !! */  = new e72(var29_25);
            var6_6.a = var1_1 /* !! */ ;
        } while ((var21_19 = var11_10.isEmpty() ^ var5_5) != 0);
        var6_6.g = null;
        return Unit.a;
    }
}

