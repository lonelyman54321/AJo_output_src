/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from RH2
 */
public final class rh2_0 {
    public static String a(String string2) {
        if (string2 != null) {
            int n3 = string2.length();
            int n4 = 1;
            n3 -= n4;
            int n7 = 0;
            boolean bl2 = false;
            while (n7 <= n3) {
                int n8 = !bl2 ? n7 : n3;
                n8 = string2.charAt(n8);
                int n10 = 32;
                n8 = Intrinsics.compare(n8, n10);
                n8 = n8 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n8 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n7;
                    continue;
                }
                if (n8 == 0) break;
                n3 += -1;
            }
            n3 += n4;
            String string3 = ((Object)string2.subSequence(n7, n3)).toString();
            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0)) == 0 && (n3 = (int)(b.s(string2, string3 = "-", false) ? 1 : 0)) != 0) {
                string2 = string2.substring(n4);
                string3 = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(string2, string3);
            }
        }
        return string2;
    }
}

