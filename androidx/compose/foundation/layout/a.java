/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineOffsetDpElement;
import kotlin.jvm.functions.Function1;

public final class a {
    public static final LP1 a() {
        LP1 lP1;
        Object object;
        float f5 = g83.a;
        float f6 = g83.g;
        float f7 = 0.0f / 0.0f;
        boolean bl2 = xs0_0.a(f5, f7);
        LP1 lP12 = LP1$a.b;
        if (!bl2) {
            object = Pc.a;
            ji1$a ji1$a = ji1.a;
            lP1 = new AlignmentLineOffsetDpElement((Oc)object, f5, f7, ji1$a);
        } else {
            lP1 = lP12;
        }
        boolean bl3 = xs0_0.a(f6, f7);
        if (!bl3) {
            m91 m912 = Pc.b;
            object = ji1.a;
            lP12 = new AlignmentLineOffsetDpElement(m912, f7, f6, (Function1)object);
        }
        return lP1.then(lP12);
    }
}

