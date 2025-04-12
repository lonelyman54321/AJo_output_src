/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 */
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class Xs3
implements vf3_0 {
    public final Xm2 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public Xs3(List object) {
        Object object2;
        Object object3 = new Xm2();
        this.a = object3;
        Object object4 = object.size();
        int n3 = 1062836634;
        float f5 = 0.85f;
        String string2 = "sans-serif";
        boolean bl2 = false;
        int n4 = 1;
        if (object4 == n4 && ((object4 = ((Object)(object3 = (Object)((byte[])object.get(0)))).length) == (object2 = 48) || (object4 = ((Object)(object3 = (Object)((byte[])object.get(0)))).length) == (object2 = 53))) {
            object = (byte[])object.get(0);
            float f6 = 3.4E-44f;
            this.c = object2 = (Object)object[24];
            object4 = (object[26] & 0xFF) << 24;
            object2 = (object[27] & 0xFF) << 16;
            object4 |= object2;
            object2 = (object[28] & 0xFF) << 8;
            object4 |= object2;
            object2 = object[29] & 0xFF;
            this.d = object4 |= object2;
            object4 = ((Object)object).length;
            object2 = 43;
            object4 -= object2;
            object3 = "Serif";
            Charset charset = StandardCharsets.UTF_8;
            String string3 = new String((byte[])object, (int)object2, (int)object4, charset);
            if ((object4 = (Object)((String)object3).equals(string3)) != 0) {
                string2 = "serif";
            }
            this.e = string2;
            f6 = 3.5E-44f;
            this.g = object4 = (Object)(object[25] * 20);
            int n7 = object[0] & 0x20;
            if (n7 != 0) {
                bl2 = true;
            }
            this.b = bl2;
            if (bl2) {
                n3 = (object[10] & 0xFF) << 8;
                n7 = 11;
                int n8 = object[n7] & 0xFF | n3;
                float f7 = n8;
                f6 = object4;
                f7 /= f6;
                object4 = 0;
                f6 = 0.0f;
                object3 = null;
                n3 = 0x3F733333;
                f5 = 0.95f;
                this.f = f7 = gz3.g(f7, 0.0f, f5);
            } else {
                this.f = f5;
            }
        } else {
            this.c = 0;
            int n10 = -1;
            float f8 = 0.0f / 0.0f;
            this.d = n10;
            this.e = string2;
            this.b = false;
            this.f = f5;
            this.g = n10;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int n3, int n4, int n7, int n8, int n10) {
        if (n3 != n4) {
            n4 = (n3 & 0xFF) << 24;
            n3 = n3 >>> 8 | n4;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n3);
            n3 = n10 | 0x21;
            spannableStringBuilder.setSpan((Object)foregroundColorSpan, n7, n8, n3);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int n3, int n4, int n7, int n8, int n10) {
        if (n3 != n4) {
            UnderlineSpan underlineSpan;
            n4 = n10 | 0x21;
            n10 = n3 & 1;
            int n14 = 1;
            n10 = n10 != 0 ? 1 : 0;
            int n15 = n3 & 2;
            n15 = n15 != 0 ? 1 : 0;
            if (n10 != 0) {
                if (n15 != 0) {
                    int n16 = 3;
                    StyleSpan styleSpan = new StyleSpan(n16);
                    spannableStringBuilder.setSpan((Object)styleSpan, n7, n8, n4);
                } else {
                    StyleSpan styleSpan = new StyleSpan(n14);
                    spannableStringBuilder.setSpan((Object)styleSpan, n7, n8, n4);
                }
            } else if (n15 != 0) {
                int n17 = 2;
                StyleSpan styleSpan = new StyleSpan(n17);
                spannableStringBuilder.setSpan((Object)styleSpan, n7, n8, n4);
            }
            if ((n3 &= 4) == 0) {
                n14 = 0;
            }
            if (n14 != 0) {
                underlineSpan = new UnderlineSpan();
                spannableStringBuilder.setSpan((Object)underlineSpan, n7, n8, n4);
            }
            if (n14 == 0 && n10 == 0 && n15 == 0) {
                underlineSpan = new StyleSpan(0);
                spannableStringBuilder.setSpan((Object)underlineSpan, n7, n8, n4);
            }
        }
    }

    public final /* synthetic */ lf3_0 a(int n3, byte[] byArray, int n4) {
        return uf3_0.a(this, byArray, n4);
    }

    public final void b(byte[] byArray, int n3, int n4, Vf3$b vf3$b, n60_0 n60_02) {
        Object object;
        int n7;
        int n8;
        Object object2;
        int n10;
        Object object3;
        float f5;
        Xs3 xs3 = this;
        int n14 = n3;
        n60_0 n60_03 = n60_02;
        int n15 = n3 + n4;
        Object object4 = this.a;
        ((Xm2)object4).G(n15, byArray);
        ((Xm2)object4).I(n3);
        n14 = ((Xm2)object4).a();
        n15 = 1;
        float f6 = Float.MIN_VALUE;
        int n16 = 2;
        int n17 = 0;
        float f7 = 0.0f;
        CharSequence charSequence = null;
        if (n14 >= n16) {
            n14 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n14 = 0;
            f5 = 0.0f;
            object3 = null;
        }
        ct3.a(n14 != 0);
        n14 = ((Xm2)object4).C();
        if (n14 == 0) {
            object3 = "";
        } else {
            n10 = ((Xm2)object4).b;
            object2 = ((Xm2)object4).E();
            n8 = ((Xm2)object4).b - n10;
            n14 -= n8;
            if (object2 == null) {
                object2 = StandardCharsets.UTF_8;
            }
            object3 = ((Xm2)object4).u(n14, (Charset)object2);
        }
        n10 = (int)(((String)object3).isEmpty() ? 1 : 0);
        if (n10 != 0) {
            ImmutableList immutableList = ImmutableList.of();
            object2 = object3;
            object3 = new We0(immutableList, -9223372036854775807L, -9223372036854775807L);
            n60_03.accept(object3);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object3);
        int n18 = spannableStringBuilder.length();
        int n19 = xs3.c;
        int n20 = 0xFF0000;
        Object object5 = spannableStringBuilder;
        Xs3.e(spannableStringBuilder, n19, 0, 0, n18, n20);
        n18 = spannableStringBuilder.length();
        int n21 = -1;
        n19 = xs3.d;
        Xs3.d(spannableStringBuilder, n19, n21, 0, n18, n20);
        n14 = spannableStringBuilder.length();
        object2 = "sans-serif";
        Object object6 = xs3.e;
        if (object6 != object2) {
            object2 = new TypefaceSpan((String)object6);
            n8 = 16711713;
            spannableStringBuilder.setSpan(object2, 0, n14, n8);
        }
        f5 = xs3.f;
        while ((n7 = ((Xm2)object4).a()) >= (n8 = 8)) {
            int n22;
            n7 = ((Xm2)object4).b;
            n8 = ((Xm2)object4).i();
            int n24 = ((Xm2)object4).i();
            if (n24 == (n22 = 1937013100)) {
                n24 = ((Xm2)object4).a();
                n24 = n24 >= n16 ? 1 : 0;
                ct3.a(n24 != 0);
                n24 = ((Xm2)object4).C();
                for (n22 = 0; n22 < n24; ++n22) {
                    String string2;
                    int n25;
                    int n26 = ((Xm2)object4).a();
                    if (n26 >= (n25 = 12)) {
                        n26 = 1;
                    } else {
                        n26 = 0;
                        string2 = null;
                    }
                    ct3.a(n26 != 0);
                    n26 = ((Xm2)object4).C();
                    n25 = ((Xm2)object4).C();
                    ((Xm2)object4).J(n16);
                    n19 = ((Xm2)object4).w();
                    ((Xm2)object4).J(n15);
                    int n27 = ((Xm2)object4).i();
                    int n28 = spannableStringBuilder.length();
                    object = ").";
                    if (n25 > n28) {
                        object5 = "Truncating styl end (";
                        charSequence = wk0_0.a(n25, (String)object5, ") to cueText.length() (");
                        n25 = spannableStringBuilder.length();
                        ((StringBuilder)charSequence).append(n25);
                        ((StringBuilder)charSequence).append((String)object);
                        charSequence = ((StringBuilder)charSequence).toString();
                        Cx.f((String)charSequence);
                        n25 = n17 = spannableStringBuilder.length();
                    }
                    if (n26 >= n25) {
                        object5 = "Ignoring styl with start (";
                        charSequence = new StringBuilder((String)object5);
                        ((StringBuilder)charSequence).append(n26);
                        string2 = ") >= end (";
                        ((StringBuilder)charSequence).append(string2);
                        ((StringBuilder)charSequence).append(n25);
                        ((StringBuilder)charSequence).append((String)object);
                        object = ((StringBuilder)charSequence).toString();
                        Cx.f((String)object);
                    } else {
                        n15 = xs3.c;
                        n20 = 0;
                        object5 = spannableStringBuilder;
                        n21 = n15;
                        n18 = n25;
                        Xs3.e(spannableStringBuilder, n19, n15, n26, n25, 0);
                        n15 = xs3.d;
                        n19 = n27;
                        n21 = n15;
                        Xs3.d(spannableStringBuilder, n27, n15, n26, n25, 0);
                    }
                    n15 = 1;
                    f6 = Float.MIN_VALUE;
                    n17 = 0;
                    f7 = 0.0f;
                    charSequence = null;
                }
            } else {
                n15 = 1952608120;
                f6 = 7.176025E31f;
                if (n24 == n15 && (n15 = (int)(xs3.b ? 1 : 0)) != 0) {
                    n14 = ((Xm2)object4).a();
                    if (n14 >= n16) {
                        n14 = 1;
                        f5 = Float.MIN_VALUE;
                    } else {
                        n14 = 0;
                        f5 = 0.0f;
                        object3 = null;
                    }
                    ct3.a(n14 != 0);
                    n14 = ((Xm2)object4).C();
                    f5 = n14;
                    f6 = xs3.g;
                    f5 /= f6;
                    n15 = 0;
                    f6 = 0.0f;
                    object = null;
                    n17 = 0x3F733333;
                    f7 = 0.95f;
                    f5 = gz3.g(f5, 0.0f, f7);
                }
            }
            ((Xm2)object4).I(n7 += n8);
            n15 = 1;
            f6 = Float.MIN_VALUE;
            n17 = 0;
            f7 = 0.0f;
            charSequence = null;
        }
        object = new Pe0$a();
        ((Pe0$a)object).a = spannableStringBuilder;
        ((Pe0$a)object).e = f5;
        ((Pe0$a)object).f = 0;
        ((Pe0$a)object).g = 0;
        object3 = ((Pe0$a)object).a();
        object4 = ImmutableList.of(object3);
        object = object6;
        object6 = new We0((List)object4, -9223372036854775807L, -9223372036854775807L);
        n60_03.accept(object6);
    }

    public final int c() {
        return 2;
    }

    public final /* synthetic */ void reset() {
    }
}

