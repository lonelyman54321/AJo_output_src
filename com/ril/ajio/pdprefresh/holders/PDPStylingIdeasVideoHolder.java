/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.pdprefresh.holders;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.analytics.events.VideoComponentEvents$Companion;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder$a;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder$b;
import com.ril.ajio.pdprefresh.view.BasePDPNewAjioView;
import com.ril.ajio.services.data.Product.KYPMedia;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Media;
import com.ril.ajio.services.data.Product.fleek.PostsResponse$Component$Subcomponent$Media$Metadata;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class PDPStylingIdeasVideoHolder
extends BasePDPNewAjioView
implements pb_2,
View.OnClickListener {
    public static final PDPStylingIdeasVideoHolder$a Companion;
    public static boolean H;
    public boolean A;
    public yr0_1 B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public final yh2_1 G;
    public PostsResponse$Component a;
    public bf3_1 b;
    public yi2_1 c;
    public ma_2 d;
    public View e;
    public ImageView f;
    public PlayerView g;
    public ImageView h;
    public ImageView i;
    public ProgressBar j;
    public ImageView k;
    public TextView l;
    public ImageView m;
    public ImageView n;
    public ConstraintLayout o;
    public TextView p;
    public ConstraintLayout q;
    public sb3_2 r;
    public String s;
    public long t;
    public long u;
    public String v;
    public final Handler w;
    public final Runnable x;
    public final Handler y;
    public final Runnable z;

    static {
        PDPStylingIdeasVideoHolder$a pDPStylingIdeasVideoHolder$a;
        Companion = pDPStylingIdeasVideoHolder$a = new Object();
    }

    public PDPStylingIdeasVideoHolder(Context context, AttributeSet object) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, (AttributeSet)object);
        this.v = "";
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.w = object;
        super(this, 1);
        this.x = object;
        looper = Looper.getMainLooper();
        super(looper);
        this.y = object;
        super(this, 1);
        this.z = object;
        this.f(context);
    }

    public PDPStylingIdeasVideoHolder(Context context, AttributeSet object, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, (AttributeSet)object, n3);
        this.v = "";
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.w = object;
        super(this, 1);
        this.x = object;
        looper = Looper.getMainLooper();
        super(looper);
        this.y = object;
        super(this, 1);
        this.z = object;
        this.f(context);
    }

    public PDPStylingIdeasVideoHolder(Context context, yi2_1 yi2_12, PostsResponse$Component postsResponse$Component, ma_2 ma_22, bf3_1 bf3_12, int n3, yh2_1 yh2_12) {
        Object object;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(ma_22, "ajioVideoPlayer");
        Intrinsics.checkNotNullParameter(bf3_12, "stylishIdeasCallback");
        Intrinsics.checkNotNullParameter(yh2_12, "adapter");
        super(context);
        this.v = "";
        Looper looper = Looper.getMainLooper();
        this.w = object = new Handler(looper);
        super(this, 1);
        this.x = object;
        looper = Looper.getMainLooper();
        this.y = object = new Handler(looper);
        super(this, 1);
        this.z = object;
        this.a = postsResponse$Component;
        this.b = bf3_12;
        this.setAjioVideoPlayer(ma_22);
        this.setPdpInfoProvider(yi2_12);
        this.D = n3;
        this.G = yh2_12;
        this.f(context);
    }

    public static void a(PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder) {
        boolean bl2;
        boolean bl3;
        PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder2 = pDPStylingIdeasVideoHolder;
        Intrinsics.checkNotNullParameter(pDPStylingIdeasVideoHolder, "this$0");
        Object object = pDPStylingIdeasVideoHolder.k;
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
            object = null;
        }
        Intrinsics.checkNotNullExpressionValue(object.getContext(), "getContext(...)");
        int n3 = 0;
        String string3 = null;
        String string4 = null;
        boolean bl32 = false;
        float f5 = 0.0f;
        Object object2 = null;
        Object object3 = null;
        boolean bl4 = false;
        Object object4 = null;
        Object object5 = null;
        boolean bl5 = false;
        float f6 = 0.0f;
        String string5 = null;
        Boolean bl6 = null;
        Object object6 = null;
        int n4 = 2047;
        Object object7 = object;
        object = new KYPMedia(null, null, null, null, null, null, null, null, null, null, null, n4, null);
        Object object8 = pDPStylingIdeasVideoHolder2.v;
        ((KYPMedia)object).setUrl((String)object8);
        object8 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        ((ma_2)object8).s = bl3 = true;
        int n7 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer().r;
        object8 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer().a(n7);
        object7 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        Object object9 = ((KYPMedia)object).getUrl();
        int n8 = pDPStylingIdeasVideoHolder.getModelPosition();
        object7.getClass();
        object7 = ow_0.c(n8, (String)object9);
        object9 = ((KYPMedia)object).getUrl();
        if (object9 != null) {
            object9 = ai0_2.h((String)object9);
        } else {
            boolean bl7 = false;
            object9 = null;
            f5 = 0.0f;
        }
        object3 = VideoComponentEvents.Companion.getInstance();
        object5 = String.valueOf(object9);
        string3 = "pdp_screen_interaction";
        string4 = "full screen";
        bl4 = true;
        bl5 = false;
        long l2 = 0L;
        object6 = "pdp_video_interactions";
        n4 = 8;
        VideoComponentEvents.logExpandMinimizeEvent$default((VideoComponentEvents)object3, bl4, (String)object5, false, l2, (String)object6, string3, string4, n4, null);
        cp_1.Companion.getClass();
        object9 = cp$a.d().getAudioSettings().getMuteOnMinimizedScreen();
        object2 = Boolean.TRUE;
        H = bl2 = Intrinsics.areEqual(object9, object2);
        object3 = ((KYPMedia)object).getUrl();
        if (object8 != null) {
            int n10 = object8.getCurrentMediaItemIndex();
            object4 = object9 = Integer.valueOf(n10);
        } else {
            bl4 = false;
            object4 = null;
        }
        if (object8 != null) {
            long l3 = object8.getCurrentPosition();
            object5 = object9 = Long.valueOf(l3);
        } else {
            object5 = null;
        }
        if (object8 != null) {
            f5 = object8.getVolume();
            object9 = Float.valueOf(f5);
        } else {
            boolean bl8 = false;
            object9 = null;
            f5 = 0.0f;
        }
        n8 = 0;
        object2 = null;
        bl5 = Intrinsics.areEqual((Float)object9, 0.0f);
        if (object8 != null) {
            float f7;
            f6 = f7 = object8.getVolume();
        } else {
            f6 = 0.0f;
            string5 = null;
        }
        object6 = cp$a.d().getAudioSettings().getMuteOnMinimizedScreen();
        bl6 = cp$a.d().getAudioSettings().getMuteOnFullScreen();
        n3 = 16;
        object2 = object8;
        pDPStylingIdeasVideoHolder2.r = object8 = new sb3_2((String)object3, (Integer)object4, (Long)object5, bl5, f6, bl6, (Boolean)object6, n3);
        eb_2.d.put(object7, object8);
        object8 = dj2_2.Companion;
        object9 = pDPStylingIdeasVideoHolder.getPdpInfoProvider();
        boolean bl9 = object9.c9();
        object2 = pDPStylingIdeasVideoHolder.getPdpInfoProvider().l6();
        object3 = pDPStylingIdeasVideoHolder.getPdpInfoProvider().x5();
        if (object3 != null) {
            string2 = ((Product)object3).getName();
        }
        string2 = String.valueOf(string2);
        object8.getClass();
        object5 = Dj2$a.a((KYPMedia)object, (String)object7, bl9, (String)object2, string2);
        pDPStylingIdeasVideoHolder2 = zv0_2.b(pDPStylingIdeasVideoHolder.getParentView().getContext());
        Intrinsics.checkNotNull(pDPStylingIdeasVideoHolder2, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        object3 = pDPStylingIdeasVideoHolder2;
        object3 = (AjioHomeActivity)((Object)pDPStylingIdeasVideoHolder2);
        object4 = ((AjioHomeActivity)object3).T0;
        string5 = Reflection.getOrCreateKotlinClass(dj2_2.class).getSimpleName();
        bl6 = Boolean.FALSE;
        ((AjioHomeActivity)object3).Q1((Fragment)object4, (Fragment)object5, true, string5, bl6);
    }

    public static void b(PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder) {
        int n3;
        int n4;
        PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder2 = pDPStylingIdeasVideoHolder;
        Intrinsics.checkNotNullParameter(pDPStylingIdeasVideoHolder, "this$0");
        pDPStylingIdeasVideoHolder.F = true;
        int n7 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer().r;
        Object object = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        Object object2 = ((ow_0)object).a(n7);
        if (object2 != null && (n4 = object2.isPlaying()) != 0) {
            object2.pause();
        }
        object2 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        ((ma_2)object2).r = n4 = pDPStylingIdeasVideoHolder.getModelPosition();
        object2 = pDPStylingIdeasVideoHolder2.n;
        n4 = 0;
        object = null;
        Object object3 = "imgReplay";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n7 = 0;
            object2 = null;
        }
        ai0_2.i((View)object2);
        object2 = pDPStylingIdeasVideoHolder2.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n7 = 0;
            object2 = null;
        }
        ai0_2.i((View)object2);
        object2 = pDPStylingIdeasVideoHolder2.i;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            n7 = 0;
            object2 = null;
        }
        ai0_2.B((View)object2);
        object2 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        n7 = ((ma_2)object2).r;
        object3 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer().a(n7);
        if (object3 != null) {
            object3 = object3.getCurrentMediaItem();
        } else {
            n3 = 0;
            object3 = null;
        }
        int n8 = 0;
        Object object4 = null;
        if (object3 != null) {
            n3 = ((MediaItem)object3).hashCode();
        } else {
            n3 = 0;
            object3 = null;
        }
        Object object5 = eb_2.e;
        Object object6 = pDPStylingIdeasVideoHolder2.s;
        object5 = ((HashMap)object5).get(object6);
        if (object5 != null) {
            n8 = object5.hashCode();
        }
        if (n3 == n8) {
            object = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
            object2 = ((ow_0)object).a(n7);
            if (object2 != null) {
                long l2 = 0L;
                object2.seekTo(l2);
            }
        } else {
            object2 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
            n3 = pDPStylingIdeasVideoHolder.getModelPosition();
            object4 = pDPStylingIdeasVideoHolder2.g;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerView");
                n8 = 0;
                object4 = null;
            }
            object5 = pDPStylingIdeasVideoHolder2.v;
            object = pDPStylingIdeasVideoHolder2.s;
            String string2 = String.valueOf(object);
            int n10 = 255;
            sb3_2 sb3_22 = new sb3_2(null, null, null, false, 0.0f, null, null, n10);
            int n14 = 136;
            n4 = n3;
            object3 = object4;
            object4 = object5;
            object5 = null;
            object6 = pDPStylingIdeasVideoHolder;
            ma_2.i((ma_2)object2, n3, (PlayerView)((Object)object3), (String)object4, null, pDPStylingIdeasVideoHolder, string2, sb3_22, n14);
        }
        object = VideoComponentEvents.Companion.getInstance();
        long l3 = pDPStylingIdeasVideoHolder2.u;
        ((VideoComponentEvents)object).logReplayEvent(true, "null", false, l3, "pdp_video_interactions", "pdp_screen_interaction", "minimised");
    }

    public static void c(PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder) {
        String string2;
        Object object;
        int n3;
        Object object2;
        String string3;
        Float f5;
        float f6;
        int n4;
        Object object3;
        boolean bl2;
        Intrinsics.checkNotNullParameter(pDPStylingIdeasVideoHolder, "this$0");
        pDPStylingIdeasVideoHolder.C = false;
        Object object4 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        int n7 = ((ma_2)object4).r;
        Object object5 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer().a(n7);
        if (object5 != null && (bl2 = object5.isPlaying())) {
            long l2;
            object5.pause();
            object3 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
            object4 = ((ow_0)object3).e(n7);
            if (object4 == null || (object4 = ((lt2_1)object4).d) == null) {
                object4 = "";
            }
            pDPStylingIdeasVideoHolder.i((String)object4, (ExoPlayer)object5);
            object4 = VideoComponentEvents.Companion;
            object5 = ((VideoComponentEvents$Companion)object4).getInstance();
            long l3 = pDPStylingIdeasVideoHolder.u;
            long l4 = pDPStylingIdeasVideoHolder.t;
            object3 = "null";
            n4 = 0;
            f6 = 0.0f;
            f5 = null;
            string3 = "pdp_screen_interaction";
            object2 = "pdp_video_interactions";
            ((VideoComponentEvents)object5).logVideoViewTime((String)object3, false, l3, l4, string3, (String)object2);
            pDPStylingIdeasVideoHolder.t = l2 = 0L;
        }
        object4 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        ((ma_2)object4).r = n3 = pDPStylingIdeasVideoHolder.getModelPosition();
        cp_1.Companion.getClass();
        object4 = cp$a.d().getAudioSettings();
        object5 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        object3 = pDPStylingIdeasVideoHolder.v;
        n4 = pDPStylingIdeasVideoHolder.getModelPosition();
        object5.getClass();
        pDPStylingIdeasVideoHolder.s = object5 = ow_0.c(n4, (String)object3);
        object3 = eb_2.d;
        pDPStylingIdeasVideoHolder.r = object5 = (sb3_2)((HashMap)object3).get(object5);
        if (object5 != null) {
            object3 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
            f6 = ((sb3_2)object5).f;
            ((ma_2)object3).g = f5 = Float.valueOf(f6);
            ((sb3_2)object5).h = object3 = Boolean.valueOf(H);
            ((sb3_2)object5).d = bl2 = H;
        }
        if ((object5 = pDPStylingIdeasVideoHolder.r) == null) {
            string3 = null;
            object2 = null;
            n4 = 0;
            f6 = 0.0f;
            f5 = null;
            object = null;
            string2 = null;
            int n8 = 255;
            object3 = object5;
            pDPStylingIdeasVideoHolder.r = object5 = new sb3_2(null, null, null, false, 0.0f, null, null, n8);
            ((sb3_2)object5).h = object3 = ((AudioSettings)object4).getMuteOnMinimizedScreen();
            ((sb3_2)object5).g = object3 = ((AudioSettings)object4).getMuteOnFullScreen();
            object4 = ((AudioSettings)object4).getMuteOnMinimizedScreen();
            object3 = Boolean.TRUE;
            n7 = (int)(Intrinsics.areEqual(object4, object3) ? 1 : 0);
            ((sb3_2)object5).d = n7;
        }
        object3 = pDPStylingIdeasVideoHolder.getAjioVideoPlayer();
        n4 = pDPStylingIdeasVideoHolder.getModelPosition();
        object4 = pDPStylingIdeasVideoHolder.g;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            n7 = 0;
            object4 = null;
        }
        object = object4;
        string2 = pDPStylingIdeasVideoHolder.v;
        string3 = String.valueOf(pDPStylingIdeasVideoHolder.s);
        object2 = pDPStylingIdeasVideoHolder.r;
        ma_2.i((ma_2)object3, n4, (PlayerView)((Object)object), string2, null, pDPStylingIdeasVideoHolder, string3, (sb3_2)object2, 136);
    }

    public static void d(PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder) {
        long l2;
        long l3;
        boolean bl2;
        long l4;
        long l7;
        long l8;
        long l12;
        Intrinsics.checkNotNullParameter(pDPStylingIdeasVideoHolder, "this$0");
        pDPStylingIdeasVideoHolder.t = l12 = pDPStylingIdeasVideoHolder.t + 1L;
        Object object = pDPStylingIdeasVideoHolder.w;
        Runnable runnable2 = pDPStylingIdeasVideoHolder.x;
        object.postDelayed(runnable2, 1000L);
        long l14 = pDPStylingIdeasVideoHolder.t;
        long l15 = 3;
        long l16 = l15 == l14 ? 0 : (l15 < l14 ? -1 : 1);
        if (l16 <= 0 && (l8 = (l7 = l14 - (l4 = (long)5)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) {
            object.removeCallbacks(runnable2);
            object = VideoComponentEvents.Companion;
            VideoComponentEvents videoComponentEvents = ((VideoComponentEvents$Companion)object).getInstance();
            long l17 = pDPStylingIdeasVideoHolder.u;
            String string2 = "null";
            String string3 = "pdp_video_interactions";
            String string4 = "pdp_screen_interaction";
            videoComponentEvents.logVideoWatchEvent(false, string2, false, l17, string3, string4);
        }
        if ((bl2 = km_1.b((cp$a)(object = cp_1.Companion))) && (l3 = (l2 = (l12 = pDPStylingIdeasVideoHolder.t) - l15) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0 && !(bl2 = pDPStylingIdeasVideoHolder.E)) {
            pDPStylingIdeasVideoHolder.E = bl2 = true;
            pDPStylingIdeasVideoHolder.g(bl2);
        }
    }

    private final int getModelPosition() {
        int n3;
        Object object = this.G;
        int n4 = object != null && (object = ((yh2_1)object).g(n3 = 8)) != null ? (Integer)object : -1;
        return n4;
    }

    public final void Ca(boolean bl2) {
        Handler handler = this.y;
        Runnable runnable2 = this.z;
        Object object = "imgPause";
        String string2 = "imgReplay";
        String string3 = "progress";
        String string4 = "imgPlay";
        Object object2 = null;
        if (bl2) {
            Object object3 = this.q;
            if (object3 != null) {
                ai0_2.i((View)object3);
            }
            if ((object3 = this.getAjioVideoPlayer()) != null) {
                ((ma_2)object3).r();
            }
            object3 = this.m;
            String string5 = "imgVolume";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object3 = null;
            }
            ai0_2.B((View)object3);
            object3 = this.m;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object3 = null;
            }
            ai0_2.a((View)object3);
            object3 = this.k;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
                bl2 = false;
                object3 = null;
            }
            ai0_2.B((View)object3);
            object3 = this.f;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                bl2 = false;
                object3 = null;
            }
            ai0_2.i((View)object3);
            object3 = this.j;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object3 = null;
            }
            ai0_2.i((View)object3);
            object3 = this.n;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object3 = null;
            }
            ai0_2.i((View)object3);
            object3 = this.i;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object3 = null;
            }
            ai0_2.B((View)object3);
            object3 = this.h;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object3 = null;
            }
            ai0_2.i((View)object3);
            object3 = this.l;
            if (object3 == null) {
                object3 = "txtDuration";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object2 = object3;
            }
            ai0_2.B((View)object2);
            long l2 = this.t;
            long l3 = 0L;
            bl2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (!bl2) {
                object3 = this.w;
                object = this.x;
                long l4 = 1000L;
                object3.postDelayed((Runnable)object, l4);
            }
            handler.removeCallbacks(runnable2);
            l2 = 3000L;
            handler.postDelayed(runnable2, l2);
        } else {
            ImageView imageView = this.n;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                imageView = null;
            }
            if (bl2 = imageView.getVisibility()) {
                imageView = this.j;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl2 = false;
                    imageView = null;
                }
                if (bl2 = imageView.getVisibility()) {
                    imageView = this.i;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        bl2 = false;
                        imageView = null;
                    }
                    ai0_2.i((View)imageView);
                    imageView = this.h;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        bl2 = false;
                        imageView = null;
                    }
                    ai0_2.B((View)imageView);
                    imageView = this.h;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                    } else {
                        object2 = imageView;
                    }
                    ai0_2.a((View)object2);
                }
            }
            handler.removeCallbacks(runnable2);
        }
    }

    public final void F5() {
        int n3;
        int n4;
        Object object = this.f;
        int n7 = 0;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.q;
        if (object != null) {
            ai0_2.i((View)object);
        }
        if ((object = this.j) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.getAjioVideoPlayer();
        int n8 = this.getModelPosition();
        object = ((ow_0)object).f(n8);
        String string2 = "imgFullScreen";
        String string3 = "imgPause";
        String string4 = "txtDuration";
        String string5 = "imgPlay";
        String string6 = "imgVolume";
        if ((object == null || (n4 = object.isPlaying()) != (n3 = 1)) && (n4 = this.C) == 0) {
            object = this.getAjioVideoPlayer();
            n3 = this.getModelPosition();
            if ((object = ((ow_0)object).f(n3)) != null) {
                object.play();
            }
            if ((object = this.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n4 = 0;
                object = null;
            }
            ai0_2.i((View)object);
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n4 = 0;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n4 = 0;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string6);
                n4 = 0;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string6);
                n4 = 0;
                object = null;
            }
            ai0_2.a((View)object);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            ai0_2.B((View)object2);
        } else {
            n4 = this.C;
            if (n4 != 0) {
                object = this.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n4 = 0;
                    object = null;
                }
                ai0_2.B((View)object);
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object = null;
                }
                ai0_2.i((View)object);
                object = this.i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    object = null;
                }
                ai0_2.i((View)object);
                object = this.m;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string6);
                    n4 = 0;
                    object = null;
                }
                ai0_2.i((View)object);
                object = this.k;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                ai0_2.i((View)object2);
                object = this.getAjioVideoPlayer();
                n7 = this.getModelPosition();
                object = ((ow_0)object).f(n7);
                if (object != null) {
                    object.pause();
                }
                n4 = 0;
                object = null;
                this.C = false;
            }
        }
    }

    public final void M0() {
        Object object = this.l;
        TextView textView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.j;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            textView = object;
        }
        ai0_2.i((View)textView);
    }

    public final void X4() {
    }

    public final void Z1() {
        Object object = this.l;
        TextView textView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.y;
        Runnable runnable2 = this.z;
        object.removeCallbacks(runnable2);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        ai0_2.k((View)object);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
            object = null;
        }
        ai0_2.k((View)object);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.n;
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
            textView = object;
        }
        ai0_2.B((View)textView);
    }

    public final void e(boolean bl2) {
        String string2 = "imgFullScreen";
        String string3 = "imgPause";
        String string4 = "imgVolume";
        ImageView imageView = null;
        if (bl2) {
            ImageView imageView2 = this.m;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                imageView2 = null;
            }
            ai0_2.k((View)imageView2);
            imageView2 = this.i;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                imageView2 = null;
            }
            ai0_2.i((View)imageView2);
            imageView2 = this.k;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageView = imageView2;
            }
            ai0_2.k((View)imageView);
        } else {
            ImageView imageView3 = this.m;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                imageView3 = null;
            }
            ai0_2.B((View)imageView3);
            imageView3 = this.m;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                imageView3 = null;
            }
            ai0_2.a((View)imageView3);
            imageView3 = this.i;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                imageView3 = null;
            }
            ai0_2.B((View)imageView3);
            imageView3 = this.k;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageView = imageView3;
            }
            ai0_2.B((View)imageView);
        }
    }

    public final void f(Context object) {
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.fleek_row_discover_video;
        object = object.inflate(n3, (ViewGroup)this, true);
        this.setParentView((View)object);
        object = this.getParentView();
        n3 = R$id.playerView;
        object = (PlayerView)object.findViewById(n3);
        this.g = object;
        object = this.getParentView();
        n3 = R$id.imgThumbnail;
        object = (ImageView)object.findViewById(n3);
        this.f = object;
        object = this.getParentView();
        n3 = R$id.imgPlay;
        object = (ImageView)object.findViewById(n3);
        this.h = object;
        object = this.getParentView();
        n3 = R$id.imgPause;
        object = (ImageView)object.findViewById(n3);
        this.i = object;
        object = this.getParentView();
        n3 = R$id.progress;
        object = (ProgressBar)object.findViewById(n3);
        this.j = object;
        object = this.g;
        String string2 = "playerView";
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        int n4 = R$id.imgFullScreen;
        object = (ImageView)object.findViewById(n4);
        this.k = object;
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        n4 = R$id.imgVolume;
        object = (ImageView)object.findViewById(n4);
        this.m = object;
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        n3 = R$id.txtDuration;
        object = (TextView)object.findViewById(n3);
        this.l = object;
        object = this.getParentView();
        n3 = R$id.imgReplay;
        object = (ImageView)object.findViewById(n3);
        this.n = object;
        object = this.getParentView();
        n3 = R$id.video_discover_brand;
        object = (ConstraintLayout)object.findViewById(n3);
        this.o = object;
        object = this.getParentView();
        n3 = R$id.txt_product_count;
        object = (TextView)object.findViewById(n3);
        this.p = object;
        object = this.getParentView();
        n3 = R$id.constraint_product_view;
        object = (ConstraintLayout)object.findViewById(n3);
        this.q = object;
        object = this.o;
        string2 = "discoverVideoView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        object = object.getLayoutParams();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        object = (ConstraintLayout$LayoutParams)((Object)object);
        Object object3 = this.a;
        if (object3 == null || (object3 = ((PostsResponse$Component)object3).getSubcomponent()) == null || (object3 = (PostsResponse$Component$Subcomponent)object3.get(0)) == null || (object3 = ((PostsResponse$Component$Subcomponent)object3).getMedia()) == null || (object3 = (PostsResponse$Component$Subcomponent$Media)CollectionsKt.N(0, (List)object3)) == null || (object3 = ((PostsResponse$Component$Subcomponent$Media)object3).getMetadata()) == null || (object3 = ((PostsResponse$Component$Subcomponent$Media$Metadata)object3).getAspectRatio()) == null) {
            object3 = "1:1";
        }
        object.G = object3;
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        ai0_2.B((View)object2);
    }

    public final void g(boolean bl2) {
        Object object;
        int n3 = 0;
        Object object2 = null;
        boolean bl4 = true;
        if (bl2) {
            bl2 = this.F;
            if (bl2) {
                this.A = bl2 = this.A ^ bl4;
            } else {
                object = this.r;
                if (object != null && (bl2 = ((sb3_2)object).d) == bl4) {
                    n3 = 1;
                }
                this.A = n3;
            }
        } else {
            object = this.r;
            if (object != null && (bl2 = ((sb3_2)object).d) == bl4) {
                n3 = 1;
            }
            this.A = n3;
        }
        bl2 = this.A;
        object2 = "imgVolume";
        Object object3 = null;
        if (bl2) {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            int bl3 = R$string.video_mute;
            Object object4 = hv3_0.K(bl3);
            object.setContentDescription((CharSequence)object4);
            object = this.getAjioVideoPlayer();
            object4 = this.getAjioVideoPlayer();
            ma_2 ma_22 = this.getAjioVideoPlayer();
            int n4 = ma_22.r;
            object4 = ((ow_0)object4).a(n4);
            ma_2.p((ma_2)object, (ExoPlayer)object4);
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            object = this.getParentView().getContext();
            n3 = R$drawable.ic_pdp_video_unmute;
            object = xn.a((Context)object, n3);
            object3.setImageDrawable((Drawable)object);
        } else {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            int n7 = R$string.video_unmute;
            Object object5 = hv3_0.K(n7);
            object.setContentDescription((CharSequence)object5);
            object = this.getAjioVideoPlayer();
            object5 = this.getAjioVideoPlayer();
            ma_2 ma_23 = this.getAjioVideoPlayer();
            int n8 = ma_23.r;
            object5 = ((ow_0)object5).a(n8);
            ((ma_2)object).k((ExoPlayer)object5);
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            object = this.getParentView().getContext();
            n3 = R$drawable.ic_pdp_video_mute;
            object = xn.a((Context)object, n3);
            object3.setImageDrawable((Drawable)object);
        }
        this.A = bl2 = this.A ^ bl4;
        H = bl2;
        object2 = this.r;
        if (object2 != null) {
            ((sb3_2)object2).d = bl2;
        }
        object2 = VideoComponentEvents.Companion.getInstance();
        boolean bl3 = this.A;
        long l2 = this.u;
        ((VideoComponentEvents)object2).logMuteUnMuteEvent("pdp_video_interactions", false, bl3, "null", false, l2, "pdp_screen_interaction");
    }

    public final ma_2 getAjioVideoPlayer() {
        ma_2 ma_22 = this.d;
        if (ma_22 != null) {
            return ma_22;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
        return null;
    }

    public final PostsResponse$Component getComponentItem() {
        return this.a;
    }

    public final ConstraintLayout getConstraintProductView() {
        return this.q;
    }

    public final Handler getHandlerLooper() {
        return this.y;
    }

    public final int getItemPosition() {
        return this.D;
    }

    public final long getLoadTime() {
        return this.u;
    }

    public final View getParentView() {
        View view = this.e;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parentView");
        return null;
    }

    public final yi2_1 getPdpInfoProvider() {
        yi2_1 yi2_12 = this.c;
        if (yi2_12 != null) {
            return yi2_12;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pdpInfoProvider");
        return null;
    }

    public final bf3_1 getStylishIdeasCallback() {
        return this.b;
    }

    public final void h(boolean n3) {
        this.C = n3;
        Object object = this.h;
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            n3 = 0;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            n3 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.y;
        Object object2 = this.z;
        object.removeCallbacks((Runnable)object2);
        object = this.getAjioVideoPlayer();
        int n4 = this.getModelPosition();
        object = ((ow_0)object).a(n4);
        if (object != null && (n3 = object.isPlaying()) == (n4 = 1)) {
            object = this.getAjioVideoPlayer();
            n4 = this.getModelPosition();
            if ((object = ((ow_0)object).a(n4)) != null) {
                object.pause();
            }
            object = this.getAjioVideoPlayer();
            n4 = this.getModelPosition();
            if ((object = ((ow_0)object).e(n4)) == null || (object = ((lt2_1)object).d) == null) {
                object = "";
            }
            object2 = this.getAjioVideoPlayer();
            int n7 = this.getModelPosition();
            object2 = ((ow_0)object2).a(n7);
            this.i((String)object, (ExoPlayer)object2);
            object2 = VideoComponentEvents.Companion.getInstance();
            long l2 = this.u;
            object = this.getPdpInfoProvider();
            if (object != null) {
                object = object.l6();
            } else {
                n3 = 0;
                object = null;
            }
            String string3 = String.valueOf(object);
            object = this.getPdpInfoProvider();
            if (object != null && (object = object.x5()) != null) {
                string2 = ((Product)object).getName();
            }
            String string4 = String.valueOf(string2);
            String string5 = "null";
            String string6 = "pdp_video_interactions";
            String string7 = "pdp_screen_interaction";
            ((VideoComponentEvents)object2).logPlayPauseEvent(string5, false, l2, string3, string4, false, false, string6, string7);
        }
    }

    public final void ha() {
        long l2;
        boolean bl2;
        this.E = false;
        this.F = bl2 = true;
        this.t = l2 = 0L;
        Object object = this.n;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            bl2 = false;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            bl2 = false;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.q;
        if (object != null) {
            ai0_2.B((View)object);
        }
        if ((object = this.m) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            bl2 = false;
            object = null;
        }
        ai0_2.k((View)object);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            bl2 = false;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            bl2 = false;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            bl2 = false;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.k;
        if (object == null) {
            object = "imgFullScreen";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        ai0_2.k((View)object2);
        object = this.y;
        object2 = this.z;
        object.removeCallbacks((Runnable)object2);
    }

    public final void i(String string2, ExoPlayer exoPlayer) {
        sb3_2 sb3_22;
        float f5;
        Long l2;
        Integer n3;
        String string3 = this.v;
        boolean bl2 = false;
        float f6 = 0.0f;
        Object object = null;
        if (exoPlayer != null) {
            int n4 = exoPlayer.getCurrentMediaItemIndex();
            n3 = n4;
        } else {
            boolean bl3 = false;
            n3 = null;
        }
        if (exoPlayer != null) {
            long l3 = exoPlayer.getCurrentPosition();
            l2 = l3;
        } else {
            l2 = null;
        }
        if (exoPlayer != null) {
            f6 = exoPlayer.getVolume();
            object = Float.valueOf(f6);
        }
        boolean bl4 = Intrinsics.areEqual(object, 0.0f);
        if (exoPlayer != null) {
            f5 = exoPlayer.getVolume();
        } else {
            f5 = 0.0f;
            exoPlayer = null;
        }
        bl2 = H;
        cp_1.Companion.getClass();
        Boolean bl5 = cp$a.d().getAudioSettings().getMuteOnFullScreen();
        Boolean bl6 = bl2;
        object = sb3_22;
        this.r = sb3_22 = new sb3_2(string3, n3, l2, bl4, f5, bl5, bl6, 16);
        eb_2.d.put(string2, sb3_22);
    }

    public final void onClick(View object) {
        int n3;
        object = this.getAjioVideoPlayer();
        int n4 = this.getModelPosition();
        if ((object = ((ow_0)object).a(n4)) != null && (n3 = object.isPlaying()) == (n4 = 1)) {
            n3 = 0;
            this.e(false);
            object = this.y;
            Runnable runnable2 = this.z;
            object.removeCallbacks(runnable2);
            long l2 = 3000L;
            object.postDelayed(runnable2, l2);
        }
    }

    public final void setAjioVideoPlayer(ma_2 ma_22) {
        Intrinsics.checkNotNullParameter(ma_22, "<set-?>");
        this.d = ma_22;
    }

    public final void setComponentItem(PostsResponse$Component postsResponse$Component) {
        this.a = postsResponse$Component;
    }

    public final void setConstraintProductView(ConstraintLayout constraintLayout) {
        this.q = constraintLayout;
    }

    public void setData() {
        int n3;
        int n4;
        Object object;
        Object object2;
        int n7;
        Object object3;
        String string2;
        Object object4;
        block25: {
            int n8;
            block26: {
                int n10;
                Object object5;
                Object object6;
                block27: {
                    block28: {
                        int n14;
                        object4 = this.g;
                        string2 = "playerView";
                        object3 = null;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n7 = 0;
                            object4 = null;
                        }
                        object4 = zv0_2.b(object4.getContext());
                        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type android.app.Activity");
                        object4 = (mu1_1)((Activity)object4);
                        object2 = this.getAjioVideoPlayer().m;
                        object = new mj2_1(this);
                        object6 = new PDPStylingIdeasVideoHolder$b((mj2_1)object);
                        ((LiveData)object2).e((mu1_1)object4, (F62)object6);
                        object4 = eb_2.b();
                        this.B = object4;
                        object4 = this.h;
                        object2 = "imgPlay";
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            n7 = 0;
                            object4 = null;
                        }
                        ai0_2.B((View)object4);
                        object4 = this.B;
                        if (object4 != null && (object4 = ((yr0_1)object4).c()) != null) {
                            this.A = n7 = ((Boolean)object4).booleanValue();
                        }
                        if ((object4 = this.a) == null || (object4 = ((PostsResponse$Component)object4).getSubcomponent()) == null) break block25;
                        n4 = 0;
                        object = null;
                        if ((object4 = (PostsResponse$Component$Subcomponent)object4.get(0)) == null) break block25;
                        object5 = object6 = ((PostsResponse$Component$Subcomponent)object4).getMedia();
                        object5 = (Collection)object6;
                        n8 = 1;
                        if (object5 == null || (n14 = object5.isEmpty()) != 0 || object6 == null || (object = (PostsResponse$Component$Subcomponent$Media)object6.get(0)) == null) break block26;
                        this.v = object6 = ((PostsResponse$Component$Subcomponent$Media)object).getUrl();
                        object = ((PostsResponse$Component$Subcomponent$Media)object).getThumbnailUrl();
                        object6 = this.getAjioVideoPlayer();
                        n14 = this.getModelPosition();
                        object6 = ((ow_0)object6).e(n14);
                        object5 = "imgThumbnail";
                        if (object6 == null || (object6 = ((lt2_1)object6).b) == null || (n3 = (int)(object6.isPlaying() ? 1 : 0)) != 0) break block27;
                        object6 = this.getAjioVideoPlayer();
                        n10 = this.getModelPosition();
                        if ((object6 = ((ow_0)object6).e(n10)) == null) break block28;
                        object6 = ((lt2_1)object6).e;
                        n10 = this.getModelPosition();
                        if (object6 != null && (n3 = ((Integer)object6).intValue()) == n10) break block27;
                    }
                    if ((object6 = this.f) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        n3 = 0;
                        object6 = null;
                    }
                    ai0_2.B((View)object6);
                }
                object6 = new da$a();
                ((da$a)object6).k = n8;
                ((da$a)object6).r = n8;
                n10 = R$string.acc_banner;
                String string3 = hv3_0.K(n10);
                ((da$a)object6).b(string3);
                string3 = this.f;
                if (string3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n10 = 0;
                    string3 = null;
                }
                ((da$a)object6).n = object;
                ((da$a)object6).u = string3;
                ((da$a)object6).a();
            }
            object4 = ((PostsResponse$Component$Subcomponent)object4).getResources();
            object = object4;
            object = (Collection)object4;
            if (object != null && (n4 = object.isEmpty()) == 0 && (n4 = object4.size()) > n8) {
                object = this.q;
                if (object != null) {
                    ai0_2.B((View)object);
                }
                n7 = object4.size();
                object4 = n7;
                object = new StringBuilder();
                ((StringBuilder)object).append(object4);
                ((StringBuilder)object).append(" products");
                object4 = ((StringBuilder)object).toString();
                object = this.p;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("txtProductCount");
                    n4 = 0;
                    object = null;
                }
                if (object != null) {
                    object.setText((CharSequence)object4);
                }
                if ((object4 = this.q) != null) {
                    n3 = 2;
                    object = new gk_2(this, n3);
                    object4.setOnClickListener((View.OnClickListener)object);
                }
            }
        }
        this.getAjioVideoPlayer().q();
        object4 = this.g;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object4 = null;
        }
        object4.setOnClickListener(this);
        object4 = this.m;
        string2 = "imgVolume";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object4 = null;
        }
        object = new nj2_1(this);
        object4.setOnClickListener((View.OnClickListener)object);
        object4 = this.n;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            n7 = 0;
            object4 = null;
        }
        n3 = 1;
        object = new S62(this, n3);
        object4.setOnClickListener((View.OnClickListener)object);
        object4 = this.h;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object4 = null;
        }
        object2 = new oj2_1(this);
        object4.setOnClickListener((View.OnClickListener)object2);
        object4 = this.i;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            n7 = 0;
            object4 = null;
        }
        n4 = 1;
        object2 = new pk_1(this, n4);
        object4.setOnClickListener((View.OnClickListener)object2);
        object4 = this.k;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
            n7 = 0;
            object4 = null;
        }
        n4 = 1;
        object2 = new qk_1(this, n4);
        object4.setOnClickListener((View.OnClickListener)object2);
        n7 = (int)(this.A ? 1 : 0);
        if (n7 != 0) {
            object4 = this.m;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object4;
            }
            n7 = R$string.video_mute;
            object4 = hv3_0.K(n7);
            object3.setContentDescription((CharSequence)object4);
        } else {
            object4 = this.m;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object4;
            }
            n7 = R$string.video_unmute;
            object4 = hv3_0.K(n7);
            object3.setContentDescription((CharSequence)object4);
        }
    }

    public final void setItemPosition(int n3) {
        this.D = n3;
    }

    public final void setLoadTime(long l2) {
        this.u = l2;
    }

    public final void setParentView(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.e = view;
    }

    public final void setPdpInfoProvider(yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(yi2_12, "<set-?>");
        this.c = yi2_12;
    }

    public final void setStylishIdeasCallback(bf3_1 bf3_12) {
        this.b = bf3_12;
    }

    public final void u4() {
        ConstraintLayout constraintLayout = this.q;
        if (constraintLayout != null) {
            ai0_2.B((View)constraintLayout);
        }
        if ((constraintLayout = this.f) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            constraintLayout = null;
        }
        ai0_2.B((View)constraintLayout);
    }
}

