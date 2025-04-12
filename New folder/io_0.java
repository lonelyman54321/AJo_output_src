/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import com.facebook.FacebookSdk;
import org.json.JSONArray;

/*
 * Renamed from io
 */
public final class io_0
implements kJ0$a {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean var1_1) {
        if (var1_1 == false) return;
        var2_2 = oy_2.a;
        var2_2 = oy_2.class;
        var3_3 = td0.b(var2_2);
        if (var3_3) {
            return;
        }
        var4_4 = oy_2.a;
        var4_4.getClass();
        var5_6 = td0.b(var4_4);
        if (!var5_6) ** GOTO lbl17
        ** GOTO lbl28
        {
            catch (Throwable var4_5) {
                td0.a(var2_2, var4_5);
                return;
            }
lbl17:
            // 1 sources

            try {
                var6_7 = FacebookSdk.b();
                var6_7 = dl0_2.k((String)var6_7, false);
                if (var6_7 != null) {
                    var6_7 = var6_7.s;
                    if ((var6_7 = lz3_0.g((JSONArray)var6_7)) != null) {
                        oy_2.c = var6_7;
                    }
                }
                ** GOTO lbl28
            }
            catch (Throwable var6_8) {}
            {
                td0.a(var4_4, var6_8);
lbl28:
                // 3 sources

                var4_4 = oy_2.c;
                if (var4_4 == null) return;
                var3_3 = var4_4.isEmpty();
                if (var3_3) {
                    return;
                }
                oy_2.b = var3_3 = true;
                return;
            }
        }
    }
}

