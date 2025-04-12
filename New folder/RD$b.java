/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class RD$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ QD b;
    public final /* synthetic */ Function0 c;

    public RD$b(QD qD, SD sD, f80_0 f80_02) {
        this.b = qD;
        this.c = sD;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SD sD = (SD)this.c;
        QD qD = this.b;
        object = new RD$b(qD, sD, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (RD$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((RD$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        n3 = (int)(((LP1$c)object).m ? 1 : 0);
        if (n3 == 0) return Unit.a;
        Object object2 = ((LP1$c)object).e();
        n3 = (int)(((LP1$c)object2).m ? 1 : 0);
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = QD.p;
            if ((object2 = (JD)((Object)Zr3.a((fo0)object, object2))) == null) {
                object2 = new TD((fo0)object);
            }
        }
        if (object2 == null) return Unit.a;
        object = go0.e((fo0)object);
        this.a = n4;
        Function0 function0 = this.c;
        if ((object = object2.Q((w32_0)object, function0, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

