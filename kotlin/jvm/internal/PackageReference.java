/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;

public final class PackageReference
implements ClassBasedDeclarationContainer {
    private final Class jClass;
    private final String moduleName;

    public PackageReference(Class clazz, String string2) {
        Intrinsics.checkNotNullParameter(clazz, "jClass");
        Intrinsics.checkNotNullParameter(string2, "moduleName");
        this.jClass = clazz;
        this.moduleName = string2;
    }

    public boolean equals(Object object) {
        Class clazz;
        boolean bl2;
        boolean bl3 = object instanceof PackageReference;
        if (bl3 && (bl2 = Intrinsics.areEqual(clazz = this.getJClass(), object = ((PackageReference)object).getJClass()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Class getJClass() {
        return this.jClass;
    }

    public Collection getMembers() {
        lo1_2 lo1_22 = new lo1_2();
        throw lo1_22;
    }

    public int hashCode() {
        return this.getJClass().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getJClass().toString();
        stringBuilder.append(string2);
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

