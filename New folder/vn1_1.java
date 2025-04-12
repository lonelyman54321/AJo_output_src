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
import androidx.constraintlayout.widget.a$a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Renamed from Vn1
 */
public final class vn1_1
extends Pn1 {
    public int e = 0;
    public int f;
    public String g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;

    public vn1_1() {
        HashMap hashMap;
        float f5;
        int n3;
        this.f = n3 = -1;
        this.g = null;
        this.h = f5 = 0.0f / 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = f5;
        this.l = n3;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.q = f5;
        this.r = f5;
        this.s = f5;
        this.t = f5;
        this.u = f5;
        this.v = f5;
        this.w = f5;
        this.d = hashMap = new HashMap();
    }

    public final void a(HashMap hashMap) {
        throw null;
    }

    public final Pn1 b() {
        float f5;
        String string2;
        int n3;
        vn1_1 vn1_12 = new vn1_1();
        super.c(this);
        vn1_12.e = n3 = this.e;
        vn1_12.f = n3 = this.f;
        vn1_12.g = string2 = this.g;
        vn1_12.h = f5 = this.h;
        vn1_12.i = f5 = this.i;
        vn1_12.j = f5 = this.j;
        vn1_12.k = f5 = this.k;
        vn1_12.l = n3 = this.l;
        vn1_12.m = f5 = this.m;
        vn1_12.n = f5 = this.n;
        vn1_12.o = f5 = this.o;
        vn1_12.p = f5 = this.p;
        vn1_12.q = f5 = this.q;
        vn1_12.r = f5 = this.r;
        vn1_12.s = f5 = this.s;
        vn1_12.t = f5 = this.t;
        vn1_12.u = f5 = this.u;
        vn1_12.v = f5 = this.v;
        vn1_12.w = f5 = this.w;
        return vn1_12;
    }

    public final void d(HashSet hashSet) {
        Iterator iterator;
        float f5 = this.m;
        int n3 = Float.isNaN(f5);
        if (n3 == 0) {
            iterator = "alpha";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.n)) == 0) {
            iterator = "elevation";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.o)) == 0) {
            iterator = "rotation";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.q)) == 0) {
            iterator = "rotationX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.r)) == 0) {
            iterator = "rotationY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.s)) == 0) {
            iterator = "scaleX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.t)) == 0) {
            iterator = "scaleY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.p)) == 0) {
            iterator = "transitionPathRotate";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.u)) == 0) {
            iterator = "translationX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.v)) == 0) {
            iterator = "translationY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.w)) == 0) {
            iterator = "translationZ";
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
        int[] nArray = R$styleable.KeyCycle;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        attributeSet = vn1$a_0.a;
        int n3 = context.getIndexCount();
        nArray = null;
        block23: for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = context.getIndex(i3);
            SparseIntArray sparseIntArray = vn1$a_0.a;
            int n7 = sparseIntArray.get(n4);
            int n8 = 3;
            switch (n7) {
                default: {
                    Integer.toHexString(n4);
                    sparseIntArray.get(n4);
                    continue block23;
                }
                case 21: {
                    float f5 = this.j;
                    float f6 = context.getFloat(n4, f5);
                    int n10 = 1135869952;
                    f5 = 360.0f;
                    this.j = f6 /= f5;
                    continue block23;
                }
                case 20: {
                    float f6;
                    float f5 = this.k;
                    this.k = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 19: {
                    float f6;
                    float f5 = this.w;
                    this.w = f6 = context.getDimension(n4, f5);
                    continue block23;
                }
                case 18: {
                    float f6;
                    float f5 = this.v;
                    this.v = f6 = context.getDimension(n4, f5);
                    continue block23;
                }
                case 17: {
                    float f6;
                    float f5 = this.u;
                    this.u = f6 = context.getDimension(n4, f5);
                    continue block23;
                }
                case 16: {
                    float f6;
                    float f5 = this.t;
                    this.t = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 15: {
                    float f6;
                    float f5 = this.s;
                    this.s = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 14: {
                    float f6;
                    float f5 = this.p;
                    this.p = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 13: {
                    float f6;
                    float f5 = this.r;
                    this.r = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 12: {
                    float f6;
                    float f5 = this.q;
                    this.q = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 11: {
                    float f6;
                    float f5 = this.o;
                    this.o = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 10: {
                    float f6;
                    float f5 = this.n;
                    this.n = f6 = context.getDimension(n4, f5);
                    continue block23;
                }
                case 9: {
                    float f6;
                    float f5 = this.m;
                    this.m = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 8: {
                    int n10 = this.l;
                    this.l = n4 = context.getInt(n4, n10);
                    continue block23;
                }
                case 7: {
                    float f6;
                    float f5;
                    sparseIntArray = context.peekValue(n4);
                    int n10 = sparseIntArray.type;
                    n7 = 5;
                    if (n10 == n7) {
                        f5 = this.i;
                        this.i = f6 = context.getDimension(n4, f5);
                        continue block23;
                    }
                    f5 = this.i;
                    this.i = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 6: {
                    float f6;
                    float f5 = this.h;
                    this.h = f6 = context.getFloat(n4, f5);
                    continue block23;
                }
                case 5: {
                    String string2;
                    float f6;
                    sparseIntArray = context.peekValue(n4);
                    int n10 = sparseIntArray.type;
                    if (n10 == n8) {
                        this.g = string2 = context.getString(n4);
                        n4 = 7;
                        f6 = 9.8E-45f;
                        this.f = n4;
                        continue block23;
                    }
                    n10 = this.f;
                    this.f = n4 = context.getInt(n4, n10);
                    continue block23;
                }
                case 4: {
                    int n10 = this.e;
                    this.e = n4 = context.getInteger(n4, n10);
                    continue block23;
                }
                case 3: {
                    context.getString(n4);
                    continue block23;
                }
                case 2: {
                    int n10 = this.a;
                    this.a = n4 = context.getInt(n4, n10);
                    continue block23;
                }
                case 1: {
                    String string2;
                    int n10 = MotionLayout.H0;
                    if (n10 != 0) {
                        n10 = this.b;
                        this.b = n10 = context.getResourceId(n4, n10);
                        n7 = -1;
                        if (n10 != n7) continue block23;
                        this.c = string2 = context.getString(n4);
                        continue block23;
                    }
                    sparseIntArray = context.peekValue(n4);
                    n10 = sparseIntArray.type;
                    if (n10 == n8) {
                        this.c = string2 = context.getString(n4);
                        continue block23;
                    }
                    n10 = this.b;
                    this.b = n4 = context.getResourceId(n4, n10);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void h(HashMap hashMap) {
        vn1_1 vn1_12 = this;
        HashMap hashMap2 = hashMap;
        int n3 = 7;
        float f5 = 9.8E-45f;
        Iterator iterator = hashMap.keySet().iterator();
        while (true) {
            block38: {
                Object object;
                float f6;
                float f7;
                float f8;
                Object object2;
                int n4;
                Object object3;
                Object object4;
                block41: {
                    block39: {
                        block40: {
                            block37: {
                                ArrayList arrayList;
                                a$a a$a;
                                a$a a$a2;
                                boolean bl2;
                                if (!(bl2 = iterator.hasNext())) {
                                    return;
                                }
                                object4 = (String)iterator.next();
                                boolean bl3 = ((String)object4).startsWith((String)(object3 = "CUSTOM"));
                                if (!bl3) break block37;
                                object3 = ((String)object4).substring(n3);
                                HashMap hashMap3 = vn1_12.d;
                                if ((object3 = (a)hashMap3.get(object3)) == null || (a$a2 = ((a)object3).c) != (a$a = a$a.FLOAT_TYPE) || (object4 = (ud3_1)hashMap2.get(object4)) == null) continue;
                                n4 = vn1_12.a;
                                int n7 = vn1_12.f;
                                object2 = vn1_12.g;
                                int n8 = vn1_12.l;
                                f8 = vn1_12.h;
                                f7 = vn1_12.i;
                                f6 = vn1_12.j;
                                float f11 = ((a)object3).a();
                                ArrayList arrayList2 = arrayList = ((Xn1)object4).f;
                                Object object5 = object;
                                object = new Xn1$b(f8, f7, f6, f11, n4);
                                arrayList2.add(object);
                                n3 = -1;
                                f5 = 0.0f / 0.0f;
                                if (n8 != n3) {
                                    ((Xn1)object4).e = n8;
                                }
                                ((Xn1)object4).c = n7;
                                ((Xn1)object4).c((a)object3);
                                ((Xn1)object4).d = object2;
                                break block38;
                            }
                            n3 = ((String)object4).hashCode();
                            switch (n3) {
                                case 1530034690: {
                                    object = "wavePhase";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 13;
                                    f5 = 1.8E-44f;
                                    break block39;
                                }
                                case 156108012: {
                                    object = "waveOffset";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 12;
                                    f5 = 1.7E-44f;
                                    break block39;
                                }
                                case 92909918: {
                                    object = "alpha";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 11;
                                    f5 = 1.5E-44f;
                                    break block39;
                                }
                                case 37232917: {
                                    object = "transitionPathRotate";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 10;
                                    f5 = 1.4E-44f;
                                    break block39;
                                }
                                case -4379043: {
                                    object = "elevation";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 9;
                                    f5 = 1.3E-44f;
                                    break block39;
                                }
                                case -40300674: {
                                    object = "rotation";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 8;
                                    f5 = 1.1E-44f;
                                    break block39;
                                }
                                case -908189617: {
                                    object = "scaleY";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 7;
                                    f5 = 9.8E-45f;
                                    break block39;
                                }
                                case -908189618: {
                                    object = "scaleX";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 6;
                                    f5 = 8.4E-45f;
                                    break block39;
                                }
                                case -1001078227: {
                                    object = "progress";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 5;
                                    f5 = 7.0E-45f;
                                    break block39;
                                }
                                case -1225497655: {
                                    object = "translationZ";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 4;
                                    f5 = 5.6E-45f;
                                    break block39;
                                }
                                case -1225497656: {
                                    object = "translationY";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 3;
                                    f5 = 4.2E-45f;
                                    break block39;
                                }
                                case -1225497657: {
                                    object = "translationX";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 2;
                                    f5 = 2.8E-45f;
                                    break block39;
                                }
                                case -1249320805: {
                                    object = "rotationY";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 == 0) break;
                                    n3 = 1;
                                    f5 = Float.MIN_VALUE;
                                    break block39;
                                }
                                case -1249320806: {
                                    object = "rotationX";
                                    n3 = (int)(((String)object4).equals(object) ? 1 : 0);
                                    if (n3 != 0) break block40;
                                }
                            }
                            n3 = -1;
                            f5 = 0.0f / 0.0f;
                            break block39;
                        }
                        n3 = 0;
                        f5 = 0.0f;
                        object = null;
                    }
                    switch (n3) {
                        default: {
                            ((String)object4).startsWith((String)object3);
                            n3 = 2143289344;
                            f5 = 0.0f / 0.0f;
                            f6 = 0.0f / 0.0f;
                            break block41;
                        }
                        case 13: {
                            f5 = vn1_12.j;
                            break;
                        }
                        case 12: {
                            f5 = vn1_12.i;
                            break;
                        }
                        case 11: {
                            f5 = vn1_12.m;
                            break;
                        }
                        case 10: {
                            f5 = vn1_12.p;
                            break;
                        }
                        case 9: {
                            f5 = vn1_12.n;
                            break;
                        }
                        case 8: {
                            f5 = vn1_12.o;
                            break;
                        }
                        case 7: {
                            f5 = vn1_12.t;
                            break;
                        }
                        case 6: {
                            f5 = vn1_12.s;
                            break;
                        }
                        case 5: {
                            f5 = vn1_12.k;
                            break;
                        }
                        case 4: {
                            f5 = vn1_12.w;
                            break;
                        }
                        case 3: {
                            f5 = vn1_12.v;
                            break;
                        }
                        case 2: {
                            f5 = vn1_12.u;
                            break;
                        }
                        case 1: {
                            f5 = vn1_12.r;
                            break;
                        }
                        case 0: {
                            f5 = vn1_12.q;
                        }
                    }
                    f6 = f5;
                }
                n3 = (int)(Float.isNaN(f6) ? 1 : 0);
                if (n3 == 0 && (object = (ud3_1)hashMap2.get(object4)) != null) {
                    int n10 = vn1_12.a;
                    int n14 = vn1_12.f;
                    object4 = vn1_12.g;
                    n4 = vn1_12.l;
                    float f12 = vn1_12.h;
                    f8 = vn1_12.i;
                    f7 = vn1_12.j;
                    ArrayList arrayList = ((Xn1)object).f;
                    object3 = object2;
                    object2 = new Xn1$b(f12, f8, f7, f6, n10);
                    arrayList.add(object2);
                    int n15 = -1;
                    if (n4 != n15) {
                        ((Xn1)object).e = n4;
                    }
                    ((Xn1)object).c = n14;
                    ((Xn1)object).d = object4;
                }
            }
            n3 = 7;
            f5 = 9.8E-45f;
        }
    }
}

