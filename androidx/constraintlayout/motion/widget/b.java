/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.util.Xml
 *  android.view.ViewGroup
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import org.xmlpull.v1.XmlPullParser;

public final class b {
    public static final float[][] E;
    public static final float[][] F;
    public final float A;
    public final float B;
    public final int C;
    public final int D;
    public final int a;
    public final int b;
    public int c = 0;
    public final int d;
    public final int e;
    public final int f;
    public float g;
    public float h;
    public final int i;
    public final boolean j;
    public float k;
    public float l;
    public boolean m;
    public final float[] n;
    public final int[] o;
    public float p;
    public float q;
    public final MotionLayout r;
    public final float s;
    public final float t;
    public final boolean u;
    public final float v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    static {
        int n3 = 2;
        float[] fArray = new float[n3];
        fArray[0] = 0.5f;
        fArray[1] = 0.0f;
        float[] fArray2 = new float[n3];
        fArray2[0] = 0.0f;
        fArray2[1] = 0.5f;
        float[] fArray3 = new float[n3];
        fArray3[0] = 1.0f;
        fArray3[1] = 0.5f;
        float[] fArray4 = new float[n3];
        fArray4[0] = 0.5f;
        fArray4[1] = 1.0f;
        Object object = new float[n3];
        object[0] = 0.5f;
        object[1] = 0.5f;
        float[] fArray5 = new float[n3];
        fArray5[0] = 0.0f;
        fArray5[1] = 0.5f;
        float[] fArray6 = new float[n3];
        fArray6[0] = 1.0f;
        fArray6[1] = 0.5f;
        Object object2 = new float[7][];
        object2[0] = fArray;
        int n4 = 1;
        object2[n4] = fArray2;
        object2[n3] = fArray3;
        int n7 = 3;
        object2[n7] = fArray4;
        int n8 = 4;
        object2[n8] = object;
        int n10 = 5;
        object2[n10] = fArray5;
        int n14 = 6;
        object2[n14] = fArray6;
        E = object2;
        fArray5 = new float[n3];
        fArray5[0] = 0.0f;
        fArray5[1] = -1.0f;
        fArray6 = new float[n3];
        fArray6[0] = 0.0f;
        fArray6[1] = 1.0f;
        object2 = new float[n3];
        object2[0] = (float[])-1.0f;
        object2[1] = (float[])0.0f;
        float[] fArray7 = new float[n3];
        fArray7[0] = 1.0f;
        fArray7[1] = 0.0f;
        float[] fArray8 = new float[n3];
        fArray8[0] = -1.0f;
        fArray8[1] = 0.0f;
        float[] fArray9 = new float[n3];
        fArray9[0] = 1.0f;
        fArray9[1] = 0.0f;
        object = new float[n14][];
        object[0] = (float)fArray5;
        object[n4] = (float)fArray6;
        object[n3] = (float)object2;
        object[n7] = (float)fArray7;
        object[n8] = (float)fArray8;
        object[n10] = (float)fArray9;
        F = (float[][])object;
    }

