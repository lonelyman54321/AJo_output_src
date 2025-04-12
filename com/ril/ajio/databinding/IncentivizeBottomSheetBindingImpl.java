/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.IncentiviseSeekBarLayoutBinding;
import com.ril.ajio.databinding.IncentivizeBottomSheetBinding;

public class IncentivizeBottomSheetBindingImpl
extends IncentivizeBottomSheetBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.rvp_seek_bar_layout_view;
        sparseIntArray.put(n3, 2);
        n3 = R$id.close_dialog;
        sparseIntArray.put(n3, 3);
        n3 = R$id.dlprLayoutContent;
        sparseIntArray.put(n3, 4);
        n3 = R$id.id_title;
        sparseIntArray.put(n3, 5);
        n3 = R$id.lottie_animation;
        sparseIntArray.put(n3, 6);
        n3 = R$id.id_sub_title;
        sparseIntArray.put(n3, 7);
        n3 = R$id.returns_breakup_view;
        sparseIntArray.put(n3, 8);
        n3 = R$id.id_loss_text;
        sparseIntArray.put(n3, 9);
        n3 = R$id.guideline_1;
        sparseIntArray.put(n3, 10);
        n3 = R$id.cv_non_refund_fee;
        sparseIntArray.put(n3, 11);
        n3 = R$id.non_refundable_price;
        sparseIntArray.put(n3, 12);
        n3 = R$id.id_refundable_text;
        sparseIntArray.put(n3, 13);
        n3 = R$id.id_refundable_viewmore;
        sparseIntArray.put(n3, 14);
        n3 = R$id.cl_non_refund_fee_details;
        sparseIntArray.put(n3, 15);
        n3 = R$id.rv_non_refund;
        sparseIntArray.put(n3, 16);
        n3 = R$id.id_refundable_viewless;
        sparseIntArray.put(n3, 17);
        n3 = R$id.cl_discount_fee;
        sparseIntArray.put(n3, 18);
        n3 = R$id.tv_discount_price;
        sparseIntArray.put(n3, 19);
        n3 = R$id.tv_discount_text;
        sparseIntArray.put(n3, 20);
        n3 = R$id.id_discount_viewmore;
        sparseIntArray.put(n3, 21);
        n3 = R$id.cl_discount_fee_details;
        sparseIntArray.put(n3, 22);
        n3 = R$id.rv_discount_fee;
        sparseIntArray.put(n3, 23);
        n3 = R$id.id_discount_viewless;
        sparseIntArray.put(n3, 24);
        n3 = R$id.cl_horizental_refundable_fee_view;
        sparseIntArray.put(n3, 25);
        n3 = R$id.horizontal_refundable_price;
        sparseIntArray.put(n3, 26);
        n3 = R$id.horizontal_refundable_text;
        sparseIntArray.put(n3, 27);
        n3 = R$id.horizontal_viewmore;
        sparseIntArray.put(n3, 28);
        n3 = R$id.cl_horizental_refundable_details;
        sparseIntArray.put(n3, 29);
        n3 = R$id.rv_horizental_refundable_details;
        sparseIntArray.put(n3, 30);
        n3 = R$id.horizental_refundable_viewless;
        sparseIntArray.put(n3, 31);
        n3 = R$id.tv_consider_high;
        sparseIntArray.put(n3, 32);
        n3 = R$id.tv_per_product_return_fee;
        sparseIntArray.put(n3, 33);
        n3 = R$id.shimmer_view;
        sparseIntArray.put(n3, 34);
        n3 = R$id.view1;
        sparseIntArray.put(n3, 35);
        n3 = R$id.view2;
        sparseIntArray.put(n3, 36);
        n3 = R$id.view3;
        sparseIntArray.put(n3, 37);
        n3 = R$id.view4;
        sparseIntArray.put(n3, 38);
        n3 = R$id.view5;
        sparseIntArray.put(n3, 39);
        n3 = R$id.cl_return_fee_layout;
        sparseIntArray.put(n3, 40);
        n3 = R$id.tv_return_fee_title;
        sparseIntArray.put(n3, 41);
        n3 = R$id.tv_return_fee_desc;
        sparseIntArray.put(n3, 42);
        n3 = R$id.barrier_buttons;
        sparseIntArray.put(n3, 43);
        n3 = R$id.tv_proceed_return;
        sparseIntArray.put(n3, 44);
        n3 = R$id.tv_proceed_exchange;
        sparseIntArray.put(n3, 45);
    }

    public IncentivizeBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 46, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private IncentivizeBottomSheetBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object;
        Object object2 = this;
        Object object3 = object = objectArray[43];
        object3 = (Barrier)((Object)object);
        Object object4 = object = objectArray[18];
        object4 = (ConstraintLayout)((Object)object);
        Object object5 = object = objectArray[22];
        object5 = (ConstraintLayout)((Object)object);
        Object object6 = object = objectArray[29];
        object6 = (ConstraintLayout)((Object)object);
        Object object7 = object = objectArray[25];
        object7 = (ConstraintLayout)((Object)object);
        Object object8 = object = objectArray[15];
        object8 = (ConstraintLayout)((Object)object);
        Object object9 = object = objectArray[40];
        object9 = (ConstraintLayout)((Object)object);
        Object object10 = object = objectArray[1];
        object10 = (ConstraintLayout)((Object)object);
        Object object11 = object = objectArray[3];
        object11 = (AppCompatImageView)((Object)object);
        Object object12 = object = objectArray[11];
        object12 = (ConstraintLayout)((Object)object);
        Object object13 = object = objectArray[4];
        object13 = (ConstraintLayout)((Object)object);
        Object object14 = object = objectArray[10];
        object14 = (Guideline)((Object)object);
        Object object15 = object = objectArray[31];
        object15 = (AjioTextView)object;
        Object object16 = object = objectArray[26];
        object16 = (AjioTextView)object;
        Object object17 = object = objectArray[27];
        object17 = (AjioTextView)object;
        Object object18 = object = objectArray[28];
        object18 = (AjioTextView)object;
        Object object19 = object = objectArray[24];
        object19 = (AjioTextView)object;
        Object object20 = object = objectArray[21];
        object20 = (AjioTextView)object;
        Object object21 = object = objectArray[9];
        object21 = (AjioTextView)object;
        Object object22 = object = objectArray[13];
        object22 = (AjioTextView)object;
        Object object23 = object = objectArray[17];
        object23 = (AjioTextView)object;
        Object object24 = object = objectArray[14];
        object24 = (AjioTextView)object;
        Object object25 = object = objectArray[7];
        object25 = (AjioTextView)object;
        Object object26 = object = objectArray[5];
        object26 = (AjioTextView)object;
        Object object27 = object = objectArray[6];
        object27 = (LottieAnimationView)((Object)object);
        Object object28 = object = objectArray[12];
        object28 = (AjioTextView)object;
        Object object29 = object = objectArray[8];
        object29 = (CardView)((Object)object);
        Object object30 = object = objectArray[23];
        object30 = (RecyclerView)object;
        Object object31 = object = objectArray[30];
        object31 = (RecyclerView)object;
        Object object32 = object = objectArray[16];
        object32 = (RecyclerView)object;
        int n3 = 2;
        object = objectArray[n3];
        Object object33 = object != null ? (object = IncentiviseSeekBarLayoutBinding.bind((View)object)) : null;
        Object object34 = object = objectArray[34];
        object34 = (ShimmerFrameLayout)((Object)object);
        Object object35 = object = objectArray[32];
        object35 = (AjioTextView)object;
        Object object36 = object = objectArray[19];
        object36 = (AjioTextView)object;
        Object object37 = object = objectArray[20];
        object37 = (AjioTextView)object;
        Object object38 = object = objectArray[33];
        object38 = (AjioTextView)object;
        Object object39 = object = objectArray[45];
        object39 = (AjioTextView)object;
        Object object40 = object = objectArray[44];
        object40 = (AjioTextView)object;
        Object object41 = object = objectArray[42];
        object41 = (AjioTextView)object;
        Object object42 = object = objectArray[41];
        object42 = (AjioTextView)object;
        Object object43 = object = objectArray[35];
        object43 = (View)object;
        Object object44 = object = objectArray[36];
        object44 = (View)object;
        Object object45 = object = objectArray[37];
        object45 = (View)object;
        Object object46 = object = objectArray[38];
        object46 = (View)object;
        Object object47 = object = objectArray[39];
        object47 = (View)object;
        object = this;
        object2 = object14;
        object14 = object15;
        object15 = object16;
        object16 = object17;
        object17 = object18;
        object18 = object19;
        object19 = object20;
        object20 = object21;
        object21 = object22;
        object22 = object23;
        object23 = object24;
        object24 = object25;
        object25 = object26;
        object26 = object27;
        object27 = object28;
        object28 = object29;
        object29 = object30;
        object30 = object31;
        object31 = object32;
        object32 = object33;
        super(ai0_02, view, 0, (Barrier)((Object)object3), (ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object5), (ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object7), (ConstraintLayout)((Object)object8), (ConstraintLayout)((Object)object9), (ConstraintLayout)((Object)object10), (AppCompatImageView)((Object)object11), (ConstraintLayout)((Object)object12), (ConstraintLayout)((Object)object13), (Guideline)((Object)object2), (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20, (AjioTextView)object21, (AjioTextView)object22, (AjioTextView)object23, (AjioTextView)object24, (AjioTextView)object25, (LottieAnimationView)((Object)object26), (AjioTextView)object27, (CardView)((Object)object28), (RecyclerView)object29, (RecyclerView)object30, (RecyclerView)object31, (IncentiviseSeekBarLayoutBinding)object33, (ShimmerFrameLayout)((Object)object34), (AjioTextView)object35, (AjioTextView)object36, (AjioTextView)object37, (AjioTextView)object38, (AjioTextView)object39, (AjioTextView)object40, (AjioTextView)object41, (AjioTextView)object42, (View)object43, (View)object44, (View)object45, (View)object46, (View)object47);
        this.mDirtyFlags = -1;
        this.clSeekBarLayout.setTag(null);
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

