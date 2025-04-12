/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.tooling.ComposeAnimation
 */
import androidx.compose.animation.tooling.ComposeAnimation;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Py2
 */
public final class py2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ul$h c;
    public final /* synthetic */ Sy2 d;

    public py2_0(ul$h ul$h, Sy2 sy2) {
        this.c = ul$h;
        this.d = sy2;
        super(1);
    }

    public final void invoke(Object object) {
        object = Xg1$a.a(this.c);
        if (object != null) {
            Sy2 sy2 = this.d;
            LinkedHashMap linkedHashMap = sy2.f();
            Py2$a py2$a = new Py2$a(sy2);
            wg1_0 wg1_02 = new wg1_0((Xg1)object, py2$a);
            linkedHashMap.put(object, wg1_02);
            object = (ComposeAnimation)object;
        }
    }
}

