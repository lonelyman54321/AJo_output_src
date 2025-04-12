/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.RowAjioGwpBottomSheetLuxeBinding;

public class RowAjioGwpBottomSheetLuxeBindingImpl
extends RowAjioGwpBottomSheetLuxeBinding {
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
        n3 = R$id.id_cart_gwp_img;
        sparseIntArray.put(n3, 3);
        n3 = R$id.id_cart_gwp_title;
        sparseIntArray.put(n3, 4);
        n3 = R$id.id_constraint_gwp_list;
        sparseIntArray.put(n3, 5);
        n3 = R$id.id_cart_gwp_list;
        sparseIntArray.put(n3, 6);
        n3 = R$id.id_combo_root_view;
        sparseIntArray.put(n3, 7);
        n3 = R$id.id_cart_gwp_combo;
        sparseIntArray.put(n3, 8);
        n3 = R$id.id_cart_gwp_combo_list;
        sparseIntArray.put(n3, 9);
    }

    public RowAjioGwpBottomSheetLuxeBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 10, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private RowAjioGwpBottomSheetLuxeBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object;
        Object object2 = object = objectArray[1];
        object2 = (AppCompatImageView)((Object)object);
        Object object3 = object = objectArray[2];
        object3 = (ConstraintLayout)((Object)object);
        Object object4 = object = objectArray[8];
        object4 = (AjioTextView)object;
        Object object5 = object = objectArray[9];
        object5 = (RecyclerView)object;
        Object object6 = object = objectArray[3];
        object6 = (ImageView)object;
        Object object7 = object = objectArray[6];
        object7 = (RecyclerView)object;
        Object object8 = object = objectArray[4];
        object8 = (AjioTextView)object;
        Object object9 = object = objectArray[7];
        object9 = (ConstraintLayout)((Object)object);
        Object object10 = object = objectArray[5];
        object10 = (ConstraintLayout)((Object)object);
        object = this;
        super(ai0_02, view, 0, (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (RecyclerView)object5, (ImageView)object6, (RecyclerView)object7, (AjioTextView)object8, (ConstraintLayout)((Object)object9), (ConstraintLayout)((Object)object10));
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

