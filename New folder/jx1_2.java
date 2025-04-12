/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Jx1
 */
public final class jx1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ bg2_2 b;
    public final /* synthetic */ if_1 c;

    public jx1_2(bg2_2 bg2_22, if_1 if_12, f80_0 f80_02) {
        this.b = bg2_22;
        this.c = if_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bg2_2 bg2_22 = this.b;
        if_1 if_12 = this.c;
        object = new jx1_2(bg2_22, if_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jx1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jx1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        if_1 if_12 = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (bg2$e_0)this.b;
            this.a = n4;
            object = ((bg2$e_0)object).e(if_12, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        if_12.j();
        return Unit.a;
    }
}

