/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$BubbleMetadata
 *  android.content.LocusId
 */
import android.app.Notification;
import android.content.LocusId;

public final class C42 {
    public static boolean a(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static Notification.BubbleMetadata b(Notification notification) {
        return notification.getBubbleMetadata();
    }

    public static LocusId c(Notification notification) {
        return notification.getLocusId();
    }
}

