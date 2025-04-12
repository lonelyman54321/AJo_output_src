/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import androidx.room.a$a$b;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class a$a$a
extends qg3_2
implements Function2 {
    public rr_2 a;
    public int b;
    public final /* synthetic */ FP2 c;
    public final /* synthetic */ a$a$b d;
    public final /* synthetic */ dr_2 e;
    public final /* synthetic */ Callable f;
    public final /* synthetic */ dr_2 g;

    public a$a$a(FP2 fP2, a$a$b a$a$b, le_2 le_22, Callable callable, le_2 le_23, f80_0 f80_02) {
        this.c = fP2;
        this.d = a$a$b;
        this.e = le_22;
        this.f = callable;
        this.g = le_23;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.e;
        dr_2 dr_22 = object2;
        dr_22 = (le_2)object2;
        object2 = this.g;
        dr_2 dr_23 = object2;
        dr_23 = (le_2)object2;
        FP2 fP2 = this.c;
        a$a$b a$a$b = this.d;
        Callable callable = this.f;
        object2 = object;
        object = new a$a$a(fP2, a$a$b, (le_2)dr_22, callable, (le_2)dr_23, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a$a$a)object).invokeSuspend(object2);
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
                    var3_4 = this.b;
                    var4_5 = 2;
                    var5_6 = 1;
                    var6_7 = this.d;
                    var7_8 = this.c;
                    if (var3_4 == 0) break block10;
                    if (var3_4 == var5_6) break block11;
                    if (var3_4 != var4_5) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var8_9 = this.a;
                    try {
                        vl2_2.b(var1_1);
                    }
                    catch (Throwable var1_2) {
                        break block9;
                    }
                    while (true) {
                        var1_1 = var8_9;
                        ** GOTO lbl31
                        break;
                    }
                }
                var8_9 = this.a;
                {
                    vl2_2.b(var1_1);
                    ** GOTO lbl-1000
                }
            }
            vl2_2.b(var1_1);
            var1_1 = var7_8.getInvalidationTracker();
            var1_1.a(var6_7);
            {
                var1_1 = this.e;
                var1_1 = var1_1.iterator();
lbl31:
                // 2 sources

                this.a = var1_1;
                this.b = var5_6;
                var8_9 = var1_1.b(this);
                if (var8_9 == var2_3) {
                    return var2_3;
                }
                var9_10 = var8_9;
                var8_9 = var1_1;
                var1_1 = var9_10;
            }
lbl-1000:
            // 2 sources

            {
                var1_1 = (Boolean)var1_1;
                var10_11 = var1_1.booleanValue();
                if (!var10_11) {
                    var7_8.getInvalidationTracker().d(var6_7);
                    return Unit.a;
                }
                var8_9.next();
                var1_1 = this.f;
                var1_1 = var1_1.call();
                var11_12 = this.g;
                this.a = var8_9;
                this.b = var4_5;
                if ((var1_1 = var11_12.o(this, var1_1)) != var2_3) ** continue;
                return var2_3;
            }
        }
        var7_8.getInvalidationTracker().d(var6_7);
        throw var1_2;
    }
}

