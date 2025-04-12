/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ProgressBar
 *  android.widget.RatingBar
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import androidx.appcompat.R$attr;

public class AppCompatRatingBar
extends RatingBar {
    public final vn a;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.ratingBarStyle;
        this(context, attributeSet, n3);
    }

    public AppCompatRatingBar(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        Um3.a(this.getContext(), (View)this);
        super((ProgressBar)this);
        this.a = object;
        ((vn)object).a(attributeSet, n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onMeasure(int n3, int n4) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        super.onMeasure(n3, n4);
                        vn vn3 = this.a;
                        vn3 = vn3.b;
                        if (vn3 == null) break block5;
                        n4 = vn3.getWidth();
                        int n7 = this.getNumStars();
                        n4 *= n7;
                        n7 = 0;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        n3 = View.resolveSizeAndState((int)n4, (int)n3, (int)0);
                        n4 = this.getMeasuredHeight();
                        this.setMeasuredDimension(n3, n4);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

