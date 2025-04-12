/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 */
package com.ril.ajio.home.category.revamp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;

public class AjioDrawerLayout
extends DrawerLayout {
    public AjioDrawerLayout(Context context) {
        super(context);
        this.init();
    }

    public AjioDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
    }

    public AjioDrawerLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.init();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void init() {
        AnnotatedElement annotatedElement;
        try {
            annotatedElement = ((Object)((Object)this)).getClass();
        }
        catch (Exception exception) {
            return;
        }
        annotatedElement = ((Class)annotatedElement).getSuperclass();
        Object object = "mMinDrawerMargin";
        annotatedElement = ((Class)annotatedElement).getDeclaredField((String)object);
        boolean bl2 = true;
        ((AccessibleObject)annotatedElement).setAccessible(bl2);
        bl2 = false;
        object = null;
        object = 0;
        ((Field)annotatedElement).set((Object)this, object);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}

