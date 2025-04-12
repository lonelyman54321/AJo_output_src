/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from e03
 */
public final class e03_0
implements e62_0,
yr0_2 {
    public final e62_0 a;
    public yr0_2 b;
    public boolean c;
    public fp_1 d;
    public volatile boolean e;

    public e03_0(e62_0 e62_02) {
        this.a = e62_02;
    }

    public final void a(yr0_2 object) {
        yr0_2 yr0_22 = this.b;
        boolean bl2 = gr0_2.validate(yr0_22, (yr0_2)object);
        if (bl2) {
            this.b = object;
            object = this.a;
            object.a(this);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Object object) {
        boolean bl2 = this.e;
        if (bl2) {
            return;
        }
        if (object == null) {
            this.b.dispose();
            object = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            this.onError((Throwable)object);
            return;
        }
        synchronized (this) {
            try {
                bl2 = this.e;
                if (bl2) {
                    return;
                }
                bl2 = this.c;
                if (!bl2) {
                    this.c = bl2 = true;
                    // MONITOREXIT @DISABLED, blocks:[0, 2, 5] lbl18 : MonitorExitStatement: MONITOREXIT : this
                    this.a.b(object);
                    this.c();
                    return;
                }
                fp_1 fp_12 = this.d;
                if (fp_12 == null) {
                    this.d = fp_12 = new fp_1();
                }
                object = r52_0.next(object);
                fp_12.a(object);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        block4: while (true) {
            e62_0 e62_02;
            Object[] objectArray;
            synchronized (this) {
                try {
                    objectArray = this.d;
                    if (objectArray == null) {
                        this.c = false;
                        return;
                    }
                    e62_02 = null;
                    this.d = null;
                    // MONITOREXIT @DISABLED, blocks:[0, 2, 4] lbl11 : MonitorExitStatement: MONITOREXIT : this
                    e62_02 = this.a;
                    objectArray = objectArray.a;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            while (true) {
                Object object;
                int n3;
                if (objectArray == null) continue block4;
                for (int i3 = 0; i3 < (n3 = 4) && (object = objectArray[i3]) != null; ++i3) {
                    n3 = (int)(r52_0.acceptFull(object, e62_02) ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                }
                objectArray = (Object[])objectArray[n3];
            }
            break;
        }
    }

    public final void dispose() {
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onComplete() {
        boolean bl2 = this.e;
        if (bl2) {
            return;
        }
        synchronized (this) {
            try {
                bl2 = this.e;
                if (bl2) {
                    return;
                }
                bl2 = this.c;
                if (!bl2) {
                    this.e = bl2 = true;
                    this.c = bl2;
                    // MONITOREXIT @DISABLED, blocks:[0, 2, 5] lbl14 : MonitorExitStatement: MONITOREXIT : this
                    this.a.onComplete();
                    return;
                }
                fp_1 fp_12 = this.d;
                if (fp_12 == null) {
                    this.d = fp_12 = new fp_1();
                }
                Object object = r52_0.complete();
                fp_12.a(object);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onError(Throwable object) {
        boolean bl3;
        block7: {
            block8: {
                boolean bl2 = this.e;
                if (bl2) {
                    dr2_2.b((Throwable)object);
                    return;
                }
                // MONITORENTER : this
                bl2 = this.e;
                bl3 = true;
                if (bl2) break block7;
                bl2 = this.c;
                if (!bl2) break block8;
                this.e = bl3;
                Object[] objectArray = this.d;
                if (objectArray == null) {
                    this.d = objectArray = new fp_1();
                }
                object = r52_0.error((Throwable)object);
                objectArray = objectArray.a;
                objectArray[0] = object;
                // MONITOREXIT : this
                return;
            }
            this.e = bl3;
            this.c = bl3;
            bl3 = false;
        }
        // MONITOREXIT : this
        if (bl3) {
            dr2_2.b((Throwable)object);
            return;
        }
        this.a.onError((Throwable)object);
    }
}

