/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from aY2
 */
public final class ay2_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sQ1 c;
    public final /* synthetic */ Sj3 d;

    public ay2_1(sQ1 sQ12, Sj3 sj3, f80_0 f80_02) {
        this.c = sQ12;
        this.d = sj3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        sQ1 sQ12 = this.c;
        Sj3 sj3 = this.d;
        ay2_1 ay2_12 = new ay2_1(sQ12, sj3, f80_02);
        ay2_12.b = object;
        return ay2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (ay2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ay2_1)object).invokeSuspend(object2);
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
            object = (hw2_0)this.b;
            Object object2 = object.getViewConfiguration();
            KV kV = new KV((NC3)object2);
            Sj3 sj3 = this.d;
            sQ1 sQ12 = this.c;
            object2 = new ay2$a_0(sQ12, kV, sj3, null);
            this.a = n4;
            object = vv0_0.b((hw2_0)object, (Function2)object2, this);
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

