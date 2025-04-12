/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.SpannableString
 *  android.text.SpannableStringBuilder
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 */
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

public final class eR$b {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v;
    public static final int w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    public final ArrayList a;
    public final SpannableStringBuilder b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    static {
        Object[] objectArray;
        int n3 = 2;
        v = eR$b.c(n3, n3, n3, 0);
        w = n3 = eR$b.c(0, 0, 0, 0);
        int n4 = eR$b.c(0, 0, 0, 3);
        int n7 = 7;
        int[] nArray = objectArray = new int[n7];
        int[] nArray2 = objectArray;
        nArray[0] = 0;
        nArray2[1] = 0;
        nArray[2] = 0;
        nArray2[3] = 0;
        nArray[4] = 0;
        nArray2[5] = 2;
        nArray2[6] = 0;
        x = objectArray;
        int[] nArray3 = objectArray = new int[n7];
        int[] nArray4 = objectArray;
        nArray3[0] = 0;
        nArray4[1] = 0;
        nArray3[2] = 0;
        nArray4[3] = 0;
        nArray3[4] = 0;
        nArray4[5] = 0;
        nArray4[6] = 2;
        y = objectArray;
        int[] nArray5 = objectArray = new int[n7];
        int[] nArray6 = objectArray;
        nArray5[0] = 3;
        nArray6[1] = 3;
        nArray5[2] = 3;
        nArray6[3] = 3;
        nArray5[4] = 3;
        nArray6[5] = 3;
        nArray6[6] = 1;
        z = objectArray;
        Object[] objectArray2 = objectArray = (Object[])new boolean[n7];
        Object[] objectArray3 = objectArray;
        objectArray2[0] = 0;
        objectArray3[1] = 0;
        objectArray2[2] = 0;
        objectArray3[3] = 1;
        objectArray2[4] = 1;
        objectArray3[5] = 1;
        objectArray3[6] = 0;
        A = (boolean[])objectArray;
        B = new int[]{n3, n4, n3, n3, n4, n3, n3};
        Object[] objectArray4 = objectArray = new int[n7];
        Object[] objectArray5 = objectArray;
        objectArray4[0] = 0;
        objectArray5[1] = 1;
        objectArray4[2] = 2;
        objectArray5[3] = 3;
        objectArray4[4] = 4;
        objectArray5[5] = 3;
        objectArray5[6] = 4;
        C = objectArray;
        Object[] objectArray6 = objectArray = new int[n7];
        Object[] objectArray7 = objectArray;
        objectArray6[0] = 0;
        objectArray7[1] = 0;
        objectArray6[2] = 0;
        objectArray7[3] = 0;
        objectArray6[4] = 0;
        objectArray7[5] = 3;
        objectArray7[6] = 3;
        D = objectArray;
        E = new int[]{n3, n3, n3, n3, n3, n4, n4};
    }

    public eR$b() {
        SpannableStringBuilder spannableStringBuilder;
        this.a = spannableStringBuilder = new ArrayList();
        this.b = spannableStringBuilder = new SpannableStringBuilder();
        this.d();
    }

    /*
     * Unable to fully structure code
     */
    public static int c(int var0, int var1_1, int var2_2, int var3_3) {
        block5: {
            block4: {
                var4_4 = 4;
                ct3.d(var0, var4_4);
                ct3.d(var1_1, var4_4);
                ct3.d(var2_2, var4_4);
                ct3.d(var3_3, var4_4);
                var4_4 = 0;
                var5_5 = 1;
                if (var3_3 == 0 || var3_3 == var5_5) ** GOTO lbl-1000
                var6_6 = 2;
                if (var3_3 != var6_6) {
                    var6_6 = 3;
                    ** if (var3_3 == var6_6) goto lbl-1000
                }
                break block4;
lbl-1000:
                // 2 sources

                {
                    var3_3 = 255;
                    ** GOTO lbl20
                }
lbl-1000:
                // 1 sources

                {
                    var3_3 = 0;
                }
                break block5;
            }
            var3_3 = 127;
        }
        var0 = var0 > var5_5 ? 255 : 0;
        var1_1 = var1_1 > var5_5 ? 255 : 0;
        if (var2_2 > var5_5) {
            var4_4 = 255;
        }
        return Color.argb((int)var3_3, (int)var0, (int)var1_1, (int)var4_4);
    }

