/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R$styleable;
import java.util.Arrays;

public final class b$b {
    public static final SparseIntArray q0;
    public int A;
    public int B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a = false;
    public int a0;
    public boolean b = false;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public float e0;
    public int f;
    public float f0;
    public float g;
    public int g0;
    public boolean h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int[] j0;
    public int k;
    public String k0;
    public int l;
    public String l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public boolean o0;
    public int p;
    public int p0;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public String z;

    static {
        SparseIntArray sparseIntArray;
        q0 = sparseIntArray = new SparseIntArray();
        int n3 = R$styleable.Layout_layout_constraintLeft_toLeftOf;
        sparseIntArray.append(n3, 24);
        n3 = R$styleable.Layout_layout_constraintLeft_toRightOf;
        sparseIntArray.append(n3, 25);
        n3 = R$styleable.Layout_layout_constraintRight_toLeftOf;
        sparseIntArray.append(n3, 28);
        n3 = R$styleable.Layout_layout_constraintRight_toRightOf;
        sparseIntArray.append(n3, 29);
        n3 = R$styleable.Layout_layout_constraintTop_toTopOf;
        sparseIntArray.append(n3, 35);
        n3 = R$styleable.Layout_layout_constraintTop_toBottomOf;
        sparseIntArray.append(n3, 34);
        n3 = R$styleable.Layout_layout_constraintBottom_toTopOf;
        sparseIntArray.append(n3, 4);
        n3 = R$styleable.Layout_layout_constraintBottom_toBottomOf;
        sparseIntArray.append(n3, 3);
        n3 = R$styleable.Layout_layout_constraintBaseline_toBaselineOf;
        sparseIntArray.append(n3, 1);
        n3 = R$styleable.Layout_layout_editor_absoluteX;
        sparseIntArray.append(n3, 6);
        n3 = R$styleable.Layout_layout_editor_absoluteY;
        sparseIntArray.append(n3, 7);
        n3 = R$styleable.Layout_layout_constraintGuide_begin;
        sparseIntArray.append(n3, 17);
        n3 = R$styleable.Layout_layout_constraintGuide_end;
        sparseIntArray.append(n3, 18);
        n3 = R$styleable.Layout_layout_constraintGuide_percent;
        sparseIntArray.append(n3, 19);
        n3 = R$styleable.Layout_guidelineUseRtl;
        int n4 = 90;
        sparseIntArray.append(n3, n4);
        n3 = R$styleable.Layout_android_orientation;
        sparseIntArray.append(n3, 26);
        n3 = R$styleable.Layout_layout_constraintStart_toEndOf;
        sparseIntArray.append(n3, 31);
        n3 = R$styleable.Layout_layout_constraintStart_toStartOf;
        sparseIntArray.append(n3, 32);
        n3 = R$styleable.Layout_layout_constraintEnd_toStartOf;
        sparseIntArray.append(n3, 10);
        n3 = R$styleable.Layout_layout_constraintEnd_toEndOf;
        sparseIntArray.append(n3, 9);
        n3 = R$styleable.Layout_layout_goneMarginLeft;
        sparseIntArray.append(n3, 13);
        n3 = R$styleable.Layout_layout_goneMarginTop;
        sparseIntArray.append(n3, 16);
        n3 = R$styleable.Layout_layout_goneMarginRight;
        sparseIntArray.append(n3, 14);
        n3 = R$styleable.Layout_layout_goneMarginBottom;
        sparseIntArray.append(n3, 11);
        n3 = R$styleable.Layout_layout_goneMarginStart;
        sparseIntArray.append(n3, 15);
        n3 = R$styleable.Layout_layout_goneMarginEnd;
        sparseIntArray.append(n3, 12);
        n3 = R$styleable.Layout_layout_constraintVertical_weight;
        sparseIntArray.append(n3, 38);
        n3 = R$styleable.Layout_layout_constraintHorizontal_weight;
        sparseIntArray.append(n3, 37);
        n3 = R$styleable.Layout_layout_constraintHorizontal_chainStyle;
        sparseIntArray.append(n3, 39);
        n3 = R$styleable.Layout_layout_constraintVertical_chainStyle;
        sparseIntArray.append(n3, 40);
        n3 = R$styleable.Layout_layout_constraintHorizontal_bias;
        sparseIntArray.append(n3, 20);
        n3 = R$styleable.Layout_layout_constraintVertical_bias;
        sparseIntArray.append(n3, 36);
        n3 = R$styleable.Layout_layout_constraintDimensionRatio;
        sparseIntArray.append(n3, 5);
        n3 = R$styleable.Layout_layout_constraintLeft_creator;
        int n7 = 91;
        sparseIntArray.append(n3, n7);
        n3 = R$styleable.Layout_layout_constraintTop_creator;
        sparseIntArray.append(n3, n7);
        n3 = R$styleable.Layout_layout_constraintRight_creator;
        sparseIntArray.append(n3, n7);
        n3 = R$styleable.Layout_layout_constraintBottom_creator;
        sparseIntArray.append(n3, n7);
        n3 = R$styleable.Layout_layout_constraintBaseline_creator;
        sparseIntArray.append(n3, n7);
        n3 = R$styleable.Layout_android_layout_marginLeft;
        sparseIntArray.append(n3, 23);
        n3 = R$styleable.Layout_android_layout_marginRight;
        sparseIntArray.append(n3, 27);
        n3 = R$styleable.Layout_android_layout_marginStart;
        sparseIntArray.append(n3, 30);
        n3 = R$styleable.Layout_android_layout_marginEnd;
        sparseIntArray.append(n3, 8);
        n3 = R$styleable.Layout_android_layout_marginTop;
        sparseIntArray.append(n3, 33);
        n3 = R$styleable.Layout_android_layout_marginBottom;
        sparseIntArray.append(n3, 2);
        n3 = R$styleable.Layout_android_layout_width;
        sparseIntArray.append(n3, 22);
        n3 = R$styleable.Layout_android_layout_height;
        sparseIntArray.append(n3, 21);
        n3 = R$styleable.Layout_layout_constraintWidth;
        sparseIntArray.append(n3, 41);
        n3 = R$styleable.Layout_layout_constraintHeight;
        sparseIntArray.append(n3, 42);
        n3 = R$styleable.Layout_layout_constrainedWidth;
        n7 = 87;
        sparseIntArray.append(n3, n7);
        n3 = R$styleable.Layout_layout_constrainedHeight;
        int n8 = 88;
        sparseIntArray.append(n3, n8);
        n3 = R$styleable.Layout_layout_wrapBehaviorInParent;
        sparseIntArray.append(n3, 76);
        n3 = R$styleable.Layout_layout_constraintCircle;
        sparseIntArray.append(n3, 61);
        n3 = R$styleable.Layout_layout_constraintCircleRadius;
        sparseIntArray.append(n3, 62);
        n3 = R$styleable.Layout_layout_constraintCircleAngle;
        sparseIntArray.append(n3, 63);
        n3 = R$styleable.Layout_layout_constraintWidth_percent;
        sparseIntArray.append(n3, 69);
        n3 = R$styleable.Layout_layout_constraintHeight_percent;
        sparseIntArray.append(n3, 70);
        n3 = R$styleable.Layout_chainUseRtl;
        sparseIntArray.append(n3, 71);
        n3 = R$styleable.Layout_barrierDirection;
        sparseIntArray.append(n3, 72);
        n3 = R$styleable.Layout_barrierMargin;
        sparseIntArray.append(n3, 73);
        n3 = R$styleable.Layout_constraint_referenced_ids;
        sparseIntArray.append(n3, 74);
        n3 = R$styleable.Layout_barrierAllowsGoneWidgets;
        sparseIntArray.append(n3, 75);
        n3 = R$styleable.Layout_layout_constraintWidth_max;
        sparseIntArray.append(n3, 84);
        n3 = R$styleable.Layout_layout_constraintWidth_min;
        sparseIntArray.append(n3, 86);
        n3 = R$styleable.Layout_layout_constraintWidth_max;
        sparseIntArray.append(n3, 83);
        n3 = R$styleable.Layout_layout_constraintHeight_min;
        sparseIntArray.append(n3, 85);
        n3 = R$styleable.Layout_layout_constraintWidth;
        sparseIntArray.append(n3, n7);
        n3 = R$styleable.Layout_layout_constraintHeight;
        sparseIntArray.append(n3, n8);
        n3 = R$styleable.ConstraintLayout_Layout_layout_constraintTag;
        sparseIntArray.append(n3, 89);
        n3 = R$styleable.Layout_guidelineUseRtl;
        sparseIntArray.append(n3, n4);
    }

