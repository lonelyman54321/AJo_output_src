/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideoContent;
import kotlin.jvm.internal.Intrinsics;

public final class F13$a
extends F13$c {
    public final void a(ShareLinkContent object) {
        String string2 = "linkContent";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ShareLinkContent)object).g;
        boolean bl2 = lz3_0.A((String)object);
        if (bl2) {
            return;
        }
        object = new FacebookException("Cannot share link content with quote using the share api");
        throw object;
    }

    public final void c(ShareMediaContent object) {
        Intrinsics.checkNotNullParameter(object, "mediaContent");
        object = new FacebookException("Cannot share ShareMediaContent using the share api");
        throw object;
    }

    public final void d(SharePhoto object) {
        Intrinsics.checkNotNullParameter(object, "photo");
        F13$d f13$d = f13_0.a;
        if (object != null) {
            boolean bl2;
            f13$d = ((SharePhoto)object).c;
            object = ((SharePhoto)object).b;
            if (object == null && f13$d == null) {
                object = new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
                throw object;
            }
            if (object == null && (bl2 = lz3_0.B((Uri)f13$d))) {
                object = new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
                throw object;
            }
            return;
        }
        object = new FacebookException("Cannot share a null SharePhoto");
        throw object;
    }

    public final void g(ShareVideoContent object) {
        Intrinsics.checkNotNullParameter(object, "videoContent");
        Object object2 = ((ShareContent)object).c;
        boolean bl2 = lz3_0.A((String)object2);
        if (bl2) {
            object2 = ((ShareContent)object).b;
            if (object2 != null && !(bl2 = object2.isEmpty())) {
                object = new FacebookException("Cannot share video content with people IDs using the share api");
                throw object;
            }
            object = ((ShareContent)object).e;
            boolean bl3 = lz3_0.A((String)object);
            if (bl3) {
                return;
            }
            object = new FacebookException("Cannot share video content with referrer URL using the share api");
            throw object;
        }
        object = new FacebookException("Cannot share video content with place IDs using the share api");
        throw object;
    }
}

