/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from fv0
 */
public final class fv0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Cl2 c;
    public final /* synthetic */ ov0_0 d;

    public fv0_1(boolean bl2, hm0_0 hm0_02, ov0_0 ov0_02, f80_0 f80_02) {
        this.b = bl2;
        this.c = hm0_02;
        this.d = ov0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.b;
        hm0_0 hm0_02 = (hm0_0)this.c;
        ov0_0 ov0_02 = this.d;
        object = new fv0_1(bl2, hm0_02, ov0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fv0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fv0_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            boolean bl2 = this.b;
            if (!bl2) return Unit.a;
            this.a = n4;
            bl2 = false;
            hm0_0 hm0_02 = (hm0_0)this.c;
            object = Cl2.t(hm0_02, 0, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = this.d.d;
        Boolean bl3 = Boolean.FALSE;
        ((h83_0)object).setValue(bl3);
        return Unit.a;
    }
}

