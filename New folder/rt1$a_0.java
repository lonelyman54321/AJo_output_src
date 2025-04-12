/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from Rt1$a
 */
public final class rt1$a_0
extends FunctionReferenceImpl
implements Function1 {
    public static final rt1$a_0 a;

    static {
        rt1$a_0 rt1$a_0;
        a = rt1$a_0 = new FunctionReferenceImpl(1, Sh1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Sh1 sh1 = new Sh1((View)object);
        return sh1;
    }
}

