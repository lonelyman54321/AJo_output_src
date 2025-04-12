/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class r52$b
implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;
    public final Throwable a;

    public r52$b(Throwable throwable) {
        this.a = throwable;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Throwable throwable;
        boolean bl3 = object instanceof r52$b;
        boolean bl4 = false;
        if (bl3 && ((throwable = this.a) == (object = ((r52$b)object).a) || throwable != null && (bl2 = throwable.equals(object)))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotificationLite.Error[");
        Throwable throwable = this.a;
        stringBuilder.append(throwable);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

