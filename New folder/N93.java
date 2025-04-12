/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class N93
extends VK0 {
    public final Fe1 a;
    public final String b;
    public final ri0 c;

    public N93(Fe1 fe1, String string2, ri0 ri02) {
        this.a = fe1;
        this.b = string2;
        this.c = ri02;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl3 = object instanceof N93;
                if (!bl3) break block4;
                object = (N93)object;
                Object object2 = this.a;
                Object object3 = ((N93)object).a;
                bl3 = Intrinsics.areEqual(object2, object3);
                if (bl3 && (bl3 = Intrinsics.areEqual(object3 = this.b, object2 = ((N93)object).b)) && (object3 = this.c) == (object = ((N93)object).c)) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Fe1 fe1 = this.a;
        int n4 = fe1.hashCode() * 31;
        String string2 = this.b;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n4 = (n4 + n3) * 31;
        return ((Object)((Object)this.c)).hashCode() + n4;
    }
}

