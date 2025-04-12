/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ListView
 */
import android.app.Dialog;
import android.view.View;
import android.widget.ListView;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from U03
 */
public final class u03_0
implements View.OnClickListener {
    public final /* synthetic */ ListView a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ v03_0 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Dialog e;

    public /* synthetic */ u03_0(ListView listView, String[] stringArray, v03_0 v03_02, Ref$ObjectRef ref$ObjectRef, Dialog dialog) {
        this.a = listView;
        this.b = stringArray;
        this.c = v03_02;
        this.d = ref$ObjectRef;
        this.e = dialog;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$urlList");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.d;
        Intrinsics.checkNotNullParameter(object3, "$url");
        Dialog dialog = this.e;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        int n3 = this.a.getCheckedItemPosition();
        object = object[n3];
        object3 = ((Ref$ObjectRef)object3).element;
        Intrinsics.checkNotNull(object3);
        object3 = (String)object3;
        Intrinsics.checkNotNull(object);
        object2.getClass();
        Intrinsics.checkNotNullParameter(object3, "oldUrl");
        Intrinsics.checkNotNullParameter(object, "newUrl");
        np_1 np_12 = ((v03_0)object2).a;
        boolean bl3 = np_12.P1((String)object);
        if (!bl3 && !(bl2 = ((String)object3).equals(object))) {
            object3 = w61_0.b;
            if (object3 != null) {
                ((UserInformation)object3).removeCmsPreviewInfo();
            }
            bl2 = false;
            object3 = null;
            og1_1.g(false, false);
        }
        object2 = ((v03_0)object2).b;
        if (object != null) {
            object3 = "base_url";
            ((sw_0)object2).putPreference((String)object3, (String)object);
        } else {
            object2.getClass();
        }
        dialog.dismiss();
        np_12.c0();
    }
}

