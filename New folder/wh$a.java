/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class wh$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wh_0 c;

    public wh$a(wh_0 wh_02, f80_0 f80_02) {
        this.c = wh_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wh_0 wh_02 = this.c;
        wh$a wh$a = new wh$a(wh_02, f80_02);
        wh$a.b = object;
        return wh$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (wh$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wh$a)object).invokeSuspend(object2);
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
            object = (hw2_0)this.b;
            wh_0 wh_02 = this.c;
            wh$a$a wh$a$a = new wh$a$a(wh_02, null);
            this.a = n4;
            object = vv0_0.b((hw2_0)object, wh$a$a, this);
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

