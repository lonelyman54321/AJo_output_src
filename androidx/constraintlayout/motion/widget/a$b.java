/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.b;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class a$b {
    public final int a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public final float i;
    public final a j;
    public final ArrayList k;
    public b l;
    public final ArrayList m;
    public final int n;
    public final boolean o;
    public int p;
    public final int q;
    public final int r;

    public a$b(a a2, int n3, int n4) {
        int n7;
        ArrayList arrayList;
        ArrayList arrayList2;
        int n8;
        this.a = n8 = -1;
        this.b = false;
        this.c = n8;
        this.d = n8;
        this.e = 0;
        this.f = null;
        this.g = n8;
        this.h = 400;
        this.i = 0.0f;
        this.k = arrayList2 = new ArrayList();
        this.l = null;
        this.m = arrayList = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = n8;
        this.q = 0;
        this.r = 0;
        this.a = n8;
        this.j = a2;
        this.d = n3;
        this.c = n4;
        this.h = n3 = a2.j;
        this.q = n7 = a2.k;
    }

    public a$b(a a2, Context context, XmlResourceParser xmlResourceParser) {
        int n3;
        int n4;
        ArrayList arrayList;
        int n7;
        this.a = n7 = -1;
        this.b = false;
        this.c = n7;
        this.d = n7;
        this.e = 0;
        this.f = null;
        this.g = n7;
        this.h = 400;
        this.i = 0.0f;
        this.k = arrayList = new ArrayList();
        this.l = null;
        Object object = new ArrayList();
        this.m = object;
        this.n = 0;
        this.o = false;
        this.p = n7;
        this.q = 0;
        this.r = 0;
        this.h = n4 = a2.j;
        this.q = n4 = a2.k;
        this.j = a2;
        xmlResourceParser = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        object = R$styleable.Transition;
        xmlResourceParser = context.obtainStyledAttributes((AttributeSet)xmlResourceParser, (int[])object);
        n4 = xmlResourceParser.getIndexCount();
        int n8 = 0;
        arrayList = null;
        while (true) {
            Object object2;
            n3 = 1;
            float f5 = Float.MIN_VALUE;
            if (n8 >= n4) break;
            int n10 = xmlResourceParser.getIndex(n8);
            int n14 = R$styleable.Transition_constraintSetEnd;
            SparseArray sparseArray = a2.g;
            String string2 = "xml";
            String string3 = "layout";
            if (n10 == n14) {
                this.c = n3 = xmlResourceParser.getResourceId(n10, n7);
                object2 = context.getResources();
                n10 = this.c;
                if ((n10 = (int)(string3.equals(object2 = object2.getResourceTypeName(n10)) ? 1 : 0)) != 0) {
                    n10 = this.c;
                    ((androidx.constraintlayout.widget.b)object2).l(n10, context);
                    n10 = this.c;
                    sparseArray.append(n10, object2);
                } else {
                    n3 = (int)(string2.equals(object2) ? 1 : 0);
                    if (n3 != 0) {
                        n3 = this.c;
                        this.c = n3 = a2.j(n3, context);
                    }
                }
            } else {
                n14 = R$styleable.Transition_constraintSetStart;
                if (n10 == n14) {
                    n3 = this.d;
                    this.d = n3 = xmlResourceParser.getResourceId(n10, n3);
                    object2 = context.getResources();
                    n10 = this.d;
                    if ((n10 = (int)(string3.equals(object2 = object2.getResourceTypeName(n10)) ? 1 : 0)) != 0) {
                        super();
                        n10 = this.d;
                        ((androidx.constraintlayout.widget.b)object2).l(n10, context);
                        n10 = this.d;
                        sparseArray.append(n10, object2);
                    } else {
                        n3 = (int)(string2.equals(object2) ? 1 : 0);
                        if (n3 != 0) {
                            n3 = this.d;
                            this.d = n3 = a2.j(n3, context);
                        }
                    }
                } else {
                    n14 = R$styleable.Transition_motionInterpolator;
                    if (n10 == n14) {
                        Object object3 = xmlResourceParser.peekValue(n10);
                        n14 = object3.type;
                        int n15 = -2;
                        if (n14 == n3) {
                            this.g = n3 = xmlResourceParser.getResourceId(n10, n7);
                            if (n3 != n7) {
                                this.e = n15;
                            }
                        } else {
                            n3 = 3;
                            f5 = 4.2E-45f;
                            if (n14 == n3) {
                                object2 = xmlResourceParser.getString(n10);
                                this.f = object2;
                                if (object2 != null) {
                                    object3 = "/";
                                    n3 = ((String)object2).indexOf((String)object3);
                                    if (n3 > 0) {
                                        this.g = n3 = xmlResourceParser.getResourceId(n10, n7);
                                        this.e = n15;
                                    } else {
                                        this.e = n7;
                                    }
                                }
                            } else {
                                n3 = this.e;
                                this.e = n3 = xmlResourceParser.getInteger(n10, n3);
                            }
                        }
                    } else {
                        n3 = R$styleable.Transition_duration;
                        if (n10 == n3) {
                            n3 = this.h;
                            this.h = n3 = xmlResourceParser.getInt(n10, n3);
                            n10 = 8;
                            if (n3 < n10) {
                                this.h = n10;
                            }
                        } else {
                            n3 = R$styleable.Transition_staggered;
                            if (n10 == n3) {
                                f5 = this.i;
                                this.i = f5 = xmlResourceParser.getFloat(n10, f5);
                            } else {
                                n3 = R$styleable.Transition_autoTransition;
                                if (n10 == n3) {
                                    n3 = this.n;
                                    this.n = n3 = xmlResourceParser.getInteger(n10, n3);
                                } else {
                                    n3 = R$styleable.Transition_android_id;
                                    if (n10 == n3) {
                                        n3 = this.a;
                                        this.a = n3 = xmlResourceParser.getResourceId(n10, n3);
                                    } else {
                                        n3 = R$styleable.Transition_transitionDisable;
                                        if (n10 == n3) {
                                            n3 = (int)(this.o ? 1 : 0);
                                            n3 = (int)(xmlResourceParser.getBoolean(n10, n3 != 0) ? 1 : 0);
                                            this.o = n3;
                                        } else {
                                            n3 = R$styleable.Transition_pathMotionArc;
                                            if (n10 == n3) {
                                                this.p = n3 = xmlResourceParser.getInteger(n10, n7);
                                            } else {
                                                n3 = R$styleable.Transition_layoutDuringTransition;
                                                if (n10 == n3) {
                                                    this.q = n3 = xmlResourceParser.getInteger(n10, 0);
                                                } else {
                                                    n3 = R$styleable.Transition_transitionFlags;
                                                    if (n10 == n3) {
                                                        this.r = n3 = xmlResourceParser.getInteger(n10, 0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++n8;
        }
        int n16 = this.d;
        if (n16 == n7) {
            this.b = n3;
        }
        xmlResourceParser.recycle();
    }

    public a$b(a object, a$b a$b) {
        int n3;
        ArrayList arrayList;
        ArrayList arrayList2;
        int n4;
        this.a = n4 = -1;
        this.b = false;
        this.c = n4;
        this.d = n4;
        this.e = 0;
        this.f = null;
        this.g = n4;
        this.h = 400;
        this.i = 0.0f;
        this.k = arrayList2 = new ArrayList();
        this.l = null;
        this.m = arrayList = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = n4;
        this.q = 0;
        this.r = 0;
        this.j = object;
        this.h = n3 = ((a)object).j;
        if (a$b != null) {
            float f5;
            this.p = n3 = a$b.p;
            this.e = n3 = a$b.e;
            this.f = object = a$b.f;
            this.g = n3 = a$b.g;
            this.h = n3 = a$b.h;
            this.k = object = a$b.k;
            this.i = f5 = a$b.i;
            this.q = n3 = a$b.q;
        }
    }
}

