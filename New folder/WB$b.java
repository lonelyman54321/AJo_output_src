/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class WB$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ String b;

    public WB$b(dr0_0 dr0_02, String string2, f80_0 f80_02) {
        this.a = dr0_02;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.a;
        String string2 = this.b;
        object = new WB$b(dr0_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (WB$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((WB$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = eF2$a.a;
        object2 = this.a;
        int n3 = ((dr0_0)object2).p0;
        String string2 = this.b;
        ((dr0_0)object2).S((ef2_1)object, string2, n3);
        return Unit.a;
    }
}

