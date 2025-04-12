/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class RD$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ QD b;
    public final /* synthetic */ zp1 c;
    public final /* synthetic */ Function0 d;

    public RD$a(QD qD, w32_0 w32_02, Function0 function0, f80_0 f80_02) {
        this.b = qD;
        this.c = w32_02;
        this.d = function0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        QD qD = this.b;
        w32_0 w32_02 = (w32_0)this.c;
        Function0 function0 = this.d;
        object = new RD$a(qD, w32_02, function0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (RD$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((RD$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            PD pD = ((QD)object).n;
            Function0 function0 = this.d;
            w32_0 w32_02 = (w32_0)this.c;
            RD$a$a rD$a$a = new RD$a$a((QD)object, w32_02, function0);
            this.a = n4;
            object = pD.G0(rD$a$a, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

