/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

public final class Yn1 {
    public final KeyEvent a;

    public /* synthetic */ Yn1(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public final boolean equals(Object object) {
        KeyEvent keyEvent;
        boolean bl2;
        boolean bl3 = object instanceof Yn1;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(keyEvent = this.a, object = ((Yn1)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("KeyEvent(nativeKeyEvent=");
        KeyEvent keyEvent = this.a;
        stringBuilder.append(keyEvent);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

