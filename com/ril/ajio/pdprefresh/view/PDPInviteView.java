/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.pdprefresh.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.pdprefresh.view.BasePDPNewAjioView;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class PDPInviteView
extends BasePDPNewAjioView {
    public static final /* synthetic */ int l;
    public final NewCustomEventsRevamp a;
    public final String b;
    public final String c;
    public TextView d;
    public ConstraintLayout e;
    public ShimmerFrameLayout f;
    public TextView g;
    public float h;
    public final uh2_0 i;
    public ImageView j;
    public boolean k;

    public PDPInviteView(Context context, AttributeSet object) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, (AttributeSet)object);
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.a = object2;
        this.b = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.c = object = cv_0.a((AnalyticsManager$Companion)object);
        this.a(context);
    }

    public PDPInviteView(Context context, AttributeSet object, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, (AttributeSet)object, n3);
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.a = object2;
        this.b = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.c = object = cv_0.a((AnalyticsManager$Companion)object);
        this.a(context);
    }

    public PDPInviteView(Context context, uh2_0 uh2_02) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uh2_02, "referralWidgetInfo");
        super(context);
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.a = object2;
        this.b = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.c = object = cv_0.a((AnalyticsManager$Companion)object);
        this.i = uh2_02;
        this.a(context);
    }

    public final void a(Context context) {
        uh2_0 uh2_02;
        boolean bl2;
        Object object;
        PDPInviteView pDPInviteView = this;
        Object object2 = LayoutInflater.from((Context)context);
        int n3 = R$layout.pdp_carousel_referral_widget;
        boolean bl3 = true;
        object2 = object2.inflate(n3, (ViewGroup)this, bl3);
        n3 = R$id.rw_earn_info;
        this.d = object = (TextView)object2.findViewById(n3);
        n3 = R$id.rw_parent;
        object = (ConstraintLayout)object2.findViewById(n3);
        this.e = object;
        n3 = R$id.referral_row_shimmer_view;
        object = (ShimmerFrameLayout)object2.findViewById(n3);
        this.f = object;
        n3 = R$id.rw_header;
        this.g = object = (TextView)object2.findViewById(n3);
        n3 = R$id.rw_wallet;
        object2 = (ImageView)object2.findViewById(n3);
        this.j = object2;
        object2 = null;
        object = "referralWidgetInfo";
        uh2_0 uh2_03 = this.i;
        if (uh2_03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            bl2 = false;
            uh2_02 = null;
        } else {
            uh2_02 = uh2_03;
        }
        bl2 = uh2_02.b;
        if (!bl2) {
            NewCustomEventsRevamp newCustomEventsRevamp = pDPInviteView.a;
            String string2 = newCustomEventsRevamp.getEC_WIDGET_INTERACTION();
            if (uh2_03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                uh2_02 = null;
            } else {
                uh2_02 = uh2_03;
            }
            String string3 = uh2_02.e;
            if (uh2_03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                uh2_02 = null;
            } else {
                uh2_02 = uh2_03;
            }
            String string4 = uh2_02.e;
            String string5 = "widget view";
            String string6 = "referral widget";
            String string7 = "widget_view";
            String string8 = pDPInviteView.b;
            String string9 = pDPInviteView.c;
            int n4 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, string6, string7, string3, string4, string8, null, string9, false, null, n4, null);
            if (uh2_03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = uh2_03;
            }
            object2.b = bl3;
        }
    }

    public final void setAmount(float f5) {
        this.h = f5;
    }

    public void setData() {
        float f5;
        Object object;
        Object object2 = null;
        int n3 = 1;
        String string2 = "format(...)";
        Object object3 = this.g;
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetHeaderTV");
            object = 0;
            object3 = null;
            f5 = 0.0f;
        }
        Object[] objectArray = z40_0.Companion;
        objectArray = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)objectArray).a;
        Object[] objectArray2 = "referrer_widget_heading";
        objectArray = objectArray.b((String)objectArray2);
        object3.setText((CharSequence)objectArray);
        object3 = this.e;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            object = 0;
            object3 = null;
            f5 = 0.0f;
        }
        objectArray = new hd_0((Object)this, n3);
        object3.setOnClickListener((View.OnClickListener)objectArray);
        object = this.k;
        int n4 = 8;
        float f6 = 1.1E-44f;
        if (object != 0 && (object3 = this.j) != null) {
            object3.setVisibility(n4);
        }
        f5 = this.h;
        float f7 = -1.0f;
        String string3 = "referralShimmerView";
        String string4 = "earnInfoTv";
        Object object5 = f5 == f7 ? 0 : (f5 < f7 ? -1 : 1);
        if (object5 == false) {
            object2 = this.d;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                object2 = null;
            }
            object2.setVisibility(n4);
            object2 = this.f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object4 = object2;
            }
            hv3_0.s0((ShimmerFrameLayout)((Object)object4));
        } else {
            object5 = false;
            f7 = 0.0f;
            objectArray2 = null;
            float f8 = f5 - 0.0f;
            object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object > 0) {
                object3 = StringCompanionObject.INSTANCE;
                object3 = AJIOApplication$a.a();
                object3 = z40$a.a((Context)object3);
                object3 = ((z40_0)object3).a;
                objectArray = "referral_widget_message";
                object3 = ((ao0_0)object3).b((String)objectArray);
                f6 = this.h;
                objectArray = Float.valueOf(f6);
                objectArray = qz2_0.x((Float)objectArray);
                objectArray2 = new Object[n3];
                objectArray2[0] = objectArray;
                objectArray = Arrays.copyOf(objectArray2, n3);
                object3 = String.format((String)object3, objectArray);
                try {
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                }
                catch (Exception exception) {
                    yn3_0.a.e(exception);
                    object3 = StringCompanionObject.INSTANCE;
                    f5 = this.h;
                    object3 = qz2_0.x(Float.valueOf(f5));
                    objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object3 = xh2_0.a(objectArray, n3, "You get %s AJIO Cash for every friend", string2);
                }
                TextView textView = this.d;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n3 = 0;
                    textView = null;
                }
                textView.setText((CharSequence)object3);
                textView = this.d;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n3 = 0;
                    textView = null;
                }
                textView.setVisibility(0);
                object2 = this.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    object4 = object2;
                }
                hv3_0.s0((ShimmerFrameLayout)((Object)object4));
            } else {
                object2 = this.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    object2 = null;
                }
                hv3_0.p0((ShimmerFrameLayout)((Object)object2));
                object2 = this.d;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                } else {
                    object4 = object2;
                }
                object4.setVisibility(n4);
            }
        }
    }

    public final void setFleek(boolean bl2) {
        this.k = bl2;
    }
}

