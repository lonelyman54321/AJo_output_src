/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.RectF
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayout$f;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/*
 * Renamed from qo1
 */
public final class qo1_1
extends Pn1 {
    public float e = 0.1f;
    public int f;
    public int g;
    public int h;
    public RectF i;
    public RectF j;
    public HashMap k;
    public String l;
    public int m;
    public String n;
    public String o;
    public int p;
    public int q;
    public View r;
    public boolean s;
    public boolean t;
    public boolean u;
    public float v;
    public float w;
    public boolean x;

    public qo1_1() {
        HashMap hashMap;
        Object object;
        int n3;
        this.f = n3 = -1;
        this.g = n3;
        this.h = n3;
        this.i = object = new RectF();
        this.j = object = new RectF();
        this.k = object;
        this.l = null;
        this.m = n3;
        this.n = null;
        this.o = null;
        this.p = n3;
        this.q = n3;
        this.r = null;
        n3 = 1;
        this.s = n3;
        this.t = n3;
        this.u = n3;
        this.v = 0.0f / 0.0f;
        this.x = false;
        this.d = hashMap = new HashMap();
    }

    public static void j(RectF rectF, View view, boolean bl2) {
        float f5;
        rectF.top = f5 = (float)view.getTop();
        rectF.bottom = f5 = (float)view.getBottom();
        rectF.left = f5 = (float)view.getLeft();
        int n3 = view.getRight();
        rectF.right = f5 = (float)n3;
        if (bl2) {
            view = view.getMatrix();
            view.mapRect(rectF);
        }
    }

    public final void a(HashMap hashMap) {
        throw null;
    }

    public final Pn1 b() {
        float f5;
        int n3;
        qo1_1 qo1_12 = new qo1_1();
        super.c(this);
        Object object = this.l;
        qo1_12.l = object;
        qo1_12.m = n3 = this.m;
        object = this.n;
        qo1_12.n = object;
        object = this.o;
        qo1_12.o = object;
        qo1_12.p = n3 = this.p;
        qo1_12.q = n3 = this.q;
        object = this.r;
        qo1_12.r = object;
        qo1_12.e = f5 = this.e;
        n3 = (int)(this.s ? 1 : 0);
        qo1_12.s = n3;
        n3 = (int)(this.t ? 1 : 0);
        qo1_12.t = n3;
        n3 = (int)(this.u ? 1 : 0);
        qo1_12.u = n3;
        qo1_12.v = f5 = this.v;
        qo1_12.w = f5 = this.w;
        n3 = (int)(this.x ? 1 : 0);
        qo1_12.x = n3;
        object = this.i;
        qo1_12.i = object;
        object = this.j;
        qo1_12.j = object;
        qo1_12.k = object = this.k;
        return qo1_12;
    }

    public final void d(HashSet hashSet) {
    }

    public final void e(Context context, AttributeSet attributeSet) {
        int[] nArray = R$styleable.KeyTrigger;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        attributeSet = qo1$a.a;
        int n3 = context.getIndexCount();
        nArray = null;
        block15: for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = context.getIndex(i3);
            SparseIntArray sparseIntArray = qo1$a.a;
            int n7 = sparseIntArray.get(n4);
            switch (n7) {
                default: {
                    Integer.toHexString(n4);
                    sparseIntArray.get(n4);
                    continue block15;
                }
                case 14: {
                    int n8 = this.g;
                    this.g = n4 = context.getResourceId(n4, n8);
                    continue block15;
                }
                case 13: {
                    int n8 = this.f;
                    this.f = n4 = context.getResourceId(n4, n8);
                    continue block15;
                }
                case 12: {
                    int n8 = this.h;
                    this.h = n4 = context.getResourceId(n4, n8);
                    continue block15;
                }
                case 11: {
                    int n8 = this.m;
                    this.m = n4 = context.getResourceId(n4, n8);
                    continue block15;
                }
                case 10: {
                    int n8 = (int)(this.x ? 1 : 0);
                    n4 = (int)(context.getBoolean(n4, n8 != 0) ? 1 : 0);
                    this.x = n4;
                    continue block15;
                }
                case 9: {
                    int n8 = this.q;
                    this.q = n4 = context.getResourceId(n4, n8);
                    continue block15;
                }
                case 8: {
                    int n8 = this.a;
                    this.a = n4 = context.getInteger(n4, n8);
                    float f5 = (float)n4 + 0.5f;
                    n8 = 1120403456;
                    float f6 = 100.0f;
                    this.v = f5 /= f6;
                    continue block15;
                }
                case 7: {
                    String string2;
                    int n8 = MotionLayout.H0;
                    if (n8 != 0) {
                        n8 = this.b;
                        this.b = n8 = context.getResourceId(n4, n8);
                        n7 = -1;
                        if (n8 != n7) continue block15;
                        this.c = string2 = context.getString(n4);
                        continue block15;
                    }
                    sparseIntArray = context.peekValue(n4);
                    n8 = sparseIntArray.type;
                    n7 = 3;
                    if (n8 == n7) {
                        this.c = string2 = context.getString(n4);
                        continue block15;
                    }
                    n8 = this.b;
                    this.b = n4 = context.getResourceId(n4, n8);
                    continue block15;
                }
                case 6: {
                    int n8 = this.p;
                    this.p = n4 = context.getResourceId(n4, n8);
                    continue block15;
                }
                case 5: {
                    float f5;
                    float f6 = this.e;
                    this.e = f5 = context.getFloat(n4, f6);
                    continue block15;
                }
                case 4: {
                    String string2;
                    this.l = string2 = context.getString(n4);
                    continue block15;
                }
                case 2: {
                    String string2;
                    this.o = string2 = context.getString(n4);
                    continue block15;
                }
                case 1: {
                    String string2;
                    this.n = string2 = context.getString(n4);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h(float var1_1, View var2_2) {
        block32: {
            block38: {
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                block33: {
                                    block30: {
                                        block31: {
                                            var3_3 = this.q;
                                            var4_4 = 1;
                                            var5_5 = -1;
                                            if (var3_3 == var5_5) break block30;
                                            var6_6 /* !! */  = this.r;
                                            if (var6_6 /* !! */  == null) {
                                                var6_6 /* !! */  = (ViewGroup)var2_2.getParent();
                                                var7_7 = this.q;
                                                this.r = var6_6 /* !! */  = var6_6 /* !! */ .findViewById(var7_7);
                                            }
                                            var6_6 /* !! */  = this.i;
                                            var8_8 = this.r;
                                            var9_9 /* !! */  = this.x;
                                            qo1_1.j((RectF)var6_6 /* !! */ , (View)var8_8, (boolean)var9_9 /* !! */ );
                                            var6_6 /* !! */  = this.j;
                                            var7_7 = (int)this.x;
                                            qo1_1.j((RectF)var6_6 /* !! */ , (View)var2_2, (boolean)var7_7);
                                            var6_6 /* !! */  = this.i;
                                            var8_8 = this.j;
                                            var3_3 = (int)var6_6 /* !! */ .intersect((RectF)var8_8);
                                            if (var3_3 == 0) break block31;
                                            var3_3 = (int)this.s;
                                            if (var3_3 != 0) {
                                                this.s = false;
                                                var3_3 = 1;
                                                var10_10 = 1.4E-45f;
                                            } else {
                                                var3_3 = 0;
                                                var10_10 = 0.0f;
                                                var6_6 /* !! */  = null;
                                            }
                                            var7_7 = this.u;
                                            if (var7_7 != 0) {
                                                this.u = false;
                                                var7_7 = 1;
                                                var11_11 = 1.4E-45f;
                                            } else {
                                                var7_7 = 0;
                                                var11_11 = 0.0f;
                                                var8_8 = null;
                                            }
                                            this.t = var4_4;
                                            var9_9 /* !! */  = var7_7;
                                            var12_12 = var11_11;
                                            var7_7 = 0;
                                            var11_11 = 0.0f;
                                            var8_8 = null;
                                            break block32;
                                        }
                                        var3_3 = (int)this.s;
                                        if (var3_3 == 0) {
                                            this.s = var4_4;
                                            var3_3 = 1;
                                            var10_10 = 1.4E-45f;
                                        } else {
                                            var3_3 = 0;
                                            var10_10 = 0.0f;
                                            var6_6 /* !! */  = null;
                                        }
                                        var7_7 = this.t;
                                        if (var7_7 != 0) {
                                            this.t = false;
                                            var7_7 = 1;
                                            var11_11 = 1.4E-45f;
                                        } else {
                                            var7_7 = 0;
                                            var11_11 = 0.0f;
                                            var8_8 = null;
                                        }
                                        this.u = var4_4;
                                        ** GOTO lbl145
                                    }
                                    var3_3 = (int)this.s;
                                    var7_7 = 0;
                                    var11_11 = 0.0f;
                                    var8_8 = null;
                                    if (var3_3 == 0) break block33;
                                    var10_10 = this.v;
                                    var12_12 = var1_1 - var10_10;
                                    var13_13 = (this.w - var10_10) * var12_12;
                                    cfr_temp_0 = var13_13 - 0.0f;
                                    var3_3 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                    if (var3_3 >= 0) break block34;
                                    this.s = false;
                                    var3_3 = 1;
                                    var10_10 = 1.4E-45f;
                                    break block35;
                                }
                                var10_10 = this.v;
                                cfr_temp_1 = (var10_10 = Math.abs(var1_1 - var10_10)) - (var12_12 = this.e);
                                var3_3 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                if (var3_3 > 0) {
                                    this.s = var4_4;
                                }
                            }
                            var3_3 = 0;
                            var10_10 = 0.0f;
                            var6_6 /* !! */  = null;
                        }
                        var9_9 /* !! */  = this.t;
                        if (var9_9 /* !! */  == 0) break block36;
                        var12_12 = this.v;
                        var13_13 = var1_1 - var12_12;
                        var14_14 = (this.w - var12_12) * var13_13;
                        cfr_temp_2 = var14_14 - 0.0f;
                        var9_9 /* !! */  = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                        if (var9_9 /* !! */  >= 0 || (var9_9 /* !! */  = (int)((cfr_temp_3 = var13_13 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1))) >= 0) break block37;
                        this.t = false;
                        var9_9 /* !! */  = 1;
                        var12_12 = 1.4E-45f;
                        break block38;
                    }
                    var12_12 = this.v;
                    cfr_temp_4 = (var12_12 = Math.abs(var1_1 - var12_12)) - (var13_13 = this.e);
                    var9_9 /* !! */  = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                    if (var9_9 /* !! */  > 0) {
                        this.t = var4_4;
                    }
                }
                var9_9 /* !! */  = 0;
                var12_12 = 0.0f;
            }
            var15_15 /* !! */  = this.u;
            if (var15_15 /* !! */  != 0) {
                var13_13 = this.v;
                var14_14 = var1_1 - var13_13;
                var16_16 = (this.w - var13_13) * var14_14;
                cfr_temp_5 = var16_16 - 0.0f;
                var15_15 /* !! */  = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1));
                if (var15_15 /* !! */  < 0 && (var7_7 = (int)((cfr_temp_6 = var14_14 - 0.0f) == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1))) > 0) {
                    this.u = false;
                    var7_7 = 1;
                    var11_11 = 1.4E-45f;
                } else {
                    var7_7 = 0;
                    var11_11 = 0.0f;
                    var8_8 = null;
                }
                var17_17 = var9_9 /* !! */ ;
                var18_18 = var12_12;
                var9_9 /* !! */  = var7_7;
                var12_12 = var11_11;
                var7_7 = var17_17;
                var11_11 = var18_18;
            } else {
                var11_11 = this.v;
                cfr_temp_7 = (var11_11 = Math.abs(var1_1 - var11_11)) - (var13_13 = this.e);
                var7_7 = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1));
                if (var7_7 > 0) {
                    this.u = var4_4;
                }
                var7_7 = var9_9 /* !! */ ;
                var11_11 = var12_12;
