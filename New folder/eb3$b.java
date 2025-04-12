/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class eb3$b {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;

    static {
        String string2 = "\\s*\\d+(?:\\.\\d+)?\\s*";
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        Locale locale = Locale.US;
        b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", objectArray));
        Object[] objectArray2 = new Object[n3];
        objectArray2[0] = string2;
        c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", objectArray2));
        d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String string2) {
        block6: {
            Object object;
            Object object2;
            block5: {
                int n3;
                int n4;
                boolean bl2;
                block4: {
                    object2 = b.matcher(string2);
                    object = c.matcher(string2);
                    boolean bl3 = ((Matcher)object2).find();
                    bl2 = ((Matcher)object).find();
                    n4 = 2;
                    n3 = 1;
                    if (!bl3) break block4;
                    if (bl2) {
                        String string3 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='";
                        object = new StringBuilder(string3);
                        ((StringBuilder)object).append(string2);
                        ((StringBuilder)object).append("'");
                        string2 = ((StringBuilder)object).toString();
                        Cx.e(string2);
                    }
                    string2 = ((Matcher)object2).group(n3);
                    object2 = ((Matcher)object2).group(n4);
                    break block5;
                }
                if (!bl2) break block6;
                string2 = ((Matcher)object).group(n3);
                object2 = ((Matcher)object).group(n4);
            }
            string2.getClass();
            float f5 = Float.parseFloat(string2.trim());
            object2.getClass();
            float f6 = Float.parseFloat(((String)object2).trim());
            object = new PointF(f5, f6);
            return object;
        }
        return null;
    }
}

