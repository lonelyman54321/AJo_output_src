/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class qZ1
implements View.OnClickListener {
    public final /* synthetic */ bz1_2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ qZ1(bz1_2 bz1_22, String string2) {
        this.a = bz1_22;
        this.b = string2;
    }

    public final void onClick(View object) {
        bz1_2 bz1_22 = this.a;
        Intrinsics.checkNotNullParameter(bz1_22, "this$0");
        object = bz1_22.getContext();
        if (object != null) {
            object = bz1_22.requireContext().getSystemService("clipboard");
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.content.ClipboardManager");
            object = (ClipboardManager)object;
            String string2 = this.b;
            bz1_22 = ClipData.newPlainText((CharSequence)"Token Copied", (CharSequence)string2);
            object.setPrimaryClip((ClipData)bz1_22);
        }
    }
}

