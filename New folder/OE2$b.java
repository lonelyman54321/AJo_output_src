/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobSupport;

public final class OE2$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pe1_0 c;
    public final /* synthetic */ OE2 d;

    public OE2$b(f80_0 f80_02, pe1_0 pe1_02, OE2 oE2) {
        this.c = pe1_02;
        this.d = oE2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        pe1_0 pe1_02 = this.c;
        OE2 oE2 = this.d;
        OE2$b oE2$b = new OE2$b(f80_02, pe1_02, oE2);
        oE2$b.b = object;
        return oE2$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (OE2$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((OE2$b)object).invokeSuspend(object2);
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
            Object object2 = ir0_2.a;
            object2 = bg1_1.a.N0();
            OE2 oE2 = this.d;
            pe1_0 pe1_02 = this.c;
            OE2$b$a oE2$b$a = new OE2$b$a(null, pe1_02, oE2);
            int n7 = 2;
            object = Ae3.a((i90_0)object, (CoroutineContext)object2, oE2$b$a, n7);
            object2 = m.c(((nd3_0)pe1_02.c).getView());
            ((RD3)object2).a((wn0_2)object);
            this.a = n4;
            object = ((JobSupport)object).D(this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

