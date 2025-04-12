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

/*
 * Renamed from Sh1$a
 */
public final class sh1$a_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Sh1 c;

    public sh1$a_0(Sh1 sh1) {
        this.c = sh1;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c.a.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager)object;
    }
}

