/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import com.facebook.FacebookSdk;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/*
 * Renamed from MP1
 */
public final class mp1_1
implements kJ0$a {
    public static boolean a(LP1$b lP1$b, Function1 function1) {
        return (Boolean)function1.invoke(lP1$b);
    }

    public static boolean c(LP1$b lP1$b, Function1 function1) {
        return (Boolean)function1.invoke(lP1$b);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean var1_1) {
        block9: {
            if (var1_1 == false) return;
            var2_2 = bc3_1.a;
            var2_2 = bc3_1.class;
            var3_3 = td0.b(var2_2);
            if (var3_3) {
                return;
            }
            var3_3 = bc3_1.b;
            if (var3_3) {
                return;
            }
            var4_4 = bc3_1.a;
            var4_4.getClass();
            var5_6 = td0.b(var4_4);
            var6_7 = false;
            if (!var5_6) ** GOTO lbl20
            ** GOTO lbl29
            {
                block10: {
                    catch (Throwable var4_5) {
                        break block9;
                    }
lbl20:
                    // 1 sources

                    try {
                        var7_8 = FacebookSdk.b();
                        var7_8 = dl0_2.k((String)var7_8, false);
                        if (var7_8 != null) {
                            var7_8 = var7_8.v;
                            var4_4.a((JSONArray)var7_8);
                        }
                        break block10;
                    }
                    catch (Throwable var7_9) {}
                    td0.a(var4_4, var7_9);
                }
                var4_4 = bc3_1.c;
                var3_3 = var4_4.isEmpty();
                if (!var3_3 || !(var3_3 = (var4_4 = bc3_1.d).isEmpty())) {
                    var6_7 = true;
                }
                bc3_1.b = var6_7;
                return;
            }
        }
        td0.a(var2_2, var4_5);
    }
}

