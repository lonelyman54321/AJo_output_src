/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

public final class TrampolineScheduler$a
implements Comparable {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean d;

    public TrampolineScheduler$a(Runnable runnable2, Long l2, int n3) {
        long l3;
        this.a = runnable2;
        this.b = l3 = l2.longValue();
        this.c = n3;
    }

    public final int compareTo(Object object) {
        object = (TrampolineScheduler$a)object;
        long l2 = ((TrampolineScheduler$a)object).b;
        long l3 = this.b;
        int n3 = 0;
        Object object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        int n4 = object2 < 0 ? -1 : (object2 > 0 ? 1 : 0);
        if (n4 == 0) {
            n4 = this.c;
            int n7 = ((TrampolineScheduler$a)object).c;
            if (n4 < n7) {
                n3 = -1;
            } else if (n4 > n7) {
                n3 = 1;
            }
            n4 = n3;
        }
        return n4;
    }
}

