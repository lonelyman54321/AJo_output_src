/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.SpannableStringBuilder
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 */
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.io.Serializable;
import java.util.ArrayList;

public final class cR$a {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public cR$a(int n3, int n4) {
        StringBuilder stringBuilder;
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = arrayList2 = new ArrayList();
        this.b = arrayList = new ArrayList();
        this.c = stringBuilder = new StringBuilder();
        this.g = n3;
        arrayList2.clear();
        arrayList.clear();
        stringBuilder.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = n4;
    }

    public final void a(char c2) {
        int n3;
        StringBuilder stringBuilder = this.c;
        int n4 = stringBuilder.length();
        if (n4 < (n3 = 32)) {
            stringBuilder.append(c2);
        }
    }

    public final void b() {
        Serializable serializable = this.c;
        int n3 = ((StringBuilder)serializable).length();
        if (n3 > 0) {
            int n4 = n3 + -1;
            ((StringBuilder)serializable).delete(n4, n3);
            serializable = this.a;
            for (n4 = ((ArrayList)serializable).size() + -1; n4 >= 0; n4 += -1) {
                cR$a$a cR$a$a = (cR$a$a)((ArrayList)serializable).get(n4);
                int n7 = cR$a$a.c;
                if (n7 != n3) break;
                cR$a$a.c = n7 += -1;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final Pe0 c(int var1_1) {
        block10: {
            var2_2 = new SpannableStringBuilder();
            var3_3 = 0;
            var4_4 = 0.0f;
            var6_6 = 0.0f;
            var7_7 = null;
            for (var5_5 = 0; var5_5 < (var9_9 = (var8_8 = this.b).size()); ++var5_5) {
                var8_8 = (CharSequence)var8_8.get(var5_5);
                var2_2.append((CharSequence)var8_8);
                var10_10 = 10;
                var2_2.append((char)var10_10);
            }
            var7_7 = this.d();
            var2_2.append((CharSequence)var7_7);
            var5_5 = var2_2.length();
            if (var5_5 == 0) {
                return null;
            }
            var5_5 = this.e;
            var10_10 = this.f;
            var5_5 += var10_10;
            var10_10 = 32 - var5_5;
            var9_9 = var2_2.length();
            var10_10 -= var9_9;
            var9_9 = var5_5 - var10_10;
            var11_11 = 1;
            var12_12 = -1 << -1;
            var13_13 = -0.0f;
            var14_14 = 2;
            if (var1_1 != var12_12) break block10;
            var1_1 = this.g;
            if (var1_1 != var14_14) ** GOTO lbl-1000
            var1_1 = Math.abs(var9_9);
            var12_12 = 3;
            var13_13 = 4.2E-45f;
            if (var1_1 < var12_12 || var10_10 < 0) {
                var1_1 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = (var1_1 = this.g) == var14_14 && var9_9 > 0 ? 2 : 0;
            }
        }
        if (var1_1 == var11_11) ** GOTO lbl55
        var3_3 = 0x3DCCCCCD;
        var4_4 = 0.1f;
        var9_9 = 1061997773;
        var15_15 = 0.8f;
        var12_12 = 0x42000000;
        var13_13 = 32.0f;
        if (var1_1 != var14_14) lbl-1000:
        // 2 sources

        {
            while (true) {
                var6_6 = (float)var5_5 / var13_13 * var15_15 + var4_4;
                break;
            }
        } else {
            var5_5 = 32 - var10_10;
            ** continue;
lbl55:
            // 1 sources

            var5_5 = 0x3F000000;
            var6_6 = 0.5f;
        }
        var3_3 = this.d;
        var10_10 = 7;
        if (var3_3 > var10_10) {
            var3_3 += -17;
        } else {
            var10_10 = this.g;
            if (var10_10 == var11_11) {
                var10_10 = this.h - var11_11;
                var3_3 -= var10_10;
            }
        }
        var8_8 = new Pe0$a();
        var8_8.a = var2_2;
        var2_2 = Layout.Alignment.ALIGN_NORMAL;
        var8_8.c = var2_2;
        var8_8.e = var16_16 = (float)var3_3;
        var8_8.f = var11_11;
        var8_8.h = var6_6;
        var8_8.i = var1_1;
        return var8_8.a();
    }

    public final SpannableString d() {
        UnderlineSpan underlineSpan;
        int n3;
        Object object;
        int n4;
        cR$a cR$a = this;
        StringBuilder stringBuilder = this.c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)stringBuilder);
        int n7 = spannableStringBuilder.length();
        int n8 = -1;
        int n10 = 0;
        int n14 = -1;
        int n15 = -1;
        int n16 = 0;
        int n17 = -1;
        int n18 = -1;
        int n19 = 0;
        while (n10 < (n4 = ((ArrayList)(object = cR$a.a)).size())) {
            cR$a$a cR$a$a = (cR$a$a)((ArrayList)object).get(n10);
            boolean bl2 = cR$a$a.b;
            int n20 = cR$a$a.a;
            int n21 = 8;
            if (n20 != n21) {
                n19 = 7;
                n21 = n20 == n19 ? 1 : 0;
                if (n20 != n19) {
                    int[] nArray = cr_1.B;
                    n18 = nArray[n20];
                }
                n19 = n21;
            }
            n4 = cR$a$a.c;
            n21 = ((ArrayList)object).size();
            if (++n10 < n21) {
                object = (cR$a$a)((ArrayList)object).get(n10);
                n3 = ((cR$a$a)object).c;
            } else {
                n3 = n7;
            }
            if (n4 == n3) continue;
            if (n14 != n8 && !bl2) {
                underlineSpan = new UnderlineSpan();
                n3 = 33;
                spannableStringBuilder.setSpan((Object)underlineSpan, n14, n4, n3);
                n14 = -1;
            } else if (n14 == n8 && bl2) {
                n14 = n4;
            }
            if (n15 != n8 && n19 == 0) {
                underlineSpan = new StyleSpan(2);
                n3 = 33;
                spannableStringBuilder.setSpan((Object)underlineSpan, n15, n4, n3);
                n15 = -1;
            } else if (n15 == n8 && n19 != 0) {
                n15 = n4;
            }
            if (n18 == n17) continue;
            if (n17 != n8) {
                underlineSpan = new ForegroundColorSpan(n17);
                n3 = 33;
                spannableStringBuilder.setSpan((Object)underlineSpan, n16, n4, n3);
            }
            n17 = n18;
            n16 = n4;
        }
        n3 = 33;
        if (n14 != n8 && n14 != n7) {
            underlineSpan = new UnderlineSpan();
            spannableStringBuilder.setSpan((Object)underlineSpan, n14, n7, n3);
        }
        if (n15 != n8 && n15 != n7) {
            n10 = 2;
            underlineSpan = new StyleSpan(n10);
            spannableStringBuilder.setSpan((Object)underlineSpan, n15, n7, n3);
        }
        if (n16 != n7 && n17 != n8) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n17);
            spannableStringBuilder.setSpan((Object)foregroundColorSpan, n16, n7, n3);
        }
        stringBuilder = new SpannableString((CharSequence)spannableStringBuilder);
        return stringBuilder;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean e() {
        void var2_7;
        int n3;
        boolean bl2;
        Serializable serializable = this.a;
        boolean n32 = ((ArrayList)serializable).isEmpty();
        if (n32 && (bl2 = ((ArrayList)(serializable = this.b)).isEmpty()) && (n3 = ((StringBuilder)(serializable = this.c)).length()) == 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            serializable = null;
        }
        return (boolean)var2_7;
    }
}

