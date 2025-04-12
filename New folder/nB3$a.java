/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class nB3$a {
    public static nb3_1 a(String object) {
        boolean n3;
        int n4 = 0;
        if (object != null && !(n3 = b.k((CharSequence)object))) {
            Object object2 = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?");
            object = ((Pattern)object2).matcher((CharSequence)object);
            boolean bl2 = ((Matcher)object).matches();
            if (!bl2) {
                return null;
            }
            int n7 = 1;
            object2 = ((Matcher)object).group(n7);
            if (object2 == null) {
                boolean bl3 = false;
                object2 = null;
            } else {
                int n8 = Integer.parseInt((String)object2);
                object2 = n8;
            }
            if (object2 == null) {
                return null;
            }
            int n10 = (Integer)object2;
            int n14 = 2;
            Object object3 = ((Matcher)object).group(n14);
            if (object3 == null) {
                n14 = 0;
                object3 = null;
            } else {
                n14 = Integer.parseInt((String)object3);
                object3 = n14;
            }
            if (object3 == null) {
                return null;
            }
            n14 = (Integer)object3;
            int n15 = 3;
            Object object4 = ((Matcher)object).group(n15);
            if (object4 == null) {
                n15 = 0;
                object4 = null;
            } else {
                n15 = Integer.parseInt((String)object4);
                object4 = n15;
            }
            if (object4 == null) {
                return null;
            }
            n4 = (Integer)object4;
            n15 = 4;
            String string2 = ((Matcher)object).group(n15);
            object = string2 != null ? ((Matcher)object).group(n15) : "";
            Intrinsics.checkNotNullExpressionValue(object, "description");
            object4 = new nb3_1(n10, n14, n4, (String)object);
            return object4;
        }
        return null;
    }
}

