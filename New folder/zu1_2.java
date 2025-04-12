/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Renamed from Zu1
 */
public final class zu1_2
implements yr0_2,
ar0_2 {
    public LinkedList a;
    public volatile boolean b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(yr0_2 yr0_22) {
        Object object = "Disposable item is null";
        x03_0.b(yr0_22, (String)object);
        boolean bl2 = this.b;
        if (bl2) {
            return false;
        }
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl3;
                try {
                    bl2 = this.b;
                    if (bl2) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object = this.a;
                return object != null && (bl3 = ((LinkedList)object).remove(yr0_22));
                {
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
    public final boolean b(yr0_2 yr0_22) {
        block7: {
            boolean bl2 = this.b;
            if (!bl2) {
                synchronized (this) {
                    Throwable throwable2;
                    block6: {
                        block4: {
                            LinkedList<yr0_2> linkedList;
                            block5: {
                                try {
                                    bl2 = this.b;
                                    if (bl2) break block4;
                                    linkedList = this.a;
                                    if (linkedList != null) break block5;
                                    this.a = linkedList = new LinkedList<yr0_2>();
                                }
                                catch (Throwable throwable2) {
                                    break block6;
                                }
                            }
                            linkedList.add(yr0_22);
                            return true;
                        }
                        break block7;
                    }
                    throw throwable2;
                }
            }
        }
        yr0_22.dispose();
        return false;
    }

    public final boolean c(yr0_2 yr0_22) {
        boolean bl2 = this.a(yr0_22);
        if (bl2) {
            ((ScheduledRunnable)yr0_22).dispose();
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void dispose() {
        boolean bl2;
        ArrayList<Throwable> arrayList;
        Object object;
        int n3 = this.b;
        if (n3 != 0) {
            return;
        }
        synchronized (this) {
            try {
                n3 = this.b;
                if (n3 != 0) {
                    return;
                }
                this.b = n3 = 1;
                object = this.a;
                arrayList = null;
                this.a = null;
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl14 : MonitorExitStatement: MONITOREXIT : this
                if (object == null) {
                    return;
                }
                object = object.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
        while (bl2 = object.hasNext()) {
            yr0_2 yr0_22 = (yr0_2)object.next();
            try {
                yr0_22.dispose();
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                if (arrayList == null) {
                    arrayList = new ArrayList<Throwable>();
                }
                arrayList.add(throwable);
            }
        }
        if (arrayList == null) return;
        int n4 = arrayList.size();
        if (n4 == n3) {
            throw uc0_2.a((Throwable)arrayList.get(0));
        }
        CompositeException compositeException = new CompositeException(arrayList);
        throw compositeException;
    }

    public final boolean isDisposed() {
        return this.b;
    }
}

