/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.tooling.ComposeAnimation
 */
import androidx.compose.animation.tooling.ComposeAnimation;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Oy2
 */
public final class oy2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Sy2 e;

    public oy2_1(gr3 gr32, Function0 function0, Sy2 sy2) {
        this.c = gr32;
        this.d = function0;
        this.e = sy2;
        super(1);
    }

    public final void invoke(Object object) {
        object = this.c;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Boolean>");
        object = xk_0.a((gr3)object);
        this.d.invoke();
        LinkedHashMap linkedHashMap = this.e.e();
        Vk vk = new Vk((Wk)object);
        vk.b();
        linkedHashMap.put(object, vk);
        object = (ComposeAnimation)object;
    }
}

