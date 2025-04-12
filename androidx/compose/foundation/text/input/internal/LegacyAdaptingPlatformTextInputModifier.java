/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.Intrinsics;

final class LegacyAdaptingPlatformTextInputModifier
extends up1_0 {
    public final qt1_0 b;
    public final Vt1 c;
    public final Sk3 d;

    public LegacyAdaptingPlatformTextInputModifier(qt1_0 qt1_02, Vt1 vt1, Sk3 sk3) {
        this.b = qt1_02;
        this.c = vt1;
        this.d = sk3;
    }

    public final LP1$c b() {
        Sk3 sk3 = this.d;
        qt1_0 qt1_02 = this.b;
        Vt1 vt1 = this.c;
        lt1_0 lt1_02 = new lt1_0(qt1_02, vt1, sk3);
        return lt1_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LegacyAdaptingPlatformTextInputModifier;
        if (!bl3) {
            return false;
        }
        object = (LegacyAdaptingPlatformTextInputModifier)object;
        Object object2 = this.b;
        Object object3 = ((LegacyAdaptingPlatformTextInputModifier)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((LegacyAdaptingPlatformTextInputModifier)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object = ((LegacyAdaptingPlatformTextInputModifier)object).d;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        int n4 = (this.c.hashCode() + n3) * 31;
        return this.d.hashCode() + n4;
    }

    public final void j(LP1$c object) {
        Object object2;
        object = (lt1_0)object;
        boolean bl2 = ((LP1$c)object).m;
        if (bl2) {
            ((Uh)((lt1_0)object).n).b();
            object2 = ((lt1_0)object).n;
            ((qt1_0)object2).j((Qt1$a)object);
        }
        object2 = this.b;
        ((lt1_0)object).n = object2;
        boolean bl3 = ((LP1$c)object).m;
        if (bl3) {
            Qt1$a qt1$a = ((qt1_0)object2).a;
            if (qt1$a == null) {
                ((qt1_0)object2).a = object;
            } else {
                object2 = "Expected textInputModifierNode to be null".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
        }
        ((lt1_0)object).o = object2 = this.c;
        ((lt1_0)object).p = object2 = this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LegacyAdaptingPlatformTextInputModifier(serviceAdapter=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", legacyTextFieldState=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", textFieldSelectionManager=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

