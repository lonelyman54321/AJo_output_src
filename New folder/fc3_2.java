/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fC3
 */
public final class fc3_2
implements Function0 {
    public final /* synthetic */ f a;

    public /* synthetic */ fc3_2(ExoPlayer exoPlayer) {
        this.a = exoPlayer;
    }

    public final Object invoke() {
        String string2 = "$exoPlayer";
        f f5 = this.a;
        Intrinsics.checkNotNullParameter(f5, string2);
        int n3 = f5.getPlaybackState();
        int n4 = 4;
        if (n3 == n4) {
            long l2 = 0L;
            f5.seekTo(l2);
        }
        f5.setPlayWhenReady(true);
        return Unit.a;
    }
}

