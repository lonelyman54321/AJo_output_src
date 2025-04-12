/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dC3
 */
public final class dc3_2
implements Function1 {
    public final /* synthetic */ mu1_1 a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ Boolean c;
    public final /* synthetic */ f d;
    public final /* synthetic */ tr1_0 e;

    public /* synthetic */ dc3_2(mu1_1 mu1_12, Boolean bl2, Boolean bl3, ExoPlayer exoPlayer, tr1_0 tr1_02) {
        this.a = mu1_12;
        this.b = bl2;
        this.c = bl3;
        this.d = exoPlayer;
        this.e = tr1_02;
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        mu1_1 mu1_12 = this.a;
        Intrinsics.checkNotNullParameter(mu1_12, "$lifecycleOwner");
        Object object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$exoPlayer");
        tr1_0 tr1_02 = this.e;
        Intrinsics.checkNotNullParameter(tr1_02, "$isAppInForeground$delegate");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        Boolean bl2 = this.c;
        object2 = (ExoPlayer)object2;
        Boolean bl3 = this.b;
        object = new hc3_2(bl3, bl2, (ExoPlayer)object2, tr1_02);
        mu1_12.getLifecycle().a((lu1)object);
        object2 = new lc3_2(mu1_12, (hc3_2)object);
        return object2;
    }
}

