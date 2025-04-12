/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.webkit.WebView
 */
package com.ril.ajio.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

public class NestedWebView
extends WebView
implements uU1 {
    public int a;
    public final int[] b;
    public final int[] c;
    public int d;
    public final vU1 e;

    public NestedWebView(Context context) {
        context = context.getApplicationContext();
        this(context, null);
    }

    public NestedWebView(Context context, AttributeSet attributeSet) {
        context = context.getApplicationContext();
        this(context, attributeSet, 16842885);
    }

    public NestedWebView(Context object, AttributeSet object2, int n3) {
        object = object.getApplicationContext();
        super(object, object2, n3);
        int bl2 = 2;
        object2 = new int[bl2];
        this.b = (int[])object2;
        object = new int[bl2];
        this.c = (int[])object;
        boolean bl3 = true;
        this.setFocusable(bl3);
        this.setFocusableInTouchMode(bl3);
        super((View)this);
        this.e = object2;
        this.setNestedScrollingEnabled(bl3);
    }

    public final boolean dispatchNestedFling(float f5, float f6, boolean bl2) {
        return this.e.a(f5, f6, bl2);
    }

    public final boolean dispatchNestedPreFling(float f5, float f6) {
        return this.e.b(f5, f6);
    }

    public final boolean dispatchNestedPreScroll(int n3, int n4, int[] nArray, int[] nArray2) {
        return this.e.c(n3, n4, nArray, nArray2, 0);
    }

    public final boolean dispatchNestedScroll(int n3, int n4, int n7, int n8, int[] nArray) {
        return this.e.e(n3, n4, n7, n8, nArray, 0, null);
    }

    public final boolean hasNestedScrollingParent() {
        return this.e.g(0);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.e.d;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int n3;
        block6: {
            int n4;
            int n7;
            MotionEvent motionEvent2;
            block3: {
                block4: {
                    int n8;
                    float f5;
                    int n10;
                    block5: {
                        motionEvent2 = MotionEvent.obtain((MotionEvent)motionEvent);
                        n10 = motionEvent.getActionMasked();
                        n3 = 0;
                        if (n10 == 0) {
                            this.d = 0;
                        }
                        float f6 = motionEvent2.getY();
                        n7 = (int)f6;
                        f5 = this.d;
                        motionEvent2.offsetLocation(0.0f, f5);
                        n4 = 2;
                        f5 = 2.8E-45f;
                        if (n10 == 0) break block3;
                        n8 = 1;
                        if (n10 == n8) break block4;
                        if (n10 == n4) break block5;
                        n7 = 3;
                        f6 = 4.2E-45f;
                        if (n10 == n7) break block4;
                        break block6;
                    }
                    n10 = this.a - n7;
                    int[] nArray = this.c;
                    int[] nArray2 = this.b;
                    int n14 = this.dispatchNestedPreScroll(0, n10, nArray, nArray2);
                    if (n14 != 0) {
                        n3 = nArray2[n8];
                        n4 = nArray[n8];
                        n10 -= n4;
                        f5 = -n3;
                        motionEvent2.offsetLocation(0.0f, f5);
                        n4 = this.d;
                        n14 = nArray2[n8];
                        this.d = n4 += n14;
                    }
                    int n15 = n10;
                    n10 = (int)(super.onTouchEvent(motionEvent2) ? 1 : 0);
                    int[] nArray3 = this.b;
                    int n16 = nArray3[n8];
                    n4 = (int)(this.dispatchNestedScroll(0, n16, 0, n15, nArray3) ? 1 : 0);
                    if (n4 != 0) {
                        n4 = nArray2[n8];
                        n3 += n4;
                        f5 = n4;
                        motionEvent2.offsetLocation(0.0f, f5);
                        int n17 = this.d;
                        n4 = nArray2[n8];
                        this.d = n17 += n4;
                        this.a = n17 = this.a - n4;
                    }
                    this.a = n7 -= n3;
                    n3 = n10;
                    break block6;
                }
                n3 = super.onTouchEvent(motionEvent2);
                this.stopNestedScroll();
                break block6;
            }
            n3 = super.onTouchEvent(motionEvent2);
            this.a = n7;
            this.startNestedScroll(n4);
        }
        return n3 != 0;
    }

    public void setNestedScrollingEnabled(boolean bl2) {
        this.e.h(bl2);
    }

    public final boolean startNestedScroll(int n3) {
        return this.e.i(n3, 0);
    }

    public final void stopNestedScroll() {
        this.e.j(0);
    }
}

