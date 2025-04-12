/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 */
package androidx.media3.ui;

import android.os.Handler;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
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
import androidx.media3.common.g$b;
import androidx.media3.ui.PlayerControlView$c;
import androidx.media3.ui.PlayerControlView$l;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.PlayerView$b;
import androidx.media3.ui.PlayerView$d;
import androidx.media3.ui.SubtitleView;
import java.util.AbstractCollection;
import java.util.List;

public final class PlayerView$a
implements f$c,
View.OnClickListener,
PlayerControlView$l,
PlayerControlView$c {
    public final g$b a;
    public Object b;
    public final /* synthetic */ PlayerView c;

    public PlayerView$a(PlayerView object) {
        this.c = object;
        this.a = object;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final void D(int n3) {
        PlayerView playerView = this.c;
        PlayerView.access$1300(playerView);
        PlayerView.access$1400(playerView);
        PlayerView.access$1500(playerView);
    }

    public final void E(int n3) {
        Object object = this.c;
        PlayerView.access$1900((PlayerView)((Object)object));
        PlayerView$b playerView$b = PlayerView.access$2000((PlayerView)((Object)object));
        if (playerView$b != null) {
            object = PlayerView.access$2000((PlayerView)((Object)object));
            object.a();
        }
    }

    public final /* synthetic */ void F(int n3, MediaItem mediaItem) {
    }

    public final /* synthetic */ void H(boolean bl2) {
    }

    public final /* synthetic */ void K(e e2) {
    }

    public final void M() {
        PlayerView playerView = this.c;
        View view = PlayerView.access$800(playerView);
        if (view != null) {
            view = PlayerView.access$800(playerView);
            int n3 = 4;
            view.setVisibility(n3);
            boolean bl2 = PlayerView.access$900(playerView);
            if (bl2) {
                PlayerView.access$1000(playerView);
            } else {
                PlayerView.access$1100(playerView);
            }
        }
    }

    public final void P(int n3, int n4) {
        Object object;
        Object object2;
        n3 = gz3.a;
        n4 = 34;
        if (n3 == n4 && (n4 = (object2 = PlayerView.access$400(object = this.c)) instanceof SurfaceView) != 0 && (n4 = (int)(PlayerView.access$500(object) ? 1 : 0)) != 0) {
            object2 = PlayerView.access$700(object);
            object2.getClass();
            Handler handler = PlayerView.access$600(object);
            SurfaceView surfaceView = (SurfaceView)PlayerView.access$400(object);
            int n7 = 1;
            gw1_2 gw1_22 = new gw1_2(object, n7);
            object = new xu2((PlayerView$d)object2, surfaceView, gw1_22);
            handler.post((Runnable)object);
        }
    }

    public final /* synthetic */ void Q(f$a f$a) {
    }

    public final void T(int n3, f$d f$d, f$d f$d2) {
        PlayerView playerView = this.c;
        boolean bl2 = PlayerView.access$1600(playerView);
        if (bl2 && (bl2 = PlayerView.access$1700(playerView))) {
            playerView.hideController();
        }
    }

    public final /* synthetic */ void U(dr_1 dr_12) {
    }

    public final /* synthetic */ void V(Fp3 fp3) {
    }

    public final /* synthetic */ void W(boolean bl2) {
    }

    public final /* synthetic */ void Y(f f5, f$b f$b) {
    }

    public final void Z(int n3, boolean bl2) {
        PlayerView playerView = this.c;
        PlayerView.access$1300(playerView);
        PlayerView.access$1500(playerView);
    }

    public final void a(wc3_0 object) {
        int n3;
        int n4;
        Object object2 = wc3_0.d;
        boolean bl2 = object.equals(object2);
        if (!bl2 && (object2 = PlayerView.access$200((PlayerView)((Object)(object = this.c)))) != null && (n4 = (object2 = PlayerView.access$200((PlayerView)((Object)object))).getPlaybackState()) != (n3 = 1)) {
            PlayerView.access$300((PlayerView)((Object)object));
        }
    }

    public final /* synthetic */ void a0(float f5) {
    }

    public final /* synthetic */ void c0(g g3, int n3) {
    }

    public final void e0(bq3 object) {
        object = this.c;
        Object object2 = PlayerView.access$200((PlayerView)((Object)object));
        object2.getClass();
        int n3 = object2.isCommandAvailable(17);
        Object object3 = n3 != 0 ? object2.getCurrentTimeline() : g.a;
        boolean n4 = ((g)object3).q();
        if (n4) {
            this.b = null;
        } else {
            Object object4;
            boolean bl2;
            boolean bl3 = object2.isCommandAvailable(30);
            g$b g$b = this.a;
            if (bl3 && !(bl2 = ((AbstractCollection)(object4 = object2.getCurrentTracks().a)).isEmpty())) {
                int n7 = object2.getCurrentPeriodIndex();
                boolean bl4 = true;
                this.b = object2 = ((g)object3).g((int)n7, (g$b)g$b, (boolean)bl4).b;
            } else {
                object4 = this.b;
                if (object4 != null) {
                    int n8;
                    int n10 = ((g)object3).b(object4);
                    if (n10 != (n8 = -1)) {
                        object3 = ((g)object3).g(n10, g$b, false);
                        n3 = ((g$b)object3).c;
                        int n14 = object2.getCurrentMediaItemIndex();
                        if (n14 == n3) {
                            return;
                        }
                    }
                    this.b = null;
                }
            }
        }
        PlayerView.access$1200((PlayerView)((Object)object), false);
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

    public final void onClick(View view) {
        PlayerView.access$1800(this.c);
    }

    public final /* synthetic */ void onRepeatModeChanged(int n3) {
    }

    public final /* synthetic */ void p(PlaybackException playbackException) {
    }

    public final void t(Ue0 object) {
        FrameLayout frameLayout = this.c;
        SubtitleView subtitleView = PlayerView.access$100((PlayerView)frameLayout);
        if (subtitleView != null) {
            frameLayout = PlayerView.access$100((PlayerView)frameLayout);
            object = ((Ue0)object).a;
            frameLayout.setCues((List)object);
        }
    }

    public final /* synthetic */ void w(Metadata metadata) {
    }
}

