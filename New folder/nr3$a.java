/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class nr3$a
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ float d;

    public nr3$a(gr3 gr32, float f5) {
        this.c = gr32;
        this.d = f5;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((Number)object).longValue();
        object = this.c;
        Object object2 = ((gr3)object).h();
        if (!object2) {
            long l3;
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = ((gr3)object).g;
            long l4 = parcelableSnapshotMutableLongState.x();
            long l7 = l4 - (l3 = Long.MIN_VALUE);
            Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object3 == false) {
                parcelableSnapshotMutableLongState.z(l2);
                Boolean bl2 = Boolean.TRUE;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((gr3)object).a.a;
                parcelableSnapshotMutableState.setValue(bl2);
            }
            long l8 = parcelableSnapshotMutableLongState.x();
            l2 -= l8;
            parcelableSnapshotMutableLongState = null;
            float f5 = this.d;
            float f6 = f5 - 0.0f;
            object2 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (object2) {
                double d2 = l2;
                double d5 = f5;
                l2 = ok1_1.c(d2 /= d5);
            }
            ((gr3)object).p(l2);
            if (!object2) {
                object2 = true;
            } else {
                object2 = false;
                parcelableSnapshotMutableLongState = null;
            }
            ((gr3)object).i(l2, (boolean)object2);
        }
        return Unit.a;
    }
}

