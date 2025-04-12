/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Hi3$a$c
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ gx0_2 b;
    public final /* synthetic */ dy2_1 c;
    public final /* synthetic */ aw2_0 d;

    public Hi3$a$c(gx0_2 gx0_22, dy2_1 dy2_12, aw2_0 aw2_02, f80_0 f80_02) {
        this.b = gx0_22;
        this.c = dy2_12;
        this.d = aw2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dy2_1 dy2_12 = this.c;
        aw2_0 aw2_02 = this.d;
        gx0_2 gx0_22 = this.b;
        object = new Hi3$a$c(gx0_22, dy2_12, aw2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Hi3$a$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Hi3$a$c)object).invokeSuspend(object2);
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
            long l2 = this.d.c;
            object = new e72(l2);
            this.a = n4;
            gx0_2 gx0_22 = this.b;
            dy2_1 dy2_12 = this.c;
            object = gx0_22.invoke(dy2_12, object, this);
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

