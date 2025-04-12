/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$BubbleMetadata
 *  android.app.Notification$Builder
 *  android.content.LocusId
 */
import android.app.Notification;
import android.content.LocusId;

public final class V42$e {
    public static void a(Notification.Builder builder, boolean bl2) {
        builder.setAllowSystemGeneratedContextualActions(bl2);
    }

    public static void b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void c(Notification.Action.Builder builder, boolean bl2) {
        builder.setContextual(bl2);
    }

    public static void d(Notification.Builder builder, Object object) {
        object = (LocusId)object;
        builder.setLocusId((LocusId)object);
    }
}

