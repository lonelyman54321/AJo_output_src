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
 * Renamed from Sn1
 */
public final class sn1_0
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
    public float r;
    public float s;

    public sn1_0() {
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
        this.r = f5;
        this.s = f5;
        this.d = hashMap = new HashMap();
    }

    public final void a(HashMap hashMap) {
        int n3;
        int n4 = 7;
        Iterator iterator = hashMap.keySet().iterator();
        block32: while ((n3 = iterator.hasNext()) != 0) {
            float f5;
            Object object = (String)iterator.next();
            Ua3 ua3 = (Ua3)hashMap.get(object);
            if (ua3 == null) continue;
            Object object2 = "CUSTOM";
            int n7 = ((String)object).startsWith((String)object2);
            if (n7 != 0) {
                object = ((String)object).substring(n4);
                object2 = this.d;
                if ((object = (a)((HashMap)object2).get(object)) == null) continue;
                ua3 = (JD3$b)ua3;
                n7 = this.a;
                ua3 = ((JD3$b)ua3).f;
                ua3.append(n7, object);
                continue;
            }
            n7 = -1;
            float f6 = 0.0f / 0.0f;
            int n8 = ((String)object).hashCode();
            switch (n8) {
                default: {
                    break;
                }
                case 92909918: {
                    String string2 = "alpha";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 13;
                    f6 = 1.8E-44f;
                    break;
                }
                case 37232917: {
                    String string2 = "transitionPathRotate";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 12;
                    f6 = 1.7E-44f;
                    break;
                }
                case -4379043: {
                    String string2 = "elevation";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 11;
                    f6 = 1.5E-44f;
                    break;
                }
                case -40300674: {
                    String string2 = "rotation";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 10;
                    f6 = 1.4E-44f;
                    break;
                }
                case -760884509: {
                    String string2 = "transformPivotY";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 9;
                    f6 = 1.3E-44f;
                    break;
                }
                case -760884510: {
                    String string2 = "transformPivotX";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 8;
                    f6 = 1.1E-44f;
                    break;
                }
                case -908189617: {
                    String string2 = "scaleY";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 7;
                    f6 = 9.8E-45f;
                    break;
                }
                case -908189618: {
                    String string2 = "scaleX";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 6;
                    f6 = 8.4E-45f;
                    break;
                }
                case -1001078227: {
                    String string2 = "progress";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 5;
                    f6 = 7.0E-45f;
                    break;
                }
                case -1225497655: {
                    String string2 = "translationZ";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 4;
                    f6 = 5.6E-45f;
                    break;
                }
                case -1225497656: {
                    String string2 = "translationY";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 3;
                    f6 = 4.2E-45f;
                    break;
                }
                case -1225497657: {
                    String string2 = "translationX";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 2;
                    f6 = 2.8E-45f;
                    break;
                }
                case -1249320805: {
                    String string2 = "rotationY";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 1;
                    f6 = Float.MIN_VALUE;
                    break;
                }
                case -1249320806: {
                    String string2 = "rotationX";
                    n3 = ((String)object).equals(string2);
                    if (n3 == 0) break;
                    n7 = 0;
                    f6 = 0.0f;
                    object2 = null;
                }
            }
            switch (n7) {
                default: {
                    continue block32;
                }
                case 13: {
                    f5 = this.f;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.f;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 12: {
                    f5 = this.m;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.m;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 11: {
                    f5 = this.g;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.g;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 10: {
                    f5 = this.h;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.h;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 9: {
                    f5 = this.j;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.l;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 8: {
                    f5 = this.i;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.k;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 7: {
                    f5 = this.o;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.o;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 6: {
                    f5 = this.n;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.n;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 5: {
                    f5 = this.s;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.s;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 4: {
                    f5 = this.r;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.r;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 3: {
                    f5 = this.q;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.q;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 2: {
                    f5 = this.p;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.p;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 1: {
                    f5 = this.j;
                    n3 = Float.isNaN(f5);
                    if (n3 != 0) continue block32;
                    n3 = this.a;
                    f6 = this.j;
                    ua3.b(f6, n3);
                    continue block32;
                }
                case 0: 
            }
            f5 = this.i;
            n3 = Float.isNaN(f5);
            if (n3 != 0) continue;
            n3 = this.a;
            f6 = this.i;
            ua3.b(f6, n3);
        }
    }

    public final Pn1 b() {
        float f5;
        int n3;
        sn1_0 sn1_02 = new sn1_0();
        super.c(this);
        sn1_02.e = n3 = this.e;
        sn1_02.f = f5 = this.f;
        sn1_02.g = f5 = this.g;
        sn1_02.h = f5 = this.h;
        sn1_02.i = f5 = this.i;
        sn1_02.j = f5 = this.j;
        sn1_02.k = f5 = this.k;
        sn1_02.l = f5 = this.l;
        sn1_02.m = f5 = this.m;
        sn1_02.n = f5 = this.n;
        sn1_02.o = f5 = this.o;
        sn1_02.p = f5 = this.p;
        sn1_02.q = f5 = this.q;
        sn1_02.r = f5 = this.r;
        sn1_02.s = f5 = this.s;
        return sn1_02;
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
        if ((n3 = Float.isNaN(f5 = this.k)) == 0) {
            iterator = "transformPivotX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.l)) == 0) {
            iterator = "transformPivotY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.p)) == 0) {
            iterator = "translationX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.q)) == 0) {
            iterator = "translationY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.r)) == 0) {
            iterator = "translationZ";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.m)) == 0) {
            iterator = "transitionPathRotate";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.n)) == 0) {
            iterator = "scaleX";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.o)) == 0) {
            iterator = "scaleY";
            hashSet.add(iterator);
        }
        if ((n3 = Float.isNaN(f5 = this.s)) == 0) {
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
        int[] nArray = R$styleable.KeyAttribute;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        attributeSet = Sn1$a.a;
        int n3 = context.getIndexCount();
        nArray = null;
        block20: for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = context.getIndex(i3);
            SparseIntArray sparseIntArray = Sn1$a.a;
            int n7 = sparseIntArray.get(n4);
            switch (n7) {
                default: {
                    Integer.toHexString(n4);
                    sparseIntArray.get(n4);
                    continue block20;
                }
                case 20: {
                    float f5;
                    float f6 = this.l;
                    this.l = f5 = context.getDimension(n4, f6);
                    continue block20;
                }
                case 19: {
                    float f5;
                    float f6 = this.k;
                    this.k = f5 = context.getDimension(n4, f6);
                    continue block20;
                }
                case 18: {
                    float f5;
                    float f6 = this.s;
                    this.s = f5 = context.getFloat(n4, f6);
                    continue block20;
                }
                case 17: {
                    float f5;
                    float f6 = this.r;
                    this.r = f5 = context.getDimension(n4, f6);
                    continue block20;
                }
                case 16: {
                    float f5;
                    float f6 = this.q;
                    this.q = f5 = context.getDimension(n4, f6);
                    continue block20;
                }
                case 15: {
                    float f5;
                    float f6 = this.p;
                    this.p = f5 = context.getDimension(n4, f6);
                    continue block20;
                }
                case 14: {
                    float f5;
                    float f6 = this.o;
                    this.o = f5 = context.getFloat(n4, f6);
                    continue block20;
                }
                case 13: {
                    int n8 = this.e;
                    this.e = n4 = context.getInteger(n4, n8);
                    continue block20;
                }
                case 12: {
                    int n8 = this.a;
                    this.a = n4 = context.getInt(n4, n8);
                    continue block20;
                }
                case 10: {
                    String string2;
                    int n8 = MotionLayout.H0;
                    if (n8 != 0) {
                        n8 = this.b;
                        this.b = n8 = context.getResourceId(n4, n8);
                        n7 = -1;
                        if (n8 != n7) continue block20;
                        this.c = string2 = context.getString(n4);
                        continue block20;
                    }
                    sparseIntArray = context.peekValue(n4);
                    n8 = sparseIntArray.type;
                    n7 = 3;
                    if (n8 == n7) {
                        this.c = string2 = context.getString(n4);
                        continue block20;
                    }
                    n8 = this.b;
                    this.b = n4 = context.getResourceId(n4, n8);
                    continue block20;
                }
                case 9: {
                    context.getString(n4);
                    continue block20;
                }
                case 8: {
                    float f5;
                    float f6 = this.m;
                    this.m = f5 = context.getFloat(n4, f6);
                    continue block20;
                }
                case 7: {
                    float f5;
                    float f6 = this.n;
                    this.n = f5 = context.getFloat(n4, f6);
                    continue block20;
                }
                case 6: {
                    float f5;
                    float f6 = this.j;
                    this.j = f5 = context.getFloat(n4, f6);
                    continue block20;
                }
                case 5: {
                    float f5;
                    float f6 = this.i;
                    this.i = f5 = context.getFloat(n4, f6);
                    continue block20;
                }
                case 4: {
                    float f5;
                    float f6 = this.h;
                    this.h = f5 = context.getFloat(n4, f6);
                    continue block20;
                }
                case 2: {
                    float f5;
                    float f6 = this.g;
                    this.g = f5 = context.getDimension(n4, f6);
                    continue block20;
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
        if ((n3 = (int)(Float.isNaN(f5 = this.k) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "transformPivotX";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.l) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "transformPivotY";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.p) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "translationX";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.q) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "translationY";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.r) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "translationZ";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.m) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "transitionPathRotate";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.n) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "scaleX";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.o) ? 1 : 0)) == 0) {
            n3 = this.e;
            object = n3;
            string2 = "scaleY";
            hashMap.put(string2, object);
        }
        if ((n3 = (int)(Float.isNaN(f5 = this.s) ? 1 : 0)) == 0) {
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

    public final void h(Object object, String string2) {
        boolean bl2;
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 1941332754: {
                String string3 = "visibility";
                bl2 = string2.equals(string3);
                if (!bl2) break;
                n3 = 16;
                break;
            }
            case 579057826: {
                String string4 = "curveFit";
                bl2 = string2.equals(string4);
                if (!bl2) break;
                n3 = 15;
                break;
            }
            case 92909918: {
                String string5 = "alpha";
                bl2 = string2.equals(string5);
                if (!bl2) break;
                n3 = 14;
                break;
            }
            case 37232917: {
                String string6 = "transitionPathRotate";
                bl2 = string2.equals(string6);
                if (!bl2) break;
                n3 = 13;
                break;
            }
            case -4379043: {
                String string7 = "elevation";
                bl2 = string2.equals(string7);
                if (!bl2) break;
                n3 = 12;
                break;
            }
            case -40300674: {
                String string8 = "rotation";
                bl2 = string2.equals(string8);
                if (!bl2) break;
                n3 = 11;
                break;
            }
            case -760884509: {
                String string9 = "transformPivotY";
                bl2 = string2.equals(string9);
                if (!bl2) break;
                n3 = 10;
                break;
            }
            case -760884510: {
                String string10 = "transformPivotX";
                bl2 = string2.equals(string10);
                if (!bl2) break;
                n3 = 9;
                break;
            }
            case -908189617: {
                String string11 = "scaleY";
                bl2 = string2.equals(string11);
                if (!bl2) break;
                n3 = 8;
                break;
            }
            case -908189618: {
                String string12 = "scaleX";
                bl2 = string2.equals(string12);
                if (!bl2) break;
                n3 = 7;
                break;
            }
            case -1225497655: {
                String string13 = "translationZ";
                bl2 = string2.equals(string13);
                if (!bl2) break;
                n3 = 6;
                break;
            }
            case -1225497656: {
                String string14 = "translationY";
                bl2 = string2.equals(string14);
                if (!bl2) break;
                n3 = 5;
                break;
            }
            case -1225497657: {
                String string15 = "translationX";
                bl2 = string2.equals(string15);
                if (!bl2) break;
                n3 = 4;
                break;
            }
            case -1249320805: {
                String string16 = "rotationY";
                bl2 = string2.equals(string16);
                if (!bl2) break;
                n3 = 3;
                break;
            }
            case -1249320806: {
                String string17 = "rotationX";
                bl2 = string2.equals(string17);
                if (!bl2) break;
                n3 = 2;
                break;
            }
            case -1812823328: {
                String string18 = "transitionEasing";
                bl2 = string2.equals(string18);
                if (!bl2) break;
                n3 = 1;
                break;
            }
            case -1913008125: {
                String string19 = "motionProgress";
                bl2 = string2.equals(string19);
                if (!bl2) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                break;
            }
            case 16: {
                bl2 = object instanceof Boolean;
                if (bl2) break;
                object = object.toString();
                Boolean.parseBoolean((String)object);
                break;
            }
            case 15: {
                int n7;
                object = (Number)object;
                bl2 = object instanceof Integer;
                if (bl2) {
                    object = (Integer)object;
                    n7 = (Integer)object;
                } else {
                    object = object.toString();
                    n7 = Integer.parseInt((String)object);
                }
                this.e = n7;
                break;
            }
            case 14: {
                float f5;
                object = (Number)object;
                this.f = f5 = Pn1.g((Number)object);
                break;
            }
            case 13: {
                float f6;
                object = (Number)object;
                this.m = f6 = Pn1.g((Number)object);
                break;
            }
            case 12: {
                float f7;
                object = (Number)object;
                this.g = f7 = Pn1.g((Number)object);
                break;
            }
            case 11: {
                float f8;
                object = (Number)object;
                this.h = f8 = Pn1.g((Number)object);
                break;
            }
            case 10: {
                float f11;
                object = (Number)object;
                this.l = f11 = Pn1.g((Number)object);
                break;
            }
            case 9: {
                float f12;
                object = (Number)object;
                this.k = f12 = Pn1.g((Number)object);
                break;
            }
            case 8: {
                float f14;
                object = (Number)object;
                this.o = f14 = Pn1.g((Number)object);
                break;
            }
            case 7: {
                float f15;
                object = (Number)object;
                this.n = f15 = Pn1.g((Number)object);
                break;
            }
            case 6: {
                float f16;
                object = (Number)object;
                this.r = f16 = Pn1.g((Number)object);
                break;
            }
            case 5: {
                float f17;
                object = (Number)object;
                this.q = f17 = Pn1.g((Number)object);
                break;
            }
            case 4: {
                float f18;
                object = (Number)object;
                this.p = f18 = Pn1.g((Number)object);
                break;
            }
            case 3: {
                float f19;
                object = (Number)object;
                this.j = f19 = Pn1.g((Number)object);
                break;
            }
            case 2: {
                float f20;
                object = (Number)object;
                this.i = f20 = Pn1.g((Number)object);
                break;
            }
            case 1: {
                object.toString();
                break;
            }
            case 0: {
                float f22;
                object = (Number)object;
                this.s = f22 = Pn1.g((Number)object);
            }
        }
    }
}

