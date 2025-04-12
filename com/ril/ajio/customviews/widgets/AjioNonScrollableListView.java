/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ListView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.ril.ajio.R$styleable;

public class AjioNonScrollableListView
extends ListView {
    private ViewGroup footerViewGroup;
    private ViewGroup headerViewGroup;
    private int mFooterLayoutId;
    private int mHeaderLayoutId;

    public AjioNonScrollableListView(Context context) {
        super(context);
        int n3;
        this.mHeaderLayoutId = n3 = -1;
        this.mFooterLayoutId = n3;
        this.init(context, null);
    }

    public AjioNonScrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        this.mHeaderLayoutId = n3 = -1;
        this.mFooterLayoutId = n3;
        this.init(context, attributeSet);
    }

    public AjioNonScrollableListView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.mHeaderLayoutId = n3 = -1;
        this.mFooterLayoutId = n3;
        this.init(context, attributeSet);
    }

    public AjioNonScrollableListView(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        this.mHeaderLayoutId = n3 = -1;
        this.mFooterLayoutId = n3;
        this.init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        int[] nArray = R$styleable.AjioNonScrollableListView;
        context = context.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        int n3 = R$styleable.AjioNonScrollableListView_header_layout;
        int n4 = -1;
        this.mHeaderLayoutId = n3 = context.getResourceId(n3, n4);
        n3 = R$styleable.AjioNonScrollableListView_footer_layout;
        this.mFooterLayoutId = n3 = context.getResourceId(n3, n4);
        context.recycle();
    }

    public ViewGroup getFooter() {
        return this.footerViewGroup;
    }

    public ViewGroup getHeader() {
        return this.headerViewGroup;
    }

    public void onFinishInflate() {
        block29: {
            View view;
            int n3;
            boolean bl2;
            int n4;
            block28: {
                super.onFinishInflate();
                n4 = this.mHeaderLayoutId;
                bl2 = true;
                n3 = -1;
                if (n4 == n3) break block28;
                view = this.getRootView();
                view = view.getParent();
                n4 = view instanceof ViewGroup;
                if (n4 == 0) break block28;
                view = this.getContext();
                view = LayoutInflater.from((Context)view);
                int n7 = this.mHeaderLayoutId;
                View view2 = this.getRootView();
                view2 = view2.getParent();
                view2 = (ViewGroup)view2;
                view = view.inflate(n7, (ViewGroup)view2, bl2);
                n7 = view instanceof ViewGroup;
                if (n7 == 0) break block28;
                view = (ViewGroup)view;
                this.headerViewGroup = view;
                if (view == null) break block28;
                view.setVisibility(0);
                view = this.headerViewGroup;
                try {
                    this.addHeaderView(view);
                }
                catch (Resources.NotFoundException notFoundException) {
                    yn3_0.a((Exception)((Object)notFoundException));
                }
            }
            if ((n4 = this.mFooterLayoutId) == n3) break block29;
            view = this.getRootView();
            view = view.getParent();
            n4 = view instanceof ViewGroup;
            if (n4 == 0) break block29;
            view = this.getContext();
            view = LayoutInflater.from((Context)view);
            n3 = this.mFooterLayoutId;
            View view3 = this.getRootView();
            view3 = view3.getParent();
            view3 = (ViewGroup)view3;
            view = view.inflate(n3, (ViewGroup)view3, bl2);
            bl2 = view instanceof ViewGroup;
            if (!bl2) break block29;
            view = (ViewGroup)view;
            this.footerViewGroup = view;
            if (view == null) break block29;
            view.setVisibility(0);
            view = this.footerViewGroup;
            try {
                this.addFooterView(view);
            }
            catch (Resources.NotFoundException notFoundException) {
                yn3_0.a((Exception)((Object)notFoundException));
            }
        }
    }

    public void onMeasure(int n3, int n4) {
        int n7 = -1 << -1;
        n4 = View.MeasureSpec.makeMeasureSpec((int)(-1 >>> 3), (int)n7);
        super.onMeasure(n3, n4);
        cp$a cp$a = cp_1.Companion;
        n3 = (int)(km_1.b(cp$a) ? 1 : 0);
        if (n3 == 0) {
            cp$a = this.getLayoutParams();
            ((ViewGroup.LayoutParams)cp$a).height = n4 = this.getMeasuredHeight();
        }
    }
}

