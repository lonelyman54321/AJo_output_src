/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.RtoBottomSheetBinding;

public class RtoBottomSheetBindingImpl
extends RtoBottomSheetBinding {
    private static final ViewDataBinding$h sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray;
        sViewsWithIds = sparseIntArray = new SparseIntArray();
        int n3 = R$id.ivClose;
        sparseIntArray.put(n3, 1);
        n3 = R$id.tvTitle;
        sparseIntArray.put(n3, 2);
        n3 = R$id.tvDescription;
        sparseIntArray.put(n3, 3);
        n3 = R$id.rvProductImages;
        sparseIntArray.put(n3, 4);
        n3 = R$id.tvReason;
        sparseIntArray.put(n3, 5);
        n3 = R$id.rvReasons;
        sparseIntArray.put(n3, 6);
        n3 = R$id.tvError;
        sparseIntArray.put(n3, 7);
        n3 = R$id.txtSubmit;
        sparseIntArray.put(n3, 8);
        n3 = R$id.layoutReason;
        sparseIntArray.put(n3, 9);
        n3 = R$id.editReason;
        sparseIntArray.put(n3, 10);
        n3 = R$id.tvCount;
        sparseIntArray.put(n3, 11);
        n3 = R$id.layoutSuccess;
        sparseIntArray.put(n3, 12);
        n3 = R$id.imgSuccess;
        sparseIntArray.put(n3, 13);
        n3 = R$id.txtSuccess;
        sparseIntArray.put(n3, 14);
    }

    public RtoBottomSheetBindingImpl(ai0_0 ai0_02, View view) {
        Object[] objectArray = sIncludes;
        SparseIntArray sparseIntArray = sViewsWithIds;
        objectArray = ViewDataBinding.mapBindings(ai0_02, view, 15, (ViewDataBinding$h)objectArray, sparseIntArray);
        this(ai0_02, view, objectArray);
    }

    private RtoBottomSheetBindingImpl(ai0_0 ai0_02, View view, Object[] objectArray) {
        EditText editText = (EditText)objectArray[10];
        ImageView imageView = (ImageView)objectArray[13];
        ImageView imageView2 = (ImageView)objectArray[1];
        ConstraintLayout constraintLayout = (ConstraintLayout)((Object)objectArray[9]);
        ConstraintLayout constraintLayout2 = (ConstraintLayout)((Object)objectArray[12]);
        RecyclerView recyclerView = (RecyclerView)objectArray[4];
        RecyclerView recyclerView2 = (RecyclerView)objectArray[6];
        NestedScrollView nestedScrollView = (NestedScrollView)objectArray[0];
        TextView textView = (TextView)objectArray[11];
        TextView textView2 = (TextView)objectArray[3];
        TextView textView3 = (TextView)objectArray[7];
        TextView textView4 = (TextView)objectArray[5];
        TextView textView5 = (TextView)objectArray[2];
        AjioTextView ajioTextView = (AjioTextView)objectArray[8];
        TextView textView6 = (TextView)objectArray[14];
        super(ai0_02, view, 0, editText, imageView, imageView2, constraintLayout, constraintLayout2, recyclerView, recyclerView2, nestedScrollView, textView, textView2, textView3, textView4, textView5, ajioTextView, textView6);
        this.mDirtyFlags = -1;
        this.scrollRto.setTag(null);
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

