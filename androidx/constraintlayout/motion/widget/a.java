/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.util.Xml
 *  android.view.MotionEvent
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
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
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
import androidx.constraintlayout.motion.widget.MotionLayout$d;
import androidx.constraintlayout.motion.widget.MotionLayout$g;
import androidx.constraintlayout.motion.widget.a$a;
import androidx.constraintlayout.motion.widget.a$b;
import androidx.constraintlayout.motion.widget.b;
import androidx.constraintlayout.motion.widget.d;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b$a$a;
import androidx.constraintlayout.widget.b$b;
import androidx.constraintlayout.widget.b$c;
import androidx.constraintlayout.widget.b$d;
import androidx.constraintlayout.widget.b$e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
    public final MotionLayout a;
    public final Sb3 b;
    public a$b c;
    public final ArrayList d;
    public final a$b e;
    public final ArrayList f;
    public final SparseArray g;
    public final HashMap h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public MotionLayout$d o;
    public boolean p;
    public final d q;
    public float r;
    public float s;

    /*
     * Exception decompiling
     */
    public a(Context var1_1, MotionLayout var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [69[CASE]], but top level block is 27[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public static int d(Context object, String string2) {
        int n3;
        String string3 = "/";
        int n4 = string2.contains(string3);
        int n7 = 1;
        int n8 = -1;
        if (n4 != 0) {
            n4 = string2.indexOf(47) + n7;
            string3 = string2.substring(n4);
            Resources resources = object.getResources();
            String string4 = "id";
            object = object.getPackageName();
            n3 = resources.getIdentifier(string3, string4, (String)object);
        } else {
            n3 = -1;
        }
        if (n3 == n8 && (n4 = string2.length()) > n7) {
            object = string2.substring(n7);
            n3 = Integer.parseInt((String)object);
        }
        return n3;
    }

    public final boolean a(int n3, MotionLayout motionLayout) {
        boolean bl2;
        Object object = this.o;
        if (object != null) {
            return false;
        }
        object = this.d.iterator();
        while (bl2 = object.hasNext()) {
            int n4;
            a$b a$b = (a$b)object.next();
            int n7 = a$b.n;
            if (n7 == 0) continue;
            a$b a$b2 = this.c;
            int n8 = 2;
            if (a$b2 == a$b && (n4 = a$b2.r & n8) != 0) continue;
            n4 = a$b.d;
            int n10 = 1;
            if (n3 == n4 && (n7 == (n4 = 4) || n7 == n8)) {
                MotionLayout$g motionLayout$g = MotionLayout$g.FINISHED;
                motionLayout.setState(motionLayout$g);
                motionLayout.setTransition(a$b);
                int n14 = a$b.n;
                if (n14 == n4) {
                    motionLayout.s();
                    motionLayout$g = MotionLayout$g.SETUP;
                    motionLayout.setState(motionLayout$g);
                    motionLayout$g = MotionLayout$g.MOVING;
                    motionLayout.setState(motionLayout$g);
                } else {
                    n14 = 1065353216;
                    float f5 = 1.0f;
                    motionLayout.setProgress(f5);
                    motionLayout.h(n10 != 0);
                    object = MotionLayout$g.SETUP;
                    motionLayout.setState((MotionLayout$g)((Object)object));
                    object = MotionLayout$g.MOVING;
                    motionLayout.setState((MotionLayout$g)((Object)object));
                    motionLayout.setState(motionLayout$g);
                    motionLayout.o();
                }
                return n10 != 0;
            }
            n4 = a$b.c;
            if (n3 != n4 || n7 != (n4 = 3) && n7 != n10) continue;
            MotionLayout$g motionLayout$g = MotionLayout$g.FINISHED;
            motionLayout.setState(motionLayout$g);
            motionLayout.setTransition(a$b);
            int n15 = a$b.n;
            if (n15 == n4) {
                motionLayout.f(0.0f);
                motionLayout$g = MotionLayout$g.SETUP;
                motionLayout.setState(motionLayout$g);
                motionLayout$g = MotionLayout$g.MOVING;
                motionLayout.setState(motionLayout$g);
            } else {
                motionLayout.setProgress(0.0f);
                motionLayout.h(n10 != 0);
                object = MotionLayout$g.SETUP;
                motionLayout.setState((MotionLayout$g)((Object)object));
                object = MotionLayout$g.MOVING;
                motionLayout.setState((MotionLayout$g)((Object)object));
                motionLayout.setState(motionLayout$g);
                motionLayout.o();
            }
            return n10 != 0;
        }
        return false;
    }

    public final androidx.constraintlayout.widget.b b(int n3) {
        androidx.constraintlayout.widget.b b2;
        Object object;
        int n4;
        int n7;
        Sb3 sb3 = this.b;
        if (sb3 != null && (n7 = sb3.a(n3)) != (n4 = -1)) {
            n3 = n7;
        }
        if ((object = (sb3 = this.g).get(n3)) == null) {
            object = this.a.getContext();
            oi0_0.c(n3, (Context)object);
            n3 = sb3.keyAt(0);
            b2 = (androidx.constraintlayout.widget.b)sb3.get(n3);
        } else {
            b2 = (androidx.constraintlayout.widget.b)sb3.get(n3);
        }
        return b2;
    }

    public final int c() {
        a$b a$b = this.c;
        if (a$b != null) {
            return a$b.h;
        }
        return this.j;
    }

    public final Interpolator e() {
        Object object = this.c;
        int n3 = ((a$b)object).e;
        int n4 = -2;
        if (n3 != n4) {
            n4 = -1;
            if (n3 != n4) {
                if (n3 != 0) {
                    int n7 = 1;
                    if (n3 != n7) {
                        n7 = 2;
                        if (n3 != n7) {
                            n7 = 4;
                            if (n3 != n7) {
                                n7 = 5;
                                if (n3 != n7) {
                                    n7 = 6;
                                    if (n3 != n7) {
                                        return null;
                                    }
                                    object = new AnticipateInterpolator();
                                    return object;
                                }
                                object = new OvershootInterpolator();
                                return object;
                            }
                            object = new BounceInterpolator();
                            return object;
                        }
                        object = new DecelerateInterpolator();
                        return object;
                    }
                    object = new AccelerateInterpolator();
                    return object;
                }
                object = new AccelerateDecelerateInterpolator();
                return object;
            }
            object = bx0_0.c(((a$b)object).f);
            a$a a$a = new a$a((bx0_0)object);
            return a$a;
        }
        object = this.a.getContext();
        n3 = this.c.g;
        return AnimationUtils.loadInterpolator((Context)object, (int)n3);
    }

    public final void f(fQ1 fQ12) {
        boolean bl2;
        Object object = this.c;
        if (object == null) {
            object = this.e;
            if (object != null) {
                boolean bl3;
                object = ((a$b)object).k.iterator();
                while (bl3 = object.hasNext()) {
                    co1_0 co1_02 = (co1_0)object.next();
                    co1_02.a(fQ12);
                }
            }
            return;
        }
        object = ((a$b)object).k.iterator();
        while (bl2 = object.hasNext()) {
            co1_0 co1_03 = (co1_0)object.next();
            co1_03.a(fQ12);
        }
    }

    public final float g() {
        Object object = this.c;
        if (object != null && (object = ((a$b)object).l) != null) {
            return ((b)object).t;
        }
        return 0.0f;
    }

    public final int h() {
        a$b a$b = this.c;
        if (a$b == null) {
            return -1;
        }
        return a$b.d;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int i(Context var1_1, XmlResourceParser var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = 4;
        var7_7 = 3;
        var8_8 = 2;
        var9_9 = 1;
        var10_10 = new androidx.constraintlayout.widget.b();
        var10_10.f = false;
        var11_11 = var2_2.getAttributeCount();
        var13_13 = -1;
        var14_14 = -1;
        block29: for (var12_12 = 0; var12_12 < var11_11; var12_12 += var9_9) {
            var15_15 = var5_5.getAttributeName(var12_12);
            var16_16 = var5_5.getAttributeValue(var12_12);
            var15_15.getClass();
            var17_17 = var15_15.hashCode();
            switch (var17_17) lbl-1000:
            // 5 sources

            {
                default: {
                    var18_18 = -1;
                    break;
                }
                case 973381616: {
                    var19_19 /* !! */  = "stateLabels";
                    var18_18 = (int)var15_15.equals(var19_19 /* !! */ );
                    if (var18_18 == 0) ** GOTO lbl-1000
                    var18_18 = 3;
                    break;
                }
                case 3355: {
                    var19_19 /* !! */  = "id";
                    var18_18 = (int)var15_15.equals(var19_19 /* !! */ );
                    if (var18_18 == 0) ** GOTO lbl-1000
                    var18_18 = 2;
                    break;
                }
                case -1153153640: {
                    var19_19 /* !! */  = "constraintRotate";
                    var18_18 = (int)var15_15.equals(var19_19 /* !! */ );
                    if (var18_18 == 0) ** GOTO lbl-1000
                    var18_18 = 1;
                    break;
                }
                case -1496482599: {
                    var19_19 /* !! */  = "deriveConstraintsFrom";
                    var18_18 = (int)var15_15.equals(var19_19 /* !! */ );
                    if (var18_18 == 0) ** GOTO lbl-1000
                    var18_18 = 0;
                    var19_19 /* !! */  = null;
                }
            }
            switch (var18_18) {
                default: {
                    continue block29;
                }
                case 3: {
                    var19_19 /* !! */  = var16_16.split(",");
                    var10_10.c = var19_19 /* !! */ ;
                    var19_19 /* !! */  = null;
                    for (var18_18 = 0; var18_18 < (var20_20 = ((String[])(var15_15 = var10_10.c)).length); var18_18 += var9_9) {
                        var16_16 = var15_15[var18_18].trim();
                        var15_15[var18_18] = var16_16;
                    }
                    continue block29;
                }
                case 2: {
                    var13_13 = androidx.constraintlayout.motion.widget.a.d(var4_4, var16_16);
                    var18_18 = var16_16.indexOf(47);
                    if (var18_18 >= 0) {
                        var16_16 = var16_16.substring(var18_18 += var9_9);
                    }
                    var19_19 /* !! */  = var13_13;
                    var15_15 = var3_3.h;
                    var15_15.put(var16_16, var19_19 /* !! */ );
                    var10_10.a = var19_19 /* !! */  = oi0_0.c(var13_13, var4_4);
                    continue block29;
                }
                case 1: {
                    var18_18 = Integer.parseInt(var16_16);
                    try {
                        var10_10.d = var18_18;
                    }
                    catch (NumberFormatException v0) {
                        var16_16.getClass();
                        var18_18 = var16_16.hashCode();
                        switch (var18_18) lbl-1000:
                        // 6 sources

                        {
                            default: {
                                var18_18 = -1;
                                break;
                            }
                            case 1954540437: {
                                var19_19 /* !! */  = "x_right";
                                var18_18 = (int)var16_16.equals(var19_19 /* !! */ );
                                if (var18_18 == 0) ** GOTO lbl-1000
                                var18_18 = 4;
                                break;
                            }
                            case 108511772: {
                                var19_19 /* !! */  = "right";
                                var18_18 = (int)var16_16.equals(var19_19 /* !! */ );
                                if (var18_18 == 0) ** GOTO lbl-1000
                                var18_18 = 3;
                                break;
                            }
                            case 3387192: {
                                var19_19 /* !! */  = "none";
                                var18_18 = (int)var16_16.equals(var19_19 /* !! */ );
                                if (var18_18 == 0) ** GOTO lbl-1000
                                var18_18 = 2;
                                break;
                            }
                            case 3317767: {
                                var19_19 /* !! */  = "left";
                                var18_18 = (int)var16_16.equals(var19_19 /* !! */ );
                                if (var18_18 == 0) ** GOTO lbl-1000
                                var18_18 = 1;
                                break;
                            }
                            case -768416914: {
                                var19_19 /* !! */  = "x_left";
                                var18_18 = (int)var16_16.equals(var19_19 /* !! */ );
                                if (var18_18 == 0) ** GOTO lbl-1000
                                var18_18 = 0;
                                var19_19 /* !! */  = null;
                            }
                        }
                        switch (var18_18) {
                            default: {
                                continue block29;
                            }
                            case 4: {
                                var10_10.d = var7_7;
                                continue block29;
                            }
                            case 3: {
                                var10_10.d = var9_9;
                                continue block29;
                            }
                            case 2: {
                                var10_10.d = 0;
                                continue block29;
                            }
                            case 1: {
                                var10_10.d = var8_8;
                                continue block29;
                            }
                            case 0: 
                        }
                        var10_10.d = var6_6;
                    }
                    continue block29;
                }
                case 0: {
                    var14_14 = androidx.constraintlayout.motion.widget.a.d(var4_4, var16_16);
                }
            }
        }
        var18_18 = -1;
        if (var13_13 != var18_18) {
            var21_21 = var3_3.a;
            var6_6 = var21_21.u;
            var10_10.m(var4_4, var5_5);
            if (var14_14 != var18_18) {
                var4_4 = var3_3.i;
                var4_4.put(var13_13, var14_14);
            }
            var4_4 = var3_3.g;
            var4_4.put(var13_13, (Object)var10_10);
        }
        return var13_13;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int j(int n3, Context context) {
        Object object = context.getResources();
        XmlResourceParser xmlResourceParser = object.getXml(n3);
        try {
            int n4;
            int n7 = xmlResourceParser.getEventType();
            while (n7 != (n4 = 1)) {
                String string2 = xmlResourceParser.getName();
                int n8 = 2;
                if (n8 == n7 && (n7 = (int)(((String)(object = "ConstraintSet")).equals(string2) ? 1 : 0)) != 0) {
                    return this.i(context, xmlResourceParser);
                }
                n7 = xmlResourceParser.next();
            }
            return -1;
        }
        catch (IOException | XmlPullParserException throwable) {}
        return -1;
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        xmlResourceParser = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        int[] nArray = R$styleable.include;
        xmlResourceParser = context.obtainStyledAttributes((AttributeSet)xmlResourceParser, nArray);
        int n3 = xmlResourceParser.getIndexCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int n7 = xmlResourceParser.getIndex(i3);
            if (n7 != (n4 = R$styleable.include_constraintSet)) continue;
            n4 = -1;
            n7 = xmlResourceParser.getResourceId(n7, n4);
            this.j(n7, context);
        }
        xmlResourceParser.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        xmlResourceParser = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        int[] nArray = R$styleable.MotionScene;
        context = context.obtainStyledAttributes((AttributeSet)xmlResourceParser, nArray);
        int n3 = context.getIndexCount();
        nArray = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int n7 = context.getIndex(i3);
            if (n7 == (n4 = R$styleable.MotionScene_defaultDuration)) {
                n4 = this.j;
                this.j = n7 = context.getInt(n7, n4);
                n4 = 8;
                if (n7 >= n4) continue;
                this.j = n4;
                continue;
            }
            n4 = R$styleable.MotionScene_layoutDuringTransition;
            if (n7 != n4) continue;
            this.k = n7 = context.getInteger(n7, 0);
        }
        context.recycle();
    }

    public final void m(int n3, MotionLayout object) {
        boolean bl2;
        Object object2;
        Object object3;
        float f5;
        int n4;
        Object object4;
        int n7;
        Object object5;
        Object object6;
        int n10;
        Object object7;
        Object object8 = this.g;
        androidx.constraintlayout.widget.b b2 = (androidx.constraintlayout.widget.b)object8.get(n3);
        Object object9 = b2.a;
        b2.b = object9;
        n3 = this.i.get(n3);
        object9 = b2.g;
        if (n3 > 0) {
            this.m(n3, (MotionLayout)object);
            object = (androidx.constraintlayout.widget.b)object8.get(n3);
            if (object == null) {
                object = this.a.getContext();
                oi0_0.c(n3, (Context)object);
                return;
            }
            object7 = new StringBuilder();
            object8 = b2.b;
            ((StringBuilder)object7).append((String)object8);
            ((StringBuilder)object7).append("/");
            object8 = ((androidx.constraintlayout.widget.b)object).b;
            ((StringBuilder)object7).append((String)object8);
            b2.b = object7 = ((StringBuilder)object7).toString();
            object7 = ((androidx.constraintlayout.widget.b)object).g;
            object = ((HashMap)object7).keySet().iterator();
            while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object8 = (Integer)object.next();
                object8.getClass();
                object6 = (b$a)((HashMap)object7).get(object8);
                boolean n8 = ((HashMap)object9).containsKey(object8);
                if (!n8) {
                    object5 = new b$a();
                    ((HashMap)object9).put(object8, object5);
                }
                if ((object8 = (b$a)((HashMap)object9).get(object8)) == null) continue;
                object5 = ((b$a)object8).e;
                n7 = (int)(((b$b)object5).b ? 1 : 0);
                if (n7 == 0) {
                    object4 = ((b$a)object6).e;
                    ((b$b)object5).a((b$b)object4);
                }
                object5 = ((b$a)object8).c;
                n7 = (int)(((b$d)object5).a ? 1 : 0);
                if (n7 == 0) {
                    object4 = ((b$a)object6).c;
                    n4 = (int)(((b$d)object4).a ? 1 : 0);
                    ((b$d)object5).a = n4;
                    ((b$d)object5).b = n4 = ((b$d)object4).b;
                    ((b$d)object5).d = f5 = ((b$d)object4).d;
                    ((b$d)object5).e = f5 = ((b$d)object4).e;
                    ((b$d)object5).c = n7 = ((b$d)object4).c;
                }
                object5 = ((b$a)object8).f;
                n7 = (int)(((b$e)object5).a ? 1 : 0);
                if (n7 == 0) {
                    object4 = ((b$a)object6).f;
                    ((b$e)object5).a((b$e)object4);
                }
                object5 = ((b$a)object8).d;
                n7 = (int)(((b$c)object5).a ? 1 : 0);
                if (n7 == 0) {
                    object4 = ((b$a)object6).d;
                    ((b$c)object5).a((b$c)object4);
                }
                object5 = ((b$a)object6).g.keySet().iterator();
                while ((n7 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                    object3 = ((b$a)object8).g;
                    object4 = (String)object5.next();
                    n4 = (int)(((HashMap)object3).containsKey(object4) ? 1 : 0);
                    if (n4 != 0) continue;
                    object3 = ((b$a)object8).g;
                    object2 = (androidx.constraintlayout.widget.a)((b$a)object6).g.get(object4);
                    ((HashMap)object3).put(object4, object2);
                }
            }
        } else {
            object7 = new StringBuilder();
            object8 = b2.b;
            object6 = "  layout";
            object7 = h30_0.a((StringBuilder)object7, (String)object8, (String)object6);
            b2.b = object7;
            n3 = object.getChildCount();
            object8 = null;
            for (n10 = 0; n10 < n3; ++n10) {
                float f6;
                double d2;
                float f7;
                object6 = object.getChildAt(n10);
                object5 = (ConstraintLayout$LayoutParams)object6.getLayoutParams();
                n7 = object6.getId();
                n4 = b2.f;
                if (n4 != 0) {
                    n4 = -1;
                    f5 = 0.0f / 0.0f;
                    if (n7 == n4) {
                        object7 = new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                        throw object7;
                    }
                }
                if ((n4 = (int)(((HashMap)object9).containsKey(object3 = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
                    object3 = n7;
                    object2 = new b$a();
                    ((HashMap)object9).put(object3, object2);
                }
                object3 = n7;
                if ((object3 = (b$a)((HashMap)object9).get(object3)) == null) continue;
                object2 = ((b$a)object3).e;
                boolean bl3 = ((b$b)object2).b;
                boolean bl4 = true;
                if (!bl3) {
                    ((b$a)object3).c(n7, (ConstraintLayout$LayoutParams)((Object)object5));
                    int n8 = object6 instanceof ConstraintHelper;
                    if (n8 != 0) {
                        object5 = object6;
                        object5 = ((ConstraintHelper)((Object)object6)).getReferencedIds();
                        ((b$b)object2).j0 = (int[])object5;
                        n8 = object6 instanceof Barrier;
                        if (n8 != 0) {
                            object5 = object6;
                            object5 = (Barrier)((Object)object6);
                            n7 = (int)(((Barrier)((Object)object5)).getAllowsGoneWidget() ? 1 : 0);
                            ((b$b)object2).o0 = n7;
                            ((b$b)object2).g0 = n7 = ((Barrier)((Object)object5)).getType();
                            ((b$b)object2).h0 = n8 = ((Barrier)((Object)object5)).getMargin();
                        }
                    }
                    ((b$b)object2).b = bl4;
                }
                object5 = ((b$a)object3).c;
                n7 = (int)(((b$d)object5).a ? 1 : 0);
                if (n7 == 0) {
                    ((b$d)object5).b = n7 = ((View)object6).getVisibility();
                    ((b$d)object5).d = f7 = ((View)object6).getAlpha();
                    ((b$d)object5).a = bl4;
                }
                object5 = ((b$a)object3).f;
                n7 = (int)(((b$e)object5).a ? 1 : 0);
                if (n7 != 0) continue;
                ((b$e)object5).a = bl4;
                ((b$e)object5).b = f7 = ((View)object6).getRotation();
                ((b$e)object5).c = f7 = ((View)object6).getRotationX();
                ((b$e)object5).d = f7 = ((View)object6).getRotationY();
                ((b$e)object5).e = f7 = ((View)object6).getScaleX();
                ((b$e)object5).f = f7 = ((View)object6).getScaleY();
                f7 = ((View)object6).getPivotX();
                f5 = ((View)object6).getPivotY();
                double d5 = f7;
                double d7 = 0.0;
                double d9 = d5 - d7;
                Object object10 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                if (object10 != false || (object10 = (d2 = (d5 = (double)f5) - d7) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1)) != false) {
                    ((b$e)object5).g = f7;
                    ((b$e)object5).h = f5;
                }
                ((b$e)object5).j = f7 = ((View)object6).getTranslationX();
                ((b$e)object5).k = f7 = ((View)object6).getTranslationY();
                ((b$e)object5).l = f7 = ((View)object6).getTranslationZ();
                n7 = (int)(((b$e)object5).m ? 1 : 0);
                if (n7 == 0) continue;
                ((b$e)object5).n = f6 = ((View)object6).getElevation();
            }
        }
        object7 = ((HashMap)object9).values().iterator();
        while (bl2 = object7.hasNext()) {
            int n14;
            object = (b$a)object7.next();
            object8 = ((b$a)object).h;
            if (object8 == null) continue;
            object8 = ((b$a)object).b;
            if (object8 == null) {
                n10 = ((b$a)object).a;
                object8 = b2.k(n10);
                object = ((b$a)object).h;
                ((b$a$a)object).e((b$a)object8);
                continue;
            }
            object8 = ((HashMap)object9).keySet().iterator();
            while ((n14 = object8.hasNext()) != 0) {
                boolean bl5;
                n14 = (Integer)object8.next();
                object6 = b2.k(n14);
                object5 = ((b$a)object6).e.l0;
                if (object5 == null || !(bl5 = ((String)(object4 = ((b$a)object).b)).matches((String)object5))) continue;
                ((b$a)object).h.e((b$a)object6);
                object5 = (HashMap)((b$a)object).g.clone();
                object6 = ((b$a)object6).g;
                ((HashMap)object6).putAll(object5);
            }
        }
    }

    public final void n(MotionLayout motionLayout) {
        SparseArray sparseArray;
        int n3;
        for (int i3 = 0; i3 < (n3 = (sparseArray = this.g).size()); ++i3) {
            int n4 = sparseArray.keyAt(i3);
            SparseIntArray sparseIntArray = this.i;
            int n7 = sparseIntArray.get(n4);
            int n8 = sparseIntArray.size();
            while (n7 > 0) {
                int n10;
                block5: {
                    block4: {
                        if (n7 == n4) break block4;
                        n10 = n8 + -1;
                        if (n8 >= 0) break block5;
                    }
                    return;
                }
                n7 = sparseIntArray.get(n7);
                n8 = n10;
            }
            this.m(n4, motionLayout);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void o(int n3, int n4) {
        int n7;
        a$b a$b;
        boolean bl2;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        block8: {
            block7: {
                block6: {
                    Sb3 sb3 = this.b;
                    n16 = -1;
                    if (sb3 == null) break block6;
                    n15 = sb3.a(n3);
                    if (n15 == n16) {
                        n15 = n3;
                    }
                    Sb3 sb32 = this.b;
                    n14 = sb32.a(n4);
                    if (n14 == n16) break block7;
                    break block8;
                }
                n15 = n3;
            }
            n14 = n4;
        }
        Object object = this.c;
        if (object != null && (n10 = ((a$b)object).c) == n4 && (n8 = ((a$b)object).d) == n3) {
            return;
        }
        object = this.d;
        Iterator iterator = ((ArrayList)object).iterator();
        while (bl2 = iterator.hasNext()) {
            int n17;
            a$b = (a$b)iterator.next();
            n7 = a$b.c;
            if ((n7 != n14 || (n17 = a$b.d) != n15) && (n7 != n4 || (n7 = a$b.d) != n3)) continue;
            this.c = a$b;
            b b2 = a$b.l;
            if (b2 != null) {
                n4 = (int)(this.p ? 1 : 0);
                b2.c(n4 != 0);
            }
            return;
        }
        a$b a$b2 = this.e;
        iterator = this.f.iterator();
        while (bl2 = iterator.hasNext()) {
            a$b = (a$b)iterator.next();
            n7 = a$b.c;
            if (n7 != n4) continue;
            a$b2 = a$b;
        }
        a$b a$b3 = new a$b(this, a$b2);
        a$b3.d = n15;
        a$b3.c = n14;
        if (n15 != n16) {
            ((ArrayList)object).add(a$b3);
        }
        this.c = a$b3;
    }

    public final boolean p() {
        boolean bl2;
        Object object;
        block2: {
            b b2;
            object = this.d.iterator();
            do {
                boolean bl3 = object.hasNext();
                bl2 = true;
                if (!bl3) break block2;
            } while ((b2 = ((a$b)object.next()).l) == null);
            return bl2;
        }
        object = this.c;
        if (object == null || (object = ((a$b)object).l) == null) {
            bl2 = false;
        }
        return bl2;
    }
}

