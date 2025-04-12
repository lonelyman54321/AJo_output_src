/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.utility.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class InAppBottomUpdatesView
extends LinearLayout {
    public static final /* synthetic */ int g;
    public final ImageView a;
    public final TextView b;
    public final View c;
    public final AppUpdateManager d;
    public final NewCustomEventsRevamp e;
    public final NewEEcommerceEventsRevamp f;

    public InAppBottomUpdatesView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 0, 14);
    }

    public InAppBottomUpdatesView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 0, 12);
    }

    public InAppBottomUpdatesView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, n3, 8);
    }

    public InAppBottomUpdatesView(Context object, AttributeSet object2, int n3, int n4) {
        NewCustomEventsRevamp newCustomEventsRevamp;
        int n7;
        int n8 = n4 & 2;
        Object object3 = null;
        if (n8 != 0) {
            n7 = 0;
            object2 = null;
        }
        n8 = 0;
        if ((n4 &= 4) != 0) {
            n3 = 0;
            newCustomEventsRevamp = null;
        }
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super(object, (AttributeSet)object2, n3, 0);
        AJIOApplication.Companion.getClass();
        object2 = AppUpdateManagerFactory.create((Context)AJIOApplication$a.a());
        Intrinsics.checkNotNullExpressionValue(object2, "create(...)");
        this.d = object2;
        object2 = AnalyticsManager.Companion;
        this.e = newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.f = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        object = object.getSystemService("layout_inflater");
        object2 = "null cannot be cast to non-null type android.view.LayoutInflater";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (LayoutInflater)object;
        n7 = R$layout.inapp_bottom_widget_view;
        object.inflate(n7, (ViewGroup)this);
        int n10 = R$id.download_icon;
        object = (ImageView)this.findViewById(n10);
        this.a = object;
        n10 = R$id.download_button;
        object = this.findViewById(n10);
        this.c = object;
        n10 = R$id.download_update;
        object = (TextView)this.findViewById(n10);
        this.b = object;
        object = this.c;
        if (object == null) {
            object = "downloadButton";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        super((Object)this, 1);
        object3.setOnClickListener((View.OnClickListener)object);
    }

    public static /* synthetic */ void a(InAppBottomUpdatesView inAppBottomUpdatesView) {
        InAppBottomUpdatesView.setUIForState$lambda$1(inAppBottomUpdatesView);
    }

    private static final void setUIForState$lambda$1(InAppBottomUpdatesView inAppBottomUpdatesView) {
        Intrinsics.checkNotNullParameter((Object)inAppBottomUpdatesView, "this$0");
        inAppBottomUpdatesView.setVisibility(8);
    }

    public final void setUIForState(int n3) {
        int n4;
        int n7 = this.getVisibility();
        if (n7 == (n4 = 8)) {
            this.setVisibility(0);
        }
        n7 = 3;
        String string2 = "downloadUpdateText";
        String string3 = "downloadButton";
        String string4 = "downloadIcon";
        ImageView imageView = null;
        if (n3 != n7) {
            n7 = 4;
            if (n3 != n7) {
                this.setVisibility(n4);
            } else {
                Object object = this.a;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n3 = 0;
                    object = null;
                }
                n7 = R$drawable.ic_update_downloaded;
                object.setImageResource(n7);
                object = this.c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                object.setVisibility(0);
                object = this.b;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    imageView = object;
                }
                object = this.getContext();
                n7 = R$string.in_app_state_dowmloaded;
                object = object.getText(n7);
                imageView.setText((CharSequence)object);
            }
        } else {
            Object object = this.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n3 = 0;
                object = null;
            }
            n7 = R$drawable.ic_downloading_update;
            object.setImageResource(n7);
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object = null;
            }
            object.setVisibility(n4);
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageView = object;
            }
            object = this.getContext();
            n7 = R$string.in_app_state_dowmloading;
            object = object.getText(n7);
            imageView.setText((CharSequence)object);
            object = new zf1_2(this);
            long l2 = 3000L;
            this.postDelayed((Runnable)object, l2);
        }
    }
}

