/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 */
package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

public final class CardView$a
implements ML {
    public Drawable a;
    public final /* synthetic */ CardView b;

    public CardView$a(CardView cardView) {
        this.b = cardView;
    }

    public final void a(int n3, int n4, int n7, int n8) {
        CardView cardView = this.b;
        cardView.mShadowBounds.set(n3, n4, n7, n8);
        Rect rect = cardView.mContentPadding;
        int n10 = rect.left;
        n3 += n10;
        n10 = rect.top;
        n4 += n10;
        n10 = rect.right;
        int n14 = rect.bottom;
        CardView.access$001(cardView, n3, n4, n7 += n10, n8 += n14);
    }
}

