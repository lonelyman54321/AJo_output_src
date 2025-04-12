/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from il2
 */
public final class il2_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Cl2 b;

    public il2_0(hm0_0 hm0_02, f80_0 f80_02) {
        this.b = hm0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hm0_0 hm0_02 = (hm0_0)this.b;
        object = new il2_0(hm0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (il2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((il2_0)object).invokeSuspend(object2);
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
        this.a = n4;
        object = this.b;
        n3 = ((Cl2)object).j() + n4;
        int n7 = ((Cl2)object).m();
        if (n3 < n7) {
            n3 = ((Cl2)object).j() + n4;
            n4 = 6;
            object = (hm0_0)object;
            n7 = 0;
            if ((object = Cl2.g((hm0_0)object, n3, null, this, n4)) != j90_02) {
                object = Unit.a;
            }
        } else {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

