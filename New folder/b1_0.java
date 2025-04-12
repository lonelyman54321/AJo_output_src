/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.GraphRequest$b;
import com.facebook.f;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from B1
 */
public final class b1_0
implements GraphRequest$b {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Set d;

    public /* synthetic */ b1_0(AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        this.a = atomicBoolean;
        this.b = hashSet;
        this.c = hashSet2;
        this.d = hashSet3;
    }

    public final void b(f f5) {
        AtomicBoolean atomicBoolean = this.a;
        Intrinsics.checkNotNullParameter(atomicBoolean, "$permissionsCallSucceeded");
        Set set = this.b;
        Intrinsics.checkNotNullParameter(set, "$permissions");
        Set set2 = this.c;
        Intrinsics.checkNotNullParameter(set2, "$declinedPermissions");
        Set set3 = this.d;
        Intrinsics.checkNotNullParameter(set3, "$expiredPermissions");
        String string2 = "response";
        Intrinsics.checkNotNullParameter(f5, string2);
        f5 = f5.d;
        if (f5 != null && (f5 = f5.optJSONArray(string2 = "data")) != null) {
            atomicBoolean.set(true);
            int n3 = f5.length();
            atomicBoolean = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2;
                Object object = f5.optJSONObject(i3);
                if (object == null) continue;
                String string3 = object.optString("permission");
                String string4 = "status";
                object = object.optString(string4);
                int n4 = lz3_0.A(string3);
                if (n4 != 0 || (n4 = lz3_0.A((String)object)) != 0) continue;
                Intrinsics.checkNotNullExpressionValue(object, string4);
                Locale locale = Locale.US;
                String string5 = "US";
                String string6 = "this as java.lang.String).toLowerCase(locale)";
                object = zn0_1.a(locale, string5, (String)object, locale, string6);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                int n7 = ((String)object).hashCode();
                n4 = -1309235419;
                if (n7 != n4) {
                    n4 = 280295099;
                    if (n7 != n4) {
                        n4 = 568196142;
                        if (n7 != n4 || !(bl2 = ((String)object).equals(string4 = "declined"))) continue;
                        set2.add(string3);
                        continue;
                    }
                    string4 = "granted";
                    bl2 = ((String)object).equals(string4);
                    if (!bl2) continue;
                    set.add(string3);
                    continue;
                }
                string4 = "expired";
                bl2 = ((String)object).equals(string4);
                if (!bl2) continue;
                set3.add(string3);
            }
        }
    }
}

