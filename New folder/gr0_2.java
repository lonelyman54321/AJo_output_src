/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from Gr0
 */
public final class gr0_2
extends Enum
implements yr0_2 {
    private static final /* synthetic */ gr0_2[] $VALUES;
    public static final /* enum */ gr0_2 DISPOSED;

    static {
        gr0_2 gr0_22;
        DISPOSED = gr0_22 = new gr0_2("DISPOSED", 0);
        gr0_2[] gr0_2Array = new gr0_2[]{gr0_22};
        $VALUES = gr0_2Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gr0_2() {
        void var2_-1;
        void var1_-1;
    }

    public static boolean dispose(AtomicReference object) {
        gr0_2 gr0_22;
        yr0_2 yr0_22 = (yr0_2)((AtomicReference)object).get();
        if (yr0_22 != (gr0_22 = DISPOSED) && (object = (yr0_2)((AtomicReference)object).getAndSet(gr0_22)) != gr0_22) {
            if (object != null) {
                object.dispose();
            }
            return true;
        }
        return false;
    }

    public static boolean isDisposed(yr0_2 yr0_22) {
        boolean bl2;
        gr0_2 gr0_22 = DISPOSED;
        if (yr0_22 == gr0_22) {
            bl2 = true;
        } else {
            bl2 = false;
            yr0_22 = null;
        }
        return bl2;
    }

    public static boolean replace(AtomicReference atomicReference, yr0_2 yr0_22) {
        while (true) {
            gr0_2 gr0_22;
            yr0_2 yr0_23;
            if ((yr0_23 = (yr0_2)atomicReference.get()) == (gr0_22 = DISPOSED)) {
                if (yr0_22 != null) {
                    yr0_22.dispose();
                }
                return false;
            }
            do {
                boolean bl2;
                if (!(bl2 = atomicReference.compareAndSet(yr0_23, yr0_22))) continue;
                return true;
            } while ((gr0_22 = atomicReference.get()) == yr0_23);
        }
    }

    public static void reportDisposableSet() {
        ProtocolViolationException protocolViolationException = new IllegalStateException("Disposable already set!");
        dr2_2.b(protocolViolationException);
    }

    public static boolean set(AtomicReference atomicReference, yr0_2 yr0_22) {
        while (true) {
            gr0_2 gr0_22;
            yr0_2 yr0_23;
            if ((yr0_23 = (yr0_2)atomicReference.get()) == (gr0_22 = DISPOSED)) {
                if (yr0_22 != null) {
                    yr0_22.dispose();
                }
                return false;
            }
            do {
                boolean bl2;
                if (!(bl2 = atomicReference.compareAndSet(yr0_23, yr0_22))) continue;
                if (yr0_23 != null) {
                    yr0_23.dispose();
                }
                return true;
            } while ((gr0_22 = atomicReference.get()) == yr0_23);
        }
    }

    public static boolean setOnce(AtomicReference atomicReference, yr0_2 yr0_22) {
        String string2 = "d is null";
        x03_0.b(yr0_22, string2);
        do {
            string2 = null;
            boolean bl2 = atomicReference.compareAndSet(null, yr0_22);
            if (!bl2) continue;
            return true;
        } while ((string2 = atomicReference.get()) == null);
        yr0_22.dispose();
        atomicReference = atomicReference.get();
        yr0_22 = DISPOSED;
        if (atomicReference != yr0_22) {
            gr0_2.reportDisposableSet();
        }
        return false;
    }

    public static boolean trySet(AtomicReference atomicReference, yr0_2 yr0_22) {
        gr0_2 gr0_22;
        do {
            gr0_22 = null;
            boolean bl2 = atomicReference.compareAndSet(null, yr0_22);
            if (!bl2) continue;
            return true;
        } while ((gr0_22 = (gr0_2)atomicReference.get()) == null);
        if ((atomicReference = atomicReference.get()) == (gr0_22 = DISPOSED)) {
            yr0_22.dispose();
        }
        return false;
    }

    public static boolean validate(yr0_2 object, yr0_2 yr0_22) {
        if (yr0_22 == null) {
            object = new NullPointerException("next is null");
            dr2_2.b((Throwable)object);
            return false;
        }
        if (object != null) {
            yr0_22.dispose();
            gr0_2.reportDisposableSet();
            return false;
        }
        return true;
    }

    public static gr0_2 valueOf(String string2) {
        return Enum.valueOf(gr0_2.class, string2);
    }

    public static gr0_2[] values() {
        return (gr0_2[])$VALUES.clone();
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}

