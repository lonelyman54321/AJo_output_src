/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WB3
 */
public final class wb3_2
implements Function1 {
    public final /* synthetic */ mu1_1 a;
    public final /* synthetic */ ExoPlayer b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ tr1_0 e;

    public /* synthetic */ wb3_2(mu1_1 mu1_12, ExoPlayer exoPlayer, tr1_0 tr1_02, tr1_0 tr1_03, tr1_0 tr1_04) {
        this.a = mu1_12;
        this.b = exoPlayer;
        this.c = tr1_02;
        this.d = tr1_03;
        this.e = tr1_04;
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        mu1_1 mu1_12 = this.a;
        Intrinsics.checkNotNullParameter(mu1_12, "$lifecycleOwner");
        ExoPlayer exoPlayer = this.b;
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$lifecycle$delegate");
        tr1_0 tr1_02 = this.d;
        Intrinsics.checkNotNullParameter(tr1_02, "$isAppInForeground$delegate");
        tr1_0 tr1_03 = this.e;
        Intrinsics.checkNotNullParameter(tr1_03, "$isItemVisible$delegate");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        object = new tb3_2(exoPlayer, (tr1_0)object2, tr1_02, tr1_03);
        mu1_12.getLifecycle().a((lu1)object);
        object2 = new cC3$c(exoPlayer, mu1_12, (tb3_2)object);
        return object2;
    }
}

