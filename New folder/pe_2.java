/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from pE
 */
public final class pe_2 {
    public static final wr_2 a;
    public static final int b;
    public static final int c;
    public static final gh3_2 d;
    public static final gh3_2 e;
    public static final gh3_2 f;
    public static final gh3_2 g;
    public static final gh3_2 h;
    public static final gh3_2 i;
    public static final gh3_2 j;
    public static final gh3_2 k;
    public static final gh3_2 l;
    public static final gh3_2 m;
    public static final gh3_2 n;
    public static final gh3_2 o;
    public static final gh3_2 p;
    public static final gh3_2 q;
    public static final gh3_2 r;
    public static final gh3_2 s;

    static {
        wr_2 wr_22;
        Object object = wr_22;
        a = wr_22 = new wr_2(-1, null, null, 0);
        int n3 = 12;
        b = hh3_1.e(32, 0, 0, n3, "kotlinx.coroutines.bufferedChannel.segmentSize");
        c = hh3_1.e(10000, 0, 0, n3, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
        d = object = new gh3_2("BUFFERED");
        e = object = new gh3_2("SHOULD_BUFFER");
        f = object = new gh3_2("S_RESUMING_BY_RCV");
        g = object = new gh3_2("RESUMING_BY_EB");
        h = object = new gh3_2("POISONED");
        i = object = new gh3_2("DONE_RCV");
        j = object = new gh3_2("INTERRUPTED_SEND");
        k = object = new gh3_2("INTERRUPTED_RCV");
        l = object = new gh3_2("CHANNEL_CLOSED");
        m = object = new gh3_2("SUSPEND");
        n = object = new gh3_2("SUSPEND_NO_WAITER");
        o = object = new gh3_2("FAILED");
        p = object = new gh3_2("NO_RECEIVE_RESULT");
        q = object = new gh3_2("CLOSE_HANDLER_CLOSED");
        r = object = new gh3_2("CLOSE_HANDLER_INVOKED");
        s = object = new gh3_2("NO_CLOSE_CAUSE");
    }

    public static final boolean a(bl_2 bl_22, Object object, gx0_2 gx0_22) {
        boolean bl2;
        if ((object = bl_22.v(object, gx0_22)) != null) {
            bl_22.J(object);
            bl2 = true;
        } else {
            bl2 = false;
            bl_22 = null;
        }
        return bl2;
    }
}

