/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

public final class d53$a$a
extends qg3_2
implements Function2 {
    public rr_2 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fs0_2 d;
    public final /* synthetic */ Function2 e;

    public d53$a$a(fs0_2 fs0_22, Function2 function2, f80_0 f80_02) {
        this.d = fs0_22;
        this.e = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fs0_2 fs0_22 = this.d;
        Function2 function2 = this.e;
        d53$a$a d53$a$a = new d53$a$a(fs0_22, function2, f80_02);
        d53$a$a.c = object;
        return d53$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d53$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d53$a$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        var2_2 = j90_0.COROUTINE_SUSPENDED;
        var3_3 = this.b;
        var4_4 = 2;
        var5_5 = 1;
        if (var3_3 != 0) {
            if (var3_3 != var5_5) {
                if (var3_3 == var4_4) {
                    var6_6 = this.a;
                    var7_7 = (i)this.c;
                    vl2_2.b(var1_1);
                    while (true) {
                        var1_1 = var7_7;
                        var7_7 = var6_6;
                        break block7;
                        break;
                    }
                }
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            var6_6 = this.a;
            var7_7 = (i)this.c;
            vl2_2.b(var1_1);
        } else {
            block7: {
                vl2_2.b(var1_1);
                var1_1 = (i90_0)this.c;
                var3_3 = 0;
                var8_8 = 6;
                var6_6 = sr_2.a(0, var8_8, null);
                var9_9 = this.e;
                var7_7 = new d53$a$a$a((le_2)var6_6, (Function2)var9_9, null);
                var10_10 = 3;
                var1_1 = Ae3.d((i90_0)var1_1, null, null, (Function2)var7_7, var10_10);
                var7_7 = new lE$a((le_2)var6_6);
            }
            this.c = var1_1;
            this.a = var7_7;
            this.b = var5_5;
            var6_6 = var7_7.b(this);
            if (var6_6 == var2_2) {
                return var2_2;
            }
            var11_11 = var7_7;
            var7_7 = var1_1;
            var1_1 = var6_6;
            var6_6 = var11_11;
        }
        var1_1 = (Boolean)var1_1;
        var12_12 = var1_1.booleanValue();
        if (var12_12) {
            var1_1 = var6_6.next();
            this.c = var7_7;
            this.a = var6_6;
            this.b = var4_4;
            if ((var1_1 = (var9_9 = this.d).emit(var1_1, this)) != var2_2) ** continue;
            return var2_2;
        }
        var7_7.d(null);
        return Unit.a;
    }
}

