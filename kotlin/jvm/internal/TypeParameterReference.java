/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeParameterReference$Companion;

public final class TypeParameterReference
implements ln1_2 {
    public static final TypeParameterReference$Companion Companion;
    private volatile List bounds;
    private final Object container;
    private final boolean isReified;
    private final String name;
    private final nn1_1 variance;

    static {
        TypeParameterReference$Companion typeParameterReference$Companion;
        Companion = typeParameterReference$Companion = new TypeParameterReference$Companion(null);
    }

    public TypeParameterReference(Object object, String string2, nn1_1 nn1_12, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter((Object)nn1_12, "variance");
        this.container = object;
        this.name = string2;
        this.variance = nn1_12;
        this.isReified = bl2;
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl2 = object instanceof TypeParameterReference;
        if (!bl2) return false;
        Object object2 = this.container;
        object = (TypeParameterReference)object;
        Object object3 = ((TypeParameterReference)object).container;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) return false;
        object2 = this.getName();
        boolean bl3 = Intrinsics.areEqual(object2, object = ((TypeParameterReference)object).getName());
        if (!bl3) return false;
        return true;
    }

    public String getName() {
        return this.name;
    }

    public List getUpperBounds() {
        List list = this.bounds;
        if (list == null) {
            this.bounds = list = a.b(Reflection.nullableTypeOf(Object.class));
        }
        return list;
    }

    public nn1_1 getVariance() {
        return this.variance;
    }

    public int hashCode() {
        int n3;
        Object object = this.container;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        return this.getName().hashCode() + (n3 *= 31);
    }

    public boolean isReified() {
        return this.isReified;
    }

    public final void setUpperBounds(List object) {
        Intrinsics.checkNotNullParameter(object, "upperBounds");
        Object object2 = this.bounds;
        if (object2 == null) {
            this.bounds = object;
            return;
        }
        object2 = new StringBuilder("Upper bounds of type parameter '");
        ((StringBuilder)object2).append(this);
        ((StringBuilder)object2).append("' have already been initialized.");
        object2 = ((StringBuilder)object2).toString().toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public String toString() {
        return Companion.toString(this);
    }
}

