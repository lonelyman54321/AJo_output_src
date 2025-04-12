/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.firebase.installations.FirebaseInstallations;
import kotlin.jvm.internal.Intrinsics;

public final class gB
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gB(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                k41_0 k41_02 = (k41_0)this.b;
                Intrinsics.checkNotNullParameter(k41_02, "this$0");
                k41_02.w();
                return;
            }
            case 1: {
                FirebaseInstallations.d((FirebaseInstallations)this.b);
                return;
            }
            case 0: 
        }
        fB fB2 = (fB)this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(fB2, string2);
        fB2 = fB2.d;
        if (fB2 != null) {
            ai0_2.a((View)fB2);
        }
    }
}

