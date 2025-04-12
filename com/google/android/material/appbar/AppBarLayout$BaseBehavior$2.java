/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ScrollView
 */
package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

class AppBarLayout$BaseBehavior$2
extends a {
    final /* synthetic */ AppBarLayout$BaseBehavior this$0;
    final /* synthetic */ AppBarLayout val$appBarLayout;
    final /* synthetic */ CoordinatorLayout val$coordinatorLayout;

    public AppBarLayout$BaseBehavior$2(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.this$0 = appBarLayout$BaseBehavior;
        this.val$appBarLayout = appBarLayout;
        this.val$coordinatorLayout = coordinatorLayout;
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = ScrollView.class.getName();
        c2.l((CharSequence)object);
        object = this.val$appBarLayout;
        int n3 = ((AppBarLayout)object).getTotalScrollRange();
        if (n3 == 0) {
            return;
        }
        object = this.this$0;
        Object object2 = this.val$coordinatorLayout;
        if ((object = AppBarLayout$BaseBehavior.access$000((AppBarLayout$BaseBehavior)object, (CoordinatorLayout)object2)) == null) {
            return;
        }
        object2 = this.this$0;
        AppBarLayout appBarLayout = this.val$appBarLayout;
        int n4 = AppBarLayout$BaseBehavior.access$100((AppBarLayout$BaseBehavior)object2, appBarLayout);
        if (n4 == 0) {
            return;
        }
        object2 = this.this$0;
        n4 = ((AppBarLayout$BaseBehavior)object2).getTopBottomOffsetForScrollingSibling();
        appBarLayout = this.val$appBarLayout;
        int n7 = -appBarLayout.getTotalScrollRange();
        boolean bl2 = true;
        if (n4 != n7) {
            object2 = C2$a.j;
            c2.b((C2$a)object2);
            c2.r(bl2);
        }
        if ((n4 = ((AppBarLayout$BaseBehavior)(object2 = this.this$0)).getTopBottomOffsetForScrollingSibling()) != 0) {
            n4 = -1;
            n3 = (int)(object.canScrollVertically(n4) ? 1 : 0);
            if (n3 != 0) {
                object = this.val$appBarLayout;
                n3 = -((AppBarLayout)object).getDownNestedPreScrollRange();
                if (n3 != 0) {
                    object = C2$a.k;
                    c2.b((C2$a)object);
                    c2.r(bl2);
                }
            } else {
                object = C2$a.k;
                c2.b((C2$a)object);
                c2.r(bl2);
            }
        }
    }

    public boolean performAccessibilityAction(View object, int n3, Bundle bundle) {
        int n4 = 4096;
        boolean bl2 = true;
        if (n3 == n4) {
            this.val$appBarLayout.setExpanded(false);
            return bl2;
        }
        n4 = 8192;
        if (n3 == n4) {
            object = this.this$0;
            int n7 = ((AppBarLayout$BaseBehavior)object).getTopBottomOffsetForScrollingSibling();
            if (n7 != 0) {
                object = this.this$0;
                CoordinatorLayout coordinatorLayout = this.val$coordinatorLayout;
                View view = AppBarLayout$BaseBehavior.access$000((AppBarLayout$BaseBehavior)object, coordinatorLayout);
                n7 = (int)(view.canScrollVertically(-1) ? 1 : 0);
                if (n7 != 0) {
                    object = this.val$appBarLayout;
                    n7 = ((AppBarLayout)object).getDownNestedPreScrollRange();
                    int n8 = -n7;
                    if (n8 != 0) {
                        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.this$0;
                        CoordinatorLayout coordinatorLayout2 = this.val$coordinatorLayout;
                        AppBarLayout appBarLayout = this.val$appBarLayout;
                        int[] nArray = new int[]{0, 0};
                        appBarLayout$BaseBehavior.onNestedPreScroll(coordinatorLayout2, appBarLayout, view, 0, n8, nArray, 1);
                        return bl2;
                    }
                } else {
                    this.val$appBarLayout.setExpanded(bl2);
                    return bl2;
                }
            }
            return false;
        }
        return super.performAccessibilityAction((View)object, n3, bundle);
    }
}

