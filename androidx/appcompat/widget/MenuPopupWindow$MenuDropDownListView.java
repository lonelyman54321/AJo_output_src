/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.HeaderViewListAdapter
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.DropDownListView;

public class MenuPopupWindow$MenuDropDownListView
extends DropDownListView {
    public final int m;
    public final int n;
    public bo1_0 o;
    public f p;

    public MenuPopupWindow$MenuDropDownListView(Context context, boolean n3) {
        super(context, n3 != 0);
        context = context.getResources().getConfiguration();
        n3 = 1;
        int n4 = context.getLayoutDirection();
        int n7 = 22;
        int n8 = 21;
        if (n3 == n4) {
            this.m = n8;
            this.n = n7;
        } else {
            this.m = n7;
            this.n = n8;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final boolean onHoverEvent(MotionEvent var1_1) {
        block7: {
            var2_2 = this.o;
            if (var2_2 == null) break block7;
            var2_2 = this.getAdapter();
            var3_3 = var2_2 instanceof HeaderViewListAdapter;
            if (var3_3 != 0) {
                var2_2 = (HeaderViewListAdapter)var2_2;
                var3_3 = var2_2.getHeadersCount();
                var2_2 = (c)var2_2.getWrappedAdapter();
            } else {
                var2_2 = (c)var2_2;
                var3_3 = 0;
                var4_4 = null;
            }
            var5_5 = var1_1.getAction();
            var6_6 = 10;
            if (var5_5 == var6_6) ** GOTO lbl-1000
            var7_7 = var1_1.getX();
            var5_5 = (int)var7_7;
            var6_6 = (int)var1_1.getY();
            if ((var5_5 = this.pointToPosition(var5_5, var6_6)) != (var6_6 = -1) && (var5_5 -= var3_3) >= 0 && var5_5 < (var3_3 = var2_2.getCount())) {
                var4_4 = var2_2.c(var5_5);
            } else lbl-1000:
            // 2 sources

            {
                var3_3 = 0;
                var4_4 = null;
            }
            var8_8 = this.p;
            if (var8_8 != var4_4) {
                var2_2 = var2_2.a;
                if (var8_8 != null) {
                    var9_9 = this.o;
                    var9_9.l((d)var2_2, (f)var8_8);
                }
                this.p = var4_4;
                if (var4_4 != null) {
                    var8_8 = this.o;
                    var8_8.c((d)var2_2, var4_4);
                }
            }
        }
        return super.onHoverEvent(var1_1);
    }

    public final boolean onKeyDown(int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        ListMenuItemView listMenuItemView = (ListMenuItemView)this.getSelectedView();
        boolean bl2 = true;
        if (listMenuItemView != null && n3 == (n7 = this.m)) {
            f f5;
            n3 = (int)(listMenuItemView.isEnabled() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)((f5 = listMenuItemView.getItemData()).hasSubMenu() ? 1 : 0)) != 0) {
                n3 = this.getSelectedItemPosition();
                long l2 = this.getSelectedItemId();
                this.performItemClick((View)listMenuItemView, n3, l2);
            }
            return bl2;
        }
        if (listMenuItemView != null && n3 == (n4 = this.n)) {
            n3 = -1;
            this.setSelection(n3);
            Object object = this.getAdapter();
            boolean bl3 = object instanceof HeaderViewListAdapter;
            object = bl3 ? (c)((HeaderViewListAdapter)object).getWrappedAdapter() : (c)((Object)object);
            object.a.close(false);
            return bl2;
        }
        return super.onKeyDown(n3, keyEvent);
    }

    public void setHoverListener(bo1_0 bo1_02) {
        this.o = bo1_02;
    }
}

