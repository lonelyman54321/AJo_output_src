/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from JP
 */
public final class jp_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Cl2 b;
    public final /* synthetic */ int c;

    public jp_1(hm0_0 hm0_02, int n3, f80_0 f80_02) {
        this.b = hm0_02;
        this.c = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.c;
        hm0_0 hm0_02 = (hm0_0)this.b;
        object = new jp_1(hm0_02, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jp_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jp_1)object).invokeSuspend(object2);
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
            this.a = n4;
            int n7 = 6;
            hm0_0 hm0_02 = (hm0_0)this.b;
            n4 = this.c;
            object = Cl2.g(hm0_02, n4, null, this, n7);
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

