/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from iP2
 */
public final class ip2_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wr1_1 c;
    public final /* synthetic */ uP2 d;

    public ip2_0(wr1_1 wr1_12, uP2 uP22, f80_0 f80_02) {
        this.c = wr1_12;
        this.d = uP22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wr1_1 wr1_12 = this.c;
        uP2 uP22 = this.d;
        ip2_0 ip2_02 = new ip2_0(wr1_12, uP22, f80_02);
        ip2_02.b = object;
        return ip2_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ip2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ip2_0)object).invokeSuspend(object2);
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
            i90_0 i90_02 = (i90_0)this.b;
            i23_0 i23_02 = this.c.b();
            uP2 uP22 = this.d;
            iP2$a iP2$a = new iP2$a(uP22, i90_02);
            this.a = n4;
            i23_02.getClass();
            j90_0 j90_03 = i23_0.l(i23_02, iP2$a, this);
            if (j90_03 != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw illegalStateException;
    }
}

