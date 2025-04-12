/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/*
 * Renamed from Gi1
 */
public final class gi1_0
implements FilenameFilter {
    public final boolean accept(File object, String string2) {
        int n3 = 1;
        Intrinsics.checkNotNullExpressionValue(string2, "name");
        Object object2 = StringCompanionObject.INSTANCE;
        object2 = new Object[n3];
        object2[0] = "anr_log_";
        object = xh2_0.a((Object[])object2, n3, "^%s[0-9]+.json$", "format(format, *args)");
        object2 = new Regex((String)object);
        return ((Regex)object2).c(string2);
    }
}

