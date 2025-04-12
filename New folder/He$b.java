/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class He$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ Re d;

    public He$b(me_0 me_02, Re re, f80_0 f80_02) {
        this.c = me_02;
        this.d = re;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Re re = this.d;
        me_0 me_02 = (me_0)this.c;
        He$b he$b = new He$b(me_02, re, f80_02);
        he$b.b = object;
        return he$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Xs0)object;
        object2 = (f80_0)object2;
        object = (He$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((He$b)object).invokeSuspend(object2);
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
            object = (Xs0)this.b;
            Ke ke = this.d.n;
            this.a = n4;
            gx0_2 gx0_22 = this.c;
            object = gx0_22.invoke(ke, object, this);
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

