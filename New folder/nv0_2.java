/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from nv0
 */
public final class nv0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ov0_0 b;
    public final /* synthetic */ Cl2 c;

    public nv0_2(ov0_0 ov0_02, hm0_0 hm0_02, f80_0 f80_02) {
        this.b = ov0_02;
        this.c = hm0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hm0_0 hm0_02 = (hm0_0)this.c;
        ov0_0 ov0_02 = this.b;
        object = new nv0_2(ov0_02, hm0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nv0_2)object).invokeSuspend(object2);
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
            object = this.c;
            n3 = ((Cl2)object).j();
            ov0_0 ov0_02 = this.b;
            ov0_02.getClass();
            aW aW2 = md3_0.c(ov0_02);
            jv0_1 jv0_12 = new jv0_1(ov0_02, n3, null, null);
            Ae3.d(aW2, null, null, jv0_12, 3);
            n3 = ((Cl2)object).j() - n4;
            this.a = n4;
            object = Cl2.t((hm0_0)object, n3, this);
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

