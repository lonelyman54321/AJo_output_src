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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.RowPdpImageTrustMarkerNewBinding;

public class RowPdpImageTrustMarkerNewBindingImpl
extends RowPdpImageTrustMarkerNewBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.view_line;
        sparseIntArray.put(n3, 1);
        n3 = R$id.trust_image_parent;
        sparseIntArray.put(n3, 2);
        n3 = R$id.constraint_view1;
        sparseIntArray.put(n3, 3);
        n3 = R$id.trust_image1;
        sparseIntArray.put(n3, 4);
        n3 = R$id.trust_content1;
        sparseIntArray.put(n3, 5);
        n3 = R$id.constraint_view2;
        sparseIntArray.put(n3, 6);
        n3 = R$id.trust_image2;
        sparseIntArray.put(n3, 7);
        n3 = R$id.trust_content2;
        sparseIntArray.put(n3, 8);
        n3 = R$id.constraint_view3;
        sparseIntArray.put(n3, 9);
        n3 = R$id.trust_image3;
        sparseIntArray.put(n3, 10);
        n3 = R$id.trust_content3;
        sparseIntArray.put(n3, 11);
    }

    public RowPdpImageTrustMarkerNewBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 12, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private RowPdpImageTrustMarkerNewBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object;
        Object object2 = object = objectArray[3];
        object2 = (ConstraintLayout)((Object)object);
        Object object3 = object = objectArray[6];
        object3 = (ConstraintLayout)((Object)object);
        Object object4 = object = objectArray[9];
        object4 = (ConstraintLayout)((Object)object);
        Object object5 = object = objectArray[5];
        object5 = (AjioTextView)object;
        Object object6 = object = objectArray[8];
        object6 = (AjioTextView)object;
        Object object7 = object = objectArray[11];
        object7 = (AjioTextView)object;
        Object object8 = object = objectArray[4];
        object8 = (AjioImageView)((Object)object);
        Object object9 = object = objectArray[7];
        object9 = (AjioImageView)((Object)object);
        Object object10 = object = objectArray[10];
        object10 = (AjioImageView)((Object)object);
        Object object11 = object = objectArray[2];
        object11 = (LinearLayout)object;
        Object object12 = object = objectArray[1];
        object12 = (View)object;
        object = this;
        super(ai0_02, view, 0, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioImageView)((Object)object8), (AjioImageView)((Object)object9), (AjioImageView)((Object)object10), (LinearLayout)object11, (View)object12);
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

