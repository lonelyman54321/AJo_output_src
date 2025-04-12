/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 */
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Renamed from po1
 */
public final class po1_0
extends Pn1 {
    public int e = -1;
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
    public int r;
    public float s;
    public float t;

    public po1_0() {
        HashMap hashMap;
        float f5;
        this.f = f5 = 0.0f / 0.0f;
        this.g = f5;
        this.h = f5;
        this.i = f5;
        this.j = f5;
        this.k = f5;
        this.l = f5;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.q = f5;
        this.r = 0;
        this.s = f5;
        this.t = 0.0f;
        this.d = hashMap = new HashMap();
    }

    public final void a(HashMap hashMap) {
        throw null;
    }

    public final Pn1 b() {
        float f5;
        int n3;
        po1_0 po1_02 = new po1_0();
        super.c(this);
        po1_02.e = n3 = this.e;
        po1_02.r = n3 = this.r;
        po1_02.s = f5 = this.s;
        po1_02.t = f5 = this.t;
        po1_02.q = f5 = this.q;
        po1_02.f = f5 = this.f;
        po1_02.g = f5 = this.g;
        po1_02.h = f5 = this.h;
        po1_02.k = f5 = this.k;
        po1_02.i = f5 = this.i;
        po1_02.j = f5 = this.j;
        po1_02.l = f5 = this.l;
        po1_02.m = f5 = this.m;
        po1_02.n = f5 = this.n;
        po1_02.o = f5 = this.o;
        po1_02.p = f5 = this.p;
        return po1_02;
    }

    public final void d(HashSet hashSet) {
        Iterator iterator;
        float f5 = this.f;
        int n3 = Float.isNaN(f5);
        if (n3 == 0) {
            iterator = "alpha";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.g)) == 0) {
            iterator = "elevation";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.h)) == 0) {
            iterator = "rotation";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.i)) == 0) {
            iterator = "rotationX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.j)) == 0) {
            iterator = "rotationY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.n)) == 0) {
            iterator = "translationX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.o)) == 0) {
            iterator = "translationY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.p)) == 0) {
            iterator = "translationZ";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.k)) == 0) {
            iterator = "transitionPathRotate";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.l)) == 0) {
            iterator = "scaleX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.m)) == 0) {
            iterator = "scaleY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.q)) == 0) {
            iterator = "progress";
            hashSet.add(iterator);
        }
        if ((n3 = ((HashMap)((Object)(iterator = this.d))).size()) > 0) {
            boolean bl2;
            iterator = this.d.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                String string3 = "CUSTOM,";
                StringBuilder stringBuilder = new StringBuilder(string3);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
                hashSet.add(string2);
            }
        }
    }

    public final void e(Context context, AttributeSet attributeSet) {
        int[] nArray = R$styleable.KeyTimeCycle;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        attributeSet = po1$a.a;
        int n3 = context.getIndexCount();
        nArray = null;
        block21: for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = context.getIndex(i3);
            SparseIntArray sparseIntArray = po1$a.a;
            int n7 = sparseIntArray.get(n4);
            int n8 = 3;
            switch (n7) {
                default: {
                    Integer.toHexString(n4);
                    sparseIntArray.get(n4);
                    continue block21;
                }
                case 21: {
                    float f5;
                    float f6;
                    sparseIntArray = context.peekValue(n4);
                    int n10 = sparseIntArray.type;
                    n7 = 5;
                    if (n10 == n7) {
                        f6 = this.t;
                        this.t = f5 = context.getDimension(n4, f6);
                        continue block21;
                    }
                    f6 = this.t;
                    this.t = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 20: {
                    float f5;
                    float f6 = this.s;
                    this.s = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 19: {
                    float f5;
                    sparseIntArray = context.peekValue(n4);
                    int n10 = sparseIntArray.type;
                    if (n10 == n8) {
                        context.getString(n4);
                        n4 = 7;
                        f5 = 9.8E-45f;
                        this.r = n4;
                        continue block21;
                    }
                    n10 = this.r;
                    this.r = n4 = context.getInt(n4, n10);
                    continue block21;
                }
                case 18: {
                    float f5;
                    float f6 = this.q;
                    this.q = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 17: {
                    float f5;
                    float f6 = this.p;
                    this.p = f5 = context.getDimension(n4, f6);
                    continue block21;
                }
                case 16: {
                    float f5;
                    float f6 = this.o;
                    this.o = f5 = context.getDimension(n4, f6);
                    continue block21;
                }
                case 15: {
                    float f5;
                    float f6 = this.n;
                    this.n = f5 = context.getDimension(n4, f6);
                    continue block21;
                }
                case 14: {
                    float f5;
                    float f6 = this.m;
                    this.m = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 13: {
                    int n10 = this.e;
                    this.e = n4 = context.getInteger(n4, n10);
                    continue block21;
                }
                case 12: {
                    int n10 = this.a;
                    this.a = n4 = context.getInt(n4, n10);
                    continue block21;
                }
                case 10: {
                    String string2;
                    int n10 = MotionLayout.H0;
                    if (n10 != 0) {
                        n10 = this.b;
                        this.b = n10 = context.getResourceId(n4, n10);
                        n7 = -1;
                        if (n10 != n7) continue block21;
                        this.c = string2 = context.getString(n4);
                        continue block21;
                    }
                    sparseIntArray = context.peekValue(n4);
                    n10 = sparseIntArray.type;
                    if (n10 == n8) {
                        this.c = string2 = context.getString(n4);
                        continue block21;
                    }
                    n10 = this.b;
                    this.b = n4 = context.getResourceId(n4, n10);
                    continue block21;
                }
                case 9: {
                    context.getString(n4);
                    continue block21;
                }
                case 8: {
                    float f5;
                    float f6 = this.k;
                    this.k = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 7: {
                    float f5;
                    float f6 = this.l;
                    this.l = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 6: {
                    float f5;
                    float f6 = this.j;
                    this.j = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 5: {
                    float f5;
                    float f6 = this.i;
                    this.i = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 4: {
                    float f5;
                    float f6 = this.h;
                    this.h = f5 = context.getFloat(n4, f6);
                    continue block21;
                }
                case 2: {
                    float f5;
                    float f6 = this.g;
                    this.g = f5 = context.getDimension(n4, f6);
                    continue block21;
                }
                case 1: {
                    float f5;
                    float f6 = this.f;
                    this.f = f5 = context.getFloat(n4, f6);
                }
            }
        }
    }

    public final void f(HashMap hashMap) {
        String string2;
        Object object;
        int n3 = this.e;
        int n4 = -1;
        if (n3 == n4) {
            return;
        }
        float f5 = this.f;
        n3 = (int)(Float.isNaN(f5) ? 1 : 0);
        if (n3 == 0) {
            n3 = this.e;
            object = n3;
            string2 = "alpha";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.g) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "elevation";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.h) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "rotation";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.i) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "rotationX";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.j) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "rotationY";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.n) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "translationX";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.o) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "translationY";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.p) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "translationZ";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.k) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "transitionPathRotate";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.l) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "scaleX";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.l) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "scaleY";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.q) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "progress";
            hashMap.put(string2, object);
        }
        if ((n3 = ((HashMap)(object = this.d)).size()) > 0) {
            object = this.d.keySet().iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                string2 = (String)object.next();
                string2 = kp1_0.c("CUSTOM,", string2);
                int n7 = this.e;
                Integer n8 = n7;
                hashMap.put(string2, n8);
            }
        }
    }

    public final void h(HashMap hashMap) {
        int n3;
        int n4 = 1;
        int n7 = 2;
        int n8 = 7;
        Iterator iterator = hashMap.keySet().iterator();
        block28: while ((n3 = iterator.hasNext()) != 0) {
            int n10;
            float f5;
            int n14;
            float f6;
            float f7;
            float f8;
            Object object;
            Object object2 = (String)iterator.next();
            Object object3 = object = hashMap.get(object2);
            object3 = (sd3_0)object;
            if (object3 == null) continue;
            object = "CUSTOM";
            int n15 = ((String)object2).startsWith((String)object);
            if (n15 != 0) {
                object2 = ((String)object2).substring(n8);
                object = this.d;
                if ((object2 = (a)((HashMap)object).get(object2)) == null) continue;
                object3 = (SD3$b)object3;
                n15 = this.a;
                f8 = this.s;
                int n16 = this.r;
                f7 = this.t;
                ((SD3$b)object3).l.append(n15, object2);
                object2 = ((SD3$b)object3).m;
                float[] fArray = new float[n7];
                fArray[0] = f8;
                fArray[n4] = f7;
                object2.append(n15, (Object)fArray);
                ((An3)object3).b = n3 = Math.max(((An3)object3).b, n16);
                continue;
            }
            n15 = -1;
            int n17 = ((String)object2).hashCode();
            switch (n17) {
                default: {
                    break;
                }
                case 92909918: {
                    String string2 = "alpha";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 11;
                    break;
                }
                case 37232917: {
                    String string2 = "transitionPathRotate";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 10;
                    break;
                }
                case -4379043: {
                    String string2 = "elevation";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 9;
                    break;
                }
                case -40300674: {
                    String string2 = "rotation";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 8;
                    break;
                }
                case -908189617: {
                    String string2 = "scaleY";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 7;
                    break;
                }
                case -908189618: {
                    String string2 = "scaleX";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 6;
                    break;
                }
                case -1001078227: {
                    String string2 = "progress";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 5;
                    break;
                }
                case -1225497655: {
                    String string2 = "translationZ";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 4;
                    break;
                }
                case -1225497656: {
                    String string2 = "translationY";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 3;
                    break;
                }
                case -1225497657: {
                    String string2 = "translationX";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 2;
                    break;
                }
                case -1249320805: {
                    String string2 = "rotationY";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 1;
                    break;
                }
                case -1249320806: {
                    String string2 = "rotationX";
                    n3 = ((String)object2).equals(string2);
                    if (n3 == 0) break;
                    n15 = 0;
                    object = null;
                }
            }
            switch (n15) {
                default: {
                    continue block28;
                }
                case 11: {
                    f6 = this.f;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.f;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 10: {
                    f6 = this.k;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.k;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 9: {
                    f6 = this.g;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.g;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 8: {
                    f6 = this.h;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.h;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 7: {
                    f6 = this.m;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.m;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 6: {
                    f6 = this.l;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.l;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 5: {
                    f6 = this.q;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.q;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 4: {
                    f6 = this.p;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.p;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 3: {
                    f6 = this.o;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.o;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 2: {
                    f6 = this.n;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.n;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 1: {
                    f6 = this.j;
                    n3 = Float.isNaN(f6);
                    if (n3 != 0) continue block28;
                    n14 = this.a;
                    f8 = this.j;
                    f5 = this.s;
                    n10 = this.r;
                    f7 = this.t;
                    ((An3)object3).b(f8, f5, f7, n14, n10);
                    continue block28;
                }
                case 0: 
            }
            f6 = this.i;
            n3 = Float.isNaN(f6);
            if (n3 != 0) continue;
            n14 = this.a;
            f8 = this.i;
            f5 = this.s;
            n10 = this.r;
            f7 = this.t;
            ((An3)object3).b(f8, f5, f7, n14, n10);
        }
    }
}

