/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j;

public final class JobCancellationException
extends CancellationException
implements d80_0 {
    public final transient i a;

    public JobCancellationException(String string2, Throwable throwable, i i3) {
        super(string2);
        this.a = i3;
        if (throwable != null) {
            this.initCause(throwable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        Object object2;
        if (object == this) return true;
        boolean bl2 = object instanceof JobCancellationException;
        if (!bl2) return false;
        Object object3 = ((Throwable)(object = (JobCancellationException)object)).getMessage();
        bl2 = Intrinsics.areEqual(object3, object2 = this.getMessage());
        if (!bl2) return false;
        object3 = ((JobCancellationException)object).a;
        if (object3 == null) {
            object3 = j.a;
        }
        if ((object2 = this.a) == null) {
            object2 = j.a;
        }
        if (!(bl2 = Intrinsics.areEqual(object3, object2))) return false;
        boolean bl3 = Intrinsics.areEqual(object = ((Throwable)object).getCause(), object3 = this.getCause());
        if (!bl3) return false;
        return true;
    }

    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{};
        this.setStackTrace(stackTraceElementArray);
        return this;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.getMessage();
        Intrinsics.checkNotNull(string2);
        int n4 = string2.hashCode() * 31;
        Object object = this.a;
        if (object == null) {
            object = j.a;
        }
        int n7 = 0;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.getCause();
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = super.toString();
        stringBuilder.append((String)object);
        stringBuilder.append("; job=");
        object = this.a;
        if (object == null) {
            object = j.a;
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

