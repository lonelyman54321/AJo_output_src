/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.databinding.RowAwAjioGiftBottomSheetBinding;

public class RowAwAjioGiftBottomSheetBindingImpl
extends RowAwAjioGiftBottomSheetBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.close_dialog;
        sparseIntArray.put(n3, 1);
        n3 = R$id.dlprLayoutContent;
        sparseIntArray.put(n3, 2);
        n3 = R$id.ag_dialog_title;
        sparseIntArray.put(n3, 3);
        n3 = R$id.ag_dialog_sub_title;
        sparseIntArray.put(n3, 4);
        n3 = R$id.ag_card_number_edit_text_input;
        sparseIntArray.put(n3, 5);
        n3 = R$id.ag_card_number_edit_text;
        sparseIntArray.put(n3, 6);
        n3 = R$id.ag_invalid_card_number_error;
        sparseIntArray.put(n3, 7);
        n3 = R$id.ag_pin_number_edit_text_input;
        sparseIntArray.put(n3, 8);
        n3 = R$id.ag_pin_number_edit_text;
        sparseIntArray.put(n3, 9);
        n3 = R$id.ag_invalid_pin_number_error;
        sparseIntArray.put(n3, 10);
        n3 = R$id.ag_error_message;
        sparseIntArray.put(n3, 11);
        n3 = R$id.ag_add_to_wallet;
        sparseIntArray.put(n3, 12);
        n3 = R$id.ag_gift_card_progress_bar;
        sparseIntArray.put(n3, 13);
    }

    public RowAwAjioGiftBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 14, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private RowAwAjioGiftBottomSheetBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object = this;
        TextView textView = (TextView)objectArray[12];
        TextInputEditText textInputEditText = (TextInputEditText)objectArray[6];
        TextInputLayout textInputLayout = (TextInputLayout)((Object)objectArray[5]);
        TextView textView2 = (TextView)objectArray[4];
        TextView textView3 = (TextView)objectArray[3];
        TextView textView4 = (TextView)objectArray[11];
        ProgressBar progressBar = (ProgressBar)objectArray[13];
        TextView textView5 = (TextView)objectArray[7];
        TextView textView6 = (TextView)objectArray[10];
        TextInputEditText textInputEditText2 = (TextInputEditText)objectArray[9];
        TextInputLayout textInputLayout2 = (TextInputLayout)((Object)objectArray[8]);
        AppCompatImageView appCompatImageView = (AppCompatImageView)((Object)objectArray[1]);
        ConstraintLayout constraintLayout = (ConstraintLayout)((Object)objectArray[2]);
        super(ai0_02, view, 0, textView, textInputEditText, textInputLayout, textView2, textView3, textView4, progressBar, textView5, textView6, textInputEditText2, textInputLayout2, appCompatImageView, constraintLayout);
        this.mDirtyFlags = -1;
        object = (ConstraintLayout)((Object)objectArray[0]);
        this.mboundView0 = object;
        object.setTag(null);
        object = view;
        this.setRootTag(view);
        this.invalidateAll();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void executeBindings() {
        synchronized (this) {
            long l2;
            this.mDirtyFlags = l2 = 0L;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean hasPendingBindings() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    long l2 = this.mDirtyFlags;
                    long l3 = 0L;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 != false) {
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void invalidateAll() {
        synchronized (this) {
            long l2;
            this.mDirtyFlags = l2 = 1L;
        }
        this.requestRebind();
    }

    public boolean onFieldChange(int n3, Object object, int n4) {
        return false;
    }

    public boolean setVariable(int n3, Object object) {
        return true;
    }
}

