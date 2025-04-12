/*
 * Decompiled with CFR 0.152.
 */
import kotlin.text.Regex;

/*
 * Renamed from OO1
 */
public final class oo1_1 {
    public static String a(String string2, String string3, String string4) {
        Regex regex = new Regex(string2);
        return regex.replace(string3, string4);
    }
}

