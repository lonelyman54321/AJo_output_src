/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import androidx.navigation.d;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class ro
implements kJ0$a {
    public static void a(int n3, HashMap hashMap, String string2, int n4, String string3) {
        Integer n7 = n3;
        hashMap.put(string2, n7);
        n7 = n4;
        hashMap.put(string3, n7);
    }

    public static void c(Number number, ek_1 ek_12, String string2, d d2, String string3) {
        number.intValue();
        Intrinsics.checkNotNullParameter(ek_12, string2);
        Intrinsics.checkNotNullParameter(d2, string3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean var1_1) {
        if (var1_1 == false) return;
        var2_2 = sv_1.a;
        var2_2 = sv_1.class;
        var3_3 = td0.b(var2_2);
        if (var3_3) {
            return;
        }
        var3_3 = sv_1.b;
        if (var3_3) {
            return;
        }
        var4_4 = sv_1.a;
        var4_4.getClass();
        var5_6 = td0.b(var4_4);
        if (!var5_6) ** GOTO lbl21
        ** GOTO lbl49
        {
            block14: {
                catch (Throwable var4_5) {
                    td0.a(var2_2, var4_5);
                    return;
                }
lbl21:
                // 2 sources

                var6_7 = FacebookSdk.b();
                var7_10 = false;
                var6_7 = dl0_2.k((String)var6_7, false);
                if (var6_7 == null) ** GOTO lbl49
                var6_7 = var6_7.w;
                var7_10 = td0.b(var4_4);
                var8_11 = null;
                if (var7_10) ** GOTO lbl45
                var6_7 = lz3_0.g((JSONArray)var6_7);
                if (var6_7 != null) ** GOTO lbl36
                var6_7 = new HashSet<E>();
                ** GOTO lbl36
                {
                    catch (Throwable var6_8) {
                        break block14;
                    }
lbl36:
                    // 3 sources

                    while (true) {
                        var8_11 = var6_7;
                        ** GOTO lbl45
                        break;
                    }
                    catch (Exception v0) {}
                    {
                        var6_7 = new HashSet<E>();
                        ** continue;
                    }
                }
            }
            try {
                td0.a(var4_4, var6_8);
lbl45:
                // 3 sources

                sv_1.c = var8_11;
                ** GOTO lbl49
            }
            catch (Throwable var6_9) {}
            {
                td0.a(var4_4, var6_9);
lbl49:
                // 4 sources

                var4_4 = sv_1.c;
                var3_3 = var4_4.isEmpty() ^ true;
            }
        }
        {
            sv_1.b = var3_3;
            return;
        }
    }
}

