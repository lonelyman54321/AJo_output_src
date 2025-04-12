/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Gu0
 */
public final class gu0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yu0_0 b;

    public gu0_2(yu0_0 yu0_02, f80_0 f80_02) {
        this.b = yu0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yu0_0 yu0_02 = this.b;
        object = new gu0_2(yu0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gu0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gu0_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        this.a = n4;
        object = this.b;
        object.getClass();
        zu0_0 zu0_02 = zu0_0.Closed;
        object = ((yu0_0)object).a;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = ((Re)object).k;
        f5 = parcelableSnapshotMutableFloatState.c();
        object = de_0.b((Re)object, (Object)zu0_02, f5, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

