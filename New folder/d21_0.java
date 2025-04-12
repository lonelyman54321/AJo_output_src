/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.c;

/*
 * Renamed from D21
 */
public abstract class d21_0
extends c
implements ao0_1 {
    public fr0_1 H(long l2, Runnable runnable2, CoroutineContext coroutineContext) {
        return hl0_2.a.H(l2, runnable2, coroutineContext);
    }

    public c M0(int n3, String string2) {
        tu1_2.a(n3);
        c c2 = string2 != null ? new fs1_2(this, string2) : this;
        return c2;
    }

    public abstract d21_0 N0();

    public String toString() {
        String string2;
        char c2;
        Object object = ir0_2.a;
        object = bg1_1.a;
        if (this == object) {
            object = "Dispatchers.Main";
        } else {
            c2 = '\u0000';
            string2 = null;
            try {
                object = ((d21_0)object).N0();
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                object = null;
            }
            object = this == object ? "Dispatchers.Main.immediate" : null;
        }
        if (object == null) {
            object = new StringBuilder();
            string2 = this.getClass().getSimpleName();
            ((StringBuilder)object).append(string2);
            c2 = '@';
            ((StringBuilder)object).append(c2);
            string2 = si0_2.d(this);
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
        }
        return object;
    }
}

