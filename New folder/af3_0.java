/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Html
 *  android.text.Spanned
 *  android.text.TextUtils
 */
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from Af3
 */
public final class af3_0
implements vf3_0 {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a;
    public final ArrayList b;
    public final Xm2 c;

    public af3_0() {
        Object object = new StringBuilder();
        this.a = object;
        this.b = object;
        this.c = object = new Xm2();
    }

    /*
     * Unable to fully structure code
     */
    public static Pe0 d(Spanned var0, String var1_1) {
        block35: {
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                block29: {
                                    var2_2 = var1_1;
                                    var3_3 = new Pe0$a();
                                    var3_3.a = var0;
                                    if (var1_1 == null) {
                                        return var3_3.a();
                                    }
                                    var4_4 = var1_1.hashCode();
                                    var5_5 = 2;
                                    var6_6 = 1;
                                    var7_7 = "{\\an1}";
                                    var8_8 = "{\\an2}";
                                    var9_9 = "{\\an3}";
                                    var10_10 = "{\\an4}";
                                    var11_11 = "{\\an5}";
                                    var12_12 = "{\\an6}";
                                    var13_13 = "{\\an7}";
                                    var14_14 = "{\\an8}";
                                    var15_15 = "{\\an9}";
                                    var16_16 = 3;
                                    switch (var4_4) {
                                        default: {
                                            break;
                                        }
                                        case -685620462: {
                                            var4_4 = (int)var1_1.equals(var15_15);
                                            if (var4_4 == 0) break;
                                            var4_4 = 5;
                                            var17_17 = 7.0E-45f;
                                            break block29;
                                        }
                                        case -685620493: {
                                            var4_4 = (int)var1_1.equals(var14_14);
                                            if (var4_4 == 0) break;
                                            var4_4 = 8;
                                            var17_17 = 1.1E-44f;
                                            break block29;
                                        }
                                        case -685620524: {
                                            var4_4 = (int)var1_1.equals(var13_13);
                                            if (var4_4 == 0) break;
                                            var4_4 = 2;
                                            var17_17 = 2.8E-45f;
                                            break block29;
                                        }
                                        case -685620555: {
                                            var4_4 = (int)var1_1.equals(var12_12);
                                            if (var4_4 == 0) break;
                                            var4_4 = 4;
                                            var17_17 = 5.6E-45f;
                                            break block29;
                                        }
                                        case -685620586: {
                                            var4_4 = (int)var1_1.equals(var11_11);
                                            if (var4_4 == 0) break;
                                            var4_4 = 7;
                                            var17_17 = 9.8E-45f;
                                            break block29;
                                        }
                                        case -685620617: {
                                            var4_4 = (int)var1_1.equals(var10_10);
                                            if (var4_4 == 0) break;
                                            var4_4 = 1;
                                            var17_17 = 1.4E-45f;
                                            break block29;
                                        }
                                        case -685620648: {
                                            var4_4 = (int)var1_1.equals(var9_9);
                                            if (var4_4 == 0) break;
                                            var4_4 = 3;
                                            var17_17 = 4.2E-45f;
                                            break block29;
                                        }
                                        case -685620679: {
                                            var4_4 = (int)var1_1.equals(var8_8);
                                            if (var4_4 == 0) break;
                                            var4_4 = 6;
                                            var17_17 = 8.4E-45f;
                                            break block29;
                                        }
                                        case -685620710: {
                                            var4_4 = (int)var1_1.equals(var7_7);
                                            if (var4_4 == 0) break;
                                            var4_4 = 0;
                                            var17_17 = 0.0f;
                                            break block29;
                                        }
                                    }
                                    var4_4 = -1;
                                    var17_17 = 0.0f / 0.0f;
                                }
                                var3_3.i = var4_4 != 0 && var4_4 != var6_6 && var4_4 != var5_5 ? (var4_4 != var16_16 && var4_4 != (var16_16 = 4) && var4_4 != (var16_16 = 5) ? var6_6 : var5_5) : 0;
                                var4_4 = var1_1.hashCode();
                                switch (var4_4) {
                                    default: {
                                        break;
                                    }
                                    case -685620462: {
                                        var18_18 = var2_2.equals(var15_15);
                                        if (var18_18 == 0) break;
                                        var19_19 = 5;
                                        break block30;
                                    }
                                    case -685620493: {
                                        var18_18 = var2_2.equals(var14_14);
                                        if (var18_18 == 0) break;
                                        var19_19 = 4;
                                        break block30;
                                    }
                                    case -685620524: {
                                        var18_18 = var2_2.equals(var13_13);
                                        if (var18_18 == 0) break;
                                        var19_19 = 3;
                                        break block30;
                                    }
                                    case -685620555: {
                                        var18_18 = var2_2.equals(var12_12);
                                        if (var18_18 == 0) break;
                                        var19_19 = 8;
                                        break block30;
                                    }
                                    case -685620586: {
                                        var18_18 = var2_2.equals(var11_11);
                                        if (var18_18 == 0) break;
                                        var19_19 = 7;
                                        break block30;
                                    }
                                    case -685620617: {
                                        var18_18 = var2_2.equals(var10_10);
                                        if (var18_18 == 0) break;
                                        var19_19 = 6;
                                        break block30;
                                    }
                                    case -685620648: {
                                        var18_18 = var2_2.equals(var9_9);
                                        if (var18_18 == 0) break;
                                        var19_19 = 2;
                                        break block30;
                                    }
                                    case -685620679: {
                                        var18_18 = var2_2.equals(var8_8);
                                        if (var18_18 == 0) break;
                                        var19_19 = 1;
                                        break block30;
                                    }
                                    case -685620710: {
                                        var18_18 = var2_2.equals(var7_7);
                                        if (var18_18 == 0) break;
                                        var19_19 = 0;
                                        var15_15 = null;
                                        break block30;
                                    }
                                }
                                var19_19 = -1;
                            }
                            if (var19_19 == 0 || var19_19 == var6_6 || var19_19 == var5_5) break block31;
                            var18_18 = 3;
                            var20_20 = 4.2E-45f;
                            if (var19_19 == var18_18) ** GOTO lbl-1000
                            var18_18 = 4;
                            var20_20 = 5.6E-45f;
                            if (var19_19 == var18_18) ** GOTO lbl-1000
                            var18_18 = 5;
                            var20_20 = 7.0E-45f;
                            if (var19_19 != var18_18) {
                                var3_3.g = var6_6;
                            } else lbl-1000:
                            // 3 sources

                            {
                                var3_3.g = 0;
                            }
                            break block32;
                        }
                        var3_3.g = var5_5;
                    }
                    var18_18 = var3_3.i;
                    var4_4 = 1034147594;
                    var17_17 = 0.08f;
                    var19_19 = 1064011039;
                    if (var18_18 == 0) break block33;
                    if (var18_18 == var6_6) ** GOTO lbl161
                    if (var18_18 == var5_5) {
                        var18_18 = 1064011039;
                        var20_20 = 0.92f;
                    } else {
                        var2_2 = new IllegalArgumentException();
                        throw var2_2;
lbl161:
                        // 1 sources

                        var18_18 = 0x3F000000;
                        var20_20 = 0.5f;
                    }
                    break block34;
                }
                var18_18 = 1034147594;
                var20_20 = 0.08f;
            }
            var3_3.h = var20_20;
            var18_18 = var3_3.g;
            if (var18_18 == 0) break block35;
            if (var18_18 == var6_6) ** GOTO lbl178
            if (var18_18 == var5_5) {
                var4_4 = 1064011039;
                var17_17 = 0.92f;
            } else {
                var2_2 = new IllegalArgumentException();
                throw var2_2;
lbl178:
                // 1 sources

                var4_4 = 0x3F000000;
                var17_17 = 0.5f;
            }
        }
        var3_3.e = var17_17;
        var3_3.f = 0;
        return var3_3.a();
    }

    public static long e(Matcher object, int n3) {
        long l2;
        long l3;
        int n4 = n3 + 1;
        String string2 = ((Matcher)object).group(n4);
        if (string2 != null) {
            l3 = Long.parseLong(string2);
            l2 = 3600000L;
            l3 *= l2;
        } else {
            l3 = 0L;
        }
        int n7 = n3 + 2;
        String string3 = ((Matcher)object).group(n7);
        string3.getClass();
        l2 = Long.parseLong(string3) * 60000L + l3;
        n4 = n3 + 3;
        string2 = ((Matcher)object).group(n4);
        string2.getClass();
        l3 = Long.parseLong(string2);
        long l4 = 1000L;
        l3 = l3 * l4 + l2;
        object = ((Matcher)object).group(n3 += 4);
        if (object != null) {
            long l7 = Long.parseLong((String)object);
            l3 += l7;
        }
        return l3 * l4;
    }

    public final /* synthetic */ lf3_0 a(int n3, byte[] byArray, int n4) {
        return uf3_0.a(this, byArray, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(byte[] byArray, int n3, int n4, Vf3$b vf3$b, n60_0 n60_02) {
        boolean bl2;
        Object object = this;
        Object object2 = vf3$b;
        Object object3 = n60_02;
        int n7 = n3 + n4;
        Xm2 xm2 = this.c;
        xm2.G(n7, byArray);
        xm2.I(n3);
        Object object4 = xm2.E();
        if (object4 == null) {
            object4 = StandardCharsets.UTF_8;
        }
        long l2 = ((Vf3$b)object2).a;
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false && (bl2 = ((Vf3$b)object2).b)) {
            object2 = new ArrayList();
        } else {
            bl2 = false;
            object2 = null;
        }
        while (true) {
            block16: {
                long l7;
                Object object5;
                Object object6;
                Object object7;
                long l8;
                block17: {
                    long l12;
                    int n8;
                    CharSequence charSequence;
                    int n10;
                    Object object8;
                    int n14;
                    long l14;
                    String string2;
                    block21: {
                        block18: {
                            block20: {
                                block19: {
                                    if ((string2 = xm2.j((Charset)object4)) == null) break block18;
                                    int n15 = string2.length();
                                    if (n15 == 0) continue;
                                    try {
                                        Integer.parseInt(string2);
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        object = object3;
                                        object3 = "Skipping invalid index: ".concat(string2);
                                        Cx.f((String)object3);
                                        break block16;
                                    }
                                    string2 = xm2.j((Charset)object4);
                                    if (string2 != null) break block19;
                                    object4 = "Unexpected end";
                                    Cx.f((String)object4);
                                    break block18;
                                }
                                Matcher matcher = d.matcher(string2);
                                boolean bl3 = matcher.matches();
                                if (!bl3) break block20;
                                l8 = af3_0.e(matcher, 1);
                                l4 = 6;
                                l14 = af3_0.e(matcher, (int)l4);
                                object7 = ((af3_0)object).a;
                                n14 = 0;
                                object6 = null;
                                ((StringBuilder)object7).setLength(0);
                                object5 = ((af3_0)object).b;
                                ((ArrayList)object5).clear();
                                object8 = xm2.j((Charset)object4);
                                break block21;
                            }
                            object = object3;
                            object3 = "Skipping invalid timing: ".concat(string2);
                            Cx.f((String)object3);
                            break block16;
                        }
                        object = object3;
                        if (object2 != null) {
                            object4 = object2.iterator();
                            while (bl2 = object4.hasNext()) {
                                object2 = (We0)object4.next();
                                object.accept(object2);
                            }
                        }
                        return;
                    }
                    while ((n10 = TextUtils.isEmpty((CharSequence)object8)) == 0) {
                        int n16;
                        n10 = ((StringBuilder)object7).length();
                        if (n10 > 0) {
                            object6 = "<br>";
                            ((StringBuilder)object7).append((String)object6);
                        }
                        object6 = ((String)object8).trim();
                        charSequence = new StringBuilder((String)object6);
                        Matcher matcher = e.matcher((CharSequence)object6);
                        n14 = 0;
                        object6 = null;
                        while ((n16 = matcher.find()) != 0) {
                            object = matcher.group();
                            ((ArrayList)object5).add(object);
                            n16 = matcher.start();
                            int n17 = n16 - n14;
                            int n18 = ((String)object).length();
                            n8 = n17 + n18;
                            l12 = l14;
                            string2 = "";
                            ((StringBuilder)charSequence).replace(n17, n8, string2);
                            n14 += n18;
                            object = this;
                            object3 = n60_02;
                        }
                        l12 = l14;
                        object = ((StringBuilder)charSequence).toString();
                        ((StringBuilder)object7).append((String)object);
                        object = xm2.j((Charset)object4);
                        object3 = n60_02;
                        l3 = -9223372036854775807L;
                        n14 = 0;
                        object6 = null;
                        object8 = object;
                        object = this;
                    }
                    l12 = l14;
                    object = Html.fromHtml((String)((StringBuilder)object7).toString());
                    object6 = null;
                    for (n14 = 0; n14 < (n8 = ((ArrayList)object5).size()); ++n14) {
                        object3 = (String)((ArrayList)object5).get(n14);
                        boolean bl4 = ((String)object3).matches((String)(charSequence = "\\{\\\\an[1-9]\\}"));
                        if (!bl4) {
                            continue;
                        }
                        break block17;
                    }
                    n8 = 0;
                    object3 = null;
                }
                if ((n7 = (int)((l7 = l2 - (l3 = -9223372036854775807L)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) != 0 && (n7 = (int)(l8 == l2 ? 0 : (l8 < l2 ? -1 : 1))) < 0) {
                    if (object2 != null) {
                        object = af3_0.d((Spanned)object, (String)object3);
                        object6 = ImmutableList.of(object);
                        object7 = object5;
                        object5 = new We0((List)object6, l8, l12 -= l8);
                        object2.add(object5);
                    }
                    object = n60_02;
                } else {
                    object6 = ImmutableList.of(af3_0.d((Spanned)object, (String)object3));
                    object7 = object5;
                    object5 = new We0((List)object6, l8, l12 -= l8);
                    object = n60_02;
                    n60_02.accept(object5);
                }
            }
            object3 = object;
            object = this;
        }
    }

    public final int c() {
        return 1;
    }

    public final /* synthetic */ void reset() {
    }
}

