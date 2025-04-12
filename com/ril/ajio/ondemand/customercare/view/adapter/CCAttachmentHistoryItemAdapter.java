/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.databinding.ItemCcAttachmentHistoryFileBinding;
import com.ril.ajio.ondemand.customercare.view.viewholder.ItemCCAttachHistoryFileViewHolder;
import com.ril.ajio.services.data.CustomerCare.ImageDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachmentHistoryItemAdapter
extends RecyclerView$f {
    private final ArrayList attachments;

    public CCAttachmentHistoryItemAdapter() {
        ArrayList arrayList;
        this.attachments = arrayList = new ArrayList();
    }

    public int getItemCount() {
        return this.attachments.size();
    }

    public void onBindViewHolder(ItemCCAttachHistoryFileViewHolder itemCCAttachHistoryFileViewHolder, int n3) {
        Intrinsics.checkNotNullParameter(itemCCAttachHistoryFileViewHolder, "holder");
        Object object = this.attachments.get(n3);
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        object = (ImageDetails)object;
        itemCCAttachHistoryFileViewHolder.setData((ImageDetails)object);
    }

    public ItemCCAttachHistoryFileViewHolder onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        object = ItemCcAttachmentHistoryFileBinding.inflate(LayoutInflater.from((Context)object.getContext()), object, false);
        Intrinsics.checkNotNullExpressionValue(object, "inflate(...)");
        ItemCCAttachHistoryFileViewHolder itemCCAttachHistoryFileViewHolder = new ItemCCAttachHistoryFileViewHolder((ItemCcAttachmentHistoryFileBinding)object);
        return itemCCAttachHistoryFileViewHolder;
    }

    public final void setData(List collection) {
        Intrinsics.checkNotNullParameter(collection, "list");
        this.attachments.clear();
        ArrayList arrayList = this.attachments;
        collection = collection;
        arrayList.addAll(collection);
        this.notifyDataSetChanged();
    }
}

