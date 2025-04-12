/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class kU2$e
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ku2_0 c;
    public final /* synthetic */ Function2 d;

    public kU2$e(ku2_0 ku2_02, Function2 function2, f80_0 f80_02) {
        this.c = ku2_02;
        this.d = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ku2_0 ku2_02 = this.c;
        Function2 function2 = this.d;
        kU2$e kU2$e = new kU2$e(ku2_02, function2, f80_02);
        kU2$e.b = object;
        return kU2$e;
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        object2 = (f80_0)object2;
        object = (kU2$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kU2$e)object).invokeSuspend(object2);
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
            object = (QT2)this.b;
            Object object2 = this.c;
            ((ku2_0)object2).h = object;
            object = ((ku2_0)object2).i;
            this.a = n4;
            object2 = this.d;
            object = object2.invoke(object, this);
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

