/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ie2
 */
public final class ie2_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;

    public ie2_1(qz1_2 qz1_22, f80_0 f80_02) {
        this.a = qz1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.a;
        object = new ie2_1(qz1_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ie2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ie2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.G("return fee communication");
        return Unit.a;
    }
}

