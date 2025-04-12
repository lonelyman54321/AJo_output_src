/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class wR$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ut2 c;
    public final /* synthetic */ bt2_2 d;

    public wR$b(xt1_0 xt1_02, bt2_2 bt2_22, f80_0 f80_02) {
        this.c = xt1_02;
        this.d = bt2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bt2_2 bt2_22 = this.d;
        xt1_0 xt1_02 = (xt1_0)this.c;
        wR$b wR$b = new wR$b(xt1_02, bt2_22, f80_02);
        wR$b.b = object;
        return wR$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (tt2_0)object;
        object2 = (f80_0)object2;
        object = (wR$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wR$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (tt2_0)this.b;
            this.a = n4;
            object = object.a();
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

