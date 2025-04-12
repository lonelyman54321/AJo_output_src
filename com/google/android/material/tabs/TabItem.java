/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$styleable;

public class TabItem
extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context object, AttributeSet object2) {
        super((Context)object, object2);
        Object object3 = R$styleable.TabItem;
        object = Tn3.e((Context)object, object2, object3);
        int n3 = R$styleable.TabItem_android_text;
        object3 = ((Tn3)object).b;
        object2 = object3.getText(n3);
        this.text = object2;
        n3 = R$styleable.TabItem_android_icon;
        object2 = ((Tn3)object).b(n3);
        this.icon = object2;
        n3 = R$styleable.TabItem_android_layout;
        this.customLayout = n3 = object3.getResourceId(n3, 0);
        ((Tn3)object).g();
    }
}

