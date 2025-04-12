/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.e;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

public final class cC3$b
implements f$c {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ ExoPlayer b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ tr1_0 d;

    public cC3$b(ft1_2 ft1_22, ExoPlayer exoPlayer, tr1_0 tr1_02, tr1_0 tr1_03) {
        this.a = ft1_22;
        this.b = exoPlayer;
        this.c = tr1_02;
        this.d = tr1_03;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final void D(int n3) {
        boolean bl2;
        Object object = (Boolean)this.c.getValue();
        boolean n4 = (Boolean)object;
        ExoPlayer exoPlayer = this.b;
        if (n4 && !(bl2 = ((xm0_0)(object = this.a.i)).b())) {
            int n7 = 3;
            if (n3 != n7) {
                int n8 = 4;
                if (n3 == n8) {
                    long l2 = 0L;
                    exoPlayer.seekTo(l2);
                }
            } else {
                Boolean bl3 = (Boolean)this.d.getValue();
                n3 = (int)(bl3.booleanValue() ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1;
                    exoPlayer.setPlayWhenReady(n3 != 0);
                }
            }
        } else {
            exoPlayer.pause();
            n3 = 0;
            Object var7_10 = null;
            exoPlayer.setPlayWhenReady(false);
        }
    }

    public final /* synthetic */ void F(int n3, MediaItem mediaItem) {
    }

    public final /* synthetic */ void H(boolean bl2) {
    }

    public final /* synthetic */ void K(e e2) {
    }

    public final /* synthetic */ void M() {
    }

    public final /* synthetic */ void P(int n3, int n4) {
    }

    public final /* synthetic */ void Q(f$a f$a) {
    }

    public final /* synthetic */ void T(int n3, f$d f$d, f$d f$d2) {
    }

    public final /* synthetic */ void U(dr_1 dr_12) {
    }

    public final /* synthetic */ void V(Fp3 fp3) {
    }

    public final /* synthetic */ void W(boolean bl2) {
    }

    public final /* synthetic */ void Y(f f5, f$b f$b) {
    }

    public final /* synthetic */ void Z(int n3, boolean bl2) {
    }

    public final /* synthetic */ void a(wc3_0 wc3_02) {
    }

    public final /* synthetic */ void a0(float f5) {
    }

    public final /* synthetic */ void c0(g g3, int n3) {
    }

    public final /* synthetic */ void e0(bq3 bq32) {
    }

    public final /* synthetic */ void g0(e e2) {
    }

    public final /* synthetic */ void h0(int n3, boolean bl2) {
    }

    public final /* synthetic */ void j(boolean bl2) {
    }

    public final /* synthetic */ void j0(ot2_0 ot2_02) {
    }

    public final /* synthetic */ void k0(PlaybackException playbackException) {
    }

    public final /* synthetic */ void l(List list) {
    }

    public final /* synthetic */ void o0(boolean bl2) {
    }

    public final /* synthetic */ void onRepeatModeChanged(int n3) {
    }

    public final /* synthetic */ void p(PlaybackException playbackException) {
    }

    public final /* synthetic */ void t(Ue0 ue0) {
    }

    public final /* synthetic */ void w(Metadata metadata) {
    }
}

