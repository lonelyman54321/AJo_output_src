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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.ril.ajio.R$id;
import com.ril.ajio.databinding.CancelRequestBottomSheetBinding;

public class CancelRequestBottomSheetBindingImpl
extends CancelRequestBottomSheetBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.dlprLayoutContent;
        sparseIntArray.put(n3, 1);
        n3 = R$id.id_cancel_request_text;
        sparseIntArray.put(n3, 2);
        n3 = R$id.id_no_button;
        sparseIntArray.put(n3, 3);
        n3 = R$id.guideline;
        sparseIntArray.put(n3, 4);
        n3 = R$id.id_yes_button;
        sparseIntArray.put(n3, 5);
    }

    public CancelRequestBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 6, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private CancelRequestBottomSheetBindingImpl(ai0_0 object, View view, Object[] objectArray) {
        Object object2;
        Object object3 = object2 = objectArray[1];
        object3 = (ConstraintLayout)((Object)object2);
        Object object4 = object2 = objectArray[4];
        object4 = (Guideline)((Object)object2);
        Object object5 = object2 = objectArray[2];
        object5 = (TextView)object2;
        Object object6 = object2 = objectArray[3];
        object6 = (TextView)object2;
        Object object7 = object2 = objectArray[5];
        object7 = (TextView)object2;
        super(object, view, 0, (ConstraintLayout)((Object)object3), (Guideline)((Object)object4), (TextView)object5, (TextView)object6, (TextView)object7);
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

