/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from dY2$a
 */
public final class dy2$a_0
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Function1 d;

    public dy2$a_0(Function1 function1, f80_0 f80_02) {
        this.d = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.d;
        dy2$a_0 dy2$a_0 = new dy2$a_0(function1, f80_02);
        dy2$a_0.c = object;
        return dy2$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (dy2$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dy2$a_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block2: {
            block3: {
                var2_2 = j90_0.COROUTINE_SUSPENDED;
                var3_3 = this.b;
                var4_4 = 1;
                if (var3_3 == 0) break block2;
                if (var3_3 != var4_4) break block3;
                var5_5 = (ru_0)this.c;
                vl2_2.b(var1_1 /* !! */ );
                ** GOTO lbl21
            }
            var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1 /* !! */ ;
        }
        vl2_2.b(var1_1 /* !! */ );
        var5_5 = var1_1 /* !! */  = (ru_0)this.c;
        while (true) {
            var1_1 /* !! */  = Nv2.Initial;
            this.c = var5_5;
            this.b = var4_4;
            if ((var1_1 /* !! */  = var5_5.x0((Nv2)var1_1 /* !! */ , this)) == var2_2) {
                return var2_2;
            }
lbl21:
            // 3 sources

            var6_6 = eY2.d((mv2_0)var1_1 /* !! */ ) ^ var4_4;
            var1_1 /* !! */  = var6_6;
            var7_7 = this.d;
            var7_7.invoke(var1_1 /* !! */ );
        }
    }
}

