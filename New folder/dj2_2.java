/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.media3.common.b;
import androidx.media3.exoplayer.e;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.services.data.Product.KYPImage;
import com.ril.ajio.services.data.Product.KYPMedia;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dj2
 */
public final class dj2_2
extends Fragment
implements pb_2,
View.OnClickListener {
    public static final Dj2$a Companion;
    public boolean a;
    public PlayerView b;
    public ImageView c;
    public ImageView d;
    public ImageView e;
    public ImageView f;
    public ImageView g;
    public TextView h;
    public ImageView i;
    public ProgressBar j;
    public ob_2 k;
    public String l;
    public String m;
    public int n;
    public long o;
    public boolean p;
    public sb3_2 q;
    public KYPMedia r;
    public long s;
    public long t;
    public long u;
    public final Handler v;
    public final by0_0 w;
    public final Handler x;
    public final zj2_1 y;
    public boolean z;

    static {
        Dj2$a dj2$a;
        Companion = dj2$a = new Object();
    }

    public dj2_2() {
        Object object = "";
        this.l = object;
        this.m = object;
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.v = object;
        this.w = object = new by0_0(this, 1);
        looper = Looper.getMainLooper();
        object = new Handler(looper);
        this.x = object;
        this.y = object = new zj2_1(this);
    }

    public final void Ca(boolean object) {
        Handler handler = this.v;
        by0_0 by0_02 = this.w;
        Object object2 = "imgPause";
        String string2 = "imgReplay";
        String string3 = "progress";
        String string4 = "imgPlay";
        Object object3 = null;
        if (object) {
            TimeUnit timeUnit;
            long l2 = this.s;
            long l3 = 0L;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (!object) {
                timeUnit = TimeUnit.MILLISECONDS;
                l2 = System.currentTimeMillis();
                l3 = this.t;
                l2 -= l3;
                this.s = l2 = timeUnit.toSeconds(l2);
            }
            if ((timeUnit = this.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                object = false;
                timeUnit = null;
            }
            ai0_2.i((View)timeUnit);
            timeUnit = this.c;
            String string5 = "imgVolume";
            if (timeUnit == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                object = false;
                timeUnit = null;
            }
            ai0_2.B((View)timeUnit);
            timeUnit = this.c;
            if (timeUnit == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                object = false;
                timeUnit = null;
            }
            ai0_2.a((View)timeUnit);
            timeUnit = this.j;
            if (timeUnit == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object = false;
                timeUnit = null;
            }
            ai0_2.i((View)timeUnit);
            timeUnit = this.e;
            if (timeUnit == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = false;
                timeUnit = null;
            }
            ai0_2.i((View)timeUnit);
            timeUnit = this.g;
            if (timeUnit == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object = false;
                timeUnit = null;
            }
            ai0_2.B((View)timeUnit);
            timeUnit = this.f;
            if (timeUnit == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
            } else {
                object3 = timeUnit;
            }
            ai0_2.i((View)object3);
            handler.removeCallbacks((Runnable)by0_02);
            timeUnit = this.x;
            object2 = this.y;
            long l7 = 1000L;
            timeUnit.postDelayed((Runnable)object2, l7);
            long l8 = 3000L;
            handler.postDelayed((Runnable)by0_02, l8);
        } else {
            ImageView imageView = this.e;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = false;
                imageView = null;
            }
            if (object = imageView.getVisibility()) {
                imageView = this.j;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    object = false;
                    imageView = null;
                }
                if (object = imageView.getVisibility()) {
                    imageView = this.g;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        object = false;
                        imageView = null;
                    }
                    ai0_2.i((View)imageView);
                    imageView = this.f;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        object = false;
                        imageView = null;
                    }
                    ai0_2.B((View)imageView);
                    imageView = this.f;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                    } else {
                        object3 = imageView;
                    }
                    ai0_2.a((View)object3);
                }
            }
            handler.removeCallbacks((Runnable)by0_02);
        }
    }

    public final void F5() {
        Object object = this.k;
        ob_2 ob_22 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
            object = null;
        }
        ((ob_2)object).k();
        object = this.c;
        String string2 = "imgVolume";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ai0_2.B((View)object);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ai0_2.a((View)object);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.j;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            ob_22 = object;
        }
        ai0_2.i((View)ob_22);
    }

    public final void M0() {
        Object object = this.j;
        ProgressBar progressBar = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.f;
        String string2 = "imgPlay";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ai0_2.B((View)object);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ai0_2.a((View)object);
        object = this.i;
        if (object == null) {
            object = "imgThumbnail";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            progressBar = object;
        }
        ai0_2.B((View)progressBar);
    }

    public final void Oa() {
        boolean bl2;
        Object object = eb_2.d;
        Object object2 = this.m;
        if ((object2 = (sb3_2)((HashMap)object).get(object2)) != null) {
            this.q = object2;
        }
        object2 = this.m;
        if ((object2 = (sb3_2)((HashMap)object).get(object2)) != null) {
            object2 = ((sb3_2)object2).a;
        } else {
            bl2 = false;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        this.l = object2;
        object2 = this.m;
        object2 = (sb3_2)((HashMap)object).get(object2);
        int n3 = 0;
        if (object2 != null) {
            object2 = ((sb3_2)object2).g;
            Boolean bl3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object2, bl3);
        } else {
            bl2 = false;
            object2 = null;
        }
        this.p = bl2;
        object2 = this.m;
        object2 = (sb3_2)((HashMap)object).get(object2);
        long l2 = object2 != null && (object2 = ((sb3_2)object2).c) != null ? (Long)object2 : 0L;
        this.o = l2;
        object2 = this.m;
        object = (sb3_2)((HashMap)object).get(object2);
        if (object != null && (object = ((sb3_2)object).b) != null) {
            n3 = (Integer)object;
        }
        this.n = n3;
    }

    public final void Pa(boolean bl2) {
        ImageView imageView = null;
        String string2 = "imgPause";
        if (bl2) {
            ImageView imageView2 = this.g;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageView = imageView2;
            }
            ai0_2.i((View)imageView);
        } else {
            ImageView imageView3 = this.g;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageView = imageView3;
            }
            ai0_2.B((View)imageView);
        }
    }

    public final void Qa() {
        boolean bl3 = this.p;
        Object object = "ajioVideoPlayer";
        String string2 = "imgVolume";
        Object object2 = null;
        if (bl3) {
            ob_2 ob_22 = this.k;
            if (ob_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl3 = false;
                ob_22 = null;
            }
            ob_22.n();
            ob_22 = this.c;
            if (ob_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl3 = false;
                ob_22 = null;
            }
            int n3 = R$string.video_mute;
            object = hv3_0.K(n3);
            ob_22.setContentDescription((CharSequence)object);
            ob_22 = this.c;
            if (ob_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = ob_22;
            }
            ob_22 = this.requireContext();
            n3 = R$drawable.ic_full_screen_unmute;
            ob_22 = xn.a((Context)ob_22, n3);
            object2.setImageDrawable((Drawable)ob_22);
        } else {
            Object object3 = this.c;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl3 = false;
                object3 = null;
            }
            int bl2 = R$string.video_unmute;
            String string3 = hv3_0.K(bl2);
            object3.setContentDescription((CharSequence)string3);
            object3 = this.k;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl3 = false;
                object3 = null;
            }
            ((ob_2)object3).i();
            object3 = this.c;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object3;
            }
            object3 = this.requireContext();
            int n4 = R$drawable.ic_full_screen_mute;
            object3 = xn.a((Context)object3, n4);
            object2.setImageDrawable((Drawable)object3);
        }
        this.p = bl3 = this.p ^ true;
        object = VideoComponentEvents.Companion.getInstance();
        boolean bl2 = this.p;
        String string4 = ai0_2.h(this.l);
        long l2 = this.s;
        ((VideoComponentEvents)object).logMuteUnMuteEvent("video_banner_interactions", true, bl2, string4, false, l2, "video_screen_interaction");
    }

    public final void Ra() {
        long l2;
        Object object = VideoComponentEvents.Companion.getInstance();
        String string2 = ai0_2.h(this.l);
        long l3 = this.s;
        long l4 = this.u;
        String string3 = "video_banner_interactions";
        String string4 = "video_screen_interaction";
        ((VideoComponentEvents)object).logVideoViewTime(string2, false, l3, l4, string4, string3);
        this.u = l2 = 0L;
        Object object2 = this.x;
        object = this.y;
        object2.removeCallbacks((Runnable)object);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
            object2 = null;
        }
        ((ob_2)object2).l();
    }

    public final void X4() {
    }

    public final void Z1() {
        Object object = this.v;
        by0_0 by0_02 = this.w;
        object.removeCallbacks((Runnable)by0_02);
        object = this.c;
        by0_02 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        ai0_2.k((View)object);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.j;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            by0_02 = object;
        }
        ai0_2.B((View)by0_02);
    }

    public final void ha() {
        Object object = this.e;
        Object object2 = "imgReplay";
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        ai0_2.B((View)object);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        ai0_2.a((View)object);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        ai0_2.k((View)object);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.f;
        if (object == null) {
            object = "imgPlay";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        ai0_2.i((View)imageView);
        this.a = false;
        object = this.v;
        object2 = this.w;
        object.removeCallbacks((Runnable)object2);
    }

    public final void onClick(View object) {
        boolean bl2;
        boolean bl3;
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
            bl3 = false;
            object = null;
        }
        if ((object = ((ob_2)object).i) != null && (bl3 = ((b)object).isPlaying()) == (bl2 = true)) {
            bl3 = false;
            this.Pa(false);
            object = this.v;
            by0_0 by0_02 = this.w;
            object.removeCallbacks((Runnable)by0_02);
            long l2 = 3000L;
            object.postDelayed((Runnable)by0_02, l2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        long l2 = this.t;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            this.t = l2 = System.currentTimeMillis();
        }
        l4 = R$layout.fragment_p_d_p_video_player_full_screen;
        return layoutInflater.inflate((int)l4, viewGroup, false);
    }

    public final void onPause() {
        int n3;
        int n4;
        super.onPause();
        Object object = this.q;
        String string2 = "videoModel";
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        Object object3 = this.l;
        ((sb3_2)object).a = object3;
        object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        object3 = this.k;
        Object object4 = "ajioVideoPlayer";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object3 = null;
        }
        if ((object3 = ((ob_2)object3).i) != null) {
            n3 = ((e)object3).getCurrentMediaItemIndex();
            object3 = n3;
        } else {
            n3 = 0;
            object3 = null;
        }
        ((sb3_2)object).b = object3;
        object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        if ((object3 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object3 = null;
        }
        if ((object3 = ((ob_2)object3).i) != null) {
            long l2 = ((e)object3).getCurrentPosition();
            object3 = l2;
        } else {
            n3 = 0;
            object3 = null;
        }
        ((sb3_2)object).c = object3;
        object = eb_2.d;
        object3 = this.m;
        object4 = this.q;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object4;
        }
        ((HashMap)object).put(object3, object2);
        n4 = gz3.a;
        int n7 = 23;
        if (n4 <= n7) {
            this.Ra();
        }
    }

    public final void onResume() {
        Object object;
        Object object2;
        String string2;
        Object object3;
        float f5;
        int n3;
        int n4;
        block18: {
            block17: {
                super.onResume();
                n4 = gz3.a;
                n3 = 23;
                f5 = 3.2E-44f;
                object3 = null;
                string2 = "ajioVideoPlayer";
                if (n4 <= n3) break block17;
                object2 = this.k;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object2 = null;
                }
                if ((object2 = ((ob_2)object2).i) != null) break block18;
            }
            if ((object2 = this.k) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object2 = null;
            }
            long l2 = this.o;
            n3 = this.n;
            int n7 = 1;
            ob_2.h((ob_2)object2, l2, n3, n7);
        }
        if ((object2 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object2 = null;
        }
        if ((object = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
            f5 = 0.0f;
        }
        if ((object = ((ob_2)object).i) != null) {
            ((e)object).E();
            f5 = ((e)object).h0;
            object = Float.valueOf(f5);
        } else {
            n3 = 0;
            object = null;
            f5 = 0.0f;
        }
        Intrinsics.checkNotNull(object);
        ((ob_2)object2).k = object;
        n4 = (int)(this.p ? 1 : 0);
        object = "imgVolume";
        if (n4 != 0) {
            object2 = this.k;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object2 = null;
            }
            ((ob_2)object2).i();
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object2;
            }
            object2 = this.requireContext();
            n3 = R$drawable.ic_full_screen_mute;
            object2 = xn.a((Context)object2, n3);
            object3.setImageDrawable((Drawable)object2);
        } else {
            object2 = this.k;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object2 = null;
            }
            ((ob_2)object2).n();
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object2;
            }
            object2 = this.requireContext();
            n3 = R$drawable.ic_full_screen_unmute;
            object2 = xn.a((Context)object2, n3);
            object3.setImageDrawable((Drawable)object2);
        }
    }

    public final void onStart() {
        super.onStart();
        this.Oa();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 > n4) {
            ob_2 ob_22 = this.k;
            if (ob_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                n3 = 0;
                ob_22 = null;
            }
            long l2 = this.o;
            int n7 = this.n;
            int n8 = 1;
            ob_2.h(ob_22, l2, n7, n8);
        }
    }

    public final void onStop() {
        super.onStop();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 > n4) {
            this.Ra();
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.requireArguments();
        Object object3 = "kypMedia";
        object2 = object2.getString((String)object3);
        object2 = (KYPMedia)Z90.a(KYPMedia.class, (String)object2);
        this.r = object2;
        Intrinsics.checkNotNullParameter(object, string2);
        int n7 = R$id.playerView;
        object2 = (PlayerView)object.findViewById(n7);
        this.b = object2;
        string2 = "playerView";
        Object object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object2 = null;
        }
        Object object5 = hv3_0.K(R$string.video_player);
        object2.setContentDescription((CharSequence)object5);
        n7 = R$id.imgVolume;
        object2 = (ImageView)object.findViewById(n7);
        this.c = object2;
        n7 = R$id.imgReplay;
        object2 = (ImageView)object.findViewById(n7);
        this.e = object2;
        n7 = R$id.imgPlay;
        object2 = (ImageView)object.findViewById(n7);
        this.f = object2;
        n7 = R$id.imgPause;
        object2 = (ImageView)object.findViewById(n7);
        this.g = object2;
        n7 = R$id.imgClose;
        object2 = (ImageView)object.findViewById(n7);
        this.d = object2;
        n7 = R$id.txtDuration;
        object2 = (TextView)object.findViewById(n7);
        this.h = object2;
        n7 = R$id.imgThumbnail;
        object2 = (ImageView)object.findViewById(n7);
        this.i = object2;
        n7 = R$id.progress;
        object = (ProgressBar)object.findViewById(n7);
        this.j = object;
        object = new da$a();
        n7 = 1;
        ((da$a)object).k = n7;
        ((da$a)object).r = n7;
        int n8 = R$string.acc_banner;
        object5 = hv3_0.K(n8);
        ((da$a)object).b((String)object5);
        object5 = this.r;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n8 = 0;
            object5 = null;
        }
        if ((object3 = ((KYPMedia)object5).getThumbnail()) != null) {
            object3 = ((KYPImage)object3).getUrl();
        } else {
            n4 = 0;
            object3 = null;
        }
        object5 = this.i;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            n8 = 0;
            object5 = null;
        }
        ((da$a)object).n = object3;
        ((da$a)object).u = object5;
        ((da$a)object).a();
        object = this.getArguments();
        if (object == null || (object = object.getString((String)(object3 = "uuid"))) == null) {
            object = "";
        }
        this.m = object;
        this.Oa();
        object3 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object3, "requireContext(...)");
        object5 = this.b;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object5 = null;
        }
        Object object6 = this.l;
        this.k = object = new ob_2((Context)object3, (PlayerView)((Object)object5), this, (String)object6);
        ((ob_2)object).g = n7;
        long l2 = this.o;
        n4 = this.n;
        ob_2.h((ob_2)object, l2, n4, n7);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            n3 = 0;
            object = null;
        }
        n8 = 0;
        object5 = null;
        object3 = new aj2_1(0, this);
        object.setOnClickListener((View.OnClickListener)object3);
        object = this.d;
        object3 = "imgClose";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object = null;
        }
        int n10 = 1;
        object5 = new oi0_2(this, n10);
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            n3 = 0;
            object = null;
        }
        n10 = 0;
        object6 = null;
        object5 = new bj2_1(0, this);
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            n3 = 0;
            object = null;
        }
        n10 = 1;
        object5 = new sg0_1(this, n10);
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            n3 = 0;
            object = null;
        }
        n10 = 1;
        object5 = new tg0_1(this, n10);
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.k;
        object5 = "ajioVideoPlayer";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object = null;
        }
        object = ((ob_2)object).p;
        object6 = this.getViewLifecycleOwner();
        int n14 = 1;
        Object object7 = new kw1_0(this, n14);
        Dj2$b dj2$b = new Dj2$b((Function1)object7);
        ((LiveData)object).e((mu1_1)object6, dj2$b);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object = null;
        }
        object = ((ob_2)object).o;
        object5 = this.getViewLifecycleOwner();
        object6 = new cj2_2(this, 0);
        object7 = new Dj2$b((Function1)object6);
        ((LiveData)object).e((mu1_1)object5, (F62)object7);
        object = AnalyticsManager.Companion;
        object5 = "video banner screen";
        km_1.a((AnalyticsManager$Companion)object, (String)object5);
        l2 = this.s;
        long l3 = 0L;
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 == 0) {
            object = TimeUnit.MILLISECONDS;
            l2 = System.currentTimeMillis();
            l3 = this.t;
            l2 -= l3;
            this.s = l2 = ((TimeUnit)((Object)object)).toSeconds(l2);
        }
        if ((object = this.getArguments()) != null && (n3 = object.getBoolean((String)(object5 = "is luxe"))) == n7) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                object = null;
            }
            object2 = this.requireContext();
            n4 = R$drawable.ic_close_icon_luxe;
            object2 = xn.a((Context)object2, n4);
            object.setImageDrawable((Drawable)object2);
        }
        if ((object = this.b) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object4 = object;
        }
        object4.setOnClickListener((View.OnClickListener)this);
    }

    public final void u4() {
    }
}

