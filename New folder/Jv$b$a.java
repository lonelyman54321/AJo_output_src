/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class Jv$b$a
implements fs0_2 {
    public final /* synthetic */ Function1 a;

    public Jv$b$a(Function1 function1) {
        this.a = function1;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3 = ((Number)object).intValue();
        object2 = new Integer(n3);
        this.a.invoke(object2);
        return Unit.a;
    }
}

