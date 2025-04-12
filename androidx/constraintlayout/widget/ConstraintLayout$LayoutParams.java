/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;

public class ConstraintLayout$LayoutParams
extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public final int C;
    public final int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public final boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public boolean f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public int l0;
    public int m;
    public float m0;
    public int n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public float p0;
    public int q;
    public Y50 q0;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final int w;
    public int x;
    public final int y;
    public int z;

    public ConstraintLayout$LayoutParams(int n3, int n4) {
        super(n3, n4);
        Y50 y50;
        float f5;
        int n7;
        boolean bl2;
        float f6;
        this.a = n3 = -1;
        this.b = n3;
        this.c = f6 = -1.0f;
        this.d = bl2 = true;
        this.e = n3;
        this.f = n3;
        this.g = n3;
        this.h = n3;
        this.i = n3;
        this.j = n3;
        this.k = n3;
        this.l = n3;
        this.m = n3;
        this.n = n3;
        this.o = n3;
        this.p = n3;
        this.q = 0;
        this.r = 0.0f;
        this.s = n3;
        this.t = n3;
        this.u = n3;
        this.v = n3;
        this.w = n7 = -1 << -1;
        this.x = n7;
        this.y = n7;
        this.z = n7;
        this.A = n7;
        this.B = n7;
        this.C = n7;
        this.D = 0;
        this.E = f5 = 0.5f;
        this.F = f5;
        this.G = null;
        this.H = f6;
        this.I = f6;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = f6 = 1.0f;
        this.S = f6;
        this.T = n3;
        this.U = n3;
        this.V = n3;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.a0 = bl2;
        this.b0 = bl2;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = n3;
        this.h0 = n3;
        this.i0 = n3;
        this.j0 = n3;
        this.k0 = n7;
        this.l0 = n7;
        this.m0 = f5;
        this.q0 = y50 = new Y50();
    }

    public ConstraintLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        float f6;
        int n3;
        this.a = n3 = -1;
        this.b = n3;
        this.c = f6 = -1.0f;
        int n4 = 1;
        this.d = n4;
        this.e = n3;
        this.f = n3;
        this.g = n3;
        this.h = n3;
        this.i = n3;
        this.j = n3;
        this.k = n3;
        this.l = n3;
        this.m = n3;
        this.n = n3;
        this.o = n3;
        this.p = n3;
        this.q = 0;
        this.r = 0.0f;
        this.s = n3;
        this.t = n3;
        this.u = n3;
        this.v = n3;
        int n7 = -1 << -1;
        float f7 = -0.0f;
        this.w = n7;
        this.x = n7;
        this.y = n7;
        this.z = n7;
        this.A = n7;
        this.B = n7;
        this.C = n7;
        this.D = 0;
        int n8 = 0x3F000000;
        this.E = f5 = 0.5f;
        this.F = f5;
        int n10 = 0;
        this.G = null;
        this.H = f6;
        this.I = f6;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = f6 = 1.0f;
        this.S = f6;
        this.T = n3;
        this.U = n3;
        this.V = n3;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.a0 = n4;
        this.b0 = n4;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = n3;
        this.h0 = n3;
        this.i0 = n3;
        this.j0 = n3;
        this.k0 = n7;
        this.l0 = n7;
        this.m0 = f5;
        Object object = new Y50();
        this.q0 = object;
        object = R$styleable.ConstraintLayout_Layout;
        context = context.obtainStyledAttributes(attributeSet, (int[])object);
        int n14 = context.getIndexCount();
        f6 = 0.0f;
        object = null;
        block76: for (int i3 = 0; i3 < n14; ++i3) {
            n7 = context.getIndex(i3);
            SparseIntArray sparseIntArray = ConstraintLayout$LayoutParams$a.a;
            n8 = sparseIntArray.get(n7);
            n10 = 2;
            int n15 = -2;
            switch (n8) {
                default: {
                    block52 : switch (n8) {
                        default: {
                            switch (n8) {
                                default: {
                                    break block52;
                                }
                                case 67: {
                                    n8 = (int)(this.d ? 1 : 0);
                                    n7 = (int)(context.getBoolean(n7, n8 != 0) ? 1 : 0);
                                    this.d = n7;
                                    break block52;
                                }
                                case 66: {
                                    n8 = this.Z;
                                    this.Z = n7 = context.getInt(n7, n8);
                                    break block52;
                                }
                                case 65: {
                                    androidx.constraintlayout.widget.b.o((Object)this, (TypedArray)context, n7, n4);
                                    break block52;
                                }
                                case 64: 
                            }
                            androidx.constraintlayout.widget.b.o((Object)this, (TypedArray)context, n7, 0);
                            break;
                        }
                        case 55: {
                            n8 = this.C;
                            this.C = n7 = context.getDimensionPixelSize(n7, n8);
                            break;
                        }
                        case 54: {
                            n8 = this.D;
                            this.D = n7 = context.getDimensionPixelSize(n7, n8);
                            break;
                        }
                        case 53: {
                            n8 = this.o;
                            this.o = n8 = context.getResourceId(n7, n8);
                            if (n8 != n3) continue block76;
                            this.o = n7 = context.getInt(n7, n3);
                            break;
                        }
                        case 52: {
                            n8 = this.n;
                            this.n = n8 = context.getResourceId(n7, n8);
                            if (n8 != n3) continue block76;
                            this.n = n7 = context.getInt(n7, n3);
                            break;
                        }
                        case 51: {
                            String string2;
                            this.Y = string2 = context.getString(n7);
                            break;
                        }
                        case 50: {
                            n8 = this.U;
                            this.U = n7 = context.getDimensionPixelOffset(n7, n8);
                            break;
                        }
                        case 49: {
                            n8 = this.T;
                            this.T = n7 = context.getDimensionPixelOffset(n7, n8);
                            break;
                        }
                        case 48: {
                            this.K = n7 = context.getInt(n7, 0);
                            break;
                        }
                        case 47: {
                            this.J = n7 = context.getInt(n7, 0);
                            break;
                        }
                        case 46: {
                            f5 = this.I;
                            this.I = f7 = context.getFloat(n7, f5);
                            break;
                        }
                        case 45: {
                            f5 = this.H;
                            this.H = f7 = context.getFloat(n7, f5);
                            break;
                        }
                        case 44: {
                            String string2 = context.getString(n7);
                            androidx.constraintlayout.widget.b.p(this, string2);
                            break;
                        }
                    }
                    continue block76;
                }
                case 38: {
                    f5 = this.S;
                    f7 = context.getFloat(n7, f5);
                    this.S = f7 = Math.max(0.0f, f7);
                    this.M = n10;
                    continue block76;
                }
                case 37: {
                    n8 = this.Q;
                    n8 = context.getDimensionPixelSize(n7, n8);
                    try {
                        this.Q = n8;
                    }
                    catch (Exception exception) {
                        n8 = this.Q;
                        n7 = context.getInt(n7, n8);
                        if (n7 != n15) continue block76;
                        this.Q = n15;
                    }
                    continue block76;
                }
                case 36: {
                    n8 = this.O;
                    n8 = context.getDimensionPixelSize(n7, n8);
                    try {
                        this.O = n8;
                    }
                    catch (Exception exception) {
                        n8 = this.O;
                        n7 = context.getInt(n7, n8);
                        if (n7 != n15) continue block76;
                        this.O = n15;
                    }
                    continue block76;
                }
                case 35: {
                    f5 = this.R;
                    f7 = context.getFloat(n7, f5);
                    this.R = f7 = Math.max(0.0f, f7);
                    this.L = n10;
                    continue block76;
                }
                case 34: {
                    n8 = this.P;
                    n8 = context.getDimensionPixelSize(n7, n8);
                    try {
                        this.P = n8;
                    }
                    catch (Exception exception) {
                        n8 = this.P;
                        n7 = context.getInt(n7, n8);
                        if (n7 != n15) continue block76;
                        this.P = n15;
                    }
                    continue block76;
                }
                case 33: {
                    n8 = this.N;
                    n8 = context.getDimensionPixelSize(n7, n8);
                    try {
                        this.N = n8;
                    }
                    catch (Exception exception) {
                        n8 = this.N;
                        n7 = context.getInt(n7, n8);
                        if (n7 != n15) continue block76;
                        this.N = n15;
                    }
                    continue block76;
                }
                case 32: {
                    this.M = n7 = context.getInt(n7, 0);
                    continue block76;
                }
                case 31: {
                    this.L = n7 = context.getInt(n7, 0);
                    continue block76;
                }
                case 30: {
                    f5 = this.F;
                    this.F = f7 = context.getFloat(n7, f5);
                    continue block76;
                }
                case 29: {
                    f5 = this.E;
                    this.E = f7 = context.getFloat(n7, f5);
                    continue block76;
                }
                case 28: {
                    n8 = (int)(this.X ? 1 : 0);
                    n7 = (int)(context.getBoolean(n7, n8 != 0) ? 1 : 0);
                    this.X = n7;
                    continue block76;
                }
                case 27: {
                    n8 = (int)(this.W ? 1 : 0);
                    n7 = (int)(context.getBoolean(n7, n8 != 0) ? 1 : 0);
                    this.W = n7;
                    continue block76;
                }
                case 26: {
                    n8 = this.B;
                    this.B = n7 = context.getDimensionPixelSize(n7, n8);
                    continue block76;
                }
                case 25: {
                    n8 = this.A;
                    this.A = n7 = context.getDimensionPixelSize(n7, n8);
                    continue block76;
                }
                case 24: {
                    n8 = this.z;
                    this.z = n7 = context.getDimensionPixelSize(n7, n8);
                    continue block76;
                }
                case 23: {
                    n8 = this.y;
                    this.y = n7 = context.getDimensionPixelSize(n7, n8);
                    continue block76;
                }
                case 22: {
                    n8 = this.x;
                    this.x = n7 = context.getDimensionPixelSize(n7, n8);
                    continue block76;
                }
                case 21: {
                    n8 = this.w;
                    this.w = n7 = context.getDimensionPixelSize(n7, n8);
                    continue block76;
                }
                case 20: {
                    n8 = this.v;
                    this.v = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.v = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 19: {
                    n8 = this.u;
                    this.u = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.u = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 18: {
                    n8 = this.t;
                    this.t = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.t = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 17: {
                    n8 = this.s;
                    this.s = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.s = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 16: {
                    n8 = this.m;
                    this.m = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.m = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 15: {
                    n8 = this.l;
                    this.l = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.l = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 14: {
                    n8 = this.k;
                    this.k = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.k = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 13: {
                    n8 = this.j;
                    this.j = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.j = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 12: {
                    n8 = this.i;
                    this.i = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.i = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 11: {
                    n8 = this.h;
                    this.h = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.h = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 10: {
                    n8 = this.g;
                    this.g = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.g = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 9: {
                    n8 = this.f;
                    this.f = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.f = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 8: {
                    n8 = this.e;
                    this.e = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.e = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 7: {
                    f5 = this.c;
                    this.c = f7 = context.getFloat(n7, f5);
                    continue block76;
                }
                case 6: {
                    n8 = this.b;
                    this.b = n7 = context.getDimensionPixelOffset(n7, n8);
                    continue block76;
                }
                case 5: {
                    n8 = this.a;
                    this.a = n7 = context.getDimensionPixelOffset(n7, n8);
                    continue block76;
                }
                case 4: {
                    f5 = this.r;
                    f7 = context.getFloat(n7, f5);
                    n8 = 1135869952;
                    f5 = 360.0f;
                    this.r = f7 %= f5;
                    float f8 = f7 - 0.0f;
                    n10 = (int)(f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1));
                    if (n10 >= 0) continue block76;
                    this.r = f7 = (f5 - f7) % f5;
                    continue block76;
                }
                case 3: {
                    n8 = this.q;
                    this.q = n7 = context.getDimensionPixelSize(n7, n8);
                    continue block76;
                }
                case 2: {
                    n8 = this.p;
                    this.p = n8 = context.getResourceId(n7, n8);
                    if (n8 != n3) continue block76;
                    this.p = n7 = context.getInt(n7, n3);
                    continue block76;
                }
                case 1: {
                    n8 = this.V;
                    this.V = n7 = context.getInt(n7, n8);
                }
            }
        }
        context.recycle();
        this.a();
    }

    public ConstraintLayout$LayoutParams(ViewGroup.LayoutParams object) {
        super(object);
        float f5;
        int n3;
        boolean bl2;
        float f6;
        int n4 = -1;
        float f7 = 0.0f / 0.0f;
        this.a = n4;
        this.b = n4;
        this.c = f6 = -1.0f;
        this.d = bl2 = true;
        this.e = n4;
        this.f = n4;
        this.g = n4;
        this.h = n4;
        this.i = n4;
        this.j = n4;
        this.k = n4;
        this.l = n4;
        this.m = n4;
        this.n = n4;
        this.o = n4;
        this.p = n4;
        this.q = 0;
        this.r = 0.0f;
        this.s = n4;
        this.t = n4;
        this.u = n4;
        this.v = n4;
        this.w = n3 = -1 << -1;
        this.x = n3;
        this.y = n3;
        this.z = n3;
        this.A = n3;
        this.B = n3;
        this.C = n3;
        this.D = 0;
        this.E = f5 = 0.5f;
        this.F = f5;
        this.G = null;
        this.H = f6;
        this.I = f6;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        int n7 = 1065353216;
        this.R = f6 = 1.0f;
        this.S = f6;
        this.T = n4;
        this.U = n4;
        this.V = n4;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.a0 = bl2;
        this.b0 = bl2;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = n4;
        this.h0 = n4;
        this.i0 = n4;
        this.j0 = n4;
        this.k0 = n3;
        this.l0 = n3;
        this.m0 = f5;
        Object object2 = new Y50();
        this.q0 = object2;
        n4 = object instanceof ViewGroup.MarginLayoutParams;
        if (n4 != 0) {
            object2 = object;
            object2 = (ViewGroup.MarginLayoutParams)object;
            this.leftMargin = n7 = ((ViewGroup.MarginLayoutParams)object2).leftMargin;
            this.rightMargin = n7 = ((ViewGroup.MarginLayoutParams)object2).rightMargin;
            this.topMargin = n7 = ((ViewGroup.MarginLayoutParams)object2).topMargin;
            this.bottomMargin = n7 = ((ViewGroup.MarginLayoutParams)object2).bottomMargin;
            n7 = object2.getMarginStart();
            this.setMarginStart(n7);
            n4 = object2.getMarginEnd();
            this.setMarginEnd(n4);
        }
        if ((n4 = object instanceof ConstraintLayout$LayoutParams) == 0) {
            return;
        }
        object = (ConstraintLayout$LayoutParams)((Object)object);
        this.a = n4 = object.a;
        this.b = n4 = object.b;
        this.c = f7 = object.c;
        n4 = (int)(object.d ? 1 : 0);
        this.d = n4;
        this.e = n4 = object.e;
        this.f = n4 = object.f;
        this.g = n4 = object.g;
        this.h = n4 = object.h;
        this.i = n4 = object.i;
        this.j = n4 = object.j;
        this.k = n4 = object.k;
        this.l = n4 = object.l;
        this.m = n4 = object.m;
        this.n = n4 = object.n;
        this.o = n4 = object.o;
        this.p = n4 = object.p;
        this.q = n4 = object.q;
        this.r = f7 = object.r;
        this.s = n4 = object.s;
        this.t = n4 = object.t;
        this.u = n4 = object.u;
        this.v = n4 = object.v;
        this.w = n4 = object.w;
        this.x = n4 = object.x;
        this.y = n4 = object.y;
        this.z = n4 = object.z;
        this.A = n4 = object.A;
        this.B = n4 = object.B;
        this.C = n4 = object.C;
        this.D = n4 = object.D;
        this.E = f7 = object.E;
        this.F = f7 = object.F;
        this.G = object2 = object.G;
        this.H = f7 = object.H;
        this.I = f7 = object.I;
        this.J = n4 = object.J;
        this.K = n4 = object.K;
        n4 = (int)(object.W ? 1 : 0);
        this.W = n4;
        n4 = (int)(object.X ? 1 : 0);
        this.X = n4;
        this.L = n4 = object.L;
        this.M = n4 = object.M;
        this.N = n4 = object.N;
        this.P = n4 = object.P;
        this.O = n4 = object.O;
        this.Q = n4 = object.Q;
        this.R = f7 = object.R;
        this.S = f7 = object.S;
        this.T = n4 = object.T;
        this.U = n4 = object.U;
        this.V = n4 = object.V;
        n4 = (int)(object.a0 ? 1 : 0);
        this.a0 = n4;
        n4 = (int)(object.b0 ? 1 : 0);
        this.b0 = n4;
        n4 = (int)(object.c0 ? 1 : 0);
        this.c0 = n4;
        n4 = (int)(object.d0 ? 1 : 0);
        this.d0 = n4;
        this.g0 = n4 = object.g0;
        this.h0 = n4 = object.h0;
        this.i0 = n4 = object.i0;
        this.j0 = n4 = object.j0;
        this.k0 = n4 = object.k0;
        this.l0 = n4 = object.l0;
        this.m0 = f7 = object.m0;
        this.Y = object2 = object.Y;
        this.Z = n4 = object.Z;
        object = object.q0;
        this.q0 = object;
    }

    public final void a() {
        int n3;
        int n4;
        int n7;
        int n8 = 0;
        float f5 = 0.0f;
        Y50 y50 = null;
        this.d0 = false;
        this.a0 = n7 = 1;
        this.b0 = n7;
        int n10 = this.width;
        int n14 = -2;
        if (n10 == n14 && (n4 = this.W) != 0) {
            this.a0 = false;
            n4 = this.L;
            if (n4 == 0) {
                this.L = n7;
            }
        }
        if ((n4 = this.height) == n14 && (n3 = (int)(this.X ? 1 : 0)) != 0) {
            this.b0 = false;
            n3 = this.M;
            if (n3 == 0) {
                this.M = n7;
            }
        }
        n3 = -1;
        if (n10 == 0 || n10 == n3) {
            this.a0 = false;
            if (n10 == 0 && (n10 = this.L) == n7) {
                this.width = n14;
                this.W = n7;
            }
        }
        if (n4 == 0 || n4 == n3) {
            this.b0 = false;
            if (n4 == 0 && (n8 = this.M) == n7) {
                this.height = n14;
                this.X = n7;
            }
        }
        f5 = this.c;
        n10 = -1082130432;
        float f6 = -1.0f;
        float f7 = f5 - f6;
        n8 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n8 != 0 || (n8 = this.a) != n3 || (n8 = this.b) != n3) {
            this.d0 = n7;
            this.a0 = n7;
            this.b0 = n7;
            y50 = this.q0;
            n8 = y50 instanceof w11_0;
            if (n8 == 0) {
                this.q0 = y50 = new w11_0();
            }
            y50 = (w11_0)this.q0;
            n7 = this.V;
            ((w11_0)y50).a0(n7);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void resolveLayoutDirection(int n3) {
        int n4;
        int n7;
        int n8;
        block31: {
            int n10;
            block27: {
                int n14;
                int n15;
                float f5;
                block32: {
                    float f6;
                    float f7;
                    float f8;
                    int n16;
                    int n17;
                    block30: {
                        block29: {
                            block28: {
                                int n18;
                                n8 = this.leftMargin;
                                n7 = this.rightMargin;
                                super.resolveLayoutDirection(n3);
                                n3 = this.getLayoutDirection();
                                n17 = 0;
                                f5 = 0.0f;
                                n16 = 1;
                                if (n16 == n3) {
                                    n3 = 1;
                                    f8 = Float.MIN_VALUE;
                                } else {
                                    n3 = 0;
                                    f8 = 0.0f;
                                }
                                this.i0 = n4 = -1;
                                this.j0 = n4;
                                this.g0 = n4;
                                this.h0 = n4;
                                this.k0 = n18 = this.w;
                                this.l0 = n18 = this.y;
                                this.m0 = f7 = this.E;
                                this.n0 = n15 = this.a;
                                this.o0 = n14 = this.b;
                                this.p0 = f6 = this.c;
                                n10 = -1 << -1;
                                if (n3 == 0) break block27;
                                n3 = this.s;
                                if (n3 == n4) break block28;
                                this.i0 = n3;
                                break block29;
                            }
                            n3 = this.t;
                            if (n3 == n4) break block30;
                            this.j0 = n3;
                        }
                        n17 = 1;
                        f5 = Float.MIN_VALUE;
                    }
                    if ((n3 = this.u) != n4) {
                        this.h0 = n3;
                        n17 = 1;
                        f5 = Float.MIN_VALUE;
                    }
                    if ((n3 = this.v) != n4) {
                        this.g0 = n3;
                        n17 = 1;
                        f5 = Float.MIN_VALUE;
                    }
                    if ((n3 = this.A) != n10) {
                        this.l0 = n3;
                    }
                    if ((n3 = this.B) != n10) {
                        this.k0 = n3;
                    }
                    n3 = 1065353216;
                    f8 = 1.0f;
                    if (n17 != 0) {
                        this.m0 = f5 = f8 - f7;
                    }
                    if ((n17 = this.d0) == 0 || (n17 = this.V) != n16 || (n17 = (int)(this.d ? 1 : 0)) == 0) break block31;
                    n17 = -1082130432;
                    f5 = -1.0f;
                    float f11 = f6 - f5;
                    n16 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                    if (n16 == 0) break block32;
                    this.p0 = f8 -= f6;
                    this.n0 = n4;
                    this.o0 = n4;
                    break block31;
                }
                if (n15 != n4) {
                    this.o0 = n15;
                    this.n0 = n4;
                    this.p0 = f5;
                    break block31;
                } else if (n14 != n4) {
                    this.n0 = n14;
                    this.o0 = n4;
                    this.p0 = f5;
                }
                break block31;
            }
            n3 = this.s;
            if (n3 != n4) {
                this.h0 = n3;
            }
            if ((n3 = this.t) != n4) {
                this.g0 = n3;
            }
            if ((n3 = this.u) != n4) {
                this.i0 = n3;
            }
            if ((n3 = this.v) != n4) {
                this.j0 = n3;
            }
            if ((n3 = this.A) != n10) {
                this.k0 = n3;
            }
            if ((n3 = this.B) != n10) {
                this.l0 = n3;
            }
        }
        if ((n3 = this.u) != n4) return;
        n3 = this.v;
        if (n3 != n4) return;
        n3 = this.t;
        if (n3 != n4) return;
        n3 = this.s;
        if (n3 != n4) return;
        n3 = this.g;
        if (n3 != n4) {
            this.i0 = n3;
            n3 = this.rightMargin;
            if (n3 <= 0 && n7 > 0) {
                this.rightMargin = n7;
            }
        } else {
            n3 = this.h;
            if (n3 != n4) {
                this.j0 = n3;
                n3 = this.rightMargin;
                if (n3 <= 0 && n7 > 0) {
                    this.rightMargin = n7;
                }
            }
        }
        if ((n3 = this.e) != n4) {
            this.g0 = n3;
            n3 = this.leftMargin;
            if (n3 > 0) return;
            if (n8 <= 0) return;
            this.leftMargin = n8;
            return;
        }
        n3 = this.f;
        if (n3 == n4) return;
        this.h0 = n3;
        n3 = this.leftMargin;
        if (n3 > 0) return;
        if (n8 <= 0) return;
        this.leftMargin = n8;
    }
}

