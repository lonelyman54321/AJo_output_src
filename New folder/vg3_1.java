/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.XmlResourceParser
 *  android.graphics.PorterDuff$Mode
 *  android.util.AttributeSet
 *  android.util.Xml
 *  android.view.InflateException
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Renamed from vg3
 */
public final class vg3_1
extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] classArray = new Class[]{Context.class};
        e = classArray;
        f = classArray;
    }

    public vg3_1(Context context) {
        super(context);
        this.c = context;
        Object[] objectArray = new Object[]{context};
        this.a = objectArray;
        this.b = objectArray;
    }

    public static Object a(Object object) {
        boolean bl2 = object instanceof Activity;
        if (bl2) {
            return object;
        }
        bl2 = object instanceof ContextWrapper;
        if (bl2) {
            object = vg3_1.a(((ContextWrapper)object).getBaseContext());
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(XmlResourceParser var1_1, AttributeSet var2_2, Menu var3_3) {
        var4_4 = this;
        var5_5 /* !! */  = var2_2;
        var7_7 = var3_3;
        var6_6 = new vg3$b(this, var3_3);
        var8_8 = var1_1.getEventType();
        while (true) {
            block23: {
                block22: {
                    block20: {
                        block21: {
                            var9_9 = 1;
                            var10_10 = 2;
                            var11_11 = "menu";
                            if (var8_8 != var10_10) break block20;
                            var7_7 = var1_1.getName();
                            var12_13 = var7_7.equals(var11_11);
                            if (!var12_13) break block21;
                            var8_8 = var1_1.next();
                            break block22;
                        }
                        var6_6 = "Expecting menu, got ".concat((String)var7_7);
                        var5_5 /* !! */  = new RuntimeException((String)var6_6);
                        throw var5_5 /* !! */ ;
                    }
                    var8_8 = var1_1.next();
                    if (var8_8 != var9_9) break block23;
                }
                var12_13 = false;
                var13_14 = null;
                var14_15 = false;
                var15_16 = false;
                while (!var14_15) {
                    block24: {
                        block19: {
                            block30: {
                                block25: {
                                    block28: {
                                        block29: {
                                            block27: {
                                                block26: {
                                                    if (var8_8 == var9_9) break block24;
                                                    var16_17 = "item";
                                                    var17_18 /* !! */  = "group";
                                                    if (var8_8 == var10_10) break block25;
                                                    var18_19 = 3;
                                                    if (var8_8 != var18_19) lbl-1000:
                                                    // 9 sources

                                                    {
                                                        while (true) {
                                                            var19_12 = var1_1;
                                                            break block19;
                                                            break;
                                                        }
                                                    }
                                                    var7_7 = var1_1.getName();
                                                    if (!var15_16 || (var18_19 = (int)var7_7.equals(var13_14)) == 0) break block26;
                                                    var19_12 = var1_1;
                                                    var13_14 = null;
                                                    var15_16 = false;
                                                    break block19;
                                                }
                                                var20_20 = var7_7.equals(var17_18 /* !! */ );
                                                if (var20_20 == 0) break block27;
                                                var6_6.b = 0;
                                                var6_6.c = 0;
                                                var6_6.d = 0;
                                                var6_6.e = 0;
                                                var6_6.f = var9_9;
                                                var6_6.g = var9_9;
                                                ** GOTO lbl-1000
                                            }
                                            var21_21 = var7_7.equals(var16_17);
                                            if (var21_21 == 0) break block28;
                                            var8_8 = (int)var6_6.h;
                                            if (var8_8 != 0) ** GOTO lbl-1000
                                            var7_7 = var6_6.z;
                                            if (var7_7 == null || (var8_8 = (int)var7_7.a()) == 0) break block29;
                                            var6_6.h = var9_9;
                                            var8_8 = var6_6.b;
                                            var21_21 = var6_6.i;
                                            var20_20 = var6_6.j;
                                            var22_22 = var6_6.k;
                                            var23_23 = var6_6.a;
                                            var7_7 = var23_23.addSubMenu(var8_8, var21_21, var20_20, (CharSequence)var22_22).getItem();
                                            var6_6.b((MenuItem)var7_7);
                                            ** GOTO lbl-1000
                                        }
                                        var6_6.h = var9_9;
                                        var8_8 = var6_6.b;
                                        var21_21 = var6_6.i;
                                        var20_20 = var6_6.j;
                                        var22_22 = var6_6.k;
                                        var23_23 = var6_6.a;
                                        var7_7 = var23_23.add(var8_8, var21_21, var20_20, (CharSequence)var22_22);
                                        var6_6.b((MenuItem)var7_7);
                                        ** GOTO lbl-1000
                                    }
                                    var8_8 = (int)var7_7.equals(var11_11);
                                    if (var8_8 == 0) ** GOTO lbl-1000
                                    var19_12 = var1_1;
                                    var14_15 = true;
                                    break block19;
                                }
                                if (var15_16) ** GOTO lbl-1000
                                var7_7 = var1_1.getName();
                                var20_20 = var7_7.equals(var17_18 /* !! */ );
                                var22_22 = var6_6.E;
                                if (var20_20 == 0) break block30;
                                var7_7 = var22_22.c;
                                var16_17 = R$styleable.MenuGroup;
                                var7_7 = var7_7.obtainStyledAttributes(var5_5 /* !! */ , (int[])var16_17);
                                var21_21 = R$styleable.MenuGroup_android_id;
                                var6_6.b = var21_21 = var7_7.getResourceId(var21_21, 0);
                                var21_21 = R$styleable.MenuGroup_android_menuCategory;
                                var6_6.c = var21_21 = var7_7.getInt(var21_21, 0);
                                var21_21 = R$styleable.MenuGroup_android_orderInCategory;
                                var6_6.d = var21_21 = var7_7.getInt(var21_21, 0);
                                var21_21 = R$styleable.MenuGroup_android_checkableBehavior;
                                var6_6.e = var21_21 = var7_7.getInt(var21_21, 0);
                                var21_21 = R$styleable.MenuGroup_android_visible;
                                var21_21 = (int)var7_7.getBoolean(var21_21, (boolean)var9_9);
                                var6_6.f = var21_21;
                                var21_21 = R$styleable.MenuGroup_android_enabled;
                                var21_21 = (int)var7_7.getBoolean(var21_21, (boolean)var9_9);
                                var6_6.g = var21_21;
                                var7_7.recycle();
                                ** GOTO lbl-1000
                            }
                            var21_21 = var7_7.equals(var16_17);
                            if (var21_21 != 0) {
                                var7_7 = var22_22.c;
                                var16_17 = R$styleable.MenuItem;
                                var7_7 = Tn3.e((Context)var7_7, var5_5 /* !! */ , (int[])var16_17);
                                var21_21 = R$styleable.MenuItem_android_id;
                                var17_18 /* !! */  = var7_7.b;
                                var6_6.i = var21_21 = var17_18 /* !! */ .getResourceId(var21_21, 0);
                                var21_21 = R$styleable.MenuItem_android_menuCategory;
                                var24_24 = var6_6.c;
                                var21_21 = var17_18 /* !! */ .getInt(var21_21, var24_24);
                                var24_24 = R$styleable.MenuItem_android_orderInCategory;
                                var10_10 = var6_6.d;
                                var10_10 = var17_18 /* !! */ .getInt(var24_24, var10_10);
                                var24_24 = (char)-1;
                                var6_6.j = var10_10 = var10_10 & var24_24 | (var21_21 &= -65536);
                                var10_10 = R$styleable.MenuItem_android_title;
                                var19_12 = var17_18 /* !! */ .getText(var10_10);
                                var6_6.k = var19_12;
                                var10_10 = R$styleable.MenuItem_android_titleCondensed;
                                var19_12 = var17_18 /* !! */ .getText(var10_10);
                                var6_6.l = var19_12;
                                var10_10 = R$styleable.MenuItem_android_icon;
                                var6_6.m = var10_10 = var17_18 /* !! */ .getResourceId(var10_10, 0);
                                var10_10 = R$styleable.MenuItem_android_alphabeticShortcut;
                                var19_12 = var17_18 /* !! */ .getString(var10_10);
                                if (var19_12 == null) {
                                    var10_10 = 0;
                                    var19_12 = null;
                                } else {
                                    var10_10 = var19_12.charAt(0);
                                }
                                var6_6.n = (char)var10_10;
                                var10_10 = R$styleable.MenuItem_alphabeticModifiers;
                                var21_21 = 4096;
                                var6_6.o = var10_10 = var17_18 /* !! */ .getInt(var10_10, var21_21);
                                var10_10 = R$styleable.MenuItem_android_numericShortcut;
                                var19_12 = var17_18 /* !! */ .getString(var10_10);
                                if (var19_12 == null) {
                                    var10_10 = 0;
                                    var19_12 = null;
                                } else {
                                    var10_10 = var19_12.charAt(0);
                                }
                                var6_6.p = (char)var10_10;
                                var10_10 = R$styleable.MenuItem_numericModifiers;
                                var6_6.q = var10_10 = var17_18 /* !! */ .getInt(var10_10, var21_21);
                                var10_10 = R$styleable.MenuItem_android_checkable;
                                var10_10 = (int)var17_18 /* !! */ .hasValue(var10_10);
                                if (var10_10 != 0) {
                                    var10_10 = R$styleable.MenuItem_android_checkable;
                                    var6_6.r = var10_10 = (int)var17_18 /* !! */ .getBoolean(var10_10, false);
                                } else {
                                    var6_6.r = var10_10 = var6_6.e;
                                }
                                var10_10 = R$styleable.MenuItem_android_checked;
                                var10_10 = (int)var17_18 /* !! */ .getBoolean(var10_10, false);
                                var6_6.s = var10_10;
                                var10_10 = R$styleable.MenuItem_android_visible;
                                var21_21 = (int)var6_6.f;
                                var10_10 = (int)var17_18 /* !! */ .getBoolean(var10_10, (boolean)var21_21);
                                var6_6.t = var10_10;
                                var10_10 = R$styleable.MenuItem_android_enabled;
                                var21_21 = var6_6.g;
                                var10_10 = (int)var17_18 /* !! */ .getBoolean(var10_10, (boolean)var21_21);
                                var6_6.u = var10_10;
                                var10_10 = R$styleable.MenuItem_showAsAction;
                                var21_21 = -1;
                                var6_6.v = var10_10 = var17_18 /* !! */ .getInt(var10_10, var21_21);
                                var10_10 = R$styleable.MenuItem_android_onClick;
                                var6_6.y = var19_12 = var17_18 /* !! */ .getString(var10_10);
                                var10_10 = R$styleable.MenuItem_actionLayout;
                                var6_6.w = var10_10 = var17_18 /* !! */ .getResourceId(var10_10, 0);
                                var10_10 = R$styleable.MenuItem_actionViewClass;
                                var6_6.x = var19_12 = var17_18 /* !! */ .getString(var10_10);
                                var10_10 = R$styleable.MenuItem_actionProviderClass;
                                var19_12 = var17_18 /* !! */ .getString(var10_10);
                                if (var19_12 != null && (var24_24 = var6_6.w) == 0 && (var23_23 = var6_6.x) == null) {
                                    var23_23 = vg3_1.f;
                                    var22_22 = var22_22.b;
                                    var6_6.z = var19_12 = (Q2)var6_6.a((String)var19_12, var23_23, var22_22);
                                } else {
                                    var6_6.z = null;
                                }
                                var10_10 = R$styleable.MenuItem_contentDescription;
                                var6_6.A = var19_12 = var17_18 /* !! */ .getText(var10_10);
                                var10_10 = R$styleable.MenuItem_tooltipText;
                                var6_6.B = var19_12 = var17_18 /* !! */ .getText(var10_10);
                                var10_10 = R$styleable.MenuItem_iconTintMode;
                                var10_10 = (int)var17_18 /* !! */ .hasValue(var10_10);
                                if (var10_10 != 0) {
                                    var10_10 = R$styleable.MenuItem_iconTintMode;
                                    var10_10 = var17_18 /* !! */ .getInt(var10_10, var21_21);
                                    var16_17 = var6_6.D;
                                    var19_12 = uu0_0.c(var10_10, (PorterDuff.Mode)var16_17);
                                    var6_6.D = var19_12;
                                } else {
                                    var6_6.D = null;
                                }
                                var10_10 = R$styleable.MenuItem_iconTint;
                                var10_10 = (int)var17_18 /* !! */ .hasValue(var10_10);
                                if (var10_10 != 0) {
                                    var10_10 = R$styleable.MenuItem_iconTint;
                                    var19_12 = var7_7.a(var10_10);
                                    var6_6.C = var19_12;
                                } else {
                                    var6_6.C = null;
                                }
                                var7_7.g();
                                var6_6.h = false;
                                ** continue;
                            }
                            var10_10 = (int)var7_7.equals(var11_11);
                            if (var10_10 != 0) {
                                var6_6.h = var9_9;
                                var8_8 = var6_6.b;
                                var10_10 = var6_6.i;
                                var21_21 = var6_6.j;
                                var17_18 /* !! */  = var6_6.k;
                                var22_22 = var6_6.a;
                                var7_7 = var22_22.addSubMenu(var8_8, var10_10, var21_21, (CharSequence)var17_18 /* !! */ );
                                var19_12 = var7_7.getItem();
                                var6_6.b((MenuItem)var19_12);
                                var19_12 = var1_1;
                                var4_4.b(var1_1, var5_5 /* !! */ , (Menu)var7_7);
                            } else {
                                var19_12 = var1_1;
                                var13_14 = var7_7;
                                var15_16 = true;
                            }
                        }
                        var8_8 = var1_1.next();
                        var10_10 = 2;
                        continue;
                    }
                    var5_5 /* !! */  = new RuntimeException("Unexpected end of document");
                    throw var5_5 /* !! */ ;
                }
                return;
            }
            var19_12 = var1_1;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void inflate(int var1_1, Menu var2_2) {
        block12: {
            var3_3 = "Error inflating menu XML";
            var4_4 = var2_2 instanceof ug3_2;
            if (!var4_4) {
                super.inflate(var1_1, var2_2);
                return;
            }
            var4_4 = false;
            var5_5 = null;
            var6_6 = false;
            try {
                var7_7 = this.c;
                var7_7 = var7_7.getResources();
                var5_5 = var7_7.getLayout(var1_1);
                var8_8 = Xml.asAttributeSet((XmlPullParser)var5_5);
            }
            catch (Throwable var8_9) {
                break block12;
            }
            catch (IOException var8_10) {
                ** GOTO lbl-1000
            }
            catch (XmlPullParserException var8_11) {
                ** GOTO lbl37
            }
            var9_12 = var2_2 instanceof d;
            if (var9_12) {
                var7_7 = var2_2;
                var7_7 = (d)var2_2;
                var10_13 = var7_7.isDispatchingItemsChanged();
                if (var10_13) {
                    var7_7.stopDispatchingItemsChanged();
                    var6_6 = true;
                }
            }
            this.b(var5_5, var8_8, var2_2);
            if (var6_6) {
                var2_2 = (d)var2_2;
                var2_2.startDispatchingItemsChanged();
            }
            var5_5.close();
            return;
lbl-1000:
            // 1 sources

            {
                var7_7 = new InflateException(var3_3, (Throwable)var8_10);
                throw var7_7;
lbl37:
                // 1 sources

                var7_7 = new InflateException(var3_3, (Throwable)var8_11);
                throw var7_7;
            }
        }
        if (var6_6) {
            var2_2 = (d)var2_2;
            var2_2.startDispatchingItemsChanged();
        }
        if (var5_5 != null) {
            var5_5.close();
        }
        throw var8_9;
    }
}

