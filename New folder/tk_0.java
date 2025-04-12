/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorSet
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimatedVectorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Renamed from Tk
 */
public final class tk_0
extends za3_0
implements Animatable {
    public static final /* synthetic */ int g;
    public final Tk$b b;
    public final Context c;
    public uk_0 d = null;
    public ArrayList e = null;
    public final Tk$a f;

    public tk_0() {
        this(null);
    }

    public tk_0(Context object) {
        Tk$a tk$a;
        this.f = tk$a = new Tk$a(this);
        this.c = object;
        this.b = object;
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.applyTheme(theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.canApplyTheme();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Object object = this.a;
        if (object != null) {
            object.draw(canvas);
            return;
        }
        object = this.b;
        aa3_1 aa3_12 = object.a;
        aa3_12.draw(canvas);
        canvas = object.b;
        boolean bl2 = canvas.isStarted();
        if (bl2) {
            this.invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getAlpha();
        }
        return this.b.a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getChangingConfigurations();
        }
        int n3 = super.getChangingConfigurations();
        ((Object)((Object)this.b)).getClass();
        return n3 | 0;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getColorFilter();
        }
        return this.b.a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        int n3;
        int n4;
        Object object = this.a;
        if (object != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 24)) {
            Drawable.ConstantState constantState = this.a.getConstantState();
            object = new Tk$c(constantState);
            return object;
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getIntrinsicHeight();
        }
        return this.b.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getIntrinsicWidth();
        }
        return this.b.a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return this.b.a.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Tk$b tk$b;
        tk_0 tk_02 = this;
        Object object = resources;
        Object object2 = attributeSet;
        Object object3 = theme;
        Object object4 = this.a;
        if (object4 != null) {
            object4.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int n3 = xmlPullParser.getEventType();
        int n4 = xmlPullParser.getDepth();
        int n7 = 1;
        n4 += n7;
        while (true) {
            block24: {
                block26: {
                    int n8;
                    Object object5;
                    Object object6;
                    block25: {
                        int n10;
                        tk$b = tk_02.b;
                        if (n3 == n7 || (n10 = xmlPullParser.getDepth()) < n4 && n3 == (n10 = 3)) break;
                        n10 = 2;
                        if (n3 != n10) break block24;
                        object4 = xmlPullParser.getName();
                        object6 = "animated-vector";
                        n10 = (int)(((String)object6).equals(object4) ? 1 : 0);
                        object5 = null;
                        n8 = 0;
                        Object object7 = null;
                        if (n10 == 0) break block25;
                        object4 = Pi.e;
                        n10 = (object4 = dt3.g(object, (Resources.Theme)object3, (AttributeSet)object2, (int[])object4)).getResourceId(0, 0);
                        if (n10 != 0) {
                            object6 = aa3_1.a(n10, (Resources.Theme)object3, object);
                            ((aa3_1)object6).f = false;
                            object7 = tk_02.f;
                            object6.setCallback((Drawable.Callback)object7);
                            object7 = tk$b.a;
                            if (object7 != null) {
                                object7.setCallback(null);
                            }
                            tk$b.a = object6;
                        }
                        object4.recycle();
                        break block24;
                    }
                    object6 = "target";
                    n3 = (int)(((String)object6).equals(object4) ? 1 : 0);
                    if (n3 == 0) break block24;
                    object4 = Pi.f;
                    object4 = object.obtainAttributes((AttributeSet)object2, (int[])object4);
                    object6 = object4.getString(0);
                    n8 = object4.getResourceId(n7, 0);
                    if (n8 != 0) {
                        Throwable throwable2;
                        block23: {
                            void var6_12;
                            Object object8;
                            block21: {
                                block20: {
                                    Context context = tk_02.c;
                                    if (context == null) {
                                        object4.recycle();
                                        object = new IllegalStateException("Context can't be null when inflating animators");
                                        throw object;
                                    }
                                    int n14 = Build.VERSION.SDK_INT;
                                    int n15 = 24;
                                    if (n14 >= n15) {
                                        object5 = AnimatorInflater.loadAnimator((Context)context, (int)n8);
                                    } else {
                                        Resources resources2 = context.getResources();
                                        Resources.Theme theme2 = context.getTheme();
                                        String string2 = "Can't load animation resource ID #0x";
                                        try {
                                            AttributeSet attributeSet2;
                                            try {
                                                object5 = resources2.getAnimation(n8);
                                                attributeSet2 = Xml.asAttributeSet((XmlPullParser)object5);
                                                object8 = string2;
                                                string2 = object5;
                                            }
                                            catch (IOException iOException) {
                                                object8 = string2;
                                                break block20;
                                            }
                                            catch (XmlPullParserException xmlPullParserException) {
                                                object8 = string2;
                                                break block21;
                                            }
                                            try {
                                                object8 = Rl.a(context, resources2, theme2, (XmlResourceParser)object5, attributeSet2, null, 0);
                                            }
                                            catch (IOException iOException) {
                                                break block20;
                                            }
                                            catch (XmlPullParserException xmlPullParserException) {
                                                break block21;
                                            }
                                        }
                                        catch (Throwable throwable2) {
                                            break block23;
                                        }
                                        object5.close();
                                        object5 = object8;
                                    }
                                    object8 = tk$b.a.b.b.o.get(object6);
                                    object5.setTarget(object8);
                                    object8 = tk$b.c;
                                    if (object8 == null) {
                                        object8 = new ArrayList();
                                        tk$b.c = object8;
                                        tk$b.d = object8 = new Jp();
                                    }
                                    tk$b.c.add(object5);
                                    object8 = tk$b.d;
                                    ((a53)object8).put(object5, object6);
                                    break block26;
                                }
                                object3 = new StringBuilder((String)object8);
                                object4 = Integer.toHexString(n8);
                                ((StringBuilder)object3).append((String)object4);
                                object3 = ((StringBuilder)object3).toString();
                                object2 = new Resources.NotFoundException((String)object3);
                                ((Throwable)object2).initCause((Throwable)object);
                                throw object2;
                            }
                            object3 = new StringBuilder((String)object8);
                            object4 = Integer.toHexString(n8);
                            ((StringBuilder)object3).append((String)object4);
                            object3 = ((StringBuilder)object3).toString();
                            object2 = new Resources.NotFoundException((String)object3);
                            ((Throwable)object2).initCause((Throwable)var6_12);
                            throw object2;
                        }
                        if (object5 != null) {
                            object5.close();
                        }
                        throw throwable2;
                    }
                }
                object4.recycle();
            }
            n3 = xmlPullParser.next();
            n7 = 1;
        }
        object = tk$b.b;
        if (object == null) {
            object = new AnimatorSet();
            tk$b.b = object;
        }
        object = tk$b.b;
        object2 = tk$b.c;
        object.playTogether((Collection)object2);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.isAutoMirrored();
        }
        return this.b.a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return ((AnimatedVectorDrawable)drawable2).isRunning();
        }
        return this.b.b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.isStateful();
        }
        return this.b.a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
            return;
        }
        this.b.a.setBounds(rect);
    }

    public final boolean onLevelChange(int n3) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.setLevel(n3);
        }
        return this.b.a.setLevel(n3);
    }

    public final boolean onStateChange(int[] nArray) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.setState(nArray);
        }
        return this.b.a.setState(nArray);
    }

    public final void setAlpha(int n3) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setAlpha(n3);
            return;
        }
        this.b.a.setAlpha(n3);
    }

    public final void setAutoMirrored(boolean bl2) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(bl2);
            return;
        }
        this.b.a.setAutoMirrored(bl2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        this.b.a.setColorFilter(colorFilter);
    }

    public final void setTint(int n3) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            ut0_0.d(drawable2, n3);
            return;
        }
        this.b.a.setTint(n3);
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            ut0_0.e(drawable2, colorStateList);
            return;
        }
        this.b.a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            ut0_0.f(drawable2, mode);
            return;
        }
        this.b.a.setTintMode(mode);
    }

    public final boolean setVisible(boolean bl2, boolean bl3) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.setVisible(bl2, bl3);
        }
        this.b.a.setVisible(bl2, bl3);
        return super.setVisible(bl2, bl3);
    }

    public final void start() {
        Object object = this.a;
        if (object != null) {
            ((AnimatedVectorDrawable)object).start();
            return;
        }
        object = this.b;
        AnimatorSet animatorSet = object.b;
        boolean bl2 = animatorSet.isStarted();
        if (bl2) {
            return;
        }
        object.b.start();
        this.invalidateSelf();
    }

    public final void stop() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            ((AnimatedVectorDrawable)drawable2).stop();
            return;
        }
        this.b.b.end();
    }
}

