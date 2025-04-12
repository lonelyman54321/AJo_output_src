/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.progressindicator.IndeterminateAnimatorDelegate;
import com.google.android.material.progressindicator.IndeterminateDrawable;
import com.google.android.material.progressindicator.LinearDrawingDelegate;
import com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

public class LinearProgressIndicator
extends BaseProgressIndicator {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_LinearProgressIndicator;
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.linearProgressIndicatorStyle;
        this(context, attributeSet, n3);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int n3) {
        int n4 = DEF_STYLE_RES;
        super(context, attributeSet, n3, n4);
        this.initializeDrawables();
    }

    private void initializeDrawables() {
        Object object = (LinearProgressIndicatorSpec)this.spec;
        Object object2 = new LinearDrawingDelegate((LinearProgressIndicatorSpec)object);
        object = this.getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
        object = IndeterminateDrawable.createLinearDrawable((Context)object, linearProgressIndicatorSpec, object2);
        this.setIndeterminateDrawable((Drawable)object);
        object = this.getContext();
        linearProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
        object2 = DeterminateDrawable.createLinearDrawable((Context)object, linearProgressIndicatorSpec, object2);
        this.setProgressDrawable((Drawable)object2);
    }

    public LinearProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet) {
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = new LinearProgressIndicatorSpec(context, attributeSet);
        return linearProgressIndicatorSpec;
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec)this.spec).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec)this.spec).indicatorDirection;
    }

    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec)this.spec).trackStopIndicatorSize;
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        block2: {
            block4: {
                Object object;
                block3: {
                    super.onLayout(n3 != 0, n4, n7, n8, n10);
                    object = this.spec;
                    BaseProgressIndicatorSpec baseProgressIndicatorSpec = object;
                    baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)object;
                    object = (LinearProgressIndicatorSpec)object;
                    n3 = ((LinearProgressIndicatorSpec)object).indicatorDirection;
                    n7 = 1;
                    if (n3 == n7) break block2;
                    object = ViewCompat.a;
                    n3 = this.getLayoutDirection();
                    if (n3 != n7) break block3;
                    object = (LinearProgressIndicatorSpec)this.spec;
                    n3 = ((LinearProgressIndicatorSpec)object).indicatorDirection;
                    n8 = 2;
                    if (n3 == n8) break block2;
                }
                if ((n3 = this.getLayoutDirection()) != 0) break block4;
                object = (LinearProgressIndicatorSpec)this.spec;
                n3 = ((LinearProgressIndicatorSpec)object).indicatorDirection;
                n8 = 3;
                if (n3 == n8) break block2;
            }
            n7 = 0;
        }
        ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec).drawHorizontallyInverse = n7;
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        n7 = this.getPaddingLeft();
        n8 = this.getPaddingRight() + n7;
        n3 -= n8;
        n7 = this.getPaddingTop();
        n8 = this.getPaddingBottom() + n7;
        n4 -= n8;
        Drawable drawable2 = this.getIndeterminateDrawable();
        n8 = 0;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, n3, n4);
        }
        if ((drawable2 = this.getProgressDrawable()) != null) {
            drawable2.setBounds(0, 0, n3, n4);
        }
    }

    public void setIndeterminateAnimationType(int n3) {
        Object object = (LinearProgressIndicatorSpec)this.spec;
        int n4 = ((LinearProgressIndicatorSpec)object).indeterminateAnimationType;
        if (n4 == n3) {
            return;
        }
        n4 = (int)(this.visibleToUser() ? 1 : 0);
        if (n4 != 0 && (n4 = (int)(this.isIndeterminate() ? 1 : 0)) != 0) {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            throw illegalStateException;
        }
        object = this.spec;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = object;
        baseProgressIndicatorSpec = object;
        ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec).indeterminateAnimationType = n3;
        ((LinearProgressIndicatorSpec)object).validateSpec();
        if (n3 == 0) {
            Drawable drawable2 = this.getIndeterminateDrawable();
            baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
            object = new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec)baseProgressIndicatorSpec);
            drawable2.setAnimatorDelegate((IndeterminateAnimatorDelegate)object);
        } else {
            Drawable drawable3 = this.getIndeterminateDrawable();
            baseProgressIndicatorSpec = this.getContext();
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
            object = new LinearIndeterminateDisjointAnimatorDelegate((Context)baseProgressIndicatorSpec, linearProgressIndicatorSpec);
            drawable3.setAnimatorDelegate((IndeterminateAnimatorDelegate)object);
        }
        this.invalidate();
    }

    public void setIndicatorColor(int ... nArray) {
        super.setIndicatorColor(nArray);
        ((LinearProgressIndicatorSpec)this.spec).validateSpec();
    }

    public void setIndicatorDirection(int n3) {
        int n4;
        block4: {
            int n7;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec;
            block5: {
                BaseProgressIndicatorSpec baseProgressIndicatorSpec2;
                baseProgressIndicatorSpec = baseProgressIndicatorSpec2 = this.spec;
                baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec2;
                ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec).indicatorDirection = n3;
                baseProgressIndicatorSpec2 = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec2;
                n4 = 1;
                if (n3 == n4) break block4;
                Object object = ViewCompat.a;
                n7 = this.getLayoutDirection();
                if (n7 != n4) break block5;
                object = (LinearProgressIndicatorSpec)this.spec;
                n7 = ((LinearProgressIndicatorSpec)object).indicatorDirection;
                int n8 = 2;
                if (n7 == n8) break block4;
            }
            if ((n7 = this.getLayoutDirection()) != 0 || n3 != (n7 = 3)) {
                n4 = 0;
                baseProgressIndicatorSpec = null;
            }
        }
        ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec2).drawHorizontallyInverse = n4;
        this.invalidate();
    }

    public void setProgressCompat(int n3, boolean bl2) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec != null) {
            baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec;
            int n4 = ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec).indeterminateAnimationType;
            if (n4 == 0 && (n4 = (int)(this.isIndeterminate() ? 1 : 0)) != 0) {
                return;
            }
        }
        super.setProgressCompat(n3, bl2);
    }

    public void setTrackCornerRadius(int n3) {
        super.setTrackCornerRadius(n3);
        ((LinearProgressIndicatorSpec)this.spec).validateSpec();
        this.invalidate();
    }

    public void setTrackStopIndicatorSize(int n3) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = baseProgressIndicatorSpec = this.spec;
        baseProgressIndicatorSpec2 = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec;
        int n4 = ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec2).trackStopIndicatorSize;
        if (n4 != n3) {
            baseProgressIndicatorSpec2 = baseProgressIndicatorSpec;
            baseProgressIndicatorSpec2 = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec;
            baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec;
            int n7 = baseProgressIndicatorSpec.trackThickness;
            ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec2).trackStopIndicatorSize = n3 = Math.min(n3, n7);
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
            linearProgressIndicatorSpec.validateSpec();
            this.invalidate();
        }
    }
}

