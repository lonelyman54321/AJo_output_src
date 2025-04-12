/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 */
import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCAttachBottomSheetRefresh;

/*
 * Renamed from QF
 */
public final class qf_2
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ qf_2(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        CCAttachBottomSheetRefresh.Oa(this.a, dialogInterface);
    }
}

