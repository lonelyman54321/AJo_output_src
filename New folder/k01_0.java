/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

/*
 * Renamed from k01
 */
public final class k01_0 {
    public static void a(String string2, String string3, Bundle bundle, String string4) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        string2 = stringBuilder.toString();
        bundle.putString(string4, string2);
    }
}

