/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Sk2
 */
public final class sk2_1
extends qg3_2
implements Function1 {
    public final /* synthetic */ Function0 a;

    public sk2_1(Function0 function0, f80_0 f80_02) {
        this.a = function0;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Function0 function0 = this.a;
        sk2_1 sk2_12 = new sk2_1(function0, f80_02);
        return sk2_12;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (sk2_1)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((sk2_1)object).invokeSuspend(unit);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return this.a.invoke();
    }
}

