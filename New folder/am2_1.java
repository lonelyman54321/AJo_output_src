/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from AM2
 */
public final class am2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ long b;

    public am2_1(long l2, f80_0 f80_02) {
        this.b = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.b;
        object = new am2_1(l2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (am2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((am2_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        long l2 = this.b;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7) {
                if (n3 == n4) {
                    vl2_2.b(object);
                    return Unit.a;
                }
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = bf0_0.a;
            if (object == null) {
                String string2 = "You can't access the transaction repository if you don't initialize it!".toString();
                object = new IllegalStateException(string2);
                throw object;
            }
            this.a = n7;
            object = ((lb1_0)object).a.b().b(l2, this);
            if (object != j90_02) {
                object = Unit.a;
            }
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = bf0_0.b;
        if (object == null) {
            String string3 = "You can't access the throwable repository if you don't initialize it!".toString();
            object = new IllegalStateException(string3);
            throw object;
        }
        this.a = n4;
        object = ((VF2)object).a.a().b(l2, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

