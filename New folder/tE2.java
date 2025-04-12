/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.ratings.ImageMap;
import com.ril.ajio.services.data.ratings.ImageModel;
import com.ril.ajio.services.data.ratings.ReviewModel;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.util.ArrayList;
import java.util.Iterator;

public final class tE2 {
    public static ReviewModel a(UserReviewModel iterator) {
        if (iterator != null) {
            String string2 = ((UserReviewModel)((Object)iterator)).getReviewText();
            Long l2 = ((UserReviewModel)((Object)iterator)).getReviewId();
            cp_1.Companion.getClass();
            cp$a.e().getClass();
            ArrayList<ImageModel> arrayList = new ArrayList<ImageModel>();
            iterator = ((UserReviewModel)((Object)iterator)).getImageMap();
            if (iterator != null && (iterator = ((ImageMap)((Object)iterator)).getThumbnail()) != null) {
                boolean bl2;
                iterator = ((Iterable)((Object)iterator)).iterator();
                while (bl2 = iterator.hasNext()) {
                    ImageModel imageModel = (ImageModel)iterator.next();
                    Long l3 = imageModel.getParentImageId();
                    String string3 = imageModel.getImageUrl();
                    int n3 = 22;
                    ImageModel imageModel2 = new ImageModel(l3, null, null, string3, null, n3, null);
                    arrayList.add(imageModel2);
                }
            }
            iterator = new Iterator(arrayList, string2, l2);
        } else {
            iterator = null;
        }
        return iterator;
    }
}

