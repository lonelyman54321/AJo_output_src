/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.GTMEvents;

public final class cP {
    public static String a(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    public static void b(String string2, String string3, GTMEvents gTMEvents, String string4, String string5) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        string2 = stringBuilder.toString();
        gTMEvents.pushButtonTapEvent(string4, string2, string5);
    }
}

