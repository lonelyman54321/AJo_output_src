/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;

public final class b$e {
    public static final SparseIntArray o;
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public float n;

    static {
        SparseIntArray sparseIntArray;
        o = sparseIntArray = new SparseIntArray();
        int n3 = R$styleable.Transform_android_rotation;
        sparseIntArray.append(n3, 1);
        n3 = R$styleable.Transform_android_rotationX;
        sparseIntArray.append(n3, 2);
        n3 = R$styleable.Transform_android_rotationY;
        sparseIntArray.append(n3, 3);
        n3 = R$styleable.Transform_android_scaleX;
        sparseIntArray.append(n3, 4);
        n3 = R$styleable.Transform_android_scaleY;
        sparseIntArray.append(n3, 5);
        n3 = R$styleable.Transform_android_transformPivotX;
        sparseIntArray.append(n3, 6);
        n3 = R$styleable.Transform_android_transformPivotY;
        sparseIntArray.append(n3, 7);
        n3 = R$styleable.Transform_android_translationX;
        sparseIntArray.append(n3, 8);
        n3 = R$styleable.Transform_android_translationY;
        sparseIntArray.append(n3, 9);
        n3 = R$styleable.Transform_android_translationZ;
        sparseIntArray.append(n3, 10);
        n3 = R$styleable.Transform_android_elevation;
        sparseIntArray.append(n3, 11);
        n3 = R$styleable.Transform_transformPivotTarget;
        sparseIntArray.append(n3, 12);
    }

    public final void a(b$e b$e) {
        float f5;
        float f6;
        int n3;
        this.a = n3 = b$e.a;
        this.b = f6 = b$e.b;
        this.c = f6 = b$e.c;
        this.d = f6 = b$e.d;
        this.e = f6 = b$e.e;
        this.f = f6 = b$e.f;
        this.g = f6 = b$e.g;
        this.h = f6 = b$e.h;
        this.i = n3 = b$e.i;
        this.j = f6 = b$e.j;
        this.k = f6 = b$e.k;
        this.l = f6 = b$e.l;
        n3 = (int)(b$e.m ? 1 : 0);
        this.m = n3;
        this.n = f5 = b$e.n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        boolean bl2;
        int[] nArray = R$styleable.Transform;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        this.a = bl2 = true;
        int n3 = context.getIndexCount();
        block14: for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = context.getIndex(i3);
            SparseIntArray sparseIntArray = o;
            int n7 = sparseIntArray.get(n4);
            switch (n7) {
                default: {
                    continue block14;
                }
                case 12: {
                    n7 = this.i;
                    this.i = n4 = androidx.constraintlayout.widget.b.n((TypedArray)context, n4, n7);
                    continue block14;
                }
                case 11: {
                    float f5;
                    this.m = bl2;
                    float f6 = this.n;
                    this.n = f5 = context.getDimension(n4, f6);
                    continue block14;
                }
                case 10: {
                    float f5;
                    float f6 = this.l;
                    this.l = f5 = context.getDimension(n4, f6);
                    continue block14;
                }
                case 9: {
                    float f5;
                    float f6 = this.k;
                    this.k = f5 = context.getDimension(n4, f6);
                    continue block14;
                }
                case 8: {
                    float f5;
                    float f6 = this.j;
                    this.j = f5 = context.getDimension(n4, f6);
                    continue block14;
                }
                case 7: {
                    float f5;
                    float f6 = this.h;
                    this.h = f5 = context.getDimension(n4, f6);
                    continue block14;
                }
                case 6: {
                    float f5;
                    float f6 = this.g;
                    this.g = f5 = context.getDimension(n4, f6);
                    continue block14;
                }
                case 5: {
                    float f5;
                    float f6 = this.f;
                    this.f = f5 = context.getFloat(n4, f6);
                    continue block14;
                }
                case 4: {
                    float f5;
                    float f6 = this.e;
                    this.e = f5 = context.getFloat(n4, f6);
                    continue block14;
                }
                case 3: {
                    float f5;
                    float f6 = this.d;
                    this.d = f5 = context.getFloat(n4, f6);
                    continue block14;
                }
                case 2: {
                    float f5;
                    float f6 = this.c;
                    this.c = f5 = context.getFloat(n4, f6);
                    continue block14;
                }
                case 1: {
                    float f5;
                    float f6 = this.b;
                    this.b = f5 = context.getFloat(n4, f6);
                }
            }
        }
        context.recycle();
    }
}

