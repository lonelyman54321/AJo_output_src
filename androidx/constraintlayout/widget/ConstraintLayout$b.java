/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 */
package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$a;
import androidx.constraintlayout.widget.Placeholder;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.ArrayList;

public final class ConstraintLayout$b
implements Zw$b {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public ConstraintLayout$b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean c(int n3, int n4, int n7) {
        boolean bl2 = true;
        if (n3 == n4) {
            return bl2;
        }
        n3 = View.MeasureSpec.getMode((int)n3);
        int n8 = View.MeasureSpec.getMode((int)n4);
        n4 = View.MeasureSpec.getSize((int)n4);
        int n10 = 0x40000000;
        if (n8 != n10 || n3 != (n8 = -1 << -1) && n3 != 0 || n7 != n4) {
            bl2 = false;
        }
        return bl2;
    }

    public final void a() {
        ConstraintLayout constraintLayout = this.a;
        int n3 = constraintLayout.getChildCount();
        int n4 = 0;
        ConstraintHelper constraintHelper = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            Object object = constraintLayout.getChildAt(i3);
            int n8 = object instanceof Placeholder;
            if (n8 == 0) continue;
            object = (Placeholder)((Object)object);
            Object object2 = object.b;
            if (object2 == null) continue;
            object2 = (ConstraintLayout$LayoutParams)object.getLayoutParams();
            object = (ConstraintLayout$LayoutParams)object.b.getLayoutParams();
            Object object3 = object.q0;
            ((Y50)object3).k0 = 0;
            Y50 y50 = ((ConstraintLayout$LayoutParams)((Object)object2)).q0;
            Y50$b y50$b = y50.W[0];
            Y50$b y50$b2 = Y50$b.FIXED;
            if (y50$b != y50$b2) {
                n7 = ((Y50)object3).v();
                y50.W(n7);
            }
            object2 = ((ConstraintLayout$LayoutParams)((Object)object2)).q0;
            object3 = ((Y50)object2).W;
            int n10 = 1;
            if ((object3 = object3[n10]) != y50$b2) {
                object3 = object.q0;
                n7 = ((Y50)object3).p();
                ((Y50)object2).R(n7);
            }
            object = object.q0;
            object.k0 = n8 = 8;
        }
        ArrayList arrayList = ConstraintLayout.access$200(constraintLayout);
        n3 = arrayList.size();
        if (n3 > 0) {
            while (n4 < n3) {
                constraintHelper = (ConstraintHelper)((Object)ConstraintLayout.access$200(constraintLayout).get(n4));
                ((Object)((Object)constraintHelper)).getClass();
                ++n4;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(Y50 y50, Zw$a zw$a) {
        int n3;
        float f5;
        float f6;
        float f7;
        Y50$b y50$b;
        float f8;
        int n4;
        Y50$b y50$b2;
        Y50$b y50$b3;
        Object object;
        v50_0 v50_02;
        float f11;
        float f12;
        Y50$b y50$b4;
        v50_0 v50_03;
        int n7;
        View view;
        int n8;
        int n10;
        int n14;
        int n15;
        Y50$b y50$b5;
        Y50$b y50$b6;
        ConstraintLayout constraintLayout;
        View view2;
        int n16;
        float f14;
        int n17;
        int n18;
        Zw$a zw$a2;
        Y50 y502;
        Object object2;
        block66: {
            block62: {
                block63: {
                    v50_0 v50_04;
                    block64: {
                        block65: {
                            int[] nArray;
                            block60: {
                                block56: {
                                    block61: {
                                        block57: {
                                            block58: {
                                                block59: {
                                                    object2 = this;
                                                    y502 = y50;
                                                    zw$a2 = zw$a;
                                                    if (y50 == null) {
                                                        return;
                                                    }
                                                    n18 = y50.k0;
                                                    n17 = 8;
                                                    f14 = 1.1E-44f;
                                                    n16 = 0;
                                                    view2 = null;
                                                    if (n18 == n17 && (n18 = (int)(y50.H ? 1 : 0)) == 0) {
                                                        zw$a.e = 0;
                                                        zw$a.f = 0;
                                                        zw$a.g = 0;
                                                        return;
                                                    }
                                                    Y50 y503 = y502.X;
                                                    if (y503 == null) {
                                                        return;
                                                    }
                                                    constraintLayout = ((ConstraintLayout$b)object2).h;
                                                    ConstraintLayout.access$000(constraintLayout);
                                                    y50$b6 = zw$a2.a;
                                                    y50$b5 = zw$a2.b;
                                                    n15 = zw$a2.c;
                                                    n14 = zw$a2.d;
                                                    n10 = ((ConstraintLayout$b)object2).b;
                                                    n8 = ((ConstraintLayout$b)object2).c;
                                                    n10 += n8;
                                                    n8 = ((ConstraintLayout$b)object2).d;
                                                    view = (View)y502.j0;
                                                    nArray = ConstraintLayout$a.a;
                                                    n7 = y50$b6.ordinal();
                                                    n7 = nArray[n7];
                                                    v50_04 = y502.N;
                                                    v50_03 = y502.L;
                                                    n16 = 2;
                                                    y50$b4 = y50$b6;
                                                    n17 = 1;
                                                    f14 = Float.MIN_VALUE;
                                                    if (n7 == n17) break block56;
                                                    if (n7 == n16) break block57;
                                                    n15 = 3;
                                                    f12 = 4.2E-45f;
                                                    if (n7 == n15) break block58;
                                                    n15 = 4;
                                                    f12 = 5.6E-45f;
                                                    if (n7 == n15) break block59;
                                                    n15 = 0;
                                                    f12 = 0.0f;
                                                    break block60;
                                                }
                                                n15 = ((ConstraintLayout$b)object2).f;
                                                n7 = -2;
                                                f11 = 0.0f / 0.0f;
                                                n15 = ViewGroup.getChildMeasureSpec((int)n15, (int)n8, (int)n7);
                                                n8 = y502.t;
                                                if (n8 == n17) {
                                                    n8 = 1;
                                                } else {
                                                    n8 = 0;
                                                    v50_02 = null;
                                                }
                                                n7 = zw$a2.j;
                                                if (n7 != n17 && n7 != n16) break block60;
                                                n7 = view.getMeasuredHeight();
                                                if (n7 == (n17 = y50.p())) {
                                                    n17 = 1;
                                                    f14 = Float.MIN_VALUE;
                                                } else {
                                                    n17 = 0;
                                                    f14 = 0.0f;
                                                    y50$b6 = null;
                                                }
                                                n7 = zw$a2.j;
                                                if (n7 != n16 && n8 != 0 && (n8 == 0 || n17 == 0) && (n17 = view instanceof Placeholder) == 0 && (n17 = (int)(y50.F() ? 1 : 0)) == 0) break block60;
                                                n17 = y50.v();
                                                n15 = 0x40000000;
                                                f12 = 2.0f;
                                                n17 = View.MeasureSpec.makeMeasureSpec((int)n17, (int)n15);
                                                break block61;
                                            }
                                            n17 = ((ConstraintLayout$b)object2).f;
                                            if (v50_03 != null) {
                                                n15 = v50_03.g;
                                            } else {
                                                n15 = 0;
                                                f12 = 0.0f;
                                            }
                                            if (v50_04 != null) {
                                                n7 = v50_04.g;
                                                n15 += n7;
                                            }
                                            n8 += n15;
                                            n15 = -1;
                                            f12 = 0.0f / 0.0f;
                                            n17 = ViewGroup.getChildMeasureSpec((int)n17, (int)n8, (int)n15);
                                            break block61;
                                        }
                                        n17 = ((ConstraintLayout$b)object2).f;
                                        n15 = -2;
                                        f12 = 0.0f / 0.0f;
                                        n17 = ViewGroup.getChildMeasureSpec((int)n17, (int)n8, (int)n15);
                                    }
                                    n15 = n17;
                                    break block60;
                                }
                                n17 = 0x40000000;
                                f14 = 2.0f;
                                n15 = View.MeasureSpec.makeMeasureSpec((int)n15, (int)n17);
                            }
                            n17 = y50$b5.ordinal();
                            n17 = nArray[n17];
                            n8 = 1;
                            if (n17 == n8) break block62;
                            if (n17 == n16) break block63;
                            n14 = 3;
                            if (n17 == n14) break block64;
                            n14 = 4;
                            if (n17 == n14) break block65;
                            n17 = 0;
                            f14 = 0.0f;
                            y50$b6 = null;
                            break block66;
                        }
                        n17 = ViewGroup.getChildMeasureSpec((int)((ConstraintLayout$b)object2).g, (int)n10, (int)-2);
                        n14 = y502.u;
                        if (n14 == n8) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            object = null;
                        }
                        n10 = zw$a2.j;
                        if (n10 == n8 || n10 == n16) {
                            n10 = view.getMeasuredWidth();
                            if (n10 == (n8 = y50.v())) {
                                n10 = 1;
                            } else {
                                n10 = 0;
                                y50$b3 = null;
                            }
                            n8 = zw$a2.j;
                            if (n8 == n16 || n14 == 0 || n14 != 0 && n10 != 0 || (n14 = view instanceof Placeholder) != 0 || (n14 = (int)(y50.G() ? 1 : 0)) != 0) {
                                n17 = y50.p();
                                n14 = 0x40000000;
                                n17 = View.MeasureSpec.makeMeasureSpec((int)n17, (int)n14);
                            }
                        }
                        break block66;
                    }
                    n17 = ((ConstraintLayout$b)object2).g;
                    if (v50_03 != null) {
                        object = y502.M;
                        n14 = ((v50_0)object).g;
                    } else {
                        n14 = 0;
                        object = null;
                    }
                    if (v50_04 != null) {
                        v50_02 = y502.O;
                        n8 = v50_02.g;
                        n14 += n8;
                    }
                    n10 += n14;
                    n14 = -1;
                    n17 = ViewGroup.getChildMeasureSpec((int)n17, (int)n10, (int)n14);
                    break block66;
                }
                n17 = ((ConstraintLayout$b)object2).g;
                n14 = -2;
                n17 = ViewGroup.getChildMeasureSpec((int)n17, (int)n10, (int)n14);
                break block66;
            }
            f14 = 2.0f;
            n17 = n14 = View.MeasureSpec.makeMeasureSpec((int)n14, (int)0x40000000);
        }
        object = (Z50)y502.X;
        if (object != null) {
            n10 = ConstraintLayout.access$100(constraintLayout);
            n8 = 256;
            if ((n10 = (int)(T92.b(n10, n8) ? 1 : 0)) != 0 && (n10 = view.getMeasuredWidth()) == (n8 = y50.v()) && (n10 = view.getMeasuredWidth()) < (n8 = ((Y50)object).v()) && (n10 = view.getMeasuredHeight()) == (n8 = y50.p()) && (n10 = view.getMeasuredHeight()) < (n14 = ((Y50)object).p()) && (n14 = view.getBaseline()) == (n10 = y502.e0) && (n14 = (int)(y50.E() ? 1 : 0)) == 0) {
                n14 = y502.J;
                n10 = y50.v();
                if ((n14 = (int)(ConstraintLayout$b.c(n14, n15, n10) ? 1 : 0)) != 0) {
                    n14 = y502.K;
                    n10 = y50.p();
                    if ((n14 = (int)(ConstraintLayout$b.c(n14, n17, n10) ? 1 : 0)) != 0) {
                        int n19;
                        zw$a2.e = n18 = y50.v();
                        zw$a2.f = n18 = y50.p();
                        zw$a2.g = n19 = y502.e0;
                        return;
                    }
                }
            }
        }
        object = Y50$b.MATCH_CONSTRAINT;
        y50$b3 = y50$b4;
        if (y50$b4 == object) {
            n8 = 1;
        } else {
            n8 = 0;
            v50_02 = null;
        }
        if (y50$b5 == object) {
            n14 = 1;
        } else {
            n14 = 0;
            object = null;
        }
        Y50$b y50$b7 = Y50$b.MATCH_PARENT;
        if (y50$b5 != y50$b7 && y50$b5 != (y50$b2 = Y50$b.FIXED)) {
            n4 = 0;
            f8 = 0.0f;
            y50$b5 = null;
        } else {
            n4 = 1;
            f8 = Float.MIN_VALUE;
        }
        if (y50$b3 != y50$b7 && y50$b3 != (y50$b = Y50$b.FIXED)) {
            n10 = 0;
            y50$b3 = null;
        } else {
            n10 = 1;
        }
        int n20 = 0;
        Object var19_23 = null;
        if (n8 != 0 && (n7 = (int)((f7 = (f11 = y502.a0) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) > 0) {
            n7 = 1;
            f11 = Float.MIN_VALUE;
        } else {
            n7 = 0;
            f11 = 0.0f;
            y50$b2 = null;
        }
        if (n14 != 0 && (n20 = (f6 = (f5 = y502.a0) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0) {
            n20 = 1;
        } else {
            n20 = 0;
            Object var19_24 = null;
        }
        if (view == null) {
            return;
        }
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)view.getLayoutParams();
        int n21 = zw$a2.j;
        int n22 = 1;
        if (n21 != n22 && n21 != n16 && n8 != 0 && (n22 = y502.t) == 0 && n14 != 0 && (n22 = y502.u) == 0) {
            n22 = 0;
            object2 = null;
            n17 = 0;
            f14 = 0.0f;
            y50$b6 = null;
            n16 = -1;
            n8 = 0;
            v50_02 = null;
            n21 = 0;
            v50_03 = null;
        } else {
            int n24;
            n22 = view instanceof VirtualLayout;
            if (n22 != 0 && (n22 = y502 instanceof se3_0) != 0) {
                object2 = y502;
                object2 = (se3_0)y502;
                view2 = view;
                view2 = (VirtualLayout)view;
                view2.r((se3_0)object2, n15, n17);
            } else {
                view.measure(n15, n17);
            }
            y502.J = n15;
            y502.K = n17;
            object2 = null;
            y502.g = false;
            n22 = view.getMeasuredWidth();
            n16 = view.getMeasuredHeight();
            n14 = view.getBaseline();
            n8 = y502.w;
            n8 = n8 > 0 ? Math.max(n8, n22) : n22;
            n21 = y502.x;
            if (n21 > 0) {
                n8 = Math.min(n21, n8);
            }
            if ((n21 = y502.z) > 0) {
                n21 = Math.max(n21, n16);
                n24 = n17;
            } else {
                n24 = n17;
                n21 = n16;
            }
            n17 = y502.A;
            if (n17 > 0) {
                n21 = Math.min(n17, n21);
            }
            n17 = ConstraintLayout.access$100(constraintLayout);
            int n25 = n15;
            n15 = 1;
            f12 = Float.MIN_VALUE;
            if ((n17 = (int)(T92.b(n17, n15) ? 1 : 0)) == 0) {
                n17 = 0x3F000000;
                f14 = 0.5f;
                if (n7 != 0 && n4 != 0) {
                    f8 = y502.a0;
                    f12 = (float)n21 * f8 + f14;
                    n8 = n17 = (int)f12;
                } else if (n20 != 0 && n10 != 0) {
                    f8 = y502.a0;
                    f12 = (float)n8 / f8 + f14;
                    n21 = n17 = (int)f12;
                }
            }
            if (n22 == n8 && n16 == n21) {
                n22 = n14;
                n17 = n8;
                n16 = -1;
                n8 = 0;
                v50_02 = null;
            } else {
                if (n22 != n8) {
                    n22 = 0x40000000;
                    n15 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)n22);
                } else {
                    n22 = 0x40000000;
                    n15 = n25;
                }
                n17 = n16 != n21 ? View.MeasureSpec.makeMeasureSpec((int)n21, (int)n22) : n24;
                view.measure(n15, n17);
                y502.J = n15;
                y502.K = n17;
                n8 = 0;
                v50_02 = null;
                y502.g = false;
                n22 = view.getMeasuredWidth();
                n17 = view.getMeasuredHeight();
                n16 = view.getBaseline();
                n21 = n17;
                n17 = n22;
                n22 = n16;
                n16 = -1;
            }
        }
        if (n22 != n16) {
            n16 = 1;
        } else {
            n16 = 0;
            view2 = null;
        }
        n4 = zw$a2.c;
        if (n17 != n4 || n21 != (n4 = zw$a2.d)) {
            n8 = 1;
        }
        zw$a2.i = n8;
        n4 = (int)(constraintLayout$LayoutParams.c0 ? 1 : 0);
        n8 = n4 != 0 ? 1 : n16;
        if (n8 != 0 && n22 != (n16 = -1) && (n3 = y502.e0) != n22) {
            n3 = 1;
            zw$a2.i = n3;
        }
        zw$a2.e = n17;
        zw$a2.f = n21;
        zw$a2.h = n8;
        zw$a2.g = n22;
        ConstraintLayout.access$000(constraintLayout);
    }
}

