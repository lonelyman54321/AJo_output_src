/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Hk$a
implements Rm2 {
    public final ParcelableSnapshotMutableState b;

    public Hk$a(boolean bl2) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.b = parcelableSnapshotMutableState = J83.g(bl2);
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final Object k() {
        return this;
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

