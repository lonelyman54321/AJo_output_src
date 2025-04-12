/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.Checkable
 */
package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.internal.CheckableImageButton$SavedState;

public class CheckableImageButton
extends AppCompatImageButton
implements Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED = new int[]{0x10100A0};
    private boolean checkable;
    private boolean checked;
    private boolean pressable;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.imageButtonStyle;
        this(context, attributeSet, n3);
    }

    public CheckableImageButton(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        boolean bl2;
        this.checkable = bl2 = true;
        this.pressable = bl2;
        super(this);
        ViewCompat.s((View)this, (a)object);
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isPressable() {
        return this.pressable;
    }

    public int[] onCreateDrawableState(int n3) {
        boolean bl2 = this.checked;
        if (bl2) {
            int[] nArray = DRAWABLE_STATE_CHECKED;
            int n4 = nArray.length;
            return View.mergeDrawableStates((int[])super.onCreateDrawableState(n3 += n4), (int[])nArray);
        }
        return super.onCreateDrawableState(n3);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof CheckableImageButton$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (CheckableImageButton$SavedState)parcelable;
        Parcelable parcelable2 = parcelable.getSuperState();
        super.onRestoreInstanceState(parcelable2);
        boolean bl3 = parcelable.checked;
        this.setChecked(bl3);
    }

    public Parcelable onSaveInstanceState() {
        boolean bl2;
        Parcelable parcelable = super.onSaveInstanceState();
        CheckableImageButton$SavedState checkableImageButton$SavedState = new CheckableImageButton$SavedState(parcelable);
        checkableImageButton$SavedState.checked = bl2 = this.checked;
        return checkableImageButton$SavedState;
    }

    public void setCheckable(boolean bl2) {
        boolean bl3 = this.checkable;
        if (bl3 != bl2) {
            this.checkable = bl2;
            bl2 = false;
            this.sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean bl2) {
        boolean bl3 = this.checkable;
        if (bl3 && (bl3 = this.checked) != bl2) {
            this.checked = bl2;
            this.refreshDrawableState();
            int n3 = 2048;
            this.sendAccessibilityEvent(n3);
        }
    }

    public void setPressable(boolean bl2) {
        this.pressable = bl2;
    }

    public void setPressed(boolean bl2) {
        boolean bl3 = this.pressable;
        if (bl3) {
            super.setPressed(bl2);
        }
    }

    public void toggle() {
        boolean bl2 = this.checked ^ true;
        this.setChecked(bl2);
    }
}

