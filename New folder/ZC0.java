/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;

public final class ZC0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ZC0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                AppCompatActivity appCompatActivity = (AppCompatActivity)this.b;
                Intrinsics.checkNotNullParameter(appCompatActivity, "$act");
                appCompatActivity.onBackPressed();
                return;
            }
            case 1: {
                s12 s122 = (s12)this.b;
                Intrinsics.checkNotNullParameter(s122, "this$0");
                object = s122.c;
                if (object != null) {
                    object.z2();
                }
                object = s122.Ta();
                boolean bl2 = true;
                if (object != null && (object = ((F12)object).d) != null) {
                    ((bv2_0)object).O = bl2;
                }
                s122.m = bl2;
                object = s122.Ta();
                if (object != null) {
                    ((F12)object).i();
                }
                if ((object = s122.b) != null) {
                    object.startLoader();
                }
                s122.cb();
                s122.Ra();
                return;
            }
            case 0: 
        }
        gD0$a gD0$a = (gD0$a)this.b;
        Intrinsics.checkNotNullParameter(gD0$a, "$this_apply");
        object = gD0$a.d;
        if (object != null) {
            object.performClick();
        }
    }
}

