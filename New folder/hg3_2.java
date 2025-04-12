/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hG3
 */
public final class hg3_2
extends qg3_2
implements Function2 {
    public p60_0 a;
    public rr_2 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ig3_1 e;
    public final /* synthetic */ Activity f;

    public hg3_2(ig3_1 ig3_12, Activity activity, f80_0 f80_02) {
        this.e = ig3_12;
        this.f = activity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ig3_1 ig3_12 = this.e;
        Activity activity = this.f;
        hg3_2 hg3_22 = new hg3_2(ig3_12, activity, f80_02);
        hg3_22.d = object;
        return hg3_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (hg3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hg3_2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block9: {
            block10: {
                block11: {
                    var2_3 = j90_0.COROUTINE_SUSPENDED;
                    var3_4 = this.c;
                    var4_5 = 2;
                    var5_6 = 1;
                    var6_7 = this.e;
                    if (var3_4 == 0) break block10;
                    if (var3_4 == var5_6) break block11;
                    if (var3_4 != var4_5) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var7_8 = this.b;
                    var8_9 = this.a;
                    var9_10 = (fs0_2)this.d;
                    try {
                        vl2_2.b(var1_1);
                    }
                    catch (Throwable var1_2) {
                        break block9;
                    }
                    while (true) {
                        var1_1 = var9_10;
                        var9_10 = var7_8;
                        ** GOTO lbl42
                        break;
                    }
                }
                var7_8 = this.b;
                var8_9 = this.a;
                var9_10 = (fs0_2)this.d;
                {
                    vl2_2.b(var1_1);
                    ** GOTO lbl-1000
                }
            }
            vl2_2.b(var1_1);
            var1_1 = (fs0_2)this.d;
            var7_8 = he_2.DROP_OLDEST;
            var10_11 = 4;
            var11_12 = 10;
            var7_8 = sr_2.a(var11_12, var10_11, (he_2)var7_8);
            var8_9 = new gg3_0((le_2)var7_8);
            var9_10 = var6_7.b;
            var12_13 = new Object();
            var13_14 = this.f;
            var9_10.b(var13_14, var12_13, (gg3_0)var8_9);
            {
                var9_10 = new lE$a((le_2)var7_8);
lbl42:
                // 2 sources

                this.d = var1_1;
                this.a = var8_9;
                this.b = var9_10;
                this.c = var5_6;
                var7_8 = var9_10.b(this);
                if (var7_8 == var2_3) {
                    return var2_3;
                }
                var14_15 = var9_10;
                var9_10 = var1_1;
                var1_1 = var7_8;
                var7_8 = var14_15;
            }
lbl-1000:
            // 2 sources

            {
                var1_1 = (Boolean)var1_1;
                var15_16 = var1_1.booleanValue();
                if (!var15_16) {
                    var6_7.b.a(var8_9);
                    return Unit.a;
                }
                var1_1 = var7_8.next();
                var1_1 = (gH3)var1_1;
                this.d = var9_10;
                this.a = var8_9;
                this.b = var7_8;
                this.c = var4_5;
                if ((var1_1 = var9_10.emit(var1_1, this)) != var2_3) ** continue;
                return var2_3;
            }
        }
        var6_7.b.a(var8_9);
        throw var1_2;
    }
}

