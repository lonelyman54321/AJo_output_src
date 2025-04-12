/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnKeyListener
 *  android.view.KeyEvent
 */
import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OL2
 */
public final class ol2_1
implements DialogInterface.OnKeyListener {
    public final /* synthetic */ pl2_1 a;

    public /* synthetic */ ol2_1(pl2_1 pl2_12) {
        this.a = pl2_12;
    }

    public final boolean onKey(DialogInterface object, int n3, KeyEvent keyEvent) {
        pl2_1 pl2_12 = this.a;
        Intrinsics.checkNotNullParameter(pl2_12, "this$0");
        object = "event";
        Intrinsics.checkNotNullParameter(keyEvent, (String)object);
        int n4 = 4;
        if (n3 == n4 && (n4 = keyEvent.getAction()) == (n3 = 1)) {
            pl2_12.Qa();
        } else {
            n3 = 0;
        }
        return n3 != 0;
    }
}

