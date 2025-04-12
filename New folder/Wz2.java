/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.widget.CompoundButton;
import kotlin.jvm.internal.Intrinsics;

public final class Wz2
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Yz2 a;

    public /* synthetic */ Wz2(Yz2 yz2) {
        this.a = yz2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        Yz2 yz2 = this.a;
        Intrinsics.checkNotNullParameter(yz2, "this$0");
        yz2.Ra(bl2);
    }
}

