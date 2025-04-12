/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b$b
extends Lambda
implements Function1 {
    public final /* synthetic */ FocusTargetNode c;
    public final /* synthetic */ b d;
    public final /* synthetic */ Function1 e;

    public b$b(FocusTargetNode focusTargetNode, b b2, Function1 function1) {
        this.c = focusTargetNode;
        this.d = b2;
        this.e = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        block4: {
            boolean bl2;
            block3: {
                boolean bl3;
                block2: {
                    object2 = this.c;
                    bl3 = Intrinsics.areEqual(object = (FocusTargetNode)object, object2);
                    if (!bl3) break block2;
                    bl2 = false;
                    object = null;
                    break block3;
                }
                object2 = this.d.f;
                bl3 = Intrinsics.areEqual(object, object2);
                if (bl3) break block4;
                object2 = this.e;
                object = (Boolean)object2.invoke(object);
                bl2 = (Boolean)object;
            }
            return bl2;
        }
        object2 = "Focus search landed at the root.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

