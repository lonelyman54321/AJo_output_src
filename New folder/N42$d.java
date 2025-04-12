/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$CallStyle
 *  android.app.PendingIntent
 *  android.app.Person
 *  android.graphics.drawable.Icon
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

public final class N42$d {
    public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall((Person)person, (PendingIntent)pendingIntent, (PendingIntent)pendingIntent2);
    }

    public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall((Person)person, (PendingIntent)pendingIntent);
    }

    public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall((Person)person, (PendingIntent)pendingIntent, (PendingIntent)pendingIntent2);
    }

    public static Notification.CallStyle d(Notification.CallStyle callStyle, int n3) {
        return callStyle.setAnswerButtonColorHint(n3);
    }

    public static Notification.CallStyle e(Notification.CallStyle callStyle, int n3) {
        return callStyle.setDeclineButtonColorHint(n3);
    }

    public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean bl2) {
        return callStyle.setIsVideo(bl2);
    }

    public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }
}

