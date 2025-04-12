/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Cg0
 */
public final class cg0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yh0_0 a;
    public final /* synthetic */ yi2_1 b;

    public cg0_2(yh0_0 yh0_02, yi2_1 yi2_12, f80_0 f80_02) {
        this.a = yh0_02;
        this.b = yi2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yh0_0 yh0_02 = this.a;
        yi2_1 yi2_12 = this.b;
        object = new cg0_2(yh0_02, yi2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cg0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cg0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        rz3_0.Companion.getClass();
        object = Rz3$a.d(this.b);
        object2 = this.a;
        object = ((yh0_0)object2).c((String)object);
        Boolean bl2 = Boolean.FALSE;
        ((yh0_0)object2).d((HashMap)object, bl2);
        return Unit.a;
    }
}

