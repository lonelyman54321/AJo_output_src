/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from si$a
 */
public final class si$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Uh1 c;
    public final /* synthetic */ ti d;

    public si$a_0(Uh1 uh1, ti ti2) {
        this.c = uh1;
        this.d = ti2;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        int n3 = 1;
        object = (Throwable)object;
        object = this.c;
        Object object2 = ((Uh1)object).c;
        synchronized (object2) {
            block4: {
                int n4;
                int n7;
                Object[] objectArray;
                try {
                    ((Uh1)object).e = n3;
                    objectArray = ((Uh1)object).d;
                    n7 = objectArray.c;
                    if (n7 <= 0) break block4;
                    objectArray = objectArray.a;
                    n4 = 0;
                }
                catch (Throwable throwable) {}
                throw throwable;
                do {
                    Object object3 = objectArray[n4];
                    object3 = (WeakReference)object3;
                    object3 = ((Reference)object3).get();
                    if ((object3 = (L52)object3) == null) continue;
                    object3.a();
                } while ((n4 += n3) < n7);
            }
            object = ((Uh1)object).d;
            ((WR1)object).g();
            object = Unit.a;
        }
        this.d.b.a.b();
        return Unit.a;
    }
}

