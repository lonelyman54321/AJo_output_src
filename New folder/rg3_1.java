/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Rg3
 */
public final class rg3_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ sg3_1 a;

    public rg3_1(sg3_1 sg3_12, f80_0 f80_02) {
        this.a = sg3_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        sg3_1 sg3_12 = this.a;
        object = new rg3_1(sg3_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rg3_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        ((rg3_1)object).invokeSuspend(object2);
        throw null;
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.getClass();
        throw null;
    }
}

