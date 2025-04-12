/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 */
package androidx.media3.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
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
import androidx.media3.common.g$c;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.b$a;
import androidx.recyclerview.widget.RecyclerView$f;
import java.util.Formatter;
import java.util.List;

public final class PlayerControlView$b
implements f$c,
b$a,
View.OnClickListener,
PopupWindow.OnDismissListener {
    public final /* synthetic */ PlayerControlView a;

    public PlayerControlView$b(PlayerControlView playerControlView) {
        this.a = playerControlView;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final /* synthetic */ void D(int n3) {
    }

    public final void E(long l2) {
        boolean bl2 = true;
        PlayerControlView playerControlView = this.a;
        playerControlView.G0 = bl2;
        TextView textView = playerControlView.D;
        if (textView != null) {
            StringBuilder stringBuilder = playerControlView.F;
            Formatter formatter = playerControlView.G;
            String string2 = gz3.u(stringBuilder, formatter, l2);
            textView.setText((CharSequence)string2);
        }
        playerControlView.a.f();
    }

    public final /* synthetic */ void F(int n3, MediaItem mediaItem) {
    }

    public final /* synthetic */ void H(boolean bl2) {
    }

    public final void I(long l2) {
        Object object = this.a;
        TextView textView = object.D;
        if (textView != null) {
            StringBuilder stringBuilder = object.F;
            object = object.G;
            String string2 = gz3.u(stringBuilder, (Formatter)object, l2);
            textView.setText((CharSequence)string2);
        }
    }

    public final void J(long l2, boolean bl2) {
        PlayerControlView playerControlView;
        block4: {
            block3: {
                f f5;
                int n3;
                block5: {
                    playerControlView = this.a;
                    n3 = 0;
                    playerControlView.G0 = false;
                    if (bl2 || (f5 = playerControlView.z0) == null) break block4;
                    boolean bl3 = playerControlView.F0;
                    if (!bl3) break block5;
                    bl3 = f5.isCommandAvailable(17);
                    if (!bl3 || !(bl3 = f5.isCommandAvailable(10))) break block3;
                    g g3 = f5.getCurrentTimeline();
                    int n4 = g3.p();
                    while (true) {
                        long l3;
                        block7: {
                            block6: {
                                g$c g$c = playerControlView.I;
                                g$c g$c2 = g3.n(n3, g$c, 0L);
                                l3 = gz3.T(g$c2.m);
                                long l4 = l2 - l3;
                                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                if (object < 0) break block6;
                                object = n4 + -1;
                                if (n3 != object) break block7;
                                l2 = l3;
                            }
                            f5.seekTo(n3, l2);
                            break block3;
                        }
                        l2 -= l3;
                        ++n3;
                    }
                }
                n3 = f5.isCommandAvailable(5);
                if (n3 != 0) {
                    f5.seekTo(l2);
                }
            }
            playerControlView.o();
        }
        playerControlView.a.g();
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
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3;
        int n3 = 11;
        int n4 = 9;
        int n7 = 8;
        int n8 = 7;
        int n10 = 4;
        int n14 = 5;
        int n15 = 13;
        Object[] objectArray4 = new int[]{n10, n14, n15};
        boolean bl2 = f$b.a((int[])objectArray4);
        PlayerControlView playerControlView = this.a;
        if (bl2) {
            objectArray4 = PlayerControlView.Q0;
            playerControlView.m();
        }
        if ((n10 = (int)(f$b.a((int[])(objectArray3 = new int[]{n10, n14, n8, n15})) ? 1 : 0)) != 0) {
            objectArray3 = PlayerControlView.Q0;
            playerControlView.o();
        }
        if ((n7 = (int)(f$b.a((int[])(objectArray2 = new int[]{n7, n15})) ? 1 : 0)) != 0) {
            objectArray2 = PlayerControlView.Q0;
            playerControlView.p();
        }
        if ((n4 = (int)(f$b.a((int[])(objectArray = new int[]{n4, n15})) ? 1 : 0)) != 0) {
            objectArray = PlayerControlView.Q0;
            playerControlView.r();
        }
        Object[] objectArray5 = objectArray = new int[n8];
        Object[] objectArray6 = objectArray;
        objectArray5[0] = 8;
        objectArray6[1] = 9;
        objectArray5[2] = 11;
        objectArray6[3] = 0;
        objectArray5[4] = 16;
        objectArray6[5] = 17;
        objectArray6[6] = 13;
        n4 = (int)(f$b.a((int[])objectArray) ? 1 : 0);
        if (n4 != 0) {
            objectArray = PlayerControlView.Q0;
            playerControlView.l();
        }
        if ((n3 = (int)(f$b.a((int[])(object = (Object)new int[]{n3, 0, n15})) ? 1 : 0)) != 0) {
            object = PlayerControlView.Q0;
            playerControlView.s();
        }
        if ((n3 = (int)(f$b.a((int[])(object = (Object)new int[]{12, n15})) ? 1 : 0)) != 0) {
            object = PlayerControlView.Q0;
            playerControlView.n();
        }
        if ((n3 = (int)(f$b.a((int[])(object = (Object)new int[]{2, n15})) ? 1 : 0)) != 0) {
            object = PlayerControlView.Q0;
            playerControlView.t();
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

    public final void onClick(View object) {
        PlayerControlView playerControlView = this.a;
        f f5 = playerControlView.z0;
        if (f5 == null) {
            return;
        }
        mu2 mu22 = playerControlView.a;
        mu22.g();
        ImageView imageView = playerControlView.n;
        if (imageView == object) {
            boolean bl2 = f5.isCommandAvailable(9);
            if (bl2) {
                f5.seekToNext();
            }
        } else {
            imageView = playerControlView.m;
            if (imageView == object) {
                boolean bl3 = f5.isCommandAvailable(7);
                if (bl3) {
                    f5.seekToPrevious();
                }
            } else {
                imageView = playerControlView.p;
                if (imageView == object) {
                    int n3;
                    int n4 = f5.getPlaybackState();
                    if (n4 != (n3 = 4) && (n4 = (int)(f5.isCommandAvailable(12) ? 1 : 0)) != 0) {
                        f5.seekForward();
                    }
                } else {
                    imageView = playerControlView.q;
                    if (imageView == object) {
                        boolean bl4 = f5.isCommandAvailable(11);
                        if (bl4) {
                            f5.seekBack();
                        }
                    } else {
                        imageView = playerControlView.o;
                        if (imageView == object) {
                            boolean bl5 = playerControlView.E0;
                            if (bl5 = gz3.Q(f5, bl5)) {
                                gz3.A(f5);
                            } else {
                                gz3.z(f5);
                            }
                        } else {
                            imageView = playerControlView.t;
                            if (imageView == object) {
                                int n7 = f5.isCommandAvailable(15);
                                if (n7 != 0) {
                                    n7 = f5.getRepeatMode();
                                    int n8 = playerControlView.J0;
                                    n7 = yj2_0.a(n7, n8);
                                    f5.setRepeatMode(n7);
                                }
                            } else {
                                imageView = playerControlView.u;
                                if (imageView == object) {
                                    boolean bl6 = f5.isCommandAvailable(14);
                                    if (bl6) {
                                        bl6 = f5.getShuffleModeEnabled() ^ true;
                                        f5.setShuffleModeEnabled(bl6);
                                    }
                                } else {
                                    f5 = playerControlView.z;
                                    if (f5 == object) {
                                        mu22.f();
                                        object = playerControlView.f;
                                        playerControlView.d((RecyclerView$f)object, (View)f5);
                                    } else {
                                        f5 = playerControlView.A;
                                        if (f5 == object) {
                                            mu22.f();
                                            object = playerControlView.g;
                                            playerControlView.d((RecyclerView$f)object, (View)f5);
                                        } else {
                                            f5 = playerControlView.B;
                                            if (f5 == object) {
                                                mu22.f();
                                                object = playerControlView.i;
                                                playerControlView.d((RecyclerView$f)object, (View)f5);
                                            } else {
                                                f5 = playerControlView.w;
                                                if (f5 == object) {
                                                    mu22.f();
                                                    object = playerControlView.h;
                                                    playerControlView.d((RecyclerView$f)object, (View)f5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onDismiss() {
        Object object = this.a;
        boolean bl2 = ((PlayerControlView)((Object)object)).P0;
        if (bl2) {
            object = ((PlayerControlView)((Object)object)).a;
            ((mu2)object).g();
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

