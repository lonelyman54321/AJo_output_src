/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mX2
 */
public final class mx2_0
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ gx2_0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ gr3 d;

    public mx2_0(gx2_0 gx2_02, Object object, gr3 gr32, f80_0 f80_02) {
        this.b = gx2_02;
        this.c = object;
        this.d = gr32;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Object object = this.c;
        gr3 gr32 = this.d;
        gx2_0 gx2_02 = this.b;
        mx2_0 mx2_02 = new mx2_0(gx2_02, object, gr32, f80_02);
        return mx2_02;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (mx2_0)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((mx2_0)object).invokeSuspend(unit);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        gr3 gr32 = this.d;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            float f5;
            long l2;
            vl2_2.b(object);
            object = gx2_0.r;
            object = this.b;
            ((gx2_0)object).l();
            ((gx2_0)object).l = l2 = Long.MIN_VALUE;
            n3 = 0;
            ((gx2_0)object).o(0.0f);
            Object object2 = ((gx2_0)object).c.getValue();
            Object object3 = this.c;
            int n7 = Intrinsics.areEqual(object3, object2);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((gx2_0)object).b;
            float f6 = -3.0f;
            if (n7 != 0) {
                n7 = -1065353216;
                f5 = -4.0f;
            } else {
                object2 = parcelableSnapshotMutableState.getValue();
                n7 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
                if (n7 != 0) {
                    n7 = -1063256064;
                    f5 = -5.0f;
                } else {
                    n7 = -1069547520;
                    f5 = -3.0f;
                }
            }
            gr32.r(object3);
            long l3 = 0L;
            gr32.p(l3);
            parcelableSnapshotMutableState.setValue(object3);
            ((gx2_0)object).o(0.0f);
            ((gx2_0)object).c(object3);
            gr32.k(f5);
            n3 = (int)(f5 == f6 ? 0 : (f5 < f6 ? -1 : 1));
            if (n3 == 0) {
                this.a = n4;
                if ((object = gx2_0.j((gx2_0)object, this)) == j90_02) {
                    return j90_02;
                }
            }
        }
        gr32.j();
        return Unit.a;
    }
}

