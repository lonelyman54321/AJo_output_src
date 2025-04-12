/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;

/*
 * Renamed from WL2$a
 */
public final class wl2$a_0
implements e62_0 {
    public final e62_0 a;

    public wl2$a_0(e62_0 e62_02) {
        this.a = e62_02;
    }

    public final void a(yr0_2 yr0_22) {
        this.a.a(yr0_22);
    }

    public final void b(Object object) {
        if ((object = (dl2_2)object) != null) {
            object = new Object();
            this.a.b(object);
            return;
        }
        object = new NullPointerException("response == null");
        throw object;
    }

    public final void onComplete() {
        this.a.onComplete();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onError(Throwable var1_1) {
        var2_3 = this.a;
        if (var1_1 == null) ** GOTO lbl8
        try {
            var1_1 = new Object();
            var2_3.b(var1_1);
            var2_3.onComplete();
            return;
lbl8:
            // 1 sources

            var3_5 = "error == null";
            var1_1 = new NullPointerException(var3_5);
            throw var1_1;
        }
        catch (Throwable var1_2) {}
        try {
            var2_3.onError(var1_2);
            return;
        }
        catch (Throwable var2_4) {
            mm0.h(var2_4);
            var4_7 = 2;
            var5_8 = new Throwable[var4_7];
            var5_8[0] = var1_2;
            var6_9 = 1;
            var5_8[var6_9] = var2_4;
            var3_6 = new CompositeException(var5_8);
            dr2_2.b(var3_6);
        }
    }
}

