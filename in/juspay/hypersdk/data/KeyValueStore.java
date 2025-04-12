/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package in.juspay.hypersdk.data;

import android.content.Context;
import in.juspay.hypersdk.core.JuspayServices;
import java.util.Map;

public final class KeyValueStore {
    private KeyValueStore() {
    }

    public static boolean contains(Context context, String string2, String string3) {
        return context.getSharedPreferences(string2, 0).contains(string3);
    }

    public static boolean contains(JuspayServices object, String string2) {
        Context context = ((JuspayServices)object).getContext();
        object = ((JuspayServices)object).getSdkInfo().getSdkName();
        return KeyValueStore.contains(context, (String)object, string2);
    }

    public static Map getAll(Context context, String string2) {
        return context.getSharedPreferences(string2, 0).getAll();
    }

    public static Map getAll(JuspayServices object) {
        Context context = ((JuspayServices)object).getContext();
        object = ((JuspayServices)object).getSdkInfo().getSdkName();
        return KeyValueStore.getAll(context, (String)object);
    }

    public static String read(Context context, String string2, String string3, String string4) {
        return context.getSharedPreferences(string2, 0).getString(string3, string4);
    }

    public static String read(JuspayServices object, String string2, String string3) {
        Context context = ((JuspayServices)object).getContext();
        object = ((JuspayServices)object).getSdkInfo().getSdkName();
        return KeyValueStore.read(context, (String)object, string2, string3);
    }

    public static void remove(Context context, String string2, String string3) {
        KeyValueStore.remove(context, string2, string3, false);
    }

    public static void remove(Context context, String string2, String string3, boolean bl2) {
        boolean bl3 = KeyValueStore.contains(context, string2, string3);
        if (bl3) {
            bl3 = false;
            context = context.getSharedPreferences(string2, 0).edit();
            context.remove(string3);
            if (bl2) {
                context.commit();
            } else {
                context.apply();
            }
        }
    }

    public static void remove(JuspayServices object, String string2) {
        Context context = ((JuspayServices)object).getContext();
        object = ((JuspayServices)object).getSdkInfo().getSdkName();
        KeyValueStore.remove(context, (String)object, string2);
    }

    public static void write(Context context, String string2, String string3, String string4) {
        KeyValueStore.write(context, string2, string3, string4, false);
    }

    public static void write(Context context, String string2, String string3, String string4, boolean bl2) {
        context = context.getSharedPreferences(string2, 0).edit();
        context.putString(string3, string4);
        if (bl2) {
            context.commit();
        } else {
            context.apply();
        }
    }

    public static void write(JuspayServices object, String string2, String string3) {
        Context context = ((JuspayServices)object).getContext();
        object = ((JuspayServices)object).getSdkInfo().getSdkName();
        KeyValueStore.write(context, (String)object, string2, string3);
    }
}

