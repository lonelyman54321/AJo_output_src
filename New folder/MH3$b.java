/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class MH3$b
implements es0_2 {
    public final /* synthetic */ es0_2[] a;

    public MH3$b(es0_2[] es0_2Array) {
        this.a = es0_2Array;
    }

    public final Object collect(fs0_2 object, f80_0 f80_02) {
        tz_2 tz_22;
        Object object2 = this.a;
        MH3$b$a mH3$b$a = new MH3$b$a((es0_2[])object2);
        int n3 = 3;
        MH3$b$b mH3$b$b = new qg3_2(n3, null);
        Object object3 = tz_22;
        tz_22 = new tz_2((es0_2[])object2, mH3$b$a, mH3$b$b, (fs0_2)object, null);
        object3 = f80_02.getContext();
        object = new ut2_2(f80_02, (CoroutineContext)object3);
        if ((object = nv3_0.a((ut2_2)object, (ut2_2)object, tz_22)) == (object3 = j90_0.COROUTINE_SUSPENDED)) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        }
        if (object != object3) {
            object = Unit.a;
        }
        if (object == object3) {
            return object;
        }
        return Unit.a;
    }
}

