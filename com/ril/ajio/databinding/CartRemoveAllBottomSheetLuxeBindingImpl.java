/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.databinding.CartRemoveAllBottomSheetLuxeBinding;

public class CartRemoveAllBottomSheetLuxeBindingImpl
extends CartRemoveAllBottomSheetLuxeBinding {
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
        n3 = R$id.ag_dialog_title;
        sparseIntArray.put(n3, 3);
        n3 = R$id.oosRv;
        sparseIntArray.put(n3, 4);
        n3 = R$id.cart_remove_all;
        sparseIntArray.put(n3, 5);
        n3 = R$id.cart_move_wishlist_all;
        sparseIntArray.put(n3, 6);
        n3 = R$id.removeCartItemProgress;
        sparseIntArray.put(n3, 7);
    }

    public CartRemoveAllBottomSheetLuxeBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 8, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private CartRemoveAllBottomSheetLuxeBindingImpl(ai0_0 object, View view, Object[] objectArray) {
        Object object2;
        Object object3 = object2 = objectArray[3];
        object3 = (TextView)object2;
        Object object4 = object2 = objectArray[6];
        object4 = (TextView)object2;
        Object object5 = object2 = objectArray[5];
        object5 = (TextView)object2;
        Object object6 = object2 = objectArray[1];
        object6 = (AppCompatImageView)((Object)object2);
        Object object7 = object2 = objectArray[2];
        object7 = (ConstraintLayout)((Object)object2);
        Object object8 = object2 = objectArray[4];
        object8 = (RecyclerView)object2;
        Object object9 = object2 = objectArray[7];
        object9 = (AjioLoaderView)((Object)object2);
        super(object, view, 0, (TextView)object3, (TextView)object4, (TextView)object5, (AppCompatImageView)((Object)object6), (ConstraintLayout)((Object)object7), (RecyclerView)object8, (AjioLoaderView)((Object)object9));
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

