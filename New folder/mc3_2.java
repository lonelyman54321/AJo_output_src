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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mC3
 */
public final class mc3_2
implements f$c {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ f b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ tr1_0 e;
    public final /* synthetic */ tr1_0 f;

    public mc3_2(Boolean bl2, ExoPlayer exoPlayer, tr1_0 tr1_02, tr1_0 tr1_03, tr1_0 tr1_04, tr1_0 tr1_05) {
        this.a = bl2;
        this.b = exoPlayer;
        this.c = tr1_02;
        this.d = tr1_03;
        this.e = tr1_04;
        this.f = tr1_05;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final void D(int n3) {
        Boolean bl2 = (Boolean)this.c.getValue();
        int n4 = bl2.booleanValue();
        if (n4 != 0) {
            n4 = 3;
            Boolean bl3 = this.a;
            tr1_0 tr1_02 = this.f;
            f f5 = this.b;
            if (n3 != n4) {
                n4 = 4;
                if (n3 == n4) {
                    Boolean bl4 = Boolean.TRUE;
                    n4 = (int)(Intrinsics.areEqual(bl3, bl4) ? 1 : 0);
                    if (n4 != 0) {
                        long l2 = 0L;
                        f5.seekTo(l2);
                    } else {
                        tr1_02.setValue(bl4);
                    }
                }
            } else {
                Boolean bl5 = Boolean.TRUE;
                n4 = (int)(Intrinsics.areEqual(bl3, bl5) ? 1 : 0);
                int n7 = 1;
                if (n4 != 0) {
                    f5.setPlayWhenReady(n7 != 0);
                } else {
                    this.d.setValue(bl5);
                    bl5 = (Boolean)this.e.getValue();
                    bl2 = Boolean.FALSE;
                    n3 = Intrinsics.areEqual(bl5, bl2) ^ n7;
                    f5.setPlayWhenReady(n3 != 0);
                }
                bl5 = (Boolean)tr1_02.getValue();
                n3 = (int)(bl5.booleanValue() ? 1 : 0);
                if (n3 != 0) {
                    f5.setPlayWhenReady(n7 != 0);
                    bl5 = Boolean.FALSE;
                    tr1_02.setValue(bl5);
                }
            }
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

