/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.adapter.CCComplaintAdapter;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.services.data.CustomerCare.CCComplaintInfoHelper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCComplaintViewHolderRefresh
extends uv_2 {
    private final RecyclerView mComplaintListView;
    private final TextView mViewMore;

    public CCComplaintViewHolderRefresh(View view, i82_0 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, (i82_0)object);
        int n3 = R$id.complaint_list_view;
        object = view.findViewById(n3);
        Object object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.mComplaintListView = object = (RecyclerView)object;
        int n4 = R$id.view_more;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.mViewMore = view;
        object2 = this.getMOnCCClickListener();
        boolean bl2 = object2 instanceof Fragment;
        if (bl2) {
            object2 = this.getMOnCCClickListener();
            String string2 = "null cannot be cast to non-null type androidx.fragment.app.Fragment";
            Intrinsics.checkNotNull(object2, string2);
            object2 = (Fragment)object2;
            n4 = 1;
            ((RecyclerView)object).setHasFixedSize(n4 != 0);
            ((RecyclerView)object).setNestedScrollingEnabled(false);
            object2 = ((Fragment)object2).requireActivity();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)object2, n4, false);
            ((RecyclerView)object).setLayoutManager(linearLayoutManager);
            n4 = mz3_0.d(14);
            object2 = new xb3_2(n4);
            ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
        }
        object = new fg_2(this);
        view.setOnClickListener((View.OnClickListener)object);
    }

    private static final void _init_$lambda$0(CCComplaintViewHolderRefresh object, View object2) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((uv_2)object).getMOnCCClickListener();
        if (object != null) {
            object2 = object2.getTag();
            int n3 = 20;
            object.onViewItemClick(object2, n3);
        }
    }

    public static /* synthetic */ void w(CCComplaintViewHolderRefresh cCComplaintViewHolderRefresh, View view) {
        CCComplaintViewHolderRefresh._init_$lambda$0(cCComplaintViewHolderRefresh, view);
    }

    public void setData(Object textView, int n3) {
        Object object;
        n3 = textView instanceof UiCCComponent;
        if (n3 != 0 && (n3 = (object = (textView = (UiCCComponent)textView).getQAItem()) instanceof CCComplaintInfoHelper) != 0) {
            textView = textView.getQAItem();
            Intrinsics.checkNotNull(textView, "null cannot be cast to non-null type com.ril.ajio.services.data.CustomerCare.CCComplaintInfoHelper");
            textView = (CCComplaintInfoHelper)textView;
            object = textView.getIncidentDetail();
            if (object != null) {
                int n4;
                object = textView.getIncidentDetail();
                n3 = object.size();
                if (n3 > (n4 = 2)) {
                    object = this.mComplaintListView;
                    textView = textView.getIncidentDetail().subList(0, n4);
                    i82_0 i82_02 = this.getMOnCCClickListener();
                    CCComplaintAdapter cCComplaintAdapter = new CCComplaintAdapter((List)textView, i82_02);
                    ((RecyclerView)object).setAdapter(cCComplaintAdapter);
                    textView = this.mViewMore;
                    textView.setVisibility(0);
                } else {
                    object = this.mComplaintListView;
                    textView = textView.getIncidentDetail();
                    i82_0 i82_03 = this.getMOnCCClickListener();
                    CCComplaintAdapter cCComplaintAdapter = new CCComplaintAdapter((List)textView, i82_03);
                    ((RecyclerView)object).setAdapter(cCComplaintAdapter);
                    textView = this.mViewMore;
                    n3 = 8;
                    textView.setVisibility(n3);
                }
            }
        }
    }
}

