/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from Xw
 */
public abstract class xw_2
extends AtomicInteger
implements gc2_2 {
    private static final long serialVersionUID = -6671519529404341862L;

    public final boolean offer(Object object) {
        object = new UnsupportedOperationException("Should not be called!");
        throw object;
    }
}

