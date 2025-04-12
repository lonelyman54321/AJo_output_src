/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.callmeback;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeAdapterListener;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeLangViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CallMeLangAdapter
extends RecyclerView$f {
    private final ArrayList data;
    private final CallMeAdapterListener listener;

    public CallMeLangAdapter(ArrayList arrayList, CallMeAdapterListener callMeAdapterListener) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        Intrinsics.checkNotNullParameter(callMeAdapterListener, "listener");
        this.data = arrayList;
        this.listener = callMeAdapterListener;
    }

    public final ArrayList getData() {
        return this.data;
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        boolean bl2 = recyclerView$B instanceof CallMeLangViewHolder;
        if (bl2) {
            recyclerView$B = (CallMeLangViewHolder)recyclerView$B;
            Object object = this.data.get(n3);
            string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (String)object;
            ((CallMeLangViewHolder)recyclerView$B).setData((String)object);
        }
    }

    public RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.call_me_lang_row_view;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.listener;
        CallMeLangViewHolder callMeLangViewHolder = new CallMeLangViewHolder((View)viewGroup, (CallMeAdapterListener)object);
        return callMeLangViewHolder;
    }
}

