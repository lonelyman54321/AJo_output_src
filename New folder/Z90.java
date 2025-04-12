/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;

public final class Z90 {
    public static Object a(Class clazz, String string2) {
        Gson gson = new Gson();
        return gson.fromJson(string2, clazz);
    }
}

