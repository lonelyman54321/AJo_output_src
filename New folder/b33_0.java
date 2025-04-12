/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.SeekBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from B33
 */
public final class b33_0
extends RecyclerView$B
implements pb_2,
View.OnTouchListener {
    public static final /* synthetic */ int S;
    public ProgressBar A;
    public boolean B;
    public BannerData C;
    public int D;
    public final in2_0 E;
    public Rect F;
    public final x33 G;
    public final Handler H;
    public String I;
    public long J;
    public long K;
    public sb3_2 L;
    public String M;
    public long N;
    public long O;
    public final Handler P;
    public final d10 Q;
    public boolean R;
    public final View a;
    public final mu1_1 b;
    public final ma_2 c;
    public final e43_0 d;
    public boolean e;
    public final int f;
    public final View g;
    public final RelativeLayout h;
    public final ImageView i;
    public final RelativeLayout j;
    public final View k;
    public final RelativeLayout l;
    public final TextView m;
    public final TextView n;
    public final FrameLayout o;
    public final RecyclerView p;
    public final ShimmerFrameLayout q;
    public final LinearLayout r;
    public final LinearLayout s;
    public final boolean t;
    public PlayerView u;
    public SeekBar v;
    public ImageView w;
    public ImageView x;
    public ImageView y;
    public ImageView z;

    public b33_0(View object, mu1_1 object2, ma_2 object3, e43_0 e43_02) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "parentView");
        Intrinsics.checkNotNullParameter(object2, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(object3, "ajioVideoPlayer");
        Intrinsics.checkNotNullParameter(e43_02, "stlViewModel");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = e43_02;
        this.f = 500;
        int n3 = R$id.layoutVideo;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.g = object2;
        n3 = R$id.bgRV;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (RelativeLayout)object2;
        this.h = object2;
        n3 = R$id.stlMainIv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ImageView)object2;
        this.i = object2;
        n3 = R$id.stlSwipeLayout;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (RelativeLayout)object2;
        this.j = object2;
        n3 = R$id.topGradientView;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.k = object2;
        n3 = R$id.stlTopRl;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (RelativeLayout)object2;
        this.l = object2;
        n3 = R$id.stlSubTitleTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.m = object2;
        n3 = R$id.stlTitleTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.n = object2;
        n3 = R$id.stlBottomFl;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (FrameLayout)object2;
        this.o = object2;
        n3 = R$id.stlHRv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.p = object2 = (RecyclerView)object2;
        n3 = R$id.shimmer_stl_products;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ShimmerFrameLayout)((Object)object2);
        this.q = object2;
        n3 = R$id.shimmerLlLuxe;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (LinearLayout)object2;
        this.r = object2;
        n3 = R$id.shimmerLlAjio;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (LinearLayout)object;
        this.s = object;
        this.t = bl2 = og1_1.c();
        super(this, 2);
        this.E = object;
        super(this);
        this.G = object;
        object2 = Looper.getMainLooper();
        super((Looper)object2);
        this.H = object;
        object2 = Looper.getMainLooper();
        super((Looper)object2);
        this.P = object;
        super(this, 2);
        this.Q = object;
    }

    public final void A(boolean bl2) {
        int n3;
        Object object;
        int n4;
        Object object2;
        Object object3 = null;
        if (!bl2) {
            object2 = this.z;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                n4 = 0;
                object2 = null;
            }
            ai0_2.B((View)object2);
        }
        if ((object2 = ((ow_0)(object = this.c)).a(n4 = this.D)) != null && (n4 = (int)(object2.isPlaying() ? 1 : 0)) == (n3 = 1)) {
            n4 = this.D;
            object2 = ((ow_0)object).a(n4);
            if (object2 != null) {
                object2.pause();
            }
            if ((object2 = this.v) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekbar");
                n4 = 0;
                object2 = null;
            }
            int n7 = 8;
            object2.setVisibility(n7);
            if (bl2) {
                boolean bl3;
                object2 = VideoComponentEvents.Companion.getInstance();
                String string2 = String.valueOf(this.I);
                long l2 = this.J;
                Object object4 = this.C;
                if (object4 == null) {
                    object4 = "bannerData";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object4;
                }
                object4 = ((BannerData)object3).getVideoSettings();
                if (object4 != null) {
                    object4 = ((VideoSetting)object4).getAutoPlay();
                    object3 = Boolean.TRUE;
                    bl3 = bl2 = Intrinsics.areEqual(object4, object3);
                } else {
                    bl2 = false;
                    object4 = null;
                    bl3 = false;
                }
                String string3 = "video_screen_interaction";
                String string4 = "full screen";
                object = "shop the look video interactions";
                ((VideoComponentEvents)object2).logVideoPauseEvent((String)object, string2, bl3, l2, string3, string4);
            }
        }
    }

    public final void B(boolean bl2) {
        boolean bl3;
        boolean bl4;
        Object object = this.c;
        int n3 = ((ma_2)object).r;
        if ((object = ((ow_0)object).a(n3)) != null) {
            long l2 = 0L;
            object.seekTo(l2);
        }
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
        String string2 = String.valueOf(this.I);
        long l3 = this.J;
        object = this.C;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerData");
            bl4 = false;
            object = null;
        }
        if ((object = ((BannerData)object).getVideoSettings()) != null) {
            object = ((VideoSetting)object).getAutoPlay();
            Boolean bl5 = Boolean.TRUE;
            bl3 = bl4 = Intrinsics.areEqual(object, bl5);
        } else {
            bl4 = false;
            object = null;
            bl3 = false;
        }
        videoComponentEvents.logReplayEvent(bl2, string2, bl3, l3, "shop the look video interactions", "video_screen_interaction", "full screen");
    }

    public final void C() {
        int n3;
        Object object = this.v;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            n3 = 0;
            object = null;
        }
        int n4 = 0;
        object.setVisibility(0);
        object = this.w;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            n3 = 0;
            object = null;
        }
        object.setVisibility(0);
        this.l.setVisibility(0);
        object = this.A;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setVisibility(8);
        n3 = this.D;
        object2 = this.c;
        object = ((ow_0)object2).a(n3);
        if ((object == null || (n3 = (int)(object.isPlaying() ? 1 : 0)) != (n4 = 1)) && (object = ((ow_0)object2).a(n3 = this.D)) != null) {
            object.play();
        }
        object = this.d.g;
        object2 = Boolean.FALSE;
        ((LiveData)object).k(object2);
    }

    public final void Ca(boolean bl2) {
        if (bl2) {
            boolean bl3;
            Object object;
            long l2;
            Object object2;
            long l3 = this.J;
            long l4 = 0L;
            Object object3 = this.c;
            ma_2 ma_22 = null;
            Object object4 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object4 == false) {
                object2 = TimeUnit.MILLISECONDS;
                l2 = System.currentTimeMillis();
                long l7 = this.K;
                this.J = l3 = ((TimeUnit)((Object)object2)).toSeconds(l2 -= l7);
                object2 = new Bundle();
                String string2 = this.I;
                object2.putString("video_name", string2);
                object = this.C;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerData");
                    bl3 = false;
                    object = null;
                }
                if ((object = ((BannerData)object).getDynamicPageMetadata()) != null) {
                    object = ((DynamicPageMetadata)object).getVideoSettings();
                } else {
                    bl3 = false;
                    object = null;
                }
                object3.getClass();
                bl3 = ow_0.g((VideoSetting)object);
                string2 = "is_auto_play_enabled";
                object2.putBoolean(string2, bl3);
                object = "video_load_time";
                l4 = this.J;
                object2.putLong((String)object, l4);
                eb_2.f = object2;
            }
            ((ma_2)object3).r();
            object3 = this.w;
            object2 = "imgVolume";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object3 = null;
            }
            bl3 = false;
            object = null;
            object3.setVisibility(0);
            object3 = this.w;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object3 = null;
            }
            ai0_2.a((View)object3);
            object3 = this.z;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                bl2 = false;
                object3 = null;
            }
            int n3 = 8;
            object3.setVisibility(n3);
            object3 = this.A;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progress");
                bl2 = false;
                object3 = null;
            }
            object3.setVisibility(n3);
            object3 = this.v;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekbar");
                bl2 = false;
                object3 = null;
            }
            ai0_2.B((View)object3);
            object3 = this.x;
            if (object3 == null) {
                object3 = "imgReplay";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                ma_22 = object3;
            }
            ai0_2.i((View)ma_22);
            object3 = this.P;
            object2 = this.Q;
            l2 = 1000L;
            object3.postDelayed((Runnable)object2, l2);
        }
    }

    public final void F5() {
        int n3;
        ma_2 ma_22 = this.c;
        int n4 = this.getLayoutPosition();
        ExoPlayer exoPlayer = ma_22.f(n4);
        if ((exoPlayer == null || (n4 = (int)(exoPlayer.isPlaying() ? 1 : 0)) != (n3 = 1)) && (exoPlayer = ma_22.f(n4 = this.getLayoutPosition())) != null) {
            exoPlayer.play();
        }
    }

    public final void M0() {
        Object object = this.y;
        String string2 = "imgPlay";
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        object.setVisibility(0);
        object = this.y;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ai0_2.a((View)object);
        object = this.z;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            object = null;
        }
        object.setVisibility(0);
        object = this.A;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        imageView.setVisibility(8);
    }

    public final void X4() {
    }

    public final void Z1() {
        Object object = this.w;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        int n3 = 4;
        object.setVisibility(n3);
        object = this.A;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        imageView.setVisibility(0);
    }

    public final void ha() {
        int n3;
        long l2;
        Object object = null;
        this.e = false;
        this.N = l2 = 0L;
        this.O = l2;
        Object object2 = this.P;
        d10 d102 = this.Q;
        object2.removeCallbacks((Runnable)d102);
        object2 = this.C;
        d102 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerData");
            n3 = 0;
            object2 = null;
        }
        if ((object2 = ((BannerData)object2).getDynamicPageMetadata()) != null && (object2 = ((DynamicPageMetadata)object2).getVideoSettings()) != null) {
            object2 = ((VideoSetting)object2).getAutoPlay();
            Boolean bl2 = Boolean.TRUE;
            n3 = Intrinsics.areEqual(object2, bl2);
        } else {
            n3 = 0;
            object2 = null;
        }
        if (n3 != 0 && (n3 = km_1.b((cp$a)(object2 = cp_1.Companion))) == 0) {
            this.R = n3 = 1;
            this.B(false);
        } else {
            object2 = this.x;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(0);
            object2 = this.p.getChildAt(0);
            if (object2 != null) {
                ai0_2.a((View)object2);
            }
            if ((object2 = this.z) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(0);
            object = this.w;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
                object = null;
            }
            n3 = 4;
            object.setVisibility(n3);
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekbar");
                object = null;
            }
            n3 = 8;
            object.setVisibility(n3);
            object = this.y;
            if (object == null) {
                object = "imgPlay";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                d102 = object;
            }
            d102.setVisibility(n3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean onTouch(View object, MotionEvent motionEvent) {
        x33 x332;
        int n3;
        Handler handler;
        in2_0 in2_02;
        block15: {
            void var1_6;
            float f5;
            int n4;
            int n7;
            void var5_12;
            String string2;
            int n8;
            Rect rect;
            int n10;
            block16: {
                int n14;
                n10 = 0;
                Object var1_2 = null;
                if (rect != null) {
                    n8 = rect.getAction();
                    Integer n15 = n8;
                } else {
                    n8 = 0;
                    Object var5_11 = null;
                }
                in2_02 = this.E;
                handler = this.H;
                n3 = 1;
                string2 = "playerView";
                if (var5_12 != null && (n14 = var5_12.intValue()) == 0) {
                    void var1_4;
                    int n16;
                    void var5_15;
                    PlayerView playerView = this.u;
                    if (playerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n8 = 0;
                        Object var5_14 = null;
                    }
                    n8 = var5_15.getLeft();
                    PlayerView playerView2 = this.u;
                    if (playerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n14 = 0;
                        playerView2 = null;
                    }
                    n14 = playerView2.getTop();
                    PlayerView playerView3 = this.u;
                    if (playerView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n16 = 0;
                        playerView3 = null;
                    }
                    n16 = playerView3.getRight();
                    PlayerView playerView4 = this.u;
                    if (playerView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        PlayerView playerView5 = playerView4;
                    }
                    n10 = var1_4.getBottom();
                    this.F = rect = new Rect(n8, n14, n16, n10);
                    n10 = ViewConfiguration.getTapTimeout();
                    long l2 = n10;
                    handler.postDelayed((Runnable)in2_02, l2);
                    return n3 != 0;
                }
                x332 = this.G;
                if (var5_12 != null && (n7 = var5_12.intValue()) == n3) break block15;
                if (var5_12 == null) break block16;
                n7 = var5_12.intValue();
                n4 = 3;
                f5 = 4.2E-45f;
                if (n7 == n4) break block15;
            }
            if (var5_12 == null) {
                return n3 != 0;
            }
            n8 = var5_12.intValue();
            if (n8 != (n7 = 2)) return n3 != 0;
            Rect rect2 = this.F;
            Intrinsics.checkNotNull(rect2);
            PlayerView playerView = this.u;
            if (playerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                playerView = null;
            }
            n7 = playerView.getLeft();
            f5 = rect.getX();
            n4 = (int)f5;
            n7 += n4;
            PlayerView playerView6 = this.u;
            if (playerView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                PlayerView playerView7 = playerView6;
            }
            n10 = var1_6.getTop();
            float f6 = rect.getY();
            int n17 = (int)f6;
            n10 += n17;
            n10 = (int)(rect2.contains(n7, n10) ? 1 : 0);
            if (n10 != 0) return n3 != 0;
            handler.removeCallbacks((Runnable)x332);
            handler.removeCallbacks((Runnable)in2_02);
            this.C();
            return n3 != 0;
        }
        handler.removeCallbacks((Runnable)x332);
        handler.removeCallbacks((Runnable)in2_02);
        this.C();
        return n3 != 0;
    }

    public final void u4() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w(BannerData object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "bannerData");
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
        Object object2 = ((BannerData)object).getDynamicPageMetadata();
        if (object2 == null || (object2 = ((DynamicPageMetadata)object2).getExtendedUrl()) == null || (object2 = ai0_2.h((String)object2)) == null) {
            object2 = "";
        }
        Object object3 = object2;
        long l2 = this.J;
        if ((object = ((BannerData)object).getVideoSettings()) != null) {
            boolean bl3;
            object = ((VideoSetting)object).getAutoPlay();
            object2 = Boolean.TRUE;
            bl2 = bl3 = Intrinsics.areEqual(object, object2);
        } else {
            boolean bl4 = false;
            object = null;
            bl2 = false;
        }
        videoComponentEvents.logPrevNextSwipeEvent(true, (String)object3, bl2, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void x(BannerData object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "bannerData");
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
        Object object2 = ((BannerData)object).getDynamicPageMetadata();
        if (object2 == null || (object2 = ((DynamicPageMetadata)object2).getExtendedUrl()) == null || (object2 = ai0_2.h((String)object2)) == null) {
            object2 = "";
        }
        Object object3 = object2;
        long l2 = this.J;
        if ((object = ((BannerData)object).getVideoSettings()) != null) {
            boolean bl3;
            object = ((VideoSetting)object).getAutoPlay();
            object2 = Boolean.TRUE;
            bl2 = bl3 = Intrinsics.areEqual(object, object2);
        } else {
            boolean bl4 = false;
            object = null;
            bl2 = false;
        }
        videoComponentEvents.logPrevNextSwipeEvent(false, (String)object3, bl2, l2);
    }

    public final void y() {
        Object object = VideoComponentEvents.Companion.getInstance();
        Object object2 = this.C;
        Object object3 = "bannerData";
        boolean bl2 = false;
        VideoSetting videoSetting = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        if ((object2 = ((BannerData)object2).getDynamicPageMetadata()) == null || (object2 = ((DynamicPageMetadata)object2).getExtendedUrl()) == null || (object2 = ai0_2.h((String)object2)) == null) {
            object2 = "";
        }
        long l2 = this.J;
        BannerData bannerData = this.C;
        if (bannerData == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            bannerData = null;
        }
        if ((object3 = bannerData.getDynamicPageMetadata()) != null) {
            videoSetting = ((DynamicPageMetadata)object3).getVideoSettings();
        }
        this.c.getClass();
        bl2 = ow_0.g(videoSetting);
        long l3 = this.O;
        object3 = object2;
        ((VideoComponentEvents)object).logVideoViewTime((String)object2, bl2, l2, l3, "video_screen_interaction", "shop the look video interactions");
        this.O = 0L;
        object2 = this.P;
        object = this.Q;
        object2.removeCallbacks((Runnable)object);
    }

    public final void z(boolean bl2) {
        boolean bl3;
        Object object;
        Object object2;
        int n3;
        b33_0 b33_02 = this;
        boolean bl4 = false;
        Boolean bl5 = null;
        int n4 = 1;
        if (bl2) {
            n3 = this.R;
            if (n3 != 0) {
                this.B = n3 = this.B ^ n4;
            } else {
                object2 = this.L;
                if (object2 != null && (n3 = ((sb3_2)object2).d) == n4) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                b33_02.B = n3;
            }
        } else {
            object2 = this.L;
            if (object2 != null && (n3 = ((sb3_2)object2).d) == n4) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            b33_02.B = n3;
        }
        n3 = b33_02.B;
        View view = b33_02.a;
        ma_2 ma_22 = b33_02.c;
        String string2 = "imgVolume";
        BannerData bannerData = null;
        if (n3 != 0) {
            object2 = b33_02.w;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            int n7 = R$string.video_mute;
            object = hv3_0.K(n7);
            object2.setContentDescription((CharSequence)object);
            n3 = ma_22.r;
            object2 = ma_22.a(n3);
            ma_2.p(ma_22, (ExoPlayer)object2);
            object2 = b33_02.w;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            view = view.getContext();
            int n8 = R$drawable.volume_on;
            view = xn.a((Context)view, n8);
            object2.setImageDrawable((Drawable)view);
        } else {
            object2 = b33_02.w;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            int n10 = R$string.video_unmute;
            object = hv3_0.K(n10);
            object2.setContentDescription((CharSequence)object);
            n3 = ma_22.r;
            object2 = ma_22.a(n3);
            ma_22.k((ExoPlayer)object2);
            object2 = b33_02.w;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            view = view.getContext();
            int n14 = R$drawable.volume_off;
            view = xn.a((Context)view, n14);
            object2.setImageDrawable((Drawable)view);
        }
        n3 = (int)(b33_02.B ? 1 : 0);
        b33_02.B = n4 ^= n3;
        object2 = b33_02.L;
        if (object2 != null) {
            ((sb3_2)object2).d = n4;
        }
        object = VideoComponentEvents.Companion.getInstance();
        boolean bl6 = b33_02.B;
        String string3 = String.valueOf(b33_02.I);
        long l2 = b33_02.J;
        Object object3 = b33_02.C;
        if (object3 == null) {
            object3 = "bannerData";
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            bannerData = object3;
        }
        object3 = bannerData.getVideoSettings();
        if (object3 != null) {
            bl5 = ((VideoSetting)object3).getAutoPlay();
            object3 = Boolean.TRUE;
            bl3 = bl4 = Intrinsics.areEqual(bl5, object3);
        } else {
            bl3 = false;
        }
        ((VideoComponentEvents)object).logMuteUnMuteEvent("shop the look video interactions", true, bl6, string3, bl3, l2, "video_screen_interaction");
    }
}

