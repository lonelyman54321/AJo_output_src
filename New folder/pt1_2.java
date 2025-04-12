/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pt1
 */
public final class pt1_2 {
    public final vi_2 a;
    public final String b;

    public pt1_2(vi_2 object, String string2) {
        Intrinsics.checkNotNullParameter(object, "ctPreference");
        Intrinsics.checkNotNullParameter(string2, "accountId");
        this.a = object;
        object = "separator";
        String string3 = ":";
        Intrinsics.checkNotNullParameter(string3, (String)object);
        object = string2 != null ? "inApp:".concat(string2) : "inApp";
        this.b = object;
    }
}

