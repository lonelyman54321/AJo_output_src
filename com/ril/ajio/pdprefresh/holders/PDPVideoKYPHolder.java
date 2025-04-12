/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.pdprefresh.holders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder$a;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder$mMessageReceiver$1;
import com.ril.ajio.services.data.Product.KYPMedia;
import com.ril.ajio.services.data.Product.Product;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class PDPVideoKYPHolder
extends RecyclerView$B
implements pb_2,
View.OnClickListener {
    public static final PDPVideoKYPHolder$a Companion;
    public static boolean I;
    public String A;
    public long B;
    public final Handler C;
    public final rx1_0 D;
    public boolean E;
    public final HashSet F;
    public final zi2_1 G;
    public final PDPVideoKYPHolder$mMessageReceiver$1 H;
    public final View a;
    public final yi2_1 b;
    public final ma_2 c;
    public final bi2_0 d;
    public final View e;
    public final ConstraintLayout f;
    public final PlayerView g;
    public final DefaultTimeBar h;
    public final ImageView i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public final ImageView m;
    public final ImageView n;
    public final ProgressBar o;
    public final TextView p;
    public KYPMedia q;
    public VideoSetting r;
    public boolean s;
    public boolean t;
    public String u;
    public long v;
    public long w;
    public final Handler x;
    public final uj2_2 y;
    public sb3_2 z;

    static {
        PDPVideoKYPHolder$a pDPVideoKYPHolder$a;
        Companion = pDPVideoKYPHolder$a = new Object();
    }

    public PDPVideoKYPHolder(View object, yi2_1 object2, ma_2 object3, bi2_0 bi2_02) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(object3, "ajioVideoPlayer");
        String string2 = "adapter";
        Intrinsics.checkNotNullParameter(bi2_02, string2);
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = bi2_02;
        bi2_02 = Looper.getMainLooper();
        super((Looper)bi2_02);
        this.x = object3;
        object3 = new uj2_2(this);
        this.y = object3;
        bi2_02 = Looper.getMainLooper();
        object3 = new Handler((Looper)bi2_02);
        this.C = object3;
        int n3 = 1;
        object3 = new rx1_0(this, n3);
        this.D = object3;
        this.F = object3 = new HashSet();
        object2.Aa();
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.e = object;
        object2 = "parentView";
        object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.layoutVideoKyp;
        object = (ConstraintLayout)object.findViewById(n3);
        this.f = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.playerView;
        object = (PlayerView)object.findViewById(n3);
        this.g = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.exo_progress;
        object = (DefaultTimeBar)object.findViewById(n3);
        this.h = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.imgVolume;
        object = (ImageView)object.findViewById(n3);
        this.i = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.imgReplay;
        object = (ImageView)object.findViewById(n3);
        this.j = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.imgThumbnail;
        object = (ImageView)object.findViewById(n3);
        this.m = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.imgPlay;
        object = (ImageView)object.findViewById(n3);
        this.k = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.imgPause;
        object = (ImageView)object.findViewById(n3);
        this.l = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.imgFullScreen;
        object = (ImageView)object.findViewById(n3);
        this.n = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n3 = R$id.progress;
        object = (ProgressBar)object.findViewById(n3);
        this.o = object;
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        int n4 = R$id.txtDuration;
        object = (TextView)object.findViewById(n4);
        this.p = object;
        object = this.k;
        if (object == null) {
            object = "imgPlay";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        ai0_2.B(object3);
        super(this);
        this.H = object;
    }

    public final void A() {
        int n3;
        int n4;
        Object object = this.k;
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            n4 = 0;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.x;
        Object object2 = this.y;
        object.removeCallbacks((Runnable)object2);
        n4 = this.w();
        object2 = this.c;
        object = ((ow_0)object2).a(n4);
        if (object != null && (n4 = (int)(object.isPlaying() ? 1 : 0)) == (n3 = 1)) {
            n4 = this.w();
            object = ((ow_0)object2).a(n4);
            if (object != null) {
                object.pause();
            }
            if ((object = ((ow_0)object2).e(n4 = this.w())) == null || (object = ((lt2_1)object).d) == null) {
                object = "";
            }
            n3 = this.w();
            object2 = ((ow_0)object2).a(n3);
            Object object3 = this.q;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kypMedia");
                n3 = 0;
                object3 = null;
            }
            this.D((String)object, (ExoPlayer)object2, (KYPMedia)object3);
            object2 = VideoComponentEvents.Companion.getInstance();
            object3 = String.valueOf(this.u);
            long l2 = this.v;
            object = this.b;
            String string3 = object.l6();
            object = object.x5();
            if (object != null) {
                string2 = ((Product)object).getName();
            }
            String string4 = String.valueOf(string2);
            String string5 = "pdp_video_interactions";
            String string6 = "pdp_screen_interaction";
            ((VideoComponentEvents)object2).logPlayPauseEvent((String)object3, false, l2, string3, string4, false, false, string5, string6);
        }
    }

    public final void B(boolean bl2) {
        Object object;
        String string2;
        int n3;
        Object object2;
        boolean bl3;
        PDPVideoKYPHolder pDPVideoKYPHolder = this;
        Object object3 = this.j;
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            bl3 = false;
            object3 = null;
        }
        ai0_2.i((View)object3);
        object3 = pDPVideoKYPHolder.r;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoSetting");
            bl3 = false;
            object3 = null;
        }
        if (bl3 = Intrinsics.areEqual(object3 = object3.getFullScreen(), object2 = Boolean.TRUE)) {
            object3 = pDPVideoKYPHolder.n;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
                bl3 = false;
                object3 = null;
            }
            ai0_2.B((View)object3);
        }
        if ((object3 = pDPVideoKYPHolder.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            bl3 = false;
            object3 = null;
        }
        ai0_2.B((View)object3);
        object3 = pDPVideoKYPHolder.c;
        int n4 = object3.r;
        Object object5 = object3.a(n4);
        if (object5 != null) {
            object5 = object5.getCurrentMediaItem();
        } else {
            n3 = 0;
            object5 = null;
        }
        int n7 = 0;
        String string3 = null;
        if (object5 != null) {
            n3 = ((MediaItem)object5).hashCode();
        } else {
            n3 = 0;
            object5 = null;
        }
        Object object6 = eb_2.e;
        String string4 = pDPVideoKYPHolder.A;
        object6 = ((HashMap)object6).get(string4);
        if (object6 != null) {
            n7 = object6.hashCode();
        }
        if (n3 == n7) {
            if ((object3 = object3.a(n4)) != null) {
                long l2 = 0L;
                object3.seekTo(l2);
            }
        } else {
            sb3_2 sb3_22;
            n4 = this.w();
            object3 = pDPVideoKYPHolder.g;
            if (object3 == null) {
                object3 = "playerView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                object5 = null;
            } else {
                object5 = object3;
            }
            object3 = pDPVideoKYPHolder.q;
            if (object3 == null) {
                object3 = "kypMedia";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object4 = object3;
            }
            string3 = ((KYPMedia)object4).getUrl();
            string4 = String.valueOf(pDPVideoKYPHolder.A);
            string2 = null;
            int n8 = 255;
            object = sb3_22;
            sb3_22 = new sb3_2(null, null, null, false, 0.0f, null, null, n8);
            object3 = pDPVideoKYPHolder.c;
            int n10 = 136;
            object2 = object5;
            object5 = string3;
            n7 = 0;
            string3 = null;
            object6 = this;
            ma_2.i((ma_2)object3, n4, (PlayerView)((Object)object2), (String)object5, null, this, string4, sb3_22, n10);
        }
        object = VideoComponentEvents.Companion.getInstance();
        string2 = String.valueOf(pDPVideoKYPHolder.u);
        long l3 = pDPVideoKYPHolder.v;
        ((VideoComponentEvents)object).logReplayEvent(bl2, string2, false, l3, "pdp_video_interactions", "pdp_screen_interaction", "minimised");
    }

    public final void C(String string2, ExoPlayer object, KYPMedia object2) {
        float f5;
        Comparable<Boolean> comparable;
        Comparable<Boolean> comparable2;
        int n3;
        cp_1.Companion.getClass();
        Comparable<Boolean> comparable3 = cp$a.d().getAudioSettings().getMuteOnMinimizedScreen();
        Object object3 = Boolean.TRUE;
        I = n3 = Intrinsics.areEqual(comparable3, object3);
        String string3 = ((KYPMedia)object2).getUrl();
        float f6 = 0.0f;
        object2 = null;
        if (object != null) {
            n3 = object.getCurrentMediaItemIndex();
            comparable2 = comparable3 = Integer.valueOf(n3);
        } else {
            comparable2 = null;
        }
        if (object != null) {
            long l2 = object.getCurrentPosition();
            comparable = comparable3 = Long.valueOf(l2);
        } else {
            comparable = null;
        }
        if (object != null) {
            f6 = object.getVolume();
            object2 = Float.valueOf(f6);
        }
        n3 = 0;
        comparable3 = null;
        boolean bl2 = Intrinsics.areEqual((Float)object2, 0.0f);
        float f7 = object != null ? (f5 = object.getVolume()) : 0.0f;
        Boolean bl3 = cp$a.d().getAudioSettings().getMuteOnMinimizedScreen();
        Boolean bl4 = cp$a.d().getAudioSettings().getMuteOnFullScreen();
        object3 = object;
        this.z = object = new sb3_2(string3, (Integer)comparable2, (Long)comparable, bl2, f7, bl4, bl3, 16);
        eb_2.d.put(string2, object);
    }

    public final void Ca(boolean object) {
        Handler handler = this.x;
        uj2_2 uj2_22 = this.y;
        Object object2 = "imgPlay";
        String string2 = "imgPause";
        String string3 = "imgReplay";
        String string4 = "progress";
        Object object3 = null;
        if (object) {
            Object object4;
            Object object5;
            long l2 = this.v;
            long l3 = 0L;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (!object) {
                object5 = TimeUnit.MILLISECONDS;
                l2 = System.currentTimeMillis();
                long l7 = this.w;
                l2 -= l7;
                this.v = l2 = ((TimeUnit)((Object)object5)).toSeconds(l2);
                object5 = new Bundle();
                String string5 = this.u;
                object5.putString("video_name", string5);
                string5 = null;
                object5.putBoolean("is_auto_play_enabled", false);
                object4 = "video_load_time";
                l7 = this.v;
                object5.putLong((String)object4, l7);
                eb_2.f = object5;
            }
            this.c.r();
            object5 = this.i;
            object4 = "imgVolume";
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object = false;
                object5 = null;
            }
            ai0_2.B((View)object5);
            object5 = this.i;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                object = false;
                object5 = null;
            }
            ai0_2.a((View)object5);
            object5 = this.m;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                object = false;
                object5 = null;
            }
            ai0_2.i((View)object5);
            object5 = this.o;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                object = false;
                object5 = null;
            }
            ai0_2.i((View)object5);
            object5 = this.h;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekbar");
                object = false;
                object5 = null;
            }
            ai0_2.B((View)object5);
            object5 = this.r;
            string4 = "videoSetting";
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                object = false;
                object5 = null;
            }
            if (object = Intrinsics.areEqual(object5 = ((VideoSetting)object5).getShowTimestamp(), object4 = Boolean.TRUE)) {
                object5 = this.p;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
                    object = false;
                    object5 = null;
                }
                ai0_2.B((View)object5);
            }
            if ((object5 = this.j) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object = false;
                object5 = null;
            }
            ai0_2.i((View)object5);
            object5 = this.l;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = false;
                object5 = null;
            }
            ai0_2.B((View)object5);
            object5 = this.k;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object = false;
                object5 = null;
            }
            ai0_2.i((View)object5);
            long l8 = this.B;
            object = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1);
            if (!object) {
                object5 = this.C;
                object2 = this.D;
                long l12 = 1000L;
                object5.postDelayed((Runnable)object2, l12);
            }
            if ((object5 = this.r) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                object = false;
                object5 = null;
            }
            if (object = Intrinsics.areEqual(object5 = ((VideoSetting)object5).getFullScreen(), object4)) {
                object5 = this.n;
                if (object5 == null) {
                    object5 = "imgFullScreen";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                } else {
                    object3 = object5;
                }
                ai0_2.B((View)object3);
            }
            handler.removeCallbacks((Runnable)uj2_22);
            l8 = 3000L;
            handler.postDelayed((Runnable)uj2_22, l8);
        } else {
            ImageView imageView = this.j;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object = false;
                imageView = null;
            }
            if (object = imageView.getVisibility()) {
                imageView = this.o;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    object = false;
                    imageView = null;
                }
                if (object = imageView.getVisibility()) {
                    imageView = this.l;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object = false;
                        imageView = null;
                    }
                    ai0_2.i((View)imageView);
                    imageView = this.k;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = imageView;
                    }
                    ai0_2.B((View)object3);
                }
            }
            handler.removeCallbacks((Runnable)uj2_22);
        }
    }

    public final void D(String string2, ExoPlayer exoPlayer, KYPMedia object) {
        float f5;
        Number number;
        Integer n3;
        Object object2;
        int n4;
        String string3 = ((KYPMedia)object).getUrl();
        float f6 = 0.0f;
        object = null;
        if (exoPlayer != null) {
            n4 = exoPlayer.getCurrentMediaItemIndex();
            object2 = n4;
            n3 = object2;
        } else {
            n3 = null;
        }
        if (exoPlayer != null) {
            long l2 = exoPlayer.getCurrentPosition();
            object2 = l2;
            number = object2;
        } else {
            number = null;
        }
        if (exoPlayer != null) {
            f6 = exoPlayer.getVolume();
            object = Float.valueOf(f6);
        }
        n4 = 0;
        object2 = null;
        boolean bl2 = Intrinsics.areEqual((Float)object, 0.0f);
        float f7 = exoPlayer != null ? (f5 = exoPlayer.getVolume()) : 0.0f;
        boolean bl3 = I;
        cp_1.Companion.getClass();
        Boolean bl4 = cp$a.d().getAudioSettings().getMuteOnFullScreen();
        Boolean bl5 = bl3;
        object2 = object;
        this.z = object = new sb3_2(string3, n3, (Long)number, bl2, f7, bl4, bl5, 16);
        eb_2.d.put(string2, object);
    }

    public final void F5() {
        int n3;
        int n4 = this.w();
        Object object = this.c;
        Object object2 = ((ow_0)object).f(n4);
        String string2 = "imgPlay";
        ExoPlayer exoPlayer = null;
        if (object2 == null || (n4 = (int)(object2.isPlaying() ? 1 : 0)) != (n3 = 1)) {
            Boolean bl2;
            n4 = this.w();
            object2 = ((ow_0)object).f(n4);
            if (object2 != null) {
                object2.play();
            }
            if ((object2 = this.m) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                n4 = 0;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = this.o;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progress");
                n4 = 0;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = this.k;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = this.l;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgPause");
                n4 = 0;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = this.i;
            object = "imgVolume";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n4 = 0;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = this.i;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n4 = 0;
                object2 = null;
            }
            ai0_2.a((View)object2);
            object2 = this.r;
            object = "videoSetting";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n4 = 0;
                object2 = null;
            }
            if ((n4 = (int)(Intrinsics.areEqual(object2 = ((VideoSetting)object2).getFullScreen(), bl2 = Boolean.TRUE) ? 1 : 0)) != 0) {
                object2 = this.n;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
                    n4 = 0;
                    object2 = null;
                }
                ai0_2.B((View)object2);
            }
            if ((object2 = this.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekbar");
                n4 = 0;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = this.r;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n4 = 0;
                object2 = null;
            }
            if ((n4 = (int)(Intrinsics.areEqual(object2 = ((VideoSetting)object2).getShowTimestamp(), bl2) ? 1 : 0)) != 0) {
                object2 = this.p;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
                    n4 = 0;
                    object2 = null;
                }
                ai0_2.B((View)object2);
            }
        }
        if ((object2 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            exoPlayer = object2;
        }
        ai0_2.B((View)exoPlayer);
    }

    public final void M0() {
        Object object = this.k;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.o;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        ai0_2.i((View)imageView);
    }

    public final void X4() {
    }

    public final void Z1() {
        Object object = this.x;
        uj2_2 uj2_22 = this.y;
        object.removeCallbacks((Runnable)uj2_22);
        object = this.i;
        uj2_22 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        ai0_2.k((View)object);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.o;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            uj2_22 = object;
        }
        ai0_2.B((View)uj2_22);
    }

    public final void ha() {
        Boolean bl2;
        boolean bl3;
        long l2;
        this.E = true;
        this.s = false;
        this.B = l2 = 0L;
        Object object = this.j;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            bl3 = false;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            bl3 = false;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            bl3 = false;
            object = null;
        }
        ai0_2.k((View)object);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            bl3 = false;
            object = null;
        }
        ai0_2.k((View)object);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            bl3 = false;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            bl3 = false;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
            bl3 = false;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.r;
        String string2 = "videoSetting";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl3 = false;
            object = null;
        }
        if (bl3 = Intrinsics.areEqual(object = ((VideoSetting)object).getShowTimestamp(), bl2 = Boolean.TRUE)) {
            object = this.p;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
                bl3 = false;
                object = null;
            }
            ai0_2.B((View)object);
        }
        object = this.x;
        uj2_2 uj2_22 = this.y;
        object.removeCallbacks((Runnable)uj2_22);
        object = this.r;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        object = ((VideoSetting)object2).getLoop();
        bl3 = Intrinsics.areEqual(object, bl2);
        if (bl3) {
            this.B(false);
        }
    }

    public final void onClick(View object) {
        int n3;
        object = this.c;
        int n4 = this.w();
        if ((object = ((ow_0)object).a(n4)) != null && (n3 = object.isPlaying()) == (n4 = 1)) {
            n3 = 0;
            this.x(false);
            object = this.x;
            uj2_2 uj2_22 = this.y;
            object.removeCallbacks((Runnable)uj2_22);
            long l2 = 3000L;
            object.postDelayed((Runnable)uj2_22, l2);
        }
    }

    public final void u4() {
        ImageView imageView = this.m;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            imageView = null;
        }
        ai0_2.B((View)imageView);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int w() {
        Object object = this.d;
        if (object == null) return -1;
        object = ((bi2_0)object).d;
        int n3 = 2;
        Integer n4 = n3;
        if ((object = (Integer)((HashMap)object).get(n4)) == null) return -1;
        return (Integer)object;
    }

    public final void x(boolean bl2) {
        String string2 = "imgPause";
        String string3 = "imgFullScreen";
        Object object = "videoSetting";
        String string4 = "seekbar";
        String string5 = "imgVolume";
        Object object2 = null;
        if (bl2) {
            Object object3 = this.h;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object3 = null;
            }
            ai0_2.k((View)object3);
            object3 = this.r;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object3 = null;
            }
            if (bl2 = Intrinsics.areEqual(object3 = ((VideoSetting)object3).getFullScreen(), object = Boolean.TRUE)) {
                object3 = this.n;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl2 = false;
                    object3 = null;
                }
                ai0_2.k((View)object3);
            }
            if ((object3 = this.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object3 = null;
            }
            ai0_2.k((View)object3);
            object3 = this.l;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object3;
            }
            ai0_2.i((View)object2);
        } else {
            Object object4 = this.h;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object4 = null;
            }
            ai0_2.B((View)object4);
            object4 = this.r;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object4 = null;
            }
            if (bl2 = Intrinsics.areEqual(object4 = ((VideoSetting)object4).getFullScreen(), object = Boolean.TRUE)) {
                object4 = this.n;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl2 = false;
                    object4 = null;
                }
                ai0_2.B((View)object4);
            }
            if ((object4 = this.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object4 = null;
            }
            ai0_2.B((View)object4);
            object4 = this.i;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object4 = null;
            }
            ai0_2.a((View)object4);
            object4 = this.l;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object4;
            }
            ai0_2.B((View)object2);
        }
    }

    public final void y() {
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
        String string2 = String.valueOf(this.u);
        long l2 = this.v;
        long l3 = this.B;
        videoComponentEvents.logVideoViewTime(string2, false, l2, l3, "pdp_screen_interaction", "pdp_video_interactions");
        this.B = 0L;
    }

    public final void z(boolean bl2) {
        boolean bl3;
        Object object;
        boolean bl4 = false;
        Object object2 = null;
        boolean bl5 = true;
        if (bl2) {
            boolean bl6 = this.E;
            if (bl6) {
                boolean bl7;
                this.t = bl7 = this.t ^ bl5;
            } else {
                boolean bl8;
                object = this.z;
                if (object != null && (bl8 = ((sb3_2)object).d) == bl5) {
                    bl4 = true;
                }
                this.t = bl4;
            }
        } else {
            boolean bl9;
            object = this.z;
            if (object != null && (bl9 = ((sb3_2)object).d) == bl5) {
                bl4 = true;
            }
            this.t = bl4;
        }
        boolean bl10 = this.t;
        object2 = "parentView";
        String string2 = "imgVolume";
        ma_2 ma_22 = this.c;
        String string3 = null;
        if (bl10) {
            int n3 = ma_22.r;
            object = ma_22.a(n3);
            ma_2.p(ma_22, (ExoPlayer)object);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl11 = false;
                object = null;
            }
            if ((string2 = this.e) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                string3 = string2;
            }
            object2 = string3.getContext();
            int n4 = R$drawable.ic_pdp_video_unmute;
            object2 = xn.a((Context)object2, n4);
            object.setImageDrawable((Drawable)object2);
        } else {
            int n7 = ma_22.r;
            object = ma_22.a(n7);
            ma_22.k((ExoPlayer)object);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl12 = false;
                object = null;
            }
            if ((string2 = this.e) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                string3 = string2;
            }
            object2 = string3.getContext();
            int n8 = R$drawable.ic_pdp_video_mute;
            object2 = xn.a((Context)object2, n8);
            object.setImageDrawable((Drawable)object2);
        }
        this.t = bl3 = this.t ^ bl5;
        I = bl3;
        object2 = this.z;
        if (object2 != null) {
            ((sb3_2)object2).d = bl3;
        }
        object2 = VideoComponentEvents.Companion.getInstance();
        boolean bl13 = this.t;
        string3 = String.valueOf(this.u);
        long l2 = this.v;
        ((VideoComponentEvents)object2).logMuteUnMuteEvent("pdp_video_interactions", false, bl13, string3, false, l2, "pdp_screen_interaction");
    }
}

