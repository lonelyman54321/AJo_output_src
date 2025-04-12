/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from pv2
 */
public final class pv2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ rv2_2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public pv2_2(rv2_2 rv2_22, String string2, String string3, f80_0 f80_02) {
        this.b = rv2_22;
        this.c = string2;
        this.d = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        rv2_2 rv2_22 = this.b;
        object = new pv2_2(rv2_22, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pv2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pv2_2)object).invokeSuspend(object2);
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
            BH3 bH3 = this.b.a;
            this.a = n4;
            int n7 = 24;
            String string2 = this.c;
            String string3 = this.d;
            String string4 = "plp screen";
            object = BH3.b(bH3, string2, string3, string4, null, false, this, n7);
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

