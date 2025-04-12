/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class rH3$b$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ jb3_2 b;
    public final /* synthetic */ hq1_0 c;

    public rH3$b$a(jb3_2 jb3_22, hq1_0 hq1_02, f80_0 f80_02) {
        this.b = jb3_22;
        this.c = hq1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        jb3_2 jb3_22 = this.b;
        hq1_0 hq1_02 = this.c;
        object = new rH3$b$a(jb3_22, hq1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rH3$b$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rH3$b$a)object).invokeSuspend(object2);
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
            Object object2 = this.c;
            object = new rH3$b$a$a((hq1_0)object2);
            this.a = n4;
            object2 = this.b;
            object = object2.collect((fs0_2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

