/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from qv1
 */
public final class qv1_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ eK$a d;

    public qv1_1(Function2 function2, eK$a eK$a, f80_0 f80_02) {
        this.c = function2;
        this.d = eK$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.c;
        eK$a eK$a = this.d;
        qv1_1 qv1_12 = new qv1_1(function2, eK$a, f80_02);
        qv1_12.b = object;
        return qv1_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qv1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qv1_1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block9: {
            var2_3 = j90_0.COROUTINE_SUSPENDED;
            var3_4 = this.a;
            var4_5 = true;
            var5_6 = this.d;
            if (var3_4) {
                if (var3_4 != var4_5) {
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var1_1);
                break block9;
            }
            vl2_2.b(var1_1);
            var1_1 = (i90_0)this.b;
            try {
                var6_7 = this.c;
                this.a = var4_5;
                var1_1 = var6_7.invoke(var1_1, this);
                if (var1_1 == var2_3) {
                    return var2_3;
                }
            }
            catch (Throwable var1_2) {}
            catch (CancellationException v0) {}
        }
        var5_6.a(var1_1);
        return Unit.a;
        ** finally { 
lbl27:
        // 1 sources

        var5_6.b(var1_2);
        return Unit.a;
    }
}

