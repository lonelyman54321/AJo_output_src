/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.pointer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class PointerHoverIconModifierElement
extends up1_0 {
    public final Uv2 b;
    public final boolean c;

    public PointerHoverIconModifierElement(wi wi2, boolean bl2) {
        this.b = wi2;
        this.c = bl2;
    }

    public final LP1$c b() {
        boolean bl2 = this.c;
        wi wi2 = (wi)this.b;
        rv2_1 rv2_12 = new rv2_1(wi2, bl2);
        return rv2_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PointerHoverIconModifierElement;
        if (!bl3) {
            return false;
        }
        object = (PointerHoverIconModifierElement)object;
        Uv2 uv2 = this.b;
        Uv2 uv22 = ((PointerHoverIconModifierElement)object).b;
        bl3 = Intrinsics.areEqual(uv2, uv22);
        if (!bl3) {
            return false;
        }
        bl3 = this.c;
        boolean bl4 = ((PointerHoverIconModifierElement)object).c;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        Uv2 uv2 = this.b;
        int n3 = uv2.hashCode() * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void j(LP1$c object) {
        boolean bl2;
        object = (rv2_1)object;
        Object object2 = ((rv2_1)object).o;
        Object object3 = this.b;
        boolean bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            ((rv2_1)object).o = object3;
            bl3 = ((rv2_1)object).q;
            if (bl3) {
                ((rv2_1)object).s1();
            }
        }
        if ((bl3 = ((rv2_1)object).p) != (bl2 = this.c)) {
            ((rv2_1)object).p = bl2;
            if (bl2) {
                bl3 = ((rv2_1)object).q;
                if (bl3) {
                    ((rv2_1)object).r1();
                }
            } else {
                bl3 = ((rv2_1)object).q;
                if (bl3 && bl3) {
                    if (!bl2) {
                        object2 = new Ref$ObjectRef();
                        object3 = new sv2_1((Ref$ObjectRef)object2);
                        Zr3.d((yr3_0)object, (Function1)object3);
                        object2 = (rv2_1)((Ref$ObjectRef)object2).element;
                        if (object2 != null) {
                            object = object2;
                        }
                    }
                    ((rv2_1)object).r1();
                }
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PointerHoverIconModifierElement(icon=");
        Uv2 uv2 = this.b;
        stringBuilder.append(uv2);
        stringBuilder.append(", overrideDescendants=");
        boolean bl2 = this.c;
        return AR.a(stringBuilder, bl2, ')');
    }
}

