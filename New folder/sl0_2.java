/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/*
 * Renamed from sl0
 */
public final class sl0_2
implements kj_2 {
    public final /* synthetic */ Type a;
    public final /* synthetic */ Executor b;

    public sl0_2(Type type2, Executor executor) {
        this.a = type2;
        this.b = executor;
    }

    public final Type a() {
        return this.a;
    }

    public final Object b(v72_0 jj_22) {
        Executor executor = this.b;
        if (executor != null) {
            vl0$a vl0$a = new vl0$a(executor, jj_22);
            jj_22 = vl0$a;
        }
        return jj_22;
    }
}

