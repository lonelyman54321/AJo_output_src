/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NA1
 */
public final class na1_1
implements o60_0,
OnCompleteListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ na1_1(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onComplete(Task object) {
        Exception exception2;
        Object[] objectArray;
        Object object2;
        block4: {
            Object object3;
            block3: {
                object2 = (bz1_2)this.a;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Intrinsics.checkNotNullParameter(object, "task");
                objectArray = null;
                try {
                    object = ((Task)object).getResult();
                    object = (String)object;
                    if (object == null) return;
                    object3 = ((bz1_2)object2).x0;
                    if (object3 != null) break block3;
                    object3 = "versionLayout";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object3 = null;
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object3 = Snackbar.make((View)object3, (CharSequence)object, 0);
            String string2 = "Copy";
            qZ1 qZ12 = new qZ1((bz1_2)object2, (String)object);
            object = ((Snackbar)object3).setAction(string2, (View.OnClickListener)qZ12);
            ((Snackbar)object).show();
            return;
        }
        object2 = yn3_0.a;
        String string3 = exception2.getLocalizedMessage();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = "Exception is :";
        string3 = string4.concat(string3);
        objectArray = new Object[]{};
        ((yn3$a)object2).a(string3, objectArray);
    }
}

