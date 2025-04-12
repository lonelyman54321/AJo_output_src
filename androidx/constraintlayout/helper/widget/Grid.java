/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Grid
extends VirtualLayout {
    public final HashSet A;
    public int[] B;
    public View[] l;
    public ConstraintLayout m;
    public int n;
    public int o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String t;
    public String u;
    public float v;
    public float w;
    public int x;
    public int y = 0;
    public boolean[][] z;

    public Grid(Context object) {
        super((Context)object);
        super();
        this.A = object;
    }

    public Grid(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        super();
        this.A = object;
    }

    public Grid(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        super();
        this.A = object;
    }

    public static int[][] B(String stringArray) {
        int n3;
        stringArray = stringArray.split(",");
        int n4 = stringArray.length;
        int n7 = 2;
        int[] nArray = new int[n7];
        int n8 = 1;
        nArray[n8] = 3;
        nArray[0] = n4;
        int[][] nArray2 = (int[][])Array.newInstance(Integer.TYPE, nArray);
        nArray = null;
        for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
            Object[] objectArray = stringArray[i3].trim().split(":");
            Object object = objectArray[n8].split("x");
            Object object2 = nArray2[i3];
            object2[0] = n3 = Integer.parseInt(objectArray[0]);
            objectArray = nArray2[i3];
            object2 = object[0];
            int n10 = Integer.parseInt((String)object2);
            objectArray[n8] = (String)n10;
            objectArray = nArray2[i3];
            object = object[n8];
            int n14 = Integer.parseInt((String)object);
            objectArray[n7] = (String)n14;
        }
        return nArray2;
    }

    public static float[] C(int n3, String stringArray) {
        String string2;
        int n4;
        float[] fArray = null;
        if (stringArray != null && (n4 = (string2 = stringArray.trim()).isEmpty()) == 0) {
            string2 = ",";
            n4 = (stringArray = stringArray.split(string2)).length;
            if (n4 != n3) {
                return null;
            }
            fArray = new float[n3];
            string2 = null;
            for (n4 = 0; n4 < n3; ++n4) {
                float f5;
                String string3 = stringArray[n4].trim();
                fArray[n4] = f5 = Float.parseFloat(string3);
            }
        }
        return fArray;
    }

    private int getNextPosition() {
        boolean bl2 = false;
        int n3 = 0;
        while (!bl2) {
            n3 = this.y;
            int n4 = this.n;
            int n7 = this.p;
            if (n3 >= (n4 *= n7)) {
                return -1;
            }
            n4 = this.x(n3);
            n7 = this.y;
            n7 = this.w(n7);
            boolean[][] blArray = this.z;
            boolean[] blArray2 = blArray[n4];
            boolean bl3 = blArray2[n7];
            int n8 = 1;
            if (bl3) {
                blArray2[n7] = false;
                bl2 = true;
            }
            this.y = n4 = this.y + n8;
        }
        return n3;
    }

    public static void s(View view) {
        int n3;
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)view.getLayoutParams();
        constraintLayout$LayoutParams.H = -1.0f;
        constraintLayout$LayoutParams.f = n3 = -1;
        constraintLayout$LayoutParams.e = n3;
        constraintLayout$LayoutParams.g = n3;
        constraintLayout$LayoutParams.h = n3;
        constraintLayout$LayoutParams.leftMargin = n3;
        view.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public static void t(View view) {
        int n3;
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)view.getLayoutParams();
        constraintLayout$LayoutParams.I = -1.0f;
        constraintLayout$LayoutParams.j = n3 = -1;
        constraintLayout$LayoutParams.i = n3;
        constraintLayout$LayoutParams.k = n3;
        constraintLayout$LayoutParams.l = n3;
        constraintLayout$LayoutParams.topMargin = n3;
        view.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public final View A() {
        Object object = this.getContext();
        View view = new View(object);
        int n3 = View.generateViewId();
        view.setId(n3);
        view.setVisibility(4);
        object = new ConstraintLayout$LayoutParams(0, 0);
        this.m.addView(view, (ViewGroup.LayoutParams)object);
        return view;
    }

    public final void D() {
        int n3;
        int n4 = this.o;
        if (n4 != 0 && (n3 = this.q) != 0) {
            this.n = n4;
            this.p = n3;
        } else {
            n3 = this.q;
            if (n3 > 0) {
                this.p = n3;
                this.n = n4 = (this.b + n3 + -1) / n3;
            } else if (n4 > 0) {
                this.n = n4;
                this.p = n3 = (this.b + n4 + -1) / n4;
            } else {
                double d2 = Math.sqrt(this.b);
                double d5 = 1.5;
                this.n = n4 = (int)(d2 += d5);
                this.p = n3 = (this.b + n4 + -1) / n4;
            }
        }
    }

    public String getColumnWeights() {
        return this.u;
    }

    public int getColumns() {
        return this.q;
    }

    public float getHorizontalGaps() {
        return this.v;
    }

    public int getOrientation() {
        return this.x;
    }

    public String getRowWeights() {
        return this.t;
    }

    public int getRows() {
        return this.o;
    }

    public String getSkips() {
        return this.s;
    }

    public String getSpans() {
        return this.r;
    }

    public float getVerticalGaps() {
        return this.w;
    }

    public final void k(AttributeSet attributeSet) {
        int n3;
        super.k(attributeSet);
        this.e = n3 = 1;
        if (attributeSet != null) {
            Context context = this.getContext();
            int[] nArray = R$styleable.Grid;
            attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
            n3 = attributeSet.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                float f5;
                String string2;
                int n4;
                int n7 = attributeSet.getIndex(i3);
                if (n7 == (n4 = R$styleable.Grid_grid_rows)) {
                    this.o = n7 = attributeSet.getInteger(n7, 0);
                    continue;
                }
                n4 = R$styleable.Grid_grid_columns;
                if (n7 == n4) {
                    this.q = n7 = attributeSet.getInteger(n7, 0);
                    continue;
                }
                n4 = R$styleable.Grid_grid_spans;
                if (n7 == n4) {
                    this.r = string2 = attributeSet.getString(n7);
                    continue;
                }
                n4 = R$styleable.Grid_grid_skips;
                if (n7 == n4) {
                    this.s = string2 = attributeSet.getString(n7);
                    continue;
                }
                n4 = R$styleable.Grid_grid_rowWeights;
                if (n7 == n4) {
                    this.t = string2 = attributeSet.getString(n7);
                    continue;
                }
                n4 = R$styleable.Grid_grid_columnWeights;
                if (n7 == n4) {
                    this.u = string2 = attributeSet.getString(n7);
                    continue;
                }
                n4 = R$styleable.Grid_grid_orientation;
                if (n7 == n4) {
                    this.x = n7 = attributeSet.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.Grid_grid_horizontalGaps;
                if (n7 == n4) {
                    this.v = f5 = attributeSet.getDimension(n7, 0.0f);
                    continue;
                }
                n4 = R$styleable.Grid_grid_verticalGaps;
                if (n7 == n4) {
                    this.w = f5 = attributeSet.getDimension(n7, 0.0f);
                    continue;
                }
                n4 = R$styleable.Grid_grid_validateInputs;
                if (n7 == n4) {
                    attributeSet.getBoolean(n7, false);
                    continue;
                }
                n4 = R$styleable.Grid_grid_useRtl;
                if (n7 != n4) continue;
                attributeSet.getBoolean(n7, false);
            }
            this.D();
            this.y();
            attributeSet.recycle();
        }
    }

    public final void onAttachedToWindow() {
        ConstraintLayout constraintLayout;
        super.onAttachedToWindow();
        this.m = constraintLayout = (ConstraintLayout)this.getParent();
        this.v(false);
    }

    public final void onDraw(Canvas canvas) {
        boolean bl2 = this.isInEditMode();
        if (!bl2) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(-65536);
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
        int n3 = this.getTop();
        int n4 = this.getLeft();
        int n7 = this.getBottom();
        int n8 = this.getRight();
        View[] viewArray = this.l;
        int n10 = viewArray.length;
        int n14 = 0;
        style2 = null;
        for (int i3 = 0; i3 < n10; ++i3) {
            style2 = viewArray[i3];
            int n15 = style2.getLeft() - n4;
            int n16 = style2.getTop() - n3;
            int n17 = style2.getRight() - n4;
            int n18 = style2.getBottom() - n3;
            float f5 = n15;
            float f6 = n17;
            float f7 = n7 - n3;
            n17 = 0;
            style2 = canvas;
            int n19 = n3;
            n3 = n18;
            canvas.drawRect(f5, 0.0f, f6, f7, paint);
            float f8 = n16;
            n14 = n8 - n4;
            f6 = n14;
            f7 = n18;
            n15 = 0;
            f5 = 0.0f;
            canvas.drawRect(0.0f, f8, f6, f7, paint);
            n3 = n19;
        }
    }

    public void setColumnWeights(String string2) {
        boolean bl2;
        String string3 = this.u;
        if (string3 != null && (bl2 = string3.equals(string2))) {
            return;
        }
        this.u = string2;
        this.v(true);
        this.invalidate();
    }

    public void setColumns(int n3) {
        int n4 = 50;
        if (n3 > n4) {
            return;
        }
        n4 = this.q;
        if (n4 == n3) {
            return;
        }
        this.q = n3;
        this.D();
        this.y();
        this.v(false);
        this.invalidate();
    }

    public void setHorizontalGaps(float f5) {
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            return;
        }
        f6 = this.v;
        float f8 = f6 - f5;
        object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object == false) {
            return;
        }
        this.v = f5;
        this.v(true);
        this.invalidate();
    }

    public void setOrientation(int n3) {
        int n4 = 1;
        if (n3 != 0 && n3 != n4) {
            return;
        }
        int n7 = this.x;
        if (n7 == n3) {
            return;
        }
        this.x = n3;
        this.v(n4 != 0);
        this.invalidate();
    }

    public void setRowWeights(String string2) {
        boolean bl2;
        String string3 = this.t;
        if (string3 != null && (bl2 = string3.equals(string2))) {
            return;
        }
        this.t = string2;
        this.v(true);
        this.invalidate();
    }

    public void setRows(int n3) {
        int n4 = 50;
        if (n3 > n4) {
            return;
        }
        n4 = this.o;
        if (n4 == n3) {
            return;
        }
        this.o = n3;
        this.D();
        this.y();
        this.v(false);
        this.invalidate();
    }

    public void setSkips(String string2) {
        boolean bl2;
        String string3 = this.s;
        if (string3 != null && (bl2 = string3.equals(string2))) {
            return;
        }
        this.s = string2;
        this.v(true);
        this.invalidate();
    }

    public void setSpans(CharSequence charSequence) {
        boolean bl2;
        String string2 = this.r;
        if (string2 != null && (bl2 = string2.contentEquals(charSequence))) {
            return;
        }
        charSequence = charSequence.toString();
        this.r = charSequence;
        this.v(true);
        this.invalidate();
    }

    public void setVerticalGaps(float f5) {
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            return;
        }
        f6 = this.w;
        float f8 = f6 - f5;
        object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object == false) {
            return;
        }
        this.w = f5;
        this.v(true);
        this.invalidate();
    }

    public final void u(View view, int n3, int n4, int n7, int n8) {
        int n10;
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)view.getLayoutParams();
        int[] nArray = this.B;
        constraintLayout$LayoutParams.e = n10 = nArray[n4];
        constraintLayout$LayoutParams.i = n10 = nArray[n3];
        n4 = n4 + n8 + -1;
        constraintLayout$LayoutParams.h = n4 = nArray[n4];
        n3 = n3 + n7 + -1;
        constraintLayout$LayoutParams.l = n3 = nArray[n3];
        view.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public final void v(boolean n3) {
        int n4;
        int n7;
        Object object = this.m;
        if (object != null && (n7 = this.n) >= (n4 = 1) && (n7 = this.p) >= n4) {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            int n8;
            Object object8;
            Object object9;
            int n10;
            Object object10;
            int n14;
            Object object11;
            object = this.A;
            int n15 = 0;
            if (n3 != 0) {
                object11 = null;
                for (n3 = 0; n3 < (n14 = ((boolean[][])(object10 = this.z)).length); ++n3) {
                    object10 = null;
                    for (n14 = 0; n14 < (n10 = ((boolean[])(object9 = (object8 = this.z)[0])).length); ++n14) {
                        object8 = object8[n3];
                        object8[n14] = (boolean[])n4;
                    }
                }
                ((HashSet)object).clear();
            }
            this.y = 0;
            n3 = this.n;
            n14 = this.p;
            n3 = Math.max(n3, n14);
            object10 = this.l;
            if (object10 == null) {
                object10 = new View[n3];
                this.l = (View[])object10;
                object10 = null;
                for (n14 = 0; n14 < (n10 = ((boolean[][])(object8 = (Object)this.l)).length); ++n14) {
                    object9 = this.A();
                    object8[n14] = object9;
                }
            } else {
                n14 = ((boolean[][])object10).length;
                if (n3 != n14) {
                    object10 = new View[n3];
                    object8 = null;
                    for (n8 = 0; n8 < n3; ++n8) {
                        object9 = this.l;
                        object7 = ((boolean[])object9).length;
                        if (n8 < object7) {
                            object9 = object9[n8];
                            object10[n8] = object9;
                            continue;
                        }
                        object9 = this.A();
                        object10[n8] = object9;
                    }
                    for (n8 = n3; n8 < (object7 = ((boolean[])(object9 = (Object)this.l)).length); ++n8) {
                        object9 = object9[n8];
                        object6 = this.m;
                        object6.removeView((View)object9);
                    }
                    this.l = (View[])object10;
                }
            }
            object11 = new int[n3];
            this.B = object11;
            object11 = null;
            for (n3 = 0; n3 < (n8 = ((boolean[][])(object10 = (Object)this.l)).length); ++n3) {
                object8 = this.B;
                object10 = object10[n3];
                n14 = object10.getId();
                object8[n3] = (boolean[])n14;
            }
            n3 = this.getId();
            n14 = this.n;
            n8 = this.p;
            n14 = Math.max(n14, n8);
            n8 = this.n;
            object9 = this.t;
            object8 = Grid.C(n8, (String)object9);
            n10 = this.n;
            if (n10 == n4) {
                object10 = (Object)((ConstraintLayout$LayoutParams)this.l[0].getLayoutParams());
                object8 = this.l[0];
                Grid.t((View)object8);
                object10.i = n3;
                object10.l = n3;
                object11 = this.l[0];
                object11.setLayoutParams((ViewGroup.LayoutParams)object10);
            } else {
                object9 = null;
                for (n10 = 0; n10 < (object7 = this.n); ++n10) {
                    object6 = (ConstraintLayout$LayoutParams)this.l[n10].getLayoutParams();
                    object5 = this.l[n10];
                    Grid.t(object5);
                    if (object8 != null) {
                        object4 = object8[n10];
                        ((ConstraintLayout$LayoutParams)((Object)object6)).I = (float)object4;
                    }
                    if (n10 > 0) {
                        object5 = this.B;
                        object3 = n10 + -1;
                        ((ConstraintLayout$LayoutParams)((Object)object6)).j = object2 = (Object)object5[object3];
                    } else {
                        ((ConstraintLayout$LayoutParams)((Object)object6)).i = n3;
                    }
                    object2 = this.n - n4;
                    if (n10 < object2) {
                        object5 = this.B;
                        object3 = n10 + 1;
                        ((ConstraintLayout$LayoutParams)((Object)object6)).k = object2 = (Object)object5[object3];
                    } else {
                        ((ConstraintLayout$LayoutParams)((Object)object6)).l = n3;
                    }
                    if (n10 > 0) {
                        object4 = this.v;
                        ((ViewGroup.MarginLayoutParams)object6).topMargin = object2 = (int)object4;
                    }
                    object5 = this.l[n10];
                    object5.setLayoutParams((ViewGroup.LayoutParams)object6);
                }
                while (object7 < n14) {
                    object8 = (Object)((ConstraintLayout$LayoutParams)this.l[object7].getLayoutParams());
                    Grid.t(this.l[object7]);
                    object8.i = n3;
                    object8.l = n3;
                    object9 = this.l[object7];
                    object9.setLayoutParams((ViewGroup.LayoutParams)object8);
                    ++object7;
                }
            }
            n3 = this.getId();
            n14 = this.n;
            n8 = this.p;
            n14 = Math.max(n14, n8);
            n8 = this.p;
            object9 = this.u;
            object8 = Grid.C(n8, (String)object9);
            object9 = (Object)((ConstraintLayout$LayoutParams)this.l[0].getLayoutParams());
            object7 = this.p;
            if (object7 == n4) {
                object10 = this.l[0];
                Grid.s((View)object10);
                object9.e = n3;
                object9.h = n3;
                object11 = this.l[0];
                object11.setLayoutParams((ViewGroup.LayoutParams)object9);
            } else {
                object9 = null;
                for (n10 = 0; n10 < (object7 = this.p); ++n10) {
                    object6 = (ConstraintLayout$LayoutParams)this.l[n10].getLayoutParams();
                    object5 = this.l[n10];
                    Grid.s(object5);
                    if (object8 != null) {
                        object4 = object8[n10];
                        ((ConstraintLayout$LayoutParams)((Object)object6)).H = (float)object4;
                    }
                    if (n10 > 0) {
                        object5 = this.B;
                        object3 = n10 + -1;
                        ((ConstraintLayout$LayoutParams)((Object)object6)).f = object2 = (Object)object5[object3];
                    } else {
                        ((ConstraintLayout$LayoutParams)((Object)object6)).e = n3;
                    }
                    object2 = this.p - n4;
                    if (n10 < object2) {
                        object5 = this.B;
                        object3 = n10 + 1;
                        ((ConstraintLayout$LayoutParams)((Object)object6)).g = object2 = (Object)object5[object3];
                    } else {
                        ((ConstraintLayout$LayoutParams)((Object)object6)).h = n3;
                    }
                    if (n10 > 0) {
                        object4 = this.v;
                        ((ViewGroup.MarginLayoutParams)object6).leftMargin = object2 = (int)object4;
                    }
                    object5 = this.l[n10];
                    object5.setLayoutParams((ViewGroup.LayoutParams)object6);
                }
                while (object7 < n14) {
                    object8 = (Object)((ConstraintLayout$LayoutParams)this.l[object7].getLayoutParams());
                    Grid.s(this.l[object7]);
                    object8.e = n3;
                    object8.h = n3;
                    object9 = this.l[object7];
                    object9.setLayoutParams((ViewGroup.LayoutParams)object8);
                    ++object7;
                }
            }
            object11 = this.s;
            n14 = 2;
            if (object11 != null && (n3 = (int)((object11 = object11.trim()).isEmpty() ? 1 : 0)) == 0 && (object11 = (Object)Grid.B(this.s)) != null) {
                object8 = null;
                for (n8 = 0; n8 < (n10 = ((int[])object11).length); ++n8) {
                    object9 = object11[n8];
                    n10 = object9[0];
                    n10 = this.x(n10);
                    object6 = object11[n8];
                    object7 = (Object)object6[0];
                    if ((n10 = (int)(this.z(n10, (int)(object7 = this.w((int)object7)), (int)(object3 = (Object)(object5 = (Object)object11[n8])[n4]), (int)(object2 = (Object)object5[n14])) ? 1 : 0)) == 0) break;
                }
            }
            if ((object11 = this.r) != null && (n3 = (int)((object11 = object11.trim()).isEmpty() ? 1 : 0)) == 0 && (object11 = (Object)Grid.B(this.r)) != null) {
                object8 = this.a;
                object9 = (Object)this.m;
                object9 = this.j((ConstraintLayout)((Object)object9));
                object6 = null;
                for (object7 = 0; object7 < (object2 = ((int[])object11).length); ++object7) {
                    object2 = object11[object7][0];
                    int n16 = this.x((int)object2);
                    object2 = object11[object7][0];
                    int n17 = this.w((int)object2);
                    object5 = object11[object7];
                    object3 = object5[n4];
                    object2 = object5[n14];
                    if ((object2 = (Object)this.z(n16, n17, (int)object3, (int)object2)) == 0) break;
                    boolean bl2 = object9[object7];
                    object5 = object11[object7];
                    View view = object5[n4];
                    View view2 = object5[n14];
                    this.u((View)bl2, n16, n17, (int)view, (int)view2);
                    object2 = object8[object7];
                    object5 = Integer.valueOf(object2);
                    ((HashSet)object).add(object5);
                }
            }
            object11 = this.m;
            object11 = this.j((ConstraintLayout)((Object)object11));
            while (n15 < (n4 = this.b)) {
                Integer n18 = this.a[n15];
                n4 = (int)(((HashSet)object).contains(n18) ? 1 : 0);
                if (n4 == 0) {
                    n4 = this.getNextPosition();
                    n10 = this.x(n4);
                    object7 = this.w(n4);
                    n14 = -1;
                    if (n4 == n14) break;
                    object8 = object11[n15];
                    object2 = 1;
                    object4 = Float.MIN_VALUE;
                    object3 = 1;
                    object10 = (Object)this;
                    this.u((View)object8, n10, (int)object7, (int)object2, (int)object3);
                }
                ++n15;
            }
        }
    }

    public final int w(int n3) {
        int n4 = this.x;
        int n7 = 1;
        if (n4 == n7) {
            n4 = this.n;
            return n3 / n4;
        }
        n4 = this.p;
        return n3 % n4;
    }

    public final int x(int n3) {
        int n4 = this.x;
        int n7 = 1;
        if (n4 == n7) {
            n4 = this.n;
            return n3 % n4;
        }
        n4 = this.p;
        return n3 / n4;
    }

    public final void y() {
        int n3 = this.n;
        int n4 = this.p;
        int[] nArray = new int[2];
        boolean bl2 = true;
        nArray[bl2] = n4;
        nArray[0] = n3;
        boolean[][] blArray = (boolean[][])Array.newInstance(Boolean.TYPE, nArray);
        this.z = blArray;
        for (boolean[] blArray2 : blArray) {
            Arrays.fill(blArray2, bl2);
        }
    }

    public final boolean z(int n3, int n4, int n7, int n8) {
        int n10;
        for (int i3 = n3; i3 < (n10 = n3 + n7); ++i3) {
            int n14;
            for (n10 = n4; n10 < (n14 = n4 + n8); ++n10) {
                boolean[] blArray;
                Object object = this.z;
                Object object2 = ((boolean[][])object).length;
                if (i3 < object2 && n10 < (object2 = (blArray = object[0]).length) && (object2 = (Object)(object = (Object)object[i3])[n10]) != 0) {
                    object[n10] = (boolean[])false;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}

