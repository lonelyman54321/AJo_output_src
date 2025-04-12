/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from r52
 */
public final class r52_0
extends Enum {
    private static final /* synthetic */ r52_0[] $VALUES;
    public static final /* enum */ r52_0 COMPLETE;

    static {
        r52_0 r52_02;
        COMPLETE = r52_02 = new r52_0("COMPLETE", 0);
        r52_0[] r52_0Array = new r52_0[]{r52_02};
        $VALUES = r52_0Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private r52_0() {
        void var2_-1;
        void var1_-1;
    }

    public static boolean accept(Object object, df3_2 df3_22) {
        r52_0 r52_02 = COMPLETE;
        boolean bl2 = true;
        if (object == r52_02) {
            df3_22.onComplete();
            return bl2;
        }
        boolean bl3 = object instanceof r52$b;
        if (bl3) {
            object = ((r52$b)object).a;
            df3_22.onError((Throwable)object);
            return bl2;
        }
        df3_22.b(object);
        return false;
    }

    public static boolean accept(Object object, e62_0 e62_02) {
        r52_0 r52_02 = COMPLETE;
        boolean bl2 = true;
        if (object == r52_02) {
            e62_02.onComplete();
            return bl2;
        }
        boolean bl3 = object instanceof r52$b;
        if (bl3) {
            object = ((r52$b)object).a;
            e62_02.onError((Throwable)object);
            return bl2;
        }
        e62_02.b(object);
        return false;
    }

    public static boolean acceptFull(Object object, df3_2 df3_22) {
        r52_0 r52_02 = COMPLETE;
        boolean bl2 = true;
        if (object == r52_02) {
            df3_22.onComplete();
            return bl2;
        }
        boolean bl3 = object instanceof r52$b;
        if (bl3) {
            object = ((r52$b)object).a;
            df3_22.onError((Throwable)object);
            return bl2;
        }
        bl3 = object instanceof r52$c;
        bl2 = false;
        if (bl3) {
            object = ((r52$c)object).a;
            df3_22.a((ef3_2)object);
            return false;
        }
        df3_22.b(object);
        return false;
    }

    public static boolean acceptFull(Object object, e62_0 e62_02) {
        r52_0 r52_02 = COMPLETE;
        boolean bl2 = true;
        if (object == r52_02) {
            e62_02.onComplete();
            return bl2;
        }
        boolean bl3 = object instanceof r52$b;
        if (bl3) {
            object = ((r52$b)object).a;
            e62_02.onError((Throwable)object);
            return bl2;
        }
        bl3 = object instanceof r52$a;
        bl2 = false;
        if (bl3) {
            object = ((r52$a)object).a;
            e62_02.a((yr0_2)object);
            return false;
        }
        e62_02.b(object);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(yr0_2 yr0_22) {
        r52$a r52$a = new r52$a(yr0_22);
        return r52$a;
    }

    public static Object error(Throwable throwable) {
        r52$b r52$b = new r52$b(throwable);
        return r52$b;
    }

    public static yr0_2 getDisposable(Object object) {
        return ((r52$a)object).a;
    }

    public static Throwable getError(Object object) {
        return ((r52$b)object).a;
    }

    public static ef3_2 getSubscription(Object object) {
        return ((r52$c)object).a;
    }

    public static Object getValue(Object object) {
        return object;
    }

    public static boolean isComplete(Object object) {
        boolean bl2;
        r52_0 r52_02 = COMPLETE;
        if (object == r52_02) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isDisposable(Object object) {
        return object instanceof r52$a;
    }

    public static boolean isError(Object object) {
        return object instanceof r52$b;
    }

    public static boolean isSubscription(Object object) {
        return object instanceof r52$c;
    }

    public static Object next(Object object) {
        return object;
    }

    public static Object subscription(ef3_2 ef3_22) {
        r52$c r52$c = new r52$c(ef3_22);
        return r52$c;
    }

    public static r52_0 valueOf(String string2) {
        return Enum.valueOf(r52_0.class, string2);
    }

    public static r52_0[] values() {
        return (r52_0[])$VALUES.clone();
    }

    public String toString() {
        return "NotificationLite.Complete";
    }
}

