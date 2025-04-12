/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.URLSpan
 *  android.text.util.Linkify
 *  android.text.util.Linkify$MatchFilter
 *  android.webkit.WebView
 *  android.widget.TextView
 */
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Ru1 {
    public static final qu1_0 a;

    static {
        qu1_0 qu1_02;
        a = qu1_02 = new Object();
    }

    public static void a(AjioTextView ajioTextView) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            Linkify.addLinks((TextView)ajioTextView, (int)15);
            return;
        }
        CharSequence charSequence = ajioTextView.getText();
        n4 = charSequence instanceof Spannable;
        if (n4 != 0) {
            n3 = Ru1.b((Spannable)(charSequence = (Spannable)charSequence)) ? 1 : 0;
            if (n3 != 0) {
                charSequence = ajioTextView.getMovementMethod();
                n3 = charSequence instanceof LinkMovementMethod;
                if (n3 == 0 && (n3 = (int)(ajioTextView.getLinksClickable() ? 1 : 0)) != 0) {
                    charSequence = LinkMovementMethod.getInstance();
                    ajioTextView.setMovementMethod((MovementMethod)charSequence);
                }
                return;
            }
        } else {
            n4 = Ru1.b((Spannable)(charSequence = SpannableString.valueOf((CharSequence)charSequence))) ? 1 : 0;
            if (n4 != 0) {
                MovementMethod movementMethod = ajioTextView.getMovementMethod();
                n4 = movementMethod instanceof LinkMovementMethod;
                if (n4 == 0 && (n4 = (int)(ajioTextView.getLinksClickable() ? 1 : 0)) != 0) {
                    movementMethod = LinkMovementMethod.getInstance();
                    ajioTextView.setMovementMethod(movementMethod);
                }
                ajioTextView.setText(charSequence);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Spannable spannable) {
        int n4;
        int n7;
        int n8;
        URLSpan uRLSpan;
        int n10 = Build.VERSION.SDK_INT;
        int n14 = 28;
        if (n10 >= n14) {
            return Linkify.addLinks((Spannable)spannable, (int)15);
        }
        n10 = spannable.length();
        n14 = 0;
        Ru1$a ru1$a = null;
        Class<URLSpan> clazz = URLSpan.class;
        Object object = (URLSpan[])spannable.getSpans(0, n10, clazz);
        int n15 = ((URLSpan[])object).length;
        int n16 = 1;
        n15 -= n16;
        while (n15 >= 0) {
            uRLSpan = object[n15];
            spannable.removeSpan((Object)uRLSpan);
            n15 += -1;
        }
        n10 = 4;
        Linkify.addLinks((Spannable)spannable, (int)n10);
        object = new ArrayList();
        Object object2 = vn2.a;
        Object object3 = "https://";
        uRLSpan = new String[]{"http://", object3, "rtsp://"};
        Object object4 = Linkify.sUrlMatchFilter;
        Ru1.d((ArrayList)object, spannable, (Pattern)object2, (String[])uRLSpan, (Linkify.MatchFilter)object4);
        object2 = vn2.b;
        uRLSpan = new String[]{"mailto:"};
        int n17 = 0;
        object4 = null;
        Ru1.d((ArrayList)object, spannable, (Pattern)object2, (String[])uRLSpan, null);
        object2 = spannable.toString();
        int n18 = 0;
        uRLSpan = null;
        try {
            while ((object4 = Ru1.c((String)object2)) != null && (n8 = ((String)object2).indexOf((String)object4)) >= 0) {
                Ru1$a ru1$a2 = new Ru1$a();
                n7 = ((String)object4).length() + n8;
                ru1$a2.c = n8 += n18;
                ru1$a2.d = n18 += n7;
                object2 = ((String)object2).substring(n7);
                object3 = "UTF-8";
                try {
                    object4 = URLEncoder.encode((String)object4, (String)object3);
                    object3 = new StringBuilder();
                    String string2 = "geo:0,0?q=";
                    ((StringBuilder)object3).append(string2);
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    continue;
                }
                ((StringBuilder)object3).append((String)object4);
                ru1$a2.b = object4 = ((StringBuilder)object3).toString();
                ((ArrayList)object).add(ru1$a2);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {}
        n15 = spannable.length();
        URLSpan[] uRLSpanArray = (URLSpan[])spannable.getSpans(0, n15, clazz);
        n15 = uRLSpanArray.length;
        uRLSpan = null;
        for (n18 = 0; n18 < n15; ++n18) {
            object4 = uRLSpanArray[n18];
            object3 = new Ru1$a();
            ((Ru1$a)object3).a = object4;
            ((Ru1$a)object3).c = n4 = spannable.getSpanStart(object4);
            ((Ru1$a)object3).d = n17 = spannable.getSpanEnd(object4);
            ((ArrayList)object).add(object3);
        }
        qu1_0 qu1_02 = a;
        Collections.sort(object, qu1_02);
        int n3 = ((ArrayList)object).size();
        n15 = 0;
        object2 = null;
        while (n15 < (n18 = n3 + -1)) {
            int n19;
            uRLSpan = (Ru1$a)((ArrayList)object).get(n15);
            n17 = n15 + 1;
            object3 = (Ru1$a)((ArrayList)object).get(n17);
            n4 = uRLSpan.c;
            n7 = ((Ru1$a)object3).c;
            if (n4 <= n7 && (n18 = uRLSpan.d) > n7 && (n18 = (n8 = ((Ru1$a)object3).d) <= n18 || (n18 -= n4) > (n8 -= n7) ? n17 : (n18 < n8 ? n15 : -1)) != (n19 = -1)) {
                object4 = ((Ru1$a)((ArrayList)object).get((int)n18)).a;
                if (object4 != null) {
                    spannable.removeSpan(object4);
                }
                ((ArrayList)object).remove(n18);
                n3 += -1;
                continue;
            }
            n15 = n17;
        }
        n3 = ((ArrayList)object).size();
        if (n3 == 0) {
            return false;
        }
        object = ((ArrayList)object).iterator();
        while ((n14 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            ru1$a = (Ru1$a)object.next();
            URLSpan uRLSpan2 = ru1$a.a;
            if (uRLSpan2 != null) continue;
            String string3 = ru1$a.b;
            n15 = ru1$a.c;
            n14 = ru1$a.d;
            uRLSpan = new URLSpan(string3);
            n3 = 33;
            spannable.setSpan((Object)uRLSpan, n15, n14, n3);
        }
        return n16 != 0;
    }

    /*
     * Unable to fully structure code
     */
    public static String c(String var0) {
        block38: {
            var1_1 = var0;
            var2_2 = Build.VERSION.SDK_INT;
            var3_3 = 28;
            if (var2_2 >= var3_3) {
                return WebView.findAddress((String)var0);
            }
            var4_4 = mN0.c;
            var5_5 = var4_4.matcher(var0);
            var6_6 = 0;
            var7_7 = null;
            var8_8 = 0;
            var9_9 = null;
            while ((var8_8 = (int)var5_5.find(var8_8)) != 0) {
                block39: {
                    block36: {
                        var9_9 = var5_5.group(0);
                        var8_8 = (int)mN0.a(var9_9);
                        if (var8_8 == 0) break block39;
                        var8_8 = var5_5.start();
                        var10_10 = var5_5.end();
                        var11_11 = mN0.b;
                        var12_12 = var11_11.matcher(var1_1);
                        var13_13 = -1;
                        var14_14 = "";
                        var15_15 = -1;
                        var16_16 = 1;
                        var17_17 = 1;
                        var18_18 = 1;
                        var19_19 = false;
                        var20_20 = -1;
                        while (true) {
                            block43: {
                                block46: {
                                    block45: {
                                        block44: {
                                            block42: {
                                                block37: {
                                                    block41: {
                                                        block40: {
                                                            if (var10_10 >= (var6_6 = var0.length())) break block40;
                                                            var6_6 = (int)var12_12.find(var10_10);
                                                            if (var6_6 == 0) {
                                                                var6_6 = var0.length();
lbl33:
                                                                // 2 sources

                                                                while (true) {
                                                                    var6_6 = -var6_6;
lbl35:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var15_15 = var6_6;
lbl37:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var6_6 = 0;
                                                                            var7_7 = null;
                                                                            break block36;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            var6_6 = var12_12.end();
                                                            var21_21 = var12_12.start();
                                                            if ((var6_6 -= var21_21) > (var22_22 = 25)) {
                                                                var6_6 = var12_12.end();
                                                                ** continue;
                                                            }
                                                            while (var10_10 < (var6_6 = var12_12.start())) {
                                                                var6_6 = var10_10 + 1;
                                                                var10_10 = var1_1.charAt(var10_10);
                                                                var23_23 = "\n\u000b\f\r\u0085\u2028\u2029";
                                                                if ((var10_10 = var23_23.indexOf(var10_10)) != var13_13) {
                                                                    ++var16_16;
                                                                }
                                                                var10_10 = var6_6;
                                                            }
                                                            var6_6 = 5;
                                                            if (var16_16 <= var6_6 && ++var17_17 <= (var22_22 = 14)) break block41;
                                                        }
lbl57:
                                                        // 3 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    if (var10_10 > 0) {
                                                        var22_22 = var10_10 + -1;
                                                        var7_7 = ":,\"'\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
                                                        var6_6 = var7_7.indexOf(var22_22 = (int)var1_1.charAt(var22_22));
                                                        if (var6_6 == var13_13) lbl-1000:
                                                        // 3 sources

                                                        {
                                                            while (true) {
                                                                var6_6 = 0;
                                                                var7_7 = null;
                                                                break block37;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    var7_7 = var4_4.matcher(var1_1);
                                                    var22_22 = var0.length();
                                                    if ((var22_22 = (int)(var7_7 = var7_7.region(var10_10, var22_22)).lookingAt()) == 0) ** GOTO lbl-1000
                                                    var7_7 = var7_7.toMatchResult();
                                                    var23_23 = null;
                                                    var24_24 = var7_7.group(0);
                                                    var22_22 = (int)mN0.a(var24_24);
                                                    if (var22_22 != 0) ** break;
                                                    ** continue;
                                                }
                                                if (var7_7 == null) break block42;
                                                var6_6 = 1;
                                                if (var18_18 != 0 && var16_16 > var6_6) {
                                                    var6_6 = -var10_10;
                                                    ** continue;
                                                }
                                                if (var15_15 == var13_13) {
                                                    var15_15 = var10_10;
                                                }
                                                var6_6 = 0;
                                                var7_7 = null;
                                                break block43;
                                            }
                                            var6_6 = 1;
                                            var25_25 = var12_12.group(0);
                                            var23_23 = mN0.e.matcher(var25_25);
                                            var22_22 = (int)var23_23.matches();
                                            if (var22_22 == 0) break block44;
                                            var6_6 = 0;
                                            var7_7 = null;
                                            var18_18 = 0;
                                            var25_25 = null;
                                            var19_19 = true;
                                            break block43;
                                        }
                                        var22_22 = 5;
                                        if (var17_17 != var22_22 || var19_19) break block45;
                                        var10_10 = var12_12.end();
                                        ** GOTO lbl57
                                    }
                                    if (!var19_19 || var17_17 <= (var22_22 = 4)) break block46;
                                    if (var10_10 <= 0) ** GOTO lbl-1000
                                    var22_22 = var10_10 + -1;
                                    var22_22 = var1_1.charAt(var22_22);
                                    var25_25 = ",*\u2022\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
                                    if ((var22_22 = var25_25.indexOf(var22_22)) == var13_13) {
                                        while (true) {
                                            var10_10 = 0;
                                            var26_26 = null;
                                            break;
                                        }
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        if ((var22_22 = (int)(var26_26 = (var23_23 = mN0.d.matcher(var1_1)).region(var10_10, var18_18 = var0.length())).lookingAt()) == 0) ** continue;
                                        var26_26 = var26_26.toMatchResult();
                                    }
                                    if (var26_26 != null) {
                                        var23_23 = "et";
                                        var22_22 = (int)var14_14.equals(var23_23);
                                        if (var22_22 != 0 && (var22_22 = (int)(var14_14 = var26_26.group(0)).equals(var23_23 = "al")) != 0) {
                                            var10_10 = var26_26.end();
                                            ** continue;
                                        }
                                        var23_23 = var11_11.matcher(var1_1);
                                        var27_27 = var26_26.end();
                                        if ((var27_27 = (int)var23_23.find(var27_27)) != 0) {
                                            var14_14 = null;
                                            var25_25 = var23_23.group(0);
                                            var27_27 = var26_26.groupCount();
                                            while (var27_27 > 0) {
                                                var21_21 = var27_27 + -1;
                                                var14_14 = var26_26.group(var27_27);
                                                if (var14_14 != null) {
                                                    var27_27 = var21_21;
                                                    break;
                                                }
                                                var27_27 = var21_21;
                                            }
                                            if ((var10_10 = (int)(var26_26 = mN0.g.matcher(var25_25)).matches()) != 0) {
                                                var26_26 = mN0.a[var27_27];
                                                var26_26.getClass();
                                                var7_7 = null;
                                                var14_14 = var25_25.substring(0, 2);
                                                var6_6 = Integer.parseInt(var14_14);
                                                var27_27 = var26_26.a;
                                                if (var27_27 <= var6_6 && var6_6 <= (var27_27 = var26_26.b) || var6_6 == (var27_27 = var26_26.c) || var6_6 == (var10_10 = var26_26.d)) {
                                                    var15_15 = var20_20 = var23_23.end();
                                                    ** continue;
                                                }
                                            }
                                        } else {
                                            var20_20 = var26_26.end();
                                        }
                                    }
                                }
                                var6_6 = 0;
                                var7_7 = null;
                                var18_18 = 0;
                                var25_25 = null;
                            }
                            var14_14 = var12_12.group(0);
                            var10_10 = var12_12.end();
                        }
                        var6_6 = 0;
                        var7_7 = null;
                        if (var20_20 > 0) {
                            var15_15 = var20_20;
                        } else {
                            if (var15_15 <= 0) {
                                var15_15 = var10_10;
                            }
                            var15_15 = -var15_15;
                        }
                    }
                    if (var15_15 > 0) {
                        var28_28 = var1_1.substring(var8_8, var15_15);
                        break block38;
                    }
                    var8_8 = -var15_15;
                    continue;
                }
                var8_8 = var5_5.end();
            }
            var15_15 = 0;
            var28_28 = null;
        }
        return var28_28;
    }

    public static void d(ArrayList arrayList, Spannable spannable, Pattern pattern, String[] stringArray, Linkify.MatchFilter matchFilter) {
        int n3;
        Spannable spannable2 = spannable;
        String[] stringArray2 = stringArray;
        Object object = pattern;
        Linkify.MatchFilter matchFilter2 = matchFilter;
        object = pattern.matcher((CharSequence)spannable);
        while ((n3 = ((Matcher)object).find()) != 0) {
            CharSequence charSequence;
            boolean bl2;
            Ru1$a ru1$a;
            int n4;
            String string2;
            String string3;
            int n7;
            block5: {
                n3 = ((Matcher)object).start();
                n7 = ((Matcher)object).end();
                string3 = null;
                string2 = ((Matcher)object).group(0);
                if (matchFilter2 != null && (n4 = matchFilter2.acceptMatch((CharSequence)spannable2, n3, n7)) == 0) continue;
                if (string2 == null) continue;
                ru1$a = new Ru1$a();
                int n8 = stringArray2.length;
                int n10 = 0;
                while (n10 < n8) {
                    String string4 = stringArray2[n10];
                    int n14 = string4.length();
                    bl2 = true;
                    int n15 = 0;
                    String string5 = null;
                    charSequence = string2;
                    int n16 = n10;
                    n10 = n14;
                    n4 = string2.regionMatches(bl2, 0, string4, 0, n14) ? 1 : 0;
                    if (n4 != 0) {
                        n10 = string4.length();
                        n15 = 0;
                        string5 = null;
                        n4 = string2.regionMatches(false, 0, string4, 0, n10) ? 1 : 0;
                        bl2 = true;
                        if (n4 == 0) {
                            charSequence = Ex0.a(string4);
                            n15 = string4.length();
                            string5 = string2.substring(n15);
                            ((StringBuilder)charSequence).append(string5);
                            string2 = ((StringBuilder)charSequence).toString();
                        }
                        break block5;
                    }
                    n10 = n16 + 1;
                }
                bl2 = false;
            }
            if (!bl2 && (n4 = stringArray2.length) > 0) {
                charSequence = new StringBuilder();
                string3 = stringArray2[0];
                string2 = h30_0.a((StringBuilder)charSequence, string3, string2);
            }
            ru1$a.b = string2;
            ru1$a.c = n3;
            ru1$a.d = n7;
            arrayList.add(ru1$a);
        }
    }
}

