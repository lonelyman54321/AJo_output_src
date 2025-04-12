/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from gs
 */
public final class gs_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ tr1_0 d;

    public gs_1(ft1_2 ft1_22, p83_0 p83_02, tr1_0 tr1_02, f80_0 f80_02) {
        this.b = ft1_22;
        this.c = p83_02;
        this.d = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        p83_0 p83_02 = this.c;
        tr1_0 tr1_02 = this.d;
        ft1_2 ft1_22 = this.b;
        object = new gs_1(ft1_22, p83_02, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gs_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gs_1)object).invokeSuspend(object2);
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
            Object object2 = this.b;
            Object object3 = this.c;
            object = new fs_1((ft1_2)object2, (p83_0)object3);
            object = J83.k((Function0)object);
            object3 = this.d;
            object2 = new gs$a((tr1_0)object3);
            this.a = n4;
            object = ((m0_0)object).collect((fs0_2)object2, this);
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