    public final void a(char n3) {
        block7: {
            SpannableStringBuilder spannableStringBuilder = this.b;
            int n4 = 10;
            if (n3 == n4) {
                ArrayList arrayList = this.a;
                SpannableString spannableString = this.b();
                arrayList.add(spannableString);
                spannableStringBuilder.clear();
                n3 = this.o;
                int n7 = -1;
                if (n3 != n7) {
                    this.o = 0;
                }
                if ((n3 = (int)this.p) != n7) {
                    this.p = 0;
                }
                if ((n3 = (int)this.q) != n7) {
                    this.q = 0;
                }
                if ((n3 = (int)this.s) != n7) {
                    this.s = 0;
                }
                while (true) {
                    if ((n3 = (int)arrayList.size()) < (n7 = this.j) && (n3 = arrayList.size()) < (n7 = 15)) {
                        this.u = n3 = arrayList.size();
                        break block7;
                    }
                    arrayList.remove(0);
                }
            }
            spannableStringBuilder.append((char)n3);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = this.b;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder((CharSequence)spannableStringBuilder);
        int n3 = spannableStringBuilder2.length();
        if (n3 > 0) {
            int n4;
            StyleSpan styleSpan;
            int n7 = this.o;
            int n8 = 33;
            int n10 = -1;
            if (n7 != n10) {
                styleSpan = new StyleSpan(2);
                n4 = this.o;
                spannableStringBuilder2.setSpan((Object)styleSpan, n4, n3, n8);
            }
            if ((n7 = this.p) != n10) {
                styleSpan = new UnderlineSpan();
                n4 = this.p;
                spannableStringBuilder2.setSpan((Object)styleSpan, n4, n3, n8);
            }
            if ((n7 = this.q) != n10) {
                n4 = this.r;
                styleSpan = new ForegroundColorSpan(n4);
                n4 = this.q;
                spannableStringBuilder2.setSpan((Object)styleSpan, n4, n3, n8);
            }
            if ((n7 = this.s) != n10) {
                n10 = this.t;
                styleSpan = new BackgroundColorSpan(n10);
                n10 = this.s;
                spannableStringBuilder2.setSpan((Object)styleSpan, n10, n3, n8);
            }
        }
        spannableStringBuilder = new SpannableString((CharSequence)spannableStringBuilder2);
        return spannableStringBuilder;
    }

    public final void d() {
        int n3;
        int n4;
        this.a.clear();
        this.b.clear();
        this.o = n4 = -1;
        this.p = n4;
        this.q = n4;
        this.s = n4;
        this.u = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = n4 = w;
        this.r = n3 = v;
        this.t = n4;
    }

    public final void e(boolean n3, boolean bl2) {
        StyleSpan styleSpan;
        int n4 = this.o;
        SpannableStringBuilder spannableStringBuilder = this.b;
        int n7 = 33;
        int n8 = -1;
        if (n4 != n8) {
            if (n3 == 0) {
                styleSpan = new StyleSpan(2);
                n4 = this.o;
                int n10 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan((Object)styleSpan, n4, n10, n7);
                this.o = n8;
            }
        } else if (n3 != 0) {
            this.o = n3 = spannableStringBuilder.length();
        }
        if ((n3 = this.p) != n8) {
            if (!bl2) {
                styleSpan = new UnderlineSpan();
                int n14 = this.p;
                n4 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan((Object)styleSpan, n14, n4, n7);
                this.p = n8;
            }
        } else if (bl2) {
            this.p = n3 = spannableStringBuilder.length();
        }
    }

    public final void f(int n3, int n4) {
        int n7 = this.q;
        SpannableStringBuilder spannableStringBuilder = this.b;
        int n8 = 33;
        int n10 = -1;
        if (n7 != n10 && (n7 = this.r) != n3) {
            int n14 = this.r;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n14);
            n14 = this.q;
            int n15 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan((Object)foregroundColorSpan, n14, n15, n8);
        }
        if (n3 != (n7 = v)) {
            this.q = n7 = spannableStringBuilder.length();
            this.r = n3;
        }
        if ((n3 = this.s) != n10 && (n3 = this.t) != n4) {
            n7 = this.t;
            BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(n7);
            n7 = this.s;
            n10 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan((Object)backgroundColorSpan, n7, n10, n8);
        }
        if (n4 != (n3 = w)) {
            this.s = n3 = spannableStringBuilder.length();
            this.t = n4;
        }
    }
}

