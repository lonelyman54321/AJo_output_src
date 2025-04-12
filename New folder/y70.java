/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class y70 {
    public static final void a(Context object, Tp0 object2, Function0 object3) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "dialogData");
        Object object4 = new MaterialAlertDialogBuilder((Context)object);
        object = ((Tp0)object2).a;
        object = ((MaterialAlertDialogBuilder)object4).setTitle((CharSequence)object);
        object4 = ((Tp0)object2).b;
        object = ((MaterialAlertDialogBuilder)object).setMessage((CharSequence)object4);
        object4 = new w70((Function0)object3);
        object3 = ((Tp0)object2).c;
        object = ((MaterialAlertDialogBuilder)object).setPositiveButton((CharSequence)object3, (DialogInterface.OnClickListener)object4);
        object3 = new x70_0();
        object2 = ((Tp0)object2).d;
        ((MaterialAlertDialogBuilder)object).setNegativeButton((CharSequence)object2, (DialogInterface.OnClickListener)object3).show();
    }
}

