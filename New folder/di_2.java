/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 */
import android.app.Dialog;
import android.content.Context;
import com.clevertap.android.sdk.inapp.f;

/*
 * Renamed from dI
 */
public final class di_2
extends Dialog {
    public final /* synthetic */ f a;

    public di_2(f f5, Context context) {
        this.a = f5;
        super(context, 16973834);
    }

    public final void onBackPressed() {
        f f5 = this.a;
        boolean bl2 = f5.j;
        if (bl2) {
            f5.db();
        }
        super.onBackPressed();
    }
}

