/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.util.AttributeSet
 */
package com.willy.ratingbar;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import com.willy.ratingbar.AnimationRatingBar;
import com.willy.ratingbar.PartialView;
import com.willy.ratingbar.ScaleRatingBar$2;

public class ScaleRatingBar
extends AnimationRatingBar {
    public ScaleRatingBar(Context context) {
        super(context);
    }

    public ScaleRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScaleRatingBar(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public final void a(float f5) {
        boolean bl2;
        Object object;
        Object object2 = this.t;
        if (object2 != null) {
            object2 = this.s;
            object = this.u;
            object2.removeCallbacksAndMessages(object);
        }
        object2 = this.r.iterator();
        while (bl2 = object2.hasNext()) {
            double d2;
            Object object3 = object = object2.next();
            object3 = (PartialView)((Object)object);
            int n3 = (Integer)(object = (Integer)object3.getTag());
            double d5 = n3;
            double d7 = d5 - (d2 = Math.ceil(f5));
            Object object4 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object4 > 0) {
                ((PartialView)((Object)object3)).b();
                continue;
            }
            Object object5 = object;
            this.t = object = new ScaleRatingBar$2(this, n3, d2, (PartialView)((Object)object3), f5);
            object5 = this.s;
            if (object5 == null) {
                object5 = new Handler();
                this.s = object5;
            }
            long l2 = SystemClock.uptimeMillis();
            long l3 = 15;
            Handler handler = this.s;
            String string2 = this.u;
            handler.postAtTime((Runnable)object, (Object)string2, l2 += l3);
        }
    }
}

