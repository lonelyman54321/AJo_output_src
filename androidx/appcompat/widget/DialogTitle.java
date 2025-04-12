/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Layout
 *  android.util.AttributeSet
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatTextView;

public class DialogTitle
extends AppCompatTextView {
    public DialogTitle(Context context) {
        super(context);
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        int n8;
        super.onMeasure(n3, n4);
        Layout layout2 = this.getLayout();
        if (layout2 != null && (n8 = layout2.getLineCount()) > 0 && (n7 = layout2.getEllipsisCount(n8 += -1)) > 0) {
            n7 = 0;
            layout2 = null;
            this.setSingleLine(false);
            n8 = 2;
            this.setMaxLines(n8);
            Context context = this.getContext();
            int[] nArray = R$styleable.TextAppearance;
            int n10 = 0x1010041;
            int n14 = 16973892;
            context = context.obtainStyledAttributes(null, nArray, n10, n14);
            int n15 = R$styleable.TextAppearance_android_textSize;
            n15 = context.getDimensionPixelSize(n15, 0);
            if (n15 != 0) {
                float f5 = n15;
                this.setTextSize(0, f5);
            }
            context.recycle();
            super.onMeasure(n3, n4);
        }
    }
}

