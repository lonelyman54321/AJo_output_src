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
import com.ril.ajio.databinding.ConvenienceFeeDescLayoutLuxeBinding;
import com.ril.ajio.databinding.ConvenienceFeeInfoBottomSheetLayoutLuxeBinding;
import com.ril.ajio.databinding.EachConveniencePopupRowLayoutLuxeBinding;
import com.ril.ajio.databinding.TotalConvenienceLayoutLuxeBinding;

public class ConvenienceFeeInfoBottomSheetLayoutLuxeBindingImpl
extends ConvenienceFeeInfoBottomSheetLayoutLuxeBinding {
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
        n3 = R$id.pd_fee_layout;
        sparseIntArray.put(n3, 4);
        n3 = R$id.cod_fee_layout;
        sparseIntArray.put(n3, 5);
        n3 = R$id.priority_delivery_fee_layout;
        sparseIntArray.put(n3, 6);
        n3 = R$id.total_fee_layout;
        sparseIntArray.put(n3, 7);
        n3 = R$id.delivery_fee_desc_layout;
        sparseIntArray.put(n3, 8);
        n3 = R$id.pcf_fee_desc_layout;
        sparseIntArray.put(n3, 9);
        n3 = R$id.cod_fee_desc_layout;
        sparseIntArray.put(n3, 10);
        n3 = R$id.priority_delivery_fee_desc_layout;
        sparseIntArray.put(n3, 11);
        n3 = R$id.close_dialog;
        sparseIntArray.put(n3, 12);
        n3 = R$id.acc_page_name_lyt;
        sparseIntArray.put(n3, 13);
        n3 = R$id.top_title;
        sparseIntArray.put(n3, 14);
        n3 = R$id.convFeeValue;
        sparseIntArray.put(n3, 15);
        n3 = R$id.note_tv;
        sparseIntArray.put(n3, 16);
        n3 = R$id.policy_text;
        sparseIntArray.put(n3, 17);
        n3 = R$id.okay_btn;
        sparseIntArray.put(n3, 18);
    }

    public ConvenienceFeeInfoBottomSheetLayoutLuxeBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 19, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private ConvenienceFeeInfoBottomSheetLayoutLuxeBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object;
        Object object2 = this;
        Object object3 = object = objectArray[13];
        object3 = (View)object;
        Object object4 = object = objectArray[12];
        object4 = (AppCompatImageView)((Object)object);
        int n3 = 10;
        object = objectArray[n3];
        Object object5 = null;
        Object object6 = object != null ? (object = ConvenienceFeeDescLayoutLuxeBinding.bind((View)object)) : null;
        n3 = 5;
        object = objectArray[n3];
        Object object7 = object != null ? (object = EachConveniencePopupRowLayoutLuxeBinding.bind((View)object)) : null;
        Object object8 = object = objectArray[15];
        object8 = (AjioTextView)object;
        n3 = 8;
        object = objectArray[n3];
        Object object9 = object != null ? (object = ConvenienceFeeDescLayoutLuxeBinding.bind((View)object)) : null;
        n3 = 2;
        object = objectArray[n3];
        Object object10 = object != null ? (object = EachConveniencePopupRowLayoutLuxeBinding.bind((View)object)) : null;
        Object object11 = object = objectArray[16];
        object11 = (AjioTextView)object;
        Object object12 = object = objectArray[18];
        object12 = (AjioTextView)object;
        Object object13 = object = objectArray[0];
        object13 = (ConstraintLayout)((Object)object);
        Object object14 = object = objectArray[1];
        object14 = (LinearLayout)object;
        n3 = 9;
        object = objectArray[n3];
        Object object15 = object != null ? (object = ConvenienceFeeDescLayoutLuxeBinding.bind((View)object)) : null;
        n3 = 4;
        object = objectArray[n3];
        Object object16 = object != null ? (object = EachConveniencePopupRowLayoutLuxeBinding.bind((View)object)) : null;
        n3 = 3;
        object = objectArray[n3];
        Object object17 = object != null ? (object = EachConveniencePopupRowLayoutLuxeBinding.bind((View)object)) : null;
        Object object18 = object = objectArray[17];
        object18 = (AjioTextView)object;
        n3 = 11;
        object = objectArray[n3];
        Object object19 = object != null ? (object = ConvenienceFeeDescLayoutLuxeBinding.bind((View)object)) : null;
        n3 = 6;
        object = objectArray[n3];
        Object object20 = object != null ? (object = EachConveniencePopupRowLayoutLuxeBinding.bind((View)object)) : null;
        Object object21 = object = objectArray[14];
        object21 = (AjioTextView)object;
        n3 = 7;
        object = objectArray[n3];
        Object object22 = object != null ? (object = TotalConvenienceLayoutLuxeBinding.bind((View)object)) : null;
        object = this;
        object5 = object14;
        object2 = object15;
        object14 = object16;
        object15 = object17;
        object16 = object18;
        object17 = object19;
        object18 = object20;
        object19 = object21;
        object20 = object22;
        super(ai0_02, view, 0, (View)object3, (AppCompatImageView)((Object)object4), (ConvenienceFeeDescLayoutLuxeBinding)object6, (EachConveniencePopupRowLayoutLuxeBinding)object7, (AjioTextView)object8, (ConvenienceFeeDescLayoutLuxeBinding)object9, (EachConveniencePopupRowLayoutLuxeBinding)object10, (AjioTextView)object11, (AjioTextView)object12, (ConstraintLayout)((Object)object13), (LinearLayout)object5, (ConvenienceFeeDescLayoutLuxeBinding)object2, (EachConveniencePopupRowLayoutLuxeBinding)object14, (EachConveniencePopupRowLayoutLuxeBinding)object15, (AjioTextView)object16, (ConvenienceFeeDescLayoutLuxeBinding)object17, (EachConveniencePopupRowLayoutLuxeBinding)object18, (AjioTextView)object21, (TotalConvenienceLayoutLuxeBinding)object22);
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

