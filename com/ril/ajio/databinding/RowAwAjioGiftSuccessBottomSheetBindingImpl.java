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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.ril.ajio.R$id;
import com.ril.ajio.databinding.RowAwAjioGiftSuccessBottomSheetBinding;

public class RowAwAjioGiftSuccessBottomSheetBindingImpl
extends RowAwAjioGiftSuccessBottomSheetBinding {
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
        n3 = R$id.ag_success_icon;
        sparseIntArray.put(n3, 3);
        n3 = R$id.ag_success_title;
        sparseIntArray.put(n3, 4);
        n3 = R$id.ag_success_sub_title;
        sparseIntArray.put(n3, 5);
        n3 = R$id.ag_success_redeem_amount;
        sparseIntArray.put(n3, 6);
        n3 = R$id.ag_success_expires_date;
        sparseIntArray.put(n3, 7);
    }

    public RowAwAjioGiftSuccessBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 8, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private RowAwAjioGiftSuccessBottomSheetBindingImpl(ai0_0 object, View view, Object[] objectArray) {
        Object object2;
        Object object3 = object2 = objectArray[7];
        object3 = (AppCompatTextView)object2;
        Object object4 = object2 = objectArray[3];
        object4 = (AppCompatImageView)((Object)object2);
        Object object5 = object2 = objectArray[6];
        object5 = (AppCompatTextView)object2;
        Object object6 = object2 = objectArray[5];
        object6 = (AppCompatTextView)object2;
        Object object7 = object2 = objectArray[4];
        object7 = (AppCompatTextView)object2;
        Object object8 = object2 = objectArray[1];
        object8 = (AppCompatImageView)((Object)object2);
        Object object9 = object2 = objectArray[2];
        object9 = (ConstraintLayout)((Object)object2);
        super(object, view, 0, (AppCompatTextView)object3, (AppCompatImageView)((Object)object4), (AppCompatTextView)object5, (AppCompatTextView)object6, (AppCompatTextView)object7, (AppCompatImageView)((Object)object8), (ConstraintLayout)((Object)object9));
        this.mDirtyFlags = -1;
        object = (ConstraintLayout)((Object)objectArray[0]);
        this.mboundView0 = object;
        object.setTag(null);
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

