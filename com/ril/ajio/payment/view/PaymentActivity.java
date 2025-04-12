/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.animation.Animation
 *  android.view.animation.TranslateAnimation
 *  android.widget.FrameLayout
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package com.ril.ajio.payment.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.j;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioRedirectingProgressView;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.payment.fragment.f;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.payment.fragment.i;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.payment.view.PaymentActivity$a;
import com.ril.ajio.payment.view.PaymentActivity$b;
import com.ril.ajio.payment.view.PaymentActivity$c;
import com.ril.ajio.payment.view.PaymentActivity$d;
import com.ril.ajio.payment.view.PaymentActivity$peInternetConnectionNotifier$1;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import com.ril.ajio.view.BaseSplitActivity;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.services.HyperServices;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;
import org.json.JSONObject;

public final class PaymentActivity
extends BaseSplitActivity
implements Z82,
OnNavigationClickListener,
do2_0,
bn1_1 {
    public static final /* synthetic */ int I0;
    public CheckoutFragment A0;
    public Snackbar B0;
    public String C0;
    public TextView D0;
    public FrameLayout E0;
    public boolean F0;
    public final hh3_2 G0;
    public final PaymentActivity$peInternetConnectionNotifier$1 H0;
    public AppBarLayout X;
    public CustomToolbarViewMerger Y;
    public AjioProgressView Z;
    public AjioLoaderView k0;
    public AjioRedirectingProgressView p0;
    public Bundle q0;
    public String r0;
    public boolean s0;
    public boolean t0;
    public String u0;
    public String v0;
    public boolean w0;
    public boolean x0;
    public Cart y0;
    public ps_0 z0;

    public PaymentActivity() {
        Object object = "";
        this.r0 = object;
        this.u0 = object;
        this.v0 = object;
        this.C0 = object;
        object = new gn2_2(this);
        this.G0 = object = yr1_2.b((Function0)object);
        object = new PaymentActivity$peInternetConnectionNotifier$1(this);
        this.H0 = object;
    }

    public static String D2(ir2_1 object) {
        int n3;
        if (object == null) {
            n3 = -1;
        } else {
            int[] nArray = PaymentActivity$c.$EnumSwitchMapping$0;
            n3 = object.ordinal();
            n3 = nArray[n3];
        }
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n3 = R$string.api_alert_title;
                    object = hv3_0.K(n3);
                } else {
                    n3 = R$string.api_alert_title;
                    object = hv3_0.K(n3);
                }
            } else {
                n3 = R$string.server_alert_title;
                object = hv3_0.K(n3);
            }
        } else {
            n3 = R$string.internet_alert_title;
            object = hv3_0.K(n3);
        }
        return object;
    }

    public final void A2() {
        int n3 = this.F0;
        int n4 = 0;
        Object object = null;
        if (n3 != 0) {
            this.F0 = false;
            super.onBackPressed();
            return;
        }
        Object object2 = new Intent();
        int n7 = this.s0;
        String string2 = "title";
        String string3 = "message";
        String string4 = "oosClickListener";
        String string5 = "PaymentReviewBagBsFragment";
        if (n7) {
            object2 = new ho2_2();
            ((DialogFragment)object2).setCancelable(false);
            object = new PaymentActivity$a(this);
            String string6 = this.v0;
            int n8 = R$string.review_bag_cart_error_title;
            String string7 = hv3_0.K(n8);
            Intrinsics.checkNotNullParameter(object, string4);
            Intrinsics.checkNotNullParameter(string6, string3);
            Intrinsics.checkNotNullParameter(string7, string2);
            ((ho2_2)object2).e = string6;
            ((ho2_2)object2).b = object;
            ((ho2_2)object2).f = string7;
            object = this.getSupportFragmentManager();
            ((DialogFragment)object2).show((FragmentManager)object, string5);
        } else {
            Object object3 = this.r0;
            n7 = ((String)object3).length();
            if (n7 > 0) {
                object2 = this.y0;
                if (object2 != null && (object2 = ((Cart)object2).getEntries()) != null) {
                    ((ArrayList)object2).size();
                }
                object3 = this.r0;
                object2 = new PaymentActivity$b(this, (String)object3);
                object3 = new ho2_2();
                ((DialogFragment)object3).setCancelable(false);
                n4 = R$string.review_bag_oos_msg;
                object = hv3_0.K(n4);
                int n10 = R$string.products_unavailable;
                String string8 = hv3_0.K(n10);
                Intrinsics.checkNotNullParameter(object2, string4);
                Intrinsics.checkNotNullParameter(object, string3);
                Intrinsics.checkNotNullParameter(string8, string2);
                ((ho2_2)object3).e = object;
                ((ho2_2)object3).b = object2;
                ((ho2_2)object3).f = string8;
                object2 = this.getSupportFragmentManager();
                ((DialogFragment)object3).show((FragmentManager)object2, string5);
            } else {
                n4 = this.t0;
                if (n4 != 0) {
                    object = this.u0;
                    if (object != null && (n4 = ((String)object).length()) != 0) {
                        object = "PLACE_ORDER_ORDER_ID";
                        object3 = this.u0;
                        object2.putExtra((String)object, (String)object3);
                    }
                    object = "IS_PLACE_ORDER_ERROR";
                    n7 = 1;
                    object2.putExtra((String)object, n7 != 0);
                    this.setResult(-1, (Intent)object2);
                    this.finish();
                    n3 = R$anim.enter_from_left;
                    n4 = R$anim.exit_to_right;
                    this.overridePendingTransition(n3, n4);
                } else {
                    n3 = this.w0;
                    if (n3 == 0 && (n3 = this.x0) == 0) {
                        at2_1.e((Context)this);
                    } else {
                        this.setResult(71);
                        this.finish();
                        n3 = R$anim.enter_from_left;
                        n4 = R$anim.exit_to_right;
                        this.overridePendingTransition(n3, n4);
                    }
                }
            }
        }
    }

    public final void C2(int n3) {
        Object object = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object);
        if (bl2) {
            object = this.Y;
            if (object != null && (object = ((CustomToolbarViewMerger)object).getFloatView()) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.Y) != null && (object = ((CustomToolbarViewMerger)object).getHeaderView()) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.Y) != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.A0) != null && (object = ((Fragment)object).getView()) != null) {
                object.setVisibility(n3);
            }
        }
    }

    public final void E2(Activity object, ir2_1 ir2_12) {
        int n3 = 1;
        Object object2 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = object.isFinishing();
        if (n4 != 0) {
            return;
        }
        this.dismissSlowInternetNotification();
        n4 = 0x1020002;
        object2 = this.findViewById(n4);
        Object object3 = PaymentActivity.D2(ir2_12);
        int n7 = -2;
        this.B0 = object2 = Snackbar.make((View)object2, (CharSequence)object3, n7);
        int n8 = 0;
        object3 = null;
        if (object2 != null) {
            object2 = ((BaseTransientBottomBar)object2).getView();
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null) {
            n8 = com.google.android.material.R$id.snackbar_text;
            object3 = (TextView)object2.findViewById(n8);
        }
        if (object2 != null) {
            n7 = t70.getColor((Context)object, 17170443);
            object2.setBackgroundColor(n7);
        }
        if (object3 != null) {
            n7 = t70.getColor((Context)object, 17170444);
            object3.setTextColor(n7);
        }
        object3 = StringCompanionObject.INSTANCE;
        n8 = R$string.acc_error_message;
        object3 = hv3_0.K(n8);
        String string2 = PaymentActivity.D2(ir2_12);
        Object object4 = new Object[n3];
        object4[0] = string2;
        object3 = xh2_0.a((Object[])object4, n3, (String)object3, "format(...)");
        object4 = Looper.getMainLooper();
        string2 = new Handler(object4);
        object4 = new N01(n3, object2, object3);
        long l2 = 100;
        string2.postDelayed((Runnable)object4, l2);
        Object object5 = this.B0;
        if (object5 != null) {
            n4 = R$color.color_176d93;
            int n10 = t70.getColor((Context)object, n4);
            ((Snackbar)object5).setActionTextColor(n10);
        }
        if ((object = this.B0) != null) {
            n3 = R$string.try_again;
            object5 = hv3_0.K(n3);
            object2 = new hn2_0(this, ir2_12);
            ((Snackbar)object).setAction((CharSequence)object5, (View.OnClickListener)object2);
        }
        if ((object = this.B0) != null) {
            ((Snackbar)object).show();
        }
    }

    public final void F2(String object) {
        String string2;
        Bundle bundle = this.q0;
        if (bundle == null) {
            return;
        }
        if (object != null) {
            string2 = "token";
            bundle.putString(string2, (String)object);
        }
        object = new Object();
        bundle = this.q0;
        if (bundle != null) {
            string2 = "callback";
            bundle.putParcelable(string2, (Parcelable)object);
        }
        object = new ms2_2();
        bundle = this.q0;
        ((Fragment)object).setArguments(bundle);
        Intrinsics.checkNotNullParameter(object, "fragment");
        string2 = "savedCardFragment";
        Intrinsics.checkNotNullParameter(string2, "tag");
        int n3 = R$id.payment_main_container;
        this.y2(n3, (Fragment)object, string2);
    }

    public final void V0() {
    }

    public final void attachBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "newBase");
        super.attachBaseContext(context);
        SplitCompat.install((Context)this);
    }

    public final void b(String string2) {
        CharSequence charSequence;
        int n3;
        Object object;
        int n4;
        Intrinsics.checkNotNullParameter(string2, "title");
        Object object2 = this.D0;
        if (object2 != null) {
            object2.setText((CharSequence)string2);
        }
        if ((object2 = this.Y) != null) {
            ((CustomToolbarViewMerger)object2).setTitleText(string2);
        }
        object2 = hv3_0.K(R$string.order_confirmation);
        boolean bl2 = Intrinsics.areEqual(string2, object2);
        String string3 = " ";
        if (bl2) {
            object2 = this.Y;
            if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
                n4 = R$string.acc_page_header_order_checkout;
                object = hv3_0.K(n4);
                object2.setContentDescription((CharSequence)object);
            }
            if ((object2 = this.X) != null) {
                n4 = R$string.header_text;
                object = hv3_0.K(n4);
                n3 = R$string.acc_page_header_order_checkout;
                charSequence = hv3_0.K(n3);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(string3);
                stringBuilder.append((String)charSequence);
                object = stringBuilder.toString();
                object2.setContentDescription((CharSequence)object);
            }
        } else {
            object2 = this.Y;
            if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
                object = String.valueOf(string2);
                object2.setContentDescription((CharSequence)object);
            }
            if ((object2 = this.X) != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string2);
                charSequence = " screen";
                ((StringBuilder)object).append((String)charSequence);
                object = ((StringBuilder)object).toString();
                object2.setContentDescription((CharSequence)object);
            }
        }
        object = Looper.getMainLooper();
        object2 = new Handler((Looper)object);
        n3 = 0;
        charSequence = null;
        object = new in2_0(this, 0);
        long l2 = 300L;
        object2.postDelayed((Runnable)object, l2);
        object2 = this.Y;
        if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getHeaderTitleTv()) != null) {
            n4 = R$string.header_text;
            object = hv3_0.K(n4);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(string2);
            object = ((StringBuilder)charSequence).toString();
            object2.setContentDescription((CharSequence)object);
        }
        if ((object2 = this.Y) != null && (object2 = ((CustomToolbarViewMerger)object2).getFloatTitleTv()) != null) {
            n4 = R$string.title_text;
            object = hv3_0.K(n4);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
            object2.setContentDescription((CharSequence)string2);
        }
    }

    public final void b1() {
        FrameLayout frameLayout = this.Z;
        if (frameLayout != null) {
            frameLayout.dismiss();
        }
        if ((frameLayout = this.k0) != null) {
            frameLayout.stopLoader();
        }
    }

    public final void i0(JSONObject jSONObject) {
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = 34;
        if (n3 == n7) {
            this.A2();
        }
        super.onActivityResult(n3, n4, intent);
    }

    public final void onBackPressed() {
        block15: {
            boolean bl2;
            Object object;
            Object object2;
            block14: {
                int n3;
                block17: {
                    int n4;
                    block16: {
                        boolean n32 = false;
                        object2 = null;
                        this.C2(0);
                        n4 = this.isFinishing();
                        if (n4 != 0) break block15;
                        object = this.getSupportFragmentManager();
                        n3 = R$id.fragment_payment;
                        if ((n3 = (object = ((FragmentManager)object).D(n3)) instanceof zt3_0) == 0) break block16;
                        super.onBackPressed();
                        break block15;
                    }
                    n3 = object instanceof h;
                    if (n3 != 0 || (n3 = object instanceof gu1_2) != 0 || (n3 = object instanceof i) != 0 || (n3 = object instanceof hy0_2) != 0) break block17;
                    object2 = this.getSupportFragmentManager();
                    n4 = R$id.payment_main_container;
                    object2 = ((FragmentManager)object2).D(n4);
                    object = this.C0;
                    String string2 = "savedcard";
                    boolean bl3 = true;
                    n4 = (int)(b.i((String)object, string2, bl3) ? 1 : 0);
                    if (n4 != 0) {
                        this.finish();
                    } else {
                        boolean bl4;
                        boolean bl5;
                        boolean bl6;
                        boolean bl7 = object2 instanceof f;
                        if (!bl7 && (bl6 = TextUtils.isEmpty((CharSequence)(object2 = this.r0))) && !(bl5 = this.w0) && !(bl4 = this.x0)) {
                            this.finish();
                        } else {
                            int n7 = 71;
                            this.setResult(n7);
                            this.finish();
                        }
                    }
                    break block15;
                }
                n3 = object instanceof h;
                if (n3 != 0) {
                    object = (h)object;
                    object = ((Fragment)object).getChildFragmentManager();
                    Object object3 = "getChildFragmentManager(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    object3 = ((FragmentManager)object).c;
                    object3 = ((j)object3).f();
                    n3 = object3.size();
                    if (n3 <= 0) break block14;
                    bl2 = ((FragmentManager)object).W();
                }
            }
            if (bl2) break block15;
            object2 = this.getSupportFragmentManager();
            try {
                ((FragmentManager)object2).W();
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
    }

    public final void onCreate(Bundle object) {
        int n3 = 1;
        int n4 = 0;
        Object object2 = null;
        super.onCreate((Bundle)object);
        int n7 = 0;
        object = null;
        dm0_0.a = null;
        dm0_0.b = false;
        dm0_0.c = false;
        dm0_0.f = false;
        dm0_0.d = false;
        dm0_0.e = false;
        uy2_1.a = "";
        Object object3 = this.getIntent();
        Object object4 = "PaymentData";
        boolean bl2 = object3.hasExtra((String)object4);
        if (bl2) {
            object3 = this.getIntent().getBundleExtra((String)object4);
            this.q0 = object3;
        }
        object3 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object3);
        Object object5 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object3);
        Object object6 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object4, string2);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object5, string3);
        String string4 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object6, string4);
        Object object7 = o23_0.class;
        String string5 = "modelClass";
        object4 = rl3_0.b((rd3_0)object4, (E$b)object5, (Wd0)object6, object7, string5);
        object5 = "<this>";
        object6 = sw0_0.a(object7, (String)object5, object7, string5, string5);
        Intrinsics.checkNotNullParameter(object6, (String)object5);
        object7 = object6.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            Object object8;
            int n8;
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string7.concat((String)object7);
            object4 = (o23_0)((pD3)object4).a((yn1_2)object6, (String)object7);
            int n10 = og1_1.b();
            if (n10 != 0) {
                this.Y = object4 = new CustomToolbarViewMerger(this);
                n10 = R$layout.activity_payment_lux;
                this.setContentView(n10);
                n10 = R$id.payment_toolbar_luxe;
                object4 = (Toolbar)this.findViewById(n10);
                n8 = R$id.luxe_payment_toolbar_title;
                object6 = (TextView)this.findViewById(n8);
                this.D0 = object6;
                if (object4 != null) {
                    n8 = R$drawable.ic_luxe_back_arrow;
                    ((Toolbar)object4).setNavigationIcon(n8);
                }
                if (object4 != null) {
                    n8 = R$string.back_button_text;
                    ((Toolbar)object4).setNavigationContentDescription(n8);
                }
                this.setSupportActionBar((Toolbar)object4);
                if (object4 != null) {
                    object6 = new cy1_0(this, n3);
                    ((Toolbar)object4).setNavigationOnClickListener((View.OnClickListener)object6);
                }
                if ((object4 = this.D0) != null) {
                    n8 = R$string.order_confirmation;
                    object6 = hv3_0.K(n8);
                    object4.setText((CharSequence)object6);
                }
            } else {
                this.Y = object4 = new CustomToolbarViewMerger(this);
                object4 = LayoutInflater.from((Context)this);
                n8 = R$layout.activity_payment_revamp;
                object4 = object4.inflate(n8, null);
                Intrinsics.checkNotNullExpressionValue(object4, "inflate(...)");
                this.setContentView((View)object4);
                object6 = this.Y;
                if (object6 != null) {
                    ((CustomToolbarViewMerger)object6).initViews((View)object4);
                }
                if ((object4 = this.Y) != null) {
                    object4 = ((CustomToolbarViewMerger)object4).getToolbar();
                } else {
                    n10 = 0;
                    object4 = null;
                }
                this.setSupportActionBar((Toolbar)object4);
                object4 = this.Y;
                if (object4 != null) {
                    ((CustomToolbarViewMerger)object4).setNavigationClick();
                }
                if ((object4 = this.Y) != null && (object4 = ((CustomToolbarViewMerger)object4).getToolbar()) != null) {
                    object4.invalidate();
                }
                if ((object4 = this.Y) != null) {
                    n8 = 8;
                    ((CustomToolbarViewMerger)object4).setSubTitleVisibility(n8);
                }
            }
            this.getAppPreferences().putPreference("PAYMENT_IN_PROGRESS", n3 != 0);
            n10 = R$id.payment_progress_bar;
            object4 = (AjioProgressView)this.findViewById(n10);
            this.Z = object4;
            n10 = R$id.payment_loader;
            object4 = (AjioLoaderView)this.findViewById(n10);
            this.k0 = object4;
            n10 = R$id.redirecting_progress_bar;
            object4 = (AjioRedirectingProgressView)this.findViewById(n10);
            this.p0 = object4;
            n10 = R$id.fragment_background;
            object4 = (FrameLayout)this.findViewById(n10);
            this.E0 = object4;
            n10 = R$id.app_bar_layout;
            object4 = (AppBarLayout)this.findViewById(n10);
            this.X = object4;
            object4 = this.getIntent();
            object6 = "cartOrder";
            n10 = (int)(object4.hasExtra((String)object6) ? 1 : 0);
            if (n10 != 0) {
                object4 = this.getIntent();
                object7 = "getIntent(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                int n14 = Build.VERSION.SDK_INT;
                int n15 = 33;
                if (n14 >= n15) {
                    object4 = en2_1.a((Intent)object4);
                } else {
                    n8 = (object4 = object4.getSerializableExtra((String)object6)) instanceof CartOrder;
                    if (n8 == 0) {
                        n10 = 0;
                        object4 = null;
                    }
                    object4 = (CartOrder)object4;
                }
                object4 = (CartOrder)object4;
            }
            if ((n10 = (int)((object4 = this.getIntent()).hasExtra((String)(object6 = "isOrderPayment")) ? 1 : 0)) != 0) {
                object4 = this.getIntent();
                object4.getBooleanExtra((String)object6, false);
            }
            if ((n10 = (int)((object4 = this.getIntent()).hasExtra((String)(object6 = "toolbarTitle")) ? 1 : 0)) != 0) {
                object4 = this.getIntent();
                object4.getStringExtra((String)object6);
            }
            if ((object4 = this.q0) != null && (n10 = (int)(object4.containsKey((String)(object6 = "viewmode")) ? 1 : 0)) == n3) {
                object4 = this.q0;
                if (object4 != null) {
                    object = object4.getString((String)object6);
                }
                object4 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object, (String)object4);
                this.C0 = object;
            }
            if ((object = this.C0) != null && (n7 = ((String)object).equalsIgnoreCase((String)(object4 = "savedcard"))) != 0) {
                Intrinsics.checkNotNullParameter(this, (String)object3);
                object = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object3);
                object4 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(this, (String)object3);
                object3 = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object, string2);
                Intrinsics.checkNotNullParameter(object4, string3);
                Intrinsics.checkNotNullParameter(object3, string4);
                object6 = ps_0.class;
                object = rl3_0.b((rd3_0)object, (E$b)object4, (Wd0)object3, object6, string5);
                object3 = sw0_0.a(object6, (String)object5, object6, string5, string5);
                Intrinsics.checkNotNullParameter(object3, (String)object5);
                object4 = object3.getQualifiedName();
                if (object4 != null) {
                    object4 = string7.concat((String)object4);
                    this.z0 = object = (ps_0)((pD3)object).a((yn1_2)object3, (String)object4);
                    if (object != null && (object = ((ps_0)object).c) != null) {
                        object3 = new rj0_1(this, n3);
                        object4 = new PaymentActivity$d((Function1)object3);
                        ((LiveData)object).e(this, (F62)object4);
                    }
                    object = (n7 = (int)(og1_1.b() ? 1 : 0)) != 0 ? "SAVED CARDS" : "Saved Cards";
                    Intrinsics.checkNotNull(object);
                    this.b((String)object);
                    this.r0();
                    object = this.z0;
                    if (object != null) {
                        object3 = "single page checkout";
                        object4 = "screenName";
                        Intrinsics.checkNotNullParameter(object3, (String)object4);
                        object5 = ((ps_0)object).a;
                        object5.getClass();
                        Intrinsics.checkNotNullParameter(object3, (String)object4);
                        object3 = UrlHelper.Companion.getInstance();
                        object4 = new Object[]{};
                        string2 = "payment_authtoken";
                        object3 = ((UrlHelper)object3).getApiUrl("payment", string2, (Object[])object4);
                        object6 = ((r33)object5).c;
                        Intrinsics.checkNotNullExpressionValue(object6, "userInformation");
                        object4 = ServiceUtil.getToken((UserInformation)object6);
                        object4 = kp1_0.c("Bearer ", (String)object4);
                        object6 = "PETokenRequest";
                        object3 = ((r33)object5).a.getPEToken((String)object3, (String)object4, (String)object6);
                        object4 = qt2_2.c;
                        object3 = ((g53_0)object3).h((Scheduler)object4);
                        object4 = ti_2.a();
                        object3 = ((g53_0)object3).e((Scheduler)object4);
                        object4 = new if1_2();
                        object5 = new rx1_1(n3, (Function1)object4);
                        Object string9 = new s53_0((q63_0)object3, (bx0_2)object5);
                        object3 = new l33();
                        object4 = new u53_0((q63_0)string9, (bx0_2)object3);
                        Intrinsics.checkNotNullExpressionValue(object4, "onErrorReturn(...)");
                        string9 = new us_1(object, 0);
                        object3 = new vs_2((us_1)string9);
                        string9 = new ws_1(object, 0);
                        object5 = new xs_1(0, (Function1)string9);
                        string9 = ((g53_0)object4).f((o60_0)object3, (o60_0)object5);
                        object = ((ps_0)object).r;
                        ((t30_0)object).b((yr0_2)string9);
                    }
                    return;
                }
                String string8 = string6.toString();
                object = new IllegalArgumentException(string8);
                throw object;
            }
            object = this.q0;
            if (object != null) {
                n7 = R$string.order_confirmation;
                object = hv3_0.K(n7);
                this.b((String)object);
                object = CheckoutFragment.Companion;
                object2 = this.q0;
                object.getClass();
                object = new CheckoutFragment();
                ((Fragment)object).setArguments((Bundle)object2);
                this.A0 = object;
                Intrinsics.checkNotNull(object);
                Intrinsics.checkNotNullParameter(object, "fragment");
                object2 = "tag";
                object3 = "checkout";
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                n4 = R$id.payment_main_container;
                this.y2(n4, (Fragment)object, (String)object3);
            }
            object = h40_0.a;
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object2 = "spc_customer_type_enabled";
            n7 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
            if (n7 != 0 && (n7 = (int)(b.i((String)(object = this.getAppPreferences().f()), (String)(object2 = "New"), n3 != 0) ? 1 : 0)) != 0) {
                boolean bl3;
                object = this.getUserViewModel().m;
                n4 = 2;
                object8 = new C5(this, n4);
                object2 = new PaymentActivity$d((Function1)object8);
                ((LiveData)object).e(this, (F62)object2);
                object = ((UserInformation)this.G0.getValue()).getUserEmailId();
                object8 = this.getUserViewModel();
                boolean bl4 = ((hy3_0)object8).p();
                if (bl4 && !(bl3 = TextUtils.isEmpty((CharSequence)object))) {
                    object8 = this.getUserViewModel();
                    Intrinsics.checkNotNull(object);
                    object2 = "BackGround_User_Type";
                    ((hy3_0)object8).o((String)object, (String)object2);
                }
            }
            object = UserInformation.getInstance((Context)AJIOApplication$a.a()).getCustomerUUID();
            Intrinsics.checkNotNullExpressionValue(object, "getCustomerUUID(...)");
            object = ij2_1.a((String)object);
            Intrinsics.checkNotNullParameter(this, "fragmentActivity");
            Intrinsics.checkNotNullParameter(object, "initiatePayload");
            Intrinsics.checkNotNullParameter(this, "juspayEventListener");
            object8 = xn.b;
            if (object8 == null) {
                xn.b = object8 = new HyperServices(this);
            }
            if ((object8 = xn.c) == null) {
                object8 = new HyperPaymentsCallbackAdapter();
                ((an1_1)object8).a = this;
                xn.c = object8;
            } else {
                ((an1_1)object8).a = this;
            }
            object8 = xn.b;
            Intrinsics.checkNotNull(object8);
            boolean bl5 = ((HyperServices)object8).isInitialised();
            if (!bl5 && (object8 = xn.b) != null) {
                object2 = xn.c;
                ((HyperServices)object8).initiate(this, (JSONObject)object, (HyperPaymentsCallback)object2);
            }
            return;
        }
        String string9 = string6.toString();
        object = new IllegalArgumentException(string9);
        throw object;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.getAppPreferences().putPreference("PAYMENT_IN_PROGRESS", false);
        dm0_0.a = null;
        dm0_0.b = false;
        dm0_0.c = false;
        dm0_0.f = false;
        dm0_0.d = false;
        dm0_0.e = false;
        InternalWalletUtil.a.getClass();
        InternalWalletUtil.b = 0.0;
        no2_0.e = null;
        no2_0.d = null;
        no2_0.c = false;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onPause() {
        super.onPause();
        Xv1 xv1 = Xv1.a(this.getApplicationContext());
        PaymentActivity$peInternetConnectionNotifier$1 paymentActivity$peInternetConnectionNotifier$1 = this.H0;
        xv1.d(paymentActivity$peInternetConnectionNotifier$1);
    }

    public final void onResume() {
        super.onResume();
        Xv1 xv1 = Xv1.a(this.getApplicationContext());
        IntentFilter intentFilter = new IntentFilter("pe_no_internet_connection");
        PaymentActivity$peInternetConnectionNotifier$1 paymentActivity$peInternetConnectionNotifier$1 = this.H0;
        xv1.b(paymentActivity$peInternetConnectionNotifier$1, intentFilter);
    }

    public final void p0(fw_2 fw_22, String object) {
        Intrinsics.checkNotNullParameter(fw_22, "fragment");
        Intrinsics.checkNotNullParameter(object, "tag");
        int n3 = 8;
        this.C2(n3);
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
        fragmentManager.getClass();
        a a2 = new a(fragmentManager);
        String string2 = "beginTransaction(...)";
        Intrinsics.checkNotNullExpressionValue(a2, string2);
        int n4 = R$id.fragment_payment;
        boolean bl2 = true;
        a2.h(n4, fw_22, (String)object, (int)(bl2 ? 1 : 0));
        a2.c((String)object);
        try {
            a2.o(bl2, bl2);
            fragmentManager.C();
        }
        catch (IllegalStateException illegalStateException) {
            object = yn3_0.a;
            ((yn3$a)object).e(illegalStateException);
        }
        boolean cfr_ignored_0 = fw_22 instanceof g;
    }

    public final void r0() {
        int n3;
        FrameLayout frameLayout = this.Z;
        if (frameLayout != null && (n3 = frameLayout.getRef()) == 0 && (frameLayout = this.Z) != null) {
            frameLayout.show();
        }
        if ((frameLayout = this.k0) != null) {
            frameLayout.startLoader();
        }
    }

    public final void showNotification(String string2, String object) {
        boolean bl2;
        int n3 = R$id.payment_notification;
        View view = this.findViewById(n3);
        int n4 = R$id.payment_notification_text;
        TextView textView = (TextView)this.findViewById(n4);
        cp$a cp$a = cp_1.Companion;
        int n7 = km_1.b(cp$a);
        n7 = n7 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
        cp_1 cp_12 = cp$a.e();
        cp_12.getClass();
        int n8 = cp_1.f();
        n8 = n8 != 0 ? hv3_0.w(R$integer.notification_anim_post_release_delay_accesibility) : hv3_0.w(R$integer.notification_anim_post_release_delay);
        if (string2 != null && !(bl2 = b.k(string2))) {
            textView.setText((CharSequence)string2);
        } else {
            string2 = "";
            textView.setText((CharSequence)string2);
        }
        string2 = new TranslateAnimation(0.0f, 0.0f, -100.0f, 0.0f);
        long l2 = n7;
        string2.setDuration(l2);
        view.setVisibility(0);
        Object object2 = Looper.getMainLooper();
        textView = new Handler(object2);
        object2 = new x01_0(1, object, view);
        textView.postDelayed((Runnable)object2, (long)100);
        object = new fn2_0(n7, view);
        long l3 = n8;
        view.postDelayed((Runnable)object, l3);
        view.startAnimation((Animation)string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void y2(int n3, Fragment object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
        fragmentManager.getClass();
        a a2 = new a(fragmentManager);
        Object object2 = "beginTransaction(...)";
        Intrinsics.checkNotNullExpressionValue(a2, (String)object2);
        try {
            a2.j(n3, (Fragment)object, string2);
            boolean bl2 = true;
            a2.o(bl2, bl2);
            fragmentManager.C();
        }
        catch (IllegalStateException illegalStateException) {
            Exception exception2;
            block5: {
                block4: {
                    try {
                        boolean bl3;
                        a2 = new a(fragmentManager);
                        object2 = fragmentManager.E(string2);
                        if (object2 == null || !(bl3 = ((Fragment)object2).isAdded())) break block4;
                        a2.i((Fragment)object2);
                        a2.d();
                        a2 = new a(fragmentManager);
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                a2.j(n3, (Fragment)object, string2);
                a2.d();
                return;
            }
            object = yn3_0.a;
            ((yn3$a)object).e(exception2);
            n3 = 71;
            this.setResult(n3);
            this.finish();
            return;
        }
        n3 = object instanceof g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void z2(g g3) {
        Object object = "tag";
        String string2 = "PeCheckoutFragment";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        boolean bl2 = this.isFinishing();
        if (!bl2) {
            try {
                object = this.getSupportFragmentManager();
                Object object2 = "getSupportFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object.getClass();
                object2 = new a((FragmentManager)object);
                String string3 = "beginTransaction(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object = ((FragmentManager)object).E(string2);
                if (object != null) {
                    ((a)object2).i((Fragment)object);
                    boolean bl3 = true;
                    ((a)object2).o(bl3, bl3);
                }
            }
            catch (Exception exception) {}
        }
        int n3 = R$id.payment_empty_container;
        this.y2(n3, g3, string2);
    }
}

