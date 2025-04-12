/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.remoteconfig.devsettings.Data;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.util.ArrayList;

/*
 * Renamed from s40
 */
public final class s40_0 {
    public static /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.getParcelable("data", Data.class);
    }

    public static /* bridge */ /* synthetic */ ArrayList b(Bundle bundle) {
        return bundle.getParcelableArrayList("user_reviews", UserReviewModel.class);
    }
}

