/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

public final class s63$b
extends AtomicInteger
implements yr0_2 {
    private static final long serialVersionUID = -5556924161382950569L;
    public final t53_0 a;
    public final bx0_2 b;
    public final s63$c[] c;
    public final Object[] d;

    public s63$b(t53_0 objectArray, int n3, bx0_2 bx0_22) {
        super(n3);
        this.a = objectArray;
        this.b = bx0_22;
        objectArray = new s63$c[n3];
        bx0_22 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            s63$c s63$c = new s63$c(this, i3);
            objectArray[i3] = s63$c;
        }
        this.c = objectArray;
        objectArray = new Object[n3];
        this.d = objectArray;
    }

    public final void a(Throwable throwable, int n3) {
        s63$c s63$c = null;
        int n4 = this.getAndSet(0);
        if (n4 > 0) {
            s63$c[] s63$cArray = this.c;
            int n7 = s63$cArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                s63$c s63$c2 = s63$cArray[i3];
                s63$c2.getClass();
                gr0_2.dispose(s63$c2);
            }
            while (++n3 < n7) {
                s63$c = s63$cArray[n3];
                s63$c.getClass();
                gr0_2.dispose(s63$c);
            }
            t53_0 t53_02 = this.a;
            t53_02.onError(throwable);
        } else {
            dr2_2.b(throwable);
        }
    }

    public final void dispose() {
        int n3 = this.getAndSet(0);
        if (n3 > 0) {
            for (s63$c s63$c : this.c) {
                s63$c.getClass();
                gr0_2.dispose(s63$c);
            }
        }
    }

    public final boolean isDisposed() {
        int n3 = this.get();
        n3 = n3 <= 0 ? 1 : 0;
        return n3 != 0;
    }
}

