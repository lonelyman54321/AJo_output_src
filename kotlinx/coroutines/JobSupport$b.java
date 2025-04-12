/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

public final class JobSupport$b
implements bg1_2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final d42_0 a;

    static {
        Class<JobSupport$b> clazz = JobSupport$b.class;
        b = AtomicIntegerFieldUpdater.newUpdater(clazz, "_isCompleting$volatile");
        Class<Object> clazz2 = Object.class;
        c = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_rootCause$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_exceptionsHolder$volatile");
    }

    public JobSupport$b(d42_0 d42_02, Throwable throwable) {
        this.a = d42_02;
        this._isCompleting$volatile = 0;
        this._rootCause$volatile = throwable;
    }

    public final void a(Throwable throwable) {
        Object object;
        Object object2;
        block9: {
            block7: {
                block8: {
                    block6: {
                        object2 = this.c();
                        if (object2 == null) {
                            c.set(this, throwable);
                            return;
                        }
                        if (throwable == object2) {
                            return;
                        }
                        object2 = d;
                        object = ((AtomicReferenceFieldUpdater)object2).get(this);
                        if (object != null) break block6;
                        ((AtomicReferenceFieldUpdater)object2).set(this, throwable);
                        break block7;
                    }
                    boolean bl2 = object instanceof Throwable;
                    if (!bl2) break block8;
                    if (throwable == object) {
                        return;
                    }
                    int n3 = 4;
                    ArrayList<Object> arrayList = new ArrayList<Object>(n3);
                    arrayList.add(object);
                    arrayList.add(throwable);
                    ((AtomicReferenceFieldUpdater)object2).set(this, arrayList);
                    break block7;
                }
                boolean bl3 = object instanceof ArrayList;
                if (!bl3) break block9;
                object = (ArrayList)object;
                ((ArrayList)object).add((Throwable)throwable);
            }
            return;
        }
        object2 = new StringBuilder("State is ");
        ((StringBuilder)object2).append(object);
        object2 = ((StringBuilder)object2).toString().toString();
        throwable = new IllegalStateException((String)object2);
        throw throwable;
    }

    public final d42_0 b() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable)c.get(this);
    }

    public final boolean d() {
        boolean bl2;
        Throwable throwable = this.c();
        if (throwable != null) {
            bl2 = true;
        } else {
            bl2 = false;
            throwable = null;
        }
        return bl2;
    }

    public final ArrayList e(Throwable object) {
        Object object2;
        Object object3;
        block8: {
            ArrayList arrayList;
            boolean bl2;
            int n3;
            block6: {
                block7: {
                    block5: {
                        object3 = d;
                        object2 = ((AtomicReferenceFieldUpdater)object3).get(this);
                        n3 = 4;
                        if (object2 != null) break block5;
                        object2 = new ArrayList(n3);
                        break block6;
                    }
                    bl2 = object2 instanceof Throwable;
                    if (!bl2) break block7;
                    arrayList = new ArrayList(n3);
                    arrayList.add(object2);
                    object2 = arrayList;
                    break block6;
                }
                n3 = object2 instanceof ArrayList;
                if (n3 == 0) break block8;
                object2 = (ArrayList)object2;
            }
            Throwable throwable = this.c();
            if (throwable != null) {
                bl2 = false;
                arrayList = null;
                ((ArrayList)object2).add(0, (Throwable)throwable);
            }
            if (object != null && (n3 = (int)(Intrinsics.areEqual(object, throwable) ? 1 : 0)) == 0) {
                ((ArrayList)object2).add((Object)object);
            }
            object = y61.e;
            ((AtomicReferenceFieldUpdater)object3).set(this, object);
            return object2;
        }
        object3 = new StringBuilder("State is ");
        ((StringBuilder)object3).append(object2);
        object3 = ((StringBuilder)object3).toString().toString();
        object = new IllegalStateException((String)object3);
        throw object;
    }

    public final boolean isActive() {
        boolean bl2;
        Throwable throwable = this.c();
        if (throwable == null) {
            bl2 = true;
        } else {
            bl2 = false;
            throwable = null;
        }
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Finishing[cancelling=");
        boolean bl2 = this.d();
        stringBuilder.append(bl2);
        stringBuilder.append(", completing=");
        Object object = b;
        boolean bl3 = ((AtomicIntegerFieldUpdater)object).get(this);
        boolean bl4 = true;
        if (bl3 != bl4) {
            bl4 = false;
        }
        stringBuilder.append(bl4);
        stringBuilder.append(", rootCause=");
        object = this.c();
        stringBuilder.append(object);
        stringBuilder.append(", exceptions=");
        object = d.get(this);
        stringBuilder.append(object);
        stringBuilder.append(", list=");
        object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

