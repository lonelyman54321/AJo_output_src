/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Order.orderhistory.DateRangeItem;
import java.util.ArrayList;

/*
 * Renamed from Ci0
 */
public final class ci0_1 {
    public static /* bridge */ /* synthetic */ ArrayList a(Bundle bundle) {
        return bundle.getParcelableArrayList("dateRange", DateRangeItem.class);
    }
}

