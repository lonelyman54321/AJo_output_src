/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.ScrollView
 *  android.widget.Space
 *  android.widget.TextView
 */
package com.ril.ajio.remoteconfig;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding$h;
import com.ril.ajio.remoteconfig.R$layout;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl
extends Zh0 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray;
        int n3 = 4;
        a = sparseIntArray = new SparseIntArray(n3);
        int n4 = R$layout.activity_config_edit;
        sparseIntArray.put(n4, 1);
        n4 = R$layout.content_config_edit;
        sparseIntArray.put(n4, 2);
        n4 = R$layout.fragment_config_editor;
        sparseIntArray.put(n4, 3);
        n4 = R$layout.list_item;
        sparseIntArray.put(n4, n3);
    }

    public final List a() {
        ArrayList<androidx.databinding.library.baseAdapters.DataBinderMapperImpl> arrayList = new ArrayList<androidx.databinding.library.baseAdapters.DataBinderMapperImpl>(1);
        androidx.databinding.library.baseAdapters.DataBinderMapperImpl dataBinderMapperImpl = new androidx.databinding.library.baseAdapters.DataBinderMapperImpl();
        arrayList.add(dataBinderMapperImpl);
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final ViewDataBinding b(ai0_0 object, View object2, int n3) {
        int n4;
        SparseIntArray sparseIntArray = a;
        if ((n4 = sparseIntArray.get(n4)) <= 0) return null;
        Object object3 = object2.getTag();
        if (object3 != null) {
            int n7 = 1;
            if (n4 != n7) {
                n7 = 2;
                if (n4 != n7) {
                    n7 = 3;
                    if (n4 != n7) {
                        n7 = 4;
                        if (n4 != n7) return null;
                        String string2 = "layout/list_item_0";
                        n4 = (int)(string2.equals(object3) ? 1 : 0);
                        if (n4 != 0) {
                            return new dv1_1((ai0_0)object, (View)object2);
                        }
                        String string3 = jk0_0.a(object3, "The tag for list_item is invalid. Received: ");
                        object = new IllegalArgumentException(string3);
                        throw object;
                    }
                    Object object4 = "layout/fragment_config_editor_0";
                    n4 = (int)(((String)object4).equals(object3) ? 1 : 0);
                    if (n4 != 0) {
                        SparseIntArray sparseIntArray2 = bw0_1.b;
                        Object[] objectArray = ViewDataBinding.mapBindings((ai0_0)object, object2, 9, null, sparseIntArray2);
                        Button button = (Button)objectArray[7];
                        EditText editText = (EditText)objectArray[5];
                        CardView cardView = (CardView)((Object)objectArray[4]);
                        Button button3 = (Button)objectArray[1];
                        button3 = (Button)objectArray[8];
                        Space space = (Space)objectArray[6];
                        TextView textView = (TextView)objectArray[3];
                        CardView cardView2 = (CardView)((Object)objectArray[2]);
                        object4 = new ViewDataBinding(object, (View)object2, 0);
                        ((bw0_1)object4).a = -1;
                        ((ScrollView)objectArray[0]).setTag(null);
                        ((ViewDataBinding)object4).setRootTag((View)object2);
                        ((bw0_1)object4).invalidateAll();
                        return object4;
                    }
                    String string4 = jk0_0.a(object3, "The tag for fragment_config_editor is invalid. Received: ");
                    object = new IllegalArgumentException(string4);
                    throw object;
                }
                String string5 = "layout/content_config_edit_0";
                n4 = (int)(string5.equals(object3) ? 1 : 0);
                if (n4 != 0) {
                    return new y60_0((ai0_0)object, (View)object2);
                }
                String string6 = jk0_0.a(object3, "The tag for content_config_edit is invalid. Received: ");
                object = new IllegalArgumentException(string6);
                throw object;
            }
            Object object5 = "layout/activity_config_edit_0";
            n4 = (int)(((String)object5).equals(object3) ? 1 : 0);
            if (n4 != 0) {
                ViewDataBinding$h viewDataBinding$h = i3_0.c;
                SparseIntArray sparseIntArray3 = i3_0.d;
                Object[] objectArray = ViewDataBinding.mapBindings((ai0_0)object, object2, 3, viewDataBinding$h, sparseIntArray3);
                x60_0 x60_02 = (x60_0)objectArray[1];
                Toolbar cfr_ignored_0 = (Toolbar)objectArray[2];
                object5 = new h3_0(object, (View)object2, x60_02);
                ((i3_0)object5).b = -1;
                object = ((h3_0)object5).a;
                ((ViewDataBinding)object5).setContainedBinding((ViewDataBinding)object);
                ((CoordinatorLayout)objectArray[0]).setTag(null);
                ((ViewDataBinding)object5).setRootTag((View)object2);
                ((i3_0)object5).invalidateAll();
                return object5;
            }
            String string7 = jk0_0.a(object3, "The tag for activity_config_edit is invalid. Received: ");
            object = new IllegalArgumentException(string7);
            throw object;
        }
        object = new RuntimeException("view must have a tag");
        throw object;
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

