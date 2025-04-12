/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.ril.ajio.devsettings.DevSettingsActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from wp0
 */
public final class wp0_0
implements DialogInterface.OnClickListener {
    public final /* synthetic */ DevSettingsActivity a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Ref$IntRef c;

    public /* synthetic */ wp0_0(DevSettingsActivity devSettingsActivity, String[] stringArray, Ref$IntRef ref$IntRef) {
        this.a = devSettingsActivity;
        this.b = stringArray;
        this.c = ref$IntRef;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        Object object = DevSettingsActivity.Companion;
        DevSettingsActivity devSettingsActivity = this.a;
        Intrinsics.checkNotNullParameter(devSettingsActivity, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$urlList");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$selectedHaptikEnv");
        v31.a();
        object = devSettingsActivity.Z;
        int n4 = ((Ref$IntRef)object3).element;
        object2 = object2[n4];
        if (object2 != null) {
            object3 = "haptik_env";
            ((sw_0)object).putPreference((String)object3, (String)object2);
        } else {
            object.getClass();
        }
        dialogInterface.dismiss();
        devSettingsActivity.c0();
    }
}

