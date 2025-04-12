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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rs3
 */
public final class rs3_0 {
    public final String a;
    public final mp0_0 b;
    public final WeakReference c;

    public rs3_0(Context context, String weakReference, mp0_0 mp0_02) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(weakReference, "accountId");
        Intrinsics.checkNotNullParameter(mp0_02, "deviceInfo");
        this.a = weakReference;
        this.b = mp0_02;
        this.c = weakReference = new WeakReference<Context>(context);
    }

    public static String b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "campaignId");
        StringBuilder stringBuilder = new StringBuilder("__triggers_");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final int a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "campaignId");
        SharedPreferences sharedPreferences2 = this.c();
        if (sharedPreferences2 == null) {
            return 0;
        }
        string2 = rs3_0.b(string2);
        return sharedPreferences2.getInt(string2, 0);
    }

    public final SharedPreferences c() {
        CharSequence charSequence = new StringBuilder("triggers_per_inapp:");
        String string2 = this.b.f();
        charSequence.append(string2);
        char c2 = ':';
        charSequence.append(c2);
        string2 = this.a;
        charSequence.append(string2);
        charSequence = charSequence.toString();
        string2 = (Context)this.c.get();
        if (string2 == null) {
            return null;
        }
        return gc3_0.f((Context)string2, (String)charSequence);
    }
}

