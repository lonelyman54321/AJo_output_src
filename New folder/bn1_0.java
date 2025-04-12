/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.R$drawable;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bN1
 */
public final class bn1_0
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        MediaPlayerRecyclerView mediaPlayerRecyclerView = (MediaPlayerRecyclerView)this.receiver;
        int n3 = MediaPlayerRecyclerView.f;
        mediaPlayerRecyclerView = mediaPlayerRecyclerView.getResources();
        n3 = R$drawable.ct_audio;
        mediaPlayerRecyclerView = mediaPlayerRecyclerView.getDrawable(n3, null);
        Intrinsics.checkNotNull(mediaPlayerRecyclerView);
        return mediaPlayerRecyclerView;
    }
}