    public b(Context context, MotionLayout motionLayout, XmlResourceParser object) {
        float f5;
        float f6;
        float f7;
        int n3;
        this.a = 0;
        this.b = 0;
        this.d = n3 = -1;
        this.e = n3;
        this.f = n3;
        this.g = f7 = 0.5f;
        this.h = f7;
        this.i = n3;
        this.j = false;
        this.k = 0.0f;
        this.l = f6 = 1.0f;
        this.m = false;
        int n4 = 2;
        float[] fArray = new float[n4];
        this.n = fArray;
        int[] nArray = new int[n4];
        this.o = nArray;
        this.s = 4.0f;
        this.t = 1.2f;
        n4 = 1;
        f7 = Float.MIN_VALUE;
        this.u = n4;
        this.v = f6;
        this.w = 0;
        int n7 = 1092616192;
        this.x = f5 = 10.0f;
        this.y = f5;
        this.z = f6;
        n3 = 2143289344;
        this.A = f6 = 0.0f / 0.0f;
        this.B = f6;
        this.C = 0;
        this.D = 0;
        this.r = motionLayout;
        motionLayout = Xml.asAttributeSet((XmlPullParser)object);
        object = R$styleable.OnSwipe;
        context = context.obtainStyledAttributes((AttributeSet)motionLayout, (int[])object);
        int n8 = context.getIndexCount();
        object = null;
        for (int i3 = 0; i3 < n8; ++i3) {
            float f8;
            float[][] fArray2;
            int n10;
            n7 = context.getIndex(i3);
            if (n7 == (n10 = R$styleable.OnSwipe_touchAnchorId)) {
                n10 = this.d;
                this.d = n7 = context.getResourceId(n7, n10);
                continue;
            }
            n10 = R$styleable.OnSwipe_touchAnchorSide;
            if (n7 == n10) {
                n10 = this.a;
                this.a = n7 = context.getInt(n7, n10);
                fArray2 = E;
                fArray = fArray2[n7];
                this.h = f8 = fArray[0];
                this.g = f5 = fArray[n4];
                continue;
            }
            n10 = R$styleable.OnSwipe_dragDirection;
            if (n7 == n10) {
                n10 = this.b;
                this.b = n7 = context.getInt(n7, n10);
                n10 = 6;
                f8 = 8.4E-45f;
                if (n7 < n10) {
                    fArray2 = F;
                    fArray = fArray2[n7];
                    this.k = f8 = fArray[0];
                    this.l = f5 = fArray[n4];
                    continue;
                }
                this.l = f6;
                this.k = f6;
                this.j = n4;
                continue;
            }
            n10 = R$styleable.OnSwipe_maxVelocity;
            if (n7 == n10) {
                f8 = this.s;
                this.s = f5 = context.getFloat(n7, f8);
                continue;
            }
            n10 = R$styleable.OnSwipe_maxAcceleration;
            if (n7 == n10) {
                f8 = this.t;
                this.t = f5 = context.getFloat(n7, f8);
                continue;
            }
            n10 = R$styleable.OnSwipe_moveWhenScrollAtTop;
            if (n7 == n10) {
                n10 = (int)(this.u ? 1 : 0);
                n7 = (int)(context.getBoolean(n7, n10 != 0) ? 1 : 0);
                this.u = n7;
                continue;
            }
            n10 = R$styleable.OnSwipe_dragScale;
            if (n7 == n10) {
                f8 = this.v;
                this.v = f5 = context.getFloat(n7, f8);
                continue;
            }
            n10 = R$styleable.OnSwipe_dragThreshold;
            if (n7 == n10) {
                f8 = this.x;
                this.x = f5 = context.getFloat(n7, f8);
                continue;
            }
            n10 = R$styleable.OnSwipe_touchRegionId;
            if (n7 == n10) {
                n10 = this.e;
                this.e = n7 = context.getResourceId(n7, n10);
                continue;
            }
            n10 = R$styleable.OnSwipe_onTouchUp;
            if (n7 == n10) {
                n10 = this.c;
                this.c = n7 = context.getInt(n7, n10);
                continue;
            }
            n10 = R$styleable.OnSwipe_nestedScrollFlags;
            if (n7 == n10) {
                this.w = n7 = context.getInteger(n7, 0);
                continue;
            }
            n10 = R$styleable.OnSwipe_limitBoundsTo;
            if (n7 == n10) {
                this.f = n7 = context.getResourceId(n7, 0);
                continue;
            }
            n10 = R$styleable.OnSwipe_rotationCenterId;
            if (n7 == n10) {
                n10 = this.i;
                this.i = n7 = context.getResourceId(n7, n10);
                continue;
            }
            n10 = R$styleable.OnSwipe_springDamping;
            if (n7 == n10) {
                f8 = this.y;
                this.y = f5 = context.getFloat(n7, f8);
                continue;
            }
            n10 = R$styleable.OnSwipe_springMass;
            if (n7 == n10) {
                f8 = this.z;
                this.z = f5 = context.getFloat(n7, f8);
                continue;
            }
            n10 = R$styleable.OnSwipe_springStiffness;
            if (n7 == n10) {
                f8 = this.A;
                this.A = f5 = context.getFloat(n7, f8);
                continue;
            }
            n10 = R$styleable.OnSwipe_springStopThreshold;
            if (n7 == n10) {
                f8 = this.B;
                this.B = f5 = context.getFloat(n7, f8);
                continue;
            }
            n10 = R$styleable.OnSwipe_springBoundary;
            if (n7 == n10) {
                n10 = this.C;
                this.C = n7 = context.getInt(n7, n10);
                continue;
            }
            n10 = R$styleable.OnSwipe_autoCompleteMode;
            if (n7 != n10) continue;
            n10 = this.D;
            this.D = n7 = context.getInt(n7, n10);
        }
        context.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        int n3 = this.f;
        int n4 = -1;
        float f5 = 0.0f / 0.0f;
        float f6 = 0.0f;
        if (n3 == n4) {
            return null;
        }
        if ((viewGroup = viewGroup.findViewById(n3)) == null) {
            return null;
        }
        float f7 = viewGroup.getLeft();
        f5 = viewGroup.getTop();
        f6 = viewGroup.getRight();
        float f8 = viewGroup.getBottom();
        rectF.set(f7, f5, f6, f8);
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        int n3 = this.e;
        int n4 = -1;
        float f5 = 0.0f / 0.0f;
        float f6 = 0.0f;
        if (n3 == n4) {
            return null;
        }
        if ((viewGroup = viewGroup.findViewById(n3)) == null) {
            return null;
        }
        float f7 = viewGroup.getLeft();
        f5 = viewGroup.getTop();
        f6 = viewGroup.getRight();
        float f8 = viewGroup.getBottom();
        rectF.set(f7, f5, f6, f8);
        return rectF;
    }

