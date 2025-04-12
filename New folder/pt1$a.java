/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class pt1$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ lt1 b;

    public pt1$a(lt1 lt12, f80_0 f80_02) {
        this.b = lt12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lt1 lt12 = this.b;
        object = new pt1$a(lt12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pt1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pt1$a)object).invokeSuspend(object2);
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
            this.a = n4;
            object = this.b.a(this);
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

