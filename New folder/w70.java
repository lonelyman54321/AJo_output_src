/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

public final class w70
implements DialogInterface.OnClickListener {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ w70(Function0 function0) {
        this.a = function0;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = this.a;
        if (object != null) {
            object.invoke();
        }
    }
}

