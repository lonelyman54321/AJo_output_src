/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class KY1$c
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ky1_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public KY1$c(ky1_0 ky1_02, String string2, String string3, f80_0 f80_02) {
        this.b = ky1_02;
        this.c = string2;
        this.d = string3;
        this.e = "similar products widget";
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ky1_0 ky1_02 = this.b;
        String string2 = this.c;
        String string3 = this.d;
        object = new KY1$c(ky1_02, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (KY1$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((KY1$c)object).invokeSuspend(object2);
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
            BH3 bH3 = this.b.i;
            this.a = n4;
            int n7 = 16;
            String string2 = this.c;
            String string3 = this.d;
            String string4 = "pdp screen";
            String string5 = this.e;
            object = BH3.b(bH3, string2, string3, string4, string5, false, this, n7);
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

