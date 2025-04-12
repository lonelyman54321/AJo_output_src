/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package androidx.media3.ui;

import android.view.View;
import android.widget.TextView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.c;
import androidx.media3.common.e;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import androidx.media3.common.g$c;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.b$a;
import java.util.Formatter;
import java.util.List;

public final class LegacyPlayerControlView$a
implements f$c,
b$a,
View.OnClickListener {
    public final /* synthetic */ LegacyPlayerControlView a;

    public LegacyPlayerControlView$a(LegacyPlayerControlView legacyPlayerControlView) {
        this.a = legacyPlayerControlView;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final /* synthetic */ void D(int n3) {
    }

    public final void E(long l2) {
        boolean bl2 = true;
        Object object = this.a;
        object.L = bl2;
        TextView textView = object.m;
        if (textView != null) {
            StringBuilder stringBuilder = object.o;
            object = object.p;
            String string2 = gz3.u(stringBuilder, (Formatter)object, l2);
            textView.setText((CharSequence)string2);
        }
    }

    public final /* synthetic */ void F(int n3, MediaItem mediaItem) {
    }

    public final /* synthetic */ void H(boolean bl2) {
    }

    public final void I(long l2) {
        Object object = this.a;
        TextView textView = object.m;
        if (textView != null) {
            StringBuilder stringBuilder = object.o;
            object = object.p;
            String string2 = gz3.u(stringBuilder, (Formatter)object, l2);
            textView.setText((CharSequence)string2);
        }
    }

    public final void J(long l2, boolean bl2) {
        f f5;
        LegacyPlayerControlView legacyPlayerControlView = this.a;
        int n3 = 0;
        legacyPlayerControlView.L = false;
        if (!bl2 && (f5 = legacyPlayerControlView.G) != null) {
            block4: {
                g g3 = f5.getCurrentTimeline();
                int n4 = legacyPlayerControlView.K;
                if (n4 != 0 && (n4 = g3.q()) == 0) {
                    n4 = g3.p();
                    while (true) {
                        g$c g$c = legacyPlayerControlView.r;
                        g$c g$c2 = g3.n(n3, g$c, 0L);
                        long l3 = gz3.T(g$c2.m);
                        long l4 = l2 - l3;
                        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object < 0) break block4;
                        object = n4 + -1;
                        if (n3 == object) {
                            l2 = l3;
                            break block4;
                        }
                        l2 -= l3;
                        ++n3;
                    }
                }
                n3 = f5.getCurrentMediaItemIndex();
            }
            f5.seekTo(n3, l2);
            legacyPlayerControlView.g();
        }
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

    public final void Y(f object, f$b f$b) {
        int n3 = 4;
        int n4 = 5;
        int[] nArray = new int[]{n3, n4};
        int n7 = f$b.a(nArray);
        LegacyPlayerControlView legacyPlayerControlView = this.a;
        if (n7 != 0) {
            n7 = LegacyPlayerControlView.u0;
            legacyPlayerControlView.f();
        }
        n7 = 7;
        object = new int[]{n3, n4, n7};
        if ((n3 = (int)(f$b.a((int[])object) ? 1 : 0)) != 0) {
            n3 = LegacyPlayerControlView.u0;
            legacyPlayerControlView.g();
        }
        object = f$b.a;
        Object object2 = ((c)object).a;
        n7 = 8;
        n4 = (int)(object2.get(n7) ? 1 : 0);
        if (n4 != 0) {
            n4 = LegacyPlayerControlView.u0;
            legacyPlayerControlView.h();
        }
        if ((n3 = (int)((object = ((c)object).a).get(n4 = 9) ? 1 : 0)) != 0) {
            n3 = LegacyPlayerControlView.u0;
            legacyPlayerControlView.i();
        }
        n3 = 11;
        int n8 = 13;
        object2 = new int[]{n7, n4, n3, 0, n8};
        if ((n4 = (int)(f$b.a((int[])object2) ? 1 : 0)) != 0) {
            n4 = LegacyPlayerControlView.u0;
            legacyPlayerControlView.e();
        }
        if ((n3 = (int)(f$b.a((int[])(object = (Object)new int[]{n3, 0})) ? 1 : 0)) != 0) {
            n3 = LegacyPlayerControlView.u0;
            legacyPlayerControlView.j();
        }
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

    public final void onClick(View view) {
        LegacyPlayerControlView legacyPlayerControlView = this.a;
        f f5 = legacyPlayerControlView.G;
        if (f5 == null) {
            return;
        }
        View view2 = legacyPlayerControlView.d;
        if (view2 == view) {
            f5.seekToNext();
        } else {
            view2 = legacyPlayerControlView.c;
            if (view2 == view) {
                f5.seekToPrevious();
            } else {
                view2 = legacyPlayerControlView.g;
                if (view2 == view) {
                    int n3;
                    int n4 = f5.getPlaybackState();
                    if (n4 != (n3 = 4)) {
                        f5.seekForward();
                    }
                } else {
                    view2 = legacyPlayerControlView.h;
                    if (view2 == view) {
                        f5.seekBack();
                    } else {
                        view2 = legacyPlayerControlView.e;
                        if (view2 == view) {
                            gz3.A(f5);
                        } else {
                            view2 = legacyPlayerControlView.f;
                            if (view2 == view) {
                                gz3.z(f5);
                            } else {
                                view2 = legacyPlayerControlView.i;
                                if (view2 == view) {
                                    int n7 = f5.getRepeatMode();
                                    int n8 = legacyPlayerControlView.O;
                                    n7 = yj2_0.a(n7, n8);
                                    f5.setRepeatMode(n7);
                                } else {
                                    legacyPlayerControlView = legacyPlayerControlView.j;
                                    if (legacyPlayerControlView == view) {
                                        boolean bl2 = f5.getShuffleModeEnabled() ^ true;
                                        f5.setShuffleModeEnabled(bl2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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

