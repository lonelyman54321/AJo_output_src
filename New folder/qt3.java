/*
 * Decompiled with CFR 0.152.
 */
public final class qt3 {
    public final ib3_0 a;
    public final qt3 b;
    public final Object c;

    public qt3(ib3_0 object, qt3 qt32) {
        this.a = object;
        this.b = qt32;
        this.c = object = object.getValue();
    }

    public final boolean a() {
        boolean bl2;
        Object object;
        Object object2 = this.a.getValue();
        if (!(object2 != (object = this.c) || (object2 = this.b) != null && (bl2 = ((qt3)object2).a()))) {
            bl2 = false;
            object2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

