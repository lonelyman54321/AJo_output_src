/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class KY1$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ky1_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public KY1$b(ky1_0 ky1_02, String string2, String string3, String string4, f80_0 f80_02) {
        this.b = ky1_02;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.d;
        String string3 = this.e;
        ky1_0 ky1_02 = this.b;
        String string4 = this.c;
        object = new KY1$b(ky1_02, string4, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (KY1$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((KY1$b)object).invokeSuspend(object2);
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
            object = this.b;
            Object object2 = ((ky1_0)object).b.getNewCartId("closet screen");
            Object object3 = new KY1$b$a((ky1_0)object, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
            object3 = this.d;
            String string2 = this.e;
            String string3 = this.c;
            object2 = new KY1$b$b((ky1_0)object, string3, (String)object3, string2);
            this.a = n4;
            object = at0_12.collect((fs0_2)object2, this);
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

