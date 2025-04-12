/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class r52$c
implements Serializable {
    private static final long serialVersionUID = -1322257508628817540L;
    public final ef3_2 a;

    public r52$c(ef3_2 ef3_22) {
        this.a = ef3_22;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotificationLite.Subscription[");
        ef3_2 ef3_22 = this.a;
        stringBuilder.append(ef3_22);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

