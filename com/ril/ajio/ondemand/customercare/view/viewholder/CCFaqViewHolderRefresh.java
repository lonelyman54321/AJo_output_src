/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.services.data.CustomerCare.QuestionAnswerList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public final class CCFaqViewHolderRefresh
extends uv_2
implements View.OnClickListener {
    private final View row;
    private final TextView titleTv;

    public CCFaqViewHolderRefresh(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.row_cc_faq_tv;
        i82_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.titleTv = i82_02;
        n3 = R$id.row_cc_faq_layout;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.row = view;
        view.setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.row_cc_faq_layout;
        if (n3 == n4 && (object2 = this.getMOnCCClickListener()) != null) {
            object = object.getTag();
            n4 = 2;
            object2.onViewItemClick(object, n4);
        }
    }

    public void setData(Object object, int n3) {
        boolean bl2 = object instanceof UiCCComponent;
        if (bl2) {
            QuestionAnswerList questionAnswerList = ((UiCCComponent)(object = (UiCCComponent)object)).getQuestionAnswerList();
            object = questionAnswerList != null ? ((UiCCComponent)object).getQuestionAnswerList().getQuestion() : ((UiCCComponent)object).getName();
            questionAnswerList = this.titleTv;
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (bl3) {
                object = "";
            } else {
                Intrinsics.checkNotNull(object);
                Regex regex = new Regex("\\\\n");
                String string2 = "\\\n";
                object = regex.replace((CharSequence)object, string2);
            }
            questionAnswerList.setText((CharSequence)object);
            object = this.row;
            Integer n4 = n3;
            object.setTag((Object)n4);
        }
    }
}

