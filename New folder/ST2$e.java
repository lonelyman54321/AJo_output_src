/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

public final class ST2$e
extends Lambda
implements Function1 {
    public final /* synthetic */ st2_2 c;

    public ST2$e(st2_2 st2_22) {
        this.c = st2_22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Number)object;
        float f5 = ((Number)object).floatValue();
        st2_2 st2_22 = this.c;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = st2_22.a;
        float f6 = (float)parcelableSnapshotMutableIntState.o() + f5;
        float f7 = st2_22.e;
        f6 += f7;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = st2_22.d;
        int n3 = parcelableSnapshotMutableIntState2.o();
        f7 = n3;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = null;
        f7 = f.f(f6, 0.0f, f7);
        int n4 = 1;
        float f8 = Float.MIN_VALUE;
        Object object2 = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1);
        if (object2 == false) {
            object2 = true;
            f6 = Float.MIN_VALUE;
        } else {
            object2 = false;
            f6 = 0.0f;
            parcelableSnapshotMutableIntState = null;
        }
        object2 = object2 ^ n4;
        parcelableSnapshotMutableIntState3 = st2_22.a;
        float f11 = parcelableSnapshotMutableIntState3.o();
        int n7 = Math.round(f7 -= f11);
        int n8 = parcelableSnapshotMutableIntState3.o() + n7;
        parcelableSnapshotMutableIntState3.e(n8);
        f8 = n7;
        st2_22.e = f8 = f7 - f8;
        if (object2 != false) {
            f5 = f7;
        }
        return Float.valueOf(f5);
    }
}

