/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from v93
 */
public final class v93_0
implements Function0 {
    public final /* synthetic */ u93_0 a;

    public /* synthetic */ v93_0(u93_0 u93_02) {
        this.a = u93_02;
    }

    public final Object invoke() {
        u93_0 u93_02 = this.a;
        Intrinsics.checkNotNullParameter(u93_02, "this$0");
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = u93_0.Pa((u93_0)u93_02).i;
        Boolean bl2 = Boolean.TRUE;
        parcelableSnapshotMutableState.setValue(bl2);
        u93_02.dismiss();
        return Unit.a;
    }
}

