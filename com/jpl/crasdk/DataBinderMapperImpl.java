/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 */
package com.jpl.crasdk;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl
extends Zh0 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray;
        a = sparseIntArray = new SparseIntArray(0);
    }

    public final List a() {
        ArrayList<androidx.databinding.library.baseAdapters.DataBinderMapperImpl> arrayList = new ArrayList<androidx.databinding.library.baseAdapters.DataBinderMapperImpl>(1);
        androidx.databinding.library.baseAdapters.DataBinderMapperImpl dataBinderMapperImpl = new androidx.databinding.library.baseAdapters.DataBinderMapperImpl();
        arrayList.add(dataBinderMapperImpl);
        return arrayList;
    }

    public final ViewDataBinding b(ai0_0 object, View view, int n3) {
        object = a;
        int n4 = object.get(n3);
        if (n4 > 0 && (object = view.getTag()) == null) {
            object = new RuntimeException("view must have a tag");
            throw object;
        }
        return null;
    }

    public final ViewDataBinding c(ai0_0 object, View[] viewArray, int n3) {
        int n4 = viewArray.length;
        if (n4 == 0) {
            return null;
        }
        object = a;
        n4 = object.get(n3);
        if (n4 > 0) {
            n4 = 0;
            object = viewArray[0].getTag();
            if (object == null) {
                object = new RuntimeException("view must have a tag");
                throw object;
            }
        }
        return null;
    }
}

