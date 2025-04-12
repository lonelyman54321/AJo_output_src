/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Sq0$d
extends qg3_2
implements Function2 {
    public final /* synthetic */ Sq0 a;

    public Sq0$d(Sq0 sq0, f80_0 f80_02) {
        this.a = sq0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Sq0 sq0 = this.a;
        object = new Sq0$d(sq0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Sq0$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Sq0$d)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        var2_2 /* !! */  = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(var1_1);
        var1_1 = this.a;
        synchronized (var1_1) {
            block10: {
                var3_4 = var1_1.l;
                if (!var3_4 || (var3_4 = var1_1.m)) ** GOTO lbl-1000
                var3_4 = true;
                try {
                    var1_1.A();
                    ** GOTO lbl15
                }
                catch (IOException v0) {
                    var1_1.n = var3_4;
lbl15:
                    // 2 sources

                    try {
                        var4_5 = var1_1.i;
                        var5_6 = 2000;
                        var4_5 = var4_5 >= var5_6 ? 1 : 0;
                        if (var4_5 != 0) {
                            var1_1.G();
                        }
                        ** GOTO lbl28
                    }
                    catch (IOException v1) {
                        var1_1.o = var3_4;
                        var2_2 /* !! */  = new Object();
                        var2_2 /* !! */  = o72_0.a((y63_0)var2_2 /* !! */ );
                        var1_1.j = var2_2 /* !! */ ;
lbl28:
                        // 2 sources

                        return Unit.a;
                        catch (Throwable var2_3) {}
                    }
                    break block10;
                }
lbl-1000:
                // 1 sources

                {
                    var2_2 /* !! */  = Unit.a;
                }
                return var2_2 /* !! */ ;
            }
            throw var2_3;
        }
    }
}

