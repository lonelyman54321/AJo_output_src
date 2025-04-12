/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class h63
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Object c;

    public h63(Function2 function2, Object object, f80_0 f80_02) {
        this.b = function2;
        this.c = object;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.b;
        Object object2 = this.c;
        object = new h63(function2, object2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (h63)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((h63)object).invokeSuspend(object2);
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
            object = this.b;
            Object object2 = this.c;
            object = object.invoke(object2, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

