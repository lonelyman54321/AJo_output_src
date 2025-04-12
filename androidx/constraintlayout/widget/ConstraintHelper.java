/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.View
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b$b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper
extends View {
    public int[] a;
    public int b;
    public final Context c;
    public F41 d;
    public boolean e;
    public String f;
    public String g;
    public View[] h;
    public final HashMap i;

    public ConstraintHelper(Context context) {
        super(context);
        HashMap hashMap;
        int[] nArray = new int[32];
        this.a = nArray;
        this.e = false;
        this.h = null;
        this.i = hashMap = new HashMap();
        this.c = context;
        this.k(null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object object = new int[32];
        this.a = object;
        this.e = false;
        this.h = null;
        object = new HashMap;
        super();
        this.i = object;
        this.c = context;
        this.k(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        Object object = new int[32];
        this.a = object;
        this.e = false;
        this.h = null;
        object = new HashMap;
        super();
        this.i = object;
        this.c = context;
        this.k(attributeSet);
    }

    public final void b(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            Context context = this.c;
            if (context == null) {
                return;
            }
            n3 = this.i(string2 = string2.trim());
            if (n3 != 0) {
                Integer n4 = n3;
                HashMap hashMap = this.i;
                hashMap.put(n4, string2);
                this.c(n3);
            }
        }
    }

    public final void c(int n3) {
        int[] nArray;
        int n4 = this.getId();
        if (n3 == n4) {
            return;
        }
        n4 = this.b + 1;
        int[] nArray2 = this.a;
        int n7 = nArray2.length;
        if (n4 > n7) {
            n4 = nArray2.length * 2;
            this.a = nArray = Arrays.copyOf(nArray2, n4);
        }
        nArray = this.a;
        int n8 = this.b;
        nArray[n8] = n3;
        this.b = ++n8;
    }

    public final void d(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            Object object = this.c;
            if (object == null) {
                return;
            }
            string2 = string2.trim();
            object = this.getParent();
            n3 = object instanceof ConstraintLayout;
            if (n3 != 0) {
                object = (ConstraintLayout)this.getParent();
            } else {
                n3 = 0;
                object = null;
            }
            if (object == null) {
                return;
            }
            int n4 = object.getChildCount();
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                View view = object.getChildAt(i3);
                Object object2 = view.getLayoutParams();
                int n8 = object2 instanceof ConstraintLayout$LayoutParams;
                if (n8 == 0 || (n7 = string2.equals(object2 = ((ConstraintLayout$LayoutParams)((Object)object2)).Y)) == 0 || (n7 = view.getId()) == (n8 = -1)) continue;
                int n10 = view.getId();
                this.c(n10);
            }
        }
    }

    public final void e() {
        boolean bl2;
        Object object = this.getParent();
        if (object != null && (bl2 = object instanceof ConstraintLayout)) {
            object = (ConstraintLayout)((Object)object);
            this.f((ConstraintLayout)((Object)object));
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int n3;
        int n4 = this.getVisibility();
        float f5 = this.getElevation();
        for (int i3 = 0; i3 < (n3 = this.b); ++i3) {
            n3 = this.a[i3];
            View view = constraintLayout.getViewById(n3);
            if (view == null) continue;
            view.setVisibility(n4);
            float f6 = 0.0f;
            float f7 = f5 - 0.0f;
            float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (f8 <= 0) continue;
            f6 = view.getTranslationZ() + f5;
            view.setTranslationZ(f6);
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        int[] nArray = this.a;
        int n3 = this.b;
        return Arrays.copyOf(nArray, n3);
    }

    public final int h(ConstraintLayout constraintLayout, String string2) {
        if (string2 != null && constraintLayout != null) {
            Resources resources = this.c.getResources();
            if (resources == null) {
                return 0;
            }
            int n3 = constraintLayout.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                String string3;
                int n4;
                View view = constraintLayout.getChildAt(i3);
                int n7 = view.getId();
                if (n7 == (n4 = -1)) continue;
                n7 = view.getId();
                try {
                    string3 = resources.getResourceEntryName(n7);
                }
                catch (Resources.NotFoundException notFoundException) {
                    n7 = 0;
                    string3 = null;
                }
                n7 = (int)(string2.equals(string3) ? 1 : 0);
                if (n7 == 0) continue;
                return view.getId();
            }
        }
        return 0;
    }

    public final int i(String string2) {
        Object object;
        boolean bl2;
        Object object2 = this.getParent();
        boolean bl3 = object2 instanceof ConstraintLayout;
        Resources resources = null;
        if (bl3) {
            object2 = (ConstraintLayout)this.getParent();
        } else {
            bl3 = false;
            object2 = null;
        }
        boolean bl4 = this.isInEditMode();
        int n3 = 0;
        if (bl4 && object2 != null && (bl2 = (object = ((ConstraintLayout)((Object)object2)).getDesignInformation(0, string2)) instanceof Integer)) {
            object = (Integer)object;
            n3 = (Integer)object;
        }
        if (n3 == 0 && object2 != null) {
            n3 = this.h((ConstraintLayout)((Object)object2), string2);
        }
        if (n3 == 0) {
            object2 = R$id.class;
            try {
                object2 = ((Class)object2).getField(string2);
            }
            catch (Exception exception) {}
            n3 = ((Field)object2).getInt(null);
        }
        if (n3 == 0) {
            object2 = this.c;
            resources = object2.getResources();
            object = "id";
            object2 = object2.getPackageName();
            n3 = resources.getIdentifier(string2, (String)object, (String)object2);
        }
        return n3;
    }

    public final View[] j(ConstraintLayout constraintLayout) {
        int n3;
        int n4;
        View[] viewArray = this.h;
        if (viewArray == null || (n4 = viewArray.length) != (n3 = this.b)) {
            n4 = this.b;
            this.h = viewArray = new View[n4];
        }
        viewArray = null;
        for (n4 = 0; n4 < (n3 = this.b); ++n4) {
            View view;
            n3 = this.a[n4];
            View[] viewArray2 = this.h;
            viewArray2[n4] = view = constraintLayout.getViewById(n3);
        }
        return this.h;
    }

    public void k(AttributeSet attributeSet) {
        if (attributeSet != null) {
            Context context = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_Layout;
            attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = attributeSet.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2;
                int n4;
                int n7 = attributeSet.getIndex(i3);
                if (n7 == (n4 = R$styleable.ConstraintLayout_Layout_constraint_referenced_ids)) {
                    this.f = string2 = attributeSet.getString(n7);
                    this.setIds(string2);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_constraint_referenced_tags;
                if (n7 != n4) continue;
                this.g = string2 = attributeSet.getString(n7);
                this.setReferenceTags(string2);
            }
            attributeSet.recycle();
        }
    }

    public void l(b$a object, F41 f41, Constraints$LayoutParams object2, SparseArray sparseArray) {
        int n3;
        Object object3;
        object = ((b$a)object).e;
        object2 = ((b$b)object).j0;
        int n4 = 0;
        if (object2 != null) {
            this.setReferencedIds((int[])object2);
        } else {
            object2 = ((b$b)object).k0;
            if (object2 != null) {
                object3 = object2.length();
                if (object3 > 0) {
                    int n7;
                    object2 = ((b$b)object).k0.split(",");
                    n3 = ((String[])object2).length;
                    int[] nArray = new int[n3];
                    Object object4 = 0;
                    for (int i3 = 0; i3 < (n7 = ((String[])object2).length); ++i3) {
                        String string2 = object2[i3].trim();
                        n7 = this.i(string2);
                        if (n7 == 0) continue;
                        Object object5 = object4 + 1;
                        nArray[object4] = n7;
                        object4 = object5;
                    }
                    object3 = ((String[])object2).length;
                    if (object4 != object3) {
                        nArray = Arrays.copyOf(nArray, object4);
                    }
                    ((b$b)object).j0 = nArray;
                } else {
                    object3 = 0;
                    object2 = null;
                    ((b$b)object).j0 = null;
                }
            }
        }
        f41.b();
        object2 = ((b$b)object).j0;
        if (object2 != null) {
            while (n4 < (n3 = ((Constraints$LayoutParams)(object2 = (Object)((b$b)object).j0)).length)) {
                object3 = object2[n4];
                if ((object2 = (Y50)sparseArray.get(object3)) != null) {
                    f41.a((Y50)object2);
                }
                ++n4;
            }
        }
    }

    public void m(Y50 y50, boolean bl2) {
    }

    public void n() {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String string2 = this.f;
        if (string2 != null) {
            this.setIds(string2);
        }
        if ((string2 = this.g) != null) {
            this.setReferenceTags(string2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int n3, int n4) {
        boolean bl2 = this.e;
        if (bl2) {
            super.onMeasure(n3, n4);
        } else {
            n3 = 0;
            this.setMeasuredDimension(0, 0);
        }
    }

    public void p(C41 c41, SparseArray sparseArray) {
        int n3;
        c41.b();
        for (int i3 = 0; i3 < (n3 = this.b); ++i3) {
            n3 = this.a[i3];
            Y50 y50 = (Y50)sparseArray.get(n3);
            c41.a(y50);
        }
    }

    public final void q() {
        Object object = this.d;
        if (object == null) {
            return;
        }
        object = this.getLayoutParams();
        boolean bl2 = object instanceof ConstraintLayout$LayoutParams;
        if (bl2) {
            object = (ConstraintLayout$LayoutParams)((Object)object);
            F41 f41 = this.d;
            ((ConstraintLayout$LayoutParams)((Object)object)).q0 = f41;
        }
    }

    public void setIds(String string2) {
        this.f = string2;
        if (string2 == null) {
            return;
        }
        int n3 = 0;
        String string3 = null;
        this.b = 0;
        while (true) {
            int n4;
            int n7;
            if ((n7 = string2.indexOf(44, n3)) == (n4 = -1)) {
                string2 = string2.substring(n3);
                this.b(string2);
                return;
            }
            string3 = string2.substring(n3, n7);
            this.b(string3);
            n3 = n7 + 1;
        }
    }

    public void setReferenceTags(String string2) {
        this.g = string2;
        if (string2 == null) {
            return;
        }
        int n3 = 0;
        String string3 = null;
        this.b = 0;
        while (true) {
            int n4;
            int n7;
            if ((n7 = string2.indexOf(44, n3)) == (n4 = -1)) {
                string2 = string2.substring(n3);
                this.d(string2);
                return;
            }
            string3 = string2.substring(n3, n7);
            this.d(string3);
            n3 = n7 + 1;
        }
    }

    public void setReferencedIds(int[] nArray) {
        int n3;
        this.f = null;
        this.b = 0;
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            n3 = nArray[i3];
            this.c(n3);
        }
    }

    public void setTag(int n3, Object object) {
        super.setTag(n3, object);
        if (object == null && (object = this.f) == null) {
            this.c(n3);
        }
    }
}

