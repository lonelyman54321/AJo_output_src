/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from x70
 */
public final class x70_0
implements DialogInterface.OnClickListener {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ x70_0() {
        this.a = null;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = this.a;
        if (object != null) {
            object.invoke();
        }
    }
}

