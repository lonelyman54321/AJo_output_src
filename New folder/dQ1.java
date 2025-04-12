/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.a$a;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.b$c;
import androidx.constraintlayout.widget.b$d;
import androidx.constraintlayout.widget.b$e;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class dQ1
implements Comparable {
    public float a = 0.0f;
    public int b = 0;
    public int c;
    public final LinkedHashMap d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;

    public dQ1() {
        float f5;
        LinkedHashMap linkedHashMap;
        this.d = linkedHashMap = new LinkedHashMap();
        this.e = f5 = 1.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = f5;
        this.j = f5;
        this.k = f5 = 0.0f / 0.0f;
        this.l = f5;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = f5;
        this.q = f5;
    }

    public static boolean c(float f5, float f6) {
        boolean bl2;
        boolean bl3 = Float.isNaN(f5);
        boolean bl4 = false;
        if (!bl3 && !(bl3 = Float.isNaN(f6))) {
            f5 = Math.abs(f5 - f6);
            int n3 = 897988541;
            f6 = 1.0E-6f;
            float f7 = f5 - f6;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object > 0) {
                bl4 = true;
            }
            return bl4;
        }
        boolean bl5 = Float.isNaN(f5);
        if (bl5 != (bl2 = Float.isNaN(f6))) {
            bl4 = true;
        }
        return bl4;
    }

    public final void a(HashMap hashMap, int n3) {
        boolean bl2;
        int n4 = 1;
        Iterator iterator = hashMap.keySet().iterator();
        block32: while (bl2 = iterator.hasNext()) {
            float f5;
            Object object = (String)iterator.next();
            jd3_0 jd3_02 = (jd3_0)hashMap.get(object);
            if (jd3_02 == null) continue;
            object.getClass();
            int n7 = 1065353216;
            float f6 = 1.0f;
            boolean bl3 = false;
            float f7 = 0.0f;
            int n8 = -1;
            int n10 = ((String)object).hashCode();
            switch (n10) {
                default: {
                    break;
                }
                case 92909918: {
                    String string2 = "alpha";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 13;
                    break;
                }
                case 37232917: {
                    String string2 = "transitionPathRotate";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 12;
                    break;
                }
                case -4379043: {
                    String string2 = "elevation";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 11;
                    break;
                }
                case -40300674: {
                    String string2 = "rotation";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 10;
                    break;
                }
                case -760884509: {
                    String string2 = "transformPivotY";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 9;
                    break;
                }
                case -760884510: {
                    String string2 = "transformPivotX";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 8;
                    break;
                }
                case -908189617: {
                    String string2 = "scaleY";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 7;
                    break;
                }
                case -908189618: {
                    String string2 = "scaleX";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 6;
                    break;
                }
                case -1001078227: {
                    String string2 = "progress";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 5;
                    break;
                }
                case -1225497655: {
                    String string2 = "translationZ";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 4;
                    break;
                }
                case -1225497656: {
                    String string2 = "translationY";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 3;
                    break;
                }
                case -1225497657: {
                    String string2 = "translationX";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 2;
                    break;
                }
                case -1249320805: {
                    String string2 = "rotationY";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 1;
                    break;
                }
                case -1249320806: {
                    String string2 = "rotationX";
                    n10 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n10 == 0) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    Object object2 = "CUSTOM";
                    n7 = (int)(((String)object).startsWith((String)object2) ? 1 : 0);
                    if (n7 == 0 || !(bl3 = ((AbstractMap)(object2 = this.d)).containsKey(object = ((String)object).split(",")[n4]))) continue block32;
                    object = (a)((LinkedHashMap)object2).get(object);
                    n7 = jd3_02 instanceof JD3$b;
                    if (n7 != 0) {
                        jd3_02 = ((JD3$b)jd3_02).f;
                        jd3_02.append(n3, object);
                        continue block32;
                    }
                    ((a)object).a();
                    jd3_02.toString();
                    continue block32;
                }
                case 13: {
                    f5 = this.e;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f6 = this.e;
                    }
                    jd3_02.b(f6, n3);
                    continue block32;
                }
                case 12: {
                    f5 = this.p;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.p;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 11: {
                    f5 = this.f;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.f;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 10: {
                    f5 = this.g;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.g;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 9: {
                    f5 = this.l;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.l;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 8: {
                    f5 = this.k;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.k;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 7: {
                    f5 = this.j;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f6 = this.j;
                    }
                    jd3_02.b(f6, n3);
                    continue block32;
                }
                case 6: {
                    f5 = this.i;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f6 = this.i;
                    }
                    jd3_02.b(f6, n3);
                    continue block32;
                }
                case 5: {
                    f5 = this.q;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.q;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 4: {
                    f5 = this.o;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.o;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 3: {
                    f5 = this.n;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.n;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 2: {
                    f5 = this.m;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.m;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 1: {
                    f5 = this.a;
                    bl2 = Float.isNaN(f5);
                    if (!bl2) {
                        f7 = this.a;
                    }
                    jd3_02.b(f7, n3);
                    continue block32;
                }
                case 0: 
            }
            f5 = this.h;
            bl2 = Float.isNaN(f5);
            if (!bl2) {
                f7 = this.h;
            }
            jd3_02.b(f7, n3);
        }
    }

    public final void b(View view) {
        float f5;
        float f6;
        int n3;
        this.c = n3 = view.getVisibility();
        n3 = view.getVisibility();
        if (n3 != 0) {
            n3 = 0;
            f6 = 0.0f;
        } else {
            f6 = view.getAlpha();
        }
        this.e = f6;
        this.f = f6 = view.getElevation();
        this.g = f6 = view.getRotation();
        this.h = f6 = view.getRotationX();
        this.a = f6 = view.getRotationY();
        this.i = f6 = view.getScaleX();
        this.j = f6 = view.getScaleY();
        this.k = f6 = view.getPivotX();
        this.l = f6 = view.getPivotY();
        this.m = f6 = view.getTranslationX();
        this.n = f6 = view.getTranslationY();
        this.o = f5 = view.getTranslationZ();
    }

    public final int compareTo(Object object) {
        ((dQ1)object).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect object, b iterator, int n3, int n4) {
        block9: {
            float f5;
            float f6;
            block7: {
                int n7;
                block8: {
                    float f7;
                    int n8;
                    object.width();
                    object.height();
                    object = ((b)((Object)iterator)).j(n4);
                    iterator = object.c;
                    this.b = n4 = ((b$d)((Object)iterator)).c;
                    this.c = n8 = ((b$d)((Object)iterator)).b;
                    if (n8 != 0 && n4 == 0) {
                        n7 = 0;
                        f6 = 0.0f;
                        iterator = null;
                    } else {
                        f6 = ((b$d)((Object)iterator)).d;
                    }
                    this.e = f6;
                    iterator = object.f;
                    n4 = (int)(((b$e)((Object)iterator)).m ? 1 : 0);
                    this.f = f7 = ((b$e)((Object)iterator)).n;
                    this.g = f7 = ((b$e)((Object)iterator)).b;
                    this.h = f7 = ((b$e)((Object)iterator)).c;
                    this.a = f7 = ((b$e)((Object)iterator)).d;
                    this.i = f7 = ((b$e)((Object)iterator)).e;
                    this.j = f7 = ((b$e)((Object)iterator)).f;
                    this.k = f7 = ((b$e)((Object)iterator)).g;
                    this.l = f7 = ((b$e)((Object)iterator)).h;
                    this.m = f7 = ((b$e)((Object)iterator)).j;
                    this.n = f7 = ((b$e)((Object)iterator)).k;
                    this.o = f6 = ((b$e)((Object)iterator)).l;
                    iterator = object.d;
                    String string2 = ((b$c)((Object)iterator)).d;
                    bx0_0.c(string2);
                    this.p = f6 = ((b$c)((Object)iterator)).h;
                    this.q = f6 = object.c.e;
                    iterator = object.g.keySet().iterator();
                    while (true) {
                        n4 = (int)(iterator.hasNext() ? 1 : 0);
                        n8 = 4;
                        if (n4 == 0) break;
                        string2 = (String)iterator.next();
                        a a2 = (a)object.g.get(string2);
                        a$a a$a = a2.c;
                        int n10 = a$a.ordinal();
                        if (n10 == n8 || n10 == (n8 = 5) || n10 == (n8 = 7)) continue;
                        LinkedHashMap linkedHashMap = this.d;
                        ((AbstractMap)linkedHashMap).put(string2, a2);
                    }
                    int n14 = 1;
                    f5 = Float.MIN_VALUE;
                    n7 = 1119092736;
                    f6 = 90.0f;
                    if (n3 == n14) break block7;
                    n14 = 2;
                    f5 = 2.8E-45f;
                    if (n3 == n14) break block8;
                    n14 = 3;
                    f5 = 4.2E-45f;
                    if (n3 == n14) break block7;
                    if (n3 != n8) break block9;
                }
                this.g = f5 = this.g + f6;
                f6 = 180.0f;
                float f8 = f5 - f6;
                n7 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                if (n7 > 0) {
                    n7 = 1135869952;
                    f6 = 360.0f;
                    this.g = f5 -= f6;
                }
                break block9;
            }
            this.g = f5 = this.g - f6;
        }
    }
}

