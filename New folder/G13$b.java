/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;

public final class G13$b {
    public static Up0 a(Class object) {
        Class clazz = ShareLinkContent.class;
        boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
        if (bl2) {
            object = h13_0.SHARE_DIALOG;
        } else {
            clazz = SharePhotoContent.class;
            bl2 = clazz.isAssignableFrom((Class<?>)object);
            if (bl2) {
                object = h13_0.PHOTOS;
            } else {
                clazz = ShareVideoContent.class;
                bl2 = clazz.isAssignableFrom((Class<?>)object);
                if (bl2) {
                    object = h13_0.VIDEO;
                } else {
                    clazz = ShareMediaContent.class;
                    bl2 = clazz.isAssignableFrom((Class<?>)object);
                    if (bl2) {
                        object = h13_0.MULTIMEDIA;
                    } else {
                        clazz = ShareCameraEffectContent.class;
                        bl2 = clazz.isAssignableFrom((Class<?>)object);
                        if (bl2) {
                            object = hk_1.SHARE_CAMERA_EFFECT;
                        } else {
                            clazz = ShareStoryContent.class;
                            boolean bl3 = clazz.isAssignableFrom((Class<?>)object);
                            if (bl3) {
                                object = x13_0.SHARE_STORY_ASSET;
                            } else {
                                bl3 = false;
                                object = null;
                            }
                        }
                    }
                }
            }
        }
        return object;
    }
}

