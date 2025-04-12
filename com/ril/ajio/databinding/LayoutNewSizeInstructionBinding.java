/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutNewSizeInstructionBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final TextView tvCount;
    public final TextView tvInstructionSize;
    public final TextView tvInstructionTitle;

    private LayoutNewSizeInstructionBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.tvCount = textView;
        this.tvInstructionSize = textView2;
        this.tvInstructionTitle = textView3;
    }

    public static LayoutNewSizeInstructionBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.tv_count;
        TextView textView3 = (TextView)dd2_2.a(n3, object);
        if (textView3 != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.tv_instruction_size, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.tv_instruction_title, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutNewSizeInstructionBinding layoutNewSizeInstructionBinding = new LayoutNewSizeInstructionBinding((ConstraintLayout)((Object)object), textView3, textView2, textView);
            return layoutNewSizeInstructionBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutNewSizeInstructionBinding inflate(LayoutInflater layoutInflater) {
        return LayoutNewSizeInstructionBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutNewSizeInstructionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_new_size_instruction;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutNewSizeInstructionBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

