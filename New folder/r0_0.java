/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 */
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager$m;
import androidx.lifecycle.i$b;
import java.util.Objects;

/*
 * Renamed from R0
 */
public final class r0_0 {
    public static final byte a(char c2) {
        char c3 = '~';
        if (c2 < c3) {
            byte[] byArray = hs_2.b;
            c2 = byArray[c2];
        } else {
            c2 = '\u0000';
        }
        return (byte)c2;
    }

    public static final void b(AutoCloseable autoCloseable, Throwable throwable) {
        if (autoCloseable != null) {
            if (throwable == null) {
                autoCloseable.close();
            } else {
                try {
                    autoCloseable.close();
                }
                catch (Throwable throwable2) {
                    yc0_2.a(throwable, throwable2);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void c(Bundle var0, Fragment var1_1, String var2_2) {
        var1_1 = var1_1.getParentFragmentManager();
        var3_3 = (FragmentManager$m)var1_1.n.get(var2_2);
        if (var3_3 == null) ** GOTO lbl-1000
        var4_4 = i$b.STARTED;
        var5_5 = var3_3.a.b();
        var6_6 = var5_5.isAtLeast(var4_4);
        if (var6_6) {
            var3_3.a(var0, var2_2);
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = var1_1.m;
            var1_1.put(var2_2, var0);
        }
        var1_1 = "FragmentManager";
        var7_7 = 2;
        var8_8 = Log.isLoggable((String)var1_1, (int)var7_7);
        if (var8_8) {
            Objects.toString(var0);
        }
    }

    public static final String d(byte n3) {
        int n4 = 1;
        String string2 = n3 == n4 ? "quotation mark '\"'" : (n3 == (n4 = 2) ? "string escape sequence '\\'" : (n3 == (n4 = 4) ? "comma ','" : (n3 == (n4 = 5) ? "colon ':'" : (n3 == (n4 = 6) ? "start of the object '{'" : (n3 == (n4 = 7) ? "end of the object '}'" : (n3 == (n4 = 8) ? "start of the array '['" : (n3 == (n4 = 9) ? "end of the array ']'" : (n3 == (n4 = 10) ? "end of the input" : (n3 == (n4 = 127) ? "invalid token" : "valid token")))))))));
        return string2;
    }
}

