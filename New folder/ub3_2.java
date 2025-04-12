/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UB3
 */
public final class ub3_2
implements Function0 {
    public final /* synthetic */ f a;
    public final /* synthetic */ tr1_0 b;

    public /* synthetic */ ub3_2(ExoPlayer exoPlayer, tr1_0 tr1_02) {
        this.a = exoPlayer;
        this.b = tr1_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$exoPlayer");
        tr1_0 tr1_02 = this.b;
        Intrinsics.checkNotNullParameter(tr1_02, "$isMuted$delegate");
        Boolean bl2 = (Boolean)tr1_02.getValue();
        int n3 = bl2.booleanValue();
        String string2 = "exoPlayer";
        if (n3 != 0) {
            object = (ExoPlayer)object;
            Intrinsics.checkNotNullParameter(object, string2);
            n3 = 1065353216;
            float f5 = 1.0f;
            object.setVolume(f5);
        } else {
            Intrinsics.checkNotNullParameter(object, string2);
            n3 = 0;
            float f6 = 0.0f;
            bl2 = null;
            object.setVolume(0.0f);
        }
        object = (Boolean)tr1_02.getValue() ^ true;
        tr1_02.setValue(object);
        return Unit.a;
    }
}

