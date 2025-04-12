/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ST2$d
extends Lambda
implements Function0 {
    public final /* synthetic */ st2_2 c;

    public ST2$d(st2_2 st2_22) {
        this.c = st2_22;
        super(0);
    }

    public final Object invoke() {
        int n3;
        Object object = this.c;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = ((st2_2)object).a;
        int n4 = parcelableSnapshotMutableIntState.o();
        if (n4 < (n3 = ((e83_0)(object = ((st2_2)object).d)).o())) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }
}

