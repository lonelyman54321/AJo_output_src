/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class OE2$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ OE2 b;
    public final /* synthetic */ pe1_0 c;

    public OE2$a(f80_0 f80_02, pe1_0 pe1_02, OE2 oE2) {
        this.b = oE2;
        this.c = pe1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        OE2 oE2 = this.b;
        pe1_0 pe1_02 = this.c;
        object = new OE2$a(f80_02, pe1_02, oE2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (OE2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((OE2$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        OE2 oE2 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = n4;
            object = this.c;
            n3 = 0;
            object = OE2.e(oE2, (pe1_0)object, 0, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        Object object2 = object;
        se1_0 se1_02 = (se1_0)object;
        boolean bl2 = se1_02 instanceof hb0_0;
        if (bl2) {
            oE2.getClass();
        }
        return object;
    }
}

