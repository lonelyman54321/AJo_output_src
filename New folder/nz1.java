/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.facebook.login.j;
import kotlin.jvm.internal.Intrinsics;

public final class nz1
implements dk$a_0 {
    public final /* synthetic */ j a;
    public final /* synthetic */ pi0_1 b;

    public /* synthetic */ nz1(j j3, pi0_1 pi0_12) {
        this.a = j3;
        this.b = pi0_12;
    }

    public final boolean a(int n3, Intent intent) {
        j j3 = this.a;
        Intrinsics.checkNotNullParameter(j3, "this$0");
        pi0_1 pi0_12 = this.b;
        j3.h(n3, intent, pi0_12);
        return true;
    }
}

