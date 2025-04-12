/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCComplaintDetailViewHolderRefresh$setReopenIncidentNo$1;
import com.ril.ajio.services.data.CustomerCare.CCComplaintDetailInfo;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class CCComplaintDetailViewHolderRefresh
extends uv_2 {
    private final TextView category;
    private final View ccInfoAlertLayout;
    private final TextView complaintDetail;
    private final TextView complaintID;
    private final TextView complaintInfo;
    private final TextView complaintNewId;
    private final TextView dueDate;
    private final LinearLayout dueDateContainer;
    private final TextView dueDateText;
    private final ImageView image1;
    private final ImageView image2;
    private final ImageView image3;
    private final CardView imageContainer1;
    private final CardView imageContainer2;
    private final CardView imageContainer3;
    private final TextView imageRemaining;
    private final TextView raisedDate;
    private final TextView tvInfoAlert;
    private final TextView viewOrder;

    public CCComplaintDetailViewHolderRefresh(View view, i82_0 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, (i82_0)object);
        int n3 = R$id.category_text;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.category = object;
        n3 = R$id.cc_due_date_container;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (LinearLayout)object;
        this.dueDateContainer = object;
        n3 = R$id.cc_due_date_text;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.dueDateText = object;
        n3 = R$id.cc_due_date;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.dueDate = object;
        n3 = R$id.complaint_info;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.complaintInfo = object;
        n3 = R$id.complaint_detail_text;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.complaintDetail = object;
        n3 = R$id.cc_complaint_id;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.complaintID = object;
        n3 = R$id.cc_raised_date;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.raisedDate = object;
        n3 = R$id.cc_view_order;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.viewOrder = object;
        n3 = R$id.cc_image_container_1;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (CardView)((Object)object);
        this.imageContainer1 = object;
        int n4 = R$id.cc_image_container_2;
        Object object2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (CardView)((Object)object2);
        this.imageContainer2 = object2;
        int n7 = R$id.cc_image_container_3;
        Object object3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (CardView)((Object)object3);
        this.imageContainer3 = object3;
        int n8 = R$id.ccImage;
        object = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        this.image1 = object;
        n3 = R$id.ccImage;
        object = object2.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        this.image2 = object;
        n3 = R$id.ccImage;
        object = object3.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        this.image3 = object;
        n3 = R$id.cc_extra_images;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.imageRemaining = object;
        n3 = R$id.complaint_new_id;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.complaintNewId = object;
        n3 = R$id.tv_info_alert;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.tvInfoAlert = object;
        n3 = R$id.cc_info_alert_layout;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.ccInfoAlertLayout = view;
    }

    private static final void setData$lambda$0(String object, String string2, String string3, long l2, CCComplaintDetailViewHolderRefresh cCComplaintDetailViewHolderRefresh, View object2) {
        Intrinsics.checkNotNullParameter(cCComplaintDetailViewHolderRefresh, "this$0");
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string4 = k7.f(l2, "yyyy-MM-dd");
        StringBuilder stringBuilder = new StringBuilder("Complaintcard_Vieworder_Clicked_");
        stringBuilder.append((String)object);
        object = "_";
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        stringBuilder.append((String)object);
        stringBuilder.append(string3);
        stringBuilder.append((String)object);
        stringBuilder.append(string4);
        object = stringBuilder.toString();
        ((GTMEvents)object2).pushButtonTapEvent("Selfcare - view order on complaint card details tap", object, "complaint detail page");
        object = cCComplaintDetailViewHolderRefresh.getMOnCCClickListener();
        Intrinsics.checkNotNull(object);
        object.onViewItemClick(string2, 21);
    }

    private final void setReopenIncidentNo(String string2, String string3) {
        int n3 = R$string.reopen_complaint_new_id;
        int n4 = 1;
        SpannableString spannableString = new Object[n4];
        spannableString[0] = string2;
        String string4 = hv3_0.L(n3, (Object[])spannableString);
        spannableString = new SpannableString((CharSequence)string4);
        String string5 = " ID";
        int n7 = 6;
        int n8 = StringsKt.O(string4, string5, 0, false, n7) + 3;
        Intrinsics.checkNotNull(string2);
        int n10 = string2.length() + n8 + n4;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        int n14 = 8;
        aJIOApplication = mz3_0.t(aJIOApplication, n14);
        String string6 = "";
        Object object = new AjioCustomTypefaceSpan(string6, (Typeface)aJIOApplication);
        if (n8 >= 0 && n8 < (n7 = string4.length()) && n10 >= 0 && n10 <= (n3 = string4.length()) && n8 < n10) {
            n3 = 18;
            spannableString.setSpan(object, n8, n10, n3);
            object = new CCComplaintDetailViewHolderRefresh$setReopenIncidentNo$1(this, string3);
            spannableString.setSpan(object, n8, n10, n3);
            string2 = this.complaintNewId;
            string3 = LinkMovementMethod.getInstance();
            string2.setMovementMethod((MovementMethod)string3);
        }
        this.complaintNewId.setText((CharSequence)spannableString);
        this.complaintNewId.setVisibility(0);
    }

    public static /* synthetic */ void w(String string2, String string3, String string4, long l2, CCComplaintDetailViewHolderRefresh cCComplaintDetailViewHolderRefresh, View view) {
        CCComplaintDetailViewHolderRefresh.setData$lambda$0(string2, string3, string4, l2, cCComplaintDetailViewHolderRefresh, view);
    }

    public void setData(Object object, int n3) {
        CCComplaintDetailViewHolderRefresh cCComplaintDetailViewHolderRefresh = this;
        Object object2 = object;
        Object object3 = this.complaintNewId;
        int n4 = 8;
        object3.setVisibility(n4);
        int n7 = object instanceof UiCCComponent;
        if (n7 != 0 && (n7 = (object3 = ((UiCCComponent)(object2 = (UiCCComponent)object)).getQAItem()) instanceof CCComplaintDetailInfo) != 0) {
            int n8;
            object3 = ((UiCCComponent)object2).getQAItem();
            String string2 = "null cannot be cast to non-null type com.ril.ajio.services.data.CustomerCare.CCComplaintDetailInfo";
            Intrinsics.checkNotNull(object3, string2);
            object3 = (CCComplaintDetailInfo)object3;
            object2 = ((UiCCComponent)object2).getQAItem();
            Intrinsics.checkNotNull(object2, string2);
            object2 = (CCComplaintDetailInfo)object2;
            String string3 = ((CCComplaintDetailInfo)object2).component1();
            string2 = ((CCComplaintDetailInfo)object2).component2();
            long l2 = ((CCComplaintDetailInfo)object2).component3();
            long l3 = ((CCComplaintDetailInfo)object2).component4();
            long l4 = ((CCComplaintDetailInfo)object2).component5();
            Object object4 = ((CCComplaintDetailInfo)object2).component6();
            Object object5 = ((CCComplaintDetailInfo)object2).component7();
            String string4 = ((CCComplaintDetailInfo)object2).component8();
            String string5 = ((CCComplaintDetailInfo)object2).component9();
            Object object6 = ((CCComplaintDetailInfo)object2).component11();
            boolean bl2 = ((CCComplaintDetailInfo)object2).component12();
            Object object7 = ((CCComplaintDetailInfo)object2).component18();
            object2 = ((CCComplaintDetailInfo)object2).component19();
            object = object6;
            object6 = this.category;
            Object object8 = StringCompanionObject.INSTANCE;
            String string6 = string2;
            object8 = object5;
            int n10 = 1;
            object5 = new Object[n10];
            object5[0] = string4;
            object5 = Arrays.copyOf(object5, n10);
            string2 = String.format("%1$s Issue", object5);
            object5 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object5);
            object6.setText((CharSequence)string2);
            this.complaintID.setText((CharSequence)string5);
            string2 = this.raisedDate;
            object6 = "dd MMM yyyy";
            String string7 = k7.f(l2, (String)object6);
            string2.setText((CharSequence)string7);
            string2 = ((CCComplaintDetailInfo)object3).getMandatoryUploadText();
            if (string2 != null && (n10 = string2.length()) != 0) {
                string2 = this.tvInfoAlert;
                object3 = ((CCComplaintDetailInfo)object3).getMandatoryUploadText();
                string2.setText((CharSequence)object3);
                object3 = this.ccInfoAlertLayout;
                ai0_2.B((View)object3);
            } else {
                object3 = cCComplaintDetailViewHolderRefresh.ccInfoAlertLayout;
                ai0_2.i((View)object3);
            }
            object3 = "Closed";
            n10 = (int)(((String)object3).equalsIgnoreCase(string3) ? 1 : 0);
            if (n10 != 0) {
                string2 = cCComplaintDetailViewHolderRefresh.dueDateContainer;
                n8 = R$drawable.cc_rounded_full_bg_blue_refresh;
                string7 = hv3_0.r(n8);
                string2.setBackground((Drawable)string7);
                l2 = 0L;
                n10 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1));
                if (n10 > 0) {
                    string2 = cCComplaintDetailViewHolderRefresh.dueDateText;
                    string7 = hv3_0.K(R$string.resolved_on);
                    string2.setText((CharSequence)string7);
                    string2 = cCComplaintDetailViewHolderRefresh.dueDate;
                    string7 = k7.f(l4, (String)object6);
                    string2.setText((CharSequence)string7);
                    string2 = cCComplaintDetailViewHolderRefresh.dueDate;
                    n8 = 0;
                    string7 = null;
                    string2.setVisibility(0);
                } else {
                    string2 = cCComplaintDetailViewHolderRefresh.dueDateText;
                    string7 = hv3_0.K(R$string.resolved);
                    string2.setText((CharSequence)string7);
                    string2 = cCComplaintDetailViewHolderRefresh.dueDate;
                    n8 = 8;
                    string2.setVisibility(n8);
                }
                string2 = cCComplaintDetailViewHolderRefresh.dueDateText;
                string7 = "#39b54a";
                n8 = Color.parseColor((String)string7);
                string2.setTextColor(n8);
                n7 = (int)(((String)object3).equalsIgnoreCase(string3) ? 1 : 0);
                if (n7 != 0 && bl2 && (n7 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0)) == 0) {
                    cCComplaintDetailViewHolderRefresh.setReopenIncidentNo((String)object2, (String)object7);
                }
            } else {
                object2 = cCComplaintDetailViewHolderRefresh.dueDateContainer;
                object3 = hv3_0.r(R$drawable.cc_rounded_full_bg_yellow_refresh);
                object2.setBackground((Drawable)object3);
                object2 = cCComplaintDetailViewHolderRefresh.dueDateText;
                n7 = R$string.resolution_by;
                object3 = hv3_0.K(n7);
                object2.setText((CharSequence)object3);
                object2 = cCComplaintDetailViewHolderRefresh.dueDate;
                object3 = k7.f(l3, (String)object6);
                object2.setText((CharSequence)object3);
            }
            cCComplaintDetailViewHolderRefresh.complaintInfo.setText((CharSequence)object4);
            object2 = cCComplaintDetailViewHolderRefresh.complaintDetail;
            object3 = object8;
            object2.setText((CharSequence)object8);
            int n14 = TextUtils.isEmpty((CharSequence)string6);
            if (n14 != 0) {
                object2 = cCComplaintDetailViewHolderRefresh.viewOrder;
                n7 = 8;
                object2.setVisibility(n7);
            } else {
                object2 = cCComplaintDetailViewHolderRefresh.viewOrder;
                n7 = 0;
                object2.setVisibility(0);
                object6 = cCComplaintDetailViewHolderRefresh.viewOrder;
                object2 = object7;
                object3 = string5;
                string2 = string6;
                l2 = l3;
                object4 = this;
                object7 = new ag_2(string5, string6, string3, l3, this);
                object6.setOnClickListener((View.OnClickListener)object7);
            }
            object2 = cCComplaintDetailViewHolderRefresh.imageContainer1;
            n7 = 8;
            object2.setVisibility(n7);
            cCComplaintDetailViewHolderRefresh.imageContainer2.setVisibility(n7);
            cCComplaintDetailViewHolderRefresh.imageContainer3.setVisibility(n7);
            object2 = cCComplaintDetailViewHolderRefresh.imageRemaining;
            object2.setVisibility(n7);
            if (object != null && (n14 = object.size()) > 0) {
                object4 = object;
                n14 = 0;
                object2 = null;
                object3 = (CharSequence)object.get(0);
                n7 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n7 == 0) {
                    cCComplaintDetailViewHolderRefresh.imageContainer1.setVisibility(0);
                    object3 = (String)object.get(0);
                    string2 = cCComplaintDetailViewHolderRefresh.image1;
                    n8 = 4;
                    string3 = null;
                    object2 = this;
                    uv_2.loadImage$default(this, (String)object3, (ImageView)string2, null, n8, null);
                    n14 = object.size();
                    n7 = 1;
                    if (n14 > n7 && (n14 = (int)(TextUtils.isEmpty((CharSequence)(object2 = (CharSequence)object.get(n7))) ? 1 : 0)) == 0) {
                        object2 = cCComplaintDetailViewHolderRefresh.imageContainer2;
                        n10 = 0;
                        object2.setVisibility(0);
                        object3 = object2 = object.get(n7);
                        object3 = (String)object2;
                        string2 = cCComplaintDetailViewHolderRefresh.image2;
                        n8 = 4;
                        string3 = null;
                        object2 = this;
                        uv_2.loadImage$default(this, (String)object3, (ImageView)string2, null, n8, null);
                        n14 = object.size();
                        n7 = 2;
                        if (n14 > n7 && (n14 = (int)(TextUtils.isEmpty((CharSequence)(object2 = (CharSequence)object.get(n7))) ? 1 : 0)) == 0) {
                            object2 = cCComplaintDetailViewHolderRefresh.imageContainer3;
                            n10 = 0;
                            object2.setVisibility(0);
                            object3 = object2 = object.get(n7);
                            object3 = (String)object2;
                            string2 = cCComplaintDetailViewHolderRefresh.image3;
                            n8 = 4;
                            string3 = null;
                            object2 = this;
                            uv_2.loadImage$default(this, (String)object3, (ImageView)string2, null, n8, null);
                            n14 = object.size();
                            n7 = 3;
                            if (n14 > n7) {
                                object2 = cCComplaintDetailViewHolderRefresh.imageRemaining;
                                n10 = object.size() - n7;
                                string3 = "+";
                                object3 = new StringBuilder(string3);
                                ((StringBuilder)object3).append(n10);
                                object3 = ((StringBuilder)object3).toString();
                                object2.setText((CharSequence)object3);
                                object2 = cCComplaintDetailViewHolderRefresh.imageRemaining;
                                n7 = 0;
                                object3 = null;
                                object2.setVisibility(0);
                            }
                        }
                    }
                }
            }
        }
    }
}

