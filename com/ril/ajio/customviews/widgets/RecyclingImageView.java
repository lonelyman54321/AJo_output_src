/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.customviews.widgets.drawables.RecyclingBitmapDrawable;

public class RecyclingImageView
extends AppCompatImageView {
    private int currentPosition;

    public RecyclingImageView(Context context) {
        super(context);
    }

    public RecyclingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void notifyDrawable(Drawable object, boolean bl2) {
        int n3 = object instanceof RecyclingBitmapDrawable;
        if (n3 != 0) {
            object = (RecyclingBitmapDrawable)((Object)object);
            ((RecyclingBitmapDrawable)((Object)object)).setIsDisplayed(bl2);
        } else {
            n3 = object instanceof LayerDrawable;
            if (n3 != 0) {
                object = (LayerDrawable)object;
                n3 = object.getNumberOfLayers();
                for (int i3 = 0; i3 < n3; ++i3) {
                    Drawable drawable2 = object.getDrawable(i3);
                    RecyclingImageView.notifyDrawable(drawable2, bl2);
                }
            }
        }
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void onDetachedFromWindow() {
        this.setImageDrawable(null);
        super.onDetachedFromWindow();
    }

    public void setCurrentPosition(int n3) {
        this.currentPosition = n3;
    }

    public void setImageDrawable(Drawable drawable2) {
        Drawable drawable3 = this.getDrawable();
        super.setImageDrawable(drawable2);
        RecyclingImageView.notifyDrawable(drawable2, true);
        RecyclingImageView.notifyDrawable(drawable3, false);
    }
}

