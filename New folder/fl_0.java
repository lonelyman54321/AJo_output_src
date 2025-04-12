/*
 * Decompiled with CFR 0.152.
 */
import androidx.transition.Transition;

/*
 * Renamed from fL
 */
public final class fl_0 {
    public boolean a;
    public fL$a b;
    public boolean c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        // MONITORENTER : this
        boolean bl2 = this.a;
        if (bl2) {
            // MONITOREXIT : this
            return;
        }
        this.a = bl2 = true;
        this.c = bl2;
        Object object = this.b;
        // MONITOREXIT : this
        if (object != null) {
            try {
                object = (HW0)object;
                Object object2 = ((HW0)object).a;
                if (object2 == null) {
                    object2 = ((HW0)object).b;
                    ((Transition)object2).cancel();
                    object = ((HW0)object).c;
                    object.run();
                } else {
                    object2.run();
                }
            }
            catch (Throwable throwable) {
                // MONITORENTER : this
                this.c = false;
                this.notifyAll();
                // MONITOREXIT : this
                throw throwable;
            }
        }
        // MONITORENTER : this
        this.c = false;
        this.notifyAll();
        // MONITOREXIT : this
    }
}

