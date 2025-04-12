/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import androidx.media3.exoplayer.e;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rJ0
 */
public final class rj0_0
implements f$c {
    public final /* synthetic */ pj0_2 a;

    public rj0_0(pj0_2 pj0_22) {
        this.a = pj0_22;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final void D(int n3) {
        int n4 = 3;
        pj0_2 pj0_22 = this.a;
        if (n3 == n4) {
            pj0_2.Oa(pj0_22);
        }
        if (n3 == (n4 = 4)) {
            Object object = pj0_22.l;
            if (object != null && (object = (Subcomponent)CollectionsKt.N(n4 = pj0_22.p, (List)object)) != null) {
                object = ((Subcomponent)object).getPostMedia();
            } else {
                n3 = 0;
                object = null;
            }
            n3 = (int)(ov3.x((List)object) ? 1 : 0);
            if (n3 != 0) {
                Boolean bl2;
                object = h40_0.a;
                object = h40_0.y().isPlayInLoop();
                n3 = (int)(Intrinsics.areEqual(object, bl2 = Boolean.TRUE) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(km_1.b((cp$a)(object = cp_1.Companion)) ? 1 : 0)) == 0) {
                    object = pj0_22.n;
                    if (object != null) {
                        n4 = 5;
                        long l2 = 0L;
                        ((b)object).c(n4, l2);
                    }
                    if ((object = pj0_22.n) != null) {
                        n4 = 1;
                        ((e)object).setPlayWhenReady(n4 != 0);
                    }
                } else {
                    object = pj0_22.w;
                    if (object != null) {
                        ai0_2.B((View)object);
                    }
                    if ((n3 = (int)(((ArrayList)(object = pj0_22.Pa())).isEmpty() ? 1 : 0)) != 0) {
                        object = pj0_22.w;
                        if (object != null) {
                            ai0_2.a((View)object);
                        }
                    } else {
                        object = pj0_22.t;
                        if (object != null) {
                            n4 = 0;
                            bl2 = null;
                            if ((object = object.getChildAt(0)) != null) {
                                ai0_2.a((View)object);
                            }
                        }
                    }
                }
            }
        }
    }

    public final /* synthetic */ void F(int n3, MediaItem mediaItem) {
    }

    public final /* synthetic */ void H(boolean bl2) {
    }

    public final /* synthetic */ void K(androidx.media3.common.e e2) {
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

    public final void W(boolean bl2) {
        pj0_2 pj0_22 = this.a;
        if (bl2) {
            Object object = pj0_22.E;
            if (object != null) {
                gp0_1.c((View)object);
            }
            System.currentTimeMillis();
            pj0_22.getClass();
            object = pj0_22.n;
            if (object != null) {
                boolean bl3 = false;
                Object var5_7 = null;
                ((e)object).setPlayWhenReady(false);
            }
            if ((object = pj0_22.D) != null) {
                ((StoriesProgressView)((Object)object)).c();
            }
        } else {
            Object object = pj0_22.D;
            if (object != null) {
                int n3 = pj0_22.p;
                object = object.a;
                if ((object = (PausableProgressBar)((Object)CollectionsKt.N(n3, (List)object))) != null) {
                    e e2 = pj0_22.n;
                    long l2 = e2 != null ? e2.getDuration() : 8000L;
                    ((PausableProgressBar)((Object)object)).setDuration(l2);
                }
            }
            pj0_22.s = true;
            bl2 = pj0_22.q;
            if (bl2) {
                pj0_22.Wa();
                object = pj0_22.D;
                if (object != null) {
                    object.d();
                }
            }
        }
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

    public final /* synthetic */ void g0(androidx.media3.common.e e2) {
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

    public final void o0(boolean bl2) {
        if (bl2) {
            Object object = this.a;
            AppCompatImageView appCompatImageView = ((pj0_2)object).A;
            if (appCompatImageView != null) {
                ai0_2.a((View)appCompatImageView);
            }
            appCompatImageView = ((pj0_2)object).P;
            object = ((pj0_2)object).Q;
            long l2 = 1000L;
            appCompatImageView.postDelayed((Runnable)object, l2);
        }
    }

    public final /* synthetic */ void onRepeatModeChanged(int n3) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void p(PlaybackException object) {
        Intrinsics.checkNotNullParameter(object, "error");
        object = this.a;
        Object object2 = ((pj0_2)object).E;
        if (object2 != null) {
            gp0_1.a((View)object2);
        }
        if ((object2 = ((pj0_2)object).l) != null) {
            int n3 = ((p83_0)object2).size();
            int n4 = ((pj0_2)object).p;
            if (n4 == (n3 += -1)) {
                object = ((pj0_2)object).o;
                if (object == null) return;
                object.R();
                return;
            }
        }
        if ((object = ((pj0_2)object).D) == null) return;
        ((StoriesProgressView)((Object)object)).f();
    }

    public final /* synthetic */ void t(Ue0 ue0) {
    }

    public final /* synthetic */ void w(Metadata metadata) {
    }
}

