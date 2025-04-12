/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class ER0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ String d;

    public ER0(int n3, f80_0 f80_02, dr0_0 dr0_02, String string2) {
        this.b = n3;
        this.c = dr0_02;
        this.d = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.c;
        String string2 = this.d;
        int n3 = this.b;
        object = new ER0(n3, f80_02, dr0_02, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ER0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ER0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        int n7 = 101;
        n3 = this.b;
        object = n3 != n7 ? (n3 != (n7 = 103) ? "ajio" : "ajiogram") : "luxe";
        Object object2 = object;
        BH3 bH3 = this.c.A0;
        this.a = n4;
        int n8 = 24;
        String string2 = this.d;
        String string3 = "feed screen";
        object = BH3.b(bH3, string2, (String)object2, string3, null, false, this, n8);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

