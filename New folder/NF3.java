/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public final class NF3 {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String object) {
        String string2 = "%";
        boolean n3 = ((String)object).endsWith(string2);
        if (n3) {
            int n4 = ((String)object).length() + -1;
            return Float.parseFloat(((String)object).substring(0, n4)) / 100.0f;
        }
        object = new NumberFormatException("Percentages must end with %");
        throw object;
    }

    public static long b(String object) {
        int n3 = 1;
        int n4 = gz3.a;
        int n7 = 2;
        object = object.split("\\.", n7);
        String[] stringArray = object[0];
        String string2 = ":";
        stringArray = stringArray.split(string2, -1);
        int n8 = stringArray.length;
        long l2 = 0L;
        for (n4 = 0; n4 < n8; n4 += n3) {
            String string3 = stringArray[n4];
            long l3 = 60;
            l2 *= l3;
            long l4 = Long.parseLong(string3);
            l2 += l4;
        }
        long l7 = 1000L;
        l2 *= l7;
        n4 = ((String[])object).length;
        if (n4 == n7) {
            object = object[n3];
            long l8 = Long.parseLong((String)object);
            l2 += l8;
        }
        return l2 * l7;
    }

    public static void c(Xm2 object) {
        String string2;
        boolean bl2;
        int n3 = ((Xm2)object).b;
        Charset charset = StandardCharsets.UTF_8;
        String string3 = ((Xm2)object).j(charset);
        if (string3 != null && (bl2 = string3.startsWith(string2 = "WEBVTT"))) {
            return;
        }
        ((Xm2)object).I(n3);
        StringBuilder stringBuilder = new StringBuilder("Expected WEBVTT. Got ");
        object = ((Xm2)object).j(charset);
        stringBuilder.append((String)object);
        throw ParserException.a(stringBuilder.toString(), null);
    }
}

