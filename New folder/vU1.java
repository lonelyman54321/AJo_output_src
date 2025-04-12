/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 */
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import java.util.Objects;
import java.util.WeakHashMap;

public final class vU1 {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public vU1(View view) {
        this.c = view;
    }

    public final boolean a(float f5, float f6, boolean bl2) {
        ViewParent viewParent;
        boolean bl3 = this.d;
        boolean bl4 = false;
        if (bl3 && (viewParent = this.f(0)) != null) {
            View view = this.c;
            try {
                bl4 = viewParent.onNestedFling(view, f5, f6, bl2);
            }
            catch (AbstractMethodError abstractMethodError) {
                Objects.toString(viewParent);
            }
        }
        return bl4;
    }

    public final boolean b(float f5, float f6) {
        ViewParent viewParent;
        boolean bl2 = this.d;
        boolean bl3 = false;
        if (bl2 && (viewParent = this.f(0)) != null) {
            View view = this.c;
            try {
                bl3 = viewParent.onNestedPreFling(view, f5, f6);
            }
            catch (AbstractMethodError abstractMethodError) {
                Objects.toString(viewParent);
            }
        }
        return bl3;
    }

    public final boolean c(int n3, int n4, int[] nArray, int[] nArray2, int n7) {
        vU1 vU12 = this;
        int n8 = n4;
        int[] nArray3 = nArray2;
        int n10 = n7;
        int n14 = this.d;
        boolean bl2 = false;
        if (n14 != 0) {
            Object object = this.f(n7);
            if (object == null) {
                return false;
            }
            int n15 = 1;
            if (n3 == 0 && n4 == 0) {
                if (nArray2 != null) {
                    nArray2[0] = 0;
                    nArray2[n15] = 0;
                }
            } else {
                int[] nArray4;
                Object object2;
                int n16;
                int n17;
                int n18;
                View view = vU12.c;
                if (nArray3 != null) {
                    view.getLocationInWindow(nArray3);
                    n18 = nArray3[0];
                    int n19 = nArray3[n15];
                    n17 = n18;
                    n16 = n19;
                } else {
                    n17 = 0;
                    n16 = 0;
                }
                if (nArray == null) {
                    object2 = vU12.e;
                    if (object2 == null) {
                        n18 = 2;
                        vU12.e = object2 = new int[n18];
                    }
                    object2 = vU12.e;
                    nArray4 = object2;
                } else {
                    nArray4 = nArray;
                }
                nArray4[0] = 0;
                nArray4[n15] = 0;
                n18 = object instanceof wu1_0;
                Object object3 = vU12.c;
                if (n18 != 0) {
                    object = (wu1_0)object;
                    object2 = object3;
                    n8 = n4;
                    object3 = nArray4;
                    n10 = n7;
                    object.onNestedPreScroll((View)object2, n3, n4, nArray4, n7);
                } else if (n10 == 0) {
                    try {
                        object.onNestedPreScroll(object3, n3, n8, nArray4);
                    }
                    catch (AbstractMethodError abstractMethodError) {
                        Objects.toString(object);
                    }
                }
                if (nArray3 != null) {
                    view.getLocationInWindow(nArray3);
                    nArray3[0] = n14 = nArray3[0] - n17;
                    nArray3[n15] = n14 = nArray3[n15] - n16;
                }
                if ((n14 = nArray4[0]) != 0 || (n14 = nArray4[n15]) != 0) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final void d(int n3, int n4, int n7, int[] nArray) {
        this.e(0, n3, 0, n4, null, n7, nArray);
    }

    public final boolean e(int n3, int n4, int n7, int n8, int[] nArray, int n10, int[] nArray2) {
        vU1 vU12 = this;
        int[] nArray3 = nArray;
        int n14 = n10;
        int n15 = this.d;
        if (n15 != 0) {
            Object object = this.f(n10);
            if (object == null) {
                return false;
            }
            int n16 = 1;
            if (n3 == 0 && n4 == 0 && n7 == 0 && n8 == 0) {
                if (nArray != null) {
                    nArray[0] = 0;
                    nArray[n16] = 0;
                }
            } else {
                int[] nArray4;
                Object object2;
                int n17;
                int n18;
                View view = vU12.c;
                if (nArray3 != null) {
                    view.getLocationInWindow(nArray3);
                    n15 = nArray3[0];
                    int n19 = nArray3[n16];
                    n18 = n15;
                    n17 = n19;
                } else {
                    n18 = 0;
                    n17 = 0;
                }
                if (nArray2 == null) {
                    object2 = vU12.e;
                    if (object2 == null) {
                        n15 = 2;
                        object2 = new int[n15];
                        vU12.e = object2;
                    }
                    object2 = vU12.e;
                    object2[0] = 0;
                    object2[n16] = 0;
                    nArray4 = object2;
                } else {
                    nArray4 = nArray2;
                }
                n15 = object instanceof xu1_2;
                View view2 = vU12.c;
                if (n15 != 0) {
                    object2 = object;
                    object2 = (xu1_2)object;
                    n14 = n10;
                    object = nArray4;
                    object2.onNestedScroll(view2, n3, n4, n7, n8, n10, nArray4);
                } else {
                    nArray4[0] = n15 = nArray4[0] + n7;
                    nArray4[n16] = n15 = nArray4[n16] + n8;
                    n15 = object instanceof wu1_0;
                    if (n15 != 0) {
                        object2 = object;
                        object2 = (wu1_0)object;
                        n14 = n10;
                        object2.onNestedScroll(view2, n3, n4, n7, n8, n10);
                    } else if (n14 == 0) {
                        object2 = object;
                        try {
                            object.onNestedScroll(view2, n3, n4, n7, n8);
                        }
                        catch (AbstractMethodError abstractMethodError) {
                            Objects.toString(object);
                        }
                    }
                }
                if (nArray3 != null) {
                    view.getLocationInWindow(nArray3);
                    nArray3[0] = n15 = nArray3[0] - n18;
                    nArray3[n16] = n15 = nArray3[n16] - n17;
                }
                return n16 != 0;
            }
        }
        return false;
    }

    public final ViewParent f(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    public final boolean g(int n3) {
        ViewParent viewParent = this.f(n3);
        if (viewParent != null) {
            n3 = 1;
        } else {
            n3 = 0;
            viewParent = null;
        }
        return n3 != 0;
    }

    public final void h(boolean bl2) {
        boolean bl3 = this.d;
        if (bl3) {
            WeakHashMap weakHashMap = ViewCompat.a;
            weakHashMap = this.c;
            ViewCompat$c.s((View)weakHashMap);
        }
        this.d = bl2;
    }

    public final boolean i(int n3, int n4) {
        boolean bl2 = this.g(n4);
        int n7 = 1;
        if (bl2) {
            return n7 != 0;
        }
        bl2 = this.d;
        if (bl2) {
            View view = this.c;
            View view2 = view;
            for (Object object = view.getParent(); object != null; object = object.getParent()) {
                boolean bl3;
                boolean bl4;
                block17: {
                    Object object2;
                    bl4 = object instanceof wu1_0;
                    if (bl4) {
                        object2 = object;
                        object2 = (wu1_0)object;
                        bl3 = object2.onStartNestedScroll(view2, view, n3, n4);
                    } else {
                        if (n4 == 0) {
                            try {
                                bl3 = object.onStartNestedScroll(view2, view, n3);
                                break block17;
                            }
                            catch (AbstractMethodError abstractMethodError) {
                                Objects.toString(object);
                            }
                        }
                        bl3 = false;
                        object2 = null;
                    }
                }
                if (bl3) {
                    if (n4 != 0) {
                        if (n4 == n7) {
                            this.b = object;
                        }
                    } else {
                        this.a = object;
                    }
                    if (bl4) {
                        object = (wu1_0)object;
                        object.onNestedScrollAccepted(view2, view, n3, n4);
                    } else if (n4 == 0) {
                        try {
                            object.onNestedScrollAccepted(view2, view, n3);
                        }
                        catch (AbstractMethodError abstractMethodError) {
                            Objects.toString(object);
                        }
                    }
                    return n7 != 0;
                }
                bl4 = object instanceof View;
                if (!bl4) continue;
                view2 = object;
                view2 = (View)object;
            }
        }
        return false;
    }

    public final void j(int n3) {
        Object object = this.f(n3);
        if (object != null) {
            int n4 = object instanceof wu1_0;
            View view = this.c;
            if (n4 != 0) {
                object = (wu1_0)object;
                object.onStopNestedScroll(view, n3);
            } else if (n3 == 0) {
                try {
                    object.onStopNestedScroll(view);
                }
                catch (AbstractMethodError abstractMethodError) {
                    Objects.toString(object);
                }
            }
            object = null;
            if (n3 != 0) {
                n4 = 1;
                if (n3 == n4) {
                    this.b = null;
                }
            } else {
                this.a = null;
            }
        }
    }
}

