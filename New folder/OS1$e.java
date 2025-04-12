/*
 * Decompiled with CFR 0.152.
 */
import java.util.TreeSet;

public abstract class OS1$e {
    public TreeSet a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean var1_1) {
        synchronized (this) {
            block7: {
                if (var1_1) ** GOTO lbl9
                var2_2 = this.a;
                if (var2_2 == null || (var1_1 = var2_2.isEmpty())) ** GOTO lbl9
                ** GOTO lbl20
                {
                    catch (Throwable var2_3) {
                        break block7;
                    }
lbl9:
                    // 2 sources

                    var2_2 = os1_1.a;
                    var3_5 = os1_1.class;
                    var4_6 = td0.b(var3_5);
                    var5_7 = null;
                    if (var4_6) ** GOTO lbl19
                    try {
                        var5_7 = var2_2.g(this);
                        ** GOTO lbl19
                    }
                    catch (Throwable var2_4) {}
                    {
                        td0.a(var3_5, var2_4);
lbl19:
                        // 3 sources

                        this.a = var5_7;
lbl20:
                        // 2 sources

                        var2_2 = this.a;
                        if (var2_2 == null || (var1_1 = var2_2.isEmpty())) {
                            this.e();
                        }
                        return;
                    }
                }
            }
            throw var2_3;
        }
    }

    public abstract String b();

    public abstract String c();

    public String d() {
        return "id_token,token,signed_request,graph_domain";
    }

    public void e() {
    }
}

