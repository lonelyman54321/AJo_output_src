/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.content.Context
 *  android.os.LocaleList
 *  android.text.style.LocaleSpan
 */
import android.app.Notification;
import android.content.Context;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.Optional;

/*
 * Renamed from KX
 */
public final class kx_1 {
    public static /* bridge */ /* synthetic */ Notification.Builder a(Context context, Notification notification) {
        return Notification.Builder.recoverBuilder((Context)context, (Notification)notification);
    }

    public static /* synthetic */ LocaleSpan b(LocaleList localeList) {
        LocaleSpan localeSpan = new LocaleSpan(localeList);
        return localeSpan;
    }

    public static /* bridge */ /* synthetic */ Object c(Optional optional) {
        return optional.orElse(null);
    }
}

