/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ListView
 */
package androidx.appcompat.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import androidx.appcompat.R$styleable;

public class AlertController$RecycleListView
extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        int[] nArray = R$styleable.RecycleListView;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        int n4 = R$styleable.RecycleListView_paddingBottomNoButtons;
        int n7 = -1;
        this.b = n4 = context.getDimensionPixelOffset(n4, n7);
        n4 = R$styleable.RecycleListView_paddingTopNoTitle;
        this.a = n3 = context.getDimensionPixelOffset(n4, n7);
    }

    /*
     * WARNING - void declaration
     */
    public void setHasDecor(boolean bl2, boolean bl3) {
        void var2_5;
        if (var2_5 == false || !bl2) {
            void var2_8;
            void var1_4;
            int n3 = this.getPaddingLeft();
            if (bl2) {
                int n4 = this.getPaddingTop();
            } else {
                int n7 = this.a;
            }
            int n8 = this.getPaddingRight();
            if (var2_5 != false) {
                int n10 = this.getPaddingBottom();
            } else {
                int n14 = this.b;
            }
            this.setPadding(n3, (int)var1_4, n8, (int)var2_8);
        }
    }
}

