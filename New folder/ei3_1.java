/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ei3
 */
public final class ei3_1
extends rl2_2
implements Function2 {
    public long b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ aw2_0 e;

    public ei3_1(aw2_0 aw2_02, f80_0 f80_02) {
        this.e = aw2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        aw2_0 aw2_02 = this.e;
        ei3_1 ei3_12 = new ei3_1(aw2_02, f80_02);
        ei3_12.d = object;
        return ei3_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (ei3_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ei3_1)object).invokeSuspend(object2);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        long l2;
        long l3;
        long l4;
        Object object2;
        long l7;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            l7 = this.b;
            object2 = (ru_0)this.d;
            vl2_2.b(object);
            object = (aw2_0)object;
            if ((l4 = (l3 = (l2 = ((aw2_0)object).b) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0) {
                return object;
            }
        } else {
            vl2_2.b(object);
            object = (ru_0)this.d;
            l7 = this.e.b;
            object.getViewConfiguration().getClass();
            l2 = (long)40 + l7;
            object2 = object;
            l7 = l2;
        }
        do {
            this.d = object2;
            this.b = l7;
            this.c = n4;
            int n7 = 3;
            object = Di3.c((ru_0)object2, this, n7);
            if (object == j90_02) {
                return j90_02;
            }
            object = (aw2_0)object;
        } while ((l4 = (l3 = (l2 = ((aw2_0)object).b) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0);
        return object;
    }
}

