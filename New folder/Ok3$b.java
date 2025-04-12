/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Ok3$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Pk3 c;

    public Ok3$b(Pk3 pk3) {
        this.c = pk3;
        super(0);
    }

    public final Object invoke() {
        float f5;
        Object object = this.c;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = ((Pk3)object).a;
        float f6 = parcelableSnapshotMutableFloatState.c();
        float f7 = f6 - (f5 = ((D83)(object = ((Pk3)object).b)).c());
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            object2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            object2 = false;
            f5 = 0.0f;
            object = null;
        }
        return (boolean)object2;
    }
}

