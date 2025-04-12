/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView$LayoutParams
 *  android.widget.BaseAdapter
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.ActionBar$b;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.ScrollingTabContainerView$b;

public final class ScrollingTabContainerView$a
extends BaseAdapter {
    public final /* synthetic */ ScrollingTabContainerView a;

    public ScrollingTabContainerView$a(ScrollingTabContainerView scrollingTabContainerView) {
        this.a = scrollingTabContainerView;
    }

    public final int getCount() {
        return this.a.b.getChildCount();
    }

    public final Object getItem(int n3) {
        return ((ScrollingTabContainerView$b)this.a.b.getChildAt((int)n3)).a;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final View getView(int n3, View object, ViewGroup object2) {
        if (object == null) {
            ActionBar$b actionBar$b = (ActionBar$b)this.getItem(n3);
            object = this.a;
            object.getClass();
            Context context = object.getContext();
            object2 = new ScrollingTabContainerView$b((ScrollingTabContainerView)((Object)object), context, actionBar$b);
            n3 = 0;
            object2.setBackgroundDrawable(null);
            int n4 = -1;
            int n7 = ((ScrollingTabContainerView)((Object)object)).g;
            actionBar$b = new AbsListView.LayoutParams(n4, n7);
            object2.setLayoutParams((ViewGroup.LayoutParams)actionBar$b);
            object = object2;
        } else {
            ActionBar$b actionBar$b;
            object2 = object;
            object2 = (ScrollingTabContainerView$b)((Object)object);
            ((ScrollingTabContainerView$b)((Object)object2)).a = actionBar$b = (ActionBar$b)this.getItem(n3);
            ((ScrollingTabContainerView$b)((Object)object2)).a();
        }
        return object;
    }
}

