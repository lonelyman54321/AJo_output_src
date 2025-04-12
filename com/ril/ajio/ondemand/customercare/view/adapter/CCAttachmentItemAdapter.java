/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.ondemand.customercare.view.viewholder.AttachItemClickListener;
import com.ril.ajio.ondemand.customercare.view.viewholder.ItemCCAttachFileViewHolder;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachmentItemAdapter
extends RecyclerView$f {
    private final AttachItemClickListener attachItemClickListener;
    private final ArrayList attachments;
    private boolean isAttachmentMandatory;

    public CCAttachmentItemAdapter(AttachItemClickListener arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "attachItemClickListener");
        this.attachItemClickListener = arrayList;
        this.attachments = arrayList = new ArrayList();
    }

    public int getItemCount() {
        return this.attachments.size();
    }

    public void onBindViewHolder(ItemCCAttachFileViewHolder itemCCAttachFileViewHolder, int n3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(itemCCAttachFileViewHolder, "holder");
        Object object = this.attachments.get(n3);
        String string2 = "get(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageData)object;
        if (n3 == 0 && (bl2 = this.isAttachmentMandatory)) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        itemCCAttachFileViewHolder.setData((ImageData)object, n3, bl2);
    }

    public ItemCCAttachFileViewHolder onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.item_cc_attach_file;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        AttachItemClickListener attachItemClickListener2 = this.attachItemClickListener;
        object = new ItemCCAttachFileViewHolder((View)viewGroup, attachItemClickListener2);
        return object;
    }

    public final void setData(List collection, boolean bl2) {
        this.isAttachmentMandatory = bl2;
        ArrayList arrayList = this.attachments;
        arrayList.clear();
        if (collection != null) {
            arrayList = this.attachments;
            collection = collection;
            arrayList.addAll(collection);
        }
        this.notifyDataSetChanged();
    }
}