    public b$b() {
        int n3;
        float f5;
        boolean bl2;
        float f6;
        int n4;
        this.e = n4 = -1;
        this.f = n4;
        this.g = f6 = -1.0f;
        this.h = bl2 = true;
        this.i = n4;
        this.j = n4;
        this.k = n4;
        this.l = n4;
        this.m = n4;
        this.n = n4;
        this.o = n4;
        this.p = n4;
        this.q = n4;
        this.r = n4;
        this.s = n4;
        this.t = n4;
        this.u = n4;
        this.v = n4;
        this.w = n4;
        this.x = f5 = 0.5f;
        this.y = f5;
        this.z = null;
        this.A = n4;
        this.B = 0;
        this.C = 0.0f;
        this.D = n4;
        this.E = n4;
        this.F = n4;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = n3 = -1 << -1;
        this.O = n3;
        this.P = n3;
        this.Q = n3;
        this.R = n3;
        this.S = n3;
        this.T = n3;
        this.U = f6;
        this.V = f6;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = f6 = 1.0f;
        this.f0 = f6;
        this.g0 = n4;
        this.h0 = 0;
        this.i0 = n4;
        this.m0 = false;
        this.n0 = false;
        this.o0 = bl2;
        this.p0 = 0;
    }

    public final void a(b$b b$b) {
        int n3;
        String string2;
        float f5;
        int n4;
        this.a = n4 = b$b.a;
        this.c = n4 = b$b.c;
        n4 = (int)(b$b.b ? 1 : 0);
        this.b = n4;
        this.d = n4 = b$b.d;
        this.e = n4 = b$b.e;
        this.f = n4 = b$b.f;
        this.g = f5 = b$b.g;
        n4 = (int)(b$b.h ? 1 : 0);
        this.h = n4;
        this.i = n4 = b$b.i;
        this.j = n4 = b$b.j;
        this.k = n4 = b$b.k;
        this.l = n4 = b$b.l;
        this.m = n4 = b$b.m;
        this.n = n4 = b$b.n;
        this.o = n4 = b$b.o;
        this.p = n4 = b$b.p;
        this.q = n4 = b$b.q;
        this.r = n4 = b$b.r;
        this.s = n4 = b$b.s;
        this.t = n4 = b$b.t;
        this.u = n4 = b$b.u;
        this.v = n4 = b$b.v;
        this.w = n4 = b$b.w;
        this.x = f5 = b$b.x;
        this.y = f5 = b$b.y;
        Object object = b$b.z;
        this.z = object;
        this.A = n4 = b$b.A;
        this.B = n4 = b$b.B;
        this.C = f5 = b$b.C;
        this.D = n4 = b$b.D;
        this.E = n4 = b$b.E;
        this.F = n4 = b$b.F;
        this.G = n4 = b$b.G;
        this.H = n4 = b$b.H;
        this.I = n4 = b$b.I;
        this.J = n4 = b$b.J;
        this.K = n4 = b$b.K;
        this.L = n4 = b$b.L;
        this.M = n4 = b$b.M;
        this.N = n4 = b$b.N;
        this.O = n4 = b$b.O;
        this.P = n4 = b$b.P;
        this.Q = n4 = b$b.Q;
        this.R = n4 = b$b.R;
        this.S = n4 = b$b.S;
        this.T = n4 = b$b.T;
        this.U = f5 = b$b.U;
        this.V = f5 = b$b.V;
        this.W = n4 = b$b.W;
        this.X = n4 = b$b.X;
        this.Y = n4 = b$b.Y;
        this.Z = n4 = b$b.Z;
        this.a0 = n4 = b$b.a0;
        this.b0 = n4 = b$b.b0;
        this.c0 = n4 = b$b.c0;
        this.d0 = n4 = b$b.d0;
        this.e0 = f5 = b$b.e0;
        this.f0 = f5 = b$b.f0;
        this.g0 = n4 = b$b.g0;
        this.h0 = n4 = b$b.h0;
        this.i0 = n4 = b$b.i0;
        object = b$b.l0;
        this.l0 = object;
        object = b$b.j0;
        if (object != null && (string2 = b$b.k0) == null) {
            int n7 = ((Object)object).length;
            object = Arrays.copyOf((int[])object, n7);
            this.j0 = (int[])object;
        } else {
            n4 = 0;
            f5 = 0.0f;
            object = null;
            this.j0 = null;
        }
        this.k0 = object = b$b.k0;
        n4 = (int)(b$b.m0 ? 1 : 0);
        this.m0 = n4;
        n4 = (int)(b$b.n0 ? 1 : 0);
        this.n0 = n4;
        n4 = (int)(b$b.o0 ? 1 : 0);
        this.o0 = n4;
        this.p0 = n3 = b$b.p0;
    }

    /*
     * Exception decompiling
     */
    public final void b(Context var1_1, AttributeSet var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

