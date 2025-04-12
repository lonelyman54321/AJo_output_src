/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.LogSessionId
 */
import android.media.metrics.LogSessionId;
import java.util.Objects;

public final class nu2 {
    public final String a;
    public final nu2$a b;
    public final Object c;

    static {
        int n3 = gz3.a;
        int n4 = 31;
        String string2 = "";
        if (n3 < n4) {
            nu2 nu22 = new nu2(string2);
        } else {
            nu2$a nu2$a = nu2$a.b;
            nu2 nu23 = new nu2(nu2$a, string2);
        }
    }

    public nu2(LogSessionId logSessionId, String string2) {
        nu2$a nu2$a = new nu2$a(logSessionId);
        this(nu2$a, string2);
    }

    /*
     * WARNING - void declaration
     */
    public nu2(String object) {
        void var2_5;
        int bl2 = gz3.a;
        int n3 = 31;
        if (bl2 < n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        ct3.f((boolean)var2_5);
        this.a = object;
        this.b = null;
        this.c = object = new Object();
    }

    public nu2(nu2$a object, String string2) {
        this.b = object;
        this.a = string2;
        this.c = object = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof nu2;
        if (!bl4) {
            return false;
        }
        object = (nu2)object;
        Object object2 = this.a;
        Object object3 = ((nu2)object).a;
        bl4 = Objects.equals(object2, object3);
        if (!(bl4 && (bl4 = Objects.equals(object3 = this.b, object2 = ((nu2)object).b)) && (bl2 = Objects.equals(object3 = this.c, object = ((nu2)object).c)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        nu2$a nu2$a = this.b;
        Object object = this.c;
        String string2 = this.a;
        Object[] objectArray = new Object[]{string2, nu2$a, object};
        return Objects.hash(objectArray);
    }
}

