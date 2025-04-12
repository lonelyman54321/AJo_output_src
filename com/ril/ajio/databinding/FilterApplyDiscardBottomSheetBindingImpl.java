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
import com.ril.ajio.databinding.FilterApplyDiscardBottomSheetBinding;

public class FilterApplyDiscardBottomSheetBindingImpl
extends FilterApplyDiscardBottomSheetBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.id_image_search_close_dialog;
        sparseIntArray.put(n3, 1);
        n3 = R$id.layout_parent_image_search;
        sparseIntArray.put(n3, 2);
        n3 = R$id.id_image_search_title;
        sparseIntArray.put(n3, 3);
        n3 = R$id.id_image_search_sub_text;
        sparseIntArray.put(n3, 4);
        n3 = R$id.layout_discard;
        sparseIntArray.put(n3, 5);
        n3 = R$id.layout_apply;
        sparseIntArray.put(n3, 6);
    }

    public FilterApplyDiscardBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 7, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private FilterApplyDiscardBottomSheetBindingImpl(ai0_0 ai0_02, View view, Object[] object) {
        Object object2;
        Object object3 = object2 = object[1];
        object3 = (AppCompatImageView)((Object)object2);
        Object object4 = object2 = object[4];
        object4 = (TextView)object2;
        Object object5 = object2 = object[3];
        object5 = (TextView)object2;
        Object object6 = object2 = object[6];
        object6 = (LinearLayout)object2;
        Object object7 = object2 = object[5];
        object7 = (LinearLayout)object2;
        Object object8 = object2 = object[2];
        object8 = (ConstraintLayout)((Object)object2);
        Object object9 = object = object[0];
        object9 = (ConstraintLayout)((Object)object);
        super(ai0_02, view, 0, (AppCompatImageView)((Object)object3), (TextView)object4, (TextView)object5, (LinearLayout)object6, (LinearLayout)object7, (ConstraintLayout)((Object)object8), (ConstraintLayout)((Object)object9));
        this.mDirtyFlags = -1;
        this.mainLyt.setTag(null);
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

