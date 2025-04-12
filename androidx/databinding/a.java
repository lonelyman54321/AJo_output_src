/*
 * Decompiled with CFR 0.152.
 */
package androidx.databinding;

import androidx.databinding.b;
import androidx.databinding.c;
import androidx.databinding.c$a;
import androidx.databinding.f;
import androidx.databinding.f$a;

public class a
implements c {
    private transient f mCallbacks;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void addOnPropertyChangedCallback(c$a c$a) {
        synchronized (this) {
            try {
                f f5 = this.mCallbacks;
                if (f5 == null) {
                    f$a f$a = f.f;
                    this.mCallbacks = f5 = new b(f$a);
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl7 : MonitorExitStatement: MONITOREXIT : this
                this.mCallbacks.b(c$a);
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
    public void notifyChange() {
        synchronized (this) {
            try {
                f f5 = this.mCallbacks;
                if (f5 == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl7 : MonitorExitStatement: MONITOREXIT : this
                f5.e(0, this);
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
    public void notifyPropertyChanged(int n3) {
        synchronized (this) {
            try {
                f f5 = this.mCallbacks;
                if (f5 == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl7 : MonitorExitStatement: MONITOREXIT : this
                f5.e(n3, this);
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
    public void removeOnPropertyChangedCallback(c$a c$a) {
        synchronized (this) {
            try {
                f f5 = this.mCallbacks;
                if (f5 == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl7 : MonitorExitStatement: MONITOREXIT : this
                f5.i(c$a);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

