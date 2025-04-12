/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sw
 */
public abstract class sw_0 {
    private Gson gson;
    private final SharedPreferences preferences;

    public sw_0(String string2, Context context) {
        Intrinsics.checkNotNullParameter(string2, "prefName");
        Intrinsics.checkNotNullParameter(context, "context");
        string2 = context.getSharedPreferences(string2, 0);
        Intrinsics.checkNotNullExpressionValue(string2, "getSharedPreferences(...)");
        this.preferences = string2;
    }

    private final Gson getGson() {
        Gson gson = this.gson;
        if (gson == null) {
            this.gson = gson = new Gson();
        }
        gson = this.gson;
        Intrinsics.checkNotNull(gson, "null cannot be cast to non-null type com.google.gson.Gson");
        return gson;
    }

    public final void clear() {
        boolean bl2;
        SharedPreferences.Editor editor = this.preferences.edit();
        Iterator iterator = this.preferences.getAll().keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            editor.remove(string2);
        }
        editor.apply();
    }

    public final float getPreference(String string2, float f5) {
        Intrinsics.checkNotNullParameter(string2, "key");
        return this.preferences.getFloat(string2, f5);
    }

    public final int getPreference(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        return this.preferences.getInt(string2, n3);
    }

    public final long getPreference(String string2, long l2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        return this.preferences.getLong(string2, l2);
    }

    public final Object getPreference(String string2, Class clazz) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Object object = this.preferences;
        Object object2 = null;
        string2 = object.getString(string2, null);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            object = this.getGson();
            object2 = ((Gson)object).fromJson(string2, (Type)clazz);
        }
        return object2;
    }

    public final String getPreference(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "defaultVal");
        return this.preferences.getString(string2, string3);
    }

    public final boolean getPreference(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        return this.preferences.getBoolean(string2, bl2);
    }

    public final SharedPreferences getPreferences() {
        return this.preferences;
    }

    public final void putPreference(String string2, float f5) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.preferences.edit().putFloat(string2, f5).apply();
    }

    public final void putPreference(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.preferences.edit().putInt(string2, n3).apply();
    }

    public final void putPreference(String string2, long l2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.preferences.edit().putLong(string2, l2).apply();
    }

    public final void putPreference(String string2, Object object) {
        Intrinsics.checkNotNullParameter(string2, "key");
        SharedPreferences.Editor editor = this.preferences.edit();
        object = this.getGson().toJson(object);
        editor.putString(string2, (String)object).apply();
    }

    public final void putPreference(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.preferences.edit().putString(string2, string3).apply();
    }

    public final void putPreference(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.preferences.edit().putBoolean(string2, bl2).apply();
    }

    public final void removePreference(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.preferences.edit().remove(string2).apply();
    }
}

