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

public final class Cl3
extends Lambda
implements Function0 {
    public final /* synthetic */ Bl3 c;

    public Cl3(Bl3 bl3) {
        this.c = bl3;
        super(0);
    }

    public final Object invoke() {
        View view = this.c.a;
        BaseInputConnection baseInputConnection = new BaseInputConnection(view, false);
        return baseInputConnection;
    }
}

