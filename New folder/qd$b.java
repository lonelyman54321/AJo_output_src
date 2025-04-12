/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class qd$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public qd$b(f80_0 f80_02, dr0_0 dr0_02) {
        this.a = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.a;
        object = new qd$b(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qd$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qd$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = dr0_0.Companion;
        object = this.a;
        object.getClass();
        String string2 = "";
        Intrinsics.checkNotNullParameter(string2, "query");
        ((dr0_0)object).O0 = false;
        object2 = 0;
        ((dr0_0)object).i.setValue(object2);
        ((dr0_0)object).L0.setValue(string2);
        ((dr0_0)object).s();
        return Unit.a;
    }
}

