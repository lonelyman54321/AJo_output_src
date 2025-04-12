/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.callmeback;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeAdapterListener;
import kotlin.jvm.internal.Intrinsics;

public final class CallMeLangViewHolder
extends RecyclerView$B {
    private final TextView langTv;
    private final CallMeAdapterListener listener;

    public CallMeLangViewHolder(View view, CallMeAdapterListener callMeAdapterListener) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(callMeAdapterListener, "listener");
        super(view);
        this.listener = callMeAdapterListener;
        int n3 = R$id.lang_tv;
        view = (TextView)view.findViewById(n3);
        this.langTv = view;
    }

    private static final void setData$lambda$0(CallMeLangViewHolder callMeLangViewHolder, String string2, View view) {
        Intrinsics.checkNotNullParameter(callMeLangViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(string2, "$lang");
        callMeLangViewHolder.listener.onLanguageClick(string2);
    }

    public static /* synthetic */ void w(CallMeLangViewHolder callMeLangViewHolder, String string2, View view) {
        CallMeLangViewHolder.setData$lambda$0(callMeLangViewHolder, string2, view);
    }

    public final TextView getLangTv() {
        return this.langTv;
    }

    public final void setData(String string2) {
        Intrinsics.checkNotNullParameter(string2, "lang");
        this.langTv.setText((CharSequence)string2);
        String string3 = this.listener.getSelectedLang();
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        if (bl2) {
            string3 = this.langTv;
            int n3 = hv3_0.m(R$color.accent_color_10);
            string3.setBackgroundColor(n3);
            string3 = this.langTv;
            n3 = hv3_0.m(R$color.accent_color_11);
            string3.setTextColor(n3);
        } else {
            string3 = this.langTv;
            int n4 = hv3_0.m(R$color.accent_color_11);
            string3.setBackgroundColor(n4);
            string3 = this.langTv;
            n4 = hv3_0.m(R$color.accent_color_10);
            string3.setTextColor(n4);
        }
        string3 = this.langTv;
        oj_2 oj_22 = new oj_2(this, string2);
        string3.setOnClickListener((View.OnClickListener)oj_22);
    }
}

