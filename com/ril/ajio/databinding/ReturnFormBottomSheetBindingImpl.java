/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ReturnFormBottomSheetBinding;

public class ReturnFormBottomSheetBindingImpl
extends ReturnFormBottomSheetBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.id_image_search_close_dialog;
        sparseIntArray.put(n3, 1);
        n3 = R$id.layout_parent_image_search;
        sparseIntArray.put(n3, 2);
        n3 = R$id.layout_top;
        sparseIntArray.put(n3, 3);
        n3 = R$id.tv_header;
        sparseIntArray.put(n3, 4);
        n3 = R$id.layout_guideline_1;
        sparseIntArray.put(n3, 5);
        n3 = R$id.iv_guideline_1;
        sparseIntArray.put(n3, 6);
        n3 = R$id.tv_guideline_1_message;
        sparseIntArray.put(n3, 7);
        n3 = R$id.layout_guideline_2;
        sparseIntArray.put(n3, 8);
        n3 = R$id.tv_guideline_2_title;
        sparseIntArray.put(n3, 9);
        n3 = R$id.tv_guideline_2_message;
        sparseIntArray.put(n3, 10);
        n3 = R$id.layout_guideline_3;
        sparseIntArray.put(n3, 11);
        n3 = R$id.iv_guideline_3;
        sparseIntArray.put(n3, 12);
        n3 = R$id.tv_guideline_3_message;
        sparseIntArray.put(n3, 13);
        n3 = R$id.layout_guideline_4;
        sparseIntArray.put(n3, 14);
        n3 = R$id.tv_guideline_4;
        sparseIntArray.put(n3, 15);
        n3 = R$id.divider_1;
        sparseIntArray.put(n3, 16);
        n3 = R$id.tv_upload_title;
        sparseIntArray.put(n3, 17);
        n3 = R$id.tv_upload_sub_title;
        sparseIntArray.put(n3, 18);
        n3 = R$id.rvTakeImage;
        sparseIntArray.put(n3, 19);
        n3 = R$id.tvErrorImage;
        sparseIntArray.put(n3, 20);
        n3 = R$id.cv_parent_layout_footer;
        sparseIntArray.put(n3, 21);
        n3 = R$id.cb_guideline;
        sparseIntArray.put(n3, 22);
        n3 = R$id.tv_guideline_message;
        sparseIntArray.put(n3, 23);
        n3 = R$id.cv_layout_footer;
        sparseIntArray.put(n3, 24);
        n3 = R$id.cv_layout_upload;
        sparseIntArray.put(n3, 25);
        n3 = R$id.tv_upload_image;
        sparseIntArray.put(n3, 26);
    }

    public ReturnFormBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 27, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private ReturnFormBottomSheetBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object = this;
        AjioCircularImageView ajioCircularImageView = (AjioCircularImageView)((Object)objectArray[22]);
        CardView cardView = (CardView)((Object)objectArray[24]);
        CardView cardView2 = (CardView)((Object)objectArray[25]);
        CardView cardView3 = (CardView)((Object)objectArray[21]);
        View view2 = (View)objectArray[16];
        AppCompatImageView appCompatImageView = (AppCompatImageView)((Object)objectArray[1]);
        ImageView imageView = (ImageView)objectArray[6];
        ImageView imageView2 = (ImageView)objectArray[12];
        LinearLayout linearLayout = (LinearLayout)objectArray[5];
        LinearLayout linearLayout2 = (LinearLayout)objectArray[8];
        LinearLayout linearLayout3 = (LinearLayout)objectArray[11];
        LinearLayout linearLayout4 = (LinearLayout)objectArray[14];
        ConstraintLayout constraintLayout = (ConstraintLayout)((Object)objectArray[2]);
        ConstraintLayout constraintLayout2 = (ConstraintLayout)((Object)objectArray[3]);
        RecyclerView recyclerView = (RecyclerView)objectArray[19];
        AjioTextView ajioTextView = (AjioTextView)objectArray[20];
        TextView textView = (TextView)objectArray[7];
        TextView textView2 = (TextView)objectArray[10];
        TextView textView3 = (TextView)objectArray[9];
        TextView textView4 = (TextView)objectArray[13];
        TextView textView5 = (TextView)objectArray[15];
        TextView textView6 = (TextView)objectArray[23];
        TextView textView7 = (TextView)objectArray[4];
        TextView textView8 = (TextView)objectArray[26];
        TextView textView9 = (TextView)objectArray[18];
        TextView textView10 = (TextView)objectArray[17];
        super(ai0_02, view, 0, ajioCircularImageView, cardView, cardView2, cardView3, view2, appCompatImageView, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, constraintLayout, constraintLayout2, recyclerView, ajioTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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

