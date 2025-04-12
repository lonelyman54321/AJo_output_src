/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class rk2$a
extends rk2_0 {
    public final Rv1 a;
    public final int b;
    public final int c;
    public final int d;

    public rk2$a(Rv1 object, int n3, int n4, int n7) {
        String string2 = "loadType";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        this.b = n3;
        this.c = n4;
        this.d = n7;
        Object object2 = Rv1.REFRESH;
        if (object != object2) {
            int n8 = this.a();
            if (n8 > 0) {
                if (n7 >= 0) {
                    return;
                }
                object = hj0_0.a(n7, "Invalid placeholdersRemaining ");
                object = object.toString();
                super((String)object);
                throw object2;
            }
            super("Drop count must be > 0, but was ");
            n3 = this.a();
            ((StringBuilder)object).append(n3);
            object = ((StringBuilder)object).toString();
            object = object.toString();
            super((String)object);
            throw object2;
        }
        object2 = "Drop load type must be PREPEND or APPEND".toString();
        super((String)object2);
        throw object;
    }

    public final int a() {
        int n3 = this.c;
        int n4 = this.b;
        return n3 - n4 + 1;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof rk2$a;
        if (n3 == 0) {
            return false;
        }
        object = (rk2$a)object;
        Rv1 rv1 = this.a;
        Rv1 rv12 = ((rk2$a)object).a;
        if (rv1 != rv12) {
            return false;
        }
        n3 = this.b;
        int n4 = ((rk2$a)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        n4 = ((rk2$a)object).c;
        if (n3 != n4) {
            return false;
        }
        n3 = this.d;
        int n7 = ((rk2$a)object).d;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.a)).hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = this.d;
        return n3 + n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        Object object = rk2$a$a.$EnumSwitchMapping$0;
        Rv1 rv1 = this.a;
        int n3 = rv1.ordinal();
        int n4 = object[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                object = new IllegalArgumentException;
                ((IllegalArgumentException)object)("Drop load type must be PREPEND or APPEND");
                throw object;
            }
            object = "front";
        } else {
            object = "end";
        }
        object = Gn.a("PageEvent.Drop from the ", (String)object, " (\n                    |   minPageOffset: ");
        n3 = this.b;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("\n                    |   maxPageOffset: ");
        n3 = this.c;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("\n                    |   placeholdersRemaining: ");
        n3 = this.d;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("\n                    |)");
        return ee3_2.c(((StringBuilder)object).toString());
    }
}

