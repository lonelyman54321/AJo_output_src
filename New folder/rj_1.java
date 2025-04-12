/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from rJ
 */
public final class rj_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vJ c;

    public rj_1(vJ vJ2, f80_0 f80_02) {
        this.c = vJ2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        vJ vJ2 = this.c;
        rj_1 rj_12 = new rj_1(vJ2, f80_02);
        rj_12.b = object;
        return rj_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (rj_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rj_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            int n7;
            vl2_2.b(object);
            object = (fs0_2)this.b;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = n7 = -1 << -1;
            Object object2 = this.c.c;
            int n8 = 2;
            rJ$a rJ$a = new qg3_2(n8, null);
            it0_2 it0_22 = new it0_2((es0_2)object2, rJ$a);
            object2 = new rJ$b((fs0_2)object, ref$IntRef);
            this.a = n4;
            object = it0_22.collect((fs0_2)object2, this);
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

