/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
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
package com.ril.ajio.videoPlayer.ui;

import android.content.Context;
import android.content.IntentFilter;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.common.b;
import androidx.media3.exoplayer.e;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment$a;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment$mMessageReceiver$1;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment$a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class AjioExoPlayerFragment
extends Fragment
implements pb_2 {
    public static final AjioExoPlayerFragment$a Companion;
    public ob_2 a;
    public nh_2 b;
    public PlayerView c;
    public ImageView d;
    public ImageView e;
    public ImageView f;
    public ImageView g;
    public ImageView h;
    public TextView i;
    public ProgressBar j;
    public sb3_2 k;
    public ConstraintLayout l;
    public ConstraintLayout m;
    public VideoSetting n;
    public AudioSettings o;
    public BannerData p;
    public g71_0 q;
    public boolean r;
    public long s;
    public long t;
    public boolean u;
    public long v;
    public final Handler w;
    public final n7_0 x;
    public boolean y;
    public final AjioExoPlayerFragment$mMessageReceiver$1 z;

    static {
        AjioExoPlayerFragment$a ajioExoPlayerFragment$a;
        Companion = ajioExoPlayerFragment$a = new Object();
    }

    public AjioExoPlayerFragment() {
        Object object;
        Looper looper = Looper.getMainLooper();
        this.w = object = new Handler(looper);
        super(this, 0);
        this.x = object;
        super(this);
        this.z = object;
    }

    public final void Ca(boolean object) {
        if (object) {
            Object object2;
            long l2 = this.s;
            long l3 = 0L;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (!object) {
                object2 = TimeUnit.MILLISECONDS;
                l2 = System.currentTimeMillis();
                l3 = this.t;
                l2 -= l3;
                this.s = l2 = object2.toSeconds(l2);
            }
            object2 = this.w;
            Object object3 = this.x;
            long l7 = 1000L;
            object2.postDelayed(object3, l7);
            object2 = this.f;
            object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
                object = false;
                object2 = null;
            }
            int n3 = 8;
            object2.setVisibility(n3);
            object2 = this.e;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
                object = false;
                object2 = null;
            }
            object2.setVisibility(n3);
            object2 = this.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                object = false;
                object2 = null;
            }
            object2.setVisibility(n3);
            object2 = this.j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progress");
                object = false;
                object2 = null;
            }
            object2.setVisibility(n3);
            object2 = this.d;
            if (object2 == null) {
                object2 = "imgVolume";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object2;
            }
            ai0_2.a((View)object3);
        }
    }

    public final void F5() {
        boolean bl2;
        boolean bl3;
        Object object = this.d;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            bl3 = false;
            object = null;
        }
        ai0_2.a((View)object);
        object = this.a;
        if (object != null && (object = ((ob_2)object).i) != null && (bl3 = ((b)object).isPlaying()) == (bl2 = true)) {
            return;
        }
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            bl3 = false;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            bl3 = false;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.j;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        ai0_2.i((View)object2);
        object = this.a;
        if (object != null) {
            ((ob_2)object).k();
        }
    }

    public final void M0() {
        Object object = this.e;
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        object.setVisibility(0);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            object = null;
        }
        object.setVisibility(0);
        object = this.j;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        imageView.setVisibility(8);
    }

    public final void Oa() {
        int n3;
        int n4;
        Object object;
        int n7 = this.isVisible();
        if (n7 != 0 && (object = this.getView()) != null && (n7 = object.isAttachedToWindow()) == (n4 = 1) && (n7 = gz3.a) > (n3 = 23)) {
            object = eb_2.a;
            object = this.p;
            n3 = 0;
            Object object2 = null;
            if (object != null) {
                object = object.getBannerType();
            } else {
                n7 = 0;
                object = null;
            }
            n7 = (int)(eb_2.e((String)object) ? 1 : 0);
            if (n7 != 0) {
                object = this.a;
                if (object != null && (n7 = (int)(ow_0.g((VideoSetting)(object = this.n)) ? 1 : 0)) == n4) {
                    boolean bl2;
                    object = eb_2.c;
                    Object object3 = this.p;
                    if (object3 != null) {
                        object3 = ((BannerData)object3).getUuid();
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    bl2 = object.containsKey(object3);
                    if (bl2) {
                        object3 = this.p;
                        if (object3 != null) {
                            object3 = ((BannerData)object3).getUuid();
                        } else {
                            bl2 = false;
                            object3 = null;
                        }
                        object = object.get(object3);
                        Intrinsics.checkNotNull(object);
                        object = (sb3_2)object;
                        this.k = object;
                    }
                    if ((object = this.d) == null) {
                        object = "imgVolume";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object2 = object;
                    }
                    ai0_2.a((View)object2);
                    object = this.a;
                    if (object != null) {
                        object2 = this.k;
                        long l2 = object2 != null && (object2 = ((sb3_2)object2).c) != null ? (Long)object2 : 0L;
                        ob_2.h((ob_2)object, l2, 0, n4);
                    }
                    this.Pa();
                } else {
                    object = this.e;
                    String string2 = "imgPlay";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n7 = 0;
                        object = null;
                    }
                    object.setVisibility(0);
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n7 = 0;
                        object = null;
                    }
                    ai0_2.a(object);
                    object = this.g;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                        n7 = 0;
                        object = null;
                    }
                    object.setVisibility(0);
                    object = this.j;
                    if (object == null) {
                        object = "progress";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object2 = object;
                    }
                    ai0_2.i((View)object2);
                }
            }
        }
    }

    public final void Pa() {
        boolean bl2;
        int n3;
        Object object;
        Object object2 = this.a;
        Object object3 = null;
        if (object2 != null) {
            object = ((ob_2)object2).i;
            if (object != null) {
                ((e)object).E();
                float f5 = ((e)object).h0;
                object = Float.valueOf(f5);
            } else {
                n3 = 0;
                object = null;
                float f6 = 0.0f;
            }
            ((ob_2)object2).k = object;
        }
        if ((object2 = this.k) != null) {
            object2 = ((sb3_2)object2).h;
            object = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object2, object);
        } else {
            bl2 = false;
            object2 = null;
        }
        object = "imgVolume";
        if (bl2) {
            object2 = this.a;
            if (object2 != null) {
                ((ob_2)object2).i();
            }
            if ((object2 = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object2 = null;
            }
            int n4 = R$string.video_unmute;
            String string2 = hv3_0.K(n4);
            object2.setContentDescription((CharSequence)string2);
            object2 = this.d;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object2;
            }
            object2 = this.requireContext();
            n3 = R$drawable.ic_mute;
            object2 = xn.a((Context)object2, n3);
            object3.setImageDrawable((Drawable)object2);
        } else {
            object2 = this.a;
            if (object2 != null) {
                ((ob_2)object2).n();
            }
            if ((object2 = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object2 = null;
            }
            int n7 = R$string.video_mute;
            String string3 = hv3_0.K(n7);
            object2.setContentDescription((CharSequence)string3);
            object2 = this.d;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object2;
            }
            object2 = this.requireContext();
            n3 = R$drawable.ic_unmute;
            object2 = xn.a((Context)object2, n3);
            object3.setImageDrawable((Drawable)object2);
        }
    }

    public final void Qa() {
        boolean bl2;
        Object object = eb_2.a;
        object = this.p;
        Object object2 = null;
        if (object != null) {
            object = ((BannerData)object).getBannerType();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = eb_2.e((String)object);
        if (bl2) {
            object = this.a;
            if (object != null) {
                ((ob_2)object).g = false;
            }
            if (object != null) {
                ((ob_2)object).j();
            }
            this.Va();
            object = this.a;
            if (object != null && !(bl2 = ow_0.g((VideoSetting)(object = this.n)))) {
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
                    bl2 = false;
                    object = null;
                }
                ai0_2.B((View)object);
                object = this.g;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                    bl2 = false;
                    object = null;
                }
                ai0_2.B((View)object);
                object = this.j;
                if (object == null) {
                    object = "progress";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object2 = object;
                }
                ai0_2.i((View)object2);
            }
        }
    }

    public final void Ra() {
        boolean bl2 = this.isAdded();
        if (bl2) {
            boolean bl3;
            Object object = eb_2.a;
            object = this.p;
            e e2 = null;
            if (object != null) {
                object = ((BannerData)object).getBannerType();
            } else {
                bl2 = false;
                object = null;
            }
            bl2 = eb_2.e((String)object);
            if (bl2 && (object = this.a) != null && (bl2 = ow_0.g((VideoSetting)(object = this.n))) == (bl3 = true)) {
                object = this.a;
                if (object != null) {
                    ((ob_2)object).g = bl3;
                }
                if (object != null) {
                    e2 = ((ob_2)object).i;
                }
                if (e2 != null) {
                    if (object != null) {
                        ((ob_2)object).k();
                    }
                } else {
                    this.Oa();
                }
            }
        }
    }

    public final void Sa() {
        String string2;
        Object object;
        Object object2;
        boolean bl2;
        float f5;
        Object object3 = this.a;
        boolean bl3 = false;
        Object object4 = null;
        if (object3 != null && (object3 = ((ob_2)object3).i) != null) {
            ((e)object3).E();
            f5 = ((e)object3).h0;
            object3 = Float.valueOf(f5);
        } else {
            bl2 = false;
            object3 = null;
            f5 = 0.0f;
        }
        boolean bl4 = Intrinsics.areEqual((Float)object3, 0.0f);
        object3 = this.k;
        if (object3 != null) {
            object3 = ((sb3_2)object3).h;
            object2 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object3, object2);
        } else {
            bl2 = false;
            f5 = 0.0f;
            object3 = null;
        }
        object2 = "imgVolume";
        if (bl2) {
            object3 = this.k;
            if (object3 != null) {
                object = Boolean.FALSE;
                ((sb3_2)object3).h = object;
            }
            if ((object3 = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object3 = null;
                f5 = 0.0f;
            }
            int n3 = R$string.video_mute;
            object = hv3_0.K(n3);
            object3.setContentDescription((CharSequence)object);
            object3 = this.a;
            if (object3 != null) {
                ((ob_2)object3).n();
            }
            if ((object3 = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object4 = object3;
            }
            object3 = this.requireContext();
            int n4 = R$drawable.ic_unmute;
            object3 = xn.a((Context)object3, n4);
            object4.setImageDrawable((Drawable)object3);
        } else {
            object3 = this.d;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object3 = null;
                f5 = 0.0f;
            }
            int n7 = R$string.video_unmute;
            object = hv3_0.K(n7);
            object3.setContentDescription((CharSequence)object);
            object3 = this.k;
            if (object3 != null) {
                ((sb3_2)object3).h = object = Boolean.TRUE;
            }
            if ((object3 = this.a) != null) {
                object = ((ob_2)object3).i;
                if (object != null) {
                    ((e)object).E();
                    float f6 = ((e)object).h0;
                    object = Float.valueOf(f6);
                } else {
                    n7 = 0;
                    object = null;
                    float f7 = 0.0f;
                }
                ((ob_2)object3).k = object;
            }
            if ((object3 = this.a) != null) {
                ((ob_2)object3).i();
            }
            if ((object3 = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object4 = object3;
            }
            object3 = this.requireContext();
            int n8 = R$drawable.ic_mute;
            object3 = xn.a((Context)object3, n8);
            object4.setImageDrawable((Drawable)object3);
        }
        object3 = this.p;
        if (object3 != null && (object3 = ((BannerData)object3).getBannerUrl()) != null && (string2 = ai0_2.h((String)object3)) != null) {
            object2 = VideoComponentEvents.Companion.getInstance();
            object3 = this.a;
            boolean bl5 = object3 != null && (bl2 = ow_0.g((VideoSetting)(object3 = this.n))) == (bl3 = true);
            long l2 = this.s;
            object = "video_banner_interactions";
            String string3 = "landing_screen_interactions";
            ((VideoComponentEvents)object2).logMuteUnMuteEvent((String)object, false, bl4, string2, bl5, l2, string3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Ta(boolean var1_1) {
        var2_2 = this.a;
        var3_3 = true;
        if (var2_2 != null) {
            var2_2.g = var3_3;
        }
        if (var2_2 != null) {
            var4_4 = 0L;
            var2_2.m(var4_4);
        }
        var6_5 = VideoComponentEvents.Companion.getInstance();
        var2_2 = this.a;
        if (var2_2 == null) ** GOTO lbl-1000
        var2_2 = this.p;
        if (var2_2 != null) {
            var2_2 = var2_2.getVideoSettings();
        } else {
            var7_6 = false;
            var2_2 = null;
        }
        var7_6 = ow_0.g((VideoSetting)var2_2);
        if (var7_6 == var3_3) {
            var8_7 = true;
        } else lbl-1000:
        // 2 sources

        {
            var8_7 = false;
        }
        var2_2 = this.p;
        if (var2_2 == null || (var2_2 = var2_2.getBannerUrl()) == null || (var2_2 = ai0_2.h((String)var2_2)) == null) {
            var2_2 = "";
        }
        var9_8 = this.s;
        var6_5.logReplayEvent(var1_1, (String)var2_2, var8_7, var9_8, "video_banner_interactions", "landing_screen_interactions", "minimised");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Ua() {
        long l2;
        Object object = VideoComponentEvents.Companion.getInstance();
        Object object2 = this.p;
        if (object2 == null || (object2 = ((BannerData)object2).getBannerUrl()) == null || (object2 = ai0_2.h((String)object2)) == null) {
            object2 = "";
        }
        Object object3 = object2;
        long l3 = this.s;
        object2 = this.a;
        boolean bl2 = false;
        if (object2 != null) {
            boolean bl3;
            object2 = this.p;
            if (object2 != null) {
                object2 = ((BannerData)object2).getVideoSettings();
            } else {
                bl3 = false;
                object2 = null;
            }
            bl3 = ow_0.g((VideoSetting)object2);
            boolean bl4 = true;
            if (bl3 == bl4) {
                bl2 = true;
            }
        }
        long l4 = this.v;
        String string2 = "landing_screen_interactions";
        String string3 = "video_banner_interactions";
        ((VideoComponentEvents)object).logVideoViewTime((String)object3, bl2, l3, l4, string2, string3);
        this.v = l2 = 0L;
        object2 = this.w;
        object = this.x;
        object2.removeCallbacks((Runnable)object);
        this.Va();
        object2 = this.a;
        if (object2 != null) {
            ((ob_2)object2).l();
        }
    }

    public final void Va() {
        boolean bl2;
        int n3;
        Object object;
        Object object2 = this.k;
        String string2 = null;
        if (object2 != null) {
            object = this.p;
            if (object != null) {
                object = ((BannerData)object).getBannerUrl();
            } else {
                n3 = 0;
                object = null;
            }
            ((sb3_2)object2).a = object;
        }
        if ((object2 = this.p) != null && (object2 = ((BannerData)object2).getVideoSettings()) != null) {
            object2 = ((VideoSetting)object2).getAutoPlay();
            object = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object2, object);
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl2) {
            object2 = this.k;
            if (object2 != null) {
                object = this.a;
                if (object != null && (object = ((ob_2)object).i) != null) {
                    n3 = ((e)object).getCurrentMediaItemIndex();
                    object = n3;
                } else {
                    n3 = 0;
                    object = null;
                }
                ((sb3_2)object2).b = object;
            }
            if ((object2 = this.a) != null && (object2 = ((ob_2)object2).i) != null) {
                long l2 = ((e)object2).getCurrentPosition();
                object2 = this.k;
                if (object2 != null) {
                    ((sb3_2)object2).c = object = Long.valueOf(l2);
                }
            }
        }
        object2 = eb_2.c;
        object = this.p;
        if (object != null) {
            string2 = ((BannerData)object).getUuid();
        }
        string2 = String.valueOf(string2);
        object = this.k;
        ((HashMap)object2).put(string2, object);
    }

    public final void Wa() {
        String string2;
        Object object;
        Object object2;
        boolean bl2;
        Object object3;
        Object object4;
        Object object5;
        AjioExoPlayerFragment ajioExoPlayerFragment = this;
        Object object6 = this.p;
        String string3 = null;
        if (object6 != null && (object6 = ((BannerData)object6).getBannerUrl()) != null && (object5 = ai0_2.h((String)object6)) != null) {
            boolean bl3;
            object4 = VideoComponentEvents.Companion.getInstance();
            object6 = this.a;
            boolean bl4 = false;
            object3 = null;
            if (object6 == null || (bl2 = ow_0.g((VideoSetting)(object6 = this.n))) != (bl3 = true)) {
                bl3 = false;
                object2 = null;
            }
            int n3 = 8;
            bl4 = true;
            long l2 = 0L;
            object = "video_banner_interactions";
            String string4 = "video_screen_interaction";
            String string5 = "full screen";
            VideoComponentEvents.logExpandMinimizeEvent$default((VideoComponentEvents)object4, bl4, (String)object5, bl3, l2, (String)object, string4, string5, n3, null);
            object6 = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object6).getInstance().getNewEEcommerceEventsRevamp();
            object5 = ((AnalyticsManager$Companion)object6).getInstance().getNewEEcommerceEventsRevamp().getEE_SELECT_PROMOTION();
            object4 = ajioExoPlayerFragment.p;
            object4 = object4 != null ? ((BannerData)object4).getBannerUrl() : null;
            object2 = String.valueOf(object4);
            string2 = bv_0.a((AnalyticsManager$Companion)object6);
            string4 = cv_0.a((AnalyticsManager$Companion)object6);
            int n4 = 3968;
            String string6 = "home landing screen";
            object = "home landing screen";
            boolean bl5 = true;
            n3 = 0;
            NewEEcommerceEventsRevamp.pushEESelectPromotion$default((NewEEcommerceEventsRevamp)object3, (String)object5, (String)object2, string6, string2, (String)object, string4, bl5, false, null, null, null, false, n4, null);
        }
        object6 = eb_2.a;
        object6 = ajioExoPlayerFragment.p;
        if (object6 != null) {
            object6 = ((BannerData)object6).getCtaSettings();
        } else {
            bl2 = false;
            object6 = null;
        }
        eb_2.b = object6;
        this.Va();
        object6 = AjioVideoPlayerFullScreenFragment.Companion;
        object4 = ajioExoPlayerFragment.p;
        if (object4 != null) {
            string3 = ((BannerData)object4).getUuid();
        }
        object6.getClass();
        object2 = AjioVideoPlayerFullScreenFragment$a.a((BannerData)object4, string3);
        object6 = this.getContext();
        Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        object3 = object6;
        object3 = (AjioHomeActivity)object6;
        object5 = ((AjioHomeActivity)object3).T0;
        string2 = Reflection.getOrCreateKotlinClass(AjioVideoPlayerFullScreenFragment.class).getSimpleName();
        object = Boolean.FALSE;
        ((AjioHomeActivity)object3).Q1((Fragment)object5, (Fragment)object2, true, string2, (Boolean)object);
    }

    public final void X4() {
    }

    public final void Z1() {
        Object object = this.j;
        ProgressBar progressBar = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.g;
        if (object == null) {
            object = "imgThumbnail";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            progressBar = object;
        }
        ai0_2.B((View)progressBar);
    }

    public final void ha() {
        boolean bl2;
        Object object;
        Object object2 = this.p;
        if (object2 != null && (object2 = ((BannerData)object2).getVideoSettings()) != null) {
            object2 = ((VideoSetting)object2).getLoop();
            object = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object2, object);
        } else {
            bl2 = false;
            object2 = null;
        }
        object = "imgReplay";
        Object object3 = null;
        if (bl2) {
            this.y = bl2 = true;
            this.Ta(false);
        } else {
            object2 = this.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object2 = null;
            }
            ai0_2.a((View)object2);
            object2 = this.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                bl2 = false;
                object2 = null;
            }
            ai0_2.B((View)object2);
        }
        object2 = this.e;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            bl2 = false;
            object2 = null;
        }
        int n3 = 8;
        object2.setVisibility(n3);
        object2 = this.f;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object2;
        }
        object3.setVisibility(0);
        this.u = false;
    }

    public final void onCreate(Bundle bundle) {
        boolean bl2;
        Boolean bl3;
        Object object;
        boolean bl4;
        Object object2;
        AjioExoPlayerFragment ajioExoPlayerFragment = this;
        super.onCreate(bundle);
        long l2 = this.t;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            this.t = l2 = System.currentTimeMillis();
        }
        Object object3 = this.requireArguments().getString("banner_data");
        ajioExoPlayerFragment.p = object3 = (BannerData)Z90.a(BannerData.class, (String)object3);
        boolean bl5 = false;
        Boolean bl6 = null;
        if (object3 != null && (object3 = ((BannerData)object3).getVideoSettings()) != null) {
            object3 = ((VideoSetting)object3).getAutoPlay();
            object2 = Boolean.TRUE;
            bl4 = Intrinsics.areEqual(object3, object2);
        } else {
            bl4 = false;
            object3 = null;
        }
        ajioExoPlayerFragment.r = bl4;
        object3 = ajioExoPlayerFragment.p;
        object2 = null;
        if (object3 != null) {
            object3 = ((BannerData)object3).getVideoSettings();
        } else {
            bl4 = false;
            object3 = null;
        }
        ajioExoPlayerFragment.n = object3;
        object3 = ajioExoPlayerFragment.p;
        if (object3 != null) {
            object3 = ((BannerData)object3).getAudioSettings();
        } else {
            bl4 = false;
            object3 = null;
        }
        ajioExoPlayerFragment.o = object3;
        object3 = ajioExoPlayerFragment.p;
        if (object3 != null && (object3 = ((BannerData)object3).getUuid()) != null) {
            object = eb_2.c;
            if ((object3 = (sb3_2)((HashMap)object).get(object3)) != null) {
                ajioExoPlayerFragment.k = object3;
            } else {
                l4 = 0;
                bl3 = null;
                int n3 = 255;
                object = object3;
                ajioExoPlayerFragment.k = object3 = new sb3_2(null, null, null, false, 0.0f, null, null, n3);
            }
        } else {
            int n4 = 255;
            ajioExoPlayerFragment.k = object3 = new sb3_2(null, null, null, false, 0.0f, null, null, n4);
        }
        object3 = ajioExoPlayerFragment.k;
        if (object3 != null) {
            object = ((sb3_2)object3).h;
        } else {
            bl2 = false;
            object = null;
        }
        if (object == null && object3 != null) {
            object = ajioExoPlayerFragment.o;
            if (object != null) {
                object = ((AudioSettings)object).getMuteOnMinimizedScreen();
                bl3 = Boolean.TRUE;
                bl2 = Intrinsics.areEqual(object, bl3);
            } else {
                bl2 = false;
                object = null;
            }
            ((sb3_2)object3).h = object = Boolean.valueOf(bl2);
        }
        if ((object3 = ajioExoPlayerFragment.k) != null) {
            object2 = ((sb3_2)object3).g;
        }
        if (object2 == null && object3 != null) {
            object2 = ajioExoPlayerFragment.o;
            if (object2 != null) {
                bl6 = ((AudioSettings)object2).getMuteOnFullScreen();
                object2 = Boolean.TRUE;
                bl5 = Intrinsics.areEqual(bl6, object2);
            }
            ((sb3_2)object3).g = bl6 = Boolean.valueOf(bl5);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_preview_item;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        Xv1 xv1 = Xv1.a(this.requireContext());
        AjioExoPlayerFragment$mMessageReceiver$1 ajioExoPlayerFragment$mMessageReceiver$1 = this.z;
        xv1.d(ajioExoPlayerFragment$mMessageReceiver$1);
    }

    public final void onPause() {
        super.onPause();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 <= n4 && (n3 = (int)(this.isVisible() ? 1 : 0)) != 0) {
            this.Ua();
        }
    }

    public final void onResume() {
        Object object;
        Object object2;
        block23: {
            float f5;
            int n3;
            int n4;
            block22: {
                super.onResume();
                n4 = gz3.a;
                n3 = 23;
                f5 = 3.2E-44f;
                object2 = null;
                if (n4 <= n3) break block22;
                object = this.a;
                if (object != null) {
                    object = ((ob_2)object).i;
                } else {
                    n4 = 0;
                    object = null;
                }
                if (object != null) break block23;
            }
            if ((n4 = (int)(this.r ? 1 : 0)) != 0) {
                object = eb_2.a;
                object = this.p;
                if (object != null) {
                    object = ((BannerData)object).getBannerType();
                } else {
                    n4 = 0;
                    object = null;
                }
                n4 = (int)(eb_2.e((String)object) ? 1 : 0);
                if (n4 != 0 && (n4 = (int)(this.isVisible() ? 1 : 0)) != 0) {
                    object = eb_2.c;
                    Object object3 = this.p;
                    if (object3 != null) {
                        object3 = ((BannerData)object3).getUuid();
                    } else {
                        n3 = 0;
                        object3 = null;
                        f5 = 0.0f;
                    }
                    n3 = (int)(((HashMap)object).containsKey(object3) ? 1 : 0);
                    if (n3 != 0) {
                        object3 = this.p;
                        if (object3 != null) {
                            object3 = ((BannerData)object3).getUuid();
                        } else {
                            n3 = 0;
                            object3 = null;
                            f5 = 0.0f;
                        }
                        object = ((HashMap)object).get(object3);
                        Intrinsics.checkNotNull(object);
                        this.k = object = (sb3_2)object;
                    }
                    if ((object = this.k) != null && (object = ((sb3_2)object).b) != null) {
                        n4 = (Integer)object;
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    object3 = this.k;
                    long l2 = object3 != null && (object3 = ((sb3_2)object3).c) != null ? (Long)object3 : 0L;
                    object3 = this.a;
                    if (object3 != null) {
                        int n7 = 1;
                        ob_2.h((ob_2)object3, l2, n4, n7);
                    }
                    if ((object = this.a) != null) {
                        object3 = ((ob_2)object).i;
                        if (object3 != null) {
                            ((e)object3).E();
                            f5 = ((e)object3).h0;
                            object3 = Float.valueOf(f5);
                        } else {
                            n3 = 0;
                            object3 = null;
                            f5 = 0.0f;
                        }
                        ((ob_2)object).k = object3;
                    }
                }
            }
        }
        this.Pa();
        object = this.d;
        if (object == null) {
            object = "imgVolume";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        ai0_2.a((View)object2);
    }

    public final void onStart() {
        super.onStart();
        Xv1 xv1 = Xv1.a(this.requireContext());
        IntentFilter intentFilter = new IntentFilter("media_stop_notification");
        AjioExoPlayerFragment$mMessageReceiver$1 ajioExoPlayerFragment$mMessageReceiver$1 = this.z;
        xv1.b(ajioExoPlayerFragment$mMessageReceiver$1, intentFilter);
        this.Oa();
    }

    public final void onStop() {
        super.onStop();
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 > n4 && (n3 = (int)(this.isVisible() ? 1 : 0)) != 0) {
            this.Ua();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        void var4_81;
        void var4_78;
        void var4_25;
        Object object;
        Object object2;
        int n3;
        void var17_174;
        ob_2 ob_22;
        Object object3;
        ImageView imageView;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        ProgressBar progressBar;
        void var6_118;
        ImageView imageView2;
        TextView textView;
        void var6_114;
        ImageView imageView3;
        void var6_111;
        ImageView imageView4;
        ImageView imageView5;
        void var6_107;
        PlayerView playerView;
        AjioExoPlayerFragment ajioExoPlayerFragment = this;
        View view2 = view;
        Object var5_89 = null;
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        super.onViewCreated(view, bundle);
        Intrinsics.checkNotNullParameter(view, string2);
        int n4 = R$id.video_view;
        this.c = playerView = (PlayerView)view.findViewById(n4);
        Object object4 = "videoView";
        Object object5 = null;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n4 = 0;
            Object var6_106 = null;
        }
        int n7 = R$string.video_player;
        Object object6 = hv3_0.K(n7);
        var6_107.setContentDescription((CharSequence)object6);
        n4 = R$id.imgVolume;
        ajioExoPlayerFragment.d = imageView5 = (ImageView)view2.findViewById(n4);
        n4 = R$id.imgPlay;
        ajioExoPlayerFragment.e = imageView4 = (ImageView)view2.findViewById(n4);
        object6 = "imgPlay";
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            Object var6_110 = null;
        }
        int n8 = R$string.video_play_button;
        Object object7 = hv3_0.K(n8);
        var6_111.setContentDescription((CharSequence)object7);
        n4 = R$id.imgReplay;
        ajioExoPlayerFragment.f = imageView3 = (ImageView)view2.findViewById(n4);
        object7 = "imgReplay";
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n4 = 0;
            Object var6_113 = null;
        }
        int n10 = R$string.video_replay;
        Object object8 = hv3_0.K(n10);
        var6_114.setContentDescription((CharSequence)object8);
        n4 = R$id.txtDuration;
        ajioExoPlayerFragment.i = textView = (TextView)view2.findViewById(n4);
        n4 = R$id.imgFullScreen;
        ajioExoPlayerFragment.h = imageView2 = (ImageView)view2.findViewById(n4);
        object8 = "imgFullScreen";
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n4 = 0;
            Object var6_117 = null;
        }
        int n14 = R$string.video_full_screen;
        String string3 = hv3_0.K(n14);
        var6_118.setContentDescription((CharSequence)string3);
        n4 = R$id.progress;
        ajioExoPlayerFragment.j = progressBar = (ProgressBar)view2.findViewById(n4);
        n4 = R$id.layoutVideoView;
        ajioExoPlayerFragment.l = constraintLayout3 = (ConstraintLayout)view2.findViewById(n4);
        n4 = R$id.layoutImageView;
        ajioExoPlayerFragment.m = constraintLayout2 = (ConstraintLayout)view2.findViewById(n4);
        n4 = R$id.imgThumbnail;
        ajioExoPlayerFragment.g = imageView = (ImageView)view2.findViewById(n4);
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        PlayerView playerView2 = ajioExoPlayerFragment.c;
        if (playerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n14 = 0;
            Object var17_173 = null;
        }
        object3 = (object3 = ajioExoPlayerFragment.p) != null ? ((BannerData)object3).getBannerUrl() : null;
        ajioExoPlayerFragment.a = ob_22 = new ob_2(context, (PlayerView)var17_174, ajioExoPlayerFragment, (String)object3);
        VideoSetting videoSetting = ajioExoPlayerFragment.n;
        if (videoSetting != null) {
            Boolean bl2 = videoSetting.getShowTimestamp();
            Boolean bl3 = Boolean.TRUE;
            n3 = Intrinsics.areEqual(bl2, bl3);
        } else {
            n3 = 0;
            Object var4_9 = null;
        }
        n4 = 1;
        String string4 = "txtDuration";
        long l2 = 0L;
        int n15 = 8;
        if ((n3 ^= n4) != 0) {
            void var4_13;
            TextView textView2 = ajioExoPlayerFragment.i;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n3 = 0;
                Object var4_12 = null;
            }
            var4_13.setVisibility(n15);
        } else {
            void var4_19;
            void var4_16;
            TextView textView3 = ajioExoPlayerFragment.i;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n3 = 0;
                Object var4_15 = null;
            }
            var4_16.setVisibility(0);
            TextView textView4 = ajioExoPlayerFragment.i;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n3 = 0;
                Object var4_18 = null;
            }
            object2 = eb_2.a;
            object2 = TimeUnit.SECONDS;
            object = ajioExoPlayerFragment.p;
            long l3 = object != null && (object = ((BannerData)object).getDuration()) != null ? (Long)object : l2;
            long l4 = ((TimeUnit)((Object)object2)).toMillis(l3);
            object2 = eb_2.a(l4);
            var4_19.setText((CharSequence)object2);
        }
        ma_2 ma_22 = eb_2.a;
        BannerData bannerData = ajioExoPlayerFragment.p;
        if (bannerData != null) {
            String string5 = bannerData.getBannerType();
        } else {
            n3 = 0;
            Object var4_24 = null;
        }
        n3 = (int)(eb_2.e((String)var4_25) ? 1 : 0);
        object2 = "layoutVideo";
        object = "layoutImage";
        if (n3 != 0) {
            Long l7;
            TextView textView5;
            zr1_1 zr1_12;
            ob_2 ob_23;
            VideoSetting videoSetting2;
            VideoSetting videoSetting3;
            zr1_1 zr1_13;
            void var4_49;
            void var4_46;
            void var4_43;
            void var4_40;
            void var4_37;
            void var4_34;
            void var4_31;
            void var4_28;
            ConstraintLayout constraintLayout4 = ajioExoPlayerFragment.m;
            if (constraintLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n3 = 0;
                Object var4_27 = null;
            }
            var4_28.setVisibility(n15);
            ConstraintLayout constraintLayout5 = ajioExoPlayerFragment.l;
            if (constraintLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                Object var4_30 = null;
            }
            var4_31.setVisibility(0);
            PlayerView playerView3 = ajioExoPlayerFragment.c;
            if (playerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                Object var4_33 = null;
            }
            object4 = new o7_0(ajioExoPlayerFragment, 0);
            var4_34.setOnClickListener((View.OnClickListener)object4);
            ImageView imageView6 = ajioExoPlayerFragment.g;
            object4 = "imgThumbnail";
            if (imageView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                Object var4_36 = null;
            }
            object2 = new p7_0(ajioExoPlayerFragment, 0);
            var4_37.setOnClickListener((View.OnClickListener)object2);
            ImageView imageView7 = ajioExoPlayerFragment.h;
            if (imageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n3 = 0;
                Object var4_39 = null;
            }
            object2 = new q7_0(ajioExoPlayerFragment, 0);
            var4_40.setOnClickListener((View.OnClickListener)object2);
            ImageView imageView8 = ajioExoPlayerFragment.d;
            if (imageView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
                n3 = 0;
                Object var4_42 = null;
            }
            object2 = new r7_0(ajioExoPlayerFragment, 0);
            var4_43.setOnClickListener((View.OnClickListener)object2);
            ImageView imageView9 = ajioExoPlayerFragment.e;
            if (imageView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n3 = 0;
                Object var4_45 = null;
            }
            object6 = new s7_0(ajioExoPlayerFragment, 0);
            var4_46.setOnClickListener((View.OnClickListener)object6);
            ImageView imageView10 = ajioExoPlayerFragment.f;
            if (imageView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n3 = 0;
                Object var4_48 = null;
            }
            object6 = new t7_0(ajioExoPlayerFragment, 0);
            var4_49.setOnClickListener((View.OnClickListener)object6);
            da$a da$a = new da$a();
            da$a.a = n7 = R$drawable.item_dummy_noimg;
            da$a.b = n7;
            da$a.s = n4;
            n7 = R$string.acc_icon_product_placeholder;
            object6 = hv3_0.K(n7);
            da$a.b((String)object6);
            object6 = ajioExoPlayerFragment.p;
            if (object6 != null) {
                object6 = ((BannerData)object6).getThumbnailImage();
            } else {
                n7 = 0;
                object6 = null;
            }
            object7 = ajioExoPlayerFragment.g;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n8 = 0;
                object7 = null;
            }
            da$a.n = object6;
            da$a.u = object7;
            da$a.i = n4;
            da$a.a();
            ob_2 ob_24 = ajioExoPlayerFragment.a;
            if (ob_24 != null && (zr1_13 = ob_24.p) != null) {
                mu1_1 mu1_12 = this.getViewLifecycleOwner();
                object6 = new l7_0(ajioExoPlayerFragment);
                zr1_13.e(mu1_12, (F62)object6);
            }
            if ((videoSetting3 = ajioExoPlayerFragment.n) != null) {
                Boolean bl4 = videoSetting3.getFullScreen();
                Boolean bl5 = Boolean.FALSE;
                n3 = (int)(Intrinsics.areEqual(bl4, bl5) ? 1 : 0);
            } else {
                n3 = 0;
                Object var4_56 = null;
            }
            if (n3 != 0) {
                void var4_60;
                ImageView imageView11 = ajioExoPlayerFragment.h;
                if (imageView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                    n3 = 0;
                    Object var4_59 = null;
                }
                var4_60.setVisibility(n15);
            }
            if ((videoSetting2 = ajioExoPlayerFragment.n) != null) {
                Boolean bl6 = videoSetting2.getAutoPlay();
                Boolean bl7 = Boolean.FALSE;
                n3 = (int)(Intrinsics.areEqual(bl6, bl7) ? 1 : 0);
            } else {
                n3 = 0;
                Object var4_64 = null;
            }
            if (n3 != 0) {
                void var4_68;
                ImageView imageView12 = ajioExoPlayerFragment.g;
                if (imageView12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n3 = 0;
                    Object var4_67 = null;
                }
                var4_68.setVisibility(0);
            }
            if ((ob_23 = ajioExoPlayerFragment.a) != null && (zr1_12 = ob_23.o) != null) {
                mu1_1 mu1_13 = this.getViewLifecycleOwner();
                m7_0 m7_02 = new m7_0(ajioExoPlayerFragment);
                zr1_12.e(mu1_13, m7_02);
            }
            if ((textView5 = ajioExoPlayerFragment.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
            } else {
                object5 = textView5;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            BannerData bannerData2 = ajioExoPlayerFragment.p;
            if (bannerData2 != null && (l7 = bannerData2.getDuration()) != null) {
                l2 = l7;
            }
            long l8 = timeUnit.toMillis(l2);
            String string6 = eb_2.a(l8);
            object5.setText((CharSequence)string6);
            return;
        }
        ConstraintLayout constraintLayout6 = ajioExoPlayerFragment.m;
        if (constraintLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n3 = 0;
            Object var4_77 = null;
        }
        var4_78.setVisibility(0);
        ConstraintLayout constraintLayout7 = ajioExoPlayerFragment.l;
        if (constraintLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            Object var4_80 = null;
        }
        var4_81.setVisibility(n15);
        BannerData bannerData3 = ajioExoPlayerFragment.p;
        if (bannerData3 != null && (n3 = (int)(bannerData3.getShowTimer() ? 1 : 0)) == n4) {
            Long l12;
            nh$a_0 nh$a_0 = nh_2.Companion;
            BannerData bannerData4 = ajioExoPlayerFragment.p;
            long l14 = bannerData4 != null && (l12 = bannerData4.getTimerEndTime()) != null ? l12 : l2;
            nh$a_0.getClass();
            n3 = (int)(nh$a_0.a(l14) ? 1 : 0);
            if (n3 != 0) {
                void var5_101;
                nh_2 nh_22;
                Long l15;
                void var6_157;
                View view3;
                void var6_153;
                View view4;
                void var6_149;
                View view5;
                void var6_145;
                View view6;
                void var6_141;
                View view7;
                void var6_137;
                View view8;
                void var6_134;
                ConstraintLayout constraintLayout8 = ajioExoPlayerFragment.m;
                if (constraintLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n4 = 0;
                    Object var6_133 = null;
                }
                int n16 = R$id.timerContainer;
                View view9 = var6_134.findViewById(n16);
                ConstraintLayout constraintLayout9 = ajioExoPlayerFragment.m;
                if (constraintLayout9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n4 = 0;
                    Object var6_136 = null;
                }
                n16 = R$id.info;
                View view10 = view8 = var6_137.findViewById(n16);
                TextView textView6 = (TextView)view8;
                ConstraintLayout constraintLayout10 = ajioExoPlayerFragment.m;
                if (constraintLayout10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n4 = 0;
                    Object var6_140 = null;
                }
                n16 = R$id.days;
                View view11 = view7 = var6_141.findViewById(n16);
                TextView textView7 = (TextView)view7;
                ConstraintLayout constraintLayout11 = ajioExoPlayerFragment.m;
                if (constraintLayout11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n4 = 0;
                    Object var6_144 = null;
                }
                n16 = R$id.days_postfix;
                View view12 = view6 = var6_145.findViewById(n16);
                TextView textView8 = (TextView)view6;
                ConstraintLayout constraintLayout12 = ajioExoPlayerFragment.m;
                if (constraintLayout12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n4 = 0;
                    Object var6_148 = null;
                }
                n16 = R$id.hours;
                View view13 = view5 = var6_149.findViewById(n16);
                TextView textView9 = (TextView)view5;
                ConstraintLayout constraintLayout13 = ajioExoPlayerFragment.m;
                if (constraintLayout13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n4 = 0;
                    Object var6_152 = null;
                }
                n16 = R$id.minutes;
                View view14 = view4 = var6_153.findViewById(n16);
                TextView textView10 = (TextView)view4;
                ConstraintLayout constraintLayout14 = ajioExoPlayerFragment.m;
                if (constraintLayout14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n4 = 0;
                    Object var6_156 = null;
                }
                n16 = R$id.seconds;
                View view15 = view3 = var6_157.findViewById(n16);
                TextView textView11 = (TextView)view3;
                BannerData bannerData5 = ajioExoPlayerFragment.p;
                if (bannerData5 != null && (l15 = bannerData5.getTimerEndTime()) != null) {
                    l2 = l15;
                }
                oh_2 oh_22 = new oh_2(view9, textView6, textView7, textView8, textView9, textView10, textView11, l2);
                ajioExoPlayerFragment.b = nh_22 = new nh_2(oh_22);
                BannerData bannerData6 = ajioExoPlayerFragment.p;
                if (bannerData6 != null) {
                    String string7 = bannerData6.getTimerLabel();
                } else {
                    Object var5_100 = null;
                }
                nh_22.a((String)var5_101);
                object8 = ajioExoPlayerFragment.q;
                if (object8 == null) return;
                ConstraintLayout constraintLayout15 = ajioExoPlayerFragment.m;
                if (constraintLayout15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n7 = 0;
                    object6 = null;
                } else {
                    object6 = constraintLayout15;
                }
                object7 = ajioExoPlayerFragment.p;
                Intrinsics.checkNotNull(object7);
                ConstraintLayout constraintLayout16 = ajioExoPlayerFragment.m;
                if (constraintLayout16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object5 = constraintLayout16;
                }
                n3 = R$id.timerContainer;
                View view16 = object5.findViewById(n3);
                object3 = null;
                int n17 = 48;
                V81.c((ConstraintLayout)((Object)object6), (BannerData)object7, (g71_0)object8, view16, null, n17);
                return;
            }
        }
        ajioExoPlayerFragment.b = null;
        g71_0 g71_02 = ajioExoPlayerFragment.q;
        if (g71_02 == null) return;
        ConstraintLayout constraintLayout17 = ajioExoPlayerFragment.m;
        if (constraintLayout17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n15 = 0;
            constraintLayout = null;
        } else {
            constraintLayout = constraintLayout17;
        }
        object2 = ajioExoPlayerFragment.p;
        Intrinsics.checkNotNull(object2);
        int n18 = 56;
        Object var34_189 = null;
        object = g71_02;
        V81.c(constraintLayout, (BannerData)object2, g71_02, null, null, n18);
    }

    public final void u4() {
    }
}

