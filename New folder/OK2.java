/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.LayerDrawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class OK2 {
    public static final PorterDuff.Mode h;
    public static OK2 i;
    public static final OK2$c j;
    public WeakHashMap a;
    public a53 b;
    public ca3 c;
    public final WeakHashMap d;
    public TypedValue e;
    public boolean f;
    public OK2$f g;

    static {
        OK2$c oK2$c;
        h = PorterDuff.Mode.SRC_IN;
        j = oK2$c = new WC1(6);
    }

    public OK2() {
        WeakHashMap weakHashMap;
        this.d = weakHashMap = new WeakHashMap(0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OK2 d() {
        Class<OK2> clazz = OK2.class;
        synchronized (clazz) {
            try {
                OK2 oK2 = i;
                if (oK2 != null) return i;
                i = oK2 = new OK2();
                OK2.j(oK2);
                return i;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PorterDuffColorFilter h(int n3, PorterDuff.Mode mode) {
        Class<OK2> clazz = OK2.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                Object object;
                block5: {
                    int n4;
                    int n7;
                    OK2$c oK2$c;
                    try {
                        oK2$c = j;
                        oK2$c.getClass();
                        n7 = 31;
                        n4 = (n7 + n3) * 31;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        n7 = mode.hashCode() + n4;
                        object = n7;
                        object = oK2$c.get(object);
                        object = (PorterDuffColorFilter)object;
                        if (object != null) break block5;
                        object = new PorterDuffColorFilter(n3, mode);
                        n3 = mode.hashCode() + n4;
                        Object object2 = n3;
                        object2 = oK2$c.put(object2, object);
                        object2 = (PorterDuffColorFilter)object2;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    public static void j(OK2 oK2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 < n4) {
            OK2$e oK2$e = new Object();
            oK2.a("vector", oK2$e);
            oK2$e = new Object();
            oK2.a("animated-vector", oK2$e);
            oK2$e = new Object();
            oK2.a("animated-selector", oK2$e);
            oK2$e = new OK2$d();
            String string2 = "drawable";
            oK2.a(string2, oK2$e);
        }
    }

    public final void a(String string2, OK2$e oK2$e) {
        a53 a532 = this.b;
        if (a532 == null) {
            this.b = a532 = new a53();
        }
        this.b.put(string2, oK2$e);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Context object, long l2, Drawable drawable2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                block4: {
                    try {
                        drawable2 = drawable2.getConstantState();
                        if (drawable2 == null) {
                            return;
                        }
                        object2 = this.d;
                        object2 = ((WeakHashMap)object2).get(object);
                        if ((object2 = (pb1_0)object2) != null) break block4;
                        object2 = new pb1_0();
                        WeakHashMap weakHashMap = this.d;
                        weakHashMap.put(object, object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = new WeakReference(drawable2);
                ((pb1_0)object2).l(l2, object);
                return;
            }
            throw throwable2;
        }
    }

    public final Drawable c(int n3, Context context) {
        int n4 = 1;
        TypedValue typedValue = this.e;
        if (typedValue == null) {
            this.e = typedValue = new TypedValue();
        }
        typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(n3, typedValue, n4 != 0);
        int n7 = typedValue.assetCookie;
        long l2 = (long)n7 << 32;
        int n8 = typedValue.data;
        long l3 = n8;
        Object object = this.e(context, l2 |= l3);
        if (object != null) {
            return object;
        }
        object = this.g;
        LayerDrawable layerDrawable = null;
        if (object != null) {
            n8 = R$drawable.abc_cab_background_top_material;
            if (n3 == n8) {
                n3 = R$drawable.abc_cab_background_internal_bg;
                Drawable drawable2 = this.f(context, n3);
                n8 = R$drawable.abc_cab_background_top_mtrl_alpha;
                object = this.f(context, n8);
                int n10 = 2;
                Drawable[] drawableArray = new Drawable[n10];
                drawableArray[0] = drawable2;
                drawableArray[n4] = object;
                layerDrawable = new LayerDrawable(drawableArray);
            } else {
                n4 = R$drawable.abc_ratingbar_material;
                if (n3 == n4) {
                    n3 = R$dimen.abc_star_big;
                    layerDrawable = qn$a.c(this, context, n3);
                } else {
                    n4 = R$drawable.abc_ratingbar_indicator_material;
                    if (n3 == n4) {
                        n3 = R$dimen.abc_star_medium;
                        layerDrawable = qn$a.c(this, context, n3);
                    } else {
                        n4 = R$drawable.abc_ratingbar_small_material;
                        if (n3 == n4) {
                            n3 = R$dimen.abc_star_small;
                            layerDrawable = qn$a.c(this, context, n3);
                        }
                    }
                }
            }
        }
        if (layerDrawable != null) {
            n3 = typedValue.changingConfigurations;
            layerDrawable.setChangingConfigurations(n3);
            this.b(context, l2, (Drawable)layerDrawable);
        }
        return layerDrawable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable e(Context context, long l2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object;
                block6: {
                    block5: {
                        try {
                            object = this.d;
                            object = ((WeakHashMap)object).get(context);
                            object = (pb1_0)object;
                            if (object != null) break block5;
                        }
                        catch (Throwable throwable2) {}
                        return null;
                    }
                    Object object2 = ((pb1_0)object).f(l2);
                    object2 = (WeakReference)object2;
                    if (object2 == null) return null;
                    object2 = ((Reference)object2).get();
                    if ((object2 = (Drawable.ConstantState)object2) == null) break block6;
                    context = context.getResources();
                    return object2.newDrawable((Resources)context);
                }
                ((pb1_0)object).m(l2);
                break block7;
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable f(Context context, int n3) {
        synchronized (this) {
            return this.g(context, n3, false);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable g(Context var1_1, int var2_3, boolean var3_4) {
        synchronized (this) {
            block28: {
                block22: {
                    block29: {
                        block31: {
                            block34: {
                                block32: {
                                    block33: {
                                        block30: {
                                            block24: {
                                                block27: {
                                                    block26: {
                                                        block25: {
                                                            var4_5 = this.f;
                                                            var5_6 = 1;
                                                            if (var4_5 != 0) ** GOTO lbl18
                                                            this.f = var5_6;
                                                            var4_5 = androidx.appcompat.resources.R$drawable.abc_vector_test;
                                                            var6_7 /* !! */  = this.f(var1_1 /* !! */ , var4_5);
                                                            if (var6_7 /* !! */  == null) break block22;
                                                            var7_8 = var6_7 /* !! */  instanceof aa3_1;
                                                            if (var7_8) ** GOTO lbl18
                                                            var6_7 /* !! */  = var6_7 /* !! */ .getClass();
                                                            var6_7 /* !! */  = var6_7 /* !! */ .getName();
                                                            var8_9 = "android.graphics.drawable.VectorDrawable";
                                                            var4_5 = (int)var8_9.equals(var6_7 /* !! */ );
                                                            if (var4_5 == 0) break block22;
lbl18:
                                                            // 3 sources

                                                            var6_7 /* !! */  = this.b;
                                                            var7_8 = false;
                                                            var8_9 = null;
                                                            if (var6_7 /* !! */  == null || (var4_5 = (int)var6_7 /* !! */ .isEmpty()) != 0) break block25;
                                                            var6_7 /* !! */  = this.c;
                                                            var9_10 = "appcompat_skip_skip";
                                                            if (var6_7 /* !! */  == null) break block26;
                                                            var6_7 /* !! */  = var6_7 /* !! */ .f(var2_3);
                                                            var10_11 = var9_10.equals(var6_7 /* !! */  = (String)var6_7 /* !! */ );
                                                            if (var10_11 == 0 && (var6_7 /* !! */  == null || (var6_7 /* !! */  = (var11_12 = this.b).get(var6_7 /* !! */ )) != null)) break block27;
                                                        }
                                                        var12_13 = false;
                                                        var13_15 /* !! */  = null;
                                                        ** GOTO lbl86
                                                    }
                                                    this.c = var6_7 /* !! */  = new ca3();
                                                }
                                                if ((var6_7 /* !! */  = this.e) == null) {
                                                    var6_7 /* !! */  = new TypedValue();
                                                    this.e = var6_7 /* !! */ ;
                                                }
                                                var6_7 /* !! */  = this.e;
                                                var11_12 = var1_1 /* !! */ .getResources();
                                                var11_12.getValue(var2_3, (TypedValue)var6_7 /* !! */ , (boolean)var5_6);
                                                var14_16 = var6_7 /* !! */ .assetCookie;
                                                var15_17 = var14_16;
                                                var12_14 = 32;
                                                var15_17 <<= var12_14;
                                                var12_14 = var6_7 /* !! */ .data;
                                                var17_18 = var12_14;
                                                var15_17 |= var17_18;
                                                try {
                                                    var13_15 /* !! */  = this.e(var1_1 /* !! */ , var15_17);
                                                    if (var13_15 /* !! */  != null) ** GOTO lbl86
                                                    var19_19 = var6_7 /* !! */ .string;
                                                    if (var19_19 == null || !(var21_21 = (var19_19 = var19_19.toString()).endsWith((String)(var20_20 = ".xml")))) ** GOTO lbl82
                                                    var11_12 = var11_12.getXml(var2_3);
                                                    var19_19 = Xml.asAttributeSet((XmlPullParser)var11_12);
                                                    while ((var22_22 = var11_12.next()) != (var23_23 = 2) && var22_22 != var5_6) {
                                                    }
                                                    if (var22_22 != var23_23) ** GOTO lbl78
                                                    var24_24 = var11_12.getName();
                                                    var20_20 = this.c;
                                                    var20_20.b(var2_3, var24_24);
                                                    var20_20 = this.b;
                                                    var24_24 = var20_20.get(var24_24);
                                                    var24_24 = (OK2$e)var24_24;
                                                    if (var24_24 != null) {
                                                        var20_20 = var1_1 /* !! */ .getTheme();
                                                        var13_15 /* !! */  = var24_24.a(var1_1 /* !! */ , (XmlResourceParser)var11_12, (AttributeSet)var19_19, (Resources.Theme)var20_20);
                                                    }
                                                    if (var13_15 /* !! */  == null) ** GOTO lbl82
                                                    {
                                                        catch (Exception v0) {}
                                                    }
                                                    var4_5 = var6_7 /* !! */ .changingConfigurations;
                                                    var13_15 /* !! */ .setChangingConfigurations(var4_5);
                                                    this.b(var1_1 /* !! */ , var15_17, var13_15 /* !! */ );
                                                    break block23;
lbl78:
                                                    // 1 sources

                                                    var24_25 = "No start tag found";
                                                }
                                                catch (Throwable var1_2) {}
                                                {
                                                    block23: {
                                                        var6_7 /* !! */  = new XmlPullParserException(var24_25);
                                                        throw var6_7 /* !! */ ;
                                                    }
                                                    if (var13_15 /* !! */  == null) {
                                                        var6_7 /* !! */  = this.c;
                                                        var6_7 /* !! */ .b(var2_3, var9_10);
                                                    }
lbl86:
                                                    // 5 sources

                                                    if (var13_15 /* !! */  != null) break block24;
                                                    var13_15 /* !! */  = this.c(var2_3, var1_1 /* !! */ );
                                                }
                                                break block28;
                                            }
                                            if (var13_15 /* !! */  == null) {
                                                var13_15 /* !! */  = t70.getDrawable(var1_1 /* !! */ , var2_3);
                                            }
                                            if (var13_15 /* !! */  == null) break block29;
                                            var6_7 /* !! */  = this.i(var2_3, var1_1 /* !! */ );
                                            if (var6_7 /* !! */  == null) break block30;
                                            var1_1 /* !! */  = var13_15 /* !! */ .mutate();
                                            var1_1 /* !! */  = ut0_0.h((Drawable)var1_1 /* !! */ );
                                            var1_1 /* !! */ .setTintList((ColorStateList)var6_7 /* !! */ );
                                            var25_26 = this.g;
                                            if (var25_26 != null && var2_3 == (var3_4 = R$drawable.abc_switch_thumb_material)) {
                                                var8_9 = PorterDuff.Mode.MULTIPLY;
                                            }
                                            if (var8_9 != null) {
                                                var1_1 /* !! */ .setTintMode((PorterDuff.Mode)var8_9);
                                            }
                                            var8_9 = var1_1 /* !! */ ;
                                            break block31;
                                        }
                                        var6_7 /* !! */  = this.g;
                                        if (var6_7 /* !! */  == null) break block32;
                                        var4_5 = R$drawable.abc_seekbar_track_material;
                                        var5_6 = 16908301;
                                        var26_29 = 16908303;
                                        var10_11 = 0x1020000;
                                        if (var2_3 != var4_5) break block33;
                                        var27_30 = var13_15 /* !! */ ;
                                        var27_30 = (LayerDrawable)var13_15 /* !! */ ;
                                        var25_27 = var27_30.findDrawableByLayerId(var10_11);
                                        var4_5 = R$attr.colorControlNormal;
                                        var4_5 = Um3.c(var4_5, var1_1 /* !! */ );
                                        var8_9 = qn.b;
                                        qn$a.e(var25_27, var4_5);
                                        var25_27 = var27_30.findDrawableByLayerId(var26_29);
                                        var4_5 = R$attr.colorControlNormal;
                                        var4_5 = Um3.c(var4_5, var1_1 /* !! */ );
                                        qn$a.e(var25_27, var4_5);
                                        var27_30 = var27_30.findDrawableByLayerId(var5_6);
                                        var3_4 = R$attr.colorControlActivated;
                                        var28_33 = Um3.c(var3_4, var1_1 /* !! */ );
                                        qn$a.e(var27_30, var28_33);
                                        break block34;
                                    }
                                    var4_5 = R$drawable.abc_ratingbar_material;
                                    if (var2_3 != var4_5 && var2_3 != (var4_5 = R$drawable.abc_ratingbar_indicator_material) && var2_3 != (var4_5 = R$drawable.abc_ratingbar_small_material)) break block32;
                                    var27_31 /* !! */  = var13_15 /* !! */ ;
                                    var27_31 /* !! */  = (LayerDrawable)var13_15 /* !! */ ;
                                    var25_28 = var27_31 /* !! */ .findDrawableByLayerId(var10_11);
                                    var4_5 = R$attr.colorControlNormal;
                                    var4_5 = Um3.b(var4_5, var1_1 /* !! */ );
                                    var8_9 = qn.b;
                                    qn$a.e(var25_28, var4_5);
                                    var25_28 = var27_31 /* !! */ .findDrawableByLayerId(var26_29);
                                    var4_5 = R$attr.colorControlActivated;
                                    var4_5 = Um3.c(var4_5, var1_1 /* !! */ );
                                    qn$a.e(var25_28, var4_5);
                                    var27_31 /* !! */  = var27_31 /* !! */ .findDrawableByLayerId(var5_6);
                                    var3_4 = R$attr.colorControlActivated;
                                    var28_34 = Um3.c(var3_4, var1_1 /* !! */ );
                                    qn$a.e(var27_31 /* !! */ , var28_34);
                                    break block34;
                                }
                                if (!(var28_35 = this.m(var1_1 /* !! */ , var2_3, var13_15 /* !! */ )) && var3_4 != 0) break block31;
                            }
                            var8_9 = var13_15 /* !! */ ;
                        }
                        var13_15 /* !! */  = var8_9;
                    }
                    if (var13_15 /* !! */  != null) {
                        uu0_0.a(var13_15 /* !! */ );
                    }
                    return var13_15 /* !! */ ;
                }
                var28_36 = false;
                var1_1 /* !! */  = null;
                this.f = false;
                var27_32 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.";
                var1_1 /* !! */  = new IllegalStateException(var27_32);
                throw var1_1 /* !! */ ;
            }
            throw var1_2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ColorStateList i(int var1_1, Context var2_2) {
        synchronized (this) {
            try {
                var3_3 = this.a;
                var4_4 = null;
                if (var3_3 == null) ** GOTO lbl-1000
                var3_3 = var3_3.get(var2_2);
                if ((var3_3 = (ca3)var3_3) != null) {
                    var3_3 = var3_3.f(var1_1);
                    var3_3 = (ColorStateList)var3_3;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = null;
                }
                if (var3_3 != null) return var3_3;
                var3_3 = this.g;
                if (var3_3 != null) {
                    var3_3 = (qn$a)var3_3;
                    var4_4 = var3_3.d(var1_1, var2_2);
                }
                if (var4_4 == null) return var4_4;
                var3_3 = this.a;
                if (var3_3 == null) {
                    var3_3 = new WeakHashMap();
                    this.a = var3_3;
                }
                var3_3 = this.a;
                var3_3 = var3_3.get(var2_2);
                if ((var3_3 = (ca3)var3_3) == null) {
                    var3_3 = new ca3();
                    var5_5 = this.a;
                    var5_5.put(var2_2, var3_3);
                }
                var3_3.b(var1_1, var4_4);
                return var4_4;
            }
            catch (Throwable var6_6) {}
            throw var6_6;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        WeakHashMap weakHashMap = this.d;
                        object = weakHashMap.get(object);
                        object = (pb1_0)object;
                        if (object == null) break block4;
                        ((pb1_0)object).d();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(qn$a qn$a) {
        synchronized (this) {
            this.g = qn$a;
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final boolean m(Context var1_1, int var2_2, Drawable var3_3) {
        block9: {
            block8: {
                block10: {
                    var4_4 = this.g;
                    var5_5 = false;
                    if (var4_4 == null) break block9;
                    var4_4 = (qn$a)var4_4;
                    var6_6 = qn.b;
                    var7_7 = var4_4.a;
                    var8_8 = qn$a.a(var7_7, var2_2);
                    var9_9 = -1;
                    if (var8_8 != 0) {
                        var2_2 = R$attr.colorControlNormal;
lbl11:
                        // 3 sources

                        while (true) {
                            var10_10 = -1;
lbl13:
                            // 2 sources

                            while (true) {
                                var8_8 = 1;
                                break block8;
                                break;
                            }
                            break;
                        }
                    }
                    var7_7 = var4_4.c;
                    var8_8 = qn$a.a(var7_7, var2_2);
                    if (var8_8 == 0) break block10;
                    var2_2 = R$attr.colorControlActivated;
                    ** GOTO lbl11
                }
                var4_4 = var4_4.d;
                var10_10 = (int)qn$a.a((int[])var4_4, var2_2);
                var8_8 = 0x1010031;
                if (var10_10 != 0) {
                    var6_6 = PorterDuff.Mode.MULTIPLY;
lbl27:
                    // 2 sources

                    while (true) {
                        var2_2 = 0x1010031;
                        ** continue;
                        break;
                    }
                }
                var10_10 = R$drawable.abc_list_divider_mtrl_alpha;
                if (var2_2 == var10_10) {
                    var10_10 = Math.round(40.8f);
                    var2_2 = 0x1010030;
                    ** continue;
                }
                ** while (var2_2 == (var10_10 = R$drawable.abc_dialog_material_background))
lbl36:
                // 1 sources

                var2_2 = 0;
                var10_10 = -1;
                var8_8 = 0;
                var7_7 = null;
            }
            if (var8_8 != 0) {
                var3_3 = var3_3.mutate();
                var11_11 = Um3.c(var2_2, var1_1);
                var1_1 = qn.c(var11_11, var6_6);
                var3_3.setColorFilter((ColorFilter)var1_1);
                if (var10_10 != var9_9) {
                    var3_3.setAlpha(var10_10);
                }
                var5_5 = true;
            }
        }
        return var5_5;
    }
}

