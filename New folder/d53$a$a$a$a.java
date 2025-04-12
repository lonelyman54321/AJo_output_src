/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class d53$a$a$a$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dr_2 c;
    public final /* synthetic */ Function2 d;

    public d53$a$a$a$a(le_2 le_22, Function2 function2, f80_0 f80_02) {
        this.c = le_22;
        this.d = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.d;
        le_2 le_22 = (le_2)this.c;
        d53$a$a$a$a d53$a$a$a$a = new d53$a$a$a$a(le_22, function2, f80_02);
        d53$a$a$a$a.b = object;
        return d53$a$a$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d53$a$a$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d53$a$a$a$a)object).invokeSuspend(object2);
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
            object = (i90_0)this.b;
            le_2 le_22 = (le_2)this.c;
            a53_0 a53_02 = new a53_0((i90_0)object, le_22);
            this.a = n4;
            object = this.d.invoke(a53_02, this);
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

