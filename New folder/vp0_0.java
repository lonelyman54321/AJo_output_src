/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from vp0
 */
public final class vp0_0
implements DialogInterface.OnClickListener {
    public final /* synthetic */ Ref$IntRef a;

    public /* synthetic */ vp0_0(Ref$IntRef ref$IntRef) {
        this.a = ref$IntRef;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        Ref$IntRef ref$IntRef = this.a;
        Intrinsics.checkNotNullParameter(ref$IntRef, "$selectedHaptikEnv");
        ref$IntRef.element = n3;
    }
}

