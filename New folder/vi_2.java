/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vI
 */
public final class vi_2 {
    public String a;
    public final WeakReference b;

    public vi_2(Context context, String weakReference) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = weakReference;
        this.b = weakReference = new WeakReference<Context>(context);
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "prefName");
        this.a = string2;
    }

    public final Map b() {
        SharedPreferences sharedPreferences2 = this.f();
        if (sharedPreferences2 == null) {
            return fh1_2.f();
        }
        return sharedPreferences2.getAll();
    }

    public final long c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        SharedPreferences sharedPreferences2 = this.f();
        long l2 = 0L;
        if (sharedPreferences2 == null) {
            return l2;
        }
        return sharedPreferences2.getLong(string2, l2);
    }

    public final String d(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "default");
        SharedPreferences sharedPreferences2 = this.f();
        if (sharedPreferences2 == null) {
            return string3;
        }
        return sharedPreferences2.getString(string2, string3);
    }

    public final void e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        SharedPreferences sharedPreferences2 = this.f();
        if (sharedPreferences2 == null) {
            return;
        }
        sharedPreferences2.edit().remove(string2).apply();
    }

    public final SharedPreferences f() {
        Context context = (Context)this.b.get();
        if (context == null) {
            return null;
        }
        String string2 = this.a;
        return context.getSharedPreferences(string2, 0);
    }

    public final void g(long l2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        SharedPreferences sharedPreferences2 = this.f();
        if (sharedPreferences2 == null) {
            return;
        }
        sharedPreferences2.edit().putLong(string2, l2).apply();
    }

    public final void h(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        SharedPreferences sharedPreferences2 = this.f();
        if (sharedPreferences2 == null) {
            return;
        }
        sharedPreferences2.edit().putString(string2, string3).apply();
    }
}

