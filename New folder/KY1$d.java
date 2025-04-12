/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class KY1$d
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ky1_0 b;
    public final /* synthetic */ String c;

    public KY1$d(ky1_0 ky1_02, String string2, f80_0 f80_02) {
        this.b = ky1_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ky1_0 ky1_02 = this.b;
        String string2 = this.c;
        object = new KY1$d(ky1_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (KY1$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((KY1$d)object).invokeSuspend(object2);
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
            object = this.b.i;
            this.a = n4;
            n3 = 0;
            String string2 = this.c;
            String string3 = "plp screen";
            object = ((BH3)object).c(string2, string3, null, this);
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

