/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from tn3
 */
public final class tn3_0
implements TJ2,
LJ2 {
    public final TJ2 a;
    public final Object b;
    public volatile LJ2 c;
    public volatile LJ2 d;
    public TJ2$a e;
    public TJ2$a f;
    public boolean g;

    public tn3_0(Object object, TJ2 tJ2) {
        TJ2$a tJ2$a;
        this.e = tJ2$a = TJ2$a.CLEARED;
        this.f = tJ2$a;
        this.b = object;
        this.a = tJ2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Object object = this.b;
        synchronized (object) {
            try {
                LJ2 lJ2 = this.d;
                boolean bl2 = lJ2.a();
                if (bl2) return true;
                lJ2 = this.c;
                bl2 = lJ2.a();
                if (!bl2) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(LJ2 object) {
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                try {
                    boolean bl3;
                    Object object3 = this.a;
                    bl2 = true;
                    if (object3 != null) {
                        bl3 = object3.b(this);
                        if (!bl3) return false;
                    }
                    bl3 = true;
                    if (!bl3) return false;
                    object3 = this.c;
                    boolean bl4 = object.equals(object3);
                    if (!bl4) return false;
                    object = this.e;
                    object3 = TJ2$a.PAUSED;
                    if (object == object3) return false;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c() {
        Object object = this.b;
        synchronized (object) {
            TJ2$a tJ2$a = this.e;
            TJ2$a tJ2$a2 = TJ2$a.CLEARED;
            if (tJ2$a != tJ2$a2) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void clear() {
        Object object = this.b;
        synchronized (object) {
            Object object2 = null;
            this.g = false;
            object2 = TJ2$a.CLEARED;
            this.e = object2;
            this.f = object2;
            object2 = this.d;
            object2.clear();
            object2 = this.c;
            object2.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d() {
        Object object = this.b;
        synchronized (object) {
            TJ2$a tJ2$a = this.e;
            TJ2$a tJ2$a2 = TJ2$a.SUCCESS;
            if (tJ2$a != tJ2$a2) return false;
            return true;
        }
    }

    public final boolean e(LJ2 lJ2) {
        boolean bl2 = lJ2 instanceof tn3_0;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            LJ2 lJ22;
            lJ2 = (tn3_0)lJ2;
            LJ2 lJ23 = this.c;
            if ((lJ23 == null ? (lJ23 = ((tn3_0)lJ2).c) == null : (bl2 = (lJ23 = this.c).e(lJ22 = ((tn3_0)lJ2).c))) && ((lJ23 = this.d) == null ? (lJ2 = ((tn3_0)lJ2).d) == null : (bl4 = (lJ23 = this.d).e(lJ2 = ((tn3_0)lJ2).d)))) {
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
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                try {
                    LJ2 lJ2 = this.c;
                    boolean bl2 = object.equals(lJ2);
                    if (!bl2) {
                        object = TJ2$a.FAILED;
                        this.f = object;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = TJ2$a.FAILED;
                this.e = object;
                object = this.a;
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
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                try {
                    LJ2 lJ2 = this.d;
                    bl2 = object.equals(lJ2);
                    if (bl2) {
                        object = TJ2$a.SUCCESS;
                        this.f = object;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object = TJ2$a.SUCCESS;
                this.e = object;
                object = this.a;
                if (object != null) {
                    object.g(this);
                }
                if (!(bl2 = ((TJ2$a)((Object)(object = this.f))).isComplete())) {
                    object = this.d;
                    object.clear();
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
        Object object = this.b;
        synchronized (object) {
            try {
                TJ2 tJ2 = this.a;
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
    public final boolean h(LJ2 lJ2) {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                boolean bl2;
                try {
                    boolean bl3;
                    Object object2 = this.a;
                    bl2 = true;
                    if (object2 != null) {
                        bl3 = object2.h(this);
                        if (!bl3) return false;
                    }
                    bl3 = true;
                    if (!bl3) return false;
                    object2 = this.c;
                    boolean bl4 = lJ2.equals(object2);
                    if (!bl4) return false;
                    bl4 = this.a();
                    if (bl4) return false;
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
    public final boolean i(LJ2 object) {
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                try {
                    boolean bl3;
                    Object object3 = this.a;
                    bl2 = true;
                    if (object3 != null) {
                        bl3 = object3.i(this);
                        if (!bl3) return false;
                    }
                    bl3 = true;
                    if (!bl3) return false;
                    object3 = this.c;
                    boolean bl4 = object.equals(object3);
                    if (bl4) return bl2;
                    object = this.e;
                    object3 = TJ2$a.SUCCESS;
                    if (object == object3) return false;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isRunning() {
        Object object = this.b;
        synchronized (object) {
            TJ2$a tJ2$a = this.e;
            TJ2$a tJ2$a2 = TJ2$a.RUNNING;
            if (tJ2$a != tJ2$a2) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable3;
            block12: {
                Throwable throwable22;
                block11: {
                    block10: {
                        TJ2$a tJ2$a;
                        Object object2;
                        boolean bl2 = true;
                        this.g = bl2;
                        bl2 = false;
                        Object var3_3 = null;
                        try {
                            boolean bl3;
                            object2 = this.e;
                            tJ2$a = TJ2$a.SUCCESS;
                            if (object2 != tJ2$a && (object2 = this.f) != (tJ2$a = TJ2$a.RUNNING)) {
                                this.f = tJ2$a;
                                object2 = this.d;
                                object2.j();
                            }
                            if (!(bl3 = this.g) || (object2 = this.e) == (tJ2$a = TJ2$a.RUNNING)) break block10;
                        }
                        catch (Throwable throwable22) {
                            break block11;
                        }
                        this.e = tJ2$a;
                        object2 = this.c;
                        object2.j();
                    }
                    try {
                        this.g = false;
                        return;
                    }
                    catch (Throwable throwable3) {}
                    break block12;
                }
                this.g = false;
                throw throwable22;
            }
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pause() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                Object object2;
                block4: {
                    try {
                        object2 = this.f;
                        bl2 = ((TJ2$a)((Object)object2)).isComplete();
                        if (bl2) break block4;
                        object2 = TJ2$a.PAUSED;
                        this.f = object2;
                        object2 = this.d;
                        object2.pause();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (!(bl2 = ((TJ2$a)((Object)(object2 = this.e))).isComplete())) {
                    object2 = TJ2$a.PAUSED;
                    this.e = object2;
                    object2 = this.c;
                    object2.pause();
                }
                return;
            }
            throw throwable2;
        }
    }
}

