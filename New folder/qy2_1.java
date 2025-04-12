/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.tooling.ComposeAnimation
 */
import androidx.compose.animation.tooling.ComposeAnimation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Qy2
 */
public final class qy2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ Sy2 d;

    public qy2_1(gr3 gr32, Sy2 sy2) {
        this.c = gr32;
        this.d = sy2;
        super(1);
    }

    public final void invoke(Object object) {
        object = ur3.b(this.c);
        Object object2 = this.d;
        if (object != null) {
            object2 = ((Sy2)object2).g();
            sr3 sr32 = new sr3((rr3)object);
            object2.put(object, sr32);
            object = (ComposeAnimation)object;
            return;
        }
        Sy2.a((Sy2)object2);
    }
}

