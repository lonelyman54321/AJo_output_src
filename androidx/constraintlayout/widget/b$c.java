/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 *  android.util.TypedValue
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;

public final class b$c {
    public static final SparseIntArray n;
    public boolean a;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public int j;
    public String k;
    public int l;
    public int m;

    static {
        SparseIntArray sparseIntArray;
        n = sparseIntArray = new SparseIntArray();
        int n3 = R$styleable.Motion_motionPathRotate;
        sparseIntArray.append(n3, 1);
        n3 = R$styleable.Motion_pathMotionArc;
        sparseIntArray.append(n3, 2);
        n3 = R$styleable.Motion_transitionEasing;
        sparseIntArray.append(n3, 3);
        n3 = R$styleable.Motion_drawPath;
        sparseIntArray.append(n3, 4);
        n3 = R$styleable.Motion_animateRelativeTo;
        sparseIntArray.append(n3, 5);
        n3 = R$styleable.Motion_animateCircleAngleTo;
        sparseIntArray.append(n3, 6);
        n3 = R$styleable.Motion_motionStagger;
        sparseIntArray.append(n3, 7);
        n3 = R$styleable.Motion_quantizeMotionSteps;
        sparseIntArray.append(n3, 8);
        n3 = R$styleable.Motion_quantizeMotionPhase;
        sparseIntArray.append(n3, 9);
        n3 = R$styleable.Motion_quantizeMotionInterpolator;
        sparseIntArray.append(n3, 10);
    }

    public final void a(b$c b$c) {
        float f5;
        float f6;
        String string2;
        int n3;
        this.a = n3 = b$c.a;
        this.b = n3 = b$c.b;
        this.d = string2 = b$c.d;
        this.e = n3 = b$c.e;
        this.f = n3 = b$c.f;
        this.h = f6 = b$c.h;
        this.g = f5 = b$c.g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        int n3;
        int[] nArray = R$styleable.Motion;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        this.a = n3 = 1;
        int n4 = context.getIndexCount();
        block12: for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = context.getIndex(i3);
            Object object = n;
            int n8 = object.get(n7);
            int n10 = 3;
            switch (n8) {
                default: {
                    continue block12;
                }
                case 10: {
                    object = context.peekValue(n7);
                    n8 = ((TypedValue)object).type;
                    int n14 = -2;
                    int n15 = -1;
                    if (n8 == n3) {
                        this.m = n7 = context.getResourceId(n7, n15);
                        if (n7 == n15) continue block12;
                        this.l = n14;
                        continue block12;
                    }
                    if (n8 == n10) {
                        this.k = object = context.getString(n7);
                        String string2 = "/";
                        n8 = ((String)object).indexOf(string2);
                        if (n8 > 0) {
                            this.m = n7 = context.getResourceId(n7, n15);
                            this.l = n14;
                            continue block12;
                        }
                        this.l = n15;
                        continue block12;
                    }
                    n8 = this.m;
                    this.l = n7 = context.getInteger(n7, n8);
                    continue block12;
                }
                case 9: {
                    float f5;
                    float f6 = this.i;
                    this.i = f5 = context.getFloat(n7, f6);
                    continue block12;
                }
                case 8: {
                    n8 = this.j;
                    this.j = n7 = context.getInteger(n7, n8);
                    continue block12;
                }
                case 7: {
                    float f5;
                    float f6 = this.g;
                    this.g = f5 = context.getFloat(n7, f6);
                    continue block12;
                }
                case 6: {
                    n8 = this.c;
                    this.c = n7 = context.getInteger(n7, n8);
                    continue block12;
                }
                case 5: {
                    n8 = this.b;
                    this.b = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                    continue block12;
                }
                case 4: {
                    this.f = n7 = context.getInt(n7, 0);
                    continue block12;
                }
                case 3: {
                    String string3;
                    object = context.peekValue(n7);
                    n8 = ((TypedValue)object).type;
                    if (n8 == n10) {
                        this.d = string3 = context.getString(n7);
                        continue block12;
                    }
                    object = bx0_0.c;
                    n7 = context.getInteger(n7, 0);
                    this.d = string3 = object[n7];
                    continue block12;
                }
                case 2: {
                    n8 = this.e;
                    this.e = n7 = context.getInt(n7, n8);
                    continue block12;
                }
                case 1: {
                    float f5;
                    float f6 = this.h;
                    this.h = f5 = context.getFloat(n7, f6);
                }
            }
        }
        context.recycle();
    }
}

