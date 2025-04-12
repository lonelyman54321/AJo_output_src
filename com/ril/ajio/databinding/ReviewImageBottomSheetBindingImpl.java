/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$id;
import com.ril.ajio.databinding.ReviewImageBottomSheetBinding;

public class ReviewImageBottomSheetBindingImpl
extends ReviewImageBottomSheetBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.id_review_image_close_dialog;
        sparseIntArray.put(n3, 1);
        n3 = R$id.layout_parent_review_image;
        sparseIntArray.put(n3, 2);
        n3 = R$id.layout_header_review_image;
        sparseIntArray.put(n3, 3);
        n3 = R$id.tv_review_title_date;
        sparseIntArray.put(n3, 4);
        n3 = R$id.cv_rating;
        sparseIntArray.put(n3, 5);
        n3 = R$id.layout_rating_parent;
        sparseIntArray.put(n3, 6);
        n3 = R$id.tv_rating_text;
        sparseIntArray.put(n3, 7);
        n3 = R$id.iv_rating;
        sparseIntArray.put(n3, 8);
        n3 = R$id.tv_review_text;
        sparseIntArray.put(n3, 9);
        n3 = R$id.tv_count;
        sparseIntArray.put(n3, 10);
        n3 = R$id.layout_review_image;
        sparseIntArray.put(n3, 11);
        n3 = R$id.vp_review_image;
        sparseIntArray.put(n3, 12);
        n3 = R$id.tv_error_msg;
        sparseIntArray.put(n3, 13);
        n3 = R$id.iv_prev;
        sparseIntArray.put(n3, 14);
        n3 = R$id.iv_next;
        sparseIntArray.put(n3, 15);
    }

    public ReviewImageBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 16, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private ReviewImageBottomSheetBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object = this;
        CardView cardView = (CardView)((Object)objectArray[5]);
        AppCompatImageView appCompatImageView = (AppCompatImageView)((Object)objectArray[1]);
        ImageView imageView = (ImageView)objectArray[15];
        ImageView imageView2 = (ImageView)objectArray[14];
        ImageView imageView3 = (ImageView)objectArray[8];
        ConstraintLayout constraintLayout = (ConstraintLayout)((Object)objectArray[3]);
        ConstraintLayout constraintLayout2 = (ConstraintLayout)((Object)objectArray[2]);
        ConstraintLayout constraintLayout3 = (ConstraintLayout)((Object)objectArray[6]);
        ConstraintLayout constraintLayout4 = (ConstraintLayout)((Object)objectArray[11]);
        TextView textView = (TextView)objectArray[10];
        TextView textView2 = (TextView)objectArray[13];
        TextView textView3 = (TextView)objectArray[7];
        TextView textView4 = (TextView)objectArray[9];
        TextView textView5 = (TextView)objectArray[4];
        ViewPager2 viewPager2 = (ViewPager2)((Object)objectArray[12]);
        super(ai0_02, view, 0, cardView, appCompatImageView, imageView, imageView2, imageView3, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, textView, textView2, textView3, textView4, textView5, viewPager2);
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

