/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ST2$c
extends Lambda
implements Function0 {
    public final /* synthetic */ st2_2 c;

    public ST2$c(st2_2 st2_22) {
        this.c = st2_22;
        super(0);
    }

    public final Object invoke() {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.c.a;
        int n3 = parcelableSnapshotMutableIntState.o();
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            parcelableSnapshotMutableIntState = null;
        }
        return n3 != 0;
    }
}

