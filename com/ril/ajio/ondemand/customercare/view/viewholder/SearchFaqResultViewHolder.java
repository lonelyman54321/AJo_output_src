/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.view.View
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.customviews.widgets.managers.MainWidgetManager;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class SearchFaqResultViewHolder
extends uv_2 {
    private final AjioTextView searchResultTv;

    public SearchFaqResultViewHolder(View object, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object, i82_02);
        int n3 = R$id.search_result_count_tv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioTextView)object;
        this.searchResultTv = object;
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof UiCCComponent;
        if (n3 != 0) {
            int n4;
            object = (ArrayList)((UiCCComponent)object).getData();
            n3 = 0;
            String string2 = null;
            Comparable<Integer> comparable = object != null ? (Comparable<Integer>)((ArrayList)object).get(0) : null;
            comparable = (Integer)comparable;
            if (object != null) {
                n4 = 1;
                object = ((ArrayList)object).get(n4);
            } else {
                object = null;
            }
            object = (String)object;
            if (comparable != null) {
                string2 = ((Integer)comparable).toString();
            }
            comparable = new Comparable<Integer>();
            ((StringBuilder)comparable).append(string2);
            ((StringBuilder)comparable).append(" search results for ");
            string2 = ((StringBuilder)comparable).toString();
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            comparable = new Comparable<Integer>((CharSequence)object);
            object = MainWidgetManager.getInstance().getFontsManager();
            object2 = this.searchResultTv.getContext();
            int n7 = 5;
            object = ((FontsManager)object).getTypefaceWithFont((Context)object2, n7);
            object2 = MainWidgetManager.getInstance().getFontsManager();
            Object object3 = this.searchResultTv.getContext();
            object2 = ((FontsManager)object2).getTypefaceWithFont((Context)object3, 8);
            String string3 = "";
            object3 = new AjioCustomTypefaceSpan(string3, (Typeface)object);
            object = new AjioCustomTypefaceSpan(string3, (Typeface)object2);
            n4 = string2.length();
            int n8 = 18;
            comparable.setSpan(object3, 0, n4, n8);
            n3 = string2.length();
            n4 = comparable.length();
            comparable.setSpan(object, n3, n4, n8);
            this.searchResultTv.setText((CharSequence)((Object)comparable));
            object = this.searchResultTv;
            object.setVisibility(0);
        }
    }
}

