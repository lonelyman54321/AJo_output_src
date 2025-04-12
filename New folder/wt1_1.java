/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.BaseInputConnection
 */
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Wt1
 */
public final class wt1_1
extends Lambda
implements Function0 {
    public final /* synthetic */ xt1_0 c;

    public wt1_1(xt1_0 xt1_02) {
        this.c = xt1_02;
        super(0);
    }

    public final Object invoke() {
        View view = this.c.a;
        BaseInputConnection baseInputConnection = new BaseInputConnection(view, false);
        return baseInputConnection;
    }
}

