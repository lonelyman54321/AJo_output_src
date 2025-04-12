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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.databinding.RvpBottomSheetLayoutBinding;

public class RvpBottomSheetLayoutBindingImpl
extends RvpBottomSheetLayoutBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.rvp_close_dialog;
        sparseIntArray.put(n3, 1);
        n3 = R$id.parent_rvp_layout;
        sparseIntArray.put(n3, 2);
        n3 = R$id.rvp_layout_rv;
        sparseIntArray.put(n3, 3);
    }

    public RvpBottomSheetLayoutBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 4, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private RvpBottomSheetLayoutBindingImpl(ai0_0 object, View view, Object[] objectArray) {
        Object object2;
        Object object3 = object2 = objectArray[2];
        object3 = (ConstraintLayout)((Object)object2);
        Object object4 = object2 = objectArray[1];
        object4 = (AppCompatImageView)((Object)object2);
        Object object5 = object2 = objectArray[3];
        object5 = (RecyclerView)object2;
        super(object, view, 0, (ConstraintLayout)((Object)object3), (AppCompatImageView)((Object)object4), (RecyclerView)object5);
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

