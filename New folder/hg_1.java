/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 */
import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCReopenComplaintBottomSheetRefresh;

/*
 * Renamed from HG
 */
public final class hg_1
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ hg_1(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        CCReopenComplaintBottomSheetRefresh.Oa(this.a, dialogInterface);
    }
}

