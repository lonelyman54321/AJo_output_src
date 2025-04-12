/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Ce$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Re b;
    public final /* synthetic */ float c;

    public Ce$a(Re re, float f5, f80_0 f80_02) {
        this.b = re;
        this.c = f5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Re re = this.b;
        float f5 = this.c;
        object = new Ce$a(re, f5, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Ce$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Ce$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        this.a = n4;
        object = this.b;
        Object object2 = ((Re)object).g.getValue();
        f5 = ((Re)object).e();
        float f6 = this.c;
        Object object3 = ((Re)object).c(f5, f6, object2);
        Boolean bl2 = (Boolean)((Re)object).d.invoke(object3);
        boolean bl3 = bl2;
        if (bl3) {
            if ((object = de_0.b((Re)object, object3, f6, this)) != j90_02) {
                object = Unit.a;
            }
        } else if ((object = de_0.b((Re)object, object2, f6, this)) != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

