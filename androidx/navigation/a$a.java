/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.i;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
extends i {
    public a$a() {
        throw null;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || !(bl3 = object instanceof a$a)) break block4;
                    bl3 = super.equals(object);
                    if (!bl3) break block5;
                    a$a cfr_ignored_0 = (a$a)object;
                    object = (a$a)object;
                    object = null;
                    boolean bl4 = Intrinsics.areEqual(null, null);
                    if (bl4) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode() * 961;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        String string2 = super.toString();
        charSequence.append(string2);
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

