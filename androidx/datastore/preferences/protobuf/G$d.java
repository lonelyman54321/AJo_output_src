/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.G;
import java.util.Map;

public final class G$d
implements Map.Entry,
Comparable {
    public final Comparable a;
    public Object b;
    public final /* synthetic */ G c;

    public G$d() {
        throw null;
    }

    public G$d(G g3, Comparable comparable, Object object) {
        this.c = g3;
        this.a = comparable;
        this.b = object;
    }

    public final int compareTo(Object object) {
        object = ((G$d)object).a;
        return this.a.compareTo(object);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block14: {
            block13: {
                boolean bl3;
                bl2 = true;
                if (object == this) {
                    return bl2;
                }
                boolean bl4 = object instanceof Map.Entry;
                if (!bl4) {
                    return false;
                }
                object = (Map.Entry)object;
                Object object2 = object.getKey();
                Comparable comparable = this.a;
                if (comparable == null) {
                    if (object2 == null) {
                        bl4 = true;
                    } else {
                        bl4 = false;
                        object2 = null;
                    }
                } else {
                    bl4 = comparable.equals(object2);
                }
                if (!bl4) break block13;
                object2 = this.b;
                object = object.getValue();
                if (object2 == null) {
                    if (object == null) {
                        bl3 = true;
                    } else {
                        bl3 = false;
                        object = null;
                    }
                } else {
                    bl3 = object2.equals(object);
                }
                if (bl3) break block14;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        Comparable comparable = this.a;
        if (comparable == null) {
            n3 = 0;
            comparable = null;
        } else {
            n3 = comparable.hashCode();
        }
        Object object = this.b;
        if (object != null) {
            n4 = object.hashCode();
        }
        return n4 ^ n3;
    }

    public final Object setValue(Object object) {
        this.c.c();
        Object object2 = this.b;
        this.b = object;
        return object2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append("=");
        object = this.b;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

