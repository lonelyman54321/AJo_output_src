/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.CodFeeAjioLayoutBinding;

public class CodFeeAjioLayoutBindingImpl
extends CodFeeAjioLayoutBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.id_cod_close_dialog;
        sparseIntArray.put(n3, 1);
        n3 = R$id.id_cod_title;
        sparseIntArray.put(n3, 2);
        n3 = R$id.id_cod_sub_text;
        sparseIntArray.put(n3, 3);
        n3 = R$id.id_layout1;
        sparseIntArray.put(n3, 4);
        n3 = R$id.id_item_total;
        sparseIntArray.put(n3, 5);
        n3 = R$id.id_layout2;
        sparseIntArray.put(n3, 6);
        n3 = R$id.id_cash_on_delivery_fee_free;
        sparseIntArray.put(n3, 7);
        n3 = R$id.id_cash_on_delivery_fee;
        sparseIntArray.put(n3, 8);
        n3 = R$id.id_cash_on_delivery_fee_strike;
        sparseIntArray.put(n3, 9);
        n3 = R$id.id_layout3;
        sparseIntArray.put(n3, 10);
        n3 = R$id.id_amount_payable;
        sparseIntArray.put(n3, 11);
        n3 = R$id.id_cod_confirm_order;
        sparseIntArray.put(n3, 12);
        n3 = R$id.id_cod_choose_other_paymode;
        sparseIntArray.put(n3, 13);
    }

    public CodFeeAjioLayoutBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 14, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private CodFeeAjioLayoutBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object = this;
        AjioTextView ajioTextView = (AjioTextView)objectArray[11];
        AjioTextView ajioTextView2 = (AjioTextView)objectArray[8];
        AjioTextView ajioTextView3 = (AjioTextView)objectArray[7];
        AjioTextView ajioTextView4 = (AjioTextView)objectArray[9];
        TextView textView = (TextView)objectArray[13];
        AppCompatImageView appCompatImageView = (AppCompatImageView)((Object)objectArray[1]);
        TextView textView2 = (TextView)objectArray[12];
        TextView textView3 = (TextView)objectArray[3];
        TextView textView4 = (TextView)objectArray[2];
        TextView textView5 = (TextView)objectArray[5];
        LinearLayout linearLayout = (LinearLayout)objectArray[4];
        LinearLayout linearLayout2 = (LinearLayout)objectArray[6];
        LinearLayout linearLayout3 = (LinearLayout)objectArray[10];
        super(ai0_02, view, 0, ajioTextView, ajioTextView2, ajioTextView3, ajioTextView4, textView, appCompatImageView, textView2, textView3, textView4, textView5, linearLayout, linearLayout2, linearLayout3);
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

