/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Nk3
extends Lambda
implements Function1 {
    public final /* synthetic */ Pk3 c;

    public Nk3(Pk3 pk3) {
        this.c = pk3;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Number)object;
        float f5 = ((Number)object).floatValue();
        Object object2 = this.c;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = ((Pk3)object2).a;
        float f6 = parcelableSnapshotMutableFloatState.c() + f5;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = ((Pk3)object2).b;
        float f7 = parcelableSnapshotMutableFloatState2.c();
        object2 = ((Pk3)object2).a;
        Object object3 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
        if (object3 > 0) {
            f5 = parcelableSnapshotMutableFloatState2.c();
            f6 = ((D83)object2).c();
            f5 -= f6;
        } else {
            parcelableSnapshotMutableFloatState2 = null;
            float f8 = f6 - 0.0f;
            Object object4 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object4 < 0) {
                f5 = -((D83)object2).c();
            }
        }
        f6 = ((D83)object2).c() + f5;
        ((D83)object2).k(f6);
        return Float.valueOf(f5);
    }
}

