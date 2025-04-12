/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from si
 */
public final class si_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ti c;

    public si_1(ti ti2, f80_0 f80_02) {
        this.c = ti2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ti ti2 = this.c;
        si_1 si_12 = new si_1(ti2, f80_02);
        si_12.b = object;
        return si_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Uh1)object;
        object2 = (f80_0)object2;
        object = (si_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((si_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            object2 = (Uh1)this.b;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.b = object = (Uh1)this.b;
            Object object3 = this.c;
            this.a = n4;
            Object object4 = zj1_2.b(this);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n4, (f80_0)object4);
            cancellableContinuationImpl.r();
            Object object5 = ((ti)object3).b;
            object4 = ((Al3)object5).a;
            object4.a();
            Il3 il3 = new Il3((Al3)object5, (zt2_0)object4);
            ((Al3)object5).b.set(il3);
            object5 = new si$a_0((Uh1)object, (ti)object3);
            cancellableContinuationImpl.x((Function1)object5);
            object = cancellableContinuationImpl.q();
            if (object == object2) {
                object3 = "frame";
                Intrinsics.checkNotNullParameter(this, (String)object3);
            }
            if (object == object2) {
                return object2;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

