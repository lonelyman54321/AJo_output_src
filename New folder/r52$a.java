/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class r52$a
implements Serializable {
    private static final long serialVersionUID = -7482590109178395495L;
    public final yr0_2 a;

    public r52$a(yr0_2 yr0_22) {
        this.a = yr0_22;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotificationLite.Disposable[");
        yr0_2 yr0_22 = this.a;
        stringBuilder.append(yr0_22);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

