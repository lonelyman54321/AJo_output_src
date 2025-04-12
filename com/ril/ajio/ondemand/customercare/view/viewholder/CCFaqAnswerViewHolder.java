/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
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

public final class CCFaqAnswerViewHolder
extends uv_2 {
    private final TextView questionTv;
    private final TextView titleTv;

    public CCFaqAnswerViewHolder(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.row_cc_faq_answer_tv;
        i82_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.titleTv = i82_02;
        n3 = R$id.row_cc_faq_tv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.questionTv = view;
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof UiCCComponent;
        if (n3 != 0) {
            object = ((UiCCComponent)object).getQuestionAnswerList();
            TextView textView = this.questionTv;
            Object object2 = ((QuestionAnswerList)object).getQuestion();
            textView.setText((CharSequence)object2);
            textView = this.titleTv;
            object2 = ((QuestionAnswerList)object).getAnswer();
            boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (bl2) {
                object = "";
            } else {
                object = ((QuestionAnswerList)object).getAnswer();
                Intrinsics.checkNotNullExpressionValue(object, "getAnswer(...)");
                object2 = new Regex("\\\\n");
                String string2 = "\\\n";
                object = ((Regex)object2).replace((CharSequence)object, string2);
            }
            textView.setText((CharSequence)object);
        }
    }
}

