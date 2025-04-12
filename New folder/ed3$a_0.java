/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ED3$a
 */
public final class ed3$a_0
extends Lambda
implements Function0 {
    public final /* synthetic */ View c;

    public ed3$a_0(View view) {
        this.c = view;
        super(0);
    }

    public final Object invoke() {
        this.c.invalidate();
        return Unit.a;
    }
}

