/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iC3
 */
public final class ic3_2
implements Function0 {
    public final /* synthetic */ f a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ tr1_0 c;

    public /* synthetic */ ic3_2(ExoPlayer exoPlayer, tr1_0 tr1_02, tr1_0 tr1_03) {
        this.a = exoPlayer;
        this.b = tr1_02;
        this.c = tr1_03;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$exoPlayer");
        tr1_0 tr1_02 = this.b;
        Intrinsics.checkNotNullParameter(tr1_02, "$isMuted$delegate");
        tr1_0 tr1_03 = this.c;
        Intrinsics.checkNotNullParameter(tr1_03, "$isVolumeIconClickedByUser$delegate");
        Boolean bl2 = (Boolean)tr1_02.getValue();
        boolean bl3 = bl2;
        String string2 = "exoPlayer";
        if (bl3) {
            bl2 = Boolean.TRUE;
            tr1_03.setValue(bl2);
            object = (ExoPlayer)object;
            Intrinsics.checkNotNullParameter(object, string2);
            float f5 = 1.0f;
            object.setVolume(f5);
        } else {
            Intrinsics.checkNotNullParameter(object, string2);
            float f6 = 0.0f;
            tr1_03 = null;
            object.setVolume(0.0f);
        }
        object = (Boolean)tr1_02.getValue() ^ true;
        tr1_02.setValue(object);
        return Unit.a;
    }
}

