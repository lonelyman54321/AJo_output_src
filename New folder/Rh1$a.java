/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Rh1$a
extends Lambda
implements Function0 {
    public final /* synthetic */ rh1_0 c;

    public Rh1$a(rh1_0 rh1_02) {
        this.c = rh1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c.a.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager)object;
    }
}

