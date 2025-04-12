/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class U50
extends qg3_2
implements Function2 {
    public final /* synthetic */ EI3 a;

    public U50(EI3 eI3, f80_0 f80_02) {
        this.a = eI3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        EI3 eI3 = this.a;
        object = new U50(eI3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (k60_0)object;
        object2 = (f80_0)object2;
        object = (U50)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((U50)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = qx1.a();
        Objects.toString(this.a);
        object.getClass();
        return Unit.a;
    }
}

