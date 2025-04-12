/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidComposeView$c;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Xh1
 */
public final class xh1_0
implements Wh1 {
    public final Function1 a;
    public final ParcelableSnapshotMutableState b;

    public xh1_0(int n3, AndroidComposeView$c object) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        object = new Vh1(n3);
        this.b = parcelableSnapshotMutableState = J83.g(object);
    }

    public final int a() {
        return ((Vh1)this.b.getValue()).a;
    }
}

