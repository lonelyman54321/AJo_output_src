/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.d;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public abstract class LP1$c
implements fo0 {
    public LP1$c a = this;
    public c80 b;
    public int c;
    public int d = -1;
    public LP1$c e;
    public LP1$c f;
    public i62_0 g;
    public w32_0 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public final LP1$c e() {
        return this.a;
    }

    public final i90_0 f1() {
        Object object = this.b;
        if (object == null) {
            object = go0.g(this).getCoroutineContext();
            CoroutineContext coroutineContext = go0.g(this).getCoroutineContext();
            Object object2 = i$a.a;
            coroutineContext = (i)coroutineContext.get((CoroutineContext$a)object2);
            object2 = new xl1_2((i)coroutineContext);
            this.b = object = kotlinx.coroutines.d.a(object.plus((CoroutineContext)object2));
        }
        return object;
    }

    public boolean g1() {
        return this instanceof CU0 ^ true;
    }

    public void h1() {
        boolean bl2 = this.m;
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            w32_0 w32_02 = this.h;
            if (w32_02 != null) {
                bl2 = true;
            } else {
                bl2 = false;
                w32_02 = null;
            }
            if (bl2) {
                this.m = bl3;
                this.k = bl3;
                return;
            }
            bh1_1.c("attach invoked on a node without a coordinator");
            throw null;
        }
        bh1_1.c("node attached multiple times");
        throw null;
    }

    public void i1() {
        boolean bl2 = this.m;
        if (bl2) {
            bl2 = this.k ^ true;
            if (bl2) {
                bl2 = this.l ^ true;
                if (bl2) {
                    bl2 = false;
                    this.m = false;
                    c80 c802 = this.b;
                    if (c802 != null) {
                        ModifierNodeDetachedCancellationException modifierNodeDetachedCancellationException = new ModifierNodeDetachedCancellationException();
                        kotlinx.coroutines.d.b(c802, modifierNodeDetachedCancellationException);
                        this.b = null;
                    }
                    return;
                }
                bh1_1.c("Must run runDetachLifecycle() before markAsDetached()");
                throw null;
            }
            bh1_1.c("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        bh1_1.c("Cannot detach a node that is not attached");
        throw null;
    }

    public void j1() {
    }

    public void k1() {
    }

    public void l1() {
    }

    public void m1() {
        boolean bl2 = this.m;
        if (bl2) {
            this.l1();
            return;
        }
        bh1_1.c("reset() called on an unattached node");
        throw null;
    }

    public void n1() {
        boolean bl2 = this.m;
        if (bl2) {
            bl2 = this.k;
            if (bl2) {
                this.k = false;
                this.j1();
                this.l = true;
                return;
            }
            bh1_1.c("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        bh1_1.c("Must run markAsAttached() prior to runAttachLifecycle");
        throw null;
    }

    public void o1() {
        boolean bl2 = this.m;
        if (bl2) {
            w32_0 w32_02 = this.h;
            if (w32_02 != null) {
                bl2 = true;
            } else {
                bl2 = false;
                w32_02 = null;
            }
            if (bl2) {
                bl2 = this.l;
                if (bl2) {
                    this.l = false;
                    this.k1();
                    return;
                }
                bh1_1.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
                throw null;
            }
            bh1_1.c("detach invoked on a node without a coordinator");
            throw null;
        }
        bh1_1.c("node detached multiple times");
        throw null;
    }

    public void p1(LP1$c lP1$c) {
        this.a = lP1$c;
    }

    public void q1(w32_0 w32_02) {
        this.h = w32_02;
    }
}

