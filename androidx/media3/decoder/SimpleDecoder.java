/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;

public abstract class SimpleDecoder
implements ej0 {
    public final Thread a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final DecoderInputBuffer[] e;
    public final gj0_0[] f;
    public int g;
    public int h;
    public DecoderInputBuffer i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public long m;

    public SimpleDecoder(DecoderInputBuffer[] object, gj0_0[] gj0_0Array) {
        int n3;
        int n4;
        int n7;
        long l2;
        Object object2;
        this.b = object2 = new Object();
        this.m = l2 = -9223372036854775807L;
        object2 = new ArrayDeque();
        this.c = object2;
        object2 = new ArrayDeque();
        this.d = object2;
        this.e = object;
        this.g = n7 = ((DecoderInputBuffer[])object).length;
        n7 = 0;
        object = null;
        object2 = null;
        for (int i3 = 0; i3 < (n4 = this.g); ++i3) {
            DecoderInputBuffer decoderInputBuffer;
            DecoderInputBuffer[] decoderInputBufferArray = this.e;
            decoderInputBufferArray[i3] = decoderInputBuffer = this.g();
        }
        this.f = gj0_0Array;
        this.h = n3 = gj0_0Array.length;
        while (n7 < (n3 = this.h)) {
            gj0_0Array = this.f;
            gj0_0Array[n7] = object2 = this.h();
            ++n7;
        }
        super(this);
        this.a = object;
        ((Thread)object).start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(long l2) {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                int n3;
                block4: {
                    block3: {
                        try {
                            n3 = this.g;
                            DecoderInputBuffer[] decoderInputBufferArray = this.e;
                            int n4 = decoderInputBufferArray.length;
                            if (n3 == n4 || (n3 = (int)(this.k ? 1 : 0)) != 0) break block3;
                            n3 = 0;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    n3 = 1;
                }
                ct3.f(n3 != 0);
                this.m = l2;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object e() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                Object object2;
                block7: {
                    block8: {
                        DecoderInputBuffer[] decoderInputBufferArray;
                        int n3;
                        int n4;
                        try {
                            object2 = this.j;
                            if (object2 != null) break block7;
                            object2 = this.i;
                            n4 = 1;
                            if (object2 == null) {
                                n3 = 1;
                            } else {
                                n3 = 0;
                                object2 = null;
                            }
                            ct3.f(n3 != 0);
                            n3 = this.g;
                            if (n3 == 0) {
                                n3 = 0;
                                object2 = null;
                                break block8;
                            }
                            decoderInputBufferArray = this.e;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        this.g = n3 -= n4;
                        object2 = decoderInputBufferArray[n3];
                    }
                    this.i = object2;
                    return object2;
                }
                throw object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(DecoderInputBuffer object) {
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block9: {
                Object object3;
                block7: {
                    boolean bl2;
                    try {
                        object3 = this.j;
                        if (object3 != null) break block7;
                        object3 = this.i;
                        if (object == object3) {
                            bl2 = true;
                        } else {
                            bl2 = false;
                            object3 = null;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    ct3.a(bl2);
                    object3 = this.c;
                    ((ArrayDeque)object3).addLast(object);
                    object = this.c;
                    int n3 = ((ArrayDeque)object).isEmpty();
                    if (n3 == 0 && (n3 = this.h) > 0) {
                        object = this.b;
                        object.notify();
                    }
                    n3 = 0;
                    object = null;
                    this.i = null;
                    return;
                }
                throw object3;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                DecoderInputBuffer[] decoderInputBufferArray;
                int n3;
                int n4;
                Object object2;
                boolean bl2;
                block6: {
                    bl2 = true;
                    try {
                        this.k = bl2;
                        object2 = this.i;
                        if (object2 == null) break block6;
                        ((DecoderInputBuffer)object2).g();
                        n4 = this.g;
                        this.g = n3 = n4 + 1;
                        decoderInputBufferArray = this.e;
                        decoderInputBufferArray[n4] = object2;
                        bl2 = false;
                        object2 = null;
                        this.i = null;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                while (!(bl2 = ((ArrayDeque)(object2 = this.c)).isEmpty())) {
                    object2 = this.c;
                    object2 = ((ArrayDeque)object2).removeFirst();
                    object2 = (DecoderInputBuffer)object2;
                    ((DecoderInputBuffer)object2).g();
                    n4 = this.g;
                    this.g = n3 = n4 + 1;
                    decoderInputBufferArray = this.e;
                    decoderInputBufferArray[n4] = object2;
                }
                while (true) {
                    if (bl2 = ((ArrayDeque)(object2 = this.d)).isEmpty()) {
                        return;
                    }
                    object2 = this.d;
                    object2 = ((ArrayDeque)object2).removeFirst();
                    object2 = (gj0_0)object2;
                    ((gj0_0)object2).h();
                }
            }
            throw throwable2;
        }
    }

    public abstract DecoderInputBuffer g();

    public abstract gj0_0 h();

    public abstract DecoderException i(Throwable var1);

    public abstract DecoderException j(DecoderInputBuffer var1, gj0_0 var2, boolean var3);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean k() {
        int n7;
        int n3;
        Object object;
        Object object2;
        boolean bl2;
        block25: {
            Object object4;
            block24: {
                Object object3;
                block23: {
                    long l2;
                    boolean bl4;
                    boolean bl3;
                    block22: {
                        int n4;
                        object4 = this.b;
                        // MONITORENTER : object4
                        while (true) {
                            n4 = this.l;
                            object3 = null;
                            bl2 = true;
                            if (n4 != 0) break;
                            object2 = this.c;
                            n4 = ((ArrayDeque)object2).isEmpty();
                            if (n4 == 0 && (n4 = this.h) > 0) {
                                n4 = 1;
                            } else {
                                n4 = 0;
                                object2 = null;
                            }
                            if (n4 != 0) break;
                            object2 = this.b;
                            object2.wait();
                        }
                        if ((n4 = this.l) != 0) {
                            // MONITOREXIT : object4
                            return false;
                        }
                        object2 = this.c;
                        object2 = ((ArrayDeque)object2).removeFirst();
                        object2 = (DecoderInputBuffer)object2;
                        object = this.f;
                        bl3 = this.h - bl2;
                        this.h = bl3;
                        object = object[bl3];
                        bl3 = this.k;
                        this.k = false;
                        // MONITOREXIT : object4
                        n3 = 4;
                        bl4 = ((fE)object2).f(n3);
                        if (!bl4) break block22;
                        ((fE)object).e(n3);
                        break block23;
                    }
                    ((gj0_0)object).b = l2 = ((DecoderInputBuffer)object2).f;
                    n3 = 0x8000000;
                    bl4 = ((fE)object2).f(n3);
                    if (bl4) {
                        ((fE)object).e(n3);
                    }
                    if ((n3 = (int)(this.m(l2 = ((DecoderInputBuffer)object2).f) ? 1 : 0)) == 0) {
                        ((gj0_0)object).c = bl2;
                    }
                    try {
                        object4 = this.j((DecoderInputBuffer)object2, (gj0_0)object, bl3);
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        object4 = this.i(outOfMemoryError);
                    }
                    catch (RuntimeException runtimeException) {
                        object4 = this.i(runtimeException);
                    }
                    if (object4 != null) {
                        Object object5 = this.b;
                        // MONITORENTER : object5
                        this.j = object4;
                        // MONITOREXIT : object5
                        return false;
                    }
                }
                object3 = this.b;
                // MONITORENTER : object3
                n3 = (int)(this.k ? 1 : 0);
                if (n3 == 0) break block24;
                ((gj0_0)object).h();
                break block25;
            }
            n3 = (int)(((gj0_0)object).c ? 1 : 0);
            if (n3 != 0) {
                ((gj0_0)object).h();
            } else {
                object4 = this.d;
                ((ArrayDeque)object4).addLast(object);
            }
        }
        ((DecoderInputBuffer)object2).g();
        n3 = this.g;
        this.g = n7 = n3 + 1;
        object = this.e;
        object[n3] = object2;
        // MONITOREXIT : object3
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final gj0_0 l() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = this.j;
                    if (object2 != null) {
                        throw object2;
                    }
                    object2 = this.d;
                    boolean bl2 = ((ArrayDeque)object2).isEmpty();
                    if (bl2) {
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = this.d;
                object2 = ((ArrayDeque)object2).removeFirst();
                return (gj0_0)object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean m(long l2) {
        Object object = this.b;
        synchronized (object) {
            long l3 = this.m;
            long l4 = -9223372036854775807L;
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 == false) return true;
            Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object2 < 0) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(gj0_0 object) {
        Object object2 = this.b;
        synchronized (object2) {
            int n3;
            ((gj0_0)object).g();
            int n4 = this.h;
            this.h = n3 = n4 + 1;
            gj0_0[] gj0_0Array = this.f;
            gj0_0Array[n4] = object;
            object = this.c;
            int n7 = ((ArrayDeque)object).isEmpty();
            if (n7 == 0 && (n7 = this.h) > 0) {
                object = this.b;
                object.notify();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        Object object = this.b;
        synchronized (object) {
            boolean bl2;
            this.l = bl2 = true;
            Object object2 = this.b;
            object2.notify();
        }
        try {
            object = this.a;
            ((Thread)object).join();
            return;
        }
        catch (InterruptedException interruptedException) {
            object = Thread.currentThread();
            ((Thread)object).interrupt();
        }
    }
}

