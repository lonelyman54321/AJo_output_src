/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.e$a;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public final class e {
    public static final e I;
    public final Integer A;
    public final Integer B;
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;
    public final Integer F;
    public final Bundle G;
    public final ImmutableList H;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final byte[] i;
    public final Integer j;
    public final Uri k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Boolean o;
    public final Boolean p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final CharSequence z;

    static {
        e$a e$a = new Object();
        Object object = ImmutableList.of();
        e$a.G = object;
        I = object = new e(e$a);
        f4.b(0, 1, 2, 3, 4);
        f4.b(5, 6, 8, 9, 10);
        f4.b(11, 12, 13, 14, 15);
        f4.b(16, 17, 18, 19, 20);
        f4.b(21, 22, 23, 24, 25);
        f4.b(26, 27, 28, 29, 30);
        f4.b(31, 32, 33, 34, 1000);
    }

    public e(e$a e$a) {
        Object object;
        Object object2 = e$a.o;
        Integer n3 = e$a.n;
        Integer n4 = e$a.E;
        int n7 = 1;
        int n8 = -1;
        int n10 = 0;
        if (object2 != null) {
            int n14;
            boolean n142 = (Boolean)object2;
            if (!n142) {
                n3 = n8;
            } else if (n3 == null || (n14 = n3.intValue()) == n8) {
                if (n4 != null) {
                    int n15 = n4;
                    switch (n15) {
                        default: {
                            n7 = 0;
                            object = null;
                            break;
                        }
                        case 25: {
                            n7 = 6;
                            break;
                        }
                        case 24: {
                            n7 = 5;
                            break;
                        }
                        case 23: {
                            n7 = 4;
                            break;
                        }
                        case 22: {
                            n7 = 3;
                            break;
                        }
                        case 21: {
                            n7 = 2;
                        }
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: 
                        case 11: 
                        case 12: 
                        case 13: 
                        case 14: 
                        case 15: 
                        case 16: 
                        case 17: 
                        case 18: 
                        case 19: 
                        case 31: 
                        case 32: 
                        case 33: 
                        case 34: 
                        case 35: 
                    }
                    n10 = n7;
                }
                n3 = n10;
            }
        } else if (n3 != null) {
            int n16 = n3;
            if (n16 == n8) {
                n7 = 0;
                object = null;
            }
            object2 = n7 != 0;
            if (n7 != 0 && n4 == null) {
                int n17 = n3;
                switch (n17) {
                    default: {
                        n10 = 20;
                        break;
                    }
                    case 6: {
                        n10 = 25;
                        break;
                    }
                    case 5: {
                        n10 = 24;
                        break;
                    }
                    case 4: {
                        n10 = 23;
                        break;
                    }
                    case 3: {
                        n10 = 22;
                        break;
                    }
                    case 2: {
                        n10 = 21;
                    }
                    case 1: 
                }
                n4 = n10;
            }
        }
        object = e$a.a;
        this.a = object;
        object = e$a.b;
        this.b = object;
        object = e$a.c;
        this.c = object;
        object = e$a.d;
        this.d = object;
        object = e$a.e;
        this.e = object;
        object = e$a.f;
        this.f = object;
        object = e$a.g;
        this.g = object;
        this.h = object = e$a.h;
        object = e$a.i;
        this.i = (byte[])object;
        this.j = object = e$a.j;
        object = e$a.k;
        this.k = object;
        this.l = object = e$a.l;
        this.m = object = e$a.m;
        this.n = n3;
        this.o = object2;
        object2 = e$a.p;
        this.p = object2;
        object2 = e$a.q;
        this.q = object2;
        this.r = object2;
        object2 = e$a.r;
        this.s = object2;
        object2 = e$a.s;
        this.t = object2;
        object2 = e$a.t;
        this.u = object2;
        object2 = e$a.u;
        this.v = object2;
        object2 = e$a.v;
        this.w = object2;
        this.x = object2 = e$a.w;
        this.y = object2 = e$a.x;
        this.z = object2 = e$a.y;
        this.A = object2 = e$a.z;
        this.B = object2 = e$a.A;
        this.C = object2 = e$a.B;
        this.D = object2 = e$a.C;
        this.E = object2 = e$a.D;
        this.F = n4;
        this.H = object2 = e$a.G;
        e$a = e$a.F;
        this.G = e$a;
    }

    public final e$a a() {
        e$a e$a = new Object();
        Object object = this.a;
        e$a.a = object;
        object = this.b;
        e$a.b = object;
        object = this.c;
        e$a.c = object;
        object = this.d;
        e$a.d = object;
        object = this.e;
        e$a.e = object;
        object = this.f;
        e$a.f = object;
        object = this.g;
        e$a.g = object;
        e$a.h = object = this.h;
        object = this.i;
        e$a.i = (byte[])object;
        e$a.j = object = this.j;
        object = this.k;
        e$a.k = object;
        e$a.l = object = this.l;
        e$a.m = object = this.m;
        e$a.n = object = this.n;
        e$a.o = object = this.o;
        e$a.p = object = this.p;
        e$a.q = object = this.r;
        e$a.r = object = this.s;
        e$a.s = object = this.t;
        e$a.t = object = this.u;
        e$a.u = object = this.v;
        e$a.v = object = this.w;
        e$a.w = object = this.x;
        e$a.x = object = this.y;
        e$a.y = object = this.z;
        e$a.z = object = this.A;
        e$a.A = object = this.B;
        e$a.B = object = this.C;
        e$a.C = object = this.D;
        e$a.D = object = this.E;
        e$a.E = object = this.F;
        e$a.G = object = this.H;
        object = this.G;
        e$a.F = object;
        return e$a;
    }

    public final boolean equals(Object object) {
        block8: {
            boolean bl2;
            block10: {
                block9: {
                    int n3;
                    Object object2;
                    Object object3;
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || (object3 = e.class) != (object2 = object.getClass())) break block8;
                    object = (e)object;
                    int n4 = gz3.a;
                    object2 = this.a;
                    object3 = ((e)object).a;
                    n4 = (int)(Objects.equals(object2, object3) ? 1 : 0);
                    if (n4 == 0 || (n4 = (int)(Objects.equals(object2 = this.b, object3 = ((e)object).b) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.c, object3 = ((e)object).c) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.d, object3 = ((e)object).d) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.e, object3 = ((e)object).e) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.f, object3 = ((e)object).f) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.g, object3 = ((e)object).g) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.h, object3 = ((e)object).h) ? 1 : 0)) == 0 || (n4 = (int)(Arrays.equals((byte[])(object2 = (Object)this.i), (byte[])(object3 = (Object)((e)object).i)) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.j, object3 = ((e)object).j) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.k, object3 = ((e)object).k) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.l, object3 = ((e)object).l) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.m, object3 = ((e)object).m) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.n, object3 = ((e)object).n) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.o, object3 = ((e)object).o) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.p, object3 = ((e)object).p) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.r, object3 = ((e)object).r) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.s, object3 = ((e)object).s) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.t, object3 = ((e)object).t) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.u, object3 = ((e)object).u) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.v, object3 = ((e)object).v) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.w, object3 = ((e)object).w) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.x, object3 = ((e)object).x) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.y, object3 = ((e)object).y) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.z, object3 = ((e)object).z) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.A, object3 = ((e)object).A) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.B, object3 = ((e)object).B) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.C, object3 = ((e)object).C) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.D, object3 = ((e)object).D) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.E, object3 = ((e)object).E) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.F, object3 = ((e)object).F) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equals(object2 = this.H, object3 = ((e)object).H) ? 1 : 0)) == 0) break block9;
                    object2 = this.G;
                    if (object2 == null) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    object = ((e)object).G;
                    if (object == null) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (n4 == n3) break block10;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        boolean bl2;
        Object[] objectArray = this;
        int n3 = Arrays.hashCode(this.i);
        Integer n4 = n3;
        Object object = this.G;
        if (object == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        object = bl2;
        Serializable serializable = objectArray.H;
        CharSequence charSequence = objectArray.a;
        CharSequence charSequence2 = objectArray.b;
        CharSequence charSequence3 = objectArray.c;
        CharSequence charSequence4 = objectArray.d;
        CharSequence charSequence5 = objectArray.e;
        CharSequence charSequence6 = objectArray.f;
        CharSequence charSequence7 = objectArray.g;
        Long l2 = objectArray.h;
        Integer n7 = objectArray.j;
        Uri uri = objectArray.k;
        Integer n8 = objectArray.l;
        Integer n10 = objectArray.m;
        ImmutableList immutableList = serializable;
        serializable = objectArray.n;
        Object object2 = object;
        Boolean bl3 = objectArray.o;
        Boolean bl4 = objectArray.p;
        Integer n14 = objectArray.r;
        Integer n15 = objectArray.s;
        Integer n16 = objectArray.t;
        Integer n17 = objectArray.u;
        Integer n18 = objectArray.v;
        Integer n19 = objectArray.w;
        CharSequence charSequence8 = objectArray.x;
        CharSequence charSequence9 = objectArray.y;
        CharSequence charSequence10 = objectArray.z;
        Integer n20 = objectArray.A;
        Integer n21 = objectArray.B;
        CharSequence charSequence11 = objectArray.C;
        CharSequence charSequence12 = objectArray.D;
        CharSequence charSequence13 = objectArray.E;
        object = objectArray.F;
        objectArray = new Object[]{charSequence, charSequence2, charSequence3, charSequence4, charSequence5, charSequence6, charSequence7, l2, null, null, n4, n7, uri, n8, n10, serializable, bl3, bl4, n14, n15, n16, n17, n18, n19, charSequence8, charSequence9, charSequence10, n20, n21, charSequence11, charSequence12, charSequence13, object, object2, immutableList};
        return com.google.common.base.Objects.hashCode(objectArray);
    }
}