    public final void c(boolean n3) {
        float f5;
        float[] fArray;
        int n4 = 3;
        float f6 = 4.2E-45f;
        int n7 = 4;
        float f7 = 5.6E-45f;
        int n8 = 6;
        float[][] fArray2 = E;
        float[][] fArray3 = F;
        int n10 = 1;
        int n14 = 2;
        int n15 = 5;
        if (n3 != 0) {
            fArray = fArray3[n4];
            fArray3[n7] = fArray;
            fArray = fArray3[n14];
            fArray3[n15] = fArray;
            fArray = fArray2[n14];
            fArray2[n15] = fArray;
            fArray = fArray2[n10];
            fArray2[n8] = fArray;
        } else {
            fArray = fArray3[n14];
            fArray3[n7] = fArray;
            fArray = fArray3[n4];
            fArray3[n15] = fArray;
            fArray = fArray2[n10];
            fArray2[n15] = fArray;
            fArray = fArray2[n14];
            fArray2[n8] = fArray;
        }
        n3 = this.a;
        fArray = fArray2[n3];
        n4 = 0;
        f6 = 0.0f;
        this.h = f7 = fArray[0];
        this.g = f5 = fArray[n10];
        n3 = this.b;
        if (n3 >= n8) {
            return;
        }
        fArray = fArray3[n3];
        this.k = f6 = fArray[0];
        this.l = f5 = fArray[n10];
    }

    public final String toString() {
        CharSequence charSequence;
        float f5 = this.k;
        boolean bl2 = Float.isNaN(f5);
        if (bl2) {
            charSequence = "rotation";
        } else {
            charSequence = new StringBuilder();
            float f6 = this.k;
            ((StringBuilder)charSequence).append(f6);
            String string2 = " , ";
            ((StringBuilder)charSequence).append(string2);
            f6 = this.l;
            ((StringBuilder)charSequence).append(f6);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

