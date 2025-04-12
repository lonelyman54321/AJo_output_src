/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from c53
 */
public final class c53_0
extends kJ {
    public static final Pattern g;
    public static final Pattern h;
    public static final Pattern i;

    static {
        int n3 = 32;
        g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", n3);
        h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", n3);
        i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static c53_0 b(File file, long l2, long l3, oJ oJ2) {
        long l4;
        Object object;
        long l7;
        long l8;
        Object object2;
        Object object3;
        int n3;
        int n4;
        int n7;
        int n8;
        Object object4;
        Object object5;
        Object object6;
        block14: {
            block10: {
                int n10;
                block12: {
                    block13: {
                        int n14;
                        block11: {
                            char c2;
                            int n15;
                            object6 = oJ2;
                            object5 = file.getName();
                            object4 = ".v3.exo";
                            n8 = ((String)object5).endsWith((String)object4);
                            n7 = 3;
                            n4 = 2;
                            n3 = 1;
                            if (n8 != 0) break block10;
                            object5 = file.getName();
                            object4 = h.matcher((CharSequence)object5);
                            int n16 = ((Matcher)object4).matches();
                            if (n16 == 0) break block11;
                            object5 = ((Matcher)object4).group(n3);
                            object5.getClass();
                            n16 = gz3.a;
                            n16 = ((String)object5).length();
                            n10 = 0;
                            object3 = null;
                            int n17 = 0;
                            for (n15 = 0; n15 < n16; n15 += n3) {
                                char c3;
                                char c5 = ((String)object5).charAt(n15);
                                if (c5 != (c3 = '%')) continue;
                                n17 += n3;
                            }
                            if (n17 == 0) break block12;
                            n15 = n17 * 2;
                            n15 = n16 - n15;
                            StringBuilder stringBuilder = new StringBuilder(n15);
                            Matcher matcher = gz3.h.matcher((CharSequence)object5);
                            while (n17 > 0 && (c2 = matcher.find()) != '\u0000') {
                                String string2 = matcher.group(n3);
                                string2.getClass();
                                c2 = (char)Integer.parseInt(string2, 16);
                                int n18 = matcher.start();
                                stringBuilder.append((CharSequence)object5, n10, n18);
                                stringBuilder.append(c2);
                                n10 = matcher.end();
                                n17 += -1;
                            }
                            if (n10 < n16) {
                                stringBuilder.append((CharSequence)object5, n10, n16);
                            }
                            if ((n14 = stringBuilder.length()) != n15) break block13;
                            object5 = stringBuilder.toString();
                            break block12;
                        }
                        object4 = g.matcher((CharSequence)object5);
                        n14 = ((Matcher)object4).matches();
                        if (n14 == 0) return null;
                        object5 = ((Matcher)object4).group(n3);
                        object5.getClass();
                        break block12;
                    }
                    return null;
                }
                if (object5 == null) return null;
                object2 = file.getParentFile();
                ct3.h(object2);
                object5 = ((oJ)object6).d((String)object5);
                object3 = ((Matcher)object4).group(n4);
                object3.getClass();
                l8 = Long.parseLong((String)object3);
                object4 = ((Matcher)object4).group(n7);
                object4.getClass();
                l7 = Long.parseLong((String)object4);
                n10 = ((nJ)object5).a;
                object5 = c53_0.c((File)object2, n10, l8, l7);
                object4 = file;
                n8 = (int)(file.renameTo((File)object5) ? 1 : 0);
                if (n8 == 0) {
                    return null;
                }
                if (object5 == null) {
                    return null;
                }
                object4 = ((File)object5).getName();
                object = object5;
                object5 = object4;
                break block14;
            }
            object4 = file;
            object = file;
        }
        object4 = i;
        object5 = ((Pattern)object4).matcher((CharSequence)object5);
        n8 = ((Matcher)object5).matches();
        if (n8 == 0) {
            return null;
        }
        object4 = ((Matcher)object5).group(n3);
        object4.getClass();
        n8 = Integer.parseInt((String)object4);
        object3 = object6 = ((oJ)object6).b.get(n8);
        object3 = (String)object6;
        if (object3 == null) {
            return null;
        }
        l8 = -1;
        long l12 = l2 - l8;
        Object object7 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        l7 = object7 == false ? (l8 = ((File)object).length()) : l2;
        long l14 = l7 - (l8 = 0L);
        Object object8 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object8 == false) {
            return null;
        }
        object6 = ((Matcher)object5).group(n4);
        object6.getClass();
        l8 = Long.parseLong((String)object6);
        long l15 = -9223372036854775807L;
        long l16 = l3 == l15 ? 0 : (l3 < l15 ? -1 : 1);
        if (l16 == false) {
            long l17;
            object6 = ((Matcher)object5).group(n7);
            object6.getClass();
            l4 = l17 = Long.parseLong((String)object6);
        } else {
            l4 = l3;
        }
        object2 = object6;
        return new kJ((String)object3, l8, l7, l4, (File)object);
    }

    public static File c(File file, int n3, long l2, long l3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        String string2 = ".";
        stringBuilder.append(string2);
        stringBuilder.append(l2);
        stringBuilder.append(string2);
        string2 = jl0_0.b(stringBuilder, l3, ".v3.exo");
        File file2 = new File(file, string2);
        return file2;
    }
}

