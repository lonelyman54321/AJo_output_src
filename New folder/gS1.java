/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class gS1 {
    public final AtomicReference a;
    public final ks1_1 b;

    public gS1() {
        Object object = new AtomicReference(null);
        this.a = object;
        this.b = object = ls1_2.a();
    }

    public static final void a(gS1 object, gS1$a object2) {
        while (true) {
            aS1 aS12;
            aS1 aS13;
            int n3;
            AtomicReference atomicReference;
            gS1$a gS1$a;
            if ((gS1$a = (gS1$a)(atomicReference = ((gS1)object).a).get()) != null && (n3 = (aS13 = ((gS1$a)object2).a).compareTo(aS12 = gS1$a.a)) < 0) {
                object = new CancellationException("Current mutation had a higher priority");
                throw object;
            }
            do {
                if ((n3 = atomicReference.compareAndSet(gS1$a, object2)) == 0) continue;
                if (gS1$a != null) {
                    object = new MutationInterruptedException();
                    object2 = gS1$a.b;
                    object2.d((CancellationException)object);
                }
                return;
            } while ((aS13 = atomicReference.get()) == gS1$a);
        }
    }
}

