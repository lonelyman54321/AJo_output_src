/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.View
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AnimationUtils
 *  android.view.animation.AnticipateInterpolator
 *  android.view.animation.BounceInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.OvershootInterpolator
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.a$b;
import androidx.constraintlayout.motion.widget.c$a;
import androidx.constraintlayout.motion.widget.d;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b$a$a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class c {
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public final co1_0 f;
    public final b$a g;
    public int h;
    public int i;
    public int j;
    public String k;
    public int l;
    public String m;
    public int n;
    public final Context o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    /*
     * Unable to fully structure code
     */
    public c(Context var1_1, XmlResourceParser var2_2) {
        super();
        this.b = var3_3 = -1;
        this.c = false;
        this.d = 0;
        this.h = var3_3;
        this.i = var3_3;
        this.l = 0;
        var4_4 = 0;
        var5_5 = null;
        this.m = null;
        this.n = var3_3;
        this.p = var3_3;
        this.q = var3_3;
        this.r = var3_3;
        this.s = var3_3;
        this.t = var3_3;
        this.u = var3_3;
        this.o = var1_1;
        var4_4 = var2_2.getEventType();
        while (var4_4 != (var6_6 = 1)) {
            block30: {
                block31: {
                    block32: {
                        block28: {
                            block29: {
                                var7_7 = "ViewTransition";
                                var8_8 = 3;
                                var9_9 = 2;
                                if (var4_4 == var9_9) break block29;
                                if (var4_4 != var8_8) ** GOTO lbl110
                                var5_5 = var2_2.getName();
                                var4_4 = (int)var7_7.equals(var5_5);
                                if (var4_4 != 0) {
                                    return;
                                }
                                ** GOTO lbl110
                            }
                            var5_5 = var2_2.getName();
                            var10_10 = var5_5.hashCode();
                            var11_11 = 4;
                            switch (var10_10) {
                                default: {
                                    break;
                                }
                                case 1791837707: {
                                    var7_7 = "CustomAttribute";
                                    var4_4 = (int)var5_5.equals(var7_7);
                                    if (var4_4 == 0) break;
                                    var4_4 = 3;
                                    break block28;
                                }
                                case 366511058: {
                                    var7_7 = "CustomMethod";
                                    var4_4 = (int)var5_5.equals(var7_7);
                                    if (var4_4 == 0) break;
                                    var4_4 = 4;
                                    break block28;
                                }
                                case 61998586: {
                                    var4_4 = (int)var5_5.equals(var7_7);
                                    if (var4_4 == 0) break;
                                    var4_4 = 0;
                                    var5_5 = null;
                                    break block28;
                                }
                                case -1239391468: {
                                    var7_7 = "KeyFrameSet";
                                    var4_4 = (int)var5_5.equals(var7_7);
                                    if (var4_4 == 0) break;
                                    var4_4 = 1;
                                    break block28;
                                }
                                case -1962203927: {
                                    var7_7 = "ConstraintOverride";
                                    var4_4 = (int)var5_5.equals(var7_7);
                                    if (var4_4 == 0) break;
                                    var4_4 = 2;
                                    break block28;
                                }
                            }
                            var4_4 = -1;
                        }
                        if (var4_4 == 0) break block30;
                        if (var4_4 == var6_6) break block31;
                        if (var4_4 == var9_9) break block32;
                        if (var4_4 == var8_8 || var4_4 == var11_11) ** GOTO lbl89
                        oi0_0.a();
                        var2_2.getLineNumber();
                        ** GOTO lbl110
lbl89:
                        // 1 sources

                        var5_5 = this.g;
                        var5_5 = var5_5.g;
                        androidx.constraintlayout.widget.a.d(var1_1, var2_2, (HashMap)var5_5);
                        ** GOTO lbl110
                    }
                    var5_5 = androidx.constraintlayout.widget.b.d(var1_1, var2_2);
                    this.g = var5_5;
                    ** GOTO lbl110
                }
                var5_5 = new co1_0(var1_1, var2_2);
                this.f = var5_5;
                ** GOTO lbl110
            }
            try {
                this.d(var1_1, var2_2);
lbl110:
                // 7 sources

                var4_4 = var2_2.next();
                continue;
            }
            catch (IOException | XmlPullParserException v0) {}
            break;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a(d d2, MotionLayout motionLayout, int n3, b b2, View ... viewArray) {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n4;
        int n7;
        int n8;
        int n10;
        co1_0 co1_02;
        int n14;
        View[] viewArray2;
        Object object5;
        int n15;
        Object object6;
        c c2;
        block16: {
            void var34_47;
            int n16;
            int n17;
            int n18;
            int n19;
            Object object7;
            fQ1 fQ12;
            c$a c$a;
            block25: {
                void var35_49;
                block26: {
                    block17: {
                        block18: {
                            block19: {
                                block20: {
                                    block21: {
                                        block22: {
                                            block23: {
                                                block24: {
                                                    c2 = this;
                                                    object6 = motionLayout;
                                                    n15 = n3;
                                                    object5 = b2;
                                                    viewArray2 = viewArray;
                                                    n14 = this.c;
                                                    if (n14 != 0) {
                                                        return;
                                                    }
                                                    n14 = this.e;
                                                    co1_02 = this.f;
                                                    n10 = -1;
                                                    n8 = 1;
                                                    n7 = 2;
                                                    n4 = 0;
                                                    float f5 = 0.0f;
                                                    c$a = null;
                                                    if (n14 != n7) break block16;
                                                    View view = viewArray[0];
                                                    fQ12 = new fQ1(view);
                                                    object5 = fQ12.f;
                                                    int n20 = 0;
                                                    viewArray2 = null;
                                                    ((pq1_0)object5).c = 0.0f;
                                                    ((pq1_0)object5).d = 0.0f;
                                                    fQ12.H = n8;
                                                    float f6 = view.getX();
                                                    float f7 = view.getY();
                                                    f5 = view.getWidth();
                                                    int n21 = view.getHeight();
                                                    float f8 = n21;
                                                    ((pq1_0)object5).g(f6, f7, f5, f8);
                                                    float f11 = view.getX();
                                                    f6 = view.getY();
                                                    n14 = view.getWidth();
                                                    f7 = n14;
                                                    n4 = view.getHeight();
                                                    f5 = n4;
                                                    object7 = fQ12.g;
                                                    ((pq1_0)object7).g(f11, f6, f7, f5);
                                                    object5 = fQ12.h;
                                                    object5.getClass();
                                                    view.getX();
                                                    view.getY();
                                                    view.getWidth();
                                                    view.getHeight();
                                                    ((dQ1)object5).b(view);
                                                    object5 = fQ12.i;
                                                    object5.getClass();
                                                    view.getX();
                                                    view.getY();
                                                    view.getWidth();
                                                    view.getHeight();
                                                    ((dQ1)object5).b(view);
                                                    Integer n22 = n10;
                                                    object5 = co1_02.a;
                                                    ArrayList arrayList = (ArrayList)((HashMap)object5).get(n22);
                                                    if (arrayList != null) {
                                                        object5 = fQ12.w;
                                                        ((ArrayList)object5).addAll(arrayList);
                                                    }
                                                    n15 = motionLayout.getWidth();
                                                    n19 = motionLayout.getHeight();
                                                    long l2 = System.nanoTime();
                                                    fQ12.i(n15, n19, l2);
                                                    n18 = c2.h;
                                                    n17 = c2.i;
                                                    n15 = c2.b;
                                                    object6 = motionLayout.getContext();
                                                    n19 = c2.l;
                                                    n20 = -2;
                                                    f6 = 0.0f / 0.0f;
                                                    if (n19 == n20) break block17;
                                                    if (n19 == n10) break block18;
                                                    if (n19 == 0) break block19;
                                                    if (n19 == n8) break block20;
                                                    if (n19 == n7) break block21;
                                                    n16 = 4;
                                                    if (n19 == n16) break block22;
                                                    n16 = 5;
                                                    if (n19 == n16) break block23;
                                                    n16 = 6;
                                                    if (n19 == n16) break block24;
                                                    Object var34_45 = null;
                                                    break block25;
                                                }
                                                AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
                                                break block26;
                                            }
                                            OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
                                            break block26;
                                        }
                                        BounceInterpolator bounceInterpolator = new BounceInterpolator();
                                        break block26;
                                    }
                                    DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                                    break block26;
                                }
                                AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
                                break block26;
                            }
                            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                            break block26;
                        }
                        object6 = bx0_0.c(c2.m);
                        TD3 tD3 = new TD3((bx0_0)object6);
                        break block26;
                    }
                    n19 = c2.n;
                    Interpolator interpolator2 = AnimationUtils.loadInterpolator((Context)object6, (int)n19);
                }
                void var34_46 = var35_49;
            }
            n16 = c2.p;
            n19 = c2.q;
            object7 = d2;
            c$a = new c$a(d2, fQ12, n18, n17, n15, (Interpolator)var34_47, n16, n19);
            return;
        }
        Object object8 = this.g;
        if (n14 == n8) {
            Object object9;
            object4 = motionLayout.getConstraintSetIds();
            object3 = null;
            for (n8 = 0; n8 < (object9 = ((Object)object4).length); ++n8) {
                object9 = object4[n8];
                if (object9 == n15) continue;
                object2 = ((MotionLayout)object6).a;
                if (object2 == null) {
                    object9 = 0;
                    float f12 = 0.0f;
                    object = null;
                } else {
                    object = ((a)object2).b((int)object9);
                }
                int n24 = viewArray2.length;
                for (int i3 = 0; i3 < n24; ++i3) {
                    int n25 = viewArray2[i3].getId();
                    Object object10 = ((b)object).k(n25);
                    if (object8 == null) continue;
                    b$a$a b$a$a = ((b$a)object8).h;
                    if (b$a$a != null) {
                        b$a$a.e((b$a)object10);
                    }
                    HashMap hashMap = ((b$a)object10).g;
                    object10 = ((b$a)object8).g;
                    hashMap.putAll(object10);
                }
            }
        }
        object4 = new b();
        HashMap hashMap = ((b)object4).g;
        hashMap.clear();
        object3 = ((b)object5).g.keySet().iterator();
        while (bl2 = object3.hasNext()) {
            object = (Integer)object3.next();
            object2 = (b$a)((b)object5).g.get(object);
            if (object2 == null) continue;
            object2 = ((b$a)object2).b();
            hashMap.put(object, object2);
        }
        int n26 = viewArray2.length;
        object3 = null;
        for (n8 = 0; n8 < n26; ++n8) {
            int n27 = viewArray2[n8].getId();
            object = ((b)object4).k(n27);
            if (object8 == null) continue;
            object2 = ((b$a)object8).h;
            if (object2 != null) {
                ((b$a$a)object2).e((b$a)object);
            }
            object = ((b$a)object).g;
            object2 = ((b$a)object8).g;
            ((HashMap)object).putAll(object2);
        }
        ((MotionLayout)object6).u(n15, (b)object4);
        n14 = R$id.view_transition;
        ((MotionLayout)object6).u(n14, (b)object5);
        int n28 = R$id.view_transition;
        ((MotionLayout)object6).setState(n28, n10, n10);
        object4 = ((MotionLayout)object6).a;
        n26 = R$id.view_transition;
        object5 = new a$b((a)object4, n26, n15);
        n15 = viewArray2.length;
        while (true) {
            if (n4 >= n15) {
                ((MotionLayout)object6).setTransition((a$b)object5);
                cn0_0 cn0_02 = new cn0_0(1, c2, viewArray2);
                ((MotionLayout)object6).f(1.0f);
                ((MotionLayout)object6).v0 = cn0_02;
                return;
            }
            object4 = viewArray2[n4];
            n26 = c2.h;
            if (n26 != n10) {
                n8 = 8;
                ((a$b)object5).h = n26 = Math.max(n26, n8);
            }
            ((a$b)object5).p = n26 = c2.d;
            n26 = c2.l;
            object3 = c2.m;
            n7 = c2.n;
            ((a$b)object5).e = n26;
            ((a$b)object5).f = object3;
            ((a$b)object5).g = n7;
            n14 = object4.getId();
            if (co1_02 != null) {
                Integer n29 = n10;
                ArrayList arrayList = (ArrayList)co1_02.a.get(n29);
                object3 = new co1_0();
                Iterator iterator = arrayList.iterator();
                while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object8 = ((Pn1)iterator.next()).b();
                    ((Pn1)object8).b = n14;
                    ((co1_0)object3).b((Pn1)object8);
                }
                object4 = ((a$b)object5).k;
                ((ArrayList)object4).add(object3);
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean b(View object) {
        boolean bl2;
        Object object2;
        Object object3;
        int n3 = this.r;
        boolean bl3 = false;
        int n4 = -1;
        if (n3 == n4 || (object3 = object.getTag(n3)) != null) {
            n3 = 1;
        } else {
            n3 = 0;
            object3 = null;
        }
        int n7 = this.s;
        if (n7 == n4 || (object2 = object.getTag(n7)) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            Object var1_3 = null;
        }
        if (n3 == 0) return bl3;
        if (!bl2) return bl3;
        return true;
    }

    public final boolean c(View object) {
        boolean bl2;
        String string2;
        if (object == null) {
            return false;
        }
        int n3 = this.j;
        int n4 = -1;
        if (n3 == n4 && (string2 = this.k) == null) {
            return false;
        }
        n3 = (int)(this.b((View)object) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = object.getId();
        n4 = this.j;
        boolean bl3 = true;
        if (n3 == n4) {
            return bl3;
        }
        string2 = this.k;
        if (string2 == null) {
            return false;
        }
        string2 = object.getLayoutParams();
        n3 = string2 instanceof ConstraintLayout$LayoutParams;
        if (n3 != 0 && (object = ((ConstraintLayout$LayoutParams)object.getLayoutParams()).Y) != null && (bl2 = ((String)object).matches(string2 = this.k))) {
            return bl3;
        }
        return false;
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        xmlResourceParser = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        int[] nArray = R$styleable.ViewTransition;
        context = context.obtainStyledAttributes((AttributeSet)xmlResourceParser, nArray);
        int n3 = context.getIndexCount();
        nArray = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            int n4;
            int n7 = context.getIndex(i3);
            if (n7 == (n4 = R$styleable.ViewTransition_android_id)) {
                n4 = this.a;
                this.a = n7 = context.getResourceId(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_motionTarget;
            int n8 = 3;
            int n10 = -1;
            if (n7 == n4) {
                String string2;
                n4 = (int)(MotionLayout.H0 ? 1 : 0);
                if (n4 != 0) {
                    n4 = this.j;
                    this.j = n4 = context.getResourceId(n7, n4);
                    if (n4 != n10) continue;
                    this.k = string2 = context.getString(n7);
                    continue;
                }
                object = context.peekValue(n7);
                n4 = ((TypedValue)object).type;
                if (n4 == n8) {
                    this.k = string2 = context.getString(n7);
                    continue;
                }
                n4 = this.j;
                this.j = n7 = context.getResourceId(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_onStateTransition;
            if (n7 == n4) {
                n4 = this.b;
                this.b = n7 = context.getInt(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_transitionDisable;
            if (n7 == n4) {
                n4 = (int)(this.c ? 1 : 0);
                n7 = (int)(context.getBoolean(n7, n4 != 0) ? 1 : 0);
                this.c = n7;
                continue;
            }
            n4 = R$styleable.ViewTransition_pathMotionArc;
            if (n7 == n4) {
                n4 = this.d;
                this.d = n7 = context.getInt(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_duration;
            if (n7 == n4) {
                n4 = this.h;
                this.h = n7 = context.getInt(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_upDuration;
            if (n7 == n4) {
                n4 = this.i;
                this.i = n7 = context.getInt(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_viewTransitionMode;
            if (n7 == n4) {
                n4 = this.e;
                this.e = n7 = context.getInt(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_motionInterpolator;
            if (n7 == n4) {
                object = context.peekValue(n7);
                n4 = ((TypedValue)object).type;
                int n14 = 1;
                int n15 = -2;
                if (n4 == n14) {
                    this.n = n7 = context.getResourceId(n7, n10);
                    if (n7 == n10) continue;
                    this.l = n15;
                    continue;
                }
                if (n4 == n8) {
                    String string3;
                    object = context.getString(n7);
                    this.m = object;
                    if (object != null && (n4 = ((String)object).indexOf(string3 = "/")) > 0) {
                        this.n = n7 = context.getResourceId(n7, n10);
                        this.l = n15;
                        continue;
                    }
                    this.l = n10;
                    continue;
                }
                n4 = this.l;
                this.l = n7 = context.getInteger(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_setsTag;
            if (n7 == n4) {
                n4 = this.p;
                this.p = n7 = context.getResourceId(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_clearsTag;
            if (n7 == n4) {
                n4 = this.q;
                this.q = n7 = context.getResourceId(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_ifTagSet;
            if (n7 == n4) {
                n4 = this.r;
                this.r = n7 = context.getResourceId(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_ifTagNotSet;
            if (n7 == n4) {
                n4 = this.s;
                this.s = n7 = context.getResourceId(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_SharedValueId;
            if (n7 == n4) {
                n4 = this.u;
                this.u = n7 = context.getResourceId(n7, n4);
                continue;
            }
            n4 = R$styleable.ViewTransition_SharedValue;
            if (n7 != n4) continue;
            n4 = this.t;
            this.t = n7 = context.getInteger(n7, n4);
        }
        context.recycle();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ViewTransition(");
        Object object = this.o;
        object = oi0_0.c(this.a, object);
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

