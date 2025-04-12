/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.CookieManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.gamezone;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.model.GameInfo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.databinding.ActivityGamezoneBinding;
import com.ril.ajio.gamezone.GameZoneWebViewActivity$a;
import com.ril.ajio.gamezone.GameZoneWebViewActivity$b;
import com.ril.ajio.gamezone.GameZoneWebViewActivity$c;
import com.ril.ajio.gamezone.GameZoneWebViewActivity$d;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.view.BaseSplitActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class GameZoneWebViewActivity
extends BaseSplitActivity
implements wy0_1,
t13_0,
View.OnClickListener {
    public static final GameZoneWebViewActivity$a Companion;
    public View A0;
    public View B0;
    public final Handler C0;
    public AjioLoaderView D0;
    public boolean E0;
    public boolean F0;
    public String G0;
    public String H0;
    public TextView I0;
    public String J0;
    public boolean K0;
    public final NewEEcommerceEventsRevamp L0;
    public final NewCustomEventsRevamp M0;
    public final String N0;
    public final String O0;
    public final hh3_2 P0;
    public final GameZoneWebViewActivity$b Q0;
    public final rq1_2 X;
    public fy0_0 Y;
    public vy0_1 Z;
    public my0_1 k0;
    public hy3_0 p0;
    public GameInfo q0;
    public ImageView r0;
    public ImageView s0;
    public ImageView t0;
    public ImageView u0;
    public TextView v0;
    public TextView w0;
    public ImageView x0;
    public TextView y0;
    public View z0;

    static {
        GameZoneWebViewActivity$a gameZoneWebViewActivity$a;
        Companion = gameZoneWebViewActivity$a = new Object();
    }

    public GameZoneWebViewActivity() {
        Object object = et1_2.NONE;
        Object object2 = new GameZoneWebViewActivity$d(this);
        object = yr1_2.a(object, (Function0)object2);
        this.X = object;
        this.C0 = object;
        object = "";
        this.G0 = object;
        this.H0 = object;
        object = AnalyticsManager.Companion;
        this.L0 = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.M0 = object;
        object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.N0 = object;
        object = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        this.O0 = object;
        object = new v2_0(1);
        object = yr1_2.b((Function0)object);
        this.P0 = object;
        super(this);
        this.Q0 = object;
    }

    public final String A2() {
        boolean bl2;
        Object object = this.p0;
        if (object != null) {
            object = ((hy3_0)object).k();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = this.p0;
            Intrinsics.checkNotNull(object);
            object = ((hy3_0)object).k();
            Intrinsics.checkNotNull(object);
        } else {
            object = "";
        }
        return object;
    }

    public final void C2(String string2, String string3) {
        int n3 = 1;
        this.stopLoader();
        Object[] objectArray = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string4 = "shared";
        String string5 = "game list screen";
        String string6 = "gamezone";
        String string7 = "game click";
        objectArray.pushEvent(string6, string7, string4, string5);
        objectArray = StringCompanionObject.INSTANCE;
        if (string3 == null) {
            string3 = "";
        }
        string2 = String.valueOf(string2);
        objectArray = new Object[n3];
        objectArray[0] = string2;
        string2 = xh2_0.a(objectArray, n3, string3, "format(...)");
        string3 = hv3_0.K(R$string.share_with_friends);
        d23_0.f((Context)this, string2, "GameZone", null, string3);
    }

    public final void D2(String string2) {
        if (string2 != null) {
            Object[] objectArray;
            Object object = this.Y;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gameZoneWebViewModel");
                object = null;
            }
            object.getClass();
            Intrinsics.checkNotNullParameter(string2, "url");
            CharSequence charSequence = new StringBuilder(string2);
            object = ((Iterable)((fy0_0)object).c).iterator();
            while (true) {
                boolean bl2 = object.hasNext();
                boolean bl3 = false;
                if (!bl2) break;
                objectArray = (Object[])object.next();
                boolean bl4 = StringsKt.F(string2, (CharSequence)objectArray, false);
                if (bl4) continue;
                String string3 = "?";
                bl3 = StringsKt.F(charSequence, string3, false);
                if (bl3) {
                    string3 = "&";
                }
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            string2 = ((StringBuilder)charSequence).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            object = yn3_0.a;
            charSequence = kp1_0.c("Game Url: ", string2);
            objectArray = new Object[]{};
            ((yn3$a)object).a((String)charSequence, objectArray);
            object = this.y2().agWebView;
            object.loadUrl(string2);
        }
    }

    public final void E2() {
        boolean bl2 = this.F0;
        String string2 = "back";
        String string3 = "Header Clicks";
        if (bl2) {
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            String string4 = "game screen";
            tj2_0.e(analyticsManager$Companion, string3, string2, string4);
        } else {
            bl2 = this.E0;
            if (bl2) {
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                String string5 = "game rules screen";
                tj2_0.e(analyticsManager$Companion, string3, string2, string5);
            } else {
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                String string6 = "game list screen";
                tj2_0.e(analyticsManager$Companion, string3, string2, string6);
            }
        }
    }

    public final void F2() {
        boolean bl2 = this.F0;
        int n3 = 8;
        if (bl2) {
            View view = this.A0;
            if (view != null) {
                view.setVisibility(n3);
            }
            if ((view = this.z0) != null) {
                view.setVisibility(n3);
            }
            if ((view = this.B0) != null) {
                view.setVisibility(0);
            }
        } else {
            bl2 = this.E0;
            if (bl2) {
                View view = this.A0;
                if (view != null) {
                    view.setVisibility(n3);
                }
                if ((view = this.z0) != null) {
                    view.setVisibility(0);
                }
                if ((view = this.B0) != null) {
                    view.setVisibility(n3);
                }
            } else {
                View view = this.A0;
                if (view != null) {
                    int n4 = R$string.acc_page_header_game_zone;
                    String string2 = hv3_0.K(n4);
                    view.setContentDescription((CharSequence)string2);
                }
                if ((view = this.A0) != null) {
                    view.setVisibility(0);
                }
                if ((view = this.z0) != null) {
                    view.setVisibility(n3);
                }
                if ((view = this.B0) != null) {
                    view.setVisibility(n3);
                }
            }
        }
    }

    public final void O(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "gameUrl");
        Intrinsics.checkNotNullParameter(string3, "gameName");
        Object object = yn3_0.a;
        CharSequence charSequence = kp1_0.c("gameUrl>>>>>>>>>>", string2);
        Object[] objectArray = null;
        Object object2 = new Object[]{};
        ((yn3$a)object).a((String)charSequence, object2);
        charSequence = new StringBuilder("gameName>>>>>>>>>>");
        ((StringBuilder)charSequence).append(string3);
        charSequence = ((StringBuilder)charSequence).toString();
        object2 = new Object[]{};
        ((yn3$a)object).a((String)charSequence, object2);
        charSequence = "http";
        boolean bl2 = b.s(string2, (String)charSequence, false);
        if (!bl2) {
            charSequence = UrlHelper.Companion.getInstance().getBaseUrl();
            string2 = Ft2.a((String)charSequence, string2);
        }
        charSequence = " ";
        boolean bl3 = StringsKt.F(string2, charSequence, false);
        if (bl3) {
            object2 = "%20";
            boolean bl4 = true;
            string2 = b.n(string2, (String)charSequence, (String)object2, bl4);
        }
        charSequence = kp1_0.c("absoluteUrl>>>>>>>>>>", string2);
        objectArray = new Object[]{};
        ((yn3$a)object).a((String)charSequence, objectArray);
        this.G0 = string2;
        this.H0 = string3;
        string2 = this.C0;
        object = new dy0_0(this, string3);
        string2.post((Runnable)object);
    }

    public final void V1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "shareLink");
        this.J0 = string2;
        this.C2(string2, string3);
    }

    public final void Y1() {
        Handler handler = this.C0;
        by0_0 by0_02 = new by0_0(this, 0);
        handler.post((Runnable)by0_02);
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "absoluteUrl");
        Intent intent = new Intent();
        intent.putExtra("PLP_URL", string2);
        this.setResult(44, intent);
        this.finish();
    }

    public final void e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        String string3 = null;
        String string4 = "http";
        boolean bl2 = b.s(string2, string4, false);
        if (!bl2) {
            string3 = UrlHelper.Companion.getInstance().getBaseUrl();
            string2 = Ft2.a(string3, string2);
        }
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushEvent("gamezone", "game click", "terms", "game list screen");
        CustomWebViewActivity$a.b(CustomWebViewActivity.Companion, (Context)this, string2, 16);
    }

    public final void g1(int n3, String object, String object2) {
        Object object3 = "gameCode";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string2 = "sessionId";
        Intrinsics.checkNotNullParameter(object2, string2);
        Object object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string3 = this.H0;
        String string4 = "gamezone";
        String string5 = "game completed";
        String string6 = "game screen";
        ((GTMEvents)object4).pushEvent(string4, string5, string3, string6);
        object4 = this.Z;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gameZoneViewModel");
            object4 = null;
        }
        object4.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, string2);
        Object object5 = ((vy0_1)object4).b.getGameZoneRewards((String)object, (String)object2, n3);
        object = qt2_2.c;
        object5 = ((g53_0)object5).h((Scheduler)object);
        object = ti_2.a();
        object5 = ((g53_0)object5).e((Scheduler)object);
        object = new ry0_2(object4, 0);
        object2 = new sy0_2((ry0_2)object);
        object = new ty0_2(object4, 0);
        object3 = new uy0_2((Function1)object);
        object5 = ((g53_0)object5).f((o60_0)object2, (o60_0)object3);
        ((vy0_1)object4).a.b((yr0_2)object5);
    }

    public final void o0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "gameUrl");
        Handler handler = this.C0;
        cy0_0 cy0_02 = new cy0_0(0, string2, this);
        handler.post((Runnable)cy0_02);
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        String string2;
        String string3;
        boolean bl2;
        int n7 = this.K0;
        if (n7 && n3 == (n7 = 6) && n4 != (n7 = -1)) {
            this.finish();
            return;
        }
        n7 = 49;
        if (n3 == n7) {
            String string4;
            if (object != null && n4 != 0 && (string4 = object.getStringExtra("plp_url")) != null && (n4 = string4.length()) != 0) {
                this.a(string4);
            }
        } else if (object != null && (bl2 = object.hasExtra(string3 = "GAME_URL")) && !(bl2 = TextUtils.isEmpty((CharSequence)(string2 = object.getStringExtra(string3))))) {
            String string5 = object.getStringExtra(string3);
            Intrinsics.checkNotNull(string5);
            String string6 = "http";
            boolean bl3 = false;
            object = null;
            n4 = (int)(b.s(string5, string6, false) ? 1 : 0);
            if (n4 == 0) {
                string6 = UrlHelper.Companion.getInstance().getBaseUrl();
                string5 = Ft2.a(string6, string5);
            }
            string6 = " ";
            bl3 = StringsKt.F(string5, string6, false);
            if (bl3) {
                object = "%20";
                n7 = 1;
                string5 = b.n(string5, string6, (String)object, n7 != 0);
            }
            if ((string6 = this.w0) != null) {
                object = this.H0;
                string6.setText((CharSequence)object);
            }
            this.D2(string5);
        } else {
            super.onActivityResult(n3, n4, (Intent)object);
        }
    }

    public final void onBackPressed() {
        this.E2();
        WebView webView = this.y2().agWebView;
        boolean bl2 = webView.canGoBack();
        if (bl2) {
            bl2 = this.F0;
            if (bl2) {
                this.F0 = false;
            } else {
                bl2 = this.E0;
                if (bl2) {
                    this.E0 = false;
                }
            }
            webView = this.y2().agWebView;
            webView.goBack();
        } else {
            this.setResult(0);
            this.finish();
        }
    }

    public void onClick(View object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.opengame_imv_close;
        if (n3 != n4 && n3 != (n4 = R$id.gamezone_imv_close)) {
            n4 = R$id.gamezone_imv_reward;
            if (n3 != n4) {
                n4 = R$id.opengame_imv_back;
                int n7 = 8;
                Object var6_6 = null;
                if (n3 == n4) {
                    this.E2();
                    n3 = (int)(this.K0 ? 1 : 0);
                    if (n3 != 0) {
                        this.finish();
                    } else {
                        object = this.y2().agWebView;
                        n3 = (int)(object.canGoBack() ? 1 : 0);
                        if (n3 != 0) {
                            object = this.z0;
                            if (object != null && (n3 = object.getVisibility()) == 0) {
                                object = this.A0;
                                if (object != null) {
                                    object.setVisibility(0);
                                }
                                if ((object = this.z0) != null) {
                                    object.setVisibility(n7);
                                }
                            }
                            object = this.y2().agWebView;
                            object.goBack();
                            this.E0 = false;
                        }
                    }
                } else {
                    n4 = R$id.playgame_imv_back;
                    if (n3 == n4) {
                        this.E2();
                        object = this.y2().agWebView;
                        n3 = (int)(object.canGoBack() ? 1 : 0);
                        if (n3 != 0) {
                            object = this.B0;
                            if (object != null && (n3 = object.getVisibility()) == 0) {
                                object = this.A0;
                                if (object != null) {
                                    object.setVisibility(n7);
                                }
                                if ((object = this.z0) != null) {
                                    object.setVisibility(0);
                                }
                                if ((object = this.B0) != null) {
                                    object.setVisibility(n7);
                                }
                            }
                            this.F0 = false;
                            object = this.y2().agWebView;
                            object.goBack();
                        }
                    }
                }
            }
        } else {
            n3 = (int)(this.F0 ? 1 : 0);
            string2 = "close";
            String string3 = "Header Clicks";
            if (n3 != 0) {
                object = AnalyticsManager.Companion;
                String string4 = "game screen";
                tj2_0.e((AnalyticsManager$Companion)object, string3, string2, string4);
            } else {
                n3 = (int)(this.E0 ? 1 : 0);
                if (n3 != 0) {
                    object = AnalyticsManager.Companion;
                    String string5 = "game rules screen";
                    tj2_0.e((AnalyticsManager$Companion)object, string3, string2, string5);
                } else {
                    object = AnalyticsManager.Companion;
                    String string6 = "game list screen";
                    tj2_0.e((AnalyticsManager$Companion)object, string3, string2, string6);
                }
            }
            this.finish();
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.y2().getRoot();
        this.setContentView((View)object);
        cp_1.Companion.getClass();
        object = cp$a.e();
        Object object2 = this.getPackageName();
        Intrinsics.checkNotNullExpressionValue(object2, "getPackageName(...)");
        object.getClass();
        cp_1.Q((Context)this, (String)object2);
        object = kd3_2.a();
        Object object3 = this.getApplication();
        Object object4 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object2 = new UserRepo((Application)object3);
        object3 = this.getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = object3;
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object6 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object5, string3);
        String string4 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object6, string4);
        Object object7 = vy0_1.class;
        String string5 = "modelClass";
        object3 = rl3_0.b((rd3_0)object3, (E$b)object5, (Wd0)object6, object7, string5);
        object5 = "<this>";
        object6 = sw0_0.a(object7, (String)object5, object7, string5, string5);
        Intrinsics.checkNotNullParameter(object6, (String)object5);
        object7 = object6.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string7.concat((String)object7);
            this.Z = object3 = (vy0_1)((pD3)object3).a((yn1_2)object6, (String)object7);
            Intrinsics.checkNotNull(object);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(object, string3);
            object3 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object2 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, string2);
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(object2, string4);
            object6 = hy3_0.class;
            object = im_1.a((rd3_0)object3, (kd3_2)object, (Wd0)object2, object6, string5);
            object2 = sw0_0.a(object6, (String)object5, object6, string5, string5);
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                int n3;
                int n4;
                object3 = string7.concat((String)object3);
                this.p0 = object = (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
                this.k0 = object = new my0_1(this);
                object2 = this.getApplication();
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                this.Y = object = new fy0_0(this, (Application)object2);
                object = this.Z;
                object2 = null;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gameZoneViewModel");
                    n4 = 0;
                    object = null;
                }
                object = ((vy0_1)object).d;
                object3 = new xy0_2(this, 0);
                object4 = new GameZoneWebViewActivity$c((Function1)object3);
                ((LiveData)object).e(this, (F62)object4);
                object = this.p0;
                Intrinsics.checkNotNull(object);
                object = ((hy3_0)object).l;
                boolean bl2 = false;
                object3 = new yy0_0(this, 0);
                object4 = new GameZoneWebViewActivity$c((Function1)object3);
                ((LiveData)object).e(this, (F62)object4);
                object = this.Y;
                object3 = "gameZoneWebViewModel";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n4 = 0;
                    object = null;
                }
                object4 = this.getIntent();
                object.getClass();
                if (object4 != null) {
                    n4 = Build.VERSION.SDK_INT;
                    n3 = 33;
                    if (n4 > n3) {
                        object = (Parcelable)ey0_0.a((Intent)object4);
                    } else {
                        object = object4.getParcelableExtra("GAME_INFO");
                        bl2 = object instanceof GameInfo;
                        if (!bl2) {
                            n4 = 0;
                            object = null;
                        }
                        object = (GameInfo)object;
                    }
                    object = (GameInfo)object;
                } else {
                    n4 = 0;
                    object = null;
                }
                this.q0 = object;
                if (object == null || (n4 = (int)(TextUtils.isEmpty((CharSequence)(object = ((GameInfo)object).getGameUrl())) ? 1 : 0)) != 0) {
                    this.finish();
                }
                n4 = R$id.ajio_loader_view;
                object = (AjioLoaderView)this.findViewById(n4);
                this.D0 = object;
                n4 = R$id.toolbar_gamezone;
                object = this.findViewById(n4);
                this.A0 = object;
                n4 = R$id.toolbar_gamezone_opengame;
                object = this.findViewById(n4);
                this.z0 = object;
                n4 = R$id.toolbar_gamezone_playgame;
                object = this.findViewById(n4);
                this.B0 = object;
                n4 = R$id.gamezone_imv_logo;
                object = (ImageView)this.findViewById(n4);
                this.r0 = object;
                n4 = R$id.gamezone_imv_close;
                object = (ImageView)this.findViewById(n4);
                this.s0 = object;
                n4 = R$id.toolbar_title;
                object = (TextView)this.findViewById(n4);
                this.v0 = object;
                n4 = R$id.opengame_toolbar_title_tv;
                object = (TextView)this.findViewById(n4);
                this.w0 = object;
                n4 = R$id.opengame_imv_back;
                object = (ImageView)this.findViewById(n4);
                this.u0 = object;
                n4 = R$id.opengame_imv_close;
                object = (ImageView)this.findViewById(n4);
                this.t0 = object;
                n4 = R$id.playgame_imv_back;
                object = (ImageView)this.findViewById(n4);
                this.x0 = object;
                n4 = R$id.playgame_toolbar_title_tv;
                object = (TextView)this.findViewById(n4);
                this.y0 = object;
                n4 = R$id.notification_text;
                object = (TextView)this.findViewById(n4);
                this.I0 = object;
                object = this.x0;
                if (object != null) {
                    object.setOnClickListener((View.OnClickListener)this);
                }
                if ((object = this.u0) != null) {
                    object.setOnClickListener((View.OnClickListener)this);
                }
                z40_0.Companion.getClass();
                object = z40$a.a((Context)this).a.b("gamezone_title");
                object4 = z40$a.a((Context)this).a;
                object5 = "gamezone_logo";
                object4 = ((ao0_0)object4).b((String)object5);
                n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n3 == 0 && (object5 = this.v0) != null) {
                    object5.setText((CharSequence)object);
                }
                n4 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                n3 = 1;
                if (n4 == 0) {
                    object = new da$a();
                    ((da$a)object).k = n3;
                    ((da$a)object).g = n3;
                    object6 = this.r0;
                    Intrinsics.checkNotNull(object6);
                    ((da$a)object).n = object4;
                    ((da$a)object).u = object6;
                    ((da$a)object).a();
                }
                if ((object = this.s0) != null) {
                    object.setOnClickListener((View.OnClickListener)this);
                }
                if ((object = this.t0) != null) {
                    object.setOnClickListener((View.OnClickListener)this);
                }
                n4 = 0;
                WebView.setWebContentsDebuggingEnabled((boolean)false);
                object = this.y2();
                object4 = ((ActivityGamezoneBinding)object).agWebView.getSettings();
                object4.setJavaScriptEnabled(n3 != 0);
                object4.setDatabaseEnabled(n3 != 0);
                object4.setDomStorageEnabled(n3 != 0);
                int n7 = 2;
                object4.setCacheMode(n7);
                object4 = ((ActivityGamezoneBinding)object).agWebView;
                object6 = this.k0;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gameZoneJavaInterface");
                    n7 = 0;
                    object6 = null;
                }
                string2 = "AjioBridge";
                object4.addJavascriptInterface(object6, string2);
                object4 = ((ActivityGamezoneBinding)object).agWebView;
                object6 = this.Y;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n7 = 0;
                    object6 = null;
                }
                object4.addJavascriptInterface(object6, "GamificationAndroidJSBridge");
                object = ((ActivityGamezoneBinding)object).agWebView;
                object3 = this.Q0;
                object.setWebViewClient((WebViewClient)object3);
                object = this.q0;
                Intrinsics.checkNotNull(object);
                object = ((GameInfo)object).getGameUrl();
                object3 = CookieManager.getInstance();
                object4 = new zy0_0((CookieManager)object3, this, (String)object);
                object3.removeAllCookies((ValueCallback)object4);
                object = this.q0;
                Intrinsics.checkNotNull(object);
                object = ((GameInfo)object).getGameName();
                if (object != null && (n4 = ((String)object).length()) != 0) {
                    object = this.q0;
                    if (object != null) {
                        object = ((GameInfo)object).getGameName();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    this.H0 = object;
                    this.E0 = n3;
                    this.K0 = n3;
                    this.F2();
                    object = (UserInformation)this.P0.getValue();
                    n4 = (int)(((UserInformation)object).isUserOnline() ? 1 : 0);
                    if (n4 == 0) {
                        object = this.q0;
                        Intrinsics.checkNotNull(object);
                        object = ((GameInfo)object).getGameUrl();
                        this.o0((String)object);
                    } else {
                        object = this.q0;
                        Intrinsics.checkNotNull(object);
                        object = ((GameInfo)object).getGameUrl();
                        object3 = this.q0;
                        if (object3 != null) {
                            object2 = ((GameInfo)object3).getGameName();
                        }
                        Intrinsics.checkNotNull(object2);
                        this.y0((String)object, (String)object2);
                    }
                } else {
                    this.F2();
                    object = this.q0;
                    Intrinsics.checkNotNull(object);
                    object = ((GameInfo)object).getGameUrl();
                    this.D2((String)object);
                    AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("game list screen");
                    string2 = new Bundle();
                    object = this.M0.getNUMBER_OF_GAMES();
                    object2 = "";
                    string2.putString((String)object, (String)object2);
                    object4 = "game list screen";
                    object5 = "game screen";
                    object3 = this.M0;
                    object6 = this.N0;
                    string3 = this.O0;
                    ((NewCustomEventsRevamp)object3).newPushCustomScreenView((String)object4, (String)object5, (String)object6, (Bundle)string2, string3);
                }
                return;
            }
            object2 = string6.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string6.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.y2().agWebView.stopLoading();
        this.y2().agWebView.destroy();
    }

    public final void onStop() {
        super.onStop();
        this.L0.setPreviousScreenData("game list screen", "game screen");
    }

    public final void showNotification(String string2, String string3) {
        TextView textView = this.I0;
        hv3_0.j0(string2, string3, textView);
    }

    public final void stopLoader() {
        AjioLoaderView ajioLoaderView = this.D0;
        if (ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
    }

    public final void y0(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "gameUrl");
        Intrinsics.checkNotNullParameter(string2, "gameName");
        Object object2 = yn3_0.a;
        Object object3 = kp1_0.c("gameUrl>>>>>>>>>>", (String)object);
        Object object4 = null;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).a((String)object3, objectArray);
        object3 = new StringBuilder("gameName>>>>>>>>>>");
        ((StringBuilder)object3).append(string2);
        object3 = ((StringBuilder)object3).toString();
        objectArray = new Object[]{};
        ((yn3$a)object2).a((String)object3, objectArray);
        object2 = new Ref$ObjectRef();
        object3 = "http";
        boolean bl2 = b.s((String)object, (String)object3, false);
        if (!bl2) {
            object3 = UrlHelper.Companion.getInstance().getBaseUrl();
            object = Ft2.a((String)object3, (String)object);
        }
        ((Ref$ObjectRef)object2).element = object;
        object3 = " ";
        boolean bl3 = StringsKt.F((CharSequence)object, (CharSequence)object3, false);
        if (bl3) {
            object = (String)((Ref$ObjectRef)object2).element;
            object4 = "%20";
            boolean bl4 = true;
            ((Ref$ObjectRef)object2).element = object = b.n((String)object, (String)object3, (String)object4, bl4);
        }
        object = AnalyticsManager.Companion;
        ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().pushEvent("gamezone", "game selection click", string2, "game list screen");
        ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().pushOpenScreenEvent("game rules screen");
        String string3 = this.N0;
        object4 = this.M0;
        String string4 = this.O0;
        ((NewCustomEventsRevamp)object4).newPushCustomScreenView("game rules screen", "game screen", string3, null, string4);
        this.H0 = string2;
        object = this.C0;
        object3 = new ay0_0(this, string2, (Ref$ObjectRef)object2);
        object.post((Runnable)object3);
    }

    public final ActivityGamezoneBinding y2() {
        return (ActivityGamezoneBinding)this.X.getValue();
    }

    public final String z2() {
        yn3$a yn3$a = yn3_0.a;
        hh3_2 hh3_22 = this.P0;
        String string2 = ((UserInformation)hh3_22.getValue()).getEncryptedId();
        string2 = kp1_0.c("getEncryptedId>>>>>>>", string2);
        Object[] objectArray = new Object[]{};
        yn3$a.a(string2, objectArray);
        return ((UserInformation)hh3_22.getValue()).getEncryptedId();
    }
}

