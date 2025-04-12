/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.myaccount.order.imps;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.myaccount.ajiocash.activity.AjioCashActivity;
import com.ril.ajio.myaccount.order.imps.Hilt_ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.a;
import com.ril.ajio.myaccount.order.imps.d;
import com.ril.ajio.myaccount.order.imps.e;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QueryImps;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnImpsActivity
extends Hilt_ReturnImpsActivity
implements OnFragmentInteractionListener,
dj2_0 {
    public static final /* synthetic */ int G0;
    public NestedScrollView A0;
    public LinearLayout B0;
    public AjioTextView C0;
    public CardView D0;
    public FrameLayout E0;
    public String F0;
    public boolean Y;
    public boolean Z;
    public String k0;
    public float p0;
    public String q0 = "";
    public wf1_2 r0;
    public final NewEEcommerceEventsRevamp s0;
    public final NewCustomEventsRevamp t0;
    public final String u0;
    public final String v0;
    public boolean w0;
    public AjioTextView x0;
    public CollapsingToolbarLayout y0;
    public Toolbar z0;

    public ReturnImpsActivity() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.s0 = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.t0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.u0 = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.v0 = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final String I() {
        return this.k0;
    }

    public final void K0() {
        Intent intent = new Intent((Context)this, AjioCashActivity.class);
        this.startActivity(intent);
    }

    public final String d2() {
        return this.q0;
    }

    public final void m1(Fragment fragment, String string2, boolean bl2) {
        int n3;
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.F0 = string2;
        a.Companion.getClass();
        Object object = a.j;
        int n4 = Intrinsics.areEqual(string2, object);
        int n7 = 7;
        if (n4 != 0) {
            object = this.D0;
            if (object != null) {
                n3 = 8;
                object.setVisibility(n3);
            }
            if ((object = this.E0) != null) {
                ai0_2.u(0, 0, n7, (View)object);
            }
        } else {
            object = this.D0;
            if (object != null) {
                object.setVisibility(0);
            }
        }
        if ((n4 = this.Z) != 0 && (object = this.E0) != null) {
            n3 = 200;
            ai0_2.u(0, n3, n7, (View)object);
        }
        if ((object = this.getSupportFragmentManager()) != null) {
            object = this.getSupportFragmentManager();
            object.getClass();
            androidx.fragment.app.a a2 = new androidx.fragment.app.a((FragmentManager)object);
            object = "beginTransaction(...)";
            Intrinsics.checkNotNullExpressionValue(a2, object);
            a2.f = 4097;
            n4 = R$id.fragment_container;
            a2.j(n4, fragment, string2);
            if (bl2) {
                a2.c(string2);
            }
            a2.d();
        }
        this.z2(string2);
    }

    public final boolean n1() {
        return this.w0;
    }

    public final void onBackPressed() {
        Object object = this.F0;
        int n3 = 1;
        if (object != null) {
            a.Companion.getClass();
            String string2 = a.j;
            int n4 = Intrinsics.areEqual(object, string2);
            if (n4 != 0) {
                at2_1.e((Context)this);
                this.finish();
            } else {
                object = this.getSupportFragmentManager();
                if (object != null && (n4 = ((FragmentManager)object).J()) == n3) {
                    this.finish();
                } else {
                    object = this.getSupportFragmentManager();
                    if (object != null) {
                        ((FragmentManager)object).W();
                    }
                }
            }
        } else {
            int n7;
            object = this.getSupportFragmentManager();
            if (object != null && (n7 = ((FragmentManager)object).J()) == n3) {
                this.finish();
            } else {
                object = this.getSupportFragmentManager();
                if (object != null) {
                    ((FragmentManager)object).W();
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        int n3;
        int n4;
        super.onCreate((Bundle)object);
        int n7 = R$layout.imps_main_activity_layout;
        this.setContentView(n7);
        n7 = R$id.submit_button;
        this.x0 = object = (AjioTextView)this.findViewById(n7);
        n7 = R$id.collapseToolBar;
        object = (CollapsingToolbarLayout)this.findViewById(n7);
        this.y0 = object;
        n7 = R$id.alfToolbar;
        object = (Toolbar)this.findViewById(n7);
        this.z0 = object;
        n7 = R$id.nestedScrollView;
        object = (NestedScrollView)this.findViewById(n7);
        this.A0 = object;
        n7 = R$id.llBottomButton;
        object = (LinearLayout)this.findViewById(n7);
        this.B0 = object;
        n7 = R$id.otp_text;
        object = (AjioTextView)this.findViewById(n7);
        this.C0 = object;
        n7 = R$id.card_view_btn;
        object = (CardView)this.findViewById(n7);
        this.D0 = object;
        n7 = R$id.fragment_container;
        object = (FrameLayout)this.findViewById(n7);
        this.E0 = object;
        object = this.y0;
        if (object != null) {
            n4 = R$style.collapsed_toolbar_title;
            ((CollapsingToolbarLayout)((Object)object)).setCollapsedTitleTextAppearance(n4);
            n4 = R$style.expanded_toolbar_title;
            ((CollapsingToolbarLayout)((Object)object)).setExpandedTitleTextAppearance(n4);
            n4 = mz3_0.d(16);
            n3 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginTop();
            int n8 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginEnd();
            int bl2 = ((CollapsingToolbarLayout)((Object)object)).getExpandedTitleMarginBottom();
            ((CollapsingToolbarLayout)((Object)object)).setExpandedTitleMargin(n4, n3, n8, bl2);
        }
        if ((object = this.z0) != null) {
            n4 = R$string.bank_transfer_imps;
            object2 = this.getString(n4);
            ((Toolbar)object).setTitle((CharSequence)object2);
        }
        if ((object = this.z0) != null) {
            n4 = R$drawable.nav_back;
            ((Toolbar)object).setNavigationIcon(n4);
        }
        if ((object = this.z0) != null) {
            n4 = R$string.back_button_text;
            object2 = this.getString(n4);
            ((Toolbar)object).setNavigationContentDescription((CharSequence)object2);
        }
        if ((object = this.z0) != null) {
            object2 = new mn2_1(this);
            ((Toolbar)object).setNavigationOnClickListener((View.OnClickListener)object2);
        }
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object4 = wf1_2.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, object4, string2);
        object2 = ef0_0.a(object4, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            float f5;
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = ((String)object4).concat((String)object3);
            object = (wf1_2)((pD3)object).a((yn1_2)object2, (String)object3);
            Intrinsics.checkNotNullParameter(object, "<set-?>");
            this.r0 = object;
            object = this.getIntent().getExtras();
            n4 = 0;
            object2 = null;
            if (object != null) {
                object3 = "RETURN_ID";
                object = object.getString((String)object3);
            } else {
                n7 = 0;
                object = null;
                f5 = 0.0f;
            }
            this.k0 = object;
            object = this.getIntent().getExtras();
            if (object != null) {
                object3 = "IMPS_AMOUNT";
                this.p0 = f5 = object.getFloat((String)object3);
            }
            if ((object = this.getIntent().getExtras()) != null) {
                object2 = object.getString("IMPS_ORDER_CODE");
            }
            this.q0 = object2;
            object = this.getIntent();
            n4 = 0;
            object2 = null;
            if (object != null && (object = object.getExtras()) != null) {
                object3 = "TRANSFER_TO_BANK_FLOW";
                n4 = (int)(object.getBoolean((String)object3, false) ? 1 : 0);
            }
            this.w0 = n4;
            object = this.getIntent().getExtras();
            object2 = "IS_FROM_RCS_FLOW";
            n3 = 1;
            if (object != null && (n7 = (int)(object.containsKey((String)object2) ? 1 : 0)) == n3 && (object = this.getIntent().getExtras()) != null) {
                n7 = (int)(object.getBoolean((String)object2) ? 1 : 0);
                this.Y = n7;
            }
            object = this.getIntent().getExtras();
            object4 = "IS_FROM_RCS_CC_REFUND_FLOW";
            if (object != null && (n7 = (int)(object.containsKey((String)object4) ? 1 : 0)) == n3 && (object = this.getIntent().getExtras()) != null) {
                n7 = (int)(object.getBoolean((String)object4) ? 1 : 0);
                this.Z = n7;
            }
            object = d.Companion;
            boolean bl2 = this.Y;
            boolean bl3 = this.Z;
            object.getClass();
            object = new d();
            Bundle bundle = new Bundle();
            bundle.putBoolean((String)object2, bl2);
            bundle.putBoolean((String)object4, bl3);
            ((Fragment)object).setArguments(bundle);
            object2 = d.S;
            this.m1((Fragment)object, (String)object2, n3 != 0);
            object = this.x0;
            if (object != null) {
                n3 = 2;
                object2 = new zm_1(this, n3);
                object.setOnClickListener((View.OnClickListener)object2);
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onFragmentInteraction(String object, int n3, Bundle object2) {
        if (n3 == 0) {
            object = this.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
            d.Companion.getClass();
            Object object3 = d.S;
            object = ((FragmentManager)object).E((String)object3);
            if (object != null && (n3 = object instanceof d) != 0) {
                int n4;
                Object object4;
                object = (d)object;
                object3 = ((d)object).j;
                object2 = null;
                Object object5 = object3 != null ? (object3 = object3.d2()) : null;
                object3 = ((d)object).o;
                if (object3 != null && (object3 = ((AppCompatEditText)object3).getText()) != null) {
                    object4 = object3 = object3.toString();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                object3 = ((d)object).q;
                Object object6 = object3 != null && (object3 = ((AppCompatEditText)object3).getText()) != null ? (object3 = object3.toString()) : null;
                AJIOApplication.Companion.getClass();
                Object object7 = AJIOApplication$a.a();
                object3 = new jo_2((Context)object7);
                object7 = "INPUT_MOBILE_NUMBER";
                String string2 = ((sw_0)object3).getPreference((String)object7, "");
                String string3 = ((UserInformation)((d)object).I.getValue()).getUserEmailId();
                object3 = ((d)object).j;
                if (object3 != null) {
                    float f5 = object3.s1();
                    object3 = Float.valueOf(f5);
                } else {
                    n3 = 0;
                    object3 = null;
                    float f6 = 0.0f;
                }
                object7 = new StringBuilder();
                ((StringBuilder)object7).append(object3);
                String string4 = ((StringBuilder)object7).toString();
                object3 = ((d)object).j;
                Object object8 = object3 != null ? (object3 = object3.I()) : null;
                object3 = ((d)object).j;
                if (object3 != null) {
                    n3 = (int)(object3.n1() ? 1 : 0);
                    object2 = n3 != 0;
                }
                String string5 = "true";
                object7 = object3;
                object3 = new QueryImps((String)object5, (String)object4, (String)object6, string2, string3, string4, (String)object8, string5, (Boolean)object2);
                object2 = ((d)object).x;
                if (object2 != null) {
                    Intrinsics.checkNotNullParameter(object3, "queryImps");
                    object7 = ((jo_2)((wf1_2)object2).a.getValue()).a();
                    object3 = ((wf1_2)object2).c.getImps((QueryImps)object3, (String)object7);
                    object7 = qt2_2.c;
                    object3 = ((g53_0)object3).h((Scheduler)object7);
                    object7 = ti_2.a();
                    object3 = ((g53_0)object3).e((Scheduler)object7);
                    object7 = new pf1_2(object2, 0);
                    object5 = new qf1_2(0, (Function1)object7);
                    n4 = 1;
                    object7 = new cx0_1(object2, n4);
                    object6 = null;
                    object4 = new rf1_2(0, (Function1)object7);
                    object3 = ((g53_0)object3).f((o60_0)object5, (o60_0)object4);
                    object2 = ((wf1_2)object2).b;
                    ((t30_0)object2).b((yr0_2)object3);
                }
                if ((object = ((d)object).y) != null) {
                    ((AjioLoaderView)((Object)object)).startLoader();
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        String string2 = this.v0;
        NewCustomEventsRevamp newCustomEventsRevamp = this.t0;
        String string3 = this.u0;
        newCustomEventsRevamp.newPushCustomScreenView("bank refund screen - imps", "order management screen", string3, null, string2);
    }

    public final void onStop() {
        super.onStop();
        this.s0.setPreviousScreenData("bank refund screen - imps", "order management screen");
    }

    public final float s1() {
        return this.p0;
    }

    public final void y2(boolean bl2) {
        Object object = cp_1.Companion;
        int n3 = km_1.b((cp$a)object);
        if (n3 != 0) {
            AjioTextView ajioTextView = this.x0;
            n3 = 1;
            if (ajioTextView != null) {
                ajioTextView.setClickable(n3 != 0);
            }
            if ((ajioTextView = this.x0) != null) {
                ajioTextView.setEnabled(n3 != 0);
            }
            if ((ajioTextView = this.x0) != null) {
                n3 = R$drawable.bg_black_button;
                object = hv3_0.r(n3);
                ajioTextView.setBackground((Drawable)object);
            }
            if ((ajioTextView = this.x0) != null) {
                n3 = hv3_0.m(R$color.white);
                ajioTextView.setTextColor(n3);
            }
        } else {
            object = this.x0;
            if (object != null) {
                object.setClickable(bl2);
            }
            if ((object = this.x0) != null) {
                object.setEnabled(bl2);
            }
            if (bl2) {
                AjioTextView ajioTextView = this.x0;
                if (ajioTextView != null) {
                    n3 = R$drawable.bg_black_button;
                    object = hv3_0.r(n3);
                    ajioTextView.setBackground((Drawable)object);
                }
                if ((ajioTextView = this.x0) != null) {
                    n3 = hv3_0.m(R$color.white);
                    ajioTextView.setTextColor(n3);
                }
            } else {
                AjioTextView ajioTextView = this.x0;
                if (ajioTextView != null) {
                    n3 = R$drawable.bg_button_disabled;
                    object = hv3_0.r(n3);
                    ajioTextView.setBackground((Drawable)object);
                }
                if ((ajioTextView = this.x0) != null) {
                    n3 = hv3_0.m(R$color.accent_color_12);
                    ajioTextView.setTextColor(n3);
                }
            }
        }
    }

    public final void z2(String object) {
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object2 = this.x0;
        if (object2 != null) {
            object2.setTag(object);
        }
        e.Companion.getClass();
        object2 = e.m;
        int n3 = Intrinsics.areEqual(object2, object);
        Object object3 = null;
        if (n3 != 0) {
            boolean bl2;
            object = this.y0;
            if (object != null) {
                ai0_2.i((View)object);
            }
            if ((object = this.B0) != null) {
                ai0_2.B((View)object);
            }
            if ((object = this.C0) != null) {
                ai0_2.i((View)object);
            }
            if ((object = this.A0) != null) {
                n3 = hv3_0.m(R$color.accent_color_19);
                object.setBackgroundColor(n3);
            }
            if (bl2 = this.Z) {
                object = this.x0;
                if (object != null) {
                    n3 = R$string.login_continue;
                    object2 = this.getString(n3);
                    object.setText((CharSequence)object2);
                }
            } else {
                object = this.x0;
                if (object != null) {
                    n3 = R$string.continue_shopping;
                    object2 = this.getString(n3);
                    object.setText((CharSequence)object2);
                }
            }
            if ((object = this.y0) != null) {
                object = object.getLayoutParams();
            } else {
                bl2 = false;
                object = null;
            }
            n3 = object instanceof AppBarLayout$LayoutParams;
            if (n3 != 0) {
                object3 = object;
                object3 = (AppBarLayout$LayoutParams)((Object)object);
            }
            if (object3 != null) {
                ((AppBarLayout$LayoutParams)((Object)object3)).setScrollFlags(0);
            }
            bl2 = true;
            this.y2(bl2);
        } else {
            a.Companion.getClass();
            object2 = a.j;
            int n4 = Intrinsics.areEqual(object2, object);
            if (n4 != 0) {
                object = this.y0;
                if (object != null) {
                    ai0_2.i((View)object);
                }
                if ((object = this.C0) != null) {
                    ai0_2.i((View)object);
                }
                if ((object = this.A0) != null) {
                    n3 = hv3_0.m(R$color.accent_color_19);
                    object.setBackgroundColor(n3);
                }
                if ((object = this.y0) != null) {
                    object = object.getLayoutParams();
                } else {
                    n4 = 0;
                    object = null;
                }
                n3 = object instanceof AppBarLayout$LayoutParams;
                if (n3 != 0) {
                    object3 = object;
                    object3 = (AppBarLayout$LayoutParams)((Object)object);
                }
                if (object3 != null) {
                    ((AppBarLayout$LayoutParams)((Object)object3)).setScrollFlags(0);
                }
            } else {
                object = this.y0;
                if (object != null) {
                    ai0_2.B((View)object);
                }
                if ((object = this.B0) != null) {
                    ai0_2.B((View)object);
                }
                this.y2(false);
                object = this.y0;
                if (object != null) {
                    object = object.getLayoutParams();
                } else {
                    n4 = 0;
                    object = null;
                }
                n3 = object instanceof AppBarLayout$LayoutParams;
                if (n3 != 0) {
                    object3 = object;
                    object3 = (AppBarLayout$LayoutParams)((Object)object);
                }
                if (object3 != null) {
                    n4 = 3;
                    ((AppBarLayout$LayoutParams)((Object)object3)).setScrollFlags(n4);
                }
                if ((object = this.x0) != null) {
                    n3 = R$string.submit_low;
                    object2 = this.getString(n3);
                    object.setText((CharSequence)object2);
                }
                if ((object = this.A0) != null) {
                    n3 = hv3_0.m(R$color.white);
                    object.setBackgroundColor(n3);
                }
            }
        }
    }
}

