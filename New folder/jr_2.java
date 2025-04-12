/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from JR
 */
public class jr_2
extends ir_2 {
    public final Function2 d;

    public jr_2(Function2 function2, CoroutineContext coroutineContext, int n3, he_2 he_22) {
        super(coroutineContext, n3, he_22);
        this.d = function2;
    }

    public Object g(pz2_2 object, f80_0 object2) {
        Function2 function2 = this.d;
        if ((object = function2.invoke(object, object2)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }

    public ir_2 h(CoroutineContext coroutineContext, int n3, he_2 he_22) {
        Function2 function2 = this.d;
        jr_2 jr_22 = new jr_2(function2, coroutineContext, n3, he_22);
        return jr_22;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("block[");
        Object object = this.d;
        stringBuilder.append(object);
        stringBuilder.append("] -> ");
        object = super.toString();
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

