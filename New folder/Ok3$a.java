/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Ok3$a
extends Lambda
implements Function0 {
    public final /* synthetic */ Pk3 c;

    public Ok3$a(Pk3 pk3) {
        this.c = pk3;
        super(0);
    }

    public final Object invoke() {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.c.a;
        float f5 = parcelableSnapshotMutableFloatState.c();
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
            parcelableSnapshotMutableFloatState = null;
        }
        return (boolean)object;
    }
}

