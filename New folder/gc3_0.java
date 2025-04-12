/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;

/*
 * Renamed from Gc3
 */
public final class gc3_0 {
    public static boolean a(Context context, CleverTapInstanceConfig object, String string2) {
        boolean bl2 = ((CleverTapInstanceConfig)object).p;
        if (bl2) {
            object = gc3_0.l((CleverTapInstanceConfig)object, string2);
            SharedPreferences sharedPreferences2 = gc3_0.e(context);
            boolean bl3 = sharedPreferences2.getBoolean((String)object, false);
            if (!bl3) {
                object = "WizRocket";
                context = context.getSharedPreferences((String)object, 0);
                bl3 = context.getBoolean(string2, false);
            }
            return bl3;
        }
        object = gc3_0.l((CleverTapInstanceConfig)object, string2);
        return gc3_0.e(context).getBoolean((String)object, false);
    }

    public static int b(Context context, int n3, String string2) {
        return gc3_0.e(context).getInt(string2, n3);
    }

    public static int c(Context context, CleverTapInstanceConfig object, String string2) {
        int n3 = ((CleverTapInstanceConfig)object).p;
        if (n3 != 0) {
            n3 = -1000;
            int n4 = gc3_0.b(context, n3, (String)(object = gc3_0.l((CleverTapInstanceConfig)object, string2)));
            if (n4 == n3) {
                object = "WizRocket";
                context = context.getSharedPreferences((String)object, 0);
                n4 = context.getInt(string2, 0);
            }
            return n4;
        }
        object = gc3_0.l((CleverTapInstanceConfig)object, string2);
        return gc3_0.b(context, 0, (String)object);
    }

    public static long d(Context context, CleverTapInstanceConfig object, String string2) {
        boolean bl2 = ((CleverTapInstanceConfig)object).p;
        String string3 = "IJ";
        if (bl2) {
            long l2;
            object = gc3_0.l((CleverTapInstanceConfig)object, string2);
            SharedPreferences sharedPreferences2 = gc3_0.f(context, string3);
            long l3 = sharedPreferences2.getLong((String)object, l2 = -1000L);
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                long l7 = 0;
                context = gc3_0.f(context, string3);
                l3 = context.getLong(string2, l7);
            }
            return l3;
        }
        object = gc3_0.l((CleverTapInstanceConfig)object, string2);
        long l8 = 0;
        return gc3_0.f(context, string3).getLong((String)object, l8);
    }

    public static SharedPreferences e(Context context) {
        return context.getSharedPreferences("WizRocket", 0);
    }

    public static SharedPreferences f(Context context, String string2) {
        if (string2 != null) {
            String string3 = "WizRocket_";
            string2 = string3.concat(string2);
        } else {
            string2 = "WizRocket";
        }
        return context.getSharedPreferences(string2, 0);
    }

    public static String g(Context context, String string2, String string3) {
        return gc3_0.e(context).getString(string2, string3);
    }

    public static String h(Context context, CleverTapInstanceConfig object, String string2, String string3) {
        boolean bl2 = ((CleverTapInstanceConfig)object).p;
        if (bl2) {
            object = gc3_0.l((CleverTapInstanceConfig)object, string2);
            if ((object = gc3_0.g(context, (String)object, string3)) == null) {
                String string4 = "WizRocket";
                context = context.getSharedPreferences(string4, 0);
                object = context.getString(string2, string3);
            }
            return object;
        }
        object = gc3_0.l((CleverTapInstanceConfig)object, string2);
        return gc3_0.g(context, (String)object, string3);
    }

    public static void i(SharedPreferences.Editor editor) {
        try {
            editor.apply();
        }
        catch (Throwable throwable) {
            b.l();
        }
    }

    public static void j(Context context, int n3, String string2) {
        gc3_0.i(gc3_0.e(context).edit().putInt(string2, n3));
    }

    public static void k(Context context, String string2, String string3) {
        gc3_0.i(gc3_0.e(context).edit().putString(string2, string3));
    }

    public static String l(CleverTapInstanceConfig object, String charSequence) {
        charSequence = nn_2.a((String)charSequence, ":");
        object = ((CleverTapInstanceConfig)object).a;
        ((StringBuilder)charSequence).append((String)object);
        return ((StringBuilder)charSequence).toString();
    }
}

