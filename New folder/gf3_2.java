/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from Gf3
 */
public final class gf3_2
extends Enum
implements ef3_2 {
    private static final /* synthetic */ gf3_2[] $VALUES;
    public static final /* enum */ gf3_2 CANCELLED;

    static {
        gf3_2 gf3_22;
        CANCELLED = gf3_22 = new gf3_2("CANCELLED", 0);
        gf3_2[] gf3_2Array = new gf3_2[]{gf3_22};
        $VALUES = gf3_2Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gf3_2() {
        void var2_-1;
        void var1_-1;
    }

    public static boolean cancel(AtomicReference object) {
        gf3_2 gf3_22;
        ef3_2 ef3_22 = (ef3_2)((AtomicReference)object).get();
        if (ef3_22 != (gf3_22 = CANCELLED) && (object = (ef3_2)((AtomicReference)object).getAndSet(gf3_22)) != gf3_22) {
            if (object != null) {
                object.cancel();
            }
            return true;
        }
        return false;
    }

    public static void deferredRequest(AtomicReference object, AtomicLong atomicLong, long l2) {
        ef3_2 ef3_22 = (ef3_2)((AtomicReference)object).get();
        if (ef3_22 != null) {
            ef3_22.request(l2);
        } else {
            boolean bl2 = gf3_2.validate(l2);
            if (bl2) {
                long l3;
                long l4;
                long l7;
                bu_2.a(atomicLong, l2);
                object = (ef3_2)((AtomicReference)object).get();
                if (object != null && (l7 = (l4 = (l3 = atomicLong.getAndSet(l2 = 0L)) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                    object.request(l3);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference atomicReference, AtomicLong atomicLong, ef3_2 ef3_22) {
        boolean bl2 = gf3_2.setOnce(atomicReference, ef3_22);
        if (bl2) {
            long l2 = 0L;
            long l3 = atomicLong.getAndSet(l2);
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false) {
                ef3_22.request(l3);
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference atomicReference, ef3_2 ef3_22) {
        while (true) {
            gf3_2 gf3_22;
            ef3_2 ef3_23;
            if ((ef3_23 = (ef3_2)atomicReference.get()) == (gf3_22 = CANCELLED)) {
                if (ef3_22 != null) {
                    ef3_22.cancel();
                }
                return false;
            }
            do {
                boolean bl2;
                if (!(bl2 = atomicReference.compareAndSet(ef3_23, ef3_22))) continue;
                return true;
            } while ((gf3_22 = atomicReference.get()) == ef3_23);
        }
    }

    public static void reportMoreProduced(long l2) {
        String string2 = Wm2.a(l2, "More produced than requested: ");
        ProtocolViolationException protocolViolationException = new IllegalStateException(string2);
        dr2_2.b(protocolViolationException);
    }

    public static void reportSubscriptionSet() {
        ProtocolViolationException protocolViolationException = new IllegalStateException("Subscription already set!");
        dr2_2.b(protocolViolationException);
    }

    public static boolean set(AtomicReference atomicReference, ef3_2 ef3_22) {
        while (true) {
            gf3_2 gf3_22;
            ef3_2 ef3_23;
            if ((ef3_23 = (ef3_2)atomicReference.get()) == (gf3_22 = CANCELLED)) {
                if (ef3_22 != null) {
                    ef3_22.cancel();
                }
                return false;
            }
            do {
                boolean bl2;
                if (!(bl2 = atomicReference.compareAndSet(ef3_23, ef3_22))) continue;
                if (ef3_23 != null) {
                    ef3_23.cancel();
                }
                return true;
            } while ((gf3_22 = atomicReference.get()) == ef3_23);
        }
    }

    public static boolean setOnce(AtomicReference atomicReference, ef3_2 ef3_22) {
        String string2 = "s is null";
        x03_0.b(ef3_22, string2);
        do {
            string2 = null;
            boolean bl2 = atomicReference.compareAndSet(null, ef3_22);
            if (!bl2) continue;
            return true;
        } while ((string2 = atomicReference.get()) == null);
        ef3_22.cancel();
        atomicReference = atomicReference.get();
        ef3_22 = CANCELLED;
        if (atomicReference != ef3_22) {
            gf3_2.reportSubscriptionSet();
        }
        return false;
    }

    public static boolean setOnce(AtomicReference atomicReference, ef3_2 ef3_22, long l2) {
        boolean bl2 = gf3_2.setOnce(atomicReference, ef3_22);
        if (bl2) {
            ef3_22.request(l2);
            return true;
        }
        return false;
    }

    public static boolean validate(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            String string2 = Wm2.a(l2, "n > 0 required but it was ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            dr2_2.b(illegalArgumentException);
            return false;
        }
        return true;
    }

    public static boolean validate(ef3_2 object, ef3_2 ef3_22) {
        if (ef3_22 == null) {
            object = new NullPointerException("next is null");
            dr2_2.b((Throwable)object);
            return false;
        }
        if (object != null) {
            ef3_22.cancel();
            gf3_2.reportSubscriptionSet();
            return false;
        }
        return true;
    }

    public static gf3_2 valueOf(String string2) {
        return Enum.valueOf(gf3_2.class, string2);
    }

    public static gf3_2[] values() {
        return (gf3_2[])$VALUES.clone();
    }

    public void cancel() {
    }

    public void request(long l2) {
    }
}

