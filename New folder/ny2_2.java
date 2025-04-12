/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ny2
 */
public final class ny2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;

    public ny2_2(Function2 function2, f80_0 f80_02) {
        this.c = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.c;
        ny2_2 ny2_22 = new ny2_2(function2, f80_02);
        ny2_22.b = object;
        return ny2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (my2_0)object;
        object2 = (f80_0)object2;
        object = (ny2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ny2_2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var2_5;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                kr1_1 kr1_12 = (kr1_1)this.b;
                vl2_2.b(object);
                return var2_5;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (my2_0)this.b;
        object = fh1_2.q(((my2_0)object).a());
        kr1_1 kr1_13 = new kr1_1((Map)object, false);
        this.b = kr1_13;
        this.a = n4;
        object = this.c.invoke(kr1_13, this);
        if (object == j90_02) {
            return j90_02;
        }
        kr1_1 kr1_14 = kr1_13;
        return var2_5;
    }
}

