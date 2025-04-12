/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.text.Layout$Alignment
 *  android.text.Spanned
 *  android.text.SpannedString
 *  android.text.TextUtils
 */
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.common.base.Objects;

public final class Pe0 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    static {
        Pe0$a pe0$a = new Pe0$a();
        pe0$a.a = "";
        pe0$a.a();
        int n3 = 36;
        r = Integer.toString(0, n3);
        s = Integer.toString(17, n3);
        t = Integer.toString(1, n3);
        u = Integer.toString(2, n3);
        v = Integer.toString(3, n3);
        w = Integer.toString(18, n3);
        x = Integer.toString(4, n3);
        y = Integer.toString(5, n3);
        z = Integer.toString(6, n3);
        A = Integer.toString(7, n3);
        B = Integer.toString(8, n3);
        C = Integer.toString(9, n3);
        D = Integer.toString(10, n3);
        E = Integer.toString(11, n3);
        F = Integer.toString(12, n3);
        G = Integer.toString(13, n3);
        H = Integer.toString(14, n3);
        I = Integer.toString(15, n3);
        J = Integer.toString(16, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Pe0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f5, int n3, int n4, float f6, int n7, int n8, float f7, float f8, float f11, boolean bl2, int n10, int n14, float f12) {
        boolean bl3;
        Pe0 pe0 = this;
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            bl3 = bitmap == null;
            ct3.a(bl3);
        }
        bl3 = charSequence2 instanceof Spanned;
        if (bl3) {
            pe0.a = charSequence2 = SpannedString.valueOf((CharSequence)charSequence);
        } else if (charSequence2 != null) {
            pe0.a = charSequence2 = charSequence.toString();
        } else {
            charSequence2 = null;
            pe0.a = null;
        }
        charSequence2 = alignment;
        pe0.b = alignment;
        charSequence2 = alignment2;
        pe0.c = alignment2;
        pe0.d = bitmap2;
        pe0.e = f5;
        pe0.f = n3;
        pe0.g = n4;
        pe0.h = f6;
        pe0.i = n7;
        pe0.j = f8;
        pe0.k = f11;
        pe0.l = bl2;
        pe0.m = n10;
        pe0.n = n8;
        pe0.o = f7;
        pe0.p = n14;
        pe0.q = f12;
    }

    public final Pe0$a a() {
        int n3;
        float f5;
        CharSequence charSequence;
        Pe0$a pe0$a = new Object();
        pe0$a.a = charSequence = this.a;
        charSequence = this.d;
        pe0$a.b = charSequence;
        charSequence = this.b;
        pe0$a.c = charSequence;
        charSequence = this.c;
        pe0$a.d = charSequence;
        pe0$a.e = f5 = this.e;
        pe0$a.f = n3 = this.f;
        pe0$a.g = n3 = this.g;
        pe0$a.h = f5 = this.h;
        pe0$a.i = n3 = this.i;
        pe0$a.j = n3 = this.n;
        pe0$a.k = f5 = this.o;
        pe0$a.l = f5 = this.j;
        pe0$a.m = f5 = this.k;
        n3 = this.l ? 1 : 0;
        pe0$a.n = n3;
        pe0$a.o = n3 = this.m;
        pe0$a.p = n3 = this.p;
        pe0$a.q = f5 = this.q;
        return pe0$a;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    float f5;
                    float f6;
                    float f7;
                    float f8;
                    float f11;
                    float f12;
                    float f14;
                    int n3;
                    Object object2;
                    Object object3;
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || (object3 = Pe0.class) != (object2 = object.getClass())) break block4;
                    object = (Pe0)object;
                    object2 = this.a;
                    object3 = ((Pe0)object).a;
                    int n4 = TextUtils.equals((CharSequence)object2, (CharSequence)object3);
                    if (n4 == 0 || (object2 = this.b) != (object3 = ((Pe0)object).b) || (object2 = this.c) != (object3 = ((Pe0)object).c)) break block5;
                    object2 = ((Pe0)object).d;
                    object3 = this.d;
                    if (!(object3 == null ? object2 == null : object2 != null && (n4 = object3.sameAs((Bitmap)object2)) != 0)) break block5;
                    float f15 = this.e;
                    float f16 = ((Pe0)object).e;
                    n4 = f15 == f16 ? 0 : (f15 > f16 ? 1 : -1);
                    if (n4 == 0 && (n4 = this.f) == (n3 = ((Pe0)object).f) && (n4 = this.g) == (n3 = ((Pe0)object).g) && (n4 = (int)((f14 = (f15 = this.h) - (f16 = ((Pe0)object).h)) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1))) == 0 && (n4 = this.i) == (n3 = ((Pe0)object).i) && (n4 = (int)((f12 = (f15 = this.j) - (f16 = ((Pe0)object).j)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) == 0 && (n4 = (int)((f11 = (f15 = this.k) - (f16 = ((Pe0)object).k)) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) == 0 && (n4 = (int)(this.l ? 1 : 0)) == (n3 = (int)(((Pe0)object).l ? 1 : 0)) && (n4 = this.m) == (n3 = ((Pe0)object).m) && (n4 = this.n) == (n3 = ((Pe0)object).n) && (n4 = (int)((f8 = (f15 = this.o) - (f16 = ((Pe0)object).o)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) == 0 && (n4 = this.p) == (n3 = ((Pe0)object).p) && (f7 = (f6 = (f15 = this.q) - (f5 = ((Pe0)object).q)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == false) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objectArray = this;
        Float f5 = Float.valueOf(this.e);
        Integer n3 = this.f;
        Integer n4 = this.g;
        Float f6 = Float.valueOf(this.h);
        Integer n7 = this.i;
        Float f7 = Float.valueOf(this.j);
        Float f8 = Float.valueOf(this.k);
        Boolean bl2 = this.l;
        Integer n8 = this.m;
        Integer n10 = this.n;
        Float f11 = Float.valueOf(this.o);
        Integer n14 = this.p;
        Float f12 = Float.valueOf(this.q);
        CharSequence charSequence = this.a;
        Layout.Alignment alignment = this.b;
        Float f14 = f12;
        f12 = this.c;
        Integer n15 = n14;
        n14 = this.d;
        objectArray = new Object[]{charSequence, alignment, f12, n14, f5, n3, n4, f6, n7, f7, f8, bl2, n8, n10, f11, n15, f14};
        return Objects.hashCode(objectArray);
    }
}

