/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DM
 */
public final class dm_1 {
    public static Bundle a(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string4, string5);
        string2 = new Bundle();
        return string2;
    }

    public static void b(String string2, String string3, StringBuilder stringBuilder, boolean bl2, boolean bl3) {
        stringBuilder.append(string2);
        stringBuilder.append(bl2);
        stringBuilder.append(string3);
        stringBuilder.append(bl3);
    }
}

