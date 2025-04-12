/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.UserProfileData;

/*
 * Renamed from t73
 */
public final class t73_0
implements F62 {
    public final void onChanged(Object object) {
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)(object = (DataCallback)object));
        if (n3 != 0 && (n3 = ((DataCallback)object).getStatus()) == 0) {
            object2 = AnalyticsManager.getInstance().getCt();
            object = (UserProfileData)((DataCallback)object).getData();
            ((CleverTapEvents)object2).userLogin((UserProfileData)object);
        }
    }
}

