/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
 */
import android.view.accessibility.AccessibilityManager;

public final class R1
implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final Q1 a;

    public R1(Q1 q1) {
        this.a = q1;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof R1;
        if (!bl2) {
            return false;
        }
        object = (R1)object;
        Q1 q1 = this.a;
        object = ((R1)object).a;
        return q1.equals(object);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean bl2) {
        this.a.onTouchExplorationStateChanged(bl2);
    }
}

