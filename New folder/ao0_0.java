/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aO0
 */
public final class ao0_0
extends cw {
    public static final ao0$a_0 Companion;
    public static ao0_0 e;
    public final SharedPreferences d;

    static {
        ao0$a_0 ao0$a_0;
        Companion = ao0$a_0 = new Object();
    }

    public ao0_0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        e = this;
        context = context.getSharedPreferences("debug_configs", 0);
        this.d = context;
    }

    public final boolean a(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = this.c().getBoolean(string2);
        String string4 = String.valueOf(bl2);
        string4 = this.i(string2, string4);
        try {
            return Boolean.parseBoolean(string4);
        }
        catch (Exception exception) {
            yn3_0.a.e(exception);
            Intrinsics.checkNotNullParameter(string2, string3);
            return this.c().getBoolean(string2);
        }
    }

    public final String b(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        string3 = this.c().getString(string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return String.valueOf(this.i(string2, string3));
    }

    public final double f(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        double d2 = this.c().getDouble(string2);
        String string4 = String.valueOf(d2);
        string4 = this.i(string2, string4);
        try {
            Intrinsics.checkNotNull(string4);
            return Double.parseDouble(string4);
        }
        catch (Exception exception) {
            yn3_0.a.e(exception);
            Intrinsics.checkNotNullParameter(string2, string3);
            return this.c().getDouble(string2);
        }
    }

    public final int g(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        long l2 = this.c().getLong(string2);
        int n3 = (int)l2;
        String string4 = String.valueOf(n3);
        string4 = this.i(string2, string4);
        try {
            Intrinsics.checkNotNull(string4);
            return Integer.parseInt(string4);
        }
        catch (Exception exception) {
            yn3_0.a.e(exception);
            Intrinsics.checkNotNullParameter(string2, string3);
            return (int)this.c().getLong(string2);
        }
    }

    public final long h(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        long l2 = this.c().getLong(string2);
        String string4 = String.valueOf(l2);
        string4 = this.i(string2, string4);
        try {
            Intrinsics.checkNotNull(string4);
            return Long.parseLong(string4);
        }
        catch (Exception exception) {
            yn3_0.a.e(exception);
            Intrinsics.checkNotNullParameter(string2, string3);
            return this.c().getLong(string2);
        }
    }

    public final String i(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "defaultValue");
        return this.d.getString(string2, string3);
    }
}

