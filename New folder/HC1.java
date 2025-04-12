/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class HC1 {
    public final Object a;
    public final Throwable b;

    public HC1(QB1 qB1) {
        this.a = qB1;
        this.b = null;
    }

    public HC1(Throwable throwable) {
        this.b = throwable;
        this.a = null;
    }

    public final boolean equals(Object object) {
        Object object2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HC1;
        if (!bl3) {
            return false;
        }
        object = (HC1)object;
        Object object3 = this.a;
        if (object3 != null && (bl3 = object3.equals(object2 = ((HC1)object).a))) {
            return bl2;
        }
        Object object4 = this.b;
        if (object4 != null && (object = ((HC1)object).b) != null) {
            object = ((Throwable)object4).toString();
            object4 = ((Throwable)object4).toString();
            return ((String)object).equals(object4);
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.a;
        Throwable throwable = this.b;
        Object[] objectArray = new Object[]{object, throwable};
        return Arrays.hashCode(objectArray);
    }
}

