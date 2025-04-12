/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xs
 */
public final class xs_2
implements Function1 {
    public final /* synthetic */ ExoPlayer a;

    public /* synthetic */ xs_2(ExoPlayer exoPlayer) {
        this.a = exoPlayer;
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        ExoPlayer exoPlayer = this.a;
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        object = new es_0(exoPlayer);
        return object;
    }
}

