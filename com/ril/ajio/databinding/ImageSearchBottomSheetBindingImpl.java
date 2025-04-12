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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.ril.ajio.R$id;
import com.ril.ajio.databinding.ImageSearchBottomSheetBinding;

public class ImageSearchBottomSheetBindingImpl
extends ImageSearchBottomSheetBinding {
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
        n3 = R$id.viewTop;
        sparseIntArray.put(n3, 3);
        n3 = R$id.imageView2;
        sparseIntArray.put(n3, 4);
        n3 = R$id.img_heading;
        sparseIntArray.put(n3, 5);
        n3 = R$id.img_heading2;
        sparseIntArray.put(n3, 6);
        n3 = R$id.id_image_search_title;
        sparseIntArray.put(n3, 7);
        n3 = R$id.layout_click_photo;
        sparseIntArray.put(n3, 8);
        n3 = R$id.layout_upload_photo;
        sparseIntArray.put(n3, 9);
    }

    public ImageSearchBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 10, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private ImageSearchBottomSheetBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        Object object;
        Object object2 = object = objectArray[1];
        object2 = (AppCompatImageView)((Object)object);
        Object object3 = object = objectArray[7];
        object3 = (TextView)object;
        Object object4 = object = objectArray[4];
        object4 = (ImageView)object;
        Object object5 = object = objectArray[5];
        object5 = (TextView)object;
        Object object6 = object = objectArray[6];
        object6 = (TextView)object;
        Object object7 = object = objectArray[8];
        object7 = (LinearLayout)object;
        Object object8 = object = objectArray[2];
        object8 = (ConstraintLayout)((Object)object);
        Object object9 = object = objectArray[9];
        object9 = (LinearLayout)object;
        Object object10 = object = objectArray[3];
        object10 = (View)object;
        object = this;
        super(ai0_02, view, 0, (AppCompatImageView)((Object)object2), (TextView)object3, (ImageView)object4, (TextView)object5, (TextView)object6, (LinearLayout)object7, (ConstraintLayout)((Object)object8), (LinearLayout)object9, (View)object10);
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

