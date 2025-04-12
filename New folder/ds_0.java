/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ds
 */
public final class ds_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ds_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Throwable)object;
                ((fr0_1)this.b).dispose();
                return Unit.a;
            }
            case 0: 
        }
        object = (Dr0)object;
        ExoPlayer exoPlayer = (ExoPlayer)this.b;
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        object = new qs_2(exoPlayer);
        return object;
    }
}

