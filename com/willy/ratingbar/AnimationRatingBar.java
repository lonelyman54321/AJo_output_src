/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.util.AttributeSet
 */
package com.willy.ratingbar;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import com.willy.ratingbar.BaseRatingBar;
import java.util.UUID;

public class AnimationRatingBar
extends BaseRatingBar {
    public Handler s;
    public Runnable t;
    public final String u;

    public AnimationRatingBar(Context object) {
        super((Context)object);
        object = UUID.randomUUID().toString();
        this.u = object;
        super();
        this.s = object;
    }

    public AnimationRatingBar(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        object = UUID.randomUUID().toString();
        this.u = object;
        super();
        this.s = object;
    }

    public AnimationRatingBar(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        object = UUID.randomUUID().toString();
        this.u = object;
        super();
        this.s = object;
    }
}

