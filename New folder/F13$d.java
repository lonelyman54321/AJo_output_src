/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookException;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideoContent;
import kotlin.jvm.internal.Intrinsics;

public final class F13$d
extends F13$c {
    public final void c(ShareMediaContent object) {
        Intrinsics.checkNotNullParameter(object, "mediaContent");
        object = new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        throw object;
    }

    public final void d(SharePhoto object) {
        Intrinsics.checkNotNullParameter(object, "photo");
        F13$d f13$d = f13_0.a;
        if (object != null) {
            f13$d = ((SharePhoto)object).b;
            if (f13$d == null && (object = ((SharePhoto)object).c) == null) {
                object = new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
                throw object;
            }
            return;
        }
        object = new FacebookException("Cannot share a null SharePhoto");
        throw object;
    }

    public final void g(ShareVideoContent object) {
        Intrinsics.checkNotNullParameter(object, "videoContent");
        object = new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        throw object;
    }
}

