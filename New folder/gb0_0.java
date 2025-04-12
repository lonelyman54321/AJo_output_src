/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gB0
 */
public final class gb0_0
implements TJ2,
LJ2 {
    public final Object a;
    public final TJ2 b;
    public volatile LJ2 c;
    public volatile LJ2 d;
    public TJ2$a e;
    public TJ2$a f;

    public gb0_0(Object object, TJ2 tJ2) {
        TJ2$a tJ2$a;
        this.e = tJ2$a = TJ2$a.CLEARED;
        this.f = tJ2$a;
        this.a = object;
        this.b = tJ2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Object object = this.a;
        synchronized (object) {
            try {
                LJ2 lJ2 = this.c;
                boolean bl2 = lJ2.a();
                if (bl2) return true;
                lJ2 = this.d;
                bl2 = lJ2.a();
                if (!bl2) return false;
                return true;
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
    public final boolean b(LJ2 lJ2) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                boolean bl2;
                try {
                    boolean bl3;
                    Object object2 = this.b;
                    bl2 = true;
                    if (object2 != null) {
                        bl3 = object2.b(this);
                        if (!bl3) return false;
                    }
                    bl3 = true;
                    if (!bl3) return false;
                    object2 = this.c;
                    boolean bl4 = lJ2.equals(object2);
                    if (!bl4) return false;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                TJ2$a tJ2$a;
                TJ2$a tJ2$a2;
                try {
                    tJ2$a2 = this.e;
                    tJ2$a = TJ2$a.CLEARED;
                    if (tJ2$a2 != tJ2$a) return false;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    tJ2$a2 = this.f;
                    if (tJ2$a2 != tJ2$a) return false;
                    return true;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void clear() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object2;
                    try {
                        object2 = TJ2$a.CLEARED;
                        this.e = object2;
                        Object object3 = this.c;
                        object3.clear();
                        object3 = this.f;
                        if (object3 == object2) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.f = object2;
                    object2 = this.d;
                    object2.clear();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                TJ2$a tJ2$a;
                TJ2$a tJ2$a2;
                try {
                    tJ2$a2 = this.e;
                    tJ2$a = TJ2$a.SUCCESS;
                    if (tJ2$a2 == tJ2$a) return true;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    tJ2$a2 = this.f;
                    if (tJ2$a2 != tJ2$a) return false;
                }
                return true;
            }
            throw throwable2;
        }
    }

    public final boolean e(LJ2 lJ2) {
        boolean bl2 = lJ2 instanceof gb0_0;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            lJ2 = (gb0_0)lJ2;
            LJ2 lJ22 = this.c;
            LJ2 lJ23 = ((gb0_0)lJ2).c;
            bl2 = lJ22.e(lJ23);
            if (bl2 && (bl4 = (lJ22 = this.d).e(lJ2 = ((gb0_0)lJ2).d))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(LJ2 object) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                block5: {
                    block6: {
                        Object object3;
                        try {
                            object3 = this.d;
                            boolean bl2 = object.equals(object3);
                            if (bl2) break block5;
                            object = TJ2$a.FAILED;
                            this.e = object;
                            object = this.f;
                            object3 = TJ2$a.RUNNING;
                            if (object == object3) break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        this.f = object3;
                        object = this.d;
                        object.j();
                    }
                    return;
                }
                object = TJ2$a.FAILED;
                this.f = object;
                object = this.b;
                if (object != null) {
                    object.f(this);
                }
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
    public final void g(LJ2 object) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                block6: {
                    LJ2 lJ2;
                    block5: {
                        try {
                            lJ2 = this.c;
                            boolean bl2 = object.equals(lJ2);
                            if (!bl2) break block5;
                            object = TJ2$a.SUCCESS;
                            this.e = object;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    lJ2 = this.d;
                    boolean bl3 = object.equals(lJ2);
                    if (bl3) {
                        object = TJ2$a.SUCCESS;
                        this.f = object;
                    }
                }
                object = this.b;
                if (object != null) {
                    object.g(this);
                }
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
    public final TJ2 getRoot() {
        Object object = this.a;
        synchronized (object) {
            try {
                TJ2 tJ2 = this.b;
                if (tJ2 == null) return this;
                return tJ2.getRoot();
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
    public final boolean h(LJ2 object) {
        Object object2 = this.a;
        synchronized (object2) {
            boolean bl2;
            boolean bl3;
            Object object3 = this.b;
            boolean bl4 = true;
            if (object3 != null) {
                bl3 = object3.h(this);
                if (!bl3) return false;
            }
            bl3 = true;
            if (!bl3) return false;
            object3 = this.e;
            TJ2$a tJ2$a = TJ2$a.FAILED;
            if (object3 != tJ2$a) {
                object3 = this.c;
                bl2 = object.equals(object3);
            } else {
                object3 = this.d;
                bl2 = object.equals(object3);
                if (!bl2) return false;
                object = this.f;
                object3 = TJ2$a.SUCCESS;
                if (object != object3) {
                    if (object != tJ2$a) return false;
                }
                bl2 = true;
            }
            if (!bl2) return false;
            return bl4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean i(LJ2 object) {
        object = this.a;
        synchronized (object) {
            TJ2 tJ2 = this.b;
            if (tJ2 == null) return true;
            boolean bl2 = tJ2.i(this);
            if (!bl2) return false;
            return true;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isRunning() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                TJ2$a tJ2$a;
                TJ2$a tJ2$a2;
                try {
                    tJ2$a2 = this.e;
                    tJ2$a = TJ2$a.RUNNING;
                    if (tJ2$a2 == tJ2$a) return true;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    tJ2$a2 = this.f;
                    if (tJ2$a2 != tJ2$a) return false;
                }
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    TJ2$a tJ2$a;
                    Object object2;
                    try {
                        object2 = this.e;
                        tJ2$a = TJ2$a.RUNNING;
                        if (object2 == tJ2$a) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.e = tJ2$a;
                    object2 = this.c;
                    object2.j();
                }
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
    public final void pause() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                block6: {
                    try {
                        Object object2 = this.e;
                        TJ2$a tJ2$a = TJ2$a.RUNNING;
                        if (object2 == tJ2$a) {
                            object2 = TJ2$a.PAUSED;
                            this.e = object2;
                            object2 = this.c;
                            object2.pause();
                        }
                        if ((object2 = this.f) != tJ2$a) break block6;
                        object2 = TJ2$a.PAUSED;
                        this.f = object2;
                        object2 = this.d;
                        object2.pause();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

