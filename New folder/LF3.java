/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.SpannedString
 *  android.text.TextUtils
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 */
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LF3 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        int n3 = 255;
        no.c(n3, n3, n3, hashMap, "white");
        no.c(0, n3, 0, hashMap, "lime");
        no.c(0, n3, n3, hashMap, "cyan");
        no.c(n3, 0, 0, hashMap, "red");
        no.c(n3, n3, 0, hashMap, "yellow");
        no.c(n3, 0, n3, hashMap, "magenta");
        no.c(0, 0, n3, hashMap, "blue");
        no.c(0, 0, 0, hashMap, "black");
        c = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        no.c(n3, n3, n3, hashMap, "bg_white");
        no.c(0, n3, 0, hashMap, "bg_lime");
        no.c(0, n3, n3, hashMap, "bg_cyan");
        no.c(n3, 0, 0, hashMap, "bg_red");
        no.c(n3, n3, 0, hashMap, "bg_yellow");
        no.c(n3, 0, n3, hashMap, "bg_magenta");
        no.c(0, 0, n3, hashMap, "bg_blue");
        no.c(0, 0, 0, hashMap, "bg_black");
        d = Collections.unmodifiableMap(hashMap);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(String string2, LF3$b lF3$b, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        Object object;
        LF3$b lF3$b2;
        float f5;
        int n3;
        Object object2;
        int n4;
        int n7;
        ArrayList arrayList;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object3;
        int n16;
        int n17;
        Object object4;
        SpannableStringBuilder spannableStringBuilder2;
        LF3$b lF3$b3;
        Object object5;
        block52: {
            block53: {
                object5 = string2;
                lF3$b3 = lF3$b;
                spannableStringBuilder2 = spannableStringBuilder;
                object4 = list2;
                n17 = lF3$b.b;
                n16 = spannableStringBuilder.length();
                object3 = lF3$b.a;
                object3.getClass();
                n15 = -1;
                n14 = 1;
                n10 = 33;
                n8 = ((String)object3).hashCode();
                switch (n8) {
                    case 3511770: {
                        arrayList = "ruby";
                        n7 = ((String)object3).equals(arrayList) ? 1 : 0;
                        if (n7 == 0) break;
                        n7 = 7;
                        break block52;
                    }
                    case 3314158: {
                        arrayList = "lang";
                        n7 = ((String)object3).equals(arrayList) ? 1 : 0;
                        if (n7 == 0) break;
                        n7 = 6;
                        break block52;
                    }
                    case 118: {
                        arrayList = "v";
                        n7 = ((String)object3).equals(arrayList) ? 1 : 0;
                        if (n7 == 0) break;
                        n7 = 5;
                        break block52;
                    }
                    case 117: {
                        arrayList = "u";
                        n7 = ((String)object3).equals(arrayList) ? 1 : 0;
                        if (n7 == 0) break;
                        n7 = 4;
                        break block52;
                    }
                    case 105: {
                        arrayList = "i";
                        n7 = ((String)object3).equals(arrayList) ? 1 : 0;
                        if (n7 == 0) break;
                        n7 = 3;
                        break block52;
                    }
                    case 99: {
                        arrayList = "c";
                        n7 = ((String)object3).equals(arrayList) ? 1 : 0;
                        if (n7 == 0) break;
                        n7 = 2;
                        break block52;
                    }
                    case 98: {
                        arrayList = "b";
                        n7 = ((String)object3).equals(arrayList) ? 1 : 0;
                        if (n7 == 0) break;
                        n7 = 1;
                        break block52;
                    }
                    case 0: {
                        arrayList = "";
                        n7 = ((String)object3).equals(arrayList) ? 1 : 0;
                        if (n7 != 0) break block53;
                    }
                }
                n7 = -1;
                break block52;
            }
            n7 = 0;
            object3 = null;
        }
        switch (n7) {
            default: {
                return;
            }
            case 7: {
                n7 = LF3.c((List)object4, (String)object5, lF3$b3);
                int n18 = list.size();
                arrayList = new ArrayList(n18);
                Object object6 = list;
                arrayList.addAll(list);
                object6 = LF3$a.c;
                Collections.sort(arrayList, object6);
                n18 = lF3$b3.b;
                int n19 = 0;
                for (int i3 = 0; i3 < (n4 = arrayList.size()); i3 += n14) {
                    object2 = "rt";
                    Object object7 = ((LF3$a)arrayList.get((int)i3)).a.a;
                    n3 = ((String)object2).equals(object7) ? 1 : 0;
                    if (n3 != 0) {
                        object2 = (LF3$a)arrayList.get(i3);
                        object7 = ((LF3$a)object2).a;
                        n4 = LF3.c((List)object4, (String)object5, (LF3$b)object7);
                        if (n4 == n15) {
                            if (n7 != n15) {
                                n4 = n7;
                            } else {
                                n4 = 1;
                                f5 = Float.MIN_VALUE;
                            }
                        }
                        lF3$b2 = ((LF3$a)object2).a;
                        n15 = lF3$b2.b - n19;
                        n3 = ((LF3$a)object2).b - n19;
                        CharSequence charSequence = spannableStringBuilder2.subSequence(n15, n3);
                        spannableStringBuilder2.delete(n15, n3);
                        object = charSequence.toString();
                        object2 = new MQ2((String)object, n4);
                        spannableStringBuilder2.setSpan(object2, n18, n15, n10);
                        n3 = charSequence.length();
                        n19 = n3 + n19;
                        n18 = n15;
                    }
                    n15 = -1;
                }
                break;
            }
            case 5: {
                object3 = lF3$b3.c;
                object2 = new GE3((String)object3);
                spannableStringBuilder2.setSpan(object2, n17, n16, n10);
                break;
            }
            case 4: {
                object2 = new UnderlineSpan();
                spannableStringBuilder2.setSpan(object2, n17, n16, n10);
                break;
            }
            case 3: {
                n7 = 2;
                object2 = new StyleSpan(n7);
                spannableStringBuilder2.setSpan(object2, n17, n16, n10);
                break;
            }
            case 2: {
                object2 = lF3$b3.d.iterator();
                while ((n7 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    object = c;
                    object3 = (String)object2.next();
                    n15 = object.containsKey(object3) ? 1 : 0;
                    if (n15 != 0) {
                        object3 = (Integer)object.get(object3);
                        n7 = (Integer)object3;
                        object = new ForegroundColorSpan(n7);
                        spannableStringBuilder2.setSpan(object, n17, n16, n10);
                        continue;
                    }
                    object = d;
                    n15 = object.containsKey(object3) ? 1 : 0;
                    if (n15 == 0) continue;
                    object3 = (Integer)object.get(object3);
                    n7 = (Integer)object3;
                    object = new BackgroundColorSpan(n7);
                    spannableStringBuilder2.setSpan(object, n17, n16, n10);
                }
                break;
            }
            case 1: {
                object2 = new StyleSpan(n14);
                spannableStringBuilder2.setSpan(object2, n17, n16, n10);
                break;
            }
            case 0: 
            case 6: 
        }
        object5 = LF3.b((List)object4, (String)object5, lF3$b3);
        int n20 = 0;
        lF3$b3 = null;
        while (true) {
            block55: {
                int n21;
                block57: {
                    int n22;
                    block56: {
                        block54: {
                            if (n20 >= (n21 = ((ArrayList)object5).size())) {
                                return;
                            }
                            object4 = ((LF3$c)((ArrayList)object5).get((int)n20)).b;
                            if (object4 != null) break block54;
                            n7 = -1;
                            n22 = 2;
                            n15 = 3;
                            break block55;
                        }
                        n3 = ((IF3)object4).l;
                        n7 = -1;
                        if (n3 == n7 && (n22 = ((IF3)object4).m) == n7) {
                            n3 = -1;
                        } else {
                            if (n3 == n14) {
                                n3 = 1;
                            } else {
                                n3 = 0;
                                object2 = null;
                            }
                            n7 = ((IF3)object4).m;
                            if (n7 == n14) {
                                n7 = 2;
                            } else {
                                n7 = 0;
                                object3 = null;
                            }
                            n7 |= n3;
                            n3 = n7;
                        }
                        n7 = -1;
                        if (n3 != n7) {
                            n22 = ((IF3)object4).l;
                            if (n22 == n7 && (n15 = ((IF3)object4).m) == n7) {
                                n22 = -1;
                            } else {
                                if (n22 == n14) {
                                    n22 = 1;
                                } else {
                                    n22 = 0;
                                    object = null;
                                }
                                n15 = ((IF3)object4).m;
                                if (n15 == n14) {
                                    n15 = 2;
                                } else {
                                    n15 = 0;
                                    lF3$b2 = null;
                                }
                                n22 |= n15;
                            }
                            object2 = new StyleSpan(n22);
                            V93.a(spannableStringBuilder2, object2, n17, n16);
                        }
                        if ((n3 = ((IF3)object4).j) == n14) {
                            object2 = new StrikethroughSpan();
                            spannableStringBuilder2.setSpan(object2, n17, n16, n10);
                        }
                        if ((n3 = ((IF3)object4).k) == n14) {
                            object2 = new UnderlineSpan();
                            spannableStringBuilder2.setSpan(object2, n17, n16, n10);
                        }
                        if ((n3 = (int)(((IF3)object4).g ? 1 : 0)) != 0) {
                            n22 = ((IF3)object4).g ? 1 : 0;
                            if (n22 == 0) {
                                object5 = new IllegalStateException("Font color not defined");
                                throw object5;
                            }
                            n22 = ((IF3)object4).f;
                            object2 = new ForegroundColorSpan(n22);
                            V93.a(spannableStringBuilder2, object2, n17, n16);
                        }
                        if ((n3 = (int)(((IF3)object4).i ? 1 : 0)) != 0) {
                            n22 = ((IF3)object4).i ? 1 : 0;
                            if (n22 == 0) {
                                object5 = new IllegalStateException("Background color not defined.");
                                throw object5;
                            }
                            n22 = ((IF3)object4).h;
                            object2 = new BackgroundColorSpan(n22);
                            V93.a(spannableStringBuilder2, object2, n17, n16);
                        }
                        if ((object2 = ((IF3)object4).e) != null) {
                            object = ((IF3)object4).e;
                            object2 = new TypefaceSpan((String)object);
                            V93.a(spannableStringBuilder2, object2, n17, n16);
                        }
                        if ((n3 = ((IF3)object4).n) == n14) break block56;
                        n22 = 2;
                        if (n3 != n22) {
                            n15 = 3;
                            if (n3 == n15) {
                                f5 = ((IF3)object4).o;
                                n8 = 1120403456;
                                float f6 = 100.0f;
                                object2 = new RelativeSizeSpan(f5 /= f6);
                                V93.a(spannableStringBuilder2, object2, n17, n16);
                            }
                            break block57;
                        } else {
                            n15 = 3;
                            f5 = ((IF3)object4).o;
                            object2 = new RelativeSizeSpan(f5);
                            V93.a(spannableStringBuilder2, object2, n17, n16);
                        }
                        break block57;
                    }
                    n22 = 2;
                    n15 = 3;
                    f5 = ((IF3)object4).o;
                    n4 = (int)f5;
                    object2 = new AbsoluteSizeSpan(n4, n14 != 0);
                    V93.a(spannableStringBuilder2, object2, n17, n16);
                }
                n21 = ((IF3)object4).q ? 1 : 0;
                if (n21 != 0) {
                    object4 = new u91();
                    spannableStringBuilder2.setSpan(object4, n17, n16, n10);
                }
            }
            n20 += n14;
        }
    }

    public static ArrayList b(List list, String string2, LF3$b lF3$b) {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            int n4;
            IF3 iF3 = (IF3)list.get(i3);
            String string3 = lF3$b.a;
            Object object = iF3.a;
            int n7 = ((String)object).isEmpty();
            if (n7 != 0 && (n7 = ((String)(object = iF3.b)).isEmpty()) != 0 && (n7 = (int)((object = iF3.c).isEmpty() ? 1 : 0)) != 0 && (n7 = (int)(((String)(object = iF3.d)).isEmpty() ? 1 : 0)) != 0) {
                n4 = TextUtils.isEmpty((CharSequence)string3) ? 1 : 0;
            } else {
                object = iF3.a;
                int n8 = 0x40000000;
                n7 = IF3.a(0, n8, (String)object, string2);
                Object object2 = iF3.b;
                n4 = IF3.a(n7, 2, (String)object2, string3);
                int n10 = 4;
                object = iF3.d;
                object2 = lF3$b.c;
                if ((n4 = IF3.a(n4, n10, (String)object, (String)object2)) != (n7 = -1) && (n7 = (int)((object2 = lF3$b.d).containsAll((Collection<?>)(object = iF3.c)) ? 1 : 0)) != 0) {
                    object = iF3.c;
                    n7 = object.size() * 4;
                    n4 += n7;
                } else {
                    n4 = 0;
                    string3 = null;
                }
            }
            if (n4 <= 0) continue;
            object = new LF3$c(n4, iF3);
            arrayList.add(object);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String string2, LF3$b object) {
        int n3;
        list = LF3.b(list, string2, (LF3$b)object);
        int n4 = 0;
        string2 = null;
        while (true) {
            int n7 = ((ArrayList)list).size();
            n3 = -1;
            if (n4 >= n7) break;
            object = ((LF3$c)((ArrayList)list).get((int)n4)).b;
            n7 = ((IF3)object).p;
            if (n7 != n3) {
                return n7;
            }
            ++n4;
        }
        return n3;
    }

    public static JF3 d(String object, Matcher object2, Xm2 xm2, ArrayList arrayList) {
        Object object3;
        int n3;
        LF3$d lF3$d = new LF3$d();
        int n4 = 1;
        Object object4 = ((Matcher)object2).group(n4);
        object4.getClass();
        long l2 = NF3.b((String)object4);
        lF3$d.a = l2;
        n4 = 2;
        object4 = ((Matcher)object2).group(n4);
        object4.getClass();
        l2 = NF3.b((String)object4);
        try {
            lF3$d.b = l2;
            n4 = 3;
        }
        catch (NumberFormatException numberFormatException) {
            object = new StringBuilder("Skipping cue with bad header: ");
            object2 = ((Matcher)object2).group();
            ((StringBuilder)object).append((String)object2);
            Cx.f(((StringBuilder)object).toString());
            return null;
        }
        object2 = ((Matcher)object2).group(n4);
        object2.getClass();
        LF3.e((String)object2, lF3$d);
        object2 = new StringBuilder();
        xm2.getClass();
        object4 = StandardCharsets.UTF_8;
        object4 = xm2.j((Charset)object4);
        while ((n3 = TextUtils.isEmpty((CharSequence)object4)) == 0) {
            n3 = ((StringBuilder)object2).length();
            if (n3 > 0) {
                object3 = "\n";
                ((StringBuilder)object2).append((String)object3);
            }
            object4 = ((String)object4).trim();
            ((StringBuilder)object2).append((String)object4);
            object4 = StandardCharsets.UTF_8;
            object4 = xm2.j((Charset)object4);
        }
        object2 = ((StringBuilder)object2).toString();
        object = LF3.f((String)object, (String)object2, arrayList);
        lF3$d.c = object;
        object3 = lF3$d.a().a();
        long l3 = lF3$d.a;
        long l4 = lF3$d.b;
        object4 = object;
        object = new JF3((Pe0)object3, l3, l4);
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static void e(String var0, LF3$d var1_1) {
        var2_2 = var1_1;
        var3_3 = "start";
        var4_4 = "end";
        var5_5 = "middle";
        var6_6 = "center";
        var7_7 = -1;
        var8_8 = 2;
        var9_9 = 1;
        var10_10 = LF3.b;
        var11_11 = var0;
        var10_10 = var10_10.matcher(var0);
        while ((var12_12 = var10_10.find()) != 0) {
            block70: {
                block69: {
                    block67: {
                        block68: {
                            block66: {
                                block65: {
                                    var11_11 = var10_10.group(var9_9);
                                    var11_11.getClass();
                                    var13_13 = var10_10.group(var8_8);
                                    var13_13.getClass();
                                    var14_14 = "line";
                                    var15_15 = var14_14.equals(var11_11);
                                    if (var15_15 == 0) break block65;
                                    LF3.g(var13_13, var2_2);
                                }
                                var14_14 = "align";
                                var15_15 = var14_14.equals(var11_11);
                                if (var15_15 == 0) break block66;
                                var12_12 = var13_13.hashCode();
                                switch (var12_12) lbl-1000:
                                // 7 sources

                                {
                                    default: {
                                        var12_12 = -1;
                                        break;
                                    }
                                    case 109757538: {
                                        var12_12 = (int)var13_13.equals(var3_3);
                                        if (var12_12 == 0) ** GOTO lbl-1000
                                        var12_12 = 5;
                                        break;
                                    }
                                    case 108511772: {
                                        var11_11 = "right";
                                        var12_12 = (int)var13_13.equals(var11_11);
                                        if (var12_12 == 0) ** GOTO lbl-1000
                                        var12_12 = 4;
                                        break;
                                    }
                                    case 3317767: {
                                        var11_11 = "left";
                                        var12_12 = (int)var13_13.equals(var11_11);
                                        if (var12_12 == 0) ** GOTO lbl-1000
                                        var12_12 = 3;
                                        break;
                                    }
                                    case 100571: {
                                        var12_12 = (int)var13_13.equals(var4_4);
                                        if (var12_12 == 0) ** GOTO lbl-1000
                                        var12_12 = 2;
                                        break;
                                    }
                                    case -1074341483: {
                                        var12_12 = (int)var13_13.equals(var5_5);
                                        if (var12_12 == 0) ** GOTO lbl-1000
                                        var12_12 = 1;
                                        break;
                                    }
                                    case -1364013995: {
                                        var12_12 = (int)var13_13.equals(var6_6);
                                        if (var12_12 == 0) ** GOTO lbl-1000
                                        var12_12 = 0;
                                        var11_11 = null;
                                    }
                                }
                                switch (var12_12) {
                                    default: {
                                        var11_11 = "Invalid alignment value: ";
                                        var11_11 = var11_11.concat(var13_13);
                                        Cx.f(var11_11);
                                    }
                                    case 0: 
                                    case 1: {
                                        var12_12 = 2;
                                        break;
                                    }
                                    case 5: {
                                        var12_12 = 1;
                                        break;
                                    }
                                    case 4: {
                                        var12_12 = 5;
                                        break;
                                    }
                                    case 3: {
                                        var12_12 = 4;
                                        break;
                                    }
                                    case 2: {
                                        var12_12 = 3;
                                    }
                                }
                                var2_2.d = var12_12;
                                continue;
                            }
                            var14_14 = "position";
                            var15_15 = var14_14.equals(var11_11);
                            if (var15_15 == 0) break block67;
                            var12_12 = 44;
                            var12_12 = var13_13.indexOf(var12_12);
                            if (var12_12 == var7_7) break block68;
                            var15_15 = var12_12 + 1;
                            var14_14 = var13_13.substring(var15_15);
                            var14_14.getClass();
                            var16_16 = var14_14.hashCode();
                            switch (var16_16) lbl-1000:
                            // 7 sources

                            {
                                default: {
                                    var17_17 = -1;
                                    var18_18 = 0.0f / 0.0f;
                                    break;
                                }
                                case 109757538: {
                                    var16_16 = (int)var14_14.equals(var3_3);
                                    if (var16_16 == 0) ** GOTO lbl-1000
                                    var17_17 = 5;
                                    var18_18 = 7.0E-45f;
                                    break;
                                }
                                case 100571: {
                                    var16_16 = (int)var14_14.equals(var4_4);
                                    if (var16_16 == 0) ** GOTO lbl-1000
                                    var17_17 = 4;
                                    var18_18 = 5.6E-45f;
                                    break;
                                }
                                case -1074341483: {
                                    var16_16 = (int)var14_14.equals(var5_5);
                                    if (var16_16 == 0) ** GOTO lbl-1000
                                    var17_17 = 3;
                                    var18_18 = 4.2E-45f;
                                    break;
                                }
                                case -1276788989: {
                                    var19_19 = "line-right";
                                    var17_17 = (int)var14_14.equals(var19_19);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 2;
                                    var18_18 = 2.8E-45f;
                                    break;
                                }
                                case -1364013995: {
                                    var17_17 = (int)var14_14.equals(var6_6);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 1;
                                    var18_18 = 1.4E-45f;
                                    break;
                                }
                                case -1842484672: {
                                    var19_19 = "line-left";
                                    var17_17 = (int)var14_14.equals(var19_19);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 0;
                                    var18_18 = 0.0f;
                                    var19_19 = null;
                                }
                            }
                            switch (var17_17) {
                                default: {
                                    var19_19 = "Invalid anchor value: ";
                                    var19_19 = var19_19.concat(var14_14);
                                    Cx.f((String)var19_19);
                                    var17_17 = -1 << -1;
                                    var18_18 = -0.0f;
                                    break;
                                }
                                case 2: 
                                case 4: {
                                    var17_17 = 2;
                                    var18_18 = 2.8E-45f;
                                    break;
                                }
                                case 1: 
                                case 3: {
                                    var17_17 = 1;
                                    var18_18 = 1.4E-45f;
                                    break;
                                }
                                case 0: 
                                case 5: {
                                    var17_17 = 0;
                                    var18_18 = 0.0f;
                                    var19_19 = null;
                                }
                            }
                            var2_2.i = var17_17;
                            var13_13 = var13_13.substring(0, var12_12);
                        }
                        var18_18 = NF3.a(var13_13);
                        var2_2.h = var18_18;
                        continue;
                    }
                    var19_19 = "size";
                    var17_17 = var19_19.equals(var11_11);
                    if (var17_17 == 0) break block69;
                    var18_18 = NF3.a(var13_13);
                    var2_2.j = var18_18;
                    continue;
                }
                var19_19 = "vertical";
                var17_17 = var19_19.equals(var11_11);
                if (var17_17 == 0) break block70;
                var19_19 = "lr";
                var17_17 = var13_13.equals(var19_19);
                if (var17_17 == 0) {
                    var19_19 = "rl";
                    var17_17 = (int)var13_13.equals(var19_19);
                    if (var17_17 == 0) {
                        var19_19 = "Invalid 'vertical' value: ";
                        var19_19 = var19_19.concat(var13_13);
                        Cx.f((String)var19_19);
                        var17_17 = -1 << -1;
                        var18_18 = -0.0f;
                    } else {
                        var17_17 = 1;
                        var18_18 = 1.4E-45f;
                    }
                } else {
                    var17_17 = 2;
                    var18_18 = 2.8E-45f;
                }
                var2_2.k = var17_17;
                continue;
            }
            var19_19 = new StringBuilder();
            var14_14 = "Unknown cue setting ";
            var19_19.append(var14_14);
            var19_19.append(var11_11);
            var11_11 = ":";
            var19_19.append(var11_11);
            var19_19.append(var13_13);
            var19_19 = var19_19.toString();
            try {
                Cx.f((String)var19_19);
            }
            catch (NumberFormatException v0) {
                var19_19 = new StringBuilder("Skipping bad cue setting: ");
                var11_11 = var10_10.group();
                var19_19.append(var11_11);
                var19_19 = var19_19.toString();
                Cx.f((String)var19_19);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static SpannedString f(String var0, String var1_1, List var2_2) {
        var3_3 = var0;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = -1;
        var7_7 = 2;
        var8_8 = 1;
        var9_9 = new SpannableStringBuilder();
        var10_10 = new ArrayDeque<String[]>();
        var11_11 = new ArrayList<String[]>();
        var12_12 = 0;
        var13_13 = null;
        block25: while (true) {
            block47: {
                block50: {
                    block48: {
                        block49: {
                            var14_14 = var1_1.length();
                            var15_15 = "";
                            if (var12_12 >= var14_14) break;
                            var14_14 = var4_4.charAt(var12_12);
                            var16_16 = " ";
                            var17_17 = 62;
                            var18_18 = 60;
                            var19_19 = 38;
                            if (var14_14 == var19_19) break block48;
                            if (var14_14 != var18_18) {
                                var9_9.append((char)var14_14);
                                var12_12 += var8_8;
lbl26:
                                // 2 sources

                                while (true) {
                                    var18_18 = 1;
                                    var8_8 = -1;
                                    break block47;
                                    break;
                                }
                            }
                            var18_18 = var12_12 + '\u0001';
                            var19_19 = var1_1.length();
                            if (var18_18 >= var19_19) lbl-1000:
                            // 5 sources

                            {
                                while (true) {
                                    var12_12 = var18_18;
                                    ** continue;
                                    break;
                                }
                            }
                            var19_19 = var4_4.charAt(var18_18);
                            if (var19_19 == (var14_14 = 47)) {
                                var19_19 = 1;
                            } else {
                                var19_19 = 0;
                                var20_20 /* !! */  = null;
                            }
                            var18_18 = var4_4.indexOf(var17_17, var18_18);
                            var18_18 = var18_18 == var6_6 ? var1_1.length() : (var18_18 += var8_8);
                            var17_17 = var18_18 + -2;
                            var6_6 = var4_4.charAt(var17_17);
                            if (var6_6 == var14_14) {
                                var6_6 = 1;
                            } else {
                                var6_6 = 0;
                                var21_21 = null;
                            }
                            var14_14 = var19_19 != 0 ? 2 : 1;
                            var12_12 += var14_14;
                            if (var6_6 == 0) {
                                var17_17 = var18_18 + -1;
                            }
                            var13_13 = var4_4.substring(var12_12, var17_17);
                            var22_22 = var13_13.trim();
                            var14_14 = (int)var22_22.isEmpty();
                            if (var14_14 != 0) ** GOTO lbl-1000
                            var22_22 = var13_13.trim();
                            ct3.a((boolean)(var22_22.isEmpty() ^ var8_8));
                            var17_17 = gz3.a;
                            var22_22 = var22_22.split("[ \\.]", var7_7);
                            var23_23 = null;
                            var22_22 = var22_22[0];
                            var22_22.getClass();
                            var17_17 = var22_22.hashCode();
                            switch (var17_17) lbl-1000:
                            // 9 sources

                            {
                                default: {
                                    var17_17 = -1;
                                    break;
                                }
                                case 3511770: {
                                    var23_23 = "ruby";
                                    var17_17 = (int)var22_22.equals(var23_23);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 7;
                                    break;
                                }
                                case 3314158: {
                                    var23_23 = "lang";
                                    var17_17 = (int)var22_22.equals(var23_23);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 6;
                                    break;
                                }
                                case 3650: {
                                    var23_23 = "rt";
                                    var17_17 = (int)var22_22.equals(var23_23);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 5;
                                    break;
                                }
                                case 118: {
                                    var23_23 = "v";
                                    var17_17 = (int)var22_22.equals(var23_23);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 4;
                                    break;
                                }
                                case 117: {
                                    var23_23 = "u";
                                    var17_17 = (int)var22_22.equals(var23_23);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 3;
                                    break;
                                }
                                case 105: {
                                    var23_23 = "i";
                                    var17_17 = (int)var22_22.equals(var23_23);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 2;
                                    break;
                                }
                                case 99: {
                                    var23_23 = "c";
                                    var17_17 = (int)var22_22.equals(var23_23);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 1;
                                    break;
                                }
                                case 98: {
                                    var23_23 = "b";
                                    var17_17 = (int)var22_22.equals(var23_23);
                                    if (var17_17 == 0) ** GOTO lbl-1000
                                    var17_17 = 0;
                                    var23_23 = null;
                                }
                            }
                            switch (var17_17) {
                                default: lbl-1000:
                                // 2 sources

                                {
                                    var12_12 = var18_18;
                                    var6_6 = -1;
                                    continue block25;
                                }
                                case 0: 
                                case 1: 
                                case 2: 
                                case 3: 
                                case 4: 
                                case 5: 
                                case 6: 
                                case 7: 
                            }
                            if (var19_19 == 0) break block49;
                            do {
                                if ((var6_6 = (int)var10_10.isEmpty()) != 0) ** GOTO lbl-1000
                                var21_21 = (LF3$b)var10_10.pop();
                                LF3.a(var3_3, (LF3$b)var21_21, var11_11, var9_9, var5_5);
                                var19_19 = (int)var10_10.isEmpty();
                                if (var19_19 == 0) {
                                    var12_12 = var9_9.length();
                                    var20_20 /* !! */  = new LF3$a((LF3$b)var21_21, var12_12);
                                    var11_11.add(var20_20 /* !! */ );
                                    continue;
                                }
                                var11_11.clear();
                            } while ((var6_6 = (int)(var21_21 = var21_21.a).equals(var22_22)) == 0);
                            ** GOTO lbl-1000
                        }
                        if (var6_6 != 0) ** GOTO lbl-1000
                        var6_6 = var9_9.length();
                        var20_20 /* !! */  = var13_13.trim();
                        ct3.a((boolean)(var20_20 /* !! */ .isEmpty() ^ var8_8));
                        var12_12 = var20_20 /* !! */ .indexOf(var16_16);
                        var14_14 = -1;
                        if (var12_12 == var14_14) {
                            var24_24 = 0;
                            var16_16 = null;
                        } else {
                            var15_15 = var20_20 /* !! */ .substring(var12_12).trim();
                            var24_24 = 0;
                            var16_16 = null;
                            var20_20 /* !! */  = var20_20 /* !! */ .substring(0, var12_12);
                        }
                        var20_20 /* !! */  = var20_20 /* !! */ .split("\\.", var14_14);
                        var13_13 = var20_20 /* !! */ [0];
                        var22_22 = new HashSet();
                        for (var24_24 = 1; var24_24 < (var17_17 = var20_20 /* !! */ .length); var24_24 += var8_8) {
                            var23_23 = var20_20 /* !! */ [var24_24];
                            var22_22.add(var23_23);
                        }
                        var20_20 /* !! */  = new LF3$b(var13_13, var6_6, var15_15, (Set)var22_22);
                        var10_10.push(var20_20 /* !! */ );
                        ** continue;
                    }
                    var6_6 = var4_4.indexOf(59, var12_12 += var8_8);
                    var25_25 = ' ';
                    var7_7 = var4_4.indexOf(var25_25, var12_12);
                    var8_8 = -1;
                    if (var6_6 == var8_8) {
                        var6_6 = var7_7;
                    } else if (var7_7 != var8_8) {
                        var6_6 = Math.min(var6_6, var7_7);
                    }
                    if (var6_6 == var8_8) break block50;
                    var13_13 = var4_4.substring(var12_12, var6_6);
                    var13_13.getClass();
                    var14_14 = var13_13.hashCode();
                    switch (var14_14) lbl-1000:
                    // 5 sources

                    {
                        default: {
                            var14_14 = -1;
                            break;
                        }
                        case 3374865: {
                            var22_22 = "nbsp";
                            var14_14 = (int)var13_13.equals(var22_22);
                            if (var14_14 == 0) ** GOTO lbl-1000
                            var14_14 = 3;
                            break;
                        }
                        case 96708: {
                            var22_22 = "amp";
                            var14_14 = (int)var13_13.equals(var22_22);
                            if (var14_14 == 0) ** GOTO lbl-1000
                            var14_14 = 2;
                            break;
                        }
                        case 3464: {
                            var22_22 = "lt";
                            var14_14 = (int)var13_13.equals(var22_22);
                            if (var14_14 == 0) ** GOTO lbl-1000
                            var14_14 = 1;
                            break;
                        }
                        case 3309: {
                            var22_22 = "gt";
                            var14_14 = (int)var13_13.equals(var22_22);
                            if (var14_14 == 0) ** GOTO lbl-1000
                            var14_14 = 0;
                            var22_22 = null;
                        }
                    }
                    switch (var14_14) {
                        default: {
                            var26_26 = new StringBuilder("ignoring unsupported entity: '&");
                            var26_26.append(var13_13);
                            var20_20 /* !! */  = ";'";
                            var26_26.append((String)var20_20 /* !! */ );
                            var26_26 = var26_26.toString();
                            Cx.f((String)var26_26);
                            break;
                        }
                        case 3: {
                            var9_9.append(var25_25);
                            break;
                        }
                        case 2: {
                            var9_9.append((char)var19_19);
                            break;
                        }
                        case 1: {
                            var9_9.append((char)var18_18);
                            break;
                        }
                        case 0: {
                            var9_9.append((char)var17_17);
                        }
                    }
                    if (var6_6 == var7_7) {
                        var9_9.append((CharSequence)var16_16);
                    }
                    var18_18 = 1;
                    var12_12 = var6_6 += var18_18;
                    break block47;
                }
                var18_18 = 1;
                var9_9.append((char)var14_14);
            }
            var6_6 = -1;
            var7_7 = 2;
            var8_8 = 1;
        }
        while (!(var27_27 = var10_10.isEmpty())) {
            var4_4 = (LF3$b)var10_10.pop();
            LF3.a(var3_3, (LF3$b)var4_4, var11_11, var9_9, var5_5);
        }
        var26_26 = Collections.emptySet();
        var4_4 = new LF3$b(var15_15, 0, var15_15, (Set)var26_26);
        var26_26 = Collections.emptyList();
        LF3.a(var3_3, (LF3$b)var4_4, var26_26, var9_9, var5_5);
        return SpannedString.valueOf((CharSequence)var9_9);
    }

    public static void g(String string2, LF3$d lF3$d) {
        String string3;
        int n3 = 2;
        int n4 = string2.indexOf(44);
        int n7 = -1;
        int n8 = 1;
        if (n4 != n7) {
            int n10 = n4 + 1;
            String string4 = string2.substring(n10);
            string4.getClass();
            int n14 = string4.hashCode();
            switch (n14) {
                default: {
                    break;
                }
                case 109757538: {
                    String string5 = "start";
                    n14 = string4.equals(string5) ? 1 : 0;
                    if (n14 == 0) break;
                    n7 = 3;
                    break;
                }
                case 100571: {
                    String string6 = "end";
                    n14 = string4.equals(string6) ? 1 : 0;
                    if (n14 == 0) break;
                    n7 = 2;
                    break;
                }
                case -1074341483: {
                    String string7 = "middle";
                    n14 = string4.equals(string7) ? 1 : 0;
                    if (n14 == 0) break;
                    n7 = 1;
                    break;
                }
                case -1364013995: {
                    String string8 = "center";
                    n14 = string4.equals(string8) ? 1 : 0;
                    if (n14 == 0) break;
                    n7 = 0;
                }
            }
            switch (n7) {
                default: {
                    string3 = "Invalid anchor value: ".concat(string4);
                    Cx.f(string3);
                    n3 = -1 << -1;
                    break;
                }
                case 3: {
                    n3 = 0;
                    string3 = null;
                    break;
                }
                case 0: 
                case 1: {
                    n3 = 1;
                }
                case 2: 
            }
            lF3$d.g = n3;
            string2 = string2.substring(0, n4);
        }
        if ((n3 = (int)(string2.endsWith(string3 = "%") ? 1 : 0)) != 0) {
            float f5;
            lF3$d.e = f5 = NF3.a(string2);
            lF3$d.f = 0;
        } else {
            float f6;
            int n15 = Integer.parseInt(string2);
            lF3$d.e = f6 = (float)n15;
            lF3$d.f = n8;
        }
    }
}

