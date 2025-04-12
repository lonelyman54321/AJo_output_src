/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListView
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i;

public final class ExpandedMenuView
extends ListView
implements d$b,
i,
AdapterView.OnItemClickListener {
    public static final int[] b = new int[]{16842964, 16843049};
    public d a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet);
        boolean bl2;
        this.setOnItemClickListener(this);
        int[] nArray = b;
        object = Tn3.f((Context)object, attributeSet, nArray, n3, 0);
        attributeSet = ((Tn3)object).b;
        n3 = (int)(attributeSet.hasValue(0) ? 1 : 0);
        if (n3 != 0) {
            Drawable drawable2 = ((Tn3)object).b(0);
            this.setBackgroundDrawable(drawable2);
        }
        if (bl2 = attributeSet.hasValue(n3 = 1)) {
            attributeSet = ((Tn3)object).b(n3);
            this.setDivider((Drawable)attributeSet);
        }
        ((Tn3)object).g();
    }

    public final boolean b(f f5) {
        return this.a.performItemAction(f5, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void initialize(d d2) {
        this.a = d2;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView object, View view, int n3, long l2) {
        object = (f)this.getAdapter().getItem(n3);
        this.b((f)object);
    }
}

