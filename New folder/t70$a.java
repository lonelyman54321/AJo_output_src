/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class t70$a {
    public static int a(Context context, int n3) {
        return context.getColor(n3);
    }

    public static Object b(Context context, Class clazz) {
        return context.getSystemService(clazz);
    }

    public static String c(Context context, Class clazz) {
        return context.getSystemServiceName(clazz);
    }
}

