/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class o90$b$a
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ hw2_0 b;
    public final /* synthetic */ Sj3 c;
    public final /* synthetic */ Sk3 d;

    public o90$b$a(hw2_0 hw2_02, Sj3 sj3, Sk3 sk3, f80_0 f80_02) {
        this.b = hw2_02;
        this.c = sj3;
        this.d = sk3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Sj3 sj3 = this.c;
        Sk3 sk3 = this.d;
        hw2_0 hw2_02 = this.b;
        o90$b$a o90$b$a = new o90$b$a(hw2_02, sj3, sk3, f80_02);
        o90$b$a.a = object;
        return o90$b$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (o90$b$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((o90$b$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Enum enum_ = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (i90_0)this.a;
        enum_ = l90_0.UNDISPATCHED;
        hw2_0 hw2_02 = this.b;
        Sj3 sj3 = this.c;
        qg3_2 qg3_22 = new o90$b$a$a(hw2_02, sj3, null);
        int n3 = 1;
        Ae3.d((i90_0)object, null, (l90_0)enum_, qg3_22, n3);
        Sk3 sk3 = this.d;
        qg3_22 = new o90$b$a$b(hw2_02, sk3, null);
        Ae3.d((i90_0)object, null, (l90_0)enum_, qg3_22, n3);
        return Unit.a;
    }
}

