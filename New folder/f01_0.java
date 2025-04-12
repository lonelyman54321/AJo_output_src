/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from f01
 */
public final class f01_0
extends RR1 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public f01_0(int n3, y83 y832) {
        Object object = A83.c;
        // MONITORENTER : object
        List list = A83.i;
        Object object2 = CollectionsKt.b0(list);
        object2 = (Function1)object2;
        if (object2 == null) {
            object2 = new f01$a(list);
        }
        super(n3, y832, null, (Function1)object2);
    }

    public final RR1 C(Function1 function1, Function1 function12) {
        f01$b f01$b = new f01$b(function1, function12);
        function1 = A83.a;
        function1 = new C83(f01$b);
        return (RR1)((v83_0)A83.f(function1));
    }

    public final void c() {
        Object object = A83.c;
        synchronized (object) {
            int n3 = this.d;
            if (n3 >= 0) {
                A83.v(n3);
                this.d = n3 = -1;
            }
            Unit unit = Unit.a;
            return;
        }
    }

    public final void k() {
        R83.a();
        throw null;
    }

    public final void l() {
        R83.a();
        throw null;
    }

    public final void m() {
        A83.a();
    }

    public final v83_0 t(Function1 function1) {
        f01$c f01$c = new f01$c(function1);
        function1 = A83.a;
        function1 = new C83(f01$c);
        return (v83_0)A83.f(function1);
    }

    public final w83_0 v() {
        String string2 = "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

