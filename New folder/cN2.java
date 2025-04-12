/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

public final class cN2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cN2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (b33_0)object;
                Intrinsics.checkNotNullParameter(object, string2);
                ((b33_0)object).z(false);
                return;
            }
            case 0: 
        }
        object = (dn2_2)object;
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((dn2_2)object).g;
        if (object != null) {
            ((ComponentActivity)object).onBackPressed();
        }
    }
}

