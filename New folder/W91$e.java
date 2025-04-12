/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;

public final class W91$e
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ List d;

    public W91$e(List list, f80_0 f80_02) {
        this.d = list;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (bb1_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        List list = this.d;
        W91$e w91$e = new W91$e(list, (f80_0)object3);
        w91$e.b = object;
        w91$e.c = object2;
        object = Unit.a;
        return w91$e.invokeSuspend(object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var2_5;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                Throwable throwable = (Throwable)this.b;
                vl2_2.b(object);
                return var2_5;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (bb1_2)this.b;
        Throwable throwable = wc0_2.a(this.c);
        this.b = throwable;
        this.a = n4;
        List list = this.d;
        object = W91.a(list, throwable, (bb1_2)object, this);
        if (object == j90_02) {
            return j90_02;
        }
        Throwable throwable2 = throwable;
        return var2_5;
    }
}

