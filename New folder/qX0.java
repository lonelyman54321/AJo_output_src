/*
 * Decompiled with CFR 0.152.
 */
import androidx.activity.ComponentActivity$e;
import androidx.activity.b;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class qX0 {
    public final Executor a;
    public final Function0 b;
    public final Object c;
    public boolean d;
    public final ArrayList e;

    public qX0(ComponentActivity$e arrayList, b b2) {
        Intrinsics.checkNotNullParameter(arrayList, "executor");
        Intrinsics.checkNotNullParameter(b2, "reportFullyDrawn");
        arrayList = new ArrayList();
        this.c = arrayList;
        this.e = arrayList = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.c;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                boolean bl2 = true;
                try {
                    boolean bl3;
                    this.d = bl2;
                    object2 = this.e;
                    object2 = ((ArrayList)object2).iterator();
                    while (bl3 = object2.hasNext()) {
                        Object object3 = object2.next();
                        object3 = (Function0)object3;
                        object3.invoke();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = this.e;
                ((ArrayList)object2).clear();
                object2 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }
}

