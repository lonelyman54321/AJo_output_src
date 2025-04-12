/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from K62
 */
public final class k62_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bg2$e_0 c;

    public k62_0(bg2$e_0 bg2$e_0, f80_0 f80_02) {
        this.c = bg2$e_0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bg2$e_0 bg2$e_0 = this.c;
        k62_0 k62_02 = new k62_0(bg2$e_0, f80_02);
        k62_02.b = object;
        return k62_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (sj3_2)object;
        object2 = (f80_0)object2;
        object = (k62_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((k62_0)object).invokeSuspend(object2);
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
            object = ((sj3_2)this.b).a;
            this.a = n4;
            bg2$e_0 bg2$e_0 = this.c;
            object = bg2$e_0.e((gf_2)object, this);
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

