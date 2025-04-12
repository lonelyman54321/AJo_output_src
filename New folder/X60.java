/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

public final class X60 {
    public final HashMap a;
    public final ArrayList b;

    public X60() {
        Cloneable cloneable;
        this.a = cloneable = new Cloneable();
        this.b = cloneable;
    }

    public final void a(Object object, String string2) {
        HashMap hashMap = this.a;
        object.getClass();
        hashMap.put(string2, object);
        this.b.remove(string2);
    }
}

