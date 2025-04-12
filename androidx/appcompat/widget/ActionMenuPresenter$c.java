/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter$c$a;
import androidx.appcompat.widget.ActionMenuView$a;
import androidx.appcompat.widget.AppCompatImageView;

public final class ActionMenuPresenter$c
extends AppCompatImageView
implements ActionMenuView$a {
    public final /* synthetic */ ActionMenuPresenter a;

    public ActionMenuPresenter$c(ActionMenuPresenter object, Context context) {
        this.a = object;
        int n3 = R$attr.actionOverflowButtonStyle;
        super(context, null, n3);
        boolean bl2 = true;
        this.setClickable(bl2);
        this.setFocusable(bl2);
        this.setVisibility(0);
        this.setEnabled(bl2);
        object = this.getContentDescription();
        vo3_0.a((View)this, (CharSequence)object);
        object = new ActionMenuPresenter$c$a(this, (View)this);
        this.setOnTouchListener((View.OnTouchListener)object);
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final boolean performClick() {
        boolean bl2 = super.performClick();
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        this.playSoundEffect(0);
        this.a.e();
        return bl3;
    }

    public final boolean setFrame(int n3, int n4, int n7, int n8) {
        n3 = (int)(super.setFrame(n3, n4, n7, n8) ? 1 : 0);
        Drawable drawable2 = this.getDrawable();
        Drawable drawable3 = this.getBackground();
        if (drawable2 != null && drawable3 != null) {
            n4 = this.getWidth();
            n8 = this.getHeight();
            int n10 = Math.max(n4, n8) / 2;
            int n14 = this.getPaddingLeft();
            int n15 = this.getPaddingRight();
            n14 -= n15;
            n15 = this.getPaddingTop();
            int n16 = this.getPaddingBottom();
            n4 = (n4 + n14) / 2;
            n8 = (n8 + (n15 -= n16)) / 2;
            n14 = n4 - n10;
            n15 = n8 - n10;
            drawable3.setHotspotBounds(n14, n15, n4 += n10, n8 += n10);
        }
        return n3 != 0;
    }
}

