/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewParent
 */
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class eD3
extends FunctionReferenceImpl
implements Function1 {
    public static final eD3 a;

    static {
        eD3 eD32;
        a = eD32 = new FunctionReferenceImpl(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final Object invoke(Object object) {
        return ((ViewParent)object).getParent();
    }
}

