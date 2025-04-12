/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.CustomerCare.CCComplaintInfoHelper$CCComplaintInfo;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class CCComplaintItemViewHolderRefresh
extends uv_2 {
    private final TextView category;
    private final View ccInfoAlertLayout;
    private final CardView complaintCardContainer;
    private final TextView complaintID;
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

    public CCComplaintItemViewHolderRefresh(View view, i82_0 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, (i82_0)object);
        int n3 = R$id.complaint_card_container;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (CardView)((Object)object);
        this.complaintCardContainer = object;
        n3 = R$id.category_text;
        object = view.findViewById(n3);
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
        n3 = R$id.cc_view_order;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.viewOrder = object;
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

    private static final void setData$lambda$0(CCComplaintInfoHelper$CCComplaintInfo object, CCComplaintItemViewHolderRefresh object2, View object3) {
        Intrinsics.checkNotNullParameter(object, "$ccComplaintInfo");
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getTicketId();
        String string3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getOrderId();
        String string4 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentStatus();
        long l2 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getTicketDueDate();
        String string5 = k7.f(l2, "yyyy-MM-dd");
        String string6 = "Complaintcard_Vieworder_Clicked_";
        StringBuilder stringBuilder = new StringBuilder(string6);
        stringBuilder.append(string2);
        string2 = "_";
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        stringBuilder.append(string4);
        stringBuilder.append(string2);
        stringBuilder.append(string5);
        string2 = stringBuilder.toString();
        string3 = "complaint list page";
        string4 = "Selfcare - Clicked on view order on complaint card";
        ((GTMEvents)object3).pushButtonTapEvent(string4, string2, string3);
        object2 = ((uv_2)object2).getMOnCCClickListener();
        if (object2 != null) {
            object = ((CCComplaintInfoHelper$CCComplaintInfo)object).getOrderId();
            int n3 = 21;
            object2.onViewItemClick(object, n3);
        }
    }

    private static final void setData$lambda$1(CCComplaintItemViewHolderRefresh object, CCComplaintInfoHelper$CCComplaintInfo cCComplaintInfoHelper$CCComplaintInfo, View object2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = "$ccComplaintInfo";
        Intrinsics.checkNotNullParameter(cCComplaintInfoHelper$CCComplaintInfo, (String)object2);
        object = ((uv_2)object).getMOnCCClickListener();
        if (object != null) {
            int n3 = 22;
            object.onViewItemClick(cCComplaintInfoHelper$CCComplaintInfo, n3);
        }
    }

    public static /* synthetic */ void w(CCComplaintItemViewHolderRefresh cCComplaintItemViewHolderRefresh, CCComplaintInfoHelper$CCComplaintInfo cCComplaintInfoHelper$CCComplaintInfo, View view) {
        CCComplaintItemViewHolderRefresh.setData$lambda$1(cCComplaintItemViewHolderRefresh, cCComplaintInfoHelper$CCComplaintInfo, view);
    }

    public static /* synthetic */ void x(CCComplaintItemViewHolderRefresh cCComplaintItemViewHolderRefresh, CCComplaintInfoHelper$CCComplaintInfo cCComplaintInfoHelper$CCComplaintInfo, View view) {
        CCComplaintItemViewHolderRefresh.setData$lambda$0(cCComplaintInfoHelper$CCComplaintInfo, cCComplaintItemViewHolderRefresh, view);
    }

    public void setData(Object object, int n3) {
        Object object2 = null;
        int n4 = 1;
        boolean n7 = object instanceof CCComplaintInfoHelper$CCComplaintInfo;
        if (n7) {
            Object object3;
            boolean bl2;
            int n8;
            int n10;
            Object object4;
            int n14;
            object = (CCComplaintInfoHelper$CCComplaintInfo)object;
            Object object5 = h40_0.a;
            boolean bl3 = ((h40_0)object5).h2();
            if (bl3 && (object5 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getMandatoryUploadText()) != null && (n14 = object5.length()) != 0) {
                object5 = this.tvInfoAlert;
                object4 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getMandatoryUploadText();
                object5.setText((CharSequence)object4);
                object5 = this.ccInfoAlertLayout;
                ai0_2.B((View)object5);
            } else {
                object5 = this.ccInfoAlertLayout;
                ai0_2.i((View)object5);
            }
            object5 = this.category;
            object4 = StringCompanionObject.INSTANCE;
            object4 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getCategory();
            Object object6 = new Object[n4];
            object6[0] = object4;
            object4 = Arrays.copyOf(object6, n4);
            object4 = String.format("%1$s Issue", (Object[])object4);
            object6 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
            object5.setText((CharSequence)object4);
            object5 = this.complaintID;
            object4 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getTicketId();
            object5.setText((CharSequence)object4);
            object5 = this.raisedDate;
            long l2 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentCreationTime();
            Object object7 = "dd MMM yyyy";
            object4 = k7.f(l2, (String)object7);
            object5.setText((CharSequence)object4);
            object5 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentStatus();
            object4 = "Closed";
            boolean bl4 = ((String)object4).equalsIgnoreCase((String)object5);
            int n15 = 8;
            if (bl4) {
                object5 = this.dueDateContainer;
                n10 = R$drawable.cc_rounded_half_bg_blue_refresh;
                object6 = hv3_0.r(n10);
                object5.setBackground((Drawable)object6);
                long l3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentResolvedTime();
                long l4 = 0L;
                long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (l7 > 0) {
                    object5 = this.dueDateText;
                    n10 = R$string.resolved_on;
                    object6 = hv3_0.K(n10);
                    object5.setText((CharSequence)object6);
                    object5 = this.dueDate;
                    l3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getIncidentResolvedTime();
                    object6 = k7.f(l3, (String)object7);
                    object5.setText((CharSequence)object6);
                    object5 = this.dueDate;
                    object5.setVisibility(0);
                } else {
                    object5 = this.dueDateText;
                    n10 = R$string.resolved;
                    object6 = hv3_0.K(n10);
                    object5.setText((CharSequence)object6);
                    object5 = this.dueDate;
                    object5.setVisibility(n15);
                }
            } else {
                object5 = this.dueDateContainer;
                object6 = hv3_0.r(R$drawable.cc_rounded_bg_yellow_refresh);
                object5.setBackground((Drawable)object6);
                object5 = this.dueDateText;
                n10 = R$string.resolution_by;
                object6 = hv3_0.K(n10);
                object5.setText((CharSequence)object6);
                object5 = this.dueDate;
                long l8 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getTicketDueDate();
                object6 = k7.f(l8, (String)object7);
                object5.setText((CharSequence)object6);
            }
            this.imageContainer1.setVisibility(n15);
            this.imageContainer2.setVisibility(n15);
            this.imageContainer3.setVisibility(n15);
            this.imageRemaining.setVisibility(n15);
            object5 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages();
            if (object5 != null && (n8 = (object5 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages()).size()) > 0 && !(bl2 = TextUtils.isEmpty((CharSequence)(object5 = (CharSequence)((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages().get(0))))) {
                boolean bl5;
                this.imageContainer1.setVisibility(0);
                object7 = object5 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages().get(0);
                object7 = (String)object5;
                ImageView imageView = this.image1;
                int n16 = 4;
                object6 = this;
                uv_2.loadImage$default(this, (String)object7, imageView, null, n16, null);
                object5 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages();
                int n17 = object5.size();
                if (n17 > n4 && !(bl5 = TextUtils.isEmpty((CharSequence)(object5 = (CharSequence)((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages().get(n4))))) {
                    this.imageContainer2.setVisibility(0);
                    object5 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages();
                    object7 = object3 = object5.get(n4);
                    object7 = (String)object3;
                    imageView = this.image2;
                    n16 = 4;
                    uv_2.loadImage$default(this, (String)object7, imageView, null, n16, null);
                    object3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages();
                    n4 = object3.size();
                    int n18 = 2;
                    if (n4 > n18 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object3 = (CharSequence)((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages().get(n18))) ? 1 : 0)) == 0) {
                        this.imageContainer3.setVisibility(0);
                        object7 = object3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages().get(n18);
                        object7 = (String)object3;
                        imageView = this.image3;
                        n16 = 4;
                        uv_2.loadImage$default(this, (String)object7, imageView, null, n16, null);
                        object3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages();
                        n4 = object3.size();
                        int n19 = 3;
                        if (n4 > n19) {
                            object3 = this.imageRemaining;
                            object6 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getProductImages();
                            n10 = object6.size() - n19;
                            object7 = "+";
                            object5 = new StringBuilder((String)object7);
                            ((StringBuilder)object5).append(n10);
                            object5 = ((StringBuilder)object5).toString();
                            object3.setText((CharSequence)object5);
                            object3 = this.imageRemaining;
                            object3.setVisibility(0);
                        }
                    }
                }
            }
            if ((n4 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((CCComplaintInfoHelper$CCComplaintInfo)object).getOrderId())) ? 1 : 0)) != 0) {
                object2 = this.viewOrder;
                object2.setVisibility(n15);
            } else {
                this.viewOrder.setVisibility(0);
                object2 = this.viewOrder;
                object3 = new bg_2(this, (CCComplaintInfoHelper$CCComplaintInfo)object);
                object2.setOnClickListener((View.OnClickListener)object3);
            }
            object2 = this.complaintCardContainer;
            object3 = new cg_2(this, (CCComplaintInfoHelper$CCComplaintInfo)object);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
    }
}

