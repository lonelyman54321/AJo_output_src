/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.e;
import androidx.media3.ui.PlayerView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uL1
 */
public final class ul1_1
implements f$c {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ vl1_0 b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ Function0 d;

    public ul1_1(zm1_0 zm1_02, vl1_0 vl1_02, e e2, an1_0 an1_02) {
        this.a = zm1_02;
        this.b = vl1_02;
        this.c = e2;
        this.d = an1_02;
    }

    public final void A(int n3) {
    }

    public final void C(int n3) {
    }

    public final void D(int n3) {
        int n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                n4 = 4;
                if (n3 == n4) {
                    Object object = this.b;
                    ExoPlayer exoPlayer = ((vl1_0)object).b;
                    if (exoPlayer != null) {
                        exoPlayer = this.c;
                        long l2 = 0L;
                        exoPlayer.seekTo(l2);
                        exoPlayer.setPlayWhenReady(false);
                        object = ((vl1_0)object).a;
                        if (object != null) {
                            ((PlayerView)((Object)object)).showController();
                        }
                    }
                }
            } else {
                Function0 function0 = this.d;
                function0.invoke();
            }
        } else {
            Function0 function0 = this.a;
            function0.invoke();
        }
    }

    public final void F(int n3, MediaItem mediaItem) {
    }

    public final void H(boolean bl2) {
    }

    public final void K(androidx.media3.common.e e2) {
        Intrinsics.checkNotNullParameter(e2, "mediaMetadata");
    }

    public final void M() {
    }

    public final void P(int n3, int n4) {
    }

    public final void Q(f$a f$a) {
        Intrinsics.checkNotNullParameter(f$a, "availableCommands");
    }

    public final void T(int n3, f$d f$d, f$d f$d2) {
        Intrinsics.checkNotNullParameter(f$d, "oldPosition");
        Intrinsics.checkNotNullParameter(f$d2, "newPosition");
    }

    public final void U(dr_1 dr_12) {
        Intrinsics.checkNotNullParameter(dr_12, "audioAttributes");
    }

    public final void V(Fp3 fp3) {
        Intrinsics.checkNotNullParameter(fp3, "parameters");
    }

    public final void W(boolean bl2) {
    }

    public final void Y(f f5, f$b f$b) {
        Intrinsics.checkNotNullParameter(f5, "player");
        Intrinsics.checkNotNullParameter(f$b, "events");
    }

    public final void Z(int n3, boolean bl2) {
    }

    public final void a(wc3_0 wc3_02) {
        Intrinsics.checkNotNullParameter(wc3_02, "videoSize");
    }

    public final void a0(float f5) {
    }

    public final void c0(g g3, int n3) {
        Intrinsics.checkNotNullParameter(g3, "timeline");
    }

    public final void e0(bq3 bq32) {
        Intrinsics.checkNotNullParameter(bq32, "tracks");
    }

    public final void g0(androidx.media3.common.e e2) {
        Intrinsics.checkNotNullParameter(e2, "mediaMetadata");
    }

    public final /* synthetic */ void h0(int n3, boolean bl2) {
    }

    public final void j(boolean bl2) {
    }

    public final void j0(ot2_0 ot2_02) {
        Intrinsics.checkNotNullParameter(ot2_02, "playbackParameters");
    }

    public final void k0(PlaybackException playbackException) {
    }

    public final void l(List list) {
        Intrinsics.checkNotNullParameter(list, "cues");
    }

    public final void o0(boolean bl2) {
    }

    public final void onRepeatModeChanged(int n3) {
    }

    public final void p(PlaybackException playbackException) {
        Intrinsics.checkNotNullParameter(playbackException, "error");
    }

    public final void t(Ue0 ue0) {
        Intrinsics.checkNotNullParameter(ue0, "cueGroup");
    }

    public final void w(Metadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
    }
}

