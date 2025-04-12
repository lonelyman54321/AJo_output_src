/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class tv3
extends qg3_2
implements Function2 {
    public final /* synthetic */ Function0 a;

    public tv3(Function0 function0, f80_0 f80_02) {
        this.a = function0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function0 function0 = this.a;
        object = new tv3(function0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tv3)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tv3)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.invoke();
        return Unit.a;
    }
}

