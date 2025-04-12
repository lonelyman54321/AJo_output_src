/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.StateSet
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat$b;
import androidx.appcompat.graphics.drawable.a$a;
import androidx.appcompat.graphics.drawable.a$b;
import androidx.appcompat.graphics.drawable.a$c;
import androidx.appcompat.graphics.drawable.a$d;
import androidx.appcompat.graphics.drawable.a$f;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.graphics.drawable.b$a;
import androidx.appcompat.resources.R$styleable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a
extends b
implements Pn3 {
    public a$b p;
    public a$f q;
    public int r;
    public int s;
    public boolean t;

    public a(a$b object, Resources resources) {
        int n3;
        this.r = n3 = -1;
        this.s = n3;
        a$b a$b = new a$b((a$b)((Object)object), this, resources);
        this.e(a$b);
        object = this.getState();
        this.onStateChange((int[])object);
        this.jumpToCurrentState();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static a g(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int n3;
        Object object;
        Object object2;
        Context context2 = context;
        Object object3 = resources;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Object object4 = xmlResourceParser.getName();
        int n4 = ((String)object4).equals(object2 = "animated-selector");
        if (n4 == 0) {
            object3 = new StringBuilder();
            String string2 = xmlResourceParser.getPositionDescription();
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(": invalid animated-selector tag ");
            ((StringBuilder)object3).append((String)object4);
            object3 = ((StringBuilder)object3).toString();
            XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
            throw xmlPullParserException;
        }
        n4 = 0;
        object4 = new a(null, null);
        object2 = R$styleable.AnimatedStateListDrawableCompat;
        object2 = dt3.g(resources, theme, attributeSet, (int[])object2);
        int n7 = R$styleable.AnimatedStateListDrawableCompat_android_visible;
        int n8 = 1;
        n7 = (int)(object2.getBoolean(n7, n8 != 0) ? 1 : 0);
        ((a)object4).setVisible(n7 != 0, n8 != 0);
        Object object5 = ((a)object4).p;
        int n10 = ((DrawableContainerCompat$b)((Object)object5)).d;
        int n14 = t00.b((TypedArray)object2);
        ((DrawableContainerCompat$b)((Object)object5)).d = n10 |= n14;
        n10 = R$styleable.AnimatedStateListDrawableCompat_android_variablePadding;
        n14 = (int)(((DrawableContainerCompat$b)((Object)object5)).i ? 1 : 0);
        n10 = (int)(object2.getBoolean(n10, n14 != 0) ? 1 : 0);
        ((DrawableContainerCompat$b)((Object)object5)).i = n10;
        n10 = R$styleable.AnimatedStateListDrawableCompat_android_constantSize;
        n14 = ((DrawableContainerCompat$b)((Object)object5)).l;
        n10 = (int)(object2.getBoolean(n10, n14 != 0) ? 1 : 0);
        ((DrawableContainerCompat$b)((Object)object5)).l = n10;
        n10 = R$styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration;
        n14 = ((DrawableContainerCompat$b)((Object)object5)).y;
        ((DrawableContainerCompat$b)((Object)object5)).y = n10 = object2.getInt(n10, n14);
        n10 = R$styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration;
        n14 = ((DrawableContainerCompat$b)((Object)object5)).z;
        ((DrawableContainerCompat$b)((Object)object5)).z = n10 = object2.getInt(n10, n14);
        n10 = R$styleable.AnimatedStateListDrawableCompat_android_dither;
        n7 = ((DrawableContainerCompat$b)((Object)object5)).w;
        n7 = object2.getBoolean(n10, n7 != 0);
        ((DrawableContainerCompat)((Object)object4)).setDither(n7 != 0);
        object5 = ((DrawableContainerCompat)((Object)object4)).a;
        n10 = 0;
        if (resources != null) {
            ((DrawableContainerCompat$b)((Object)object5)).b = resources;
            object = resources.getDisplayMetrics();
            n14 = ((DisplayMetrics)object).densityDpi;
            if (n14 == 0) {
                n14 = 160;
            }
            n3 = ((DrawableContainerCompat$b)((Object)object5)).c;
            ((DrawableContainerCompat$b)((Object)object5)).c = n14;
            if (n3 != n14) {
                ((DrawableContainerCompat$b)((Object)object5)).m = false;
                ((DrawableContainerCompat$b)((Object)object5)).j = false;
            }
        } else {
            object5.getClass();
        }
        object2.recycle();
        n4 = xmlResourceParser.getDepth() + n8;
        while (true) {
            block29: {
                Object object6;
                int[] nArray;
                int n15;
                int n16;
                Object object7;
                block28: {
                    block26: {
                        pb1_0 pb1_02;
                        void var5_6;
                        int n17;
                        int n18;
                        block27: {
                            if ((n7 = xmlResourceParser.next()) == n8 || (n14 = xmlResourceParser.getDepth()) < n4 && n7 == (n3 = 3)) break block26;
                            n3 = 2;
                            if (n7 != n3 || n14 > n4) continue;
                            object5 = xmlResourceParser.getName();
                            object = "item";
                            n7 = (int)(((String)object5).equals(object) ? 1 : 0);
                            n18 = 0;
                            object7 = null;
                            n17 = -1;
                            if (n7 == 0) break block27;
                            object5 = R$styleable.AnimatedStateListDrawableItem;
                            object5 = dt3.g((Resources)object3, theme2, attributeSet2, (int[])object5);
                            n16 = R$styleable.AnimatedStateListDrawableItem_android_id;
                            n16 = object5.getResourceId(n16, 0);
                            n15 = R$styleable.AnimatedStateListDrawableItem_android_drawable;
                            if ((n17 = object5.getResourceId(n15, n17)) > 0) {
                                object7 = OK2.d().f((Context)var5_6, n17);
                            }
                            object5.recycle();
                            n7 = attributeSet.getAttributeCount();
                            nArray = new int[n7];
                            n8 = 0;
                            object6 = null;
                            pb1_02 = null;
                            break block28;
                        }
                        object5 = xmlResourceParser.getName();
                        n7 = (int)(((String)object5).equals(object6 = "transition") ? 1 : 0);
                        if (n7 != 0) {
                            object5 = R$styleable.AnimatedStateListDrawableTransition;
                            object5 = dt3.g((Resources)object3, theme2, attributeSet2, (int[])object5);
                            n8 = R$styleable.AnimatedStateListDrawableTransition_android_fromId;
                            n8 = object5.getResourceId(n8, n17);
                            n14 = R$styleable.AnimatedStateListDrawableTransition_android_toId;
                            n14 = object5.getResourceId(n14, n17);
                            n3 = R$styleable.AnimatedStateListDrawableTransition_android_drawable;
                            if ((n3 = object5.getResourceId(n3, n17)) > 0) {
                                object7 = OK2.d().f((Context)var5_6, n3);
                            }
                            n3 = R$styleable.AnimatedStateListDrawableTransition_android_reversible;
                            n3 = (int)(object5.getBoolean(n3, false) ? 1 : 0);
                            object5.recycle();
                            object5 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
                            if (object7 == null) {
                                String string3;
                                while ((n18 = xmlResourceParser.next()) == (n16 = 4)) {
                                }
                                n15 = 2;
                                if (n18 != n15) {
                                    object3 = new StringBuilder();
                                    String string4 = xmlResourceParser.getPositionDescription();
                                    ((StringBuilder)object3).append(string4);
                                    ((StringBuilder)object3).append((String)object5);
                                    object3 = ((StringBuilder)object3).toString();
                                    XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
                                    throw xmlPullParserException;
                                }
                                object7 = xmlResourceParser.getName();
                                n18 = (int)(((String)object7).equals(string3 = "animated-vector") ? 1 : 0);
                                if (n18 != 0) {
                                    object7 = new tk_0((Context)var5_6);
                                    ((tk_0)object7).inflate((Resources)object3, (XmlPullParser)xmlResourceParser2, attributeSet2, theme2);
                                } else {
                                    object7 = t00.a(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme);
                                }
                            }
                            if (object7 == null) {
                                object3 = new StringBuilder();
                                String string5 = xmlResourceParser.getPositionDescription();
                                ((StringBuilder)object3).append(string5);
                                ((StringBuilder)object3).append((String)object5);
                                object3 = ((StringBuilder)object3).toString();
                                XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
                                throw xmlPullParserException;
                            }
                            if (n8 != n17 && n14 != n17) {
                                object5 = ((a)object4).p;
                                n18 = ((DrawableContainerCompat$b)((Object)object5)).a((Drawable)object7);
                                long l2 = n8;
                                n8 = 32;
                                long l3 = l2 << n8;
                                long l4 = n14;
                                long l7 = l3 | l4;
                                l3 = n3 != 0 ? 0x200000000L : 0L;
                                pb1_02 = ((a$b)((Object)object5)).I;
                                long l8 = n18;
                                long l12 = l8 | l3;
                                object = l12;
                                pb1_02.b(l7, (Long)object);
                                if (n3 != 0) {
                                    int n19 = 32;
                                    l7 = l4 << n19 | l2;
                                    object5 = ((a$b)((Object)object5)).I;
                                    long l14 = 0x100000000L;
                                    l8 = l8 | l14 | l3;
                                    object6 = l8;
                                    ((pb1_0)object5).b(l7, (Long)object6);
                                }
                                Context context3 = context;
                                object3 = resources;
                                n8 = 1;
                                n10 = 0;
                                continue;
                            }
                            object3 = new StringBuilder();
                            String string6 = xmlResourceParser.getPositionDescription();
                            ((StringBuilder)object3).append(string6);
                            ((StringBuilder)object3).append(": <transition> tag requires 'fromId' & 'toId' attributes");
                            object3 = ((StringBuilder)object3).toString();
                            XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
                            throw xmlPullParserException;
                        }
                        Context context4 = context;
                        object3 = resources;
                        break block29;
                    }
                    int[] nArray2 = object4.getState();
                    ((a)object4).onStateChange(nArray2);
                    return object4;
                }
                for (n15 = 0; n15 < n7; ++n15) {
                    n3 = attributeSet2.getAttributeNameResource(n15);
                    if (n3 != 0 && n3 != (n14 = 0x10100D0) && n3 != (n14 = 0x1010199)) {
                        n14 = n8 + 1;
                        boolean bl2 = attributeSet2.getAttributeBooleanValue(n15, false);
                        if (!bl2) {
                            n3 = -n3;
                        }
                        nArray[n8] = n3;
                        n8 = n14;
                    }
                    n3 = 2;
                }
                object5 = StateSet.trimStateSet((int[])nArray, (int)n8);
                object6 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
                if (object7 == null) {
                    String string7;
                    while ((n14 = xmlResourceParser.next()) == (n3 = 4)) {
                    }
                    n3 = 2;
                    if (n14 != n3) {
                        object3 = new StringBuilder();
                        String string8 = xmlResourceParser.getPositionDescription();
                        ((StringBuilder)object3).append(string8);
                        ((StringBuilder)object3).append((String)object6);
                        object3 = ((StringBuilder)object3).toString();
                        XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
                        throw xmlPullParserException;
                    }
                    object = xmlResourceParser.getName();
                    n14 = (int)(((String)object).equals(string7 = "vector") ? 1 : 0);
                    if (n14 != 0) {
                        object7 = new aa3_1();
                        ((aa3_1)object7).inflate((Resources)object3, (XmlPullParser)xmlResourceParser2, attributeSet2, theme2);
                    } else {
                        object7 = t00.a(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme);
                    }
                }
                if (object7 == null) {
                    object3 = new StringBuilder();
                    String string9 = xmlResourceParser.getPositionDescription();
                    ((StringBuilder)object3).append(string9);
                    ((StringBuilder)object3).append((String)object6);
                    object3 = ((StringBuilder)object3).toString();
                    XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
                    throw xmlPullParserException;
                }
                object6 = ((a)object4).p;
                n14 = ((DrawableContainerCompat$b)((Object)object6)).a((Drawable)object7);
                int[][] nArray3 = ((b$a)((Object)object6)).H;
                nArray3[n14] = (int[])object5;
                object5 = ((a$b)((Object)object6)).J;
                object6 = n16;
                ((ca3)object5).i(n14, object6);
            }
            n8 = 1;
        }
    }

    public final DrawableContainerCompat$b b() {
        a$b a$b = this.p;
        a$b a$b2 = new a$b(a$b, this, null);
        return a$b2;
    }

    public final void e(DrawableContainerCompat$b drawableContainerCompat$b) {
        super.e(drawableContainerCompat$b);
        boolean bl2 = drawableContainerCompat$b instanceof a$b;
        if (bl2) {
            drawableContainerCompat$b = (a$b)drawableContainerCompat$b;
            this.p = drawableContainerCompat$b;
        }
    }

    public final b$a f() {
        a$b a$b = this.p;
        a$b a$b2 = new a$b(a$b, this, null);
        return a$b2;
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        a$f a$f = this.q;
        if (a$f != null) {
            a$f.d();
            a$f = null;
            this.q = null;
            int n3 = this.r;
            this.d(n3);
            this.r = n3 = -1;
            this.s = n3;
        }
    }

    public final Drawable mutate() {
        boolean bl2 = this.t;
        if (!bl2) {
            super.mutate();
            a$b a$b = this.p;
            a$b.e();
            this.t = bl2 = true;
        }
        return this;
    }

    public final boolean onStateChange(int[] nArray) {
        boolean bl2;
        a$b a$b;
        block8: {
            block10: {
                int n3;
                int n4;
                block12: {
                    Object object;
                    block14: {
                        Drawable drawable2;
                        int n7;
                        block15: {
                            block13: {
                                long l2;
                                block9: {
                                    block11: {
                                        a$b = this.p;
                                        n4 = a$b.f(nArray);
                                        if (n4 < 0) {
                                            int[] nArray2 = StateSet.WILD_CARD;
                                            n4 = a$b.f(nArray2);
                                        }
                                        n3 = this.g;
                                        bl2 = false;
                                        if (n4 == n3) break block8;
                                        object = this.q;
                                        if (object == null) break block9;
                                        n3 = this.r;
                                        if (n4 == n3) break block10;
                                        n3 = this.s;
                                        if (n4 != n3 || (n3 = (int)(((a$f)object).a() ? 1 : 0)) == 0) break block11;
                                        ((a$f)object).b();
                                        this.r = n3 = this.s;
                                        this.s = n4;
                                        break block10;
                                    }
                                    n3 = this.r;
                                    ((a$f)object).d();
                                }
                                this.q = null;
                                this.s = n7 = -1;
                                this.r = n7;
                                object = this.p;
                                int n8 = ((a$b)((Object)object)).g(n3);
                                int n10 = ((a$b)((Object)object)).g(n4);
                                if (n10 == 0 || n8 == 0) break block12;
                                long l3 = n8;
                                n8 = 32;
                                l3 <<= n8;
                                long l4 = (long)n10 | l3;
                                Long l7 = (Long)((a$b)((Object)object)).I.g(l4);
                                int n14 = (int)(l3 = l7.longValue());
                                if (n14 < 0) break block12;
                                l7 = (Long)((a$b)((Object)object)).I.g(l4);
                                long l8 = l7 & 0x200000000L;
                                long l12 = l8 - (l2 = 0L);
                                Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                if (object2 != false) {
                                    object2 = 1;
                                } else {
                                    object2 = 0;
                                    l7 = null;
                                }
                                this.d(n14);
                                drawable2 = this.c;
                                boolean bl3 = drawable2 instanceof AnimationDrawable;
                                if (!bl3) break block13;
                                object = (Long)((a$b)((Object)object)).I.g(l4);
                                l4 = (Long)object;
                                l8 = 0x100000000L;
                                long l14 = (l4 &= l8) - l2;
                                n7 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                                if (n7 != 0) {
                                    bl2 = true;
                                }
                                drawable2 = (AnimationDrawable)drawable2;
                                object = new a$d((AnimationDrawable)drawable2, bl2, (boolean)object2);
                                break block14;
                            }
                            n7 = drawable2 instanceof tk_0;
                            if (n7 == 0) break block15;
                            drawable2 = (tk_0)drawable2;
                            object = new a$c((tk_0)drawable2);
                            break block14;
                        }
                        n7 = drawable2 instanceof Animatable;
                        if (n7 == 0) break block12;
                        drawable2 = (Animatable)drawable2;
                        object = new a$a((Animatable)drawable2);
                    }
                    ((a$f)object).c();
                    this.q = object;
                    this.s = n3;
                    this.r = n4;
                    break block10;
                }
                if ((n3 = (int)(this.d(n4) ? 1 : 0)) == 0) break block8;
            }
            bl2 = true;
        }
        if ((a$b = this.c) != null) {
            boolean bl4 = a$b.setState(nArray);
            bl2 |= bl4;
        }
        return bl2;
    }

    public final boolean setVisible(boolean bl2, boolean bl3) {
        boolean bl4 = super.setVisible(bl2, bl3);
        a$f a$f = this.q;
        if (a$f != null && (bl4 || bl3)) {
            if (bl2) {
                a$f.c();
            } else {
                this.jumpToCurrentState();
            }
        }
        return bl4;
    }
}

