/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Kc
implements DialogInterface.OnClickListener {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ Kc(P7 p7) {
        this.a = p7;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onDecline");
        function0.invoke();
    }
}

