/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from fU2
 */
public final class fu2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ gu2_2 b;
    public final /* synthetic */ int c;

    public fu2_1(gu2_2 gu2_22, int n3, f80_0 f80_02) {
        this.b = gu2_22;
        this.c = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gu2_2 gu2_22 = this.b;
        int n3 = this.c;
        object = new fu2_1(gu2_22, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fu2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fu2_1)object).invokeSuspend(object2);
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
        object = this.b.a;
        Qs3 qs3 = of0_1.b;
        this.a = n4;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = ((st2_2)object).a;
        n4 = parcelableSnapshotMutableIntState.o();
        int n7 = this.c - n4;
        f5 = n7;
        object = KT2.a((dU2)object, f5, qs3, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

