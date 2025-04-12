/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Fr3
extends qg3_2
implements Function2 {
    public ks1_1 a;
    public Mr3 b;
    public int c;
    public final /* synthetic */ Mr3 d;

    public Fr3(gx2_0 gx2_02, f80_0 f80_02) {
        this.d = gx2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gx2_0 gx2_02 = (gx2_0)this.d;
        object = new Fr3(gx2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Fr3)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Fr3)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        Object object2;
        block7: {
            Object object3;
            block6: {
                Object object4;
                object3 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.c;
                int n4 = 1;
                if (n3 != 0) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object3 = this.b;
                    object2 = this.a;
                    vl2_2.b(object);
                } else {
                    vl2_2.b(object);
                    object2 = object = this.d;
                    object2 = (gx2_0)object;
                    object2.getClass();
                    S83 s83 = (S83)yr3.b.getValue();
                    yr3$b yr3$b = yr3.a;
                    kx2_1 kx2_12 = ((gx2_0)object2).g;
                    s83.d(object2, yr3$b, kx2_12);
                    this.a = object2 = ((gx2_0)object2).j;
                    this.b = object;
                    this.c = n4;
                    object4 = ((ks1_1)object2).d(this, null);
                    if (object4 == object3) {
                        return object3;
                    }
                    object3 = object;
                }
                object = object3;
                try {
                    object = (gx2_0)object3;
                    ((gx2_0)object).d = object4 = ((Mr3)object3).b();
                    object = object3;
                    object = (gx2_0)object3;
                    object = ((gx2_0)object).i;
                    if (object == null) break block6;
                    object4 = tl2_2.b;
                    object4 = ((Mr3)object3).b();
                    object.resumeWith(object4);
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            object3 = (gx2_0)object3;
            ((gx2_0)object3).i = null;
            object = Unit.a;
            object2.b(null);
            return Unit.a;
        }
        object2.b(null);
        throw throwable2;
    }
}

