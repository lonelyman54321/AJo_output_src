/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.lifecycle.LiveData;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.pdprefresh.holders.PDPDiscoverBrandHolder$mMessageReceiver$1;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.fleek.Brand;
import com.ril.ajio.services.data.Product.fleek.BrandResponse;
import com.ril.ajio.services.data.Product.fleek.MetaData;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from li2
 */
public final class li2_2
extends RecyclerView$B
implements pb_2,
View.OnClickListener {
    public static final li2$a_0 Companion;
    public static boolean M;
    public final RelativeLayout A;
    public final ImageView B;
    public final Handler C;
    public final kw1_2 D;
    public final Handler E;
    public final ji2_0 F;
    public boolean G;
    public boolean H;
    public final yr0_1 I;
    public boolean J;
    public boolean K;
    public final PDPDiscoverBrandHolder$mMessageReceiver$1 L;
    public final View a;
    public final yi2_1 b;
    public final Kq0 c;
    public final ma_2 d;
    public final yh2_1 e;
    public final NewCustomEventsRevamp f;
    public final View g;
    public sb3_2 h;
    public String i;
    public long j;
    public String k;
    public String l;
    public final ImageView m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final ProgressBar q;
    public final PlayerView r;
    public final ImageView s;
    public final TextView t;
    public final ImageView u;
    public final ImageView v;
    public final TextView w;
    public final TextView x;
    public final ConstraintLayout y;
    public final TextView z;

    static {
        li2$a_0 li2$a_0;
        Companion = li2$a_0 = new Object();
    }

    public li2_2(View object, yi2_1 object2, Kq0 kq0, ma_2 ma_22, yh2_1 yh2_12) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(kq0, "discoverBrandCallback");
        Intrinsics.checkNotNullParameter(ma_22, "ajioVideoPlayer");
        String string2 = "adapter";
        Intrinsics.checkNotNullParameter(yh2_12, string2);
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = kq0;
        this.d = ma_22;
        this.e = yh2_12;
        this.f = object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.k = "";
        kq0 = Looper.getMainLooper();
        object2 = new Handler((Looper)kq0);
        this.C = object2;
        int n3 = 1;
        this.D = object2 = new kw1_2(this, n3);
        kq0 = Looper.getMainLooper();
        object2 = new Handler((Looper)kq0);
        this.E = object2;
        this.F = object2 = new ji2_0(this);
        Intrinsics.checkNotNullParameter(object, "parentView");
        this.I = object2 = eb_2.b();
        this.g = object;
        int n4 = R$id.playerView;
        object2 = (PlayerView)object.findViewById(n4);
        this.r = object2;
        n4 = R$id.imgReplay;
        object2 = (ImageView)object.findViewById(n4);
        this.m = object2;
        n4 = R$id.imgThumbnail;
        object2 = (ImageView)object.findViewById(n4);
        this.p = object2;
        n4 = R$id.imgPlay;
        object2 = (ImageView)object.findViewById(n4);
        this.n = object2;
        n4 = R$id.imgPause;
        object2 = (ImageView)object.findViewById(n4);
        this.o = object2;
        n4 = R$id.progress;
        object2 = (ProgressBar)object.findViewById(n4);
        this.q = object2;
        n4 = R$id.imgFullScreen;
        object2 = (ImageView)object.findViewById(n4);
        this.s = object2;
        n4 = R$id.imgVolume;
        object2 = (ImageView)object.findViewById(n4);
        this.u = object2;
        n4 = R$id.txtDuration;
        object2 = (TextView)object.findViewById(n4);
        this.t = object2;
        n4 = R$id.iv_brand_icon;
        object2 = (ImageView)object.findViewById(n4);
        this.v = object2;
        n4 = R$id.txt_brand_name;
        object2 = (TextView)object.findViewById(n4);
        this.w = object2;
        n4 = R$id.txt_brand_description;
        object2 = (TextView)object.findViewById(n4);
        this.x = object2;
        n4 = R$id.iv_discover_brand;
        object2 = (ImageView)object.findViewById(n4);
        this.B = object2;
        n4 = R$id.video_discover_brand;
        object2 = (ConstraintLayout)object.findViewById(n4);
        this.y = object2;
        n4 = R$id.card_view;
        object2 = (CardView)object.findViewById(n4);
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardView");
            n4 = 0;
            object2 = null;
        }
        object2 = object2.getLayoutParams();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout$LayoutParams)((Object)object2)).G = "16:9";
        n4 = R$id.txt_view_store;
        object2 = (TextView)object.findViewById(n4);
        this.z = object2;
        n4 = R$id.btn_view_all_product;
        object = (RelativeLayout)object.findViewById(n4);
        this.A = object;
        super(this);
        this.L = object;
    }

    public final void A(boolean bl2) {
        boolean bl3;
        Object object;
        boolean bl4 = false;
        Object object2 = null;
        boolean bl5 = true;
        if (bl2) {
            boolean bl6 = this.K;
            if (bl6) {
                boolean bl7;
                this.H = bl7 = this.H ^ bl5;
            } else {
                boolean bl8;
                object = this.h;
                if (object != null && (bl8 = ((sb3_2)object).d) == bl5) {
                    bl4 = true;
                }
                this.H = bl4;
            }
        } else {
            boolean bl9;
            object = this.h;
            if (object != null && (bl9 = ((sb3_2)object).d) == bl5) {
                bl4 = true;
            }
            this.H = bl4;
        }
        boolean bl10 = this.H;
        object2 = "parentView";
        ma_2 ma_22 = this.d;
        String string2 = "imgVolume";
        Object object3 = null;
        if (bl10) {
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl11 = false;
                object = null;
            }
            int n3 = R$string.video_mute;
            String string3 = hv3_0.K(n3);
            object.setContentDescription((CharSequence)string3);
            int n4 = ma_22.r;
            object = ma_22.a(n4);
            ma_2.p(ma_22, (ExoPlayer)object);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl12 = false;
                object = null;
            }
            if ((ma_22 = this.g) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = ma_22;
            }
            object2 = object3.getContext();
            int n7 = R$drawable.ic_pdp_video_unmute;
            object2 = xn.a((Context)object2, n7);
            object.setImageDrawable((Drawable)object2);
        } else {
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl13 = false;
                object = null;
            }
            int n8 = R$string.video_unmute;
            String string4 = hv3_0.K(n8);
            object.setContentDescription((CharSequence)string4);
            int n10 = ma_22.r;
            object = ma_22.a(n10);
            ma_22.k((ExoPlayer)object);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl14 = false;
                object = null;
            }
            if ((ma_22 = this.g) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = ma_22;
            }
            object2 = object3.getContext();
            int n14 = R$drawable.ic_pdp_video_mute;
            object2 = xn.a((Context)object2, n14);
            object.setImageDrawable((Drawable)object2);
        }
        this.H = bl3 = this.H ^ bl5;
        M = bl3;
        object2 = this.h;
        if (object2 != null) {
            ((sb3_2)object2).d = bl3;
        }
        object2 = VideoComponentEvents.Companion.getInstance();
        boolean bl15 = this.H;
        object3 = String.valueOf(this.l);
        ((VideoComponentEvents)object2).logMuteUnMuteEvent("pdp_video_interactions", false, bl15, (String)object3, false, 0L, "pdp_screen_interaction");
    }

    public final void B(boolean n3) {
        int n4;
        this.G = n3;
        Object object = this.n;
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            n3 = 0;
            object = null;
        }
        ai0_2.B((View)object);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            n3 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.E;
        Object object2 = this.F;
        object.removeCallbacks((Runnable)object2);
        n3 = this.w();
        object2 = this.d;
        object = ((ow_0)object2).a(n3);
        if (object != null && (n3 = object.isPlaying()) == (n4 = 1)) {
            n3 = this.w();
            object = ((ow_0)object2).a(n3);
            if (object != null) {
                object.pause();
            }
            if ((object = ((ow_0)object2).e(n3 = this.w())) == null || (object = ((lt2_1)object).d) == null) {
                object = "";
            }
            n4 = this.w();
            object2 = ((ow_0)object2).a(n4);
            this.G((String)object, (ExoPlayer)object2);
            object2 = VideoComponentEvents.Companion.getInstance();
            String string3 = String.valueOf(this.l);
            object = this.b;
            String string4 = object.l6();
            object = object.x5();
            if (object != null) {
                string2 = ((Product)object).getName();
            }
            String string5 = String.valueOf(string2);
            long l2 = 0L;
            String string6 = "pdp_video_interactions";
            String string7 = "pdp_screen_interaction";
            ((VideoComponentEvents)object2).logPlayPauseEvent(string3, false, l2, string4, string5, false, false, string6, string7);
        }
    }

    public final void C() {
        Object object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            object = null;
        }
        object = Xv1.a(object.getContext());
        IntentFilter intentFilter = new IntentFilter("media_stop_notification");
        PDPDiscoverBrandHolder$mMessageReceiver$1 pDPDiscoverBrandHolder$mMessageReceiver$1 = this.L;
        ((Xv1)object).b(pDPDiscoverBrandHolder$mMessageReceiver$1, intentFilter);
    }

    public final void Ca(boolean bl2) {
        Handler handler = this.E;
        ji2_0 ji2_02 = this.F;
        Object object = "imgPause";
        String string2 = "imgReplay";
        String string3 = "progress";
        String string4 = "imgPlay";
        ImageView imageView = null;
        if (bl2) {
            this.d.r();
            Object object2 = this.u;
            String string5 = "imgVolume";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = this.u;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object2 = null;
            }
            ai0_2.a((View)object2);
            object2 = this.p;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
                bl2 = false;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = this.q;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = this.m;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = this.o;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = this.n;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = this.t;
            if (object2 == null) {
                object2 = "txtDuration";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                imageView = object2;
            }
            ai0_2.B((View)imageView);
            long l2 = this.j;
            long l3 = 0L;
            bl2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (!bl2) {
                object2 = this.C;
                object = this.D;
                long l4 = 1000L;
                object2.postDelayed((Runnable)object, l4);
            }
            handler.removeCallbacks((Runnable)ji2_02);
            l2 = 3000L;
            handler.postDelayed((Runnable)ji2_02, l2);
        } else {
            ImageView imageView2 = this.m;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                imageView2 = null;
            }
            if (bl2 = imageView2.getVisibility()) {
                imageView2 = this.q;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl2 = false;
                    imageView2 = null;
                }
                if (bl2 = imageView2.getVisibility()) {
                    imageView2 = this.o;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        bl2 = false;
                        imageView2 = null;
                    }
                    ai0_2.i((View)imageView2);
                    imageView2 = this.n;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        bl2 = false;
                        imageView2 = null;
                    }
                    ai0_2.B((View)imageView2);
                    imageView2 = this.n;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                    } else {
                        imageView = imageView2;
                    }
                    ai0_2.a((View)imageView);
                }
            }
            handler.removeCallbacks((Runnable)ji2_02);
        }
    }

    public final void D() {
        Object object;
        String string2;
        int n3;
        li2_2 li2_22 = this;
        Object object2 = this.m;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            object2 = null;
        }
        ai0_2.i((View)object2);
        object2 = li2_22.o;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            object2 = null;
        }
        ai0_2.B((View)object2);
        object2 = li2_22.d;
        int n4 = object2.r;
        Object object3 = object2.a(n4);
        if (object3 != null) {
            object3 = object3.getCurrentMediaItem();
        } else {
            n3 = 0;
            object3 = null;
        }
        int n7 = 0;
        String string3 = null;
        if (object3 != null) {
            n3 = ((MediaItem)object3).hashCode();
        } else {
            n3 = 0;
            object3 = null;
        }
        Object object4 = eb_2.e;
        String string4 = li2_22.i;
        object4 = ((HashMap)object4).get(string4);
        if (object4 != null) {
            n7 = object4.hashCode();
        }
        if (n3 == n7) {
            if ((object2 = object2.a(n4)) != null) {
                long l2 = 0L;
                object2.seekTo(l2);
            }
        } else {
            sb3_2 sb3_22;
            n4 = this.w();
            object2 = li2_22.r;
            if (object2 == null) {
                object2 = "playerView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object3 = null;
            } else {
                object3 = object2;
            }
            string3 = li2_22.k;
            string4 = String.valueOf(li2_22.i);
            string2 = null;
            int n8 = 255;
            object = sb3_22;
            sb3_22 = new sb3_2(null, null, null, false, 0.0f, null, null, n8);
            object2 = li2_22.d;
            int n10 = 136;
            Object object5 = object3;
            object3 = string3;
            n7 = 0;
            string3 = null;
            object4 = this;
            ma_2.i((ma_2)object2, n4, (PlayerView)((Object)object5), (String)object3, null, this, string4, sb3_22, n10);
        }
        object = VideoComponentEvents.Companion.getInstance();
        string2 = String.valueOf(li2_22.l);
        ((VideoComponentEvents)object).logReplayEvent(true, string2, false, 0L, "pdp_video_interactions", "pdp_screen_interaction", "minimised");
    }

    public final void E(String string2) {
        Object object;
        Bundle bundle = new Bundle();
        Object object2 = null;
        Object object3 = this.b;
        object = object3 != null && (object = object3.x5()) != null ? ((Product)object).getCode() : null;
        String string3 = "product_id";
        bundle.putString(string3, (String)object);
        object = object3 != null && (object = object3.x5()) != null ? ((Product)object).getName() : null;
        string3 = "product_name";
        bundle.putString(string3, (String)object);
        object = object3 != null && (object = object3.x5()) != null ? ((Product)object).getBrandName() : null;
        string3 = "product_brand";
        bundle.putString(string3, (String)object);
        if (object3 != null && (object3 = object3.x5()) != null) {
            object2 = ((Product)object3).getBrickCategory();
        }
        object3 = "product_brick";
        bundle.putString((String)object3, object2);
        object2 = this.f;
        if (object2 != null) {
            object3 = AnalyticsManager.Companion;
            String string4 = bv_0.a((AnalyticsManager$Companion)object3);
            String string5 = cv_0.a((AnalyticsManager$Companion)object3);
            object3 = "product details interactions";
            string3 = "";
            String string6 = "product_details_interactions";
            String string7 = "pdp screen";
            String string8 = "pdp screen";
            int n3 = 1536;
            object = string2;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, (String)object3, string2, string3, string6, string7, string8, string4, bundle, string5, false, null, n3, null);
        }
    }

    public final void F() {
        Object object;
        int n3;
        Object object2;
        Object object3;
        block36: {
            int n4;
            boolean bl2;
            Object object4;
            Object object5;
            Object object6;
            block38: {
                int n7;
                block39: {
                    boolean bl3;
                    Object object7;
                    String string2;
                    block37: {
                        int n8;
                        object3 = this.r;
                        object6 = "playerView";
                        object2 = null;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                            n3 = 0;
                            object3 = null;
                        }
                        object3 = zv0_2.b(object3.getContext());
                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type android.app.Activity");
                        object3 = (mu1_1)((Activity)object3);
                        object5 = this.d;
                        object4 = ((ma_2)object5).m;
                        object = new ii2_2(this);
                        Object object8 = new li2$b_0((ii2_2)object);
                        ((LiveData)object4).e((mu1_1)object3, (F62)object8);
                        object3 = this.n;
                        object4 = "imgPlay";
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            n3 = 0;
                            object3 = null;
                        }
                        ai0_2.B((View)object3);
                        object3 = this.s;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
                            n3 = 0;
                            object3 = null;
                        }
                        ai0_2.i((View)object3);
                        object3 = this.z;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("txtViewStore");
                            n3 = 0;
                            object3 = null;
                        }
                        object = new ci2_1(this);
                        object3.setOnClickListener((View.OnClickListener)object);
                        object3 = this.A;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("btnViewAllProduct");
                            n3 = 0;
                            object3 = null;
                        }
                        object = new di2_1(this);
                        object3.setOnClickListener((View.OnClickListener)object);
                        object3 = this.u;
                        object = "imgVolume";
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            n3 = 0;
                            object3 = null;
                        }
                        object8 = new ei2_1(this);
                        object3.setOnClickListener((View.OnClickListener)object8);
                        object3 = this.m;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
                            n3 = 0;
                            object3 = null;
                        }
                        object8 = new fi2_1(this);
                        object3.setOnClickListener((View.OnClickListener)object8);
                        object3 = this.n;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            n3 = 0;
                            object3 = null;
                        }
                        object4 = new gi2_1(this);
                        object3.setOnClickListener((View.OnClickListener)object4);
                        object3 = this.o;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
                            n3 = 0;
                            object3 = null;
                        }
                        object4 = new hi2_1(this);
                        object3.setOnClickListener((View.OnClickListener)object4);
                        object3 = this.I;
                        if (object3 != null && (object3 = ((yr0_1)object3).c()) != null) {
                            this.H = n3 = ((Boolean)object3).booleanValue();
                        }
                        if ((object3 = this.b) == null || (object3 = object3.P4()) == null || (object3 = ((BrandResponse)object3).getBrand()) == null) break block36;
                        object4 = new da$a();
                        ((da$a)object4).k = bl2 = true;
                        ((da$a)object4).g = bl2;
                        string2 = ((Brand)object3).getLogo();
                        object7 = this.v;
                        if (object7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("brandLogo");
                            object7 = null;
                        }
                        ((da$a)object4).n = string2;
                        ((da$a)object4).u = object7;
                        ((da$a)object4).a();
                        object4 = this.w;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("brandName");
                            bl3 = false;
                            object4 = null;
                        }
                        if (object4 != null) {
                            string2 = ((Brand)object3).getName();
                            object4.setText((CharSequence)string2);
                        }
                        if ((object4 = this.x) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("brandDescription");
                            bl3 = false;
                            object4 = null;
                        }
                        if (object4 != null) {
                            string2 = ((Brand)object3).getMotto();
                            object4.setText((CharSequence)string2);
                        }
                        if ((object4 = ((Brand)object3).getPageHeader()) != null) {
                            this.k = object4;
                        }
                        if ((object4 = ((Brand)object3).getMetaData()) != null) {
                            object4 = ((MetaData)object4).getBrandPageHeaderMediaType();
                        } else {
                            bl3 = false;
                            object4 = null;
                        }
                        bl3 = Intrinsics.areEqual(object4, "IMAGE");
                        string2 = "discoverVideoView";
                        object7 = "ivDiscoverBrand";
                        if (!bl3) break block37;
                        object3 = new da$a();
                        ((da$a)object3).a = n8 = R$drawable.component_placeholder;
                        ((da$a)object3).b = n8;
                        object6 = this.k;
                        object5 = this.B;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                            boolean bl4 = false;
                            object5 = null;
                        }
                        ((da$a)object3).n = object6;
                        ((da$a)object3).u = object5;
                        ((da$a)object3).a();
                        object3 = this.B;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                            n3 = 0;
                            object3 = null;
                        }
                        ai0_2.B((View)object3);
                        object3 = this.y;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object3 = null;
                        }
                        ai0_2.i((View)object3);
                        break block36;
                    }
                    object4 = this.y;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl3 = false;
                        object4 = null;
                    }
                    ai0_2.B((View)object4);
                    object4 = this.B;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        bl3 = false;
                        object4 = null;
                    }
                    ai0_2.i((View)object4);
                    ((ma_2)object5).q();
                    object4 = this.r;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                        bl3 = false;
                        object4 = null;
                    }
                    if (object4 != null) {
                        object4.setOnClickListener((View.OnClickListener)this);
                    }
                    object6 = ((Brand)object3).getName();
                    this.l = object6;
                    if ((object3 = ((Brand)object3).getImage()) == null) break block36;
                    n7 = this.w();
                    object6 = ((ow_0)object5).e(n7);
                    object4 = "imgThumbnail";
                    if (object6 == null || (object6 = ((lt2_1)object6).b) == null || (n7 = (int)(object6.isPlaying() ? 1 : 0)) != 0) break block38;
                    n7 = this.w();
                    object6 = ((ow_0)object5).e(n7);
                    if (object6 == null) break block39;
                    object6 = ((lt2_1)object6).e;
                    n4 = this.w();
                    if (object6 != null && (n7 = ((Integer)object6).intValue()) == n4) break block38;
                }
                if ((object6 = this.p) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n7 = 0;
                    object6 = null;
                }
                ai0_2.B((View)object6);
            }
            object6 = new da$a();
            ((da$a)object6).k = bl2;
            ((da$a)object6).r = bl2;
            n4 = R$string.acc_banner;
            object5 = hv3_0.K(n4);
            ((da$a)object6).b((String)object5);
            object5 = this.p;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n4 = 0;
                object5 = null;
            }
            ((da$a)object6).n = object3;
            ((da$a)object6).u = object5;
            ((da$a)object6).a();
        }
        if ((n3 = this.H) != 0) {
            object3 = this.u;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object3;
            }
            n3 = R$string.video_mute;
            object3 = hv3_0.K(n3);
            object2.setContentDescription((CharSequence)object3);
        } else {
            object3 = this.u;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object3;
            }
            n3 = R$string.video_unmute;
            object3 = hv3_0.K(n3);
            object2.setContentDescription((CharSequence)object3);
        }
    }

    public final void F5() {
        int n3;
        int n4;
        Object object = this.p;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        n4 = this.w();
        ma_2 ma_22 = this.d;
        object = ma_22.f(n4);
        String string2 = "imgPause";
        String string3 = "txtDuration";
        String string4 = "imgPlay";
        String string5 = "imgVolume";
        if ((object == null || (n4 = (int)(object.isPlaying() ? 1 : 0)) != (n3 = 1)) && (n4 = (int)(this.G ? 1 : 0)) == 0) {
            n4 = this.w();
            object = ma_22.f(n4);
            if (object != null) {
                object.play();
            }
            if ((object = this.n) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n4 = 0;
                object = null;
            }
            ai0_2.i((View)object);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n4 = 0;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.o;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n4 = 0;
                object = null;
            }
            ai0_2.B((View)object);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
            } else {
                object2 = object;
            }
            ai0_2.a((View)object2);
        } else {
            n4 = (int)(this.G ? 1 : 0);
            if (n4 != 0) {
                object = this.n;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object = null;
                }
                ai0_2.B((View)object);
                object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    object = null;
                }
                ai0_2.i((View)object);
                object = this.o;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object = null;
                }
                ai0_2.i((View)object);
                object = this.u;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                } else {
                    object2 = object;
                }
                ai0_2.i((View)object2);
                n4 = this.w();
                object = ma_22.f(n4);
                if (object != null) {
                    object.pause();
                }
                n4 = 0;
                object = null;
                this.G = false;
            }
        }
    }

    public final void G(String string2, ExoPlayer exoPlayer) {
        sb3_2 sb3_22;
        float f5;
        Long l2;
        Integer n3;
        String string3 = this.k;
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
        bl2 = M;
        cp_1.Companion.getClass();
        Boolean bl5 = cp$a.d().getAudioSettings().getMuteOnFullScreen();
        Boolean bl6 = bl2;
        object = sb3_22;
        this.h = sb3_22 = new sb3_2(string3, n3, l2, bl4, f5, bl5, bl6, 16);
        eb_2.d.put(string2, sb3_22);
    }

    public final void M0() {
        Object object = this.t;
        TextView textView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.p;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.q;
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
        Object object = this.t;
        TextView textView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.E;
        ji2_0 ji2_02 = this.F;
        object.removeCallbacks((Runnable)ji2_02);
        object = this.u;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        ai0_2.k((View)object);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.q;
        if (object == null) {
            object = "progress";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            textView = object;
        }
        ai0_2.B((View)textView);
    }

    public final void ha() {
        long l2;
        boolean bl2 = false;
        Boolean bl3 = null;
        this.J = false;
        this.j = l2 = 0L;
        Object object = this.m;
        Object object2 = "imgReplay";
        ImageView imageView = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        ai0_2.B((View)object);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        ai0_2.a((View)object);
        object = this.p;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.u;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            object = null;
        }
        ai0_2.k((View)object);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            object = null;
        }
        ai0_2.i((View)object);
        object = this.t;
        if (object == null) {
            object = "txtDuration";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            imageView = object;
        }
        ai0_2.i((View)imageView);
        object = this.E;
        object2 = this.F;
        object.removeCallbacks((Runnable)object2);
        object = this.I;
        if (object != null) {
            bl3 = ((yr0_1)object).b();
            object = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(bl3, object);
        }
        if (bl2) {
            this.K = bl2 = true;
            this.D();
        }
    }

    public final void onClick(View object) {
        int n3;
        object = this.d;
        int n4 = this.w();
        if ((object = ((ow_0)object).a(n4)) != null && (n3 = object.isPlaying()) == (n4 = 1)) {
            n3 = 0;
            this.x(false);
            object = this.E;
            ji2_0 ji2_02 = this.F;
            object.removeCallbacks((Runnable)ji2_02);
            long l2 = 3000L;
            object.postDelayed((Runnable)ji2_02, l2);
        }
    }

    public final void u4() {
        ImageView imageView = this.p;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            imageView = null;
        }
        ai0_2.B((View)imageView);
    }

    public final int w() {
        int n3;
        Object object = this.e;
        int n4 = object != null && (object = ((yh2_1)object).g(n3 = 9)) != null ? (Integer)object : -1;
        return n4;
    }

    public final void x(boolean bl2) {
        String string2 = "imgPause";
        String string3 = "imgVolume";
        ImageView imageView = null;
        if (bl2) {
            ImageView imageView2 = this.u;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                imageView2 = null;
            }
            ai0_2.k((View)imageView2);
            imageView2 = this.o;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageView = imageView2;
            }
            ai0_2.i((View)imageView);
        } else {
            ImageView imageView3 = this.u;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                imageView3 = null;
            }
            ai0_2.B((View)imageView3);
            imageView3 = this.o;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageView = imageView3;
            }
            ai0_2.B((View)imageView);
        }
    }

    public final void y() {
        boolean bl2;
        String string2;
        Object object;
        int n3;
        sb3_2 sb3_22;
        String string3;
        cp_1.Companion.getClass();
        Object object2 = cp$a.d().getAudioSettings();
        Object object3 = this.k;
        int n4 = this.w();
        ma_2 ma_22 = this.d;
        ma_22.getClass();
        object3 = ow_0.c(n4, (String)object3);
        this.i = object3;
        Object object4 = eb_2.d;
        this.h = object3 = (sb3_2)((HashMap)object4).get(object3);
        if (object3 != null) {
            float f5 = ((sb3_2)object3).f;
            object4 = Float.valueOf(f5);
            ma_22.g = object4;
            object4 = M;
            ((sb3_2)object3).h = object4;
            n4 = (int)(M ? 1 : 0);
            ((sb3_2)object3).d = n4;
        }
        if ((object3 = this.h) == null) {
            string3 = null;
            sb3_22 = null;
            n3 = 0;
            ma_22 = null;
            object = null;
            string2 = null;
            int n7 = 255;
            object4 = object3;
            this.h = object3 = new sb3_2(null, null, null, false, 0.0f, null, null, n7);
            ((sb3_2)object3).h = object4 = object2.getMuteOnMinimizedScreen();
            ((sb3_2)object3).g = object4 = object2.getMuteOnFullScreen();
            object2 = object2.getMuteOnMinimizedScreen();
            object4 = Boolean.TRUE;
            ((sb3_2)object3).d = bl2 = Intrinsics.areEqual(object2, object4);
        }
        n3 = this.w();
        object2 = this.r;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            bl2 = false;
            object2 = null;
        }
        object = object2;
        string2 = this.k;
        string3 = String.valueOf(this.i);
        sb3_22 = this.h;
        ma_2.i(this.d, n3, (PlayerView)((Object)object), string2, null, this, string3, sb3_22, 136);
    }

    public final void z() {
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
        String string2 = String.valueOf(this.l);
        long l2 = this.j;
        videoComponentEvents.logVideoViewTime(string2, false, 0L, l2, "pdp_screen_interaction", "pdp_video_interactions");
        this.j = 0L;
    }
}

