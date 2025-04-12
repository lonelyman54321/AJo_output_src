/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment$a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from x71
 */
public final class x71_0
extends RecyclerView$B
implements pb_2 {
    public final View a;
    public final g71_0 b;
    public final ConstraintLayout c;
    public final ConstraintLayout d;
    public BannerData e;
    public PlayerView f;
    public ImageView g;
    public ImageView h;
    public ImageView i;
    public ImageView j;
    public ConstraintLayout k;
    public ProgressBar l;
    public final ma_2 m;
    public final LinkedHashMap n;
    public long o;
    public final Handler p;
    public final u71_0 q;
    public boolean r;
    public boolean s;

    public x71_0(View object, g71_0 object2) {
        Intrinsics.checkNotNullParameter(object, "parentView");
        Intrinsics.checkNotNullParameter(object2, "homeComponentClickListener");
        super((View)object);
        this.a = object;
        this.b = object2;
        int n3 = R$id.cmsSubContainer;
        object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (ConstraintLayout)((Object)object2);
        this.c = object2;
        n3 = R$id.layoutVideoView;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ConstraintLayout)((Object)object);
        this.d = object;
        object = eb_2.a;
        this.m = object;
        super();
        this.n = object;
        object2 = Looper.getMainLooper();
        super((Looper)object2);
        this.p = object;
        super(this);
        this.q = object;
    }

    public final void A(String string2, ExoPlayer exoPlayer) {
        sb3_2 sb3_22;
        float f5;
        Object object;
        Object object2;
        int n3;
        Object object3 = this.e;
        Object object4 = null;
        Object object5 = object3 != null ? (object3 = ((BannerData)object3).getBannerUrl()) : null;
        if (exoPlayer != null) {
            n3 = exoPlayer.getCurrentMediaItemIndex();
            object2 = object3 = Integer.valueOf(n3);
        } else {
            object2 = null;
        }
        if (exoPlayer != null) {
            long l2 = exoPlayer.getCurrentPosition();
            object = object3 = Long.valueOf(l2);
        } else {
            object = null;
        }
        if (exoPlayer != null) {
            float f6 = exoPlayer.getVolume();
            object3 = Float.valueOf(f6);
        } else {
            n3 = 0;
            object3 = null;
            float f7 = 0.0f;
        }
        boolean bl2 = Intrinsics.areEqual((Float)object3, 0.0f);
        if (exoPlayer != null) {
            f5 = exoPlayer.getVolume();
            object4 = Float.valueOf(f5);
        }
        Intrinsics.checkNotNull(object4);
        f5 = ((Float)object4).floatValue();
        object3 = sb3_22;
        object4 = object5;
        object5 = object2;
        object2 = object;
        sb3_22 = new sb3_2((String)object4, (Integer)object5, (Long)object, bl2, f5, null, null, 208);
        eb_2.c.put(string2, sb3_22);
    }

    /*
     * Unable to fully structure code
     */
    public final void B(Context var1_1) {
        block13: {
            var2_2 = this;
            var3_3 = var1_1;
            var4_4 = true;
            var5_5 = this.m;
            if (var5_5 != null) {
                var5_5.s = var4_4;
            }
            if (var5_5 != null) {
                var6_6 = var5_5.r;
            } else {
                var6_6 = 0;
                var7_7 = null;
            }
            var8_8 = null;
            if (var5_5 != null) {
                var7_7 = var5_5.a(var6_6);
            } else {
                var6_6 = 0;
                var7_7 = null;
            }
            if (var5_5 != null) {
                var9_9 = var2_2.e;
                var9_9 = var9_9 != null ? var9_9.getBannerUrl() : null;
                var10_10 = this.getLayoutPosition();
                var9_9 = ow_0.c(var10_10, (String)var9_9);
            } else {
                var9_9 = null;
            }
            var11_11 = eb_2.a;
            var11_11 = var2_2.e;
            if (var11_11 != null) {
                var11_11 = var11_11.getCtaSettings();
            } else {
                var10_10 = 0;
                var11_11 = null;
            }
            eb_2.b = var11_11;
            var11_11 = var2_2.e;
            if (var11_11 == null || (var11_11 = var11_11.getBannerUrl()) == null || (var12_12 = ai0_2.h((String)var11_11)) == null) break block13;
            var11_11 = VideoComponentEvents.Companion;
            var13_13 = var11_11.getInstance();
            if (var5_5 == null) ** GOTO lbl-1000
            var5_5 = var2_2.e;
            if (var5_5 != null) {
                var8_8 = var5_5.getVideoSettings();
            }
            if ((var14_14 = ow_0.g(var8_8)) == var4_4) {
                var15_15 = true;
            } else lbl-1000:
            // 2 sources

            {
                var15_15 = false;
                var16_16 = null;
            }
            var17_17 = "video_screen_interaction";
            var18_18 = "full screen";
            var19_19 = true;
            var20_20 = 0L;
            var22_21 = "video_banner_interactions";
            var23_22 = 8;
            VideoComponentEvents.logExpandMinimizeEvent$default((VideoComponentEvents)var13_13, var19_19, var12_12, var15_15, var20_20, var22_21, var17_17, var18_18, var23_22, null);
        }
        if (var9_9 != null) {
            var2_2.A((String)var9_9, var7_7);
        }
        var24_23 = AjioVideoPlayerFullScreenFragment.Companion;
        var5_5 = var2_2.e;
        var24_23.getClass();
        var25_24 = AjioVideoPlayerFullScreenFragment$a.a((BannerData)var5_5, (String)var9_9);
        Intrinsics.checkNotNull(var3_3, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        var11_11 = var3_3;
        var11_11 = (AjioHomeActivity)var3_3;
        var13_13 = var11_11.T0;
        var16_16 = Reflection.getOrCreateKotlinClass(AjioVideoPlayerFullScreenFragment.class).getSimpleName();
        var26_25 = Boolean.FALSE;
        var11_11.Q1((Fragment)var13_13, var25_24, true, var16_16, var26_25);
    }

    public final void Ca(boolean bl2) {
        if (bl2) {
            ImageView imageView = this.h;
            ImageView imageView2 = null;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                bl2 = false;
                imageView = null;
            }
            int n3 = 8;
            imageView.setVisibility(n3);
            imageView = this.l;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progress");
                bl2 = false;
                imageView = null;
            }
            imageView.setVisibility(n3);
            imageView = this.g;
            String string2 = "imgVolume";
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                imageView = null;
            }
            imageView.setVisibility(0);
            imageView = this.g;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageView2 = imageView;
            }
            ai0_2.a((View)imageView2);
        }
    }

    public final void F5() {
        int n3;
        int n4;
        ExoPlayer exoPlayer;
        Object object;
        int n7;
        Object object2 = this.m;
        if (object2 != null) {
            n7 = ((ma_2)object2).r;
        } else {
            n7 = 0;
            object = null;
        }
        if (object2 == null || (exoPlayer = ((ow_0)object2).a(n7)) == null || (n4 = exoPlayer.isPlaying()) != (n3 = 1)) {
            if (object2 != null && (object2 = ((ow_0)object2).a(n7)) != null) {
                object2.play();
            }
            object2 = this.h;
            n7 = 0;
            object = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                object2 = null;
            }
            n4 = 8;
            object2.setVisibility(n4);
            object2 = this.l;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progress");
                object2 = null;
            }
            object2.setVisibility(n4);
            object2 = this.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
                object2 = null;
            }
            object2.setVisibility(0);
            object2 = this.f;
            if (object2 == null) {
                object2 = "videoView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object = object2;
            }
            ((PlayerView)((Object)object)).setVisibility(0);
        }
    }

    public final void M0() {
    }

    public final void X4() {
    }

    public final void Z1() {
        Object object = this.g;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        int n3 = 4;
        object.setVisibility(n3);
        object = this.l;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        imageView.setVisibility(0);
    }

    public final void ha() {
        Object object = this.g;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        int n3 = 4;
        object.setVisibility(n3);
        object = this.h;
        if (object == null) {
            object = "imgThumbnail";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        imageView.setVisibility(0);
        this.r = false;
    }

    public final void u4() {
    }

    public final void w(BannerData bannerData) {
        Object object;
        int n3;
        Object object2;
        PlayerView playerView = null;
        ma_2 ma_22 = this.m;
        object2 = ma_22 != null && (object2 = ma_22.a) != null && (object2 = (lt2_1)((ArrayList)object2).get(n3 = this.getLayoutPosition())) != null ? ((lt2_1)object2).c : null;
        if (object2 != null) {
            object2 = ma_22.a;
            n3 = this.getLayoutPosition();
            if ((object2 = (lt2_1)((ArrayList)object2).get(n3)) != null) {
                ((lt2_1)object2).c = this;
            }
        }
        if (ma_22 != null) {
            object2 = bannerData.getBannerUrl();
            n3 = this.getLayoutPosition();
            object2 = ow_0.c(n3, (String)object2);
        } else {
            object2 = null;
        }
        Object object3 = object = eb_2.c.get(object2);
        object3 = (sb3_2)object;
        if (ma_22 != null) {
            n3 = this.getLayoutPosition();
            Object object4 = this.f;
            if (object4 == null) {
                object4 = "videoView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                playerView = object4;
            }
            object4 = bannerData.getBannerUrl();
            LinkedHashMap linkedHashMap = this.n;
            String string2 = String.valueOf(object2);
            int n4 = 128;
            object = playerView;
            ma_2.i(ma_22, n3, playerView, (String)object4, linkedHashMap, this, string2, object3, n4);
        }
    }

    public final void x(Context context) {
        String string2;
        Object object;
        Object object2;
        Object object3;
        int n3;
        x71_0 x71_02 = this;
        Object object4 = context;
        boolean bl2 = false;
        Boolean bl3 = null;
        ma_2 ma_22 = this.m;
        if (ma_22 != null) {
            n3 = ma_22.r;
        } else {
            n3 = 0;
            object3 = null;
        }
        ma_2 ma_23 = null;
        if (ma_22 != null) {
            object3 = ma_22.a(n3);
        } else {
            n3 = 0;
            object3 = null;
        }
        if (object3 != null) {
            float f5 = object3.getVolume();
            object2 = Float.valueOf(f5);
        } else {
            object2 = null;
            float f6 = 0.0f;
        }
        float f7 = 0.0f;
        Object object5 = null;
        boolean bl4 = Intrinsics.areEqual((Float)object2, 0.0f);
        object2 = "imgVolume";
        if (bl4) {
            object5 = x71_02.g;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object5 = null;
                f7 = 0.0f;
            }
            int n4 = R$string.video_mute;
            object = hv3_0.K(n4);
            object5.setContentDescription((CharSequence)object);
            if (ma_22 != null) {
                ma_2.p(ma_22, (ExoPlayer)object3);
            }
            if ((ma_22 = x71_02.g) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                ma_23 = ma_22;
            }
            int n7 = R$drawable.ic_unmute;
            object4 = xn.a((Context)object4, n7);
            ma_23.setImageDrawable((Drawable)object4);
        } else {
            int n8;
            if (ma_22 != null) {
                if (object3 != null) {
                    f7 = object3.getVolume();
                    object5 = Float.valueOf(f7);
                } else {
                    object5 = null;
                    f7 = 0.0f;
                }
                Intrinsics.checkNotNull(object5);
                ma_22.g = object5;
            }
            if (ma_22 != null) {
                ma_22.k((ExoPlayer)object3);
            }
            if ((ma_22 = x71_02.g) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n8 = 0;
                ma_22 = null;
            }
            n3 = R$string.video_unmute;
            object3 = hv3_0.K(n3);
            ma_22.setContentDescription((CharSequence)object3);
            ma_22 = x71_02.g;
            if (ma_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                ma_23 = ma_22;
            }
            n8 = R$drawable.ic_mute;
            object4 = xn.a((Context)object4, n8);
            ma_23.setImageDrawable((Drawable)object4);
        }
        object4 = x71_02.e;
        if (object4 != null && (object4 = ((BannerData)object4).getBannerUrl()) != null && (string2 = ai0_2.h((String)object4)) != null) {
            boolean bl5;
            object = VideoComponentEvents.Companion.getInstance();
            object4 = x71_02.e;
            if (object4 != null && (object4 = ((BannerData)object4).getVideoSettings()) != null) {
                object4 = ((VideoSetting)object4).getAutoPlay();
                bl3 = Boolean.TRUE;
                bl5 = bl2 = Intrinsics.areEqual(object4, bl3);
            } else {
                bl5 = false;
            }
            long l2 = 0L;
            String string3 = "landing_screen_interactions";
            String string4 = "video_banner_interactions";
            int n10 = 32;
            VideoComponentEvents.logMuteUnMuteEvent$default((VideoComponentEvents)object, string4, false, bl4, string2, bl5, l2, string3, n10, null);
        }
    }

    public final void y(int n3) {
        String string2;
        boolean bl2;
        Object object = eb_2.a;
        object = this.e;
        ImageView imageView = null;
        if (object != null) {
            object = ((BannerData)object).getBannerType();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = eb_2.e((String)object);
        if (!bl2) {
            return;
        }
        object = this.m;
        ExoPlayer exoPlayer = object != null ? ((ow_0)object).a(n3) : null;
        if (object != null) {
            string2 = ow_0.d(exoPlayer, n3);
        } else {
            n3 = 0;
            string2 = null;
        }
        Object object2 = this.h;
        if (object2 == null) {
            object2 = "imgThumbnail";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            imageView = object2;
        }
        object2 = null;
        imageView.setVisibility(0);
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
        if (string2 != null) {
            this.A(string2, exoPlayer);
        }
        if (object != null) {
            ((ma_2)object).s = false;
        }
    }

    public final void z(int n3) {
        boolean bl2;
        Object object;
        boolean bl3;
        Object object2 = eb_2.a;
        object2 = this.e;
        int n4 = 0;
        Long l2 = null;
        if (object2 != null) {
            object2 = ((BannerData)object2).getBannerType();
        } else {
            bl3 = false;
            object2 = null;
        }
        bl3 = eb_2.e((String)object2);
        if (!bl3) {
            return;
        }
        object2 = this.m;
        ExoPlayer exoPlayer = object2 != null ? ((ow_0)object2).a(n3) : null;
        if (object2 != null) {
            object = ow_0.d(exoPlayer, n3);
        } else {
            n3 = 0;
            object = null;
        }
        HashMap hashMap = eb_2.c;
        object = (sb3_2)hashMap.get(object);
        boolean bl4 = true;
        if (exoPlayer == null || (bl2 = exoPlayer.isPlaying()) != bl4) {
            long l3;
            Object object3 = this.h;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                bl2 = false;
                object3 = null;
            }
            int n7 = 8;
            object3.setVisibility(n7);
            if (exoPlayer != null) {
                l3 = exoPlayer.getCurrentPosition();
                object3 = l3;
            } else {
                bl2 = false;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3);
            l3 = (Long)object3;
            BannerData bannerData = this.e;
            if (bannerData != null) {
                l2 = bannerData.getDuration();
            }
            Intrinsics.checkNotNull(l2);
            long l4 = l2;
            long l7 = 1000;
            long l8 = l3 - (l4 *= l7);
            n4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (n4 >= 0) {
                long l12 = 0L;
                exoPlayer.seekTo(l12);
                this.s = bl4;
            } else {
                if (object2 != null) {
                    ma_2.n((sb3_2)object, exoPlayer);
                }
                if (object2 != null) {
                    ((ma_2)object2).s = bl4;
                }
            }
        }
    }
}

