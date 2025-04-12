/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.willy.ratingbar.BaseRatingBar$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from te2
 */
public final class te2_0
implements BaseRatingBar$a {
    public final /* synthetic */ qz1_2 a;

    public /* synthetic */ te2_0(qz1_2 qz1_22) {
        this.a = qz1_22;
    }

    public final void a(float f5, boolean bl2) {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f7 != false && bl2) {
            Float f8 = Float.valueOf(f5);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = qz1_22.Q;
            parcelableSnapshotMutableState.setValue(f8);
        }
    }
}

