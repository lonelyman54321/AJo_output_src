/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HS0
 */
public final class hs0_1
implements es0_2 {
    public final /* synthetic */ gx0_2 a;

    public hs0_1(ts0_2 ts0_22) {
        this.a = ts0_22;
    }

    public final Object collect(fs0_2 object, f80_0 f80_02) {
        ts0_2 ts0_22 = (ts0_2)this.a;
        Object object2 = new is0_2(ts0_22, (fs0_2)object, null);
        Object object3 = f80_02.getContext();
        object = new ut2_2(f80_02, (CoroutineContext)object3);
        if ((object = nv3_0.a((ut2_2)object, (ut2_2)object, object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object3);
        }
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }
}

