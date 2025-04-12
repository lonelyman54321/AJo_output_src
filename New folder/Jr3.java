/*
 * Decompiled with CFR 0.152.
 */
public abstract class Jr3
implements Cloneable {
    public wr3 a;

    public Jr3() {
        Q32$a q32$a = Q32.b;
        this.a = q32$a;
    }

    public final Jr3 b() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            RuntimeException runtimeException = new RuntimeException(cloneNotSupportedException);
            throw runtimeException;
        }
        return (Jr3)object;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Jr3;
        if (bl2) {
            object = (Jr3)object;
            wr3 wr32 = this.a;
            object = ((Jr3)object).a;
            return dz3.b(wr32, object);
        }
        return false;
    }

    public int hashCode() {
        int n3;
        wr3 wr32 = this.a;
        if (wr32 != null) {
            n3 = wr32.hashCode();
        } else {
            n3 = 0;
            wr32 = null;
        }
        return n3;
    }
}

