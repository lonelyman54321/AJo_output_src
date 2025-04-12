/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowInsetsController
 *  android.view.WindowManager$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.webkit.WebView
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package com.jio.jioads.interstitial;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.jio.jioads.R$drawable;
import com.jio.jioads.R$layout;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.common.c;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.interstitial.A;
import com.jio.jioads.interstitial.G;
import com.jio.jioads.interstitial.InterstitialActivity$a;
import com.jio.jioads.interstitial.InterstitialAdController;
import com.jio.jioads.interstitial.a_0;
import com.jio.jioads.interstitial.b;
import com.jio.jioads.interstitial.b_0;
import com.jio.jioads.interstitial.c_0;
import com.jio.jioads.interstitial.d;
import com.jio.jioads.interstitial.d_0;
import com.jio.jioads.interstitial.e;
import com.jio.jioads.interstitial.e_0;
import com.jio.jioads.interstitial.f;
import com.jio.jioads.interstitial.f_0;
import com.jio.jioads.interstitial.h;
import com.jio.jioads.interstitial.j;
import com.jio.jioads.interstitial.l_0;
import com.jio.jioads.interstitial.n_0;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.interstitial.p;
import com.jio.jioads.interstitial.r;
import com.jio.jioads.interstitial.t;
import com.jio.jioads.interstitial.v;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.interstitial.y;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.i;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.utils.Constants$ResponseHeaderKeys;
import com.jio.jioads.videomodule.s;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InterstitialActivity
extends AppCompatActivity {
    public static final h Companion;
    public static boolean U;
    public int A;
    public boolean B;
    public Integer C;
    public Integer D;
    public NativeAdViewRenderer E;
    public com.jio.jioads.instream.audio.j F;
    public ViewGroup G;
    public j H;
    public m I;
    public boolean J;
    public View K;
    public j L;
    public Integer M;
    public Integer N;
    public Integer O;
    public View P;
    public TextView Q;
    public boolean R;
    public CountDownTimer S;
    public final InterstitialActivity$a T;
    public String a = "p";
    public boolean b;
    public boolean c;
    public JioAdView$ORIENTATION_TYPE d;
    public boolean e;
    public RelativeLayout f;
    public String g;
    public String h;
    public HashMap i;
    public x j;
    public com.jio.jioads.controller.a k;
    public c l;
    public s m;
    public boolean n;
    public com.jio.jioads.common.b o;
    public A p;
    public TextView q;
    public TextView r;
    public String s;
    public TextView t;
    public TextView u;
    public Drawable[] v;
    public Drawable[] w;
    public String x;
    public String y;
    public long z;

    static {
        h h3;
        Companion = h3 = new Object();
    }

    public InterstitialActivity() {
        Object object = "";
        this.g = object;
        this.h = object;
        object = new HashMap();
        this.i = object;
        this.z = -1;
        int n3 = -1;
        Integer n4 = n3;
        this.A = n3;
        this.C = n4;
        this.D = n4;
        this.T = object = new InterstitialActivity$a(this);
    }

    public static final void a(View view) {
    }

    public static final void a(InterstitialActivity object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        RelativeLayout relativeLayout = ((InterstitialActivity)object).f;
        boolean bl2 = relativeLayout instanceof com.jio.jioads.common.j;
        relativeLayout = bl2 ? (com.jio.jioads.common.j)relativeLayout : null;
        if (relativeLayout != null) {
            b_0 b_02 = new b_0((InterstitialActivity)object);
            object = "viewListener";
            Intrinsics.checkNotNullParameter(b_02, (String)object);
            relativeLayout.f = b_02;
        }
    }

    public static final void a(InterstitialActivity interstitialActivity, View object) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.m;
        if (object != null) {
            ((s)object).u();
            return;
        }
        object = interstitialActivity.N;
        Integer n3 = interstitialActivity.M;
        Integer n4 = interstitialActivity.O;
        interstitialActivity.closeAd((Integer)object, n3, n4);
    }

    public static final void a(InterstitialActivity interstitialActivity, TextView textView, View object, boolean bl2) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.t;
        int bl4 = 1;
        if (object == null) {
            int n3;
            int n4;
            int n7;
            Object object2;
            object = interstitialActivity.q;
            if (object != null) {
                String string2 = "Skip Ad";
                object.setText((CharSequence)string2);
            }
            int bl3 = interstitialActivity.A;
            int n8 = 4;
            String string2 = "Close Ad";
            if (bl3 <= 0) {
                object = interstitialActivity.u;
                object2 = "Close";
                if (object != null) {
                    object.setText((CharSequence)object2);
                }
                object = interstitialActivity.q;
                if (object != null) {
                    object.setText((CharSequence)object2);
                }
                object = Utility.INSTANCE;
                int n10 = ((Utility)object).getCurrentUIModeType((Context)interstitialActivity);
                if (n10 == n8) {
                    object = interstitialActivity.q;
                    if (object != null) {
                        object.setText((CharSequence)string2);
                    }
                    object = interstitialActivity.Q;
                    if (object != null) {
                        object.setText((CharSequence)string2);
                    }
                    object = interstitialActivity.u;
                    if (object != null) {
                        object.setText((CharSequence)string2);
                    }
                }
            }
            if ((n7 = ((Utility)(object = Utility.INSTANCE)).getCurrentUIModeType((Context)interstitialActivity)) == n8 && (object2 = interstitialActivity.o) != null && (n7 = (int)(object2.e() ? 1 : 0)) == bl4) {
                object2 = interstitialActivity.q;
                if (object2 != null) {
                    object2.setText((CharSequence)string2);
                }
                object2 = interstitialActivity.Q;
                if (object2 != null) {
                    object2.setText((CharSequence)string2);
                }
                object2 = interstitialActivity.u;
                if (object2 != null) {
                    object2.setText((CharSequence)string2);
                }
            }
            if ((object2 = interstitialActivity.o) != null && (n7 = object2.W()) == (n4 = 2) && (n3 = ((Utility)object).getCurrentUIModeType((Context)interstitialActivity)) == n8) {
                object = interstitialActivity.q;
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
                object = interstitialActivity.Q;
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
                object = interstitialActivity.u;
                if (object != null) {
                    object.setText((CharSequence)string2);
                }
            }
        }
        if (bl2 && (object = interstitialActivity.u) != null) {
            d d2;
            if (textView != null) {
                int n14 = 8;
                textView.setVisibility(n14);
            }
            object = interstitialActivity.u;
            if (object != null) {
                bl2 = false;
                d2 = null;
                object.setVisibility(0);
            }
            object = interstitialActivity.u;
            if (object != null) {
                d2 = new d(interstitialActivity, textView);
                object.setOnFocusChangeListener((View.OnFocusChangeListener)d2);
            }
            textView = interstitialActivity.u;
            if (textView != null) {
                bl2 = true;
                object = new cv1_2(interstitialActivity, (int)(bl2 ? 1 : 0));
                textView.setOnClickListener((View.OnClickListener)object);
            }
            if ((textView = interstitialActivity.u) != null) {
                textView.setFocusable(bl4 != 0);
            }
            textView = interstitialActivity.u;
            if (textView != null) {
                textView.setFocusableInTouchMode(bl4 != 0);
            }
            interstitialActivity = interstitialActivity.u;
            if (interstitialActivity != null) {
                interstitialActivity.requestFocus();
            }
        }
    }

    public static final /* synthetic */ void access$fireHTMLTracker(InterstitialActivity interstitialActivity) {
        interstitialActivity.a();
    }

    public static final void access$fireViewableImpression(InterstitialActivity interstitialActivity) {
        Object object;
        Object object2 = interstitialActivity.l;
        if (object2 != null) {
            object = Constants$HeaderKeys.X_Jio_VIM.getKey();
            object2 = ((com.jio.jioads.controller.f)object2).a((String)object);
        } else {
            object2 = null;
        }
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2 && !(bl2 = interstitialActivity.R) && (object = interstitialActivity.S) == null) {
            object = new r(interstitialActivity, (String)object2);
            object2 = object.start();
            interstitialActivity.S = object2;
        }
    }

    public static final Drawable access$getBoundedDrawable(InterstitialActivity object, Drawable drawable2) {
        object.getClass();
        if (drawable2 != null) {
            object = Utility.INSTANCE;
            float f5 = 32.0f;
            int n3 = ((Utility)object).convertDpToPixel(f5);
            int n4 = ((Utility)object).convertDpToPixel(f5);
            f5 = 0.0f;
            drawable2.setBounds(0, 0, n3, n4);
        }
        return drawable2;
    }

    public static final /* synthetic */ String access$getCurrentVideoAdId(InterstitialActivity interstitialActivity) {
        return interstitialActivity.b();
    }

    public static final /* synthetic */ Integer access$getCustomContainerPortrait$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.C;
    }

    public static final /* synthetic */ com.jio.jioads.common.b access$getIJioAdView$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.o;
    }

    public static final /* synthetic */ c access$getIJioAdViewController$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.l;
    }

    public static final /* synthetic */ com.jio.jioads.instream.audio.j access$getInStreamAudioRenderer$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.F;
    }

    public static final /* synthetic */ j access$getIntType$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.L;
    }

    public static final /* synthetic */ String access$getInterstitialCompanionAd(InterstitialActivity interstitialActivity) {
        return interstitialActivity.c();
    }

    /*
     * Unable to fully structure code
     */
    public static final Pair access$getInterstitialCompanionTrackingUrls(InterstitialActivity var0) {
        block8: {
            block7: {
                var1_1 = var0.I;
                var2_2 = null;
                if (var1_1 == null || (var1_1 = var1_1.a) == null) ** GOTO lbl-1000
                var3_3 = var0.b();
                var1_1 = (HashMap)var1_1.k.get(var3_3);
                var4_4 = TextUtils.isEmpty(null);
                if (var4_4) break block7;
                if (var1_1 == null) ** GOTO lbl-1000
                var1_1 = (List)var1_1.get(null);
                break block8;
            }
            if (var1_1 != null && (var1_1 = var1_1.entrySet()) != null && (var1_1 = (Map.Entry)CollectionsKt.M(var1_1)) != null) {
                var1_1 = (List)var1_1.getValue();
            } else lbl-1000:
            // 3 sources

            {
                var1_1 = null;
            }
        }
        var3_3 = var0.I;
        if (var3_3 != null && (var3_3 = var3_3.a) != null) {
            var0 = var0.b();
            var3_3 = var3_3.l;
            var0 = (HashMap)var3_3.get(var0);
            var4_4 = TextUtils.isEmpty(null);
            if (!var4_4) {
                if (var0 != null) {
                    var2_2 = var0 = var0.get(null);
                    var2_2 = (List)var0;
                }
            } else if (var0 != null && (var0 = var0.entrySet()) != null && (var0 = (Map.Entry)CollectionsKt.M(var0)) != null) {
                var2_2 = var0 = var0.getValue();
                var2_2 = (List)var0;
            }
        }
        var0 = new Pair(var1_1, var2_2);
        return var0;
    }

    public static final /* synthetic */ j access$getInterstitialType$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.H;
    }

    public static final /* synthetic */ m access$getInterstitialVastDataModel$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.I;
    }

    public static final /* synthetic */ com.jio.jioads.controller.a access$getJioCallbacks$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.k;
    }

    public static final /* synthetic */ s access$getJioVideoView$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.m;
    }

    public static final /* synthetic */ int access$getMSkipDelay$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.A;
    }

    public static final /* synthetic */ NativeAdViewRenderer access$getNativeAdViewRenderer$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.E;
    }

    public static final /* synthetic */ long access$getRemainingTime$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.z;
    }

    public static final /* synthetic */ Drawable[] access$getRewardAdDrawables$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.w;
    }

    public static final /* synthetic */ String access$getRewardAfterText$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.y;
    }

    public static final /* synthetic */ String access$getSkipAdText$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.s;
    }

    public static final /* synthetic */ String access$getSkipAfterText$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.x;
    }

    public static final /* synthetic */ TextView access$getTvCloseAd$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.Q;
    }

    public static final /* synthetic */ TextView access$getTxtCloseAdFocused$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.u;
    }

    public static final /* synthetic */ TextView access$getTxtvCloseAd$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.q;
    }

    public static final /* synthetic */ TextView access$getTxtvCustomContainerCloseAd$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.t;
    }

    public static final /* synthetic */ TextView access$getTxtvRewardAd$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.r;
    }

    public static final /* synthetic */ x access$getWebViewHandler$p(InterstitialActivity interstitialActivity) {
        return interstitialActivity.j;
    }

    public static final /* synthetic */ void access$handleClose(InterstitialActivity interstitialActivity) {
        interstitialActivity.d();
    }

    public static final /* synthetic */ void access$initCloseBtn(InterstitialActivity interstitialActivity) {
        interstitialActivity.e();
    }

    public static final /* synthetic */ void access$initializeHtmlCloseElements(InterstitialActivity interstitialActivity) {
        interstitialActivity.j();
    }

    public static final /* synthetic */ boolean access$isActivityRunning$cp() {
        return U;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean access$isRewardedAd(InterstitialActivity object) {
        TextView textView = ((InterstitialActivity)object).r;
        if (textView == null) return 0 != 0;
        object = ((InterstitialActivity)object).O;
        if (object == null) return 0 != 0;
        Intrinsics.checkNotNull(object);
        int n3 = (Integer)object;
        if (n3 < 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void access$loadAd(InterstitialActivity var0) {
        var1_1 = var0;
        var2_2 /* !! */  = var0.getIntent();
        var3_3 = "cacheAdOrientation";
        var4_4 = -1;
        var5_5 = var2_2 /* !! */ .getIntExtra((String)var3_3, var4_4);
        var6_6 = var0.b;
        var7_7 = false;
        var8_8 = null;
        var9_9 = 1;
        if (var6_6 != 0 || (var6_6 = var0.c) != 0) ** GOTO lbl-1000
        var3_3 = var0.getResources().getConfiguration();
        var6_6 = var3_3.orientation;
        if (var5_5 != var6_6) {
            var6_6 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = 0;
            var3_3 = null;
        }
        var10_10 = var1_1.o;
        var11_11 = null;
        var12_12 = 2;
        if (var10_10 != null && (var13_13 = var10_10.W()) == var12_12) {
            var1_1.a(null, null, null);
        } else {
            var10_10 = var1_1.o;
            var14_14 = ", current orientation is :";
            var15_15 = ": Previous orientation is :";
            var16_16 = " ";
            var17_17 = "message";
            if (var10_10 != null && (var13_13 = var10_10.W()) == var9_9) {
                var10_10 = new StringBuilder((String)var16_16);
                var16_16 = var1_1.o;
                var16_16 = var16_16 != null ? var16_16.P() : null;
                var10_10.append((String)var16_16);
                var10_10.append(": loadAd: called activity for video ad ");
                var16_16 = var1_1.m;
                var10_10.append(var16_16);
                Intrinsics.checkNotNullParameter(var10_10.toString(), var17_17);
                var10_10 = JioAds.Companion;
                var10_10.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var16_16 = JioAds$LogLevel.NONE;
                var16_16 = var1_1.H;
                var18_18 = com.jio.jioads.interstitial.j.c;
                if (var16_16 == var18_18) {
                    var16_16 = var1_1.k;
                    if (var16_16 != null) {
                        var18_18 = JioAdView$AdState.STARTING;
                        var16_16 = (V)var16_16;
                        var16_16.e((JioAdView$AdState)var18_18);
                    }
                    var16_16 = "null cannot be cast to non-null type android.view.ViewGroup";
                    if (var6_6 != 0) {
                        var3_3 = new StringBuilder();
                        var18_18 = var1_1.o;
                        var18_18 = var18_18 != null ? var18_18.P() : null;
                        var3_3.append((String)var18_18);
                        var3_3.append(var15_15);
                        var3_3.append(var5_5);
                        var3_3.append(var14_14);
                        var5_5 = var0.getResources().getConfiguration().orientation;
                        var3_3.append(var5_5);
                        Intrinsics.checkNotNullParameter(var3_3.toString(), var17_17);
                        var10_10.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var2_2 /* !! */  = var1_1.C;
                        var6_6 = 6;
                        if (!(var2_2 /* !! */  != null && (var5_5 = var2_2 /* !! */ .intValue()) == var4_4 || (var2_2 /* !! */  = var1_1.D) != null && (var5_5 = var2_2 /* !! */ .intValue()) == var4_4)) {
                            var2_2 /* !! */  = var0.getResources();
                            if (var2_2 /* !! */  != null && (var2_2 /* !! */  = var2_2 /* !! */ .getConfiguration()) != null) {
                                var5_5 = var2_2 /* !! */ .orientation;
                                var2_2 /* !! */  = Integer.valueOf(var5_5);
                            } else {
                                var5_5 = 0;
                                var2_2 /* !! */  = null;
                            }
                            var2_2 /* !! */  = var2_2 /* !! */  != null && (var13_13 = var2_2 /* !! */ .intValue()) == var9_9 ? var1_1.C : (var2_2 /* !! */  != null && (var5_5 = var2_2 /* !! */ .intValue()) == var12_12 ? var1_1.D : var1_1.C);
                            var19_20 = var1_1.m;
                            if (var19_20 != null) {
                                var1_1 = var1_1.f;
                                Intrinsics.checkNotNull(var1_1, (String)var16_16);
                                if (var2_2 /* !! */  != null) {
                                    var5_5 = var2_2 /* !! */ .intValue();
                                }
                                com.jio.jioads.videomodule.s.A(var19_20, (ViewGroup)var1_1, null, false, var6_6);
                            }
                        } else {
                            var2_2 /* !! */  = var0.getResources();
                            if (var2_2 /* !! */  != null && (var2_2 /* !! */  = var2_2 /* !! */ .getConfiguration()) != null) {
                                var5_5 = var2_2 /* !! */ .orientation;
                                var2_2 /* !! */  = Integer.valueOf(var5_5);
                            } else {
                                var5_5 = 0;
                                var2_2 /* !! */  = null;
                            }
                            if ((var2_2 /* !! */  == null || (var4_4 = var2_2 /* !! */ .intValue()) != var9_9) && var2_2 /* !! */  != null) {
                                var5_5 = var2_2 /* !! */ .intValue();
                            }
                            if ((var2_2 /* !! */  = var1_1.m) != null) {
                                var1_1 = var1_1.f;
                                Intrinsics.checkNotNull(var1_1, (String)var16_16);
                                com.jio.jioads.videomodule.s.A((s)var2_2 /* !! */ , (ViewGroup)var1_1, null, false, var6_6);
                            }
                        }
                    } else {
                        var2_2 /* !! */  = var1_1.m;
                        if (var2_2 /* !! */  != null) {
                            var1_1 = var1_1.f;
                            Intrinsics.checkNotNull(var1_1, (String)var16_16);
                            var6_6 = 14;
                            com.jio.jioads.videomodule.s.A((s)var2_2 /* !! */ , (ViewGroup)var1_1, null, false, var6_6);
                        }
                    }
                } else {
                    var2_2 /* !! */  = com.jio.jioads.interstitial.j.e;
                    if (var16_16 == var2_2 /* !! */  && (var3_3 = var1_1.L) != (var20_21 /* !! */  = com.jio.jioads.interstitial.j.d)) {
                        var2_2 /* !! */  = new StringBuilder();
                        var3_3 = var1_1.o;
                        if (var3_3 != null) {
                            var11_11 = var3_3.P();
                        }
                        var3_3 = ": loading default companion ad webview is not available";
                        j_0.k((StringBuilder)var2_2 /* !! */ , var11_11, (String)var3_3);
                        var2_2 /* !! */  = var10_10.getInstance();
                        var2_2 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var0.k();
                    } else if (var16_16 == var2_2 /* !! */  && (var2_2 /* !! */  = var1_1.L) == (var3_3 = com.jio.jioads.interstitial.j.d)) {
                        var2_2 /* !! */  = new StringBuilder();
                        var3_3 = var1_1.o;
                        if (var3_3 != null) {
                            var3_3 = var3_3.P();
                        } else {
                            var6_6 = 0;
                            var3_3 = null;
                        }
                        var20_21 /* !! */  = ": init WebView";
                        com.jio.jioads.adinterfaces.d_0.a((StringBuilder)var2_2 /* !! */ , (String)var3_3, (String)var20_21 /* !! */ , (JioAds$Companion)var10_10);
                        var1_1.a(null, null, null);
                    }
                }
            } else {
                var20_22 = new StringBuilder((String)var16_16);
                var10_10 = var1_1.o;
                if (var10_10 != null) {
                    var10_10 = var10_10.P();
                } else {
                    var13_13 = 0;
                    var10_10 = null;
                }
                var20_22.append((String)var10_10);
                var20_22.append(": onShowAdView: called  activity ");
                var10_10 = var1_1.E;
                if (var10_10 == null) {
                    var7_7 = true;
                }
                var20_22.append(var7_7);
                Intrinsics.checkNotNullParameter(var20_22.toString(), var17_17);
                var20_22 = JioAds.Companion;
                var20_22.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var8_8 = JioAds$LogLevel.NONE;
                var8_8 = var1_1.E;
                if (var8_8 == null) {
                    var2_2 /* !! */  = new StringBuilder();
                    var3_3 = var1_1.o;
                    if (var3_3 != null) {
                        var3_3 = var3_3.P();
                    } else {
                        var6_6 = 0;
                        var3_3 = null;
                    }
                    com.jio.jioads.adinterfaces.d_0.a((StringBuilder)var2_2 /* !! */ , (String)var3_3, " : Ad not prepared", (JioAds$Companion)var20_22);
                    var2_2 /* !! */  = JioAdError.Companion;
                    var3_3 = JioAdError$JioAdErrorType.ERROR_IN_LOAD_AD;
                    var8_8 = "Ad not prepared";
                    var21_23 = j_0.c((t_0)var2_2 /* !! */ , (JioAdError$JioAdErrorType)var3_3, (String)var8_8);
                    var2_2 /* !! */  = new StringBuilder();
                    var3_3 = var1_1.o;
                    if (var3_3 != null) {
                        var11_11 = var3_3.P();
                    }
                    var2_2 /* !! */ .append(var11_11);
                    var2_2 /* !! */ .append(": NativeAd: setJioAdError() ERROR: ");
                    var3_3 = var21_23.getErrorDescription();
                    var2_2 /* !! */ .append((String)var3_3);
                    Intrinsics.checkNotNullParameter(var2_2 /* !! */ .toString(), var17_17);
                    var2_2 /* !! */  = var20_22.getInstance();
                    var2_2 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = var1_1.k;
                    if (var1_1 != null) {
                        var22_24 = com.jio.jioads.cdnlogging.d.a;
                        var2_2 /* !! */  = InterstitialActivity.class.getName();
                        var3_3 = "getName(...)";
                        Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , (String)var3_3);
                        var18_19 = var1_1;
                        var18_19 = (V)var1_1;
                        var23_25 = "setInterstitialError";
                        var18_19.d(var21_23, false, var22_24, var23_25, (String)var2_2 /* !! */ , (String)var8_8, null);
                    }
                } else {
                    if (var6_6 != 0) {
                        var3_3 = new StringBuilder();
                        var8_8 = var1_1.o;
                        if (var8_8 != null) {
                            var11_11 = var8_8.P();
                        }
                        var3_3.append(var11_11);
                        var3_3.append(var15_15);
                        var3_3.append(var5_5);
                        var3_3.append(var14_14);
                        var5_5 = var0.getResources().getConfiguration().orientation;
                        var3_3.append(var5_5);
                        Intrinsics.checkNotNullParameter(var3_3.toString(), var17_17);
                        var20_22.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var2_2 /* !! */  = var1_1.E;
                        if (var2_2 /* !! */  != null) {
                            var3_3 = var0.getResources().getConfiguration();
                            var6_6 = var3_3.orientation;
                            var2_2 /* !! */ .setOrientation$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var6_6);
                        }
                        if ((var2_2 /* !! */  = var1_1.E) != null) {
                            var2_2 /* !! */ .prepareInterstitialNativeAdWithHandler$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                    }
                    if ((var2_2 /* !! */  = var1_1.f) != null && (var3_3 = var1_1.E) != null) {
                        Intrinsics.checkNotNull(var2_2 /* !! */ );
                        var3_3.loadNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((ViewGroup)var2_2 /* !! */ , (boolean)var9_9);
                    }
                    if ((var2_2 /* !! */  = var1_1.l) != null) {
                        var2_2 /* !! */  = ((com.jio.jioads.controller.f)var2_2 /* !! */ ).a;
                        var2_2 /* !! */ .d0();
                    }
                    var0.i();
                    var0.g();
                    var2_2 /* !! */  = new d_0((InterstitialActivity)var1_1);
                    var24_26 = 100;
                    com.jio.jioads.util.s.b(var24_26, (Function0)var2_2 /* !! */ );
                }
            }
        }
    }

    public static final /* synthetic */ void access$setActivityRunning$cp(boolean bl2) {
        U = bl2;
    }

    public static final /* synthetic */ void access$setAdSkipCounterRunning$p(InterstitialActivity interstitialActivity, boolean bl2) {
        interstitialActivity.J = bl2;
    }

    public static final /* synthetic */ void access$setPrevPlayingAdId$p(InterstitialActivity interstitialActivity, String string2) {
        interstitialActivity.getClass();
    }

    public static final /* synthetic */ void access$setRemainingTime$p(InterstitialActivity interstitialActivity, long l2) {
        interstitialActivity.z = l2;
    }

    public static final /* synthetic */ void access$setRewardSkipValue$p(InterstitialActivity interstitialActivity, Integer n3) {
        interstitialActivity.O = n3;
    }

    public static final /* synthetic */ void access$setServedDuration$p(InterstitialActivity interstitialActivity, Integer n3) {
        interstitialActivity.M = n3;
    }

    public static final /* synthetic */ void access$setTotalDuration$p(InterstitialActivity interstitialActivity, Integer n3) {
        interstitialActivity.N = n3;
    }

    public static final /* synthetic */ void access$setViewableImpressionFired$p(InterstitialActivity interstitialActivity, boolean bl2) {
        interstitialActivity.R = bl2;
    }

    public static final /* synthetic */ void access$setViewableImpressionTimer$p(InterstitialActivity interstitialActivity, CountDownTimer countDownTimer) {
        interstitialActivity.S = countDownTimer;
    }

    public static final void access$showEndCard(InterstitialActivity interstitialActivity, String string2, List list, List list2) {
        Object object = new StringBuilder();
        Object object2 = interstitialActivity.o;
        object2 = object2 != null ? object2.P() : null;
        String string3 = ": showEndCard called";
        j_0.k((StringBuilder)object, (String)object2, string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = interstitialActivity.f;
        if (object != null) {
            object.removeAllViews();
            object = Utility.INSTANCE;
            boolean n3 = ((Utility)object).isWebViewEnabled();
            if (n3) {
                int n4 = -1;
                interstitialActivity.C = object2 = Integer.valueOf(n4);
                interstitialActivity.D = object = Integer.valueOf(n4);
                interstitialActivity.a(string2, list, list2);
            }
        }
    }

    public static final void b(InterstitialActivity interstitialActivity, View object) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.m;
        if (object != null) {
            ((s)object).u();
            return;
        }
        object = interstitialActivity.N;
        Integer n3 = interstitialActivity.M;
        Integer n4 = interstitialActivity.O;
        interstitialActivity.closeAd((Integer)object, n3, n4);
    }

    public static final void b(InterstitialActivity interstitialActivity, TextView textView, View object, boolean bl2) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.u;
        if (object != null) {
            String string2 = "Skip Ad";
            object.setText((CharSequence)string2);
        }
        object = interstitialActivity.o;
        int n7 = 4;
        String string3 = "Close Ad";
        if (object != null && (n4 = object.W()) == (n3 = 2) && (n4 = ((Utility)(object = Utility.INSTANCE)).getCurrentUIModeType((Context)interstitialActivity)) == n7) {
            object = interstitialActivity.Q;
            if (object != null) {
                object.setText((CharSequence)string3);
            }
            object = interstitialActivity.u;
            if (object != null) {
                object.setText((CharSequence)string3);
            }
        }
        if ((n4 = interstitialActivity.A) <= 0) {
            object = interstitialActivity.Q;
            String string4 = "Close";
            if (object != null) {
                object.setText((CharSequence)string4);
            }
            object = interstitialActivity.u;
            if (object != null) {
                object.setText((CharSequence)string4);
            }
            object = Utility.INSTANCE;
            n4 = ((Utility)object).getCurrentUIModeType((Context)interstitialActivity);
            if (n4 == n7) {
                object = interstitialActivity.Q;
                if (object != null) {
                    object.setText((CharSequence)string3);
                }
                object = interstitialActivity.u;
                if (object != null) {
                    object.setText((CharSequence)string3);
                }
            }
        }
        if ((n4 = ((Utility)(object = Utility.INSTANCE)).getCurrentUIModeType((Context)interstitialActivity)) == n7 && (object = interstitialActivity.o) != null && (n4 = (int)(object.e() ? 1 : 0)) == (n7 = 1)) {
            object = interstitialActivity.q;
            if (object != null) {
                object.setText((CharSequence)string3);
            }
            object = interstitialActivity.Q;
            if (object != null) {
                object.setText((CharSequence)string3);
            }
            object = interstitialActivity.u;
            if (object != null) {
                object.setText((CharSequence)string3);
            }
        }
        if (!bl2) {
            interstitialActivity = interstitialActivity.u;
            if (interstitialActivity != null) {
                n4 = 8;
                interstitialActivity.setVisibility(n4);
            }
            if (textView != null) {
                interstitialActivity = null;
                textView.setVisibility(0);
            }
        }
    }

    public static final void c(InterstitialActivity interstitialActivity, View object) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.m;
        if (object != null) {
            ((s)object).u();
            return;
        }
        object = interstitialActivity.N;
        Integer n3 = interstitialActivity.M;
        Integer n4 = interstitialActivity.O;
        interstitialActivity.closeAd((Integer)object, n3, n4);
    }

    public static /* synthetic */ void closeAd$default(InterstitialActivity interstitialActivity, Integer n3, Integer n4, Integer n7, int n8, Object object) {
        int n10 = n8 & 1;
        if (n10 != 0) {
            n3 = interstitialActivity.N;
        }
        if ((n10 = n8 & 2) != 0) {
            n4 = interstitialActivity.M;
        }
        if ((n8 &= 4) != 0) {
            n7 = interstitialActivity.O;
        }
        interstitialActivity.closeAd(n3, n4, n7);
    }

    public static final void d(InterstitialActivity interstitialActivity, View object) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.m;
        if (object != null) {
            ((s)object).u();
            return;
        }
        object = interstitialActivity.N;
        Integer n3 = interstitialActivity.M;
        Integer n4 = interstitialActivity.O;
        interstitialActivity.closeAd((Integer)object, n3, n4);
    }

    public static final void e(InterstitialActivity interstitialActivity, View object) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.m;
        if (object != null) {
            ((s)object).u();
            return;
        }
        object = interstitialActivity.N;
        Integer n3 = interstitialActivity.M;
        Integer n4 = interstitialActivity.O;
        interstitialActivity.closeAd((Integer)object, n3, n4);
    }

    public static final void f(InterstitialActivity interstitialActivity, View object) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.m;
        if (object != null) {
            ((s)object).u();
            return;
        }
        object = interstitialActivity.N;
        Integer n3 = interstitialActivity.M;
        Integer n4 = interstitialActivity.O;
        interstitialActivity.closeAd((Integer)object, n3, n4);
    }

    public static final void g(InterstitialActivity interstitialActivity, View object) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "this$0");
        object = interstitialActivity.m;
        if (object != null) {
            ((s)object).u();
            return;
        }
        object = interstitialActivity.N;
        Integer n3 = interstitialActivity.M;
        Integer n4 = interstitialActivity.O;
        interstitialActivity.closeAd((Integer)object, n3, n4);
    }

    public static final void h(InterstitialActivity object, View object2) {
        object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((InterstitialActivity)object).j;
        if (object != null) {
            int n3 = ((x)object).d;
            if (n3 != 0) {
                n3 = 0;
                ((x)object).d = false;
                Object object3 = Looper.getMainLooper();
                object2 = new Handler(object3);
                int n4 = 3;
                object3 = new A1(object, n4);
                long l2 = 100;
                object2.postDelayed((Runnable)object3, l2);
            }
            long l3 = SystemClock.uptimeMillis();
            long l4 = SystemClock.uptimeMillis();
            long l7 = 20;
            long l8 = l4 + l7;
            object = ((x)object).a;
            float f5 = object.getWidth() / 2;
            float f6 = object.getHeight() / 2;
            object2 = MotionEvent.obtain((long)l3, (long)l8, (int)0, (float)f5, (float)f6, (int)0);
            object.dispatchTouchEvent((MotionEvent)object2);
            l4 = SystemClock.uptimeMillis();
            long l12 = SystemClock.uptimeMillis() + l7;
            float f7 = object.getWidth() / 2;
            n3 = object.getHeight() / 2;
            float f8 = n3;
            int n7 = 1;
            object2 = MotionEvent.obtain((long)l4, (long)l12, (int)n7, (float)f7, (float)f8, (int)0);
            object.dispatchTouchEvent((MotionEvent)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = "\"";
        Object object2 = "fre=";
        try {
            char c2;
            Object object3;
            Object object4 = this.l;
            String string2 = null;
            if (object4 != null) {
                object3 = Constants$HeaderKeys.X_Jio_IM;
                object3 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                object4 = (com.jio.jioads.controller.f)object4;
                object4 = ((com.jio.jioads.controller.f)object4).a((String)object3);
            } else {
                object4 = null;
            }
            object3 = this.o;
            object3 = object3 != null ? object3.Y() : null;
            if (object3 != null) {
                Object object5 = com.jio.jioads.util.i.a;
                object5 = this.l;
                boolean bl2 = com.jio.jioads.util.i.l((c)object5);
                if (bl2) {
                    object5 = "frt";
                    StringBuilder stringBuilder = new StringBuilder((String)object2);
                    object2 = this.l;
                    if (object2 != null) {
                        object2 = (com.jio.jioads.controller.f)object2;
                        object2 = ((com.jio.jioads.controller.f)object2).j();
                    } else {
                        object2 = null;
                    }
                    stringBuilder.append(object2);
                    object2 = "&frt";
                    stringBuilder.append((String)object2);
                    object2 = stringBuilder.toString();
                    if (object4 != null) {
                        stringBuilder = new StringBuilder((String)object);
                        stringBuilder.append((String)object2);
                        c2 = '\"';
                        stringBuilder.append(c2);
                        object = stringBuilder.toString();
                        object2 = null;
                        object = kotlin.text.b.n((String)object4, (String)object5, (String)object, false);
                    } else {
                        c2 = '\u0000';
                        object = null;
                    }
                    object = String.valueOf(object);
                    object2 = this.o;
                    object2 = object2 != null ? object2.P() : null;
                    object4 = this.l;
                    object4 = com.jio.jioads.util.i.b((Context)object3, (String)object, (String)object2, (c)object4);
                }
            }
            if ((c2 = TextUtils.isEmpty((CharSequence)object4)) != '\u0000') return;
            object = new StringBuilder();
            object2 = this.o;
            if (object2 != null) {
                string2 = object2.P();
            }
            ((StringBuilder)object).append(string2);
            object2 = ": Impression fired successfully: ";
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append((String)object4);
            object = ((StringBuilder)object).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.j;
            if (object == null) return;
            ((x)object).b((String)object4);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(String object, List object2, List object3) {
        int n3 = this.isWebViewEnabled();
        if (n3 != 0) {
            boolean bl2;
            int n4;
            int n7;
            int n8;
            int n10;
            Object object4 = Utility.INSTANCE;
            n3 = ((Utility)object4).getCurrentUIModeType((Context)this);
            Object object5 = "message";
            int n14 = 4;
            Object object6 = "null cannot be cast to non-null type android.widget.RelativeLayout";
            int n15 = -1;
            Object object7 = null;
            if (n3 == n14) {
                object4 = this.C;
                if (object4 == null || (n3 = ((Integer)object4).intValue()) != n15) {
                    object4 = LayoutInflater.from((Context)this);
                    Integer n16 = this.C;
                    Intrinsics.checkNotNull(n16);
                    int n17 = n16;
                    object4 = object4.inflate(n17, null);
                    try {
                        Intrinsics.checkNotNull(object4, (String)object6);
                        object4 = (RelativeLayout)object4;
                    }
                    catch (Exception exception) {
                        object4 = LayoutInflater.from((Context)this);
                        n10 = R$layout.jio_html_interstitial_stb_layout;
                        object4 = object4.inflate(n10, null);
                    }
                } else {
                    object4 = LayoutInflater.from((Context)this);
                    n10 = R$layout.jio_html_interstitial_stb_layout;
                    object4 = object4.inflate(n10, null);
                }
            } else {
                block76: {
                    block75: {
                        block74: {
                            int n18;
                            Object object8;
                            block73: {
                                block72: {
                                    block71: {
                                        object4 = new StringBuilder();
                                        object8 = this.o;
                                        if (object8 != null) {
                                            object8 = object8.P();
                                        } else {
                                            n18 = 0;
                                            object8 = null;
                                        }
                                        ((StringBuilder)object4).append((String)object8);
                                        ((StringBuilder)object4).append(": resources.configuration.orientation ");
                                        object8 = this.getResources().getConfiguration();
                                        n18 = ((Configuration)object8).orientation;
                                        w12_0.b(n18, (String)object5, (StringBuilder)object4);
                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        object4 = JioAds$LogLevel.NONE;
                                        object4 = this.C;
                                        if (object4 == null) break block71;
                                        n3 = (Integer)object4;
                                        if (n3 == n15) break block72;
                                    }
                                    object4 = this.getResources();
                                    object4 = object4.getConfiguration();
                                    n3 = ((Configuration)object4).orientation;
                                    n18 = 1;
                                    if (n3 != n18) break block72;
                                    object4 = LayoutInflater.from((Context)this);
                                    object8 = this.C;
                                    Intrinsics.checkNotNull(object8);
                                    n18 = (Integer)object8;
                                    object4 = object4.inflate(n18, null);
                                    Intrinsics.checkNotNull(object4, (String)object6);
                                    object4 = (RelativeLayout)object4;
                                }
                                object4 = this.D;
                                if (object4 == null) break block73;
                                n3 = (Integer)object4;
                                if (n3 == n15) break block74;
                            }
                            object4 = this.getResources();
                            object4 = object4.getConfiguration();
                            n3 = ((Configuration)object4).orientation;
                            n18 = 2;
                            if (n3 != n18) break block74;
                            object4 = LayoutInflater.from((Context)this);
                            object8 = this.D;
                            Intrinsics.checkNotNull(object8);
                            n18 = (Integer)object8;
                            object4 = object4.inflate(n18, null);
                            Intrinsics.checkNotNull(object4, (String)object6);
                            object4 = (RelativeLayout)object4;
                        }
                        object4 = this.o;
                        if (object4 == null) break block75;
                        object4 = object4.Y();
                        break block76;
                    }
                    n3 = 0;
                    object4 = null;
                }
                object4 = LayoutInflater.from((Context)object4);
                n10 = R$layout.jio_html_interstitial_layout;
                try {
                    object4 = object4.inflate(n10, null);
                }
                catch (Exception exception) {
                    object4 = LayoutInflater.from((Context)this);
                    n10 = R$layout.jio_html_interstitial_layout;
                    object4 = object4.inflate(n10, null);
                }
            }
            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type android.view.ViewGroup");
            object4 = (ViewGroup)object4;
            this.G = object4;
            object4 = new StringBuilder();
            object6 = this.o;
            if (object6 != null) {
                object6 = object6.P();
            } else {
                n10 = 0;
                object6 = null;
            }
            ((StringBuilder)object4).append((String)object6);
            ((StringBuilder)object4).append(": Call initWebView value an webViewHandler : ");
            object6 = this.j;
            ((StringBuilder)object4).append(object6);
            Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), (String)object5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            object4 = this.j;
            if (object4 == null) {
                object4 = new WebView((Context)this);
                object5 = new RelativeLayout.LayoutParams(n15, n15);
                n10 = -16777216;
                object4.setBackgroundColor(n10);
                object4.setLayoutParams((ViewGroup.LayoutParams)object5);
                object6 = new c_0(this, (String)object, (List)object3, (List)object2);
                object2 = this.o;
                this.j = object5 = new x((Context)this, (WebView)object4, (o)object6, (com.jio.jioads.common.b)object2);
                if (object != null) {
                    n8 = 0;
                    object2 = null;
                    this.A = 0;
                    ((x)object5).c((String)object);
                } else {
                    object2 = this.g;
                    ((x)object5).c((String)object2);
                }
            } else {
                if (object == null || (n8 = ((String)object).length()) == 0) {
                    object2 = this.k;
                    if (object2 != null) {
                        object2 = (V)object2;
                        object3 = "";
                        ((V)object2).i((String)object3);
                    }
                    if ((object2 = this.l) != null) {
                        object2 = ((com.jio.jioads.controller.f)object2).a;
                        ((com.jio.jioads.controller.o)object2).d0();
                    }
                    this.a();
                    object2 = this.l;
                    if (object2 != null) {
                        object3 = Constants$HeaderKeys.X_Jio_VIM.getKey();
                        object2 = ((com.jio.jioads.controller.f)object2).a((String)object3);
                    } else {
                        n8 = 0;
                        object2 = null;
                    }
                    n7 = TextUtils.isEmpty((CharSequence)object2);
                    if (n7 == 0 && (n7 = this.R) == 0 && (object3 = this.S) == null) {
                        object3 = new r(this, (String)object2);
                        object2 = object3.start();
                        this.S = object2;
                    }
                }
                if ((object2 = this.H) == (object3 = com.jio.jioads.interstitial.j.e) && (object2 = this.L) == (object3 = com.jio.jioads.interstitial.j.d)) {
                    object2 = this.l;
                    if (object2 != null) {
                        object2 = (com.jio.jioads.controller.f)object2;
                        ((com.jio.jioads.controller.f)object2).g();
                    }
                    if ((object2 = this.F) != null) {
                        ((com.jio.jioads.instream.audio.j)object2).x();
                    }
                }
                this.j();
                this.e();
            }
            object2 = this.G;
            if (object2 != null) {
                object3 = "JioInterstatialHTML";
                object2 = (ViewGroup)object2.findViewWithTag(object3);
            } else {
                n8 = 0;
                object2 = null;
            }
            object3 = this.D;
            if (object3 == null || (n7 = ((Integer)object3).intValue()) != n15 || (object3 = this.C) == null || (n7 = ((Integer)object3).intValue()) != n15 || (n7 = ((Utility)(object3 = Utility.INSTANCE)).getCurrentUIModeType((Context)this)) == n14) {
                object3 = this.G;
                if (object3 != null) {
                    object4 = "JioInterstitialCtaButton";
                    object3 = object3.findViewWithTag(object4);
                } else {
                    n7 = 0;
                    object3 = null;
                }
                this.K = object3;
                this.f();
            }
            if ((object == null || (n4 = ((String)object).length()) == 0) && (object = this.l) != null) {
                object3 = com.jio.jioads.utils.e.d(this.i);
                object = (com.jio.jioads.controller.f)object;
                Intrinsics.checkNotNullParameter(object3, "campaignid");
                object4 = "type";
                object5 = "i";
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object = ((com.jio.jioads.controller.f)object).a;
                ((com.jio.jioads.controller.o)object).v((String)object3, (String)object5);
            }
            if ((object = this.j) != null) {
                object = ((x)object).a;
            } else {
                n4 = 0;
                object = null;
            }
            object3 = this.G;
            if (object != null && (object4 = object.getParent()) != null) {
                bl2 = object4 instanceof ViewGroup;
                if (bl2) {
                    object4 = (ViewGroup)object4;
                } else {
                    n3 = 0;
                    object4 = null;
                }
                if (object4 != null) {
                    object4.removeView((View)object);
                }
            }
            if (object3 != null && (object4 = object3.getParent()) != null) {
                bl2 = object4 instanceof ViewGroup;
                if (bl2) {
                    object7 = object4;
                    object7 = (ViewGroup)object4;
                }
                if (object7 != null) {
                    object7.removeView((View)object3);
                }
            }
            if (object2 != null) {
                object2.addView((View)object);
            }
            if ((object = this.f) != null) {
                object.addView((View)object3);
            }
        }
    }

    public final void allowBackPress() {
        this.B = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String b() {
        Object object;
        String string2;
        block15: {
            block12: {
                int n3;
                block14: {
                    Object object2;
                    block13: {
                        string2 = null;
                        try {
                            object = this.I;
                            if (object == null) break block12;
                        }
                        catch (Exception exception) {
                            return string2;
                        }
                        object2 = this.o;
                        if (object2 == null) break block13;
                        object2 = object2.B();
                        if (object2 == null) break block13;
                        n3 = (Integer)object2;
                        break block14;
                    }
                    n3 = 0;
                    object2 = null;
                }
                n_0 n_02 = new n_0(this);
                object = ((m)object).e((Context)this, n3, n_02);
                break block15;
            }
            object = null;
        }
        if (object == null) return string2;
        object = CollectionsKt.firstOrNull((List)object);
        object = (k)object;
        if (object == null) return string2;
        return ((k)object).c;
    }

    /*
     * Unable to fully structure code
     */
    public final String c() {
        block96: {
            block113: {
                block116: {
                    block118: {
                        block117: {
                            block115: {
                                block114: {
                                    block110: {
                                        block112: {
                                            block111: {
                                                block109: {
                                                    block106: {
                                                        block108: {
                                                            block107: {
                                                                block105: {
                                                                    block104: {
                                                                        block101: {
                                                                            block103: {
                                                                                block102: {
                                                                                    block100: {
                                                                                        block99: {
                                                                                            block98: {
                                                                                                block97: {
                                                                                                    block95: {
                                                                                                        block94: {
                                                                                                            var1_1 = 1;
                                                                                                            var2_2 = "message";
                                                                                                            var3_3 = new StringBuilder();
                                                                                                            var4_4 = this.o;
                                                                                                            if (var4_4 == null) break block94;
                                                                                                            var4_4 = var4_4.P();
                                                                                                            break block95;
                                                                                                        }
                                                                                                        var5_5 = false;
                                                                                                        var4_4 = null;
                                                                                                    }
                                                                                                    var3_3.append((String)var4_4);
                                                                                                    var4_4 = ": Inside getInterstitialCompanionAd";
                                                                                                    var3_3.append((String)var4_4);
                                                                                                    var3_3 = var3_3.toString();
                                                                                                    Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                                                                                                    var3_3 = JioAds.Companion;
                                                                                                    var4_4 = var3_3.getInstance();
                                                                                                    var4_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                    var4_4 = JioAds$LogLevel.NONE;
                                                                                                    var4_4 = com.jio.jioads.interstitial.j.d;
                                                                                                    this.L = var4_4;
                                                                                                    var4_4 = this.I;
                                                                                                    if (var4_4 == null) break block96;
                                                                                                    var4_4 = var4_4.a;
                                                                                                    if (var4_4 == null) break block97;
                                                                                                    var6_6 = this.b();
                                                                                                    var4_4 = var4_4.m;
                                                                                                    var4_4 = var4_4.get(var6_6);
                                                                                                    var4_4 = (String)var4_4;
                                                                                                    break block98;
                                                                                                }
                                                                                                var5_5 = false;
                                                                                                var4_4 = null;
                                                                                            }
                                                                                            var6_6 = this.I;
                                                                                            if (var6_6 == null) break block99;
                                                                                            var6_6 = var6_6.a;
                                                                                            if (var6_6 == null) break block99;
                                                                                            var7_7 = this.b();
                                                                                            var6_6 = var6_6.n;
                                                                                            var6_6 = var6_6.get(var7_7);
                                                                                            var6_6 = (String)var6_6;
                                                                                            break block100;
                                                                                        }
                                                                                        var6_6 = null;
                                                                                    }
                                                                                    var8_8 = TextUtils.isEmpty((CharSequence)var4_4);
                                                                                    if (var8_8 != 0) break block101;
                                                                                    var9_9 = new StringBuilder();
                                                                                    var6_6 = this.o;
                                                                                    if (var6_6 == null) break block102;
                                                                                    var6_6 = var6_6.P();
                                                                                    break block103;
                                                                                }
                                                                                var6_6 = null;
                                                                            }
                                                                            var9_9.append((String)var6_6);
                                                                            var6_6 = ": HTML companion Ad: ";
                                                                            var9_9.append((String)var6_6);
                                                                            var9_9.append((String)var4_4);
                                                                            var9_9 = var9_9.toString();
                                                                            Intrinsics.checkNotNullParameter(var9_9, (String)var2_2);
                                                                            var9_9 = var3_3.getInstance();
                                                                            var9_9.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                            return var4_4;
                                                                        }
                                                                        var5_5 = TextUtils.isEmpty((CharSequence)var6_6);
                                                                        if (var5_5) break block96;
                                                                        var4_4 = new StringBuilder();
                                                                        var7_7 = this.o;
                                                                        if (var7_7 == null) break block104;
                                                                        var7_7 = var7_7.P();
                                                                        break block105;
                                                                    }
                                                                    var8_8 = 0;
                                                                    var7_7 = null;
                                                                }
                                                                var4_4.append((String)var7_7);
                                                                var7_7 = ": static companion Ad: ";
                                                                var4_4.append((String)var7_7);
                                                                var4_4.append((String)var6_6);
                                                                var4_4 = var4_4.toString();
                                                                Intrinsics.checkNotNullParameter(var4_4, (String)var2_2);
                                                                var2_2 = var3_3.getInstance();
                                                                var2_2.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                var2_2 = this.I;
                                                                if (var2_2 == null) break block106;
                                                                var2_2 = var2_2.a;
                                                                if (var2_2 == null) break block106;
                                                                var3_3 = this.b();
                                                                var4_4 = this.I;
                                                                if (var4_4 == null) break block107;
                                                                var4_4 = var4_4.a;
                                                                if (var4_4 == null) break block107;
                                                                var4_4 = var4_4.z;
                                                                break block108;
                                                            }
                                                            var5_5 = false;
                                                            var4_4 = null;
                                                        }
                                                        var2_2 = var2_2.c((String)var3_3, (String)var4_4);
                                                        break block109;
                                                    }
                                                    var10_11 = false;
                                                    var2_2 = null;
                                                }
                                                var10_11 = TextUtils.isEmpty((CharSequence)var2_2);
                                                var11_12 = 32;
                                                var5_5 = false;
                                                var4_4 = null;
                                                if (var10_11) break block110;
                                                var2_2 = this.I;
                                                if (var2_2 == null) ** GOTO lbl-1000
                                                var2_2 = var2_2.a;
                                                if (var2_2 == null) ** GOTO lbl-1000
                                                var7_7 = this.b();
                                                var12_13 = this.I;
                                                if (var12_13 == null) break block111;
                                                var12_13 = var12_13.a;
                                                if (var12_13 == null) break block111;
                                                var12_13 = var12_13.z;
                                                break block112;
                                            }
                                            var13_15 = 0;
                                            var12_13 = null;
                                        }
                                        var2_2 = var2_2.c((String)var7_7, (String)var12_13);
                                        if (var2_2 == null) ** GOTO lbl-1000
                                        var8_8 = var2_2.length() - var1_1;
                                        var13_15 = 0;
                                        var12_13 = null;
                                        var14_17 = false;
                                        while (var13_15 <= var8_8) {
                                            var15_19 = var14_17 == false ? var13_15 : var8_8;
                                            var15_19 = var2_2.charAt(var15_19);
                                            var15_19 = Intrinsics.compare(var15_19, var11_12);
                                            var15_19 = var15_19 <= 0 ? 1 : 0;
                                            if (!var14_17) {
                                                if (var15_19 == 0) {
                                                    var14_17 = true;
                                                    continue;
                                                }
                                                var13_15 += var1_1;
                                                continue;
                                            }
                                            if (var15_19 == 0) break;
                                            var8_8 += -1;
                                        }
                                        var8_8 += var1_1;
                                        var9_10 = var2_2.subSequence(var13_15, var8_8);
                                        var9_10 = var9_10.toString();
                                        break block113;
                                    }
                                    var2_2 = this.I;
                                    if (var2_2 == null) break block114;
                                    var2_2 = var2_2.a;
                                    if (var2_2 == null) break block114;
                                    var2_2 = var2_2.g;
                                    var7_7 = this.b();
                                    var13_16 = var2_2.isEmpty() ^ var1_1;
                                    if (var13_16 == 0) break block114;
                                    var2_2 = var2_2.get(var7_7);
                                    var2_2 = (String)var2_2;
                                    break block115;
                                }
                                var10_11 = false;
                                var2_2 = null;
                            }
                            var10_11 = TextUtils.isEmpty((CharSequence)var2_2);
                            if (var10_11) break block116;
                            var2_2 = this.I;
                            if (var2_2 == null) ** GOTO lbl-1000
                            var2_2 = var2_2.a;
                            if (var2_2 == null) ** GOTO lbl-1000
                            var2_2 = var2_2.g;
                            var7_7 = this.b();
                            var13_16 = var2_2.isEmpty() ^ var1_1;
                            if (var13_16 == 0) break block117;
                            var2_2 = var2_2.get(var7_7);
                            var2_2 = (String)var2_2;
                            break block118;
                        }
                        var10_11 = false;
                        var2_2 = null;
                    }
                    if (var2_2 != null) {
                        var8_8 = var2_2.length() - var1_1;
                        var13_16 = 0;
                        var12_14 = null;
                        var14_18 = false;
                        while (var13_16 <= var8_8) {
                            var15_20 = var14_18 == false ? var13_16 : var8_8;
                            var15_20 = var2_2.charAt(var15_20);
                            var15_20 = Intrinsics.compare(var15_20, var11_12);
                            var15_20 = var15_20 <= 0 ? 1 : 0;
                            if (!var14_18) {
                                if (var15_20 == 0) {
                                    var14_18 = true;
                                    continue;
                                }
                                var13_16 += var1_1;
                                continue;
                            }
                            if (var15_20 == 0) break;
                            var8_8 += -1;
                        }
                        var8_8 += var1_1;
                        var9_10 = var2_2.subSequence(var13_16, var8_8);
                        var9_10 = var9_10.toString();
                        ** GOTO lbl299
                    } else lbl-1000:
                    // 6 sources

                    {
                        var1_1 = 0;
                        var9_10 = null;
                    }
                    break block113;
                }
                var9_10 = "#";
            }
            try {
                var2_2 = new StringBuilder();
                var3_3 = "<!DOCTYPE html><html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><style>img {max-width: 100%; height:auto; position: fixed;top: 50%;left: 50%;transform: translate(-50%, -50%);}</style></head><body><center><img onclick=\"window.open('";
            }
            catch (Exception v0) {}
            var2_2.append((String)var3_3);
            var2_2.append((String)var9_10);
            var9_10 = "')\" src=";
            var2_2.append((String)var9_10);
            var2_2.append((String)var6_6);
            var9_10 = "></center></body></html>";
            var2_2.append((String)var9_10);
            return var2_2.toString();
        }
        return null;
    }

    public final void closeAd(Integer object, Integer object2, Integer object3) {
        boolean bl2;
        int n3;
        int n4;
        boolean bl3 = true;
        boolean bl4 = this.J;
        String string2 = null;
        if (bl4) {
            object = new StringBuilder();
            object2 = this.o;
            if (object2 != null) {
                string2 = object2.P();
            }
            j_0.k((StringBuilder)object, string2, " : Ad skip counter is runing to returning closead");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        bl4 = false;
        JioAdView$AdState jioAdView$AdState = null;
        U = false;
        Object object4 = new StringBuilder();
        Object object5 = this.o;
        if (object5 != null) {
            object5 = object5.P();
        } else {
            n4 = 0;
            object5 = null;
        }
        String string3 = ": Inside closeAd of InterstitialAdActivity";
        j_0.k((StringBuilder)object4, (String)object5, string3);
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = JioAds$LogLevel.NONE;
        n4 = 9;
        if (object != null && object2 != null) {
            int n7;
            int n8 = (Integer)object2;
            int n10 = (Integer)object;
            Object object6 = new StringBuilder();
            Object object7 = this.o;
            object7 = object7 != null ? object7.P() : null;
            ((StringBuilder)object6).append((String)object7);
            ((StringBuilder)object6).append(" :inside checkEligibilityForReward servedDuration: ");
            ((StringBuilder)object6).append(n8);
            ((StringBuilder)object6).append(" totalDuration: ");
            ((StringBuilder)object6).append(n10);
            ((StringBuilder)object6).append(" rewardSkipValue: ");
            ((StringBuilder)object6).append(object3);
            object6 = ((StringBuilder)object6).toString();
            object7 = "message";
            Intrinsics.checkNotNullParameter(object6, (String)object7);
            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object6 = this.i;
            int n14 = com.jio.jioads.utils.e.a((HashMap)object6);
            if (n14 != n4 || object3 == null || ((n4 = ((Integer)object3).intValue()) != 0 || n8 != n10) && n8 < (n7 = ((Integer)object3).intValue())) {
                bl3 = false;
            }
            if ((object3 = this.k) != null) {
                jioAdView$AdState = JioAdView$AdState.CLOSED;
                object3 = (V)object3;
                ((V)object3).e(jioAdView$AdState);
            }
            if ((object3 = this.k) != null) {
                n3 = (int)(Intrinsics.areEqual(object2, object) ? 1 : 0);
                object3 = (V)object3;
                ((V)object3).h(n3 != 0, bl3);
            }
        } else {
            object = this.k;
            if (object != null) {
                object2 = JioAdView$AdState.CLOSED;
                object = (V)object;
                ((V)object).e((JioAdView$AdState)((Object)object2));
            }
            if (object3 != null && (n3 = ((Integer)object3).intValue()) == 0 && (n3 = com.jio.jioads.utils.e.a((HashMap)(object = this.i))) == n4) {
                object = this.k;
                if (object != null) {
                    object = (V)object;
                    ((V)object).h(bl3, bl3);
                }
            } else {
                object = this.k;
                if (object != null) {
                    object = (V)object;
                    object3 = Looper.getMainLooper();
                    object2 = new Handler((Looper)object3);
                    object = ((V)object).a;
                    object3 = new zt_0(object, (int)(bl3 ? 1 : 0));
                    object2.post((Runnable)object3);
                }
            }
        }
        if ((object = this.E) != null) {
            ((NativeAdViewRenderer)object).clearAllData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((object = com.jio.jioads.interstitial.G.k) != null) {
            object2 = ((G)object).b;
            if (object2 != null) {
                ((G)object).b = null;
            }
            if ((object2 = ((G)object).d) != null) {
                ((G)object).d = null;
            }
            if ((object2 = ((G)object).e) != null) {
                ((G)object).e = null;
            }
            if ((object2 = ((G)object).c) != null) {
                ((G)object).c = null;
            }
            if ((object2 = ((G)object).f) != null) {
                ((G)object).f = null;
            }
            if ((object2 = ((G)object).i) != null) {
                ((G)object).i = null;
            }
            if ((object2 = ((G)object).j) != null) {
                ((G)object).j = null;
            }
        }
        if (bl2 = (object = this.f) instanceof com.jio.jioads.common.j) {
            object2 = object;
            object2 = (com.jio.jioads.common.j)((Object)object);
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            ((com.jio.jioads.common.j)((Object)object2)).f = null;
        }
        if (object != null) {
            ((ViewGroup)object).removeAllViews();
        }
        if ((object = this.m) != null) {
            ((s)object).l();
        }
        this.m = null;
        object = this.F;
        if (object != null) {
            ((com.jio.jioads.instream.audio.j)object).m();
        }
        if ((object = this.F) != null) {
            ((com.jio.jioads.instream.audio.j)object).t();
        }
        this.F = null;
        this.f = null;
        this.j = null;
        this.k = null;
        this.o = null;
        n3 = (int)(this.isFinishing() ? 1 : 0);
        if (n3 == 0) {
            object = new StringBuilder();
            object2 = this.o;
            if (object2 != null) {
                string2 = object2.P();
            }
            object2 = ": calling finish in InterstitialAdActivity";
            j_0.k((StringBuilder)object, string2, (String)object2);
            object = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.finish();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void d() {
        Utility utility;
        Drawable[] drawableArray;
        TextView textView;
        TextView textView2;
        Integer n3;
        int n4;
        int n7;
        InterstitialActivity interstitialActivity = this;
        int n8 = 1;
        com.jio.jioads.common.b b2 = this.o;
        if (b2 == null || (n7 = b2.W()) != 0) {
            void var3_7;
            com.jio.jioads.common.b b3 = interstitialActivity.o;
            if (b3 != null) {
                Integer n10 = b3.V();
            } else {
                n7 = 0;
                Object var3_6 = null;
            }
            if (var3_7 != null && (n4 = var3_7.intValue()) > 0) {
                long l2 = var3_7.intValue();
                n7 = 1000;
                long l3 = n7;
                l_0 l_02 = new l_0(interstitialActivity);
                com.jio.jioads.util.s.b(l2 *= l3, l_02);
            }
        }
        TextView textView3 = interstitialActivity.r;
        TextView textView4 = "message";
        long l4 = 500L;
        int n14 = 3;
        int n15 = 8;
        int n16 = 2;
        int n17 = 4;
        if (textView3 != null && (n3 = interstitialActivity.O) != null) {
            int n18;
            HashMap hashMap;
            Intrinsics.checkNotNull(n3);
            n7 = n3;
            if (n7 >= 0 && (n7 = com.jio.jioads.utils.e.a(hashMap = interstitialActivity.i)) == (n18 = 9)) {
                Utility utility2;
                void var3_15;
                Object object;
                Object object2;
                TextView textView5 = interstitialActivity.t;
                if (textView5 == null) {
                    TextView textView6 = interstitialActivity.r;
                }
                if ((object2 = interstitialActivity.q) != null) {
                    object2.setVisibility(n15);
                }
                Drawable[] drawableArray2 = interstitialActivity.t;
                if (drawableArray2 == null) {
                    drawableArray2 = interstitialActivity.r;
                    if (drawableArray2 != null) {
                        object2 = drawableArray2.getContentDescription();
                        drawableArray2.setText((CharSequence)object2);
                    }
                    drawableArray2 = interstitialActivity.H;
                    object2 = com.jio.jioads.interstitial.j.e;
                    if (drawableArray2 == object2 && (drawableArray2 = interstitialActivity.w) != null && (n15 = drawableArray2.length) >= n17) {
                        drawableArray2 = new StringBuilder();
                        object2 = interstitialActivity.o;
                        if (object2 != null) {
                            object2 = object2.P();
                        } else {
                            n18 = 0;
                            object2 = null;
                        }
                        drawableArray2.append((String)object2);
                        drawableArray2.append(": rewardAdDrawables ");
                        object2 = interstitialActivity.w;
                        if (object2 != null) {
                            n18 = ((Object)object2).length;
                            object2 = n18;
                        } else {
                            n18 = 0;
                            object2 = null;
                        }
                        drawableArray2.append(object2);
                        drawableArray2 = drawableArray2.toString();
                        Intrinsics.checkNotNullParameter(drawableArray2, (String)textView4);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        textView4 = JioAds$LogLevel.NONE;
                        textView4 = interstitialActivity.r;
                        if (textView4 != null) {
                            Drawable drawable2;
                            drawableArray2 = interstitialActivity.w;
                            if (drawableArray2 != null) {
                                drawableArray2 = (Drawable[])tp_2.E(0, drawableArray2);
                            } else {
                                n15 = 0;
                                drawableArray2 = null;
                            }
                            object2 = interstitialActivity.w;
                            if (object2 != null) {
                                object2 = (Drawable)tp_2.E(n8, (Object[])object2);
                            } else {
                                n18 = 0;
                                object2 = null;
                            }
                            Object[] objectArray = interstitialActivity.w;
                            if (objectArray != null) {
                                drawable2 = (Drawable)tp_2.E(n16, objectArray);
                            } else {
                                n16 = 0;
                                drawable2 = null;
                            }
                            Object[] objectArray2 = interstitialActivity.w;
                            if (objectArray2 != null) {
                                object = (Drawable)tp_2.E(n14, objectArray2);
                            } else {
                                boolean bl2 = false;
                                object = null;
                            }
                            textView4.setCompoundDrawables((Drawable)drawableArray2, (Drawable)object2, drawable2, (Drawable)object);
                        }
                    } else {
                        int n19;
                        textView4 = interstitialActivity.r;
                        if (textView4 != null) {
                            Drawable drawable3;
                            drawableArray2 = interstitialActivity.w;
                            if (drawableArray2 != null) {
                                drawableArray2 = (Drawable)tp_2.E(0, drawableArray2);
                            } else {
                                n15 = 0;
                                drawableArray2 = null;
                            }
                            object2 = interstitialActivity.w;
                            if (object2 != null) {
                                object2 = (Drawable)tp_2.E(n8, (Object[])object2);
                            } else {
                                n18 = 0;
                                object2 = null;
                            }
                            Object[] objectArray = interstitialActivity.w;
                            if (objectArray != null) {
                                drawable3 = (Drawable)tp_2.E(n16, objectArray);
                            } else {
                                n16 = 0;
                                drawable3 = null;
                            }
                            Object[] objectArray3 = interstitialActivity.w;
                            if (objectArray3 != null) {
                                object = (Drawable)tp_2.E(n14, objectArray3);
                            } else {
                                n19 = 0;
                                object = null;
                            }
                            textView4.setCompoundDrawables((Drawable)drawableArray2, (Drawable)object2, drawable3, (Drawable)object);
                        }
                        if ((n19 = ((Utility)(object = Utility.INSTANCE)).getCurrentUIModeType((Context)interstitialActivity)) == n17) {
                            object = new t(interstitialActivity);
                            com.jio.jioads.util.s.b(l4, (Function0)object);
                        }
                    }
                }
                if (var3_15 != null) {
                    var3_15.setVisibility(0);
                }
                object = interstitialActivity.t;
                if (object != null) {
                    object.bringToFront();
                }
                if (var3_15 != null) {
                    var3_15.setVisibility(0);
                }
                if (var3_15 != null) {
                    var3_15.setFocusable(n8 != 0);
                }
                if (var3_15 != null) {
                    object = new e(interstitialActivity);
                    var3_15.setOnClickListener((View.OnClickListener)object);
                }
                if ((n7 = (utility2 = Utility.INSTANCE).getCurrentUIModeType((Context)interstitialActivity)) != n17) return;
                TextView textView7 = interstitialActivity.r;
                if (textView7 != null) {
                    textView7.setFocusable(n8 != 0);
                }
                TextView textView8 = interstitialActivity.r;
                if (textView8 != null) {
                    textView8.setFocusableInTouchMode(n8 != 0);
                }
                v v4 = new v(interstitialActivity);
                com.jio.jioads.util.s.b(l4, v4);
                return;
            }
        }
        TextView textView9 = (textView2 = interstitialActivity.t) == null ? interstitialActivity.q : textView2;
        TextView textView10 = interstitialActivity.q;
        if (textView10 != null) {
            if (textView2 == null) {
                n7 = 0;
                Object var3_21 = null;
            } else {
                n7 = 8;
            }
            textView10.setVisibility(n7);
        }
        if ((textView = interstitialActivity.r) != null) {
            textView.setVisibility(n15);
        }
        TextView textView11 = interstitialActivity.t;
        String string2 = "Close";
        String string3 = "Close Ad";
        if (textView11 == null) {
            Drawable[] drawableArray3;
            j j3;
            Object object;
            TextView textView12 = interstitialActivity.q;
            if (textView12 != null) {
                object = "Skip Ad";
                textView12.setText((CharSequence)object);
            }
            com.jio.jioads.common.b b4 = interstitialActivity.o;
            if (b4 != null && (n7 = b4.W()) == n16) {
                TextView textView13;
                TextView textView14 = interstitialActivity.q;
                if (textView14 != null) {
                    textView14.setText((CharSequence)string2);
                }
                Utility utility3 = Utility.INSTANCE;
                n7 = utility3.getCurrentUIModeType((Context)interstitialActivity);
                if (n7 == n17 && (textView13 = interstitialActivity.q) != null) {
                    textView13.setText((CharSequence)string3);
                }
            }
            if ((j3 = interstitialActivity.H) == (object = com.jio.jioads.interstitial.j.e) && (drawableArray3 = interstitialActivity.v) != null && (n7 = drawableArray3.length) >= n17) {
                int n20;
                StringBuilder stringBuilder = new StringBuilder();
                object = interstitialActivity.o;
                if (object != null) {
                    object = object.P();
                } else {
                    n20 = 0;
                    object = null;
                }
                stringBuilder.append((String)object);
                stringBuilder.append(": skipAdDrawables ");
                object = interstitialActivity.v;
                if (object != null) {
                    n20 = ((Object)object).length;
                    object = n20;
                } else {
                    n20 = 0;
                    object = null;
                }
                stringBuilder.append(object);
                Intrinsics.checkNotNullParameter(stringBuilder.toString(), (String)textView4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                TextView textView15 = interstitialActivity.Q;
                if (textView15 != null) {
                    Drawable drawable4;
                    textView4 = interstitialActivity.v;
                    if (textView4 != null) {
                        textView4 = (Drawable)tp_2.E(0, (Object[])textView4);
                    } else {
                        n4 = 0;
                        textView4 = null;
                    }
                    object = interstitialActivity.v;
                    if (object != null) {
                        object = (Drawable)tp_2.E(n8, (Object[])object);
                    } else {
                        n20 = 0;
                        object = null;
                    }
                    drawableArray = interstitialActivity.v;
                    if (drawableArray != null) {
                        drawableArray = (Drawable[])tp_2.E(n16, drawableArray);
                    } else {
                        boolean bl3 = false;
                        drawableArray = null;
                    }
                    Object[] objectArray = interstitialActivity.v;
                    if (objectArray != null) {
                        drawable4 = (Drawable)tp_2.E(n14, objectArray);
                    } else {
                        n14 = 0;
                        drawable4 = null;
                    }
                    textView15.setCompoundDrawables((Drawable)textView4, (Drawable)object, (Drawable)drawableArray, drawable4);
                }
            } else {
                TextView textView16 = interstitialActivity.Q;
                if (textView16 != null) {
                    Drawable drawable5;
                    Drawable drawable6;
                    drawableArray = interstitialActivity.v;
                    if (drawableArray != null) {
                        drawableArray = (Drawable)tp_2.E(0, drawableArray);
                    } else {
                        boolean bl4 = false;
                        drawableArray = null;
                    }
                    textView4 = interstitialActivity.v;
                    if (textView4 != null) {
                        textView4 = (Drawable)tp_2.E(n8, (Object[])textView4);
                    } else {
                        n4 = 0;
                        textView4 = null;
                    }
                    object = interstitialActivity.v;
                    if (object != null) {
                        drawable6 = (Drawable)tp_2.E(n16, (Object[])object);
                    } else {
                        n16 = 0;
                        drawable6 = null;
                    }
                    object = interstitialActivity.v;
                    if (object != null) {
                        drawable5 = (Drawable)tp_2.E(n14, (Object[])object);
                    } else {
                        n14 = 0;
                        drawable5 = null;
                    }
                    textView16.setCompoundDrawables((Drawable)drawableArray, (Drawable)textView4, drawable6, drawable5);
                }
            }
        }
        if (textView9 != null) {
            textView9.setVisibility(0);
        }
        TextView textView17 = interstitialActivity.t;
        if (textView17 != null) {
            textView17.bringToFront();
        }
        if (textView9 != null) {
            textView9.setVisibility(0);
        }
        if (textView9 != null) {
            textView9.setFocusable(n8 != 0);
        }
        if (textView9 != null) {
            f f5 = new f(interstitialActivity, textView9);
            textView9.setOnFocusChangeListener((View.OnFocusChangeListener)f5);
        }
        n7 = interstitialActivity.A;
        if (n7 <= 0) {
            TextView textView18;
            TextView textView19 = interstitialActivity.u;
            if (textView19 != null) {
                textView19.setText((CharSequence)string2);
            }
            TextView textView20 = interstitialActivity.q;
            if (textView20 != null) {
                textView20.setText((CharSequence)string2);
            }
            Utility utility4 = Utility.INSTANCE;
            n7 = utility4.getCurrentUIModeType((Context)interstitialActivity);
            if (n7 == n17) {
                TextView textView21 = interstitialActivity.Q;
                if (textView21 != null) {
                    textView21.setText((CharSequence)string3);
                }
                TextView textView22 = interstitialActivity.q;
                if (textView22 != null) {
                    textView22.setText((CharSequence)string3);
                }
                TextView textView23 = interstitialActivity.u;
                if (textView23 != null) {
                    textView23.setText((CharSequence)string3);
                }
            }
            if ((textView18 = interstitialActivity.q) != null) {
                drawableArray = new fh2_0(interstitialActivity, n8);
                textView18.setOnClickListener((View.OnClickListener)drawableArray);
            }
        }
        if ((n7 = (utility = Utility.INSTANCE).getCurrentUIModeType((Context)interstitialActivity)) == n17) {
            TextView textView24 = interstitialActivity.q;
            if (textView24 != null) {
                textView24.setFocusable(n8 != 0);
            }
            TextView textView25 = interstitialActivity.q;
            if (textView25 != null) {
                textView25.setFocusableInTouchMode(n8 != 0);
            }
            y y5 = new y(interstitialActivity);
            com.jio.jioads.util.s.b(l4, y5);
            TextView textView26 = interstitialActivity.u;
            if (textView26 != null) {
                textView26.setVisibility(n15);
            }
        }
        if (textView9 == null) return;
        gh2_0 gh2_02 = new gh2_0(interstitialActivity, n8);
        textView9.setOnClickListener((View.OnClickListener)gh2_02);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void e() {
        block86: {
            block88: {
                block87: {
                    block89: {
                        block90: {
                            var1_1 = 1;
                            var2_2 = new StringBuilder("txtvCloseAd :: ");
                            var3_3 /* !! */  = this.q;
                            var2_2.append(var3_3 /* !! */ );
                            var2_2 = var2_2.toString();
                            var3_3 /* !! */  = "message";
                            Intrinsics.checkNotNullParameter(var2_2, (String)var3_3 /* !! */ );
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var2_2 = JioAds$LogLevel.NONE;
                            var2_2 = this.q;
                            var4_4 = 0L;
                            if (var2_2 == null) break block86;
                            var2_2 = String.valueOf(var2_2.getContentDescription());
                            this.s = var2_2;
                            var2_2 = this.q;
                            var6_5 = var2_2 instanceof TextView;
                            var7_6 = null;
                            if (var6_5 == 0) {
                                var8_7 = 0;
                                var2_2 = null;
                            }
                            if (var2_2 != null) {
                                var2_2 = var2_2.getText();
                            } else {
                                var8_7 = 0;
                                var2_2 = null;
                            }
                            var2_2 = String.valueOf(var2_2);
                            this.x = var2_2;
                            var2_2 = this.r;
                            var6_5 = var2_2 instanceof TextView;
                            if (var6_5 == 0) {
                                var8_7 = 0;
                                var2_2 = null;
                            }
                            if (var2_2 != null) {
                                var2_2 = ((TextView)var2_2).getText();
                            } else {
                                var8_7 = 0;
                                var2_2 = null;
                            }
                            var2_2 = String.valueOf(var2_2);
                            this.y = var2_2;
                            var2_2 = Utility.INSTANCE;
                            var6_5 = var2_2.getCurrentUIModeType((Context)this);
                            var9_8 = 8;
                            var10_9 = 4;
                            var11_10 = -1;
                            if (var6_5 == var10_9) {
                                var12_11 = this.D;
                                if (var12_11 != null && (var6_5 = var12_11.intValue()) == var11_10) {
                                    var12_11 = this.q;
                                    var13_12 = var12_11 instanceof TextView;
                                    if (!var13_12) {
                                        var6_5 = 0;
                                        var12_11 = null;
                                    }
                                    if (var12_11 != null) {
                                        var12_11 = ((TextView)var12_11).getCompoundDrawables();
                                    } else {
                                        var6_5 = 0;
                                        var12_11 = null;
                                    }
                                    this.v = var12_11;
                                    var12_11 = this.r;
                                    var13_12 = var12_11 instanceof TextView;
                                    if (!var13_12) {
                                        var6_5 = 0;
                                        var12_11 = null;
                                    }
                                    if (var12_11 != null) {
                                        var12_11 = ((TextView)var12_11).getCompoundDrawables();
                                    } else {
                                        var6_5 = 0;
                                        var12_11 = null;
                                    }
                                    this.w = var12_11;
                                    var12_11 = this.q;
                                    var13_12 = var12_11 instanceof TextView;
                                    if (!var13_12) {
                                        var6_5 = 0;
                                        var12_11 = null;
                                    }
                                    if (var12_11 != null) {
                                        var12_11 = ((TextView)var12_11).getText();
                                    } else {
                                        var6_5 = 0;
                                        var12_11 = null;
                                    }
                                    this.x = var12_11 = String.valueOf(var12_11);
                                    var12_11 = this.r;
                                    var13_12 = var12_11 instanceof TextView;
                                    if (!var13_12) {
                                        var6_5 = 0;
                                        var12_11 = null;
                                    }
                                    if (var12_11 != null) {
                                        var12_11 = ((TextView)var12_11).getText();
                                    } else {
                                        var6_5 = 0;
                                        var12_11 = null;
                                    }
                                    this.y = var12_11 = String.valueOf(var12_11);
                                    var12_11 = this.q;
                                    var13_12 = var12_11 instanceof TextView;
                                    if (var13_12) {
                                        var14_13 = var12_11;
                                    } else {
                                        var13_12 = false;
                                        var14_13 = null;
                                    }
                                    if (var14_13 != null) {
                                        if (var12_11 != null) {
                                            var12_11 = ((View)var12_11).getContentDescription();
                                        } else {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        ((TextView)var14_13).setText((CharSequence)var12_11);
                                    }
                                }
                            } else {
                                var12_11 = this.getResources().getConfiguration();
                                var6_5 = var12_11.orientation;
                                var14_13 = "Close";
                                var15_14 = 2;
                                if (var6_5 == var15_14) {
                                    var12_11 = this.D;
                                    if (var12_11 != null && (var6_5 = var12_11.intValue()) == var11_10) {
                                        var12_11 = this.q;
                                        var15_14 = var12_11 instanceof TextView;
                                        if (var15_14 == 0) {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        if (var12_11 != null) {
                                            var12_11 = var12_11.getCompoundDrawables();
                                        } else {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        this.v = var12_11;
                                        var12_11 = this.r;
                                        var15_14 = var12_11 instanceof TextView;
                                        if (var15_14 == 0) {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        if (var12_11 != null) {
                                            var12_11 = ((TextView)var12_11).getCompoundDrawables();
                                        } else {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        this.w = var12_11;
                                        var12_11 = this.q;
                                        if (var12_11 != null) {
                                            var16_15 = var12_11.getContentDescription();
                                            var12_11.setText(var16_15);
                                        }
                                        var6_5 = this.A;
                                        if (var6_5 != var11_10) {
                                            var12_11 = this.q;
                                            if (var12_11 != null) {
                                                var12_11.setText((CharSequence)var14_13);
                                            }
                                            var12_11 = this.q;
                                            if (var12_11 != null) {
                                                var14_13 = new hh2_0(this, var1_1);
                                                var12_11.setOnClickListener((View.OnClickListener)var14_13);
                                            }
                                            if ((var12_11 = this.q) != null) {
                                                var12_11.setVisibility(var9_8);
                                            }
                                            var12_11 = this.r;
                                            if (var12_11 != null) {
                                                var14_13 = new MH2(this, var1_1);
                                                var12_11.setOnClickListener((View.OnClickListener)var14_13);
                                            }
                                            if ((var12_11 = this.r) != null) {
                                                var12_11.setVisibility(var9_8);
                                            }
                                        }
                                    }
                                } else {
                                    var12_11 = this.C;
                                    if (var12_11 != null && (var6_5 = var12_11.intValue()) == var11_10) {
                                        var12_11 = this.q;
                                        var17_16 = var12_11 instanceof TextView;
                                        if (var17_16 == 0) {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        if (var12_11 != null) {
                                            var12_11 = var12_11.getCompoundDrawables();
                                        } else {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        this.v = var12_11;
                                        var12_11 = this.r;
                                        var17_16 = var12_11 instanceof TextView;
                                        if (var17_16 == 0) {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        if (var12_11 != null) {
                                            var12_11 = ((TextView)var12_11).getCompoundDrawables();
                                        } else {
                                            var6_5 = 0;
                                            var12_11 = null;
                                        }
                                        this.w = var12_11;
                                        var12_11 = this.q;
                                        if (var12_11 != null) {
                                            var18_17 = "Skip Ad";
                                            var12_11.setText((CharSequence)var18_17);
                                        }
                                        var12_11 = this.o;
                                        var18_17 = "Close Ad";
                                        if (var12_11 != null && (var6_5 = var12_11.W()) == var15_14 && (var6_5 = var2_2.getCurrentUIModeType((Context)this)) == var10_9 && (var12_11 = this.q) != null) {
                                            var12_11.setText((CharSequence)var18_17);
                                        }
                                        if ((var6_5 = this.A) == var11_10) {
                                            var12_11 = this.q;
                                            if (var12_11 != null) {
                                                var12_11.setText((CharSequence)var14_13);
                                            }
                                            var6_5 = var2_2.getCurrentUIModeType((Context)this);
                                            if (var6_5 == var10_9 && (var12_11 = this.q) != null) {
                                                var12_11.setText((CharSequence)var18_17);
                                            }
                                            if ((var12_11 = this.q) != null) {
                                                var14_13 = new vh2_0(this, var1_1);
                                                var12_11.setOnClickListener((View.OnClickListener)var14_13);
                                            }
                                            if ((var12_11 = this.q) != null) {
                                                var12_11.setVisibility(var9_8);
                                            }
                                        }
                                    }
                                }
                            }
                            var6_5 = var2_2.getCurrentUIModeType((Context)this);
                            var13_12 = false;
                            var14_13 = null;
                            if (var6_5 == var10_9 && (var12_11 = this.C) != null && (var6_5 = var12_11.intValue()) == var11_10 && (var12_11 = this.getDrawable(var6_5 = R$drawable.jio_back_arrow)) != null) {
                                var15_14 = var12_11.getIntrinsicHeight();
                                var17_16 = var12_11.getIntrinsicWidth();
                                var12_11.setBounds(0, 0, var17_16, var15_14);
                                var12_11 = this.q;
                                if (var12_11 != null) {
                                    var12_11 = var12_11.getCompoundDrawables();
                                    this.v = var12_11;
                                }
                                if ((var15_14 = (var12_11 = this.r) instanceof TextView) == 0) {
                                    var6_5 = 0;
                                    var12_11 = null;
                                }
                                if (var12_11 != null) {
                                    var12_11 = ((TextView)var12_11).getCompoundDrawables();
                                } else {
                                    var6_5 = 0;
                                    var12_11 = null;
                                }
                                this.w = var12_11;
                            }
                            if ((var6_5 = this.A) == 0 || (var6_5 = (int)((cfr_temp_0 = (var19_18 = this.z) - var4_4) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0) break block87;
                            this.restrictBackPress();
                            var2_2 = this.p;
                            if (var2_2 != null) break block88;
                            var8_7 = this.A;
                            if (var8_7 != var11_10) break block89;
                            var12_11 = this.E;
                            if (var12_11 != null && (var12_11 = var12_11.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                                var12_11 = var12_11.q;
                            } else {
                                var6_5 = 0;
                                var12_11 = null;
                            }
                            if (var12_11 == null) break block89;
                            var12_11 = this.r;
                            if (var12_11 == null || (var12_11 = this.O) == null) break block90;
                            Intrinsics.checkNotNull(var12_11);
                            var6_5 = var12_11.intValue();
                            if (var6_5 >= 0) break block89;
                        }
                        if ((var2_2 = this.E) != null && (var2_2 = var2_2.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                            var7_6 = var2_2.q;
                        }
                        Intrinsics.checkNotNull(var7_6);
                        var8_7 = var7_6;
                    }
                    var21_19 = var8_7 *= 1000;
                    var2_2 = new A(this, var21_19);
                    this.p = var2_2;
                    var2_2.start();
                    break block88;
                }
                var8_7 = var2_2.getCurrentUIModeType((Context)this);
                if (var8_7 == var10_9) {
                    var2_2 = this.C;
                    if (var2_2 == null || (var8_7 = var2_2.intValue()) != var11_10) {
                        var2_2 = this.s;
                        var8_7 = (int)TextUtils.isEmpty((CharSequence)var2_2);
                        if (var8_7 == 0) {
                            var2_2 = this.q;
                            if (var2_2 != null) {
                                var12_11 = this.s;
                                var2_2.setText((CharSequence)var12_11);
                            }
                            this.allowBackPress();
                            this.d();
                        }
                    } else {
                        this.allowBackPress();
                        this.d();
                    }
                } else {
                    this.allowBackPress();
                    this.d();
                }
            }
            if ((var2_2 = this.t) != null) break block86;
            var2_2 = this.r;
            if (var2_2 == null || (var2_2 = this.O) == null) ** GOTO lbl-1000
            Intrinsics.checkNotNull(var2_2);
            var8_7 = var2_2.intValue();
            if (var8_7 >= 0) {
                var2_2 = this.r;
                if (var2_2 != null) {
                    var2_2.setVisibility(0);
                }
                var2_2 = this.q;
                if (var2_2 != null) {
                    var2_2.setVisibility(var9_8);
                }
                var2_2 = this.r;
                if (var2_2 != null) {
                    var2_2.bringToFront();
                }
                this.allowBackPress();
            } else if ((var8_7 = this.A) != var11_10) {
                var2_2 = this.q;
                if (var2_2 != null) {
                    var2_2.setVisibility(0);
                }
                var2_2 = this.r;
                if (var2_2 != null) {
                    var2_2.setVisibility(var9_8);
                }
                var2_2 = this.q;
                if (var2_2 != null) {
                    var2_2.bringToFront();
                }
                this.allowBackPress();
            }
        }
        var2_2 = new jw0_0(this, var1_1);
        var21_19 = 200L;
        com.jio.jioads.util.s.b(var21_19, (Function0)var2_2);
        var1_1 = this.A;
        if (var1_1 == 0 || (var6_5 = (cfr_temp_1 = (var23_20 = this.z) - var4_4) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == 0) {
            this.allowBackPress();
            this.d();
        }
    }

    public final void f() {
        View view = this.K;
        if (view != null) {
            int n3;
            Object object = this.j;
            int n4 = 1;
            if (object != null && (n3 = (int)(((x)object).f ? 1 : 0)) == n4) {
                n3 = 0;
                object = null;
            } else {
                n3 = 8;
            }
            view.setVisibility(n3);
            object = this.j;
            if (object != null) {
                ((x)object).d = n4;
            }
            n4 = 1;
            object = new Xt2(this, n4);
            view.setOnClickListener((View.OnClickListener)object);
        }
    }

    public void finish() {
        super.finish();
        Animation animation = AnimationUtils.loadAnimation((Context)this, (int)0x10A0001);
        this.findViewById(0x1020002).startAnimation(animation);
        p p2 = new p(this);
        animation.setAnimationListener((Animation.AnimationListener)p2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        void var7_10;
        String string2;
        Object object;
        int n3;
        Object object2;
        block16: {
            Object object3;
            long l2;
            int n4;
            block17: {
                int n7;
                block18: {
                    j j3;
                    block15: {
                        object2 = this.m;
                        if (object2 != null) {
                            return;
                        }
                        object2 = this.i;
                        n4 = com.jio.jioads.utils.e.e((HashMap)object2);
                        n3 = 0;
                        object = null;
                        if (n4 != 0) {
                            try {
                                object2 = this.i;
                                n4 = com.jio.jioads.utils.e.e((HashMap)object2);
                                break block15;
                            }
                            catch (Exception exception) {}
                        }
                        n4 = 0;
                        object2 = null;
                    }
                    this.A = n4;
                    int n8 = 1;
                    n7 = -1;
                    if (n4 == n7 && (object2 = this.m) != null && (object2 = this.o) != null && (n4 = object2.W()) == n8 && (object2 = this.H) == (j3 = com.jio.jioads.interstitial.j.c)) {
                        object2 = this.m;
                        n4 = object2 != null ? ((s)object2).e0() : -1;
                        this.A = n4;
                    } else {
                        object2 = this.E;
                        if (object2 != null) {
                            this.A = n4 = ((NativeAdViewRenderer)object2).getSkipOffSetDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                    }
                    object2 = this.i;
                    n4 = com.jio.jioads.utils.e.a((HashMap)object2);
                    int n10 = 9;
                    if (n4 == n10) {
                        n3 = 1;
                    }
                    object2 = com.jio.jioads.utils.e.g(this.i);
                    string2 = "message";
                    n10 = 0;
                    Object var7_8 = null;
                    if (object2 == null) break block16;
                    object2 = com.jio.jioads.utils.e.g(this.i);
                    if (object2 != null) {
                        l2 = (Long)object2;
                        n7 = (int)l2;
                    }
                    if (n7 < 0 || n3 == 0) break block16;
                    object2 = new StringBuilder();
                    object3 = this.o;
                    if (object3 != null) {
                        object3 = object3.P();
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append(": Reward value :");
                    object3 = com.jio.jioads.utils.e.g(this.i);
                    ((StringBuilder)object2).append(object3);
                    ((StringBuilder)object2).append(" skipoffset: ");
                    w12_0.b(this.A, string2, (StringBuilder)object2);
                    object2 = JioAds.Companion;
                    ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    n7 = this.A;
                    if (n7 < 0) break block17;
                    l2 = n7;
                    object3 = com.jio.jioads.utils.e.g(this.i);
                    Intrinsics.checkNotNull(object3);
                    long l3 = (Long)object3;
                    n7 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                    if (n7 >= 0) break block17;
                    n7 = this.A;
                    if (n7 <= 0) break block18;
                    l2 = n7;
                    object3 = com.jio.jioads.utils.e.g(this.i);
                    Intrinsics.checkNotNull(object3);
                    l3 = (Long)object3;
                    n7 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                    if (n7 >= 0) break block18;
                    object3 = new StringBuilder();
                    Object object4 = this.o;
                    object4 = object4 != null ? object4.P() : null;
                    String string3 = ": Reward value is greater then Skipoffset so setting reward duration skipoffset duration";
                    com.jio.jioads.adinterfaces.d_0.a((StringBuilder)object3, (String)object4, string3, (JioAds$Companion)object2);
                    n4 = this.A;
                    this.O = object2 = Integer.valueOf(n4);
                    break block16;
                }
                if ((n7 = this.A) <= 0) {
                    object3 = com.jio.jioads.utils.e.g(this.i);
                    Intrinsics.checkNotNull(object3);
                    l2 = (Long)object3;
                    n7 = (int)l2;
                    if (n7 > 0) {
                        object3 = new StringBuilder();
                        Object object5 = this.o;
                        object5 = object5 != null ? object5.P() : null;
                        String string4 = ": Skip duration is Zero and reward value present then select reward duration";
                        com.jio.jioads.adinterfaces.d_0.a((StringBuilder)object3, (String)object5, string4, (JioAds$Companion)object2);
                        object2 = com.jio.jioads.utils.e.g(this.i);
                        Intrinsics.checkNotNull(object2);
                        l2 = (Long)object2;
                        n4 = (int)l2;
                        this.O = object3 = Integer.valueOf(n4);
                        object5 = "null cannot be cast to non-null type kotlin.Int";
                        Intrinsics.checkNotNull(object3, (String)object5);
                        this.A = n4;
                    }
                }
                break block16;
            }
            object3 = new StringBuilder();
            Object object6 = this.o;
            object6 = object6 != null ? object6.P() : null;
            String string5 = ": Skipoffset value is greater then reward so setting skip duration null";
            com.jio.jioads.adinterfaces.d_0.a((StringBuilder)object3, (String)object6, string5, (JioAds$Companion)object2);
            object2 = com.jio.jioads.utils.e.g(this.i);
            Intrinsics.checkNotNull(object2);
            l2 = (Long)object2;
            this.A = n4 = (int)l2;
            this.O = object2 = Integer.valueOf(n4);
        }
        if (n3 == 0) {
            this.O = null;
        }
        object2 = new StringBuilder();
        object = this.o;
        if (object != null) {
            String string6 = object.P();
        }
        ((StringBuilder)object2).append((String)var7_10);
        ((StringBuilder)object2).append(": Final Selected Value For Skip Duration is : ");
        n3 = this.A;
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(" Reward: ");
        object = this.O;
        ((StringBuilder)object2).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
    }

    public final String getAdData() {
        return this.g;
    }

    public final String getAdType() {
        return this.h;
    }

    public final View getCtaButton$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.K;
    }

    public final HashMap getHeaders() {
        return this.i;
    }

    public final int getValue$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        block19: {
            String string3 = "at";
            Intrinsics.checkNotNullParameter(string2, "key");
            Object object = this.i;
            Object object2 = Constants$ResponseHeaderKeys.JIO_DATA;
            String string4 = ((Constants$ResponseHeaderKeys)((Object)object2)).getResponseHeader();
            Locale locale = Locale.ROOT;
            string4 = string4.toLowerCase(locale);
            String string5 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
            Intrinsics.checkNotNullExpressionValue(string4, string5);
            boolean bl2 = ((HashMap)object).containsKey(string4);
            string4 = null;
            if (bl2) {
                block18: {
                    try {
                        object = this.i;
                    }
                    catch (Exception exception) {}
                    object2 = ((Constants$ResponseHeaderKeys)((Object)object2)).getResponseHeader();
                    object2 = ((String)object2).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object2, string5);
                    object = ((HashMap)object).get(object2);
                    object = (String)object;
                    object2 = new JSONObject((String)object);
                    bl2 = Intrinsics.areEqual(string2, string3);
                    if (!bl2) break block18;
                    bl2 = object2.has(string3);
                    if (!bl2) break block18;
                    string2 = object2.getString(string3);
                    string3 = "getString(...)";
                    try {
                        Intrinsics.checkNotNullExpressionValue(string2, string3);
                        int n3 = Integer.parseInt(string2);
                        int n4 = 5;
                        if (n3 == n4 || n3 == (n4 = 11) || n3 == (n4 = 7) || n3 == (n4 = 8) || n3 == (n4 = 9)) {
                            return n4;
                        }
                        break block19;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return 0;
                    }
                }
                boolean bl3 = object2.has(string2);
                if (!bl3) break block19;
                return object2.getInt(string2);
            }
        }
        return 0;
    }

    public final void h() {
        int n3;
        Object object = this.o;
        com.jio.jioads.common.j j3 = object != null ? new com.jio.jioads.common.j((Context)this, (com.jio.jioads.common.b)object) : new RelativeLayout((Context)this);
        this.f = j3;
        int n4 = 1;
        object = new av1_2(this, n4);
        j3.post((Runnable)object);
        object = this.f;
        if (object != null) {
            WindowManager.LayoutParams layoutParams;
            int n7 = -1;
            int n8 = 2;
            n4 = -1;
            int n10 = 512;
            j3 = layoutParams;
            layoutParams = new WindowManager.LayoutParams(n4, n7, n8, n10, 0);
            object.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        object = this.f;
        if (object != null) {
            j3 = this.getResources();
            n4 = 17170444;
            n3 = j3.getColor(n4);
            object.setBackgroundColor(n3);
        }
        object = this.f;
        this.setContentView((View)object);
        n3 = -2;
        object = new RelativeLayout.LayoutParams(n3, n3);
        object.addRule(13);
        int n14 = Build.VERSION.SDK_INT;
        n3 = 28;
        if (n14 >= n3) {
            j3 = this.getWindow().getAttributes();
            a_0.a((WindowManager.LayoutParams)j3);
        }
        if (n14 >= (n3 = 30)) {
            com.jio.jioads.interstitial.b.a(this.getWindow());
            object = G31.a(this.getWindow());
            if (object != null) {
                n3 = NG3.a();
                J31.a((WindowInsetsController)object, n3);
                H31.a((WindowInsetsController)object);
            }
        } else {
            object = this.getWindow().getDecorView();
            n3 = 3844;
            object.setSystemUiVisibility(n3);
        }
    }

    public final void i() {
        String string2;
        NativeAdViewRenderer nativeAdViewRenderer = this.E;
        NativeAdViewRenderer nativeAdViewRenderer2 = null;
        if (nativeAdViewRenderer != null && (nativeAdViewRenderer = nativeAdViewRenderer.getView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            string2 = "NativeAdSkipElement";
            nativeAdViewRenderer = (TextView)nativeAdViewRenderer.findViewWithTag(string2);
        } else {
            nativeAdViewRenderer = null;
        }
        boolean bl2 = nativeAdViewRenderer instanceof TextView;
        if (!bl2) {
            nativeAdViewRenderer = null;
        }
        this.q = (TextView)nativeAdViewRenderer;
        nativeAdViewRenderer = this.E;
        if (nativeAdViewRenderer != null && (nativeAdViewRenderer = nativeAdViewRenderer.getView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            string2 = "RewardTimer";
            nativeAdViewRenderer = (TextView)nativeAdViewRenderer.findViewWithTag(string2);
        } else {
            nativeAdViewRenderer = null;
        }
        bl2 = nativeAdViewRenderer instanceof TextView;
        if (!bl2) {
            nativeAdViewRenderer = null;
        }
        this.r = (TextView)nativeAdViewRenderer;
        nativeAdViewRenderer = this.E;
        if (nativeAdViewRenderer != null && (nativeAdViewRenderer = nativeAdViewRenderer.getView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            string2 = "JioInterstitialCloseAd";
            nativeAdViewRenderer = (TextView)nativeAdViewRenderer.findViewWithTag(string2);
        } else {
            nativeAdViewRenderer = null;
        }
        bl2 = nativeAdViewRenderer instanceof TextView;
        if (!bl2) {
            nativeAdViewRenderer = null;
        }
        this.t = (TextView)nativeAdViewRenderer;
        nativeAdViewRenderer = this.E;
        if (nativeAdViewRenderer != null && (nativeAdViewRenderer = nativeAdViewRenderer.getView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            string2 = "NativeAdSkipElementFocused";
            nativeAdViewRenderer = (TextView)nativeAdViewRenderer.findViewWithTag(string2);
        } else {
            nativeAdViewRenderer = null;
        }
        bl2 = nativeAdViewRenderer instanceof TextView;
        if (bl2) {
            nativeAdViewRenderer2 = nativeAdViewRenderer;
        }
        this.u = (TextView)nativeAdViewRenderer2;
    }

    /*
     * Exception decompiling
     */
    public final boolean isWebViewEnabled() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [4 : 45->51)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void j() {
        String string2;
        ViewGroup viewGroup = this.G;
        ViewGroup viewGroup2 = null;
        if (viewGroup != null) {
            string2 = "NativeAdSkipElement";
            viewGroup = (TextView)viewGroup.findViewWithTag((Object)string2);
        } else {
            viewGroup = null;
        }
        boolean bl2 = viewGroup instanceof TextView;
        if (!bl2) {
            viewGroup = null;
        }
        this.q = (TextView)viewGroup;
        viewGroup = this.G;
        if (viewGroup != null) {
            string2 = "RewardTimer";
            viewGroup = (TextView)viewGroup.findViewWithTag((Object)string2);
        } else {
            viewGroup = null;
        }
        bl2 = viewGroup instanceof TextView;
        if (!bl2) {
            viewGroup = null;
        }
        this.r = (TextView)viewGroup;
        viewGroup = this.G;
        if (viewGroup != null) {
            string2 = "JioInterstitialCloseAd";
            viewGroup = (TextView)viewGroup.findViewWithTag((Object)string2);
        } else {
            viewGroup = null;
        }
        this.t = (TextView)viewGroup;
        viewGroup = this.G;
        if (viewGroup != null) {
            viewGroup2 = viewGroup = viewGroup.findViewWithTag((Object)"NativeAdSkipElementFocused");
            viewGroup2 = (TextView)viewGroup;
        }
        this.u = (TextView)viewGroup2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        block43: {
            block46: {
                block44: {
                    block45: {
                        var1_1 = "message";
                        var2_4 = null;
                        try {
                            var3_5 = new StringBuilder();
                            var4_6 /* !! */  = this.o;
                            var4_6 /* !! */  = var4_6 /* !! */  != null ? var4_6 /* !! */ .P() : null;
                        }
                        catch (Exception var1_2) {
                            break block43;
                        }
                        var3_5.append((String)var4_6 /* !! */ );
                        var4_6 /* !! */  = " :Showing default interstitial companion ad";
                        var3_5.append((String)var4_6 /* !! */ );
                        var3_5 = var3_5.toString();
                        Intrinsics.checkNotNullParameter(var3_5, (String)var1_1);
                        var3_5 = JioAds.Companion;
                        var4_6 /* !! */  = var3_5.getInstance();
                        var4_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var4_6 /* !! */  = JioAds$LogLevel.NONE;
                        var5_7 /* !! */  = Utility.INSTANCE;
                        var6_12 = var5_7 /* !! */ .getCurrentUIModeType((Context)this);
                        var7_13 = 4;
                        if (var6_12 == var7_13) {
                            var5_7 /* !! */  = LayoutInflater.from((Context)this);
                            var8_14 = R$layout.audio_interstitial_companion_tv;
                            var5_7 /* !! */  = var5_7 /* !! */ .inflate(var8_14, null);
                        } else {
                            var5_7 /* !! */  = LayoutInflater.from((Context)this);
                            var8_14 = R$layout.audio_interstitial_companion_mobile;
                            var5_7 /* !! */  = var5_7 /* !! */ .inflate(var8_14, null);
                        }
                        this.P = var5_7 /* !! */ ;
                        if (var5_7 /* !! */  != null) {
                            var5_7 /* !! */ .setVisibility(var7_13);
                        }
                        var5_7 /* !! */  = this.getResources();
                        var5_7 /* !! */  = var5_7 /* !! */ .getConfiguration();
                        var6_12 = var5_7 /* !! */ .orientation;
                        var7_13 = 1;
                        var9_8 = "drawable";
                        if (var6_12 == var7_13) break block45;
                        var7_13 = 2;
                        if (var6_12 != var7_13) {
                            var6_12 = 0;
                            var5_7 /* !! */  = null;
                            break block44;
                        } else {
                            var5_7 /* !! */  = this.l;
                            if (var5_7 /* !! */  != null) {
                                var5_7 /* !! */  = (com.jio.jioads.controller.f)var5_7 /* !! */ ;
                                var5_7 /* !! */  = var5_7 /* !! */ .a;
                                var5_7 /* !! */  = var5_7 /* !! */ .N;
                            } else {
                                var6_12 = 0;
                                var5_7 /* !! */  = null;
                            }
                            if (var5_7 /* !! */  != null) {
                                var10_9 = new StringBuilder();
                                var9_8 = this.o;
                                if (var9_8 != null) {
                                    var9_8 = var9_8.P();
                                } else {
                                    var8_14 = 0;
                                    var9_8 = null;
                                }
                                var10_9.append((String)var9_8);
                                var9_8 = ": Selecting publisher passed landscape default image";
                                var10_9.append((String)var9_8);
                                var10_9 = var10_9.toString();
                                Intrinsics.checkNotNullParameter(var10_9, (String)var1_1);
                                var1_1 = var3_5.getInstance();
                                var1_1 = var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                break block44;
                            } else {
                                var5_7 /* !! */  = this.getResources();
                                var10_9 = this.getResources();
                                var11_10 = "jio_audio_landscape_default";
                                var12_11 = this.getPackageName();
                                var7_13 = var10_9.getIdentifier((String)var11_10, (String)var9_8, var12_11);
                                var9_8 = WK2.a;
                                var5_7 /* !! */  = var5_7 /* !! */ .getDrawable(var7_13, null);
                                var10_9 = new StringBuilder();
                                var9_8 = this.o;
                                if (var9_8 != null) {
                                    var9_8 = var9_8.P();
                                } else {
                                    var8_14 = 0;
                                    var9_8 = null;
                                }
                                var10_9.append((String)var9_8);
                                var9_8 = ": Selecting predefined landscape default image";
                                var10_9.append((String)var9_8);
                                var10_9 = var10_9.toString();
                                Intrinsics.checkNotNullParameter(var10_9, (String)var1_1);
                                var1_1 = var3_5.getInstance();
                                var1_1 = var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            }
                        }
                        break block44;
                    }
                    var5_7 /* !! */  = this.l;
                    if (var5_7 /* !! */  != null) {
                        var5_7 /* !! */  = (com.jio.jioads.controller.f)var5_7 /* !! */ ;
                        var5_7 /* !! */  = var5_7 /* !! */ .a;
                        var5_7 /* !! */  = var5_7 /* !! */ .M;
                    } else {
                        var6_12 = 0;
                        var5_7 /* !! */  = null;
                    }
                    if (var5_7 /* !! */  != null) {
                        var10_9 = new StringBuilder();
                        var9_8 = this.o;
                        if (var9_8 != null) {
                            var9_8 = var9_8.P();
                        } else {
                            var8_14 = 0;
                            var9_8 = null;
                        }
                        var10_9.append((String)var9_8);
                        var9_8 = ": Selecting publisher passed portrait default image";
                        var10_9.append((String)var9_8);
                        var10_9 = var10_9.toString();
                        Intrinsics.checkNotNullParameter(var10_9, (String)var1_1);
                        var1_1 = var3_5.getInstance();
                        var1_1 = var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    } else {
                        var5_7 /* !! */  = this.getResources();
                        var10_9 = this.getResources();
                        var11_10 = "jio_audio_portrait_default";
                        var12_11 = this.getPackageName();
                        var7_13 = var10_9.getIdentifier((String)var11_10, (String)var9_8, var12_11);
                        var9_8 = WK2.a;
                        var5_7 /* !! */  = var5_7 /* !! */ .getDrawable(var7_13, null);
                        var10_9 = new StringBuilder();
                        var9_8 = this.o;
                        if (var9_8 != null) {
                            var9_8 = var9_8.P();
                        } else {
                            var8_14 = 0;
                            var9_8 = null;
                        }
                        var10_9.append((String)var9_8);
                        var9_8 = ": Selecting predefined portrait default image";
                        var10_9.append((String)var9_8);
                        var10_9 = var10_9.toString();
                        Intrinsics.checkNotNullParameter(var10_9, (String)var1_1);
                        var1_1 = var3_5.getInstance();
                        var1_1 = var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    }
                }
                var1_1 = "id";
                if (var5_7 /* !! */  == null) break block46;
                var3_5 = this.getResources();
                if (var3_5 == null) ** GOTO lbl-1000
                var4_6 /* !! */  = "default_image";
                var10_9 = this.getPackageName();
                var13_15 = var3_5.getIdentifier((String)var4_6 /* !! */ , (String)var1_1, (String)var10_9);
                var4_6 /* !! */  = this.P;
                if (var4_6 /* !! */  != null) {
                    var3_5 = var4_6 /* !! */ .findViewById(var13_15);
                    var3_5 = (ImageView)var3_5;
                } else lbl-1000:
                // 2 sources

                {
                    var13_15 = 0;
                    var3_5 = null;
                }
                if (var3_5 != null) {
                    var3_5.setImageDrawable((Drawable)var5_7 /* !! */ );
                }
                if (var3_5 != null) {
                    var4_6 /* !! */  = new Object();
                    var3_5.setOnClickListener((View.OnClickListener)var4_6 /* !! */ );
                }
            }
            if ((var3_5 = this.getResources()) == null) ** GOTO lbl-1000
            var4_6 /* !! */  = "default_close_button";
            var5_7 /* !! */  = this.getPackageName();
            var14_16 = var3_5.getIdentifier((String)var4_6 /* !! */ , (String)var1_1, (String)var5_7 /* !! */ );
            var3_5 = this.P;
            if (var3_5 != null) {
                var1_1 = var3_5.findViewById(var14_16);
                var1_1 = (TextView)var1_1;
            } else lbl-1000:
            // 2 sources

            {
                var14_16 = 0;
                var1_1 = null;
            }
            this.Q = var1_1;
            this.q = var1_1;
            var13_15 = var1_1 instanceof TextView;
            if (var13_15 == 0) {
                var14_16 = 0;
                var1_1 = null;
            }
            if (var1_1 == null) ** GOTO lbl187
            {
                block47: {
                    var1_1 = ((TextView)var1_1).getCompoundDrawables();
                    break block47;
lbl187:
                    // 1 sources

                    var14_16 = 0;
                    var1_1 = null;
                }
                this.v = var1_1;
                var1_1 = this.r;
            }
            var13_15 = var1_1 instanceof TextView;
            if (var13_15 == 0) {
                var14_16 = 0;
                var1_1 = null;
            }
            if (var1_1 == null) ** GOTO lbl199
            {
                block48: {
                    var1_1 = var1_1.getCompoundDrawables();
                    break block48;
lbl199:
                    // 1 sources

                    var14_16 = 0;
                    var1_1 = null;
                }
                this.w = var1_1;
                var1_1 = this.Q;
            }
            var13_15 = var1_1 instanceof TextView;
            if (var13_15 == 0) {
                var14_16 = 0;
                var1_1 = null;
            }
            if (var1_1 == null) ** GOTO lbl211
            {
                block49: {
                    var1_1 = ((TextView)var1_1).getText();
                    break block49;
lbl211:
                    // 1 sources

                    var14_16 = 0;
                    var1_1 = null;
                }
                var1_1 = String.valueOf(var1_1);
                this.x = var1_1;
                var1_1 = this.r;
            }
            var13_15 = var1_1 instanceof TextView;
            if (var13_15 == 0) {
                var14_16 = 0;
                var1_1 = null;
            }
            if (var1_1 == null) ** GOTO lbl224
            {
                block50: {
                    var1_1 = var1_1.getText();
                    break block50;
lbl224:
                    // 1 sources

                    var14_16 = 0;
                    var1_1 = null;
                }
                var1_1 = String.valueOf(var1_1);
                this.y = var1_1;
                var13_15 = -1;
                var1_1 = new ViewGroup.LayoutParams(var13_15, var13_15);
                var3_5 = this.P;
                if (var3_5 != null) {
                    var3_5.setLayoutParams((ViewGroup.LayoutParams)var1_1);
                }
                this.e();
                var1_1 = this.P;
                if (var1_1 != null) {
                    var13_15 = 0;
                    var3_5 = null;
                    var1_1.setVisibility(0);
                }
                var1_1 = this.f;
                if (var1_1 != null) {
                    var1_1.removeAllViews();
                }
                if ((var1_1 = this.f) != null) {
                    var3_5 = this.P;
                    var1_1.addView((View)var3_5);
                }
                if ((var1_1 = this.l) != null) {
                    var1_1 = (com.jio.jioads.controller.f)var1_1;
                    var1_1.g();
                }
                if ((var1_1 = this.F) == null) return;
                var1_1.x();
                return;
            }
        }
        var3_5 = new StringBuilder("Error while loading DefaultCompanion audio interstitial ad : ");
        var4_6 /* !! */  = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var4_6 /* !! */ , var1_2, (StringBuilder)var3_5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var3_5 = JioAds$LogLevel.NONE;
        var3_5 = JioAdError.Companion;
        var5_7 /* !! */  = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        var3_5.getClass();
        var3_5 = t_0.a(var5_7 /* !! */ );
        var5_7 /* !! */  = var3_5.getErrorTitle();
        var10_9 = com.jio.jioads.cdnlogging.d.b;
        var1_3 = var1_2.getMessage();
        var11_10 = new a();
        var15_17 = Boolean.FALSE;
        var9_8 = this.o;
        if (var9_8 != null) {
            var2_4 = var9_8.q0();
        }
        var16_18 = var2_4;
        var17_19 = var3_5.getErrorCode();
        var9_8 = "Error in inflate layout for Audio ad";
        var12_11 = "loadDefaultCompanion";
        var2_4 = var4_6 /* !! */ ;
        var3_5 = this;
        var4_6 /* !! */  = var5_7 /* !! */ ;
        var5_7 /* !! */  = var10_9;
        var10_9 = var1_3;
        var2_4.logError((Context)this, (String)var4_6 /* !! */ , (com.jio.jioads.cdnlogging.d)var5_7 /* !! */ , var1_3, (String)var9_8, (a)var11_10, var12_11, var15_17, var16_18, var17_19, false);
    }

    public void onBackPressed() {
        int n3;
        int n4;
        Object object = new StringBuilder();
        Object object2 = this.o;
        int n7 = 0;
        Integer n8 = null;
        if (object2 != null) {
            object2 = object2.P();
        } else {
            n4 = 0;
            object2 = null;
        }
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": onBackPressed called in InterstitialActivity value an shouldAllowBackPress is: ");
        n4 = this.B;
        ((StringBuilder)object).append(n4 != 0);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.o;
        n4 = 1;
        if (object != null && (n3 = object.m()) == n4) {
            this.B = n4;
        }
        if ((object = this.m) != null) {
            object = ((s)object).b0();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.m;
            if (object != null) {
                object = ((s)object).Z();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                object = this.m;
                if (object != null) {
                    object = ((s)object).Z();
                } else {
                    n3 = 0;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                n3 = (Integer)object;
                s s7 = this.m;
                if (s7 != null) {
                    n8 = s7.b0();
                }
                Intrinsics.checkNotNull(n8);
                n7 = n8;
                if (n3 >= n7) {
                    this.B = n4;
                }
            }
        }
        if ((n3 = this.B) != 0) {
            object = this.m;
            if (object != null) {
                ((s)object).u();
            } else {
                object = this.M;
                object2 = this.N;
                n8 = this.O;
                this.closeAd((Integer)object2, (Integer)object, n8);
            }
        }
    }

    public void onConfigurationChanged(Configuration object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "newConfig");
        super.onConfigurationChanged((Configuration)object);
        Object object2 = new StringBuilder();
        Object object3 = this.o;
        Object object4 = null;
        if (object3 != null) {
            object3 = object3.P();
        } else {
            n3 = 0;
            object3 = null;
        }
        Object object5 = " : OnConfigurationChanged in JioInterstitialAdActivity";
        j_0.k((StringBuilder)object2, (String)object3, (String)object5);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.o;
        int n4 = 2;
        int n7 = -1;
        if (object3 != null && (n3 = object3.W()) == n4 && (n3 = (int)(this.b ? 1 : 0)) == 0) {
            int n8;
            object = this.C;
            if (object != null && (n8 = ((Integer)object).intValue()) != n7 && (object = this.D) != null && (n8 = ((Integer)object).intValue()) != n7) {
                this.a(null, null, null);
                this.j();
                this.e();
            }
        } else {
            object3 = this.o;
            if (object3 != null && (n3 = object3.W()) == 0 && (n3 = (int)(this.b ? 1 : 0)) == 0) {
                object3 = new StringBuilder();
                object5 = this.o;
                if (object5 != null) {
                    object4 = object5.P();
                }
                object5 = ": inside native ad view creation";
                com.jio.jioads.adinterfaces.d_0.a((StringBuilder)object3, (String)object4, (String)object5, (JioAds$Companion)object2);
                object2 = this.E;
                if (object2 != null) {
                    int n10 = ((Configuration)object).orientation;
                    ((NativeAdViewRenderer)object2).setOrientation$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(n10);
                }
                if ((object = this.E) != null) {
                    ((NativeAdViewRenderer)object).prepareInterstitialNativeAdWithHandler$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if ((object = this.f) != null && (object2 = this.E) != null) {
                    Intrinsics.checkNotNull(object);
                    n3 = 0;
                    object3 = null;
                    ((NativeAdViewRenderer)object2).loadNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((ViewGroup)object, false);
                }
                this.i();
                this.e();
            } else {
                int n14 = this.b;
                n3 = 1;
                if (n14 == 0 && (object4 = this.m) != null) {
                    object2 = this.C;
                    if (object2 != null && (n14 = ((Integer)object2).intValue()) != n7 && (object2 = this.D) != null && (n14 = ((Integer)object2).intValue()) != n7) {
                        int n15 = ((Configuration)object).orientation;
                        if (n15 != n3) {
                            if (n15 != n4) {
                                return;
                            }
                            object = this.D;
                        } else {
                            object = this.C;
                        }
                        if (object != null && (object2 = this.m) != null) {
                            n15 = (Integer)object;
                            ((s)object2).H(n15);
                        }
                    } else {
                        object2 = this.G;
                        if (object2 != null) {
                            return;
                        }
                        int n16 = ((Configuration)object).orientation;
                        if (n16 != n3) {
                            if (n16 != n4) {
                                return;
                            }
                            n16 = R$layout.jio_vast_interstitial_land;
                        } else {
                            n16 = R$layout.jio_vast_interstitial;
                        }
                        object2 = this.m;
                        if (object2 != null) {
                            ((s)object2).H(n16);
                        }
                    }
                } else if (n14 != 0 && (object2 = this.m) != null) {
                    object2 = this.C;
                    if (object2 != null && (n14 = ((Integer)object2).intValue()) != n7 && (object2 = this.D) != null && (n14 = ((Integer)object2).intValue()) != n7) {
                        int n17 = ((Configuration)object).orientation;
                        if (n17 != n3) {
                            if (n17 != n4) {
                                return;
                            }
                            object = this.D;
                        } else {
                            object = this.C;
                        }
                        if (object != null && (object2 = this.m) != null) {
                            n17 = (Integer)object;
                            ((s)object2).H(n17);
                        }
                    } else {
                        object = this.G;
                        if (object != null) {
                            return;
                        }
                        object = new e_0(this);
                        long l2 = 100;
                        com.jio.jioads.util.s.b(l2, (Function0)object);
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        Object object2;
        int n3;
        int n4;
        int n7;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n8;
        Object object7;
        int n10;
        block51: {
            block50: {
                Exception exception2;
                Object object8;
                block49: {
                    String string2;
                    block47: {
                        block48: {
                            n10 = 1;
                            this.requestWindowFeature(n10);
                            object7 = this.getWindow();
                            n8 = 13;
                            object7.requestFeature(n8);
                            object7 = this.getWindow();
                            object7.setAllowEnterTransitionOverlap(n10 != 0);
                            super.onCreate((Bundle)object);
                            object = this.getSupportActionBar();
                            if (object != null) {
                                object.f();
                            }
                            object = new StringBuilder();
                            object7 = this.o;
                            n8 = 0;
                            object6 = null;
                            object7 = object7 != null ? object7.P() : null;
                            object5 = ": InterstitialActivity onCreate called";
                            j_0.k((StringBuilder)object, (String)object7, (String)object5);
                            object = JioAds.Companion;
                            object.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object7 = JioAds$LogLevel.NONE;
                            object7 = com.jio.jioads.interstitial.G.k;
                            if (object7 == null) {
                                object7 = new Object();
                                com.jio.jioads.interstitial.G.k = object7;
                            }
                            this.o = object5 = object7.d;
                            this.k = object5 = object7.b;
                            this.E = object5 = object7.e;
                            if (object5 != null) {
                                ((NativeAdViewRenderer)object5).setCloseAfter$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(this);
                            }
                            this.F = object5 = object7.a;
                            this.l = object5 = object7.c;
                            this.I = object5 = object7.g;
                            object5 = object7.h;
                            object4 = object7.j;
                            this.j = object4;
                            if (object5 != null) {
                                ((InterstitialAdController)object5).setAliveInterstitialActivityContext((Context)this);
                            }
                            if ((object5 = this.o) != null) {
                                object5 = object5.H();
                            } else {
                                object3 = 0;
                                object5 = null;
                            }
                            this.d = object5;
                            object5 = this.getIntent();
                            Intrinsics.checkNotNullExpressionValue(object5, "getIntent(...)");
                            n7 = -1;
                            this.C = object4 = Integer.valueOf(object5.getIntExtra("customContainerPortrait", n7));
                            n4 = object5.getIntExtra("customContainerLandscape", n7);
                            this.D = object4 = Integer.valueOf(n4);
                            object5.getStringExtra("ccbString");
                            object5.getBooleanExtra("isInterstitialAudioAd", false);
                            object4 = object5.getStringExtra("adType");
                            object8 = "";
                            if (object4 == null) {
                                object4 = object8;
                            }
                            this.h = object4;
                            Object object9 = "native";
                            n4 = (int)(object9.equalsIgnoreCase((String)object4) ? 1 : 0);
                            if (n4 != 0) {
                                object4 = com.jio.jioads.interstitial.j.a;
                                this.H = object4;
                            } else {
                                object9 = "html";
                                object4 = this.h;
                                n4 = (int)(object9.equalsIgnoreCase((String)object4) ? 1 : 0);
                                if (n4 != 0) {
                                    object4 = com.jio.jioads.interstitial.j.b;
                                    this.H = object4;
                                } else {
                                    object9 = "audio";
                                    object4 = this.h;
                                    n4 = (int)(object9.equalsIgnoreCase((String)object4) ? 1 : 0);
                                    if (n4 != 0) {
                                        object4 = com.jio.jioads.interstitial.j.e;
                                        this.H = object4;
                                    } else {
                                        object9 = "video";
                                        object4 = this.h;
                                        n4 = (int)(object9.equalsIgnoreCase((String)object4) ? 1 : 0);
                                        if (n4 != 0) {
                                            object4 = com.jio.jioads.interstitial.j.c;
                                            this.H = object4;
                                        }
                                    }
                                }
                            }
                            object4 = this.H;
                            object9 = com.jio.jioads.interstitial.j.b;
                            String string3 = "data";
                            if (object4 == object9) {
                                object4 = String.valueOf(object5.getStringExtra(string3));
                            } else {
                                object9 = com.jio.jioads.interstitial.j.e;
                                if (object4 == object9) {
                                    object4 = this.c();
                                    if (object4 == null) {
                                        object4 = object8;
                                    }
                                } else {
                                    object4 = String.valueOf(object5.getStringExtra(string3));
                                }
                            }
                            this.g = object4;
                            object5 = object5.getSerializableExtra("headers");
                            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }");
                            object5 = (HashMap)object5;
                            this.i = object5;
                            object5 = Utility.INSTANCE;
                            object3 = ((Utility)object5).getCurrentUIModeType((Context)this);
                            object4 = "l";
                            n3 = 4;
                            if (object3 == n3) {
                                this.a = object4;
                            }
                            object5 = this.i;
                            string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                            Object object10 = "<this>";
                            Intrinsics.checkNotNullParameter(object5, (String)object10);
                            try {
                                object10 = Constants$HeaderKeys.JIO_DATA;
                                String string4 = ((Constants$HeaderKeys)((Object)object10)).getKey();
                                Locale locale = Locale.ROOT;
                                string4 = string4.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(string4, string3);
                                boolean bl2 = object5.containsKey(string4);
                                string2 = "ao";
                                if (!bl2) break block47;
                                object8 = ((Constants$HeaderKeys)((Object)object10)).getKey();
                                object8 = object8.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(object8, string3);
                                object5 = object5.get(object8);
                                object5 = (String)object5;
                                if (object5 != null) break block48;
                                object5 = "{}";
                            }
                            catch (Exception exception2) {
                                break block49;
                            }
                        }
                        if ((object3 = (Object)(object8 = new JSONObject((String)object5)).has(string2)) == 0) break block50;
                        object5 = object8.getString(string2);
                        Intrinsics.checkNotNull(object5);
                        int n14 = ((String)object5).length();
                        if (n14 <= 0) break block50;
                        break block51;
                    }
                    boolean bl3 = object5.containsKey(string2);
                    if (!bl3) break block50;
                    object5 = object5.get(string2);
                    if ((object5 = (String)object5) != null) {
                        object8 = object5;
                    }
                    object3 = object8.length();
                    if (object3 <= 0) break block50;
                    object5 = object8;
                    break block51;
                }
                object8 = "Exception while getting AD_ID value: ";
                LO1.b(object8, exception2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = JioAds$LogLevel.NONE;
            }
            object3 = 0;
            object5 = null;
        }
        if (object5 != null) {
            object4 = object5;
        }
        this.a = object4;
        object5 = new StringBuilder();
        object4 = this.o;
        if (object4 != null) {
            object4 = object4.P();
        } else {
            n4 = 0;
            object4 = null;
        }
        ((StringBuilder)object5).append((String)object4);
        ((StringBuilder)object5).append(": serverDefinedOrientation: ");
        object4 = this.a;
        ((StringBuilder)object5).append((String)object4);
        object5 = ((StringBuilder)object5).toString();
        object4 = "message";
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.h();
        object = this.D;
        if (!(object != null && (object2 = object.intValue()) == n7 || (object = this.C) != null && (object2 = object.intValue()) == n7)) {
            object = this.C;
            if (object != null) {
                object2 = object.intValue();
            } else {
                object2 = 0;
                object = null;
            }
            object6 = this.D;
            if (object6 != null) {
                n8 = (Integer)object6;
            } else {
                n8 = 0;
                object6 = null;
            }
            object6 = new int[]{object2, n8};
        }
        if ((object = this.d) != null) {
            this.b = n10;
            object5 = JioAdView$ORIENTATION_TYPE.LANDSCAPE;
            if (object == object5) {
                object2 = 1;
            } else {
                object2 = 0;
                object = null;
            }
            this.e = object2;
        }
        if (object6 != null) {
            object2 = object6[0];
            if (object2 == n7 && (object3 = (Object)object6[n10]) != n7) {
                this.b = n10;
                this.e = n10;
            } else if (object2 != n7 && (object2 = (Object)object6[n10]) == n7) {
                this.b = n10;
                this.e = false;
            }
        }
        object2 = this.b;
        n8 = 7;
        object3 = 6;
        if (object2 != 0) {
            object2 = this.e;
            if (object2 != 0) {
                n8 = 6;
            }
            this.setRequestedOrientation(n8);
        } else {
            object = this.a;
            object4 = JioAdView$ORIENTATION_TYPE.LANDSCAPE;
            object2 = object.equals(object4);
            n4 = 14;
            if (object2 != 0) {
                this.setRequestedOrientation((int)object3);
                this.setRequestedOrientation(n4);
                this.c = n10;
            } else {
                object = this.a;
                object5 = JioAdView$ORIENTATION_TYPE.PORTRAIT;
                object2 = object.equals(object5);
                if (object2 != 0) {
                    this.setRequestedOrientation(n8);
                    this.setRequestedOrientation(n4);
                    this.c = n10;
                } else {
                    this.setRequestedOrientation(n3);
                    this.c = false;
                }
            }
        }
        this.g();
        object = this.H;
        Object object11 = com.jio.jioads.interstitial.j.c;
        if (object == object11) {
            object = object7.f;
            this.m = object;
            if (object != null) {
                this.restrictBackPress();
                object11 = this.T;
                object.z = object11;
            }
        }
        object = new f_0(this);
        com.jio.jioads.util.s.b(100, (Function0)object);
    }

    public final void onDestroy() {
        Object object;
        super.onDestroy();
        Object object2 = this.o;
        if (object2 != null) {
            object = JioAdView$AdState.CLOSED;
            object2.j((JioAdView$AdState)((Object)object));
        }
        object2 = new StringBuilder();
        object = this.o;
        object = object != null ? object.P() : null;
        j_0.k((StringBuilder)object2, (String)object, ": onDestroy called in InterstitialActivity");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
    }

    public final void onPause() {
        super.onPause();
        Object object = this.m;
        if (object != null) {
            boolean bl2;
            this.n = bl2 = ((s)object).c() ^ true;
        }
        if ((object = this.m) != null) {
            ((s)object).K(false);
        }
        if ((object = this.E) != null) {
            ((NativeAdViewRenderer)object).pause$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public final void onResume() {
        super.onResume();
        Object object = new StringBuilder();
        Object object2 = this.o;
        object2 = object2 != null ? object2.P() : null;
        String string2 = ": onResume called in InterstitialActivity";
        j_0.k((StringBuilder)object, (String)object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        boolean bl2 = this.n;
        if (!bl2 && (object = this.m) != null) {
            object2 = null;
            ((s)object).O(false);
        }
        if ((object = this.E) != null) {
            ((NativeAdViewRenderer)object).resume$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public final void onStart() {
        boolean bl2;
        super.onStart();
        U = bl2 = true;
        Object object = new StringBuilder();
        Object object2 = this.o;
        object2 = object2 != null ? object2.P() : null;
        j_0.k(object, (String)object2, ": onStart called in InterstitialActivity");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void onStop() {
        super.onStop();
        Object object = new StringBuilder();
        Object object2 = this.o;
        object2 = object2 != null ? object2.P() : null;
        j_0.k(object, (String)object2, ": OnStop called in InterstitialActivity");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void restrictBackPress() {
        this.B = false;
    }

    public final void setAdData(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.g = string2;
    }

    public final void setAdType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.h = string2;
    }

    public final void setCtaButton$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(View view) {
        this.K = view;
    }

    public final void setHeaders(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.i = hashMap;
    }
}