lbl145:
                // 2 sources

                var9_9 /* !! */  = 0;
                var12_12 = 0.0f;
            }
        }
        this.w = var1_1;
        if (var7_7 != 0 || var3_3 != 0 || var9_9 /* !! */  != 0) {
            var19_19 /* !! */  = (MotionLayout)var2_2.getParent();
            var20_20 = var19_19 /* !! */ .t;
            var19_19 /* !! */  = var19_19 /* !! */ .L;
            if (var19_19 /* !! */  != null) {
                var19_19 /* !! */  = var19_19 /* !! */ .iterator();
                while ((var15_15 /* !! */  = (int)var19_19 /* !! */ .hasNext()) != 0) {
                    var20_20 = (MotionLayout$f)var19_19 /* !! */ .next();
                    var20_20.getClass();
                }
            }
        }
        if ((var21_21 = this.m) == var5_5) {
            var19_19 /* !! */  = var2_2;
        } else {
            var19_19 /* !! */  = (MotionLayout)var2_2.getParent();
            var15_15 /* !! */  = this.m;
            var19_19 /* !! */  = var19_19 /* !! */ .findViewById(var15_15 /* !! */ );
        }
        if (var7_7 != 0) {
            var8_8 = this.n;
            if (var8_8 != null) {
                this.i(var19_19 /* !! */ , (String)var8_8);
            }
            if ((var7_7 = this.f) != var5_5) {
                var8_8 = (MotionLayout)var2_2.getParent();
                var15_15 /* !! */  = this.f;
                var22_22 = new View[var4_4];
                var22_22[0] = var19_19 /* !! */ ;
                var8_8.v(var15_15 /* !! */ , var22_22);
            }
        }
        if (var9_9 /* !! */  != 0) {
            var8_8 = this.o;
            if (var8_8 != null) {
                this.i(var19_19 /* !! */ , (String)var8_8);
            }
            if ((var7_7 = this.g) != var5_5) {
                var8_8 = (MotionLayout)var2_2.getParent();
                var9_9 /* !! */  = this.g;
                var20_20 = new View[var4_4];
                var20_20[0] = var19_19 /* !! */ ;
                var8_8.v(var9_9 /* !! */ , var20_20);
            }
        }
        if (var3_3 != 0) {
            var6_6 /* !! */  = this.l;
            if (var6_6 /* !! */  != null) {
                this.i(var19_19 /* !! */ , (String)var6_6 /* !! */ );
            }
            if ((var3_3 = this.h) != var5_5) {
                var2_2 = (MotionLayout)var2_2.getParent();
                var3_3 = this.h;
                var23_23 = new View[var4_4];
                var23_23[0] = var19_19 /* !! */ ;
                var2_2.v(var3_3, var23_23);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(View view, String string2) {
        int n3;
        Object object;
        boolean bl2 = false;
        GenericDeclaration genericDeclaration = null;
        int n4 = 1;
        if (string2 == null) {
            return;
        }
        Object object2 = ".";
        int n7 = string2.startsWith((String)object2);
        if (n7 != 0) {
            n7 = string2.length();
            if (n7 == n4) {
                n7 = 1;
            } else {
                n7 = 0;
                object2 = null;
            }
            if (n7 == 0) {
                string2 = string2.substring(n4);
                object = Locale.ROOT;
                string2 = string2.toLowerCase((Locale)object);
            }
        } else {
            genericDeclaration = this.k;
            bl2 = ((HashMap)((Object)genericDeclaration)).containsKey(string2);
            n4 = 0;
            if (bl2) {
                genericDeclaration = (Method)this.k.get(string2);
                if (genericDeclaration == null) {
                    return;
                }
            } else {
                bl2 = false;
                genericDeclaration = null;
            }
            if (genericDeclaration == null) {
                try {
                    genericDeclaration = view.getClass();
                    genericDeclaration = genericDeclaration.getMethod(string2, null);
                    object2 = this.k;
                    ((HashMap)object2).put(string2, genericDeclaration);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    this.k.put(string2, null);
                    view.getClass();
                    oi0_0.d(view);
                    return;
                }
            }
            try {
                ((Method)genericDeclaration).invoke(view, null);
                return;
            }
            catch (Exception exception) {
                view.getClass();
                oi0_0.d(view);
            }
            return;
        }
        object = this.d.keySet().iterator();
        block17: while ((n3 = object.hasNext()) != 0) {
            Class clazz;
            Object object3;
            boolean bl3;
            Object[] objectArray = (String)object.next();
            GenericDeclaration genericDeclaration2 = Locale.ROOT;
            genericDeclaration2 = objectArray.toLowerCase((Locale)((Object)genericDeclaration2));
            if (n7 == 0 && !(bl3 = ((String)((Object)genericDeclaration2)).matches(string2)) || (objectArray = (a)((HashMap)((Object)(genericDeclaration2 = this.d))).get(objectArray)) == null) continue;
            genericDeclaration2 = view.getClass();
            int n8 = objectArray.a;
            String string3 = objectArray.b;
            if (n8 == 0) {
                object3 = "set";
                string3 = kp1_0.c((String)object3, string3);
            }
            object3 = objectArray.c;
            n8 = ((Enum)object3).ordinal();
            switch (n8) {
                default: {
                    continue block17;
                }
                case 6: {
                    object3 = new Class[n4];
                    object3[0] = clazz = Float.TYPE;
                    genericDeclaration2 = ((Class)genericDeclaration2).getMethod(string3, (Class<?>)object3);
                    float f5 = objectArray.e;
                    objectArray = Float.valueOf(f5);
                    object3 = new Object[n4];
                    object3[0] = objectArray;
                    ((Method)genericDeclaration2).invoke(view, (Object[])object3);
                }
                case 5: {
                    try {
                        object3 = new Class[n4];
                        object3[0] = clazz = Boolean.TYPE;
                        genericDeclaration2 = ((Class)genericDeclaration2).getMethod(string3, (Class<?>)object3);
                        n3 = (int)(objectArray.g ? 1 : 0);
                        objectArray = n3 != 0;
                        object3 = new Object[n4];
                        object3[0] = objectArray;
                        ((Method)genericDeclaration2).invoke(view, (Object[])object3);
                    }
                    catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {}
                    continue block17;
                }
                case 4: {
                    object3 = new Class[n4];
                    object3[0] = clazz = CharSequence.class;
                    genericDeclaration2 = ((Class)genericDeclaration2).getMethod(string3, (Class<?>)object3);
                    objectArray = objectArray.f;
                    object3 = new Object[n4];
                    object3[0] = objectArray;
                    ((Method)genericDeclaration2).invoke(view, (Object[])object3);
                    continue block17;
                }
                case 3: {
                    object3 = new Class[n4];
                    object3[0] = clazz = Drawable.class;
                    genericDeclaration2 = ((Class)genericDeclaration2).getMethod(string3, (Class<?>)object3);
                    object3 = new ColorDrawable();
                    n3 = objectArray.h;
                    object3.setColor(n3);
                    objectArray = new Object[n4];
                    objectArray[0] = object3;
                    ((Method)genericDeclaration2).invoke(view, objectArray);
                    continue block17;
                }
                case 2: {
                    object3 = new Class[n4];
                    object3[0] = clazz = Integer.TYPE;
                    genericDeclaration2 = ((Class)genericDeclaration2).getMethod(string3, (Class<?>)object3);
                    n3 = objectArray.h;
                    objectArray = n3;
                    object3 = new Object[n4];
                    object3[0] = objectArray;
                    ((Method)genericDeclaration2).invoke(view, (Object[])object3);
                    continue block17;
                }
                case 1: {
                    object3 = new Class[n4];
                    object3[0] = clazz = Float.TYPE;
                    genericDeclaration2 = ((Class)genericDeclaration2).getMethod(string3, (Class<?>)object3);
                    float f5 = objectArray.e;
                    objectArray = Float.valueOf(f5);
                    object3 = new Object[n4];
                    object3[0] = objectArray;
                    ((Method)genericDeclaration2).invoke(view, (Object[])object3);
                    continue block17;
                }
                case 0: 
                case 7: 
            }
            object3 = new Class[n4];
            object3[0] = clazz = Integer.TYPE;
            genericDeclaration2 = ((Class)genericDeclaration2).getMethod(string3, (Class<?>)object3);
            n3 = objectArray.d;
            objectArray = n3;
            object3 = new Object[n4];
            object3[0] = objectArray;
            ((Method)genericDeclaration2).invoke(view, (Object[])object3);
        }
    }
}

