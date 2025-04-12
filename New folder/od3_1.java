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
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g;
import androidx.media3.exoplayer.e;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Od3
 */
public final class od3_1
implements f$c {
    public final /* synthetic */ ld3_1 a;

    public od3_1(ld3_1 ld3_12) {
        this.a = ld3_12;
    }

    public final /* synthetic */ void A(int n3) {
    }

    public final /* synthetic */ void C(int n3) {
    }

    public final /* synthetic */ void D(int n3) {
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
        ld3_1 ld3_12 = this.a;
        if (bl2) {
            Object object = ld3_12.A;
            if (object != null) {
                gp0_1.c((View)object);
            }
            System.currentTimeMillis();
            ld3_12.getClass();
            object = ld3_12.m;
            if (object != null) {
                boolean bl3 = false;
                Object var5_7 = null;
                ((e)object).setPlayWhenReady(false);
            }
            if ((object = ld3_12.z) != null) {
                ((StoriesProgressView)((Object)object)).c();
            }
        } else {
            Object object = ld3_12.A;
            if (object != null) {
                gp0_1.a((View)object);
            }
            if ((object = ld3_12.z) != null) {
                int n3 = ld3_12.o;
                object = ((StoriesProgressView)((Object)object)).a;
                if ((object = (PausableProgressBar)((Object)CollectionsKt.N(n3, (List)object))) != null) {
                    e e2 = ld3_12.m;
                    long l2 = e2 != null ? e2.getDuration() : 8000L;
                    ((PausableProgressBar)((Object)object)).setDuration(l2);
                }
            }
            ld3_12.q = bl2 = true;
            ld3_12.Va();
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
            AppCompatImageView appCompatImageView = ((ld3_1)object).x;
            if (appCompatImageView != null) {
                ai0_2.a((View)appCompatImageView);
            }
            appCompatImageView = ((ld3_1)object).O;
            object = ((ld3_1)object).P;
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
        Object object2 = ((ld3_1)object).A;
        if (object2 != null) {
            gp0_1.a((View)object2);
        }
        if ((object2 = ((ld3_1)object).Ra()) != null) {
            int n3 = object2.size();
            int n4 = ((ld3_1)object).o;
            if (n4 == (n3 += -1)) {
                object = ((ld3_1)object).n;
                if (object == null) return;
                object.R();
                return;
            }
        }
        if ((object = ((ld3_1)object).z) == null) return;
        ((StoriesProgressView)((Object)object)).f();
    }

    public final /* synthetic */ void t(Ue0 ue0) {
    }

    public final /* synthetic */ void w(Metadata metadata) {
    }
}

