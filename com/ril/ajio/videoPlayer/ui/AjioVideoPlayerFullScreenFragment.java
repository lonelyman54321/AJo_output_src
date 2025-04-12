/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 *  android.widget.TextView
 */
package com.ril.ajio.videoPlayer.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment$a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class AjioVideoPlayerFullScreenFragment
extends b51_0
implements pb_2,
View.OnTouchListener {
    public static final AjioVideoPlayerFullScreenFragment$a Companion;
    public CTASettings A;
    public boolean B;
    public final int C;
    public long D;
    public long E;
    public BannerData F;
    public long G;
    public final Handler H;
    public final wb_2 I;
    public boolean J;
    public boolean K;
    public final xb_2 L;
    public Rect M;
    public final yb_2 N;
    public final Handler O;
    public boolean f;
    public PlayerView g;
    public SeekBar h;
    public ImageView i;
    public View j;
    public View k;
    public ImageView l;
    public ImageView m;
    public TextView n;
    public ImageView o;
    public ConstraintLayout p;
    public ImageView q;
    public ProgressBar r;
    public ob_2 s;
    public AjioButton t;
    public String u;
    public String v;
    public int w;
    public long x;
    public boolean y;
    public sb3_2 z;

    static {
        AjioVideoPlayerFullScreenFragment$a ajioVideoPlayerFullScreenFragment$a;
        Companion = ajioVideoPlayerFullScreenFragment$a = new Object();
    }

    public AjioVideoPlayerFullScreenFragment() {
        Object object = "";
        this.u = object;
        this.v = object;
        this.C = 500;
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.H = object;
        this.I = object = new wb_2(this);
        this.L = object = new xb_2(this);
        this.N = object = new yb_2(this);
        looper = Looper.getMainLooper();
        object = new Handler(looper);
        this.O = object;
    }

    public final void Ca(boolean object) {
        if (object) {
            Object object2;
            long l2 = this.D;
            long l3 = 0L;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (!object) {
                object2 = TimeUnit.MILLISECONDS;
                l2 = System.currentTimeMillis();
                l3 = this.E;
                l2 -= l3;
                this.D = l2 = object2.toSeconds(l2);
            }
            object2 = this.o;
            Object object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                object = false;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = this.i;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
                object = false;
                object2 = null;
            }
            object2.setVisibility(0);
            object2 = this.r;
            if (object2 == null) {
                object2 = "progress";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object2;
            }
            object = 8;
            object3.setVisibility((int)object);
            object2 = this.H;
            object3 = this.I;
            long l7 = 1000L;
            object2.postDelayed((Runnable)object3, l7);
        }
    }

    public final void F5() {
        Object object = this.s;
        ob_2 ob_22 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
            object = null;
        }
        ((ob_2)object).k();
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            object = null;
        }
        int n3 = 0;
        object.setVisibility(0);
        object = this.i;
        String string2 = "imgVolume";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        object.setVisibility(0);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        ai0_2.a((View)object);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object = null;
        }
        object.setVisibility(0);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            object = null;
        }
        n3 = 8;
        object.setVisibility(n3);
        object = this.r;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            ob_22 = object;
        }
        ob_22.setVisibility(n3);
    }

    public final void M0() {
        Object object = this.r;
        ProgressBar progressBar = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            object = null;
        }
        int n3 = 8;
        object.setVisibility(n3);
        object = this.o;
        if (object == null) {
            object = "imgThumbnail";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            progressBar = object;
        }
        progressBar.setVisibility(0);
    }

    public final void Pa() {
        boolean bl2;
        Object object = eb_2.c;
        Object object2 = this.v;
        if ((object2 = (sb3_2)((HashMap)object).get(object2)) != null) {
            this.z = object2;
        }
        object2 = this.v;
        if ((object2 = (sb3_2)((HashMap)object).get(object2)) != null) {
            object2 = ((sb3_2)object2).a;
        } else {
            bl2 = false;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        this.u = object2;
        object2 = this.v;
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
        this.y = bl2;
        object2 = this.v;
        object2 = (sb3_2)((HashMap)object).get(object2);
        long l2 = object2 != null && (object2 = ((sb3_2)object2).c) != null ? (Long)object2 : 0L;
        this.x = l2;
        object2 = this.v;
        object = (sb3_2)((HashMap)object).get(object2);
        if (object != null && (object = ((sb3_2)object).b) != null) {
            n3 = (Integer)object;
        }
        this.w = n3;
    }

    public final void Qa(CTASettings object) {
        boolean bl2;
        Object object2;
        Object object3 = null;
        if (object != null) {
            object2 = ((CTASettings)object).getCtaText();
        } else {
            bl2 = false;
            object2 = null;
        }
        String string2 = "btnShop";
        if (object2 != null && (bl2 = object2.length())) {
            int n3;
            Object object4;
            object2 = this.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = this.t;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            if (object != null) {
                object4 = ((CTASettings)object).getCtaText();
            } else {
                n3 = 0;
                object4 = null;
            }
            object2.setText((CharSequence)object4);
            bl2 = true;
            if (object != null && (object4 = ((CTASettings)object).getBgColor()) != null) {
                AjioButton ajioButton = this.t;
                if (ajioButton == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    ajioButton = null;
                }
                n3 = fy_1.a((String)object4, bl2);
                object4 = ColorStateList.valueOf((int)n3);
                ViewCompat.u((View)ajioButton, (ColorStateList)object4);
            }
            if (object != null && (object = ((CTASettings)object).getTextColor()) != null) {
                object4 = this.t;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object4;
                }
                int n4 = fy_1.a((String)object, bl2);
                object3.setTextColor(n4);
            }
        } else {
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            ai0_2.i((View)object3);
        }
    }

    public final void Ra() {
        ob_2 ob_22;
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        PlayerView playerView = this.g;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        String string2 = this.u;
        this.s = ob_22 = new ob_2(context, playerView, this, string2);
        ob_22.g = true;
    }

    public final void Sa() {
        int n3 = 0;
        ImageView imageView = null;
        int n4 = 1;
        int n7 = this.y;
        String string2 = "ajioVideoPlayer is not initialized";
        String string3 = "Error";
        String string4 = "imgVolume";
        ImageView imageView2 = null;
        if (n7 != 0) {
            Object object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n7 = 0;
                object = null;
            }
            int n8 = R$string.video_mute;
            Object[] objectArray = hv3_0.K(n8);
            object.setContentDescription((CharSequence)objectArray);
            object = this.s;
            if (object != null) {
                ((ob_2)object).n();
            } else {
                object = yn3_0.a;
                objectArray = new Object[n4];
                objectArray[0] = string2;
                ((yn3$a)object).d(string3, objectArray);
            }
            imageView = this.i;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
            } else {
                imageView2 = imageView;
            }
            imageView = this.requireContext();
            n7 = R$drawable.volume_on;
            imageView = xn.a((Context)imageView, n7);
            imageView2.setImageDrawable((Drawable)imageView);
        } else {
            Object object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n7 = 0;
                object = null;
            }
            int n10 = R$string.video_unmute;
            Object[] objectArray = hv3_0.K(n10);
            object.setContentDescription((CharSequence)objectArray);
            object = this.s;
            if (object != null) {
                ((ob_2)object).i();
            } else {
                object = yn3_0.a;
                objectArray = new Object[n4];
                objectArray[0] = string2;
                ((yn3$a)object).d(string3, objectArray);
            }
            imageView = this.i;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
            } else {
                imageView2 = imageView;
            }
            imageView = this.requireContext();
            n7 = R$drawable.volume_off;
            imageView = xn.a((Context)imageView, n7);
            imageView2.setImageDrawable((Drawable)imageView);
        }
        n3 = this.y ^ n4;
        this.y = n3;
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
        boolean bl2 = this.y;
        string4 = ai0_2.h(this.u);
        long l2 = this.D;
        videoComponentEvents.logMuteUnMuteEvent("", true, bl2, string4, true, l2, "video_screen_interaction");
    }

    public final void Ta() {
        boolean bl2;
        Object object = this.h;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            bl2 = false;
            object = null;
        }
        int n3 = 0;
        String string2 = null;
        object.setVisibility(0);
        object = this.i;
        String string3 = "imgVolume";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            bl2 = false;
            object = null;
        }
        object.setVisibility(0);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            bl2 = false;
            object = null;
        }
        ai0_2.a((View)object);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            bl2 = false;
            object = null;
        }
        object.setVisibility(0);
        object = this.A;
        this.Qa((CTASettings)object);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgClose");
            bl2 = false;
            object = null;
        }
        object.setVisibility(0);
        object = this.r;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            bl2 = false;
            object = null;
        }
        n3 = 8;
        object.setVisibility(n3);
        bl2 = this.B;
        if (bl2) {
            object = this.s;
            string2 = "ajioVideoPlayer";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            object = ((ob_2)object).i;
            boolean bl3 = true;
            if (object == null || (bl2 = ((b)object).isPlaying()) != bl3) {
                object = this.s;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                object = ((ob_2)object2).i;
                if (object != null) {
                    object.setPlayWhenReady(bl3);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Ua() {
        long l2;
        boolean bl2;
        Object object;
        Object object2 = VideoComponentEvents.Companion.getInstance();
        Object object3 = this.F;
        if (object3 == null || (object3 = ((BannerData)object3).getBannerUrl()) == null || (object3 = ai0_2.h((String)object3)) == null) {
            object3 = "";
        }
        Object object4 = object3;
        long l3 = this.D;
        object3 = this.s;
        String string2 = "ajioVideoPlayer";
        Object object5 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object3 = null;
        }
        if ((object = this.F) != null) {
            object = ((BannerData)object).getVideoSettings();
        } else {
            bl2 = false;
            object = null;
        }
        object3.getClass();
        bl2 = ow_0.g((VideoSetting)object);
        long l4 = this.G;
        String string3 = "video_screen_interaction";
        String string4 = "video_banner_interactions";
        ((VideoComponentEvents)object2).logVideoViewTime((String)object4, bl2, l3, l4, string3, string4);
        this.G = l2 = 0L;
        object3 = this.H;
        object2 = this.I;
        object3.removeCallbacks((Runnable)object2);
        object3 = this.s;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object5 = object3;
        }
        ((ob_2)object5).l();
    }

    public final void Va() {
        boolean bl2 = this.J;
        PlayerView playerView = null;
        String string2 = "playerView";
        if (bl2) {
            PlayerView playerView2 = this.g;
            if (playerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                playerView = playerView2;
            }
            playerView.hideController();
        } else {
            PlayerView playerView3 = this.g;
            if (playerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                playerView = playerView3;
            }
            playerView.showController();
        }
        this.J = bl2 = this.J ^ true;
    }

    public final void X4() {
    }

    public final void Z1() {
        Object object = this.i;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        int n3 = 4;
        object.setVisibility(n3);
        object = this.r;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            object = null;
        }
        n3 = 0;
        object.setVisibility(0);
        object = this.o;
        if (object == null) {
            object = "imgThumbnail";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        imageView.setVisibility(0);
    }

    public final void ha() {
        int n3;
        Object object = this.m;
        Object object2 = "imgReplay";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        object.setVisibility(0);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            n3 = 0;
            object = null;
        }
        object.setVisibility(0);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            n3 = 0;
            object = null;
        }
        int n4 = 4;
        object.setVisibility(n4);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            n3 = 0;
            object = null;
        }
        n4 = 8;
        object.setVisibility(n4);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            n3 = 0;
            object = null;
        }
        object.setVisibility(n4);
        this.f = false;
        object = this.A;
        if (object != null) {
            object = ((CTASettings)object).getCtaText();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            object3 = null;
            object2 = new tb_2(this, 0);
            object.post((Runnable)object2);
        } else {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            ai0_2.a((View)object3);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        long l2 = this.E;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            this.E = l2 = System.currentTimeMillis();
        }
        l4 = R$layout.activity_ajio_video_player;
        return layoutInflater.inflate((int)l4, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        int n3 = this.B;
        if (n3 != 0) {
            Object object = this.z;
            String string2 = "videoModel";
            Object object2 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            Object object3 = this.u;
            ((sb3_2)object).a = object3;
            object = this.z;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object3 = this.s;
            Object object4 = "ajioVideoPlayer";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                boolean bl2 = false;
                object3 = null;
            }
            if ((object3 = ((ob_2)object3).i) != null) {
                int n4 = ((e)object3).getCurrentMediaItemIndex();
                object3 = n4;
            } else {
                boolean bl2 = false;
                object3 = null;
            }
            ((sb3_2)object).b = object3;
            object = this.z;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            if ((object3 = this.s) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                boolean bl3 = false;
                object3 = null;
            }
            if ((object3 = ((ob_2)object3).i) != null) {
                long l2 = ((e)object3).getCurrentPosition();
                object3 = l2;
            } else {
                boolean bl4 = false;
                object3 = null;
            }
            ((sb3_2)object).c = object3;
            object = this.z;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            boolean bl5 = this.y;
            ((sb3_2)object).g = object3 = Boolean.valueOf(bl5);
            object = eb_2.c;
            object3 = this.v;
            object4 = this.z;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object4;
            }
            ((HashMap)object).put(object3, object2);
            n3 = gz3.a;
            int n7 = 23;
            if (n3 <= n7) {
                this.Ua();
            }
        }
    }

    public final void onResume() {
        block41: {
            int n3;
            Object object;
            Object object2;
            String string2;
            float f5;
            int n4;
            Object object3;
            int n7;
            int n8;
            block40: {
                String string3;
                block37: {
                    block39: {
                        block38: {
                            super.onResume();
                            n8 = this.B;
                            n7 = 1;
                            object3 = null;
                            if (n8 == 0) break block37;
                            n8 = gz3.a;
                            n4 = 23;
                            f5 = 3.2E-44f;
                            string2 = "ajioVideoPlayer";
                            if (n8 <= n4) break block38;
                            object2 = this.s;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n8 = 0;
                                object2 = null;
                            }
                            if ((object2 = ((ob_2)object2).i) != null) break block39;
                        }
                        if ((object2 = this.s) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n8 = 0;
                            object2 = null;
                        }
                        long l2 = this.x;
                        n4 = this.w;
                        ob_2.h((ob_2)object2, l2, n4, n7);
                    }
                    if ((object2 = this.s) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n8 = 0;
                        object2 = null;
                    }
                    if ((object = this.s) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    if ((object = ((ob_2)object).i) != null) {
                        ((e)object).E();
                        f5 = ((e)object).h0;
                        object = Float.valueOf(f5);
                    } else {
                        n4 = 0;
                        object = null;
                        f5 = 0.0f;
                    }
                    Intrinsics.checkNotNull(object);
                    ((ob_2)object2).k = object;
                    n8 = (int)(this.y ? 1 : 0);
                    object = "imgVolume";
                    if (n8 != 0) {
                        object2 = this.i;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            n8 = 0;
                            object2 = null;
                        }
                        int n10 = R$string.video_unmute;
                        string3 = hv3_0.K(n10);
                        object2.setContentDescription((CharSequence)string3);
                        object2 = this.s;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n8 = 0;
                            object2 = null;
                        }
                        ((ob_2)object2).i();
                        object2 = this.i;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            n8 = 0;
                            object2 = null;
                        }
                        object = this.requireContext();
                        n3 = R$drawable.volume_off;
                        object = xn.a((Context)object, n3);
                        object2.setImageDrawable((Drawable)object);
                    } else {
                        object2 = this.i;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            n8 = 0;
                            object2 = null;
                        }
                        int n14 = R$string.video_mute;
                        string3 = hv3_0.K(n14);
                        object2.setContentDescription((CharSequence)string3);
                        object2 = this.s;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n8 = 0;
                            object2 = null;
                        }
                        ((ob_2)object2).n();
                        object2 = this.i;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            n8 = 0;
                            object2 = null;
                        }
                        object = this.requireContext();
                        n3 = R$drawable.volume_on;
                        object = xn.a((Context)object, n3);
                        object2.setImageDrawable((Drawable)object);
                    }
                }
                if ((object2 = this.F) != null) {
                    object2 = ((BannerData)object2).getBannerType();
                } else {
                    n8 = 0;
                    object2 = null;
                }
                object = "GIF";
                n3 = 0;
                string2 = null;
                n8 = (int)(kotlin.text.b.i((String)object2, (String)object, false) ? 1 : 0);
                if (n8 != 0) break block40;
                object2 = this.F;
                if (object2 != null) {
                    object2 = ((BannerData)object2).getBannerType();
                } else {
                    n8 = 0;
                    object2 = null;
                }
                string3 = "IMAGE";
                n8 = (int)(kotlin.text.b.i((String)object2, string3, false) ? 1 : 0);
                if (n8 == 0) break block41;
            }
            if ((object2 = this.F) != null) {
                object2 = ((BannerData)object2).getBannerType();
            } else {
                n8 = 0;
                object2 = null;
            }
            kotlin.text.b.i((String)object2, (String)object, false);
            object2 = new da$a();
            ((da$a)object2).k = n7;
            object = this.F;
            if (object != null) {
                object = ((BannerData)object).getExtendedUrl();
            } else {
                n4 = 0;
                object = null;
                f5 = 0.0f;
            }
            string2 = this.q;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgGifOrImage");
                n3 = 0;
                string2 = null;
            }
            ((da$a)object2).n = object;
            ((da$a)object2).u = string2;
            ((da$a)object2).v = n7;
            ((da$a)object2).a();
            object2 = this.A;
            if (object2 != null) {
                object2 = ((CTASettings)object2).getCtaText();
            } else {
                n8 = 0;
                object2 = null;
            }
            if (object2 != null && (n8 = ((String)object2).length()) != 0) {
                object2 = this.t;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnShop");
                    n8 = 0;
                    object2 = null;
                }
                ai0_2.a((View)object2);
            } else {
                object2 = this.l;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgClose");
                    n8 = 0;
                    object2 = null;
                }
                ai0_2.a((View)object2);
            }
            object2 = this.p;
            if (object2 == null) {
                object2 = "clGifOrImage";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object2;
            }
            ai0_2.B((View)object3);
        }
    }

    public final void onStart() {
        block24: {
            String string2;
            Object object;
            Object object2;
            int n3;
            int n4;
            int n7;
            block23: {
                super.onStart();
                n7 = this.B;
                if (n7 != 0) {
                    this.Pa();
                }
                n7 = gz3.a;
                n4 = 1;
                n3 = 23;
                object2 = null;
                if (n7 > n3 && (n7 = (int)(this.B ? 1 : 0)) != 0) {
                    object = this.s;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                        n7 = 0;
                        object = null;
                    }
                    long l2 = this.x;
                    n3 = this.w;
                    ob_2.h((ob_2)object, l2, n3, n4);
                }
                if ((object = this.F) != null) {
                    object = ((BannerData)object).getBannerType();
                } else {
                    n7 = 0;
                    object = null;
                }
                string2 = "GIF";
                n7 = (int)(kotlin.text.b.i((String)object, string2, false) ? 1 : 0);
                if (n7 != 0) break block23;
                object = this.F;
                if (object != null) {
                    object = ((BannerData)object).getBannerType();
                } else {
                    n7 = 0;
                    object = null;
                }
                String string3 = "IMAGE";
                n7 = (int)(kotlin.text.b.i((String)object, string3, false) ? 1 : 0);
                if (n7 == 0) break block24;
            }
            if ((object = this.F) != null) {
                object = ((BannerData)object).getBannerType();
            } else {
                n7 = 0;
                object = null;
            }
            kotlin.text.b.i((String)object, string2, false);
            object = new da$a();
            ((da$a)object).k = n4;
            ((da$a)object).r = n4;
            n4 = R$string.acc_banner;
            Object object3 = hv3_0.K(n4);
            ((da$a)object).b((String)object3);
            object3 = this.F;
            if (object3 != null) {
                object3 = ((BannerData)object3).getExtendedUrl();
            } else {
                n4 = 0;
                object3 = null;
            }
            string2 = this.q;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgGifOrImage");
                n3 = 0;
                string2 = null;
            }
            ((da$a)object).n = object3;
            ((da$a)object).u = string2;
            ((da$a)object).a();
            object = this.A;
            if (object != null) {
                object = ((CTASettings)object).getCtaText();
            } else {
                n7 = 0;
                object = null;
            }
            if (object != null && (n7 = ((String)object).length()) != 0) {
                object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnShop");
                    n7 = 0;
                    object = null;
                }
                ai0_2.a((View)object);
            } else {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgClose");
                    n7 = 0;
                    object = null;
                }
                ai0_2.a((View)object);
            }
            object = this.p;
            if (object == null) {
                object = "clGifOrImage";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            ai0_2.B((View)object2);
        }
    }

    public final void onStop() {
        int n3;
        super.onStop();
        int n4 = this.B;
        if (n4 != 0 && (n4 = gz3.a) > (n3 = 23)) {
            this.Ua();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean onTouch(View object, MotionEvent motionEvent) {
        yb_2 yb_22;
        int n3;
        Handler handler;
        xb_2 xb_22;
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
                xb_22 = this.L;
                handler = this.O;
                n3 = 1;
                string2 = "playerView";
                if (var5_12 != null && (n14 = var5_12.intValue()) == 0) {
                    void var1_4;
                    int n16;
                    void var5_15;
                    PlayerView playerView = this.g;
                    if (playerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n8 = 0;
                        Object var5_14 = null;
                    }
                    n8 = var5_15.getLeft();
                    PlayerView playerView2 = this.g;
                    if (playerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n14 = 0;
                        playerView2 = null;
                    }
                    n14 = playerView2.getTop();
                    PlayerView playerView3 = this.g;
                    if (playerView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n16 = 0;
                        playerView3 = null;
                    }
                    n16 = playerView3.getRight();
                    PlayerView playerView4 = this.g;
                    if (playerView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        PlayerView playerView5 = playerView4;
                    }
                    n10 = var1_4.getBottom();
                    this.M = rect = new Rect(n8, n14, n16, n10);
                    n10 = ViewConfiguration.getTapTimeout();
                    long l2 = n10;
                    handler.postDelayed((Runnable)xb_22, l2);
                    return n3 != 0;
                }
                yb_22 = this.N;
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
            Rect rect2 = this.M;
            Intrinsics.checkNotNull(rect2);
            PlayerView playerView = this.g;
            if (playerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                playerView = null;
            }
            n7 = playerView.getLeft();
            f5 = rect.getX();
            n4 = (int)f5;
            n7 += n4;
            PlayerView playerView6 = this.g;
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
            handler.removeCallbacks((Runnable)yb_22);
            handler.removeCallbacks((Runnable)xb_22);
            this.Ta();
            return n3 != 0;
        }
        handler.removeCallbacks((Runnable)yb_22);
        handler.removeCallbacks((Runnable)xb_22);
        this.Ta();
        return n3 != 0;
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        boolean bl3;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.requireArguments().getString("banner_data");
        Object object3 = this.requireArguments();
        String string3 = "uuid";
        object3 = object3.getString(string3);
        if (object3 == null) {
            object3 = "";
        }
        this.v = object3;
        object2 = (BannerData)Z90.a(BannerData.class, (String)object2);
        this.F = object2;
        Intrinsics.checkNotNullParameter(object, string2);
        object2 = zv0_2.b(object.getContext());
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        ((AjioHomeActivity)object2).t();
        int bl32 = R$id.playerView;
        object2 = (PlayerView)object.findViewById(bl32);
        this.g = object2;
        string2 = "playerView";
        object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            boolean bl4 = false;
            object2 = null;
        }
        int n3 = R$string.video_player;
        Object object4 = hv3_0.K(n3);
        object2.setContentDescription((CharSequence)object4);
        int n4 = R$id.seekBar;
        object2 = (SeekBar)object.findViewById(n4);
        this.h = object2;
        int n7 = R$id.imgVolume;
        object2 = (ImageView)object.findViewById(n7);
        this.i = object2;
        int n8 = R$id.overlayItem;
        object2 = object.findViewById(n8);
        this.j = object2;
        int n10 = R$id.overlayItemBottom;
        object2 = object.findViewById(n10);
        this.k = object2;
        int n14 = R$id.imgReplay;
        object2 = (ImageView)object.findViewById(n14);
        this.m = object2;
        int n15 = R$id.imgClose;
        object2 = (ImageView)object.findViewById(n15);
        this.l = object2;
        int n16 = R$id.txtDuration;
        object2 = (TextView)object.findViewById(n16);
        this.n = object2;
        int n17 = R$id.btnVideo;
        object2 = (AjioButton)object.findViewById(n17);
        this.t = object2;
        int n18 = R$id.imgThumbnail;
        object2 = (ImageView)object.findViewById(n18);
        this.o = object2;
        int n19 = R$id.clGifOrImage;
        object2 = (ConstraintLayout)object.findViewById(n19);
        this.p = object2;
        int n20 = R$id.imgGifOrImage;
        object2 = (ImageView)object.findViewById(n20);
        this.q = object2;
        int n21 = R$id.progress;
        object = (ProgressBar)object.findViewById(n21);
        this.r = object;
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            bl3 = false;
            object = null;
        }
        object2 = new Object();
        object.setOnTouchListener((View.OnTouchListener)object2);
        object = new da$a();
        ((da$a)object).k = bl2 = true;
        ((da$a)object).r = bl2;
        n3 = R$string.acc_banner;
        object4 = hv3_0.K(n3);
        ((da$a)object).b((String)object4);
        object4 = this.F;
        if (object4 != null) {
            object4 = ((BannerData)object4).getThumbnailImage();
        } else {
            n3 = 0;
            object4 = null;
        }
        Object object5 = this.o;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            object5 = null;
        }
        ((da$a)object).n = object4;
        ((da$a)object).u = object5;
        ((da$a)object).a();
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl3 = false;
            object = null;
        }
        ((PlayerView)((Object)object)).setUseController(bl2);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl3 = false;
            object = null;
        }
        n3 = 0;
        object4 = null;
        ((PlayerView)((Object)object)).setControllerAutoShow(false);
        this.A = object = eb_2.b;
        object = this.getArguments();
        if (object != null) {
            object = object.getString(string3);
        } else {
            bl3 = false;
            object = null;
        }
        this.v = object = String.valueOf(object);
        object = this.A;
        this.Qa((CTASettings)object);
        object = this.F;
        if (object != null) {
            object = ((BannerData)object).getBannerType();
        } else {
            bl3 = false;
            object = null;
        }
        bl3 = kotlin.text.b.i((String)object, "VIDEO", false);
        string3 = "imgVolume";
        object4 = "overlayItemBottom";
        object5 = "overlayItem";
        if (bl3) {
            this.B = bl2;
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl3 = false;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                bl3 = false;
                object = null;
            }
            ai0_2.B((View)object);
            this.Pa();
            this.Ra();
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl3 = false;
                object = null;
            }
            ai0_2.a((View)object);
            object = this.s;
            object2 = "ajioVideoPlayer";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl3 = false;
                object = null;
            }
            object = ((ob_2)object).n;
            Object object6 = this.getViewLifecycleOwner();
            boolean bl5 = false;
            F62 f62 = new qb_2(this, 0);
            ((LiveData)object).e((mu1_1)object6, f62);
            object = this.s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl3 = false;
                object = null;
            }
            object = ((ob_2)object).o;
            object6 = this.getViewLifecycleOwner();
            f62 = new ub_2(this);
            ((LiveData)object).e((mu1_1)object6, f62);
            object = this.s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl3 = false;
                object = null;
            }
            object = ((ob_2)object).p;
            object2 = this.getViewLifecycleOwner();
            object6 = new vb_2(this);
            ((LiveData)object).e((mu1_1)object2, (F62)object6);
            object = AnalyticsManager.Companion;
            object2 = "video banner screen";
            km_1.a((AnalyticsManager$Companion)object, (String)object2);
            long l2 = this.D;
            long l3 = 0L;
            bl5 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (!bl5) {
                object = TimeUnit.MILLISECONDS;
                l3 = System.currentTimeMillis();
                long l4 = this.E;
                this.D = l2 = ((TimeUnit)((Object)object)).toSeconds(l3 -= l4);
            }
        }
        if ((object = this.i) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            bl3 = false;
            object = null;
        }
        string3 = null;
        object2 = new zb_2(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl3 = false;
            object = null;
        }
        object2 = new ab_2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            bl3 = false;
            object = null;
        }
        string3 = null;
        object2 = new bb_2(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgClose");
            bl3 = false;
            object = null;
        }
        object2 = new cb_2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            bl3 = false;
            object = null;
        }
        string3 = null;
        object2 = new rb_2(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnShop");
            bl3 = false;
            object = null;
        }
        string3 = null;
        object2 = new sb_2(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = object;
        }
        object3.setOnTouchListener((View.OnTouchListener)this);
    }

    public final void u4() {
    }
}

