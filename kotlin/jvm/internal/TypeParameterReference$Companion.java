/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeParameterReference$Companion$WhenMappings;

public final class TypeParameterReference$Companion {
    private TypeParameterReference$Companion() {
    }

    public /* synthetic */ TypeParameterReference$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String toString(ln1_2 object) {
        Intrinsics.checkNotNullParameter(object, "typeParameter");
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = object.getVariance();
        int[] nArray = TypeParameterReference$Companion$WhenMappings.$EnumSwitchMapping$0;
        int n3 = object2.ordinal();
        n3 = nArray[n3];
        int n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 == n4) {
                object2 = "out ";
                stringBuilder.append((String)object2);
            }
        } else {
            object2 = "in ";
            stringBuilder.append((String)object2);
        }
        object = object.getName();
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }
}

