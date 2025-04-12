/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class YI3$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ WI3 b;

    public YI3$a(WI3 wI3, f80_0 f80_02) {
        this.b = wI3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        WI3 wI3 = this.b;
        object = new YI3$a(wI3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (YI3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((YI3$a)object).invokeSuspend(object2);
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
            object = WI3.a(this.b, this);
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

