/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.g$a;

public final class g
implements wk2_0 {
    public final boolean a;
    public final boolean b;
    public final wk2_0 c;
    public final g$a d;
    public final qn1_0 e;
    public int f;
    public boolean g;

    public g(wk2_0 wk2_02, boolean bl2, boolean bl3, qn1_0 qn1_02, g$a g$a) {
        String string2 = "Argument must not be null";
        dV0.c(wk2_02, string2);
        this.c = wk2_02;
        this.a = bl2;
        this.b = bl3;
        this.e = qn1_02;
        dV0.c(g$a, string2);
        this.d = g$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block4: {
                    block5: {
                        block6: {
                            try {
                                int n3 = this.f;
                                if (n3 > 0) break block4;
                                n3 = (int)(this.g ? 1 : 0);
                                if (n3 != 0) break block5;
                                n3 = 1;
                                this.g = n3;
                                n3 = (int)(this.b ? 1 : 0);
                                if (n3 == 0) break block6;
                                wk2_0 wk2_02 = this.c;
                                wk2_02.a();
                            }
                            catch (Throwable throwable2) {}
                        }
                        return;
                    }
                    String string2 = "Cannot recycle a resource that has already been recycled";
                    IllegalStateException illegalStateException = new IllegalStateException(string2);
                    throw illegalStateException;
                    break block7;
                }
                String string3 = "Cannot recycle a resource while it is still acquired";
                IllegalStateException illegalStateException = new IllegalStateException(string3);
                throw illegalStateException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    int n3 = this.g;
                    if (n3 == 0) {
                        this.f = n3 = this.f + 1;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "Cannot acquire a recycled resource";
                IllegalStateException illegalStateException = new IllegalStateException(string2);
                throw illegalStateException;
            }
            throw throwable2;
        }
    }

    public final Class c() {
        return this.c.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            try {
                int n3 = this.f;
                if (n3 > 0) {
                    int n4 = 1;
                    this.f = n3 -= n4;
                    if (n3 != 0) return;
                    // MONITOREXIT @DISABLED, blocks:[0, 3, 5] lbl8 : MonitorExitStatement: MONITOREXIT : this
                    if (n4 == 0) return;
                    g$a g$a = this.d;
                    qn1_0 qn1_02 = this.e;
                    g$a.a(qn1_02, this);
                    return;
                }
                String string2 = "Cannot release a recycled or not yet acquired resource";
                IllegalStateException illegalStateException = new IllegalStateException(string2);
                throw illegalStateException;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Object get() {
        return this.c.get();
    }

    public final int getSize() {
        return this.c.getSize();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Object object = "EngineResource{isMemoryCacheable=";
        synchronized (this) {
            StringBuilder stringBuilder = new StringBuilder((String)object);
            char c2 = this.a;
            stringBuilder.append(c2 != 0);
            object = ", listener=";
            stringBuilder.append((String)object);
            object = this.d;
            stringBuilder.append(object);
            object = ", key=";
            stringBuilder.append((String)object);
            object = this.e;
            stringBuilder.append(object);
            object = ", acquired=";
            stringBuilder.append((String)object);
            c2 = this.f;
            stringBuilder.append((int)c2);
            object = ", isRecycled=";
            stringBuilder.append((String)object);
            c2 = (char)(this.g ? 1 : 0);
            stringBuilder.append(c2 != 0);
            object = ", resource=";
            stringBuilder.append((String)object);
            object = this.c;
            stringBuilder.append(object);
            c2 = '}';
            stringBuilder.append(c2);
            return stringBuilder.toString();
        }
    }
}

