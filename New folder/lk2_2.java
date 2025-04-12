/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Lk2
 */
public final class lk2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Jk2 a;

    public lk2_2(Jk2 jk2, f80_0 f80_02) {
        this.a = jk2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Jk2 jk2 = this.a;
        object = new lk2_2(jk2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (lk2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lk2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((Jk2)object).i;
        int n3 = ((Jk2)object).g;
        Integer n4 = new Integer(n3);
        object2.j(n4);
        return Unit.a;
    }
}

