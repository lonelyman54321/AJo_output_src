/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ConvenienceFeeDescLayoutBinding;
import com.ril.ajio.databinding.ConvenienceFeeInfoBottomSheetLayoutBinding;
import com.ril.ajio.databinding.EachConveniencePopupRowLayoutBinding;
import com.ril.ajio.databinding.TotalConvenienceLayoutBinding;

public class ConvenienceFeeInfoBottomSheetLayoutBindingImpl
extends ConvenienceFeeInfoBottomSheetLayoutBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.delivery_layout;
        sparseIntArray.put(n3, 2);
        n3 = R$id.platform_convenience_fee_layout;
        sparseIntArray.put(n3, 3);
        n3 = R$id.cod_fee_layout;
        sparseIntArray.put(n3, 4);
        n3 = R$id.priority_delivery_fee_layout;
        sparseIntArray.put(n3, 5);
        n3 = R$id.total_fee_layout;
        sparseIntArray.put(n3, 6);
        n3 = R$id.delivery_fee_desc_layout;
        sparseIntArray.put(n3, 7);
        n3 = R$id.pcf_fee_desc_layout;
        sparseIntArray.put(n3, 8);
        n3 = R$id.cod_fee_desc_layout;
        sparseIntArray.put(n3, 9);
        n3 = R$id.priority_delivery_fee_desc_layout;
        sparseIntArray.put(n3, 10);
        n3 = R$id.close_dialog;
        sparseIntArray.put(n3, 11);
        n3 = R$id.acc_page_name_lyt;
        sparseIntArray.put(n3, 12);
        n3 = R$id.top_title;
        sparseIntArray.put(n3, 13);
        n3 = R$id.convFeeValue;
        sparseIntArray.put(n3, 14);
        n3 = R$id.note_tv;
        sparseIntArray.put(n3, 15);
        n3 = R$id.policy_text;
        sparseIntArray.put(n3, 16);
        n3 = R$id.okay_btn;
        sparseIntArray.put(n3, 17);
    }

    public ConvenienceFeeInfoBottomSheetLayoutBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 18, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private ConvenienceFeeInfoBottomSheetLayoutBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object;
        Object object2 = this;
        Object object3 = object = objectArray[12];
        object3 = (View)object;
        Object object4 = object = objectArray[11];
        object4 = (AppCompatImageView)((Object)object);
        int n3 = 9;
        object = objectArray[n3];
        Object object5 = null;
        Object object6 = object != null ? (object = ConvenienceFeeDescLayoutBinding.bind((View)object)) : null;
        n3 = 4;
        object = objectArray[n3];
        Object object7 = object != null ? (object = EachConveniencePopupRowLayoutBinding.bind((View)object)) : null;
        Object object8 = object = objectArray[14];
        object8 = (AjioTextView)object;
        n3 = 7;
        object = objectArray[n3];
        Object object9 = object != null ? (object = ConvenienceFeeDescLayoutBinding.bind((View)object)) : null;
        n3 = 2;
        object = objectArray[n3];
        Object object10 = object != null ? (object = EachConveniencePopupRowLayoutBinding.bind((View)object)) : null;
        Object object11 = object = objectArray[15];
        object11 = (AjioTextView)object;
        Object object12 = object = objectArray[17];
        object12 = (AjioTextView)object;
        Object object13 = object = objectArray[0];
        object13 = (ConstraintLayout)((Object)object);
        Object object14 = object = objectArray[1];
        object14 = (LinearLayout)object;
        n3 = 8;
        object = objectArray[n3];
        Object object15 = object != null ? (object = ConvenienceFeeDescLayoutBinding.bind((View)object)) : null;
        n3 = 3;
        object = objectArray[n3];
        Object object16 = object != null ? (object = EachConveniencePopupRowLayoutBinding.bind((View)object)) : null;
        Object object17 = object = objectArray[16];
        object17 = (AjioTextView)object;
        n3 = 10;
        object = objectArray[n3];
        Object object18 = object != null ? (object = ConvenienceFeeDescLayoutBinding.bind((View)object)) : null;
        n3 = 5;
        object = objectArray[n3];
        Object object19 = object != null ? (object = EachConveniencePopupRowLayoutBinding.bind((View)object)) : null;
        Object object20 = object = objectArray[13];
        object20 = (AjioTextView)object;
        n3 = 6;
        object = objectArray[n3];
        Object object21 = object != null ? (object = TotalConvenienceLayoutBinding.bind((View)object)) : null;
        object = this;
        object5 = object14;
        object2 = object15;
        object14 = object16;
        object15 = object17;
        object16 = object18;
        object17 = object19;
        object18 = object20;
        object19 = object21;
        super(ai0_02, view, 0, (View)object3, (AppCompatImageView)((Object)object4), (ConvenienceFeeDescLayoutBinding)object6, (EachConveniencePopupRowLayoutBinding)object7, (AjioTextView)object8, (ConvenienceFeeDescLayoutBinding)object9, (EachConveniencePopupRowLayoutBinding)object10, (AjioTextView)object11, (AjioTextView)object12, (ConstraintLayout)((Object)object13), (LinearLayout)object5, (ConvenienceFeeDescLayoutBinding)object2, (EachConveniencePopupRowLayoutBinding)object14, (AjioTextView)object15, (ConvenienceFeeDescLayoutBinding)object16, (EachConveniencePopupRowLayoutBinding)object17, (AjioTextView)object20, (TotalConvenienceLayoutBinding)object21);
        this.mDirtyFlags = -1;
        this.parentLayout.setTag(null);
        this.parentSummaryLayout.setTag(null);
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

