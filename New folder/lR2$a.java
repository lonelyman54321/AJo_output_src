/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.services.data.sis.SisStoreList;
import com.ril.ajio.services.data.sis.StoreMetaData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class lR2$a {
    public static String a(boolean bl2) {
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        boolean bl3 = urlHelper$Companion.getISPREVIEW();
        if (bl3) {
            return CMSConfigInitializer.getPreviewUrlForStores(bl2);
        }
        bl3 = false;
        Object[] objectArray = null;
        String string2 = "homepage";
        if (bl2) {
            UrlHelper urlHelper = urlHelper$Companion.getInstance();
            objectArray = new Object[]{};
            return urlHelper.getApiUrl(string2, "sis_store_cms_meta_data_v3", objectArray);
        }
        UrlHelper urlHelper = urlHelper$Companion.getInstance();
        objectArray = new Object[]{};
        return urlHelper.getApiUrl(string2, "sis_store_cms_meta_data_v2", objectArray);
    }

    public static void b(StoreMetaData storeMetaData) {
        if (storeMetaData != null) {
            ArrayList<SisStoreList> arrayList = new ArrayList<SisStoreList>();
            SisStoreList sisStoreList = storeMetaData.getData();
            if (sisStoreList != null) {
                sisStoreList = new SisStoreList();
                Object object = storeMetaData.getData();
                Intrinsics.checkNotNull(object);
                object = ((SisStoreList)object).getStores();
                sisStoreList.setStoreMetalistdto((ArrayList)object);
                object = storeMetaData.getData();
                Intrinsics.checkNotNull(object);
                object = ((SisStoreList)object).getHeaderTitle();
                sisStoreList.setHeaderTitle((String)object);
                arrayList.add(sisStoreList);
            }
            storeMetaData.setSisStoreList(arrayList);
        }
    }
}

