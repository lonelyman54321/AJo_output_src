/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class RD
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ QD b;
    public final /* synthetic */ zp1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public RD(QD qD, w32_0 w32_02, Function0 function0, SD sD, f80_0 f80_02) {
        this.b = qD;
        this.c = w32_02;
        this.d = function0;
        this.e = sD;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        RD rD;
        Object object2 = this.c;
        zp1 zp12 = object2;
        zp12 = (w32_0)object2;
        Object object3 = object2 = this.e;
        object3 = (SD)object2;
        QD qD = this.b;
        Function0 function0 = this.d;
        object2 = rD;
        rD = new RD(qD, (w32_0)zp12, function0, (SD)object3, f80_02);
        rD.a = object;
        return rD;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (RD)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((RD)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (i90_0)this.a;
        w32_0 w32_02 = (w32_0)this.c;
        QD qD = this.b;
        Function0 function0 = this.d;
        object2 = new RD$a(qD, w32_02, function0, null);
        int n3 = 3;
        Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        function0 = (SD)this.e;
        object2 = new RD$b(qD, (SD)function0, null);
        return Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
    }
}

