/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.view.fragment.refresh.CCReopenComplaintBottomSheetRefresh;

/*
 * Renamed from IG
 */
public final class ig_1
implements F62 {
    public final /* synthetic */ CCReopenComplaintBottomSheetRefresh a;

    public /* synthetic */ ig_1(CCReopenComplaintBottomSheetRefresh cCReopenComplaintBottomSheetRefresh) {
        this.a = cCReopenComplaintBottomSheetRefresh;
    }

    public final void onChanged(Object object) {
        CCReopenComplaintBottomSheetRefresh cCReopenComplaintBottomSheetRefresh = this.a;
        object = (DataCallback)object;
        CCReopenComplaintBottomSheetRefresh.Pa(cCReopenComplaintBottomSheetRefresh, (DataCallback)object);
    }
}

