/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from X43
 */
public final class x43_0
extends qg3_2
implements Function2 {
    public Function2 a;
    public int b;
    public final /* synthetic */ Y43 c;

    public x43_0(Y43 y43, f80_0 f80_02) {
        this.c = y43;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Y43 y43 = this.c;
        object = new x43_0(y43, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (x43_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((x43_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block6: {
            block3: {
                block4: {
                    block5: {
                        var2_2 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var3_3 = this.b;
                        var4_4 = 2;
                        var5_5 = 1;
                        var6_6 = this.c;
                        if (var3_3 == 0) break block3;
                        if (var3_3 == var5_5) break block4;
                        if (var3_3 != var4_4) break block5;
                        vl2_2.b(var1_1);
                        ** GOTO lbl36
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var7_7 = this.a;
                vl2_2.b(var1_1);
                ** GOTO lbl-1000
            }
            vl2_2.b(var1_1);
            var1_1 = var6_6.d;
            var8_8 = var1_1.get();
            if (var8_8 > 0) {
                while (true) lbl-1000:
                // 2 sources

                {
                    mm0.c(var6_6.a.getCoroutineContext());
                    this.a = var7_7 = var6_6.b;
                    this.b = var5_5;
                    var1_1 = var6_6.c.g(this);
                    if (var1_1 == var2_2 /* !! */ ) {
                        return var2_2 /* !! */ ;
                    } else {
                        ** GOTO lbl-1000
                    }
                    break;
                }
            }
            break block6;
lbl-1000:
            // 3 sources

            {
                this.a = null;
                this.b = var4_4;
                var1_1 = var7_7.invoke(var1_1, this);
                if (var1_1 != var2_2 /* !! */ ) continue;
                return var2_2 /* !! */ ;
lbl36:
                // 2 sources

                ** while ((var8_8 = (var1_1 = var6_6.d).decrementAndGet()) != 0)
            }
lbl37:
            // 1 sources

            return Unit.a;
        }
        var2_2 /* !! */  = "Check failed.".toString();
        var1_1 = new IllegalStateException((String)var2_2 /* !! */ );
        throw var1_1;
    }
}

