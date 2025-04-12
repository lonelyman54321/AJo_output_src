/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;

/*
 * Renamed from fo
 */
public final class fo_0
implements kJ0$a {
    public static void a(int n3, int n4, int n7, int n8, int n10) {
        to1_0.a(n3);
        to1_0.a(n4);
        to1_0.a(n7);
        to1_0.a(n8);
        to1_0.a(n10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean var1_1) {
        if (var1_1 == false) return;
        var2_2 = co1_2.a;
        var2_2 = co1_2.class;
        var3_3 = td0.b(var2_2);
        if (var3_3) {
            return;
        }
        try {
            var4_4 = FacebookSdk.d();
            var5_7 = new Object();
            var4_4.execute(var5_7);
            return;
        }
        catch (Exception v0) {
            var4_6 = lz3_0.a;
            var2_2 = FacebookSdk.a;
        }
        ** finally { 
lbl16:
        // 1 sources

        td0.a(var2_2, var4_5);
    }
}

