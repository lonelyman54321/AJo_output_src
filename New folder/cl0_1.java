/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from CL0
 */
public final class cl0_1
implements FilenameFilter {
    public final boolean accept(File file, String string2) {
        Intrinsics.checkNotNullExpressionValue(string2, "filename");
        return b.s(string2, "buffer", false);
    }
}

