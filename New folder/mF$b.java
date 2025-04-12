/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.client.plugins.internal.SaveBodyAbandonedReadException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class mF$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Ref$ObjectRef c;

    public mF$b(Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.c = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.c;
        mF$b mF$b = new mF$b(ref$ObjectRef, f80_02);
        mF$b.b = object;
        return mF$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (sj3_2)object;
        object2 = (f80_0)object2;
        object = (mF$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mF$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
            Object object2;
            Object object3;
            int n3;
            int n4;
            j90_0 j90_02;
            block7: {
                block3: {
                    block4: {
                        block5: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n3) break block4;
                            if (n7 != n4) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object3 = (sj3_2)this.b;
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                object3 = object = this.b;
                object3 = (sj3_2)object;
                object = (mF$a)this.c.element;
                this.b = object3;
                this.a = n3;
                object2 = (rj3_2)((mF$a)object).b.getValue();
                Object object4 = kf_1.a;
                object4 = "<this>";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object2 = ((rj3_2)object2).b;
                n3 = (int)(object2.n() ? 1 : 0);
                if (n3 == 0) {
                    object2 = ((rj3_2)((mF$a)object).b.getValue()).a;
                    object4 = new SaveBodyAbandonedReadException();
                    object2.e((Throwable)object4);
                }
                if ((object = ((mF$a)object).a.y0(this)) == j90_02) {
                    return j90_02;
                }
            }
            object = (byte[])object;
            object3 = ((sj3_2)object3).a;
            this.b = null;
            this.a = n4;
            n4 = ((Object)object).length;
            n3 = 0;
            object2 = null;
            object = kf_1.b((gf_2)object3, (byte[])object, 0, n4, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

