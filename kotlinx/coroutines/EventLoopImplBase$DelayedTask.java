/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlin.Unit;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.EventLoopImplBase$a;

public abstract class EventLoopImplBase$DelayedTask
implements Runnable,
Comparable,
fr0_1,
hn3_0 {
    private volatile Object _heap;
    public long a;
    public int b;

    public EventLoopImplBase$DelayedTask(long l2) {
        this.a = l2;
        this.b = -1;
    }

    public final gn3_0 b() {
        Object object = this._heap;
        boolean bl2 = object instanceof gn3_0;
        object = bl2 ? (gn3_0)object : null;
        return object;
    }

    public final void c(EventLoopImplBase$a object) {
        Object object2 = this._heap;
        gh3_2 gh3_22 = kt2_2.b;
        if (object2 != gh3_22) {
            this._heap = object;
            return;
        }
        object2 = "Failed requirement.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final int compareTo(Object object) {
        object = (EventLoopImplBase$DelayedTask)object;
        long l2 = this.a;
        long l3 = ((EventLoopImplBase$DelayedTask)object).a;
        long l4 = (l2 -= l3) - (l3 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 > 0) {
            object2 = 1;
        } else if (object2 < 0) {
            object2 = -1;
        } else {
            object2 = 0;
            object = null;
        }
        return (int)object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int d(long var1_1, EventLoopImplBase$a var3_2, EventLoopImplBase var4_3) {
        synchronized (this) {
            block17: {
                try {
                    var5_4 /* !! */  = this._heap;
                    var6_5 = kt2_2.b;
                    if (var5_4 /* !! */  == var6_5) {
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var10_9) {
                    break block17;
                }
                return 2;
lbl-1000:
                // 1 sources

                {
                    ** synchronized (var3_2)
                }
lbl-1000:
                // 1 sources

                {
                    block18: {
                        block16: {
                            try {
                                var5_4 /* !! */  = var3_2.a;
                                var6_5 = null;
                                var5_4 /* !! */  = var5_4 /* !! */  != null ? var5_4 /* !! */ [0] : null;
                                var5_4 /* !! */  = (EventLoopImplBase$DelayedTask)var5_4 /* !! */ ;
                                var7_6 = EventLoopImplBase.f;
                                var4_3.getClass();
                                var7_6 = EventLoopImplBase.h;
                                var8_7 = var7_6.get(var4_3);
                                var9_8 = 1;
                                if (var8_7 == var9_8) {
                                    var8_7 = 1;
                                } else {
                                    var8_7 = 0;
                                    var4_3 = null;
                                }
                                if (var8_7 == 0) break block16;
                            }
                            catch (Throwable var10_10) {
                                ** GOTO lbl-1000
                            }
                            return var9_8;
                        }
                        var11_11 = 0L;
                        if (var5_4 /* !! */  != null) break block18;
                        var3_2.c = var1_1;
                        ** GOTO lbl50
                    }
                    var13_12 = var5_4 /* !! */ .a;
                    var15_13 = var13_12 - var1_1;
                    cfr_temp_0 = var15_13 - var11_11;
                    var8_7 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var8_7 >= 0) ** GOTO lbl-1000
                    var1_1 = var13_12;
lbl-1000:
                    // 2 sources

                    {
                        var13_12 = var3_2.c;
                        var13_12 = var1_1 - var13_12;
                    }
                    var8_7 = (int)(var13_12 == var11_11 ? 0 : (var13_12 < var11_11 ? -1 : 1));
                    if (var8_7 <= 0) ** GOTO lbl50
                    {
                        var3_2.c = var1_1;
lbl50:
                        // 3 sources

                        var1_1 = this.a;
                        var13_12 = var3_2.c;
                    }
                    cfr_temp_1 = (var1_1 -= var13_12) - var11_11;
                    var8_7 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var8_7 >= 0) ** GOTO lbl56
                    {
                        this.a = var13_12;
lbl56:
                        // 2 sources

                        var3_2.a(this);
                        return 0;
                    }
lbl-1000:
                    // 1 sources

                    {
                        throw var10_10;
                    }
                }
            }
            throw var10_9;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void dispose() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                gh3_2 gh3_22;
                Object object;
                block5: {
                    try {
                        object = this._heap;
                        gh3_22 = kt2_2.b;
                        if (object != gh3_22) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                boolean bl2 = object instanceof EventLoopImplBase$a;
                if ((object = bl2 ? (EventLoopImplBase$a)object : null) != null) {
                    ((gn3_0)object).b(this);
                }
                this._heap = gh3_22;
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final int getIndex() {
        return this.b;
    }

    public final void setIndex(int n3) {
        this.b = n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Delayed[nanos=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

