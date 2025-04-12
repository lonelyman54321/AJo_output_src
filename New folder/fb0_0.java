/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/*
 * Renamed from fB0
 */
public final class fb0_0
implements FilenameFilter {
    public final boolean accept(File object, String string2) {
        int n3 = 1;
        Intrinsics.checkNotNullExpressionValue(string2, "name");
        Object[] objectArray = StringCompanionObject.INSTANCE;
        objectArray = new Object[n3];
        objectArray[0] = "error_log_";
        object = xh2_0.a(objectArray, n3, "^%s[0-9]+.json$", "format(format, *args)");
        Regex regex = new Regex((String)object);
        return regex.c(string2);
    }
}

